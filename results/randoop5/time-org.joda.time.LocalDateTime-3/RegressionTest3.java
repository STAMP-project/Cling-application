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
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withSecondOfMinute((int) (short) 0);
        int[] intArray13 = localDateTime10.getValues();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) intArray13, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: [I");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 20, 25810001]");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(861);
        int int5 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withMillisOfDay((int) (short) 100);
        int int8 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusMillis(10534946);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 545 + "'", int5 == 545);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10671545 + "'", int8 == 10671545);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withMillisOfDay(10481313);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusWeeks(556);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.year();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime30 = property28.roundCeilingCopy();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        int int33 = localDateTime32.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.minusMonths(645);
        boolean boolean37 = localDateTime30.isAfter((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = property40.getDifference(readableInstant41);
        long long43 = property40.remainder();
        java.lang.String str44 = property40.getAsShortText();
        org.joda.time.DurationField durationField45 = property40.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime47 = property40.addToCopy((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.minusYears(19);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minus(readablePeriod53);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(1L);
        int int57 = localDateTime56.getSecondOfMinute();
        org.joda.time.DateTime dateTime58 = localDateTime56.toDateTime();
        org.joda.time.DateTime dateTime59 = localDateTime54.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime60 = localDateTime47.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime61 = localDateTime30.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        int int62 = property24.compareTo((org.joda.time.ReadableInstant) dateTime61);
        int int63 = property16.compareTo((org.joda.time.ReadableInstant) dateTime61);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10671573 + "'", int33 == 10671573);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property40);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "573" + "'", str44, "573");
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime61);
// flaky:         org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property3.addToCopy(10642758);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(10412477);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusDays(997);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        long long8 = property7.remainder();
        org.joda.time.Interval interval9 = property7.toInterval();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = property12.getDifference(readableInstant13);
        long long15 = property12.remainder();
        org.joda.time.LocalDateTime localDateTime16 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusMonths(100);
        int int19 = localDateTime18.size();
        java.lang.String str20 = localDateTime18.toString();
        boolean boolean21 = property7.equals((java.lang.Object) localDateTime18);
        org.joda.time.Interval interval22 = property7.toInterval();
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2029-03-25T02:57:51.707" + "'", str20, "2029-03-25T02:57:51.707");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval22);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2001-11-25T02:54:49.754");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDurationAdded(readableDuration2, (int) (short) 0);
        int int5 = localDateTime4.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 599);
        org.joda.time.LocalTime localTime2 = localDateTime1.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDateTime1.getValue(10581603);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10581603");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.secondOfMinute();
        java.lang.String str21 = property20.getAsString();
        org.joda.time.DurationField durationField22 = property20.getDurationField();
        org.joda.time.LocalDateTime localDateTime23 = property20.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime30 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        java.util.Date date35 = localDateTime34.toDate();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(1);
        int int41 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime32.withFields((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusSeconds((int) (byte) 100);
        int int51 = localDateTime48.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property52 = localDateTime48.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property52.getFieldType();
        boolean boolean54 = localDateTime37.isSupported(dateTimeFieldType53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime25.property(dateTimeFieldType53);
        org.joda.time.LocalDateTime localDateTime57 = property55.addToCopy(963);
        boolean boolean58 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime57);
        int int59 = localDateTime1.getDayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "51" + "'", str21, "51");
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Wed Nov 25 02:57:51 UTC 2020");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 330 + "'", int59 == 330);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDurationAdded(readableDuration10, 53);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.minusMonths(19);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.minusMinutes((int) (short) -1);
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
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(1L);
        int int38 = localDateTime37.getSecondOfMinute();
        org.joda.time.DateTime dateTime39 = localDateTime37.toDateTime();
        long long40 = property35.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        long long41 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime42 = localDateTime24.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        long long43 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 11651L + "'", long40 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1606273071905L + "'", long41 == 1606273071905L);
        org.junit.Assert.assertNotNull(dateTime42);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1819162671905L + "'", long43 == 1819162671905L);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(1L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        boolean boolean18 = property2.isLeap();
        int int19 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273072165L + "'", long16 == 1606273072165L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999 + "'", int19 == 999);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = localDateTime12.getFields();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusSeconds(10412477);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromDateFields(date18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = property22.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        java.util.Date date29 = localDateTime28.toDate();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYearOfCentury(1);
        int int35 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime26.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusSeconds((int) (byte) 100);
        int int45 = localDateTime42.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property46 = localDateTime42.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        boolean boolean48 = localDateTime31.isSupported(dateTimeFieldType47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime19.withField(dateTimeFieldType47, 773);
        int int51 = localDateTime15.indexOf(dateTimeFieldType47);
        org.joda.time.DateTimeField[] dateTimeFieldArray52 = localDateTime15.getFields();
        int int53 = property10.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime55 = property10.setCopy("802");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 802 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "201" + "'", str6, "201");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:57:52 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Wed Nov 25 02:57:52 UTC 2020");
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.minusMinutes(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime1.hourOfDay();
        int int19 = property18.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfDay(10412477);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withField(dateTimeFieldType10, (int) (byte) 0);
        int int13 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.minusMonths(10449321);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(1L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDateTime localDateTime27 = property21.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusDays(10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMonthOfYear(4);
        int int32 = localDateTime31.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = property35.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        java.util.Date date42 = localDateTime41.toDate();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withYearOfCentury(1);
        int int48 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime39.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime55 = property54.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusSeconds((int) (byte) 100);
        int int58 = localDateTime55.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property59 = localDateTime55.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property59.getFieldType();
        boolean boolean61 = localDateTime44.isSupported(dateTimeFieldType60);
        int int62 = localDateTime31.get(dateTimeFieldType60);
        org.joda.time.LocalDateTime.Property property63 = localDateTime15.property(dateTimeFieldType60);
        java.lang.String str64 = property63.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2020 + "'", int13 == 2020);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 16 + "'", int32 == 16);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Wed Nov 25 02:57:52 UTC 2020");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2001 + "'", int62 == 2001);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Property[weekyear]" + "'", str64, "Property[weekyear]");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusYears(54);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        int int12 = property11.get();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.secondOfMinute();
        java.lang.String str16 = property15.getAsString();
        org.joda.time.DurationField durationField17 = property15.getDurationField();
        org.joda.time.LocalDateTime localDateTime18 = property15.roundFloorCopy();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        int int20 = property11.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 329 + "'", int12 == 329);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "52" + "'", str16, "52");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusYears(10433965);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localDateTime3.getFields();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withWeekOfWeekyear(19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.minusMinutes((int) (short) -1);
        boolean boolean20 = localDateTime10.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime10.plus(readableDuration21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readableDuration10);
        int int12 = localDateTime8.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "725" + "'", str6, "725");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.LocalDateTime localDateTime12 = property9.addToCopy(999);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = localDateTime12.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime6 = property2.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy((long) 599);
        int int9 = localDateTime8.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readablePeriod13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(1L);
        int int17 = localDateTime16.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        long long20 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDateTime localDateTime21 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime22 = property5.roundHalfEvenCopy();
        java.lang.String str23 = property5.getAsString();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minus(readablePeriod25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.plusSeconds(861);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(1L);
        int int34 = localDateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime();
        org.joda.time.DateTime dateTime36 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean37 = localDateTime28.isAfter((org.joda.time.ReadablePartial) localDateTime31);
        int int38 = localDateTime31.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime31.plusDays(16);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime31.plus(readableDuration41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime31.toDateTime(dateTimeZone43);
        long long45 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7" + "'", str23, "7");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2020 + "'", int38 == 2020);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-6940L) + "'", long45 == (-6940L));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears(10433965);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis(10429485);
        java.lang.String str14 = localDateTime11.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.minus(readablePeriod20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withPeriodAdded(readablePeriod28, 330);
        org.joda.time.DurationFieldType durationFieldType31 = null;
        boolean boolean32 = localDateTime30.isSupported(durationFieldType31);
        int[] intArray33 = localDateTime30.getValues();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.plus(readableDuration34);
        boolean boolean36 = localDateTime11.isEqual((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.minus(readablePeriod42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withPeriodAdded(readablePeriod50, 330);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        java.util.Date date55 = localDateTime54.toDate();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withYearOfCentury(1);
        int int61 = localDateTime54.compareTo((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime57.plusYears((int) (byte) 10);
        int int64 = localDateTime49.compareTo((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime.Property property65 = localDateTime49.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime49.withHourOfDay(1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusMonths(773);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minus(readablePeriod71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime70.plusSeconds(861);
        boolean boolean75 = localDateTime67.isAfter((org.joda.time.ReadablePartial) localDateTime74);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime35.withFields((org.joda.time.ReadablePartial) localDateTime74);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "979" + "'", str6, "979");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10435985-11-25T02:57:52.979" + "'", str14, "10435985-11-25T02:57:52.979");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[99, 12, 25, 10655979]");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(date55);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Wed Nov 25 02:57:52 UTC 2020");
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime60);
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(localDateTime76);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minus(readableDuration4);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        int int6 = localDateTime4.getWeekyear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.monthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = property9.getDifference(readableInstant10);
        long long12 = property9.remainder();
        java.lang.String str13 = property9.getAsShortText();
        org.joda.time.DurationField durationField14 = property9.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime16 = property9.addToCopy((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withPeriodAdded(readablePeriod19, 794);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.minusDays(175);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime3.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "290" + "'", str13, "290");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
            org.joda.time.DateTimeField dateTimeField12 = localDateTime10.getField(615);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 615");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:57:53 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusDays((int) 'a');
        java.util.Date date11 = localDateTime10.toDate();
        int int12 = localDateTime10.getDayOfWeek();
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = localDateTime10.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Aug 20 02:57:53 UTC 2001");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime3 = property2.getLocalDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606272813293L, dateTimeZone1);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        boolean boolean5 = property2.equals((java.lang.Object) "2001-11-25T02:53:34.725");
        org.joda.time.LocalDateTime localDateTime6 = property2.getLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, 175);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localDateTime6.toString("2001-11-25T02:57:00.814");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        int int10 = property2.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusMillis(0);
        boolean boolean18 = property2.equals((java.lang.Object) localDateTime15);
        int int19 = property2.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime21 = property2.addToCopy((long) 10442274);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "145" + "'", str6, "145");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "145" + "'", str8, "145");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999 + "'", int19 == 999);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "54" + "'", str3, "54");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
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
        org.joda.time.Interval interval7 = property2.toInterval();
        java.lang.String str8 = property2.getAsShortText();
        int int9 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusYears(19);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.dayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "297" + "'", str6, "297");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "297" + "'", str8, "297");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("802");
        java.util.Locale locale3 = null;
        java.lang.String str4 = localDateTime1.toString("47", locale3);
        int int5 = localDateTime1.getYear();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "47" + "'", str4, "47");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 802 + "'", int5 == 802);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.DurationField durationField12 = property11.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property11.setCopy("802");
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, (int) (byte) 0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = property18.addToCopy(382);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(1L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        int int12 = property2.compareTo((org.joda.time.ReadableInstant) dateTime11);
        int int13 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 435 + "'", int13 == 435);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withPeriodAdded(readablePeriod3, 794);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMinutes(725);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        java.lang.String str8 = property7.getAsShortText();
        org.joda.time.LocalDateTime localDateTime9 = property7.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020" + "'", str8, "2020");
        org.junit.Assert.assertNotNull(localDateTime9);
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
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        java.lang.String str8 = property2.getName();
        java.lang.String str9 = property2.getName();
        org.joda.time.LocalDateTime localDateTime11 = property2.addToCopy((long) 55);
        int int12 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millisOfSecond" + "'", str8, "millisOfSecond");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 999 + "'", int12 == 999);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606272812348L, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(1L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMinutes(10411969);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(146);
        boolean boolean11 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = property12.getLocalDateTime();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy((long) (byte) 1);
        int int10 = property2.getMinimumValueOverall();
        int int11 = property2.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = property2.setCopy("733");
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(997);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "609" + "'", str6, "609");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 999 + "'", int11 == 999);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
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
        org.joda.time.DurationField durationField6 = property5.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readableDuration10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withCenturyOfEra(0);
        int int19 = localDateTime13.getMinuteOfHour();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withYearOfEra(3);
        int int24 = localDateTime21.getYearOfEra();
        boolean boolean25 = localDateTime13.isEqual((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime13.withMillisOfSecond(470);
        boolean boolean28 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime27);
        int int29 = localDateTime27.getEra();
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.minus(readablePeriod36);
        int int38 = localDateTime37.getMonthOfYear();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime37.toDateTime(readableInstant39);
        boolean boolean41 = property30.equals((java.lang.Object) readableInstant39);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "662" + "'", str6, "662");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 57 + "'", int19 == 57);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2020 + "'", int24 == 2020);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 11 + "'", int38 == 11);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = property11.roundCeilingCopy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        int int16 = localDateTime15.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.minusMonths(645);
        boolean boolean20 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = property23.getDifference(readableInstant24);
        long long26 = property23.remainder();
        java.lang.String str27 = property23.getAsShortText();
        org.joda.time.DurationField durationField28 = property23.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime30 = property23.addToCopy((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.minusYears(19);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minus(readablePeriod36);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(1L);
        int int40 = localDateTime39.getSecondOfMinute();
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = localDateTime37.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = localDateTime30.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime44 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        int int45 = property7.compareTo((org.joda.time.ReadableInstant) dateTime44);
        int int46 = property7.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime48 = property7.setCopy("938");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime50 = localDateTime48.withEra(599);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 599 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10674838 + "'", int16 == 10674838);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "838" + "'", str27, "838");
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(localDateTime48);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfMonth(798);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 798 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        int int8 = localDateTime1.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localDateTime1.toString(dateTimeFormatter9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.minus(readableDuration11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T02:57:54.926" + "'", str10, "2020-11-25T02:57:54.926");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(10412477);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusDays(997);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        long long8 = property7.remainder();
        org.joda.time.Interval interval9 = property7.toInterval();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = property12.getDifference(readableInstant13);
        long long15 = property12.remainder();
        org.joda.time.LocalDateTime localDateTime16 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusMonths(100);
        int int19 = localDateTime18.size();
        java.lang.String str20 = localDateTime18.toString();
        boolean boolean21 = property7.equals((java.lang.Object) localDateTime18);
        java.lang.String str22 = property7.getAsShortText();
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2029-03-25T02:57:55.137" + "'", str20, "2029-03-25T02:57:55.137");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "238" + "'", str22, "238");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays((int) (short) 0);
        boolean boolean16 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.plusMinutes(10412477);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        java.util.Locale locale6 = null;
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy("322", locale6);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.plusMonths(100);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusYears(330);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withDurationAdded(readableDuration16, 10671573);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:57:55 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("294");
        int int2 = localDateTime1.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = localDateTime6.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withYearOfEra(10509629);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusYears(10594509);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMinimumValue();
        java.lang.String str5 = property3.getAsShortText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AD" + "'", str5, "AD");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.lang.String str9 = property7.getAsString();
        org.joda.time.DurationField durationField10 = property7.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property7.getFieldType();
        java.util.Locale locale12 = null;
        int int13 = property7.getMaximumShortTextLength(locale12);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20" + "'", str9, "20");
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDayOfYear(43);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readablePeriod13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfEra(48);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfWeek();
        boolean boolean18 = localDateTime11.equals((java.lang.Object) property17);
        org.joda.time.LocalDateTime localDateTime19 = property17.withMaximumValue();
        boolean boolean20 = property17.isLeap();
        java.lang.String str21 = property17.toString();
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = property17.setCopy("54", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"54\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Property[dayOfWeek]" + "'", str21, "Property[dayOfWeek]");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        java.lang.String str10 = localDateTime8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMinuteOfHour(10617207);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10617207 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2029-03-25T02:57:55.518" + "'", str10, "2029-03-25T02:57:55.518");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy(59);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfEra(2077);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
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
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        java.lang.String str8 = property2.getName();
        java.lang.String str9 = property2.getName();
        org.joda.time.LocalDateTime localDateTime10 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = property2.roundCeilingCopy();
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millisOfSecond" + "'", str8, "millisOfSecond");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        int int10 = property9.getMinimumValue();
        boolean boolean11 = property9.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = localDateTime8.isSupported(durationFieldType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withDate(10583113, 178, 446);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 178 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "693" + "'", str6, "693");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
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
        int int8 = localDateTime1.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusDays((int) 'a');
        int int11 = localDateTime7.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime7.dayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(48);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusMonths(2);
        org.joda.time.DateTimeField dateTimeField12 = localDateTime1.getField(0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime1.yearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime6 = property2.withMinimumValue();
        int int7 = localDateTime6.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusDays(545);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy(43);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.minus(readablePeriod16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withPeriodAdded(readablePeriod24, 330);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        java.util.Date date29 = localDateTime28.toDate();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYearOfCentury(1);
        int int35 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.plusYears((int) (byte) 10);
        int int38 = localDateTime23.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime23.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime23.withHourOfDay(1);
        org.joda.time.Chronology chronology42 = localDateTime23.getChronology();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime8, chronology42);
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now(chronology42);
        int int45 = localDateTime44.getDayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Wed Nov 25 02:57:56 UTC 2020");
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 25 + "'", int45 == 25);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) (short) -1);
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.centuryOfEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withEra(37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "56" + "'", str3, "56");
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T02:57:55.332" + "'", str6, "2020-11-25T02:57:55.332");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfDay(10412477);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withField(dateTimeFieldType10, (int) (byte) 0);
        int int13 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.minusMonths(10449321);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(1L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDateTime localDateTime27 = property21.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusDays(10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMonthOfYear(4);
        int int32 = localDateTime31.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = property35.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        java.util.Date date42 = localDateTime41.toDate();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withYearOfCentury(1);
        int int48 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime39.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime55 = property54.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusSeconds((int) (byte) 100);
        int int58 = localDateTime55.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property59 = localDateTime55.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property59.getFieldType();
        boolean boolean61 = localDateTime44.isSupported(dateTimeFieldType60);
        int int62 = localDateTime31.get(dateTimeFieldType60);
        org.joda.time.LocalDateTime.Property property63 = localDateTime15.property(dateTimeFieldType60);
        org.joda.time.LocalDateTime.Property property64 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeField[] dateTimeFieldArray65 = localDateTime15.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime70 = localDateTime15.withTime(10669042, 128, 10573990, 2001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10669042 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2020 + "'", int13 == 2020);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 16 + "'", int32 == 16);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Wed Nov 25 02:57:56 UTC 2020");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2001 + "'", int62 == 2001);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTimeFieldArray65);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYearOfEra(48);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.year();
        org.joda.time.LocalDateTime localDateTime7 = property5.setCopy((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readableDuration8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.era();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        int int7 = localDateTime4.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.centuryOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        int int11 = property8.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime12 = property8.withMaximumValue();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        int int7 = localDateTime6.getMonthOfYear();
        java.util.Date date8 = localDateTime6.toDate();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds(2004);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusSeconds(10596619);
        int int13 = localDateTime6.getDayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 02:57:56 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        java.util.Locale locale4 = null;
        int int5 = property3.getMaximumTextLength(locale4);
        org.joda.time.DurationField durationField6 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property3.addWrapFieldToCopy(777);
        org.joda.time.DateTimeField dateTimeField9 = property3.getField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(725, 10586914, 15, 2030, 645, 10581603);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2030 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        java.util.Date date9 = localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromDateFields(date9);
        int int11 = localDateTime10.getYear();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:57:56 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:57:56 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy(43);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute(0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        java.lang.String str14 = property13.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "25" + "'", str14, "25");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYearOfEra(54);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.centuryOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(1L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        long long14 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        int int15 = property2.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDateTime localDateTime16 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField17 = property2.getDurationField();
        org.joda.time.Interval interval18 = property2.toInterval();
        org.joda.time.DateTimeField dateTimeField19 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11651L + "'", long14 == 11651L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime11 = property7.addToCopy((long) 217);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withDayOfWeek(10482000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10482000 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28609077000L + "'", long8 == 28609077000L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusYears((int) (byte) 10);
        int int27 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime12.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime12.withHourOfDay(1);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minus(readablePeriod31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withYearOfEra(881);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField36 = localDateTime34.getField(446);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 446");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:57:57 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfEra(3);
        int int18 = localDateTime15.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property20 = localDateTime12.hourOfDay();
        org.joda.time.DurationField durationField21 = property20.getRangeDurationField();
        int int22 = property20.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2020 + "'", int18 == 2020);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(durationField21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        int int3 = localDateTime1.getYearOfEra();
        int int4 = localDateTime1.getMillisOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = localDateTime1.toString(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.001" + "'", str6, "1970-01-01T00:00:00.001");
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
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(1L);
        int int26 = localDateTime25.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.era();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 57 + "'", int14 == 57);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property5.getDifference(readableInstant6);
        long long8 = property5.remainder();
        java.lang.String str9 = property5.getAsShortText();
        org.joda.time.DurationField durationField10 = property5.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime12 = property5.addToCopy((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusYears(19);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readablePeriod18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(1L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        org.joda.time.DateTime dateTime24 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        int int26 = property2.compareTo((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean27 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "305" + "'", str9, "305");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusDays((int) 'a');
        int int11 = localDateTime7.getMonthOfYear();
        int int12 = localDateTime7.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2001 + "'", int12 == 2001);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        int int10 = property2.getMinimumValueOverall();
        java.util.Locale locale12 = null;
        org.joda.time.LocalDateTime localDateTime13 = property2.setCopy("476", locale12);
        int int14 = localDateTime13.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "421" + "'", str6, "421");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusWeeks(997);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMillis(10430470);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime();
        org.joda.time.LocalDateTime.Property property13 = localDateTime9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9, dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(1L);
        boolean boolean27 = localDateTime21.isAfter((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime26.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(1L);
        int int34 = localDateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime();
        org.joda.time.DateTime dateTime36 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime37 = localDateTime26.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        int int38 = property16.compareTo((org.joda.time.ReadableInstant) dateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10677557 + "'", int2 == 10677557);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T00:04:07.087" + "'", str11, "2020-11-25T00:04:07.087");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withMillisOfSecond(922);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readableDuration12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusWeeks(997);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMillis(10430470);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField14 = property12.getRangeDurationField();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10677641 + "'", int2 == 10677641);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T00:04:07.171" + "'", str11, "2020-11-25T00:04:07.171");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 3, 0, (int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.weekyear();
        org.joda.time.DurationField durationField7 = property6.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property6.addToCopy(5);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusDays(725);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusDays(146);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusWeeks((int) (short) -1);
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
        org.joda.time.LocalDateTime localDateTime24 = localDateTime8.withWeekyear(20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime8.plusMonths(751);
        org.joda.time.Chronology chronology27 = localDateTime8.getChronology();
        int int28 = localDateTime8.getDayOfWeek();
        int int29 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime1.plusMinutes(10446457);
        int int32 = localDateTime1.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 57 + "'", int14 == 57);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 48 + "'", int32 == 48);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        java.util.Date date9 = localDateTime4.toDate();
        int int10 = localDateTime4.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime4.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.minusMinutes(10489555);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.secondOfMinute();
        int int17 = localDateTime15.getYear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfDay(10412477);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime15.withField(dateTimeFieldType24, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime15);
        int int28 = localDateTime15.getYear();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:57:57 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:57:57 UTC 2020");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2020 + "'", int17 == 2020);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2020 + "'", int28 == 2020);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(861);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(1L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDateTime4.getFieldType(10671545);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10671545");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDayOfYear(43);
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withPeriodAdded(readablePeriod13, 10581603);
        int int16 = localDateTime8.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withMillisOfDay(100);
        int int25 = localDateTime24.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        boolean boolean34 = localDateTime32.isBefore((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minus(readablePeriod36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusDays((int) (short) 0);
        java.lang.String str48 = localDateTime45.toString();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusSeconds((int) (byte) 100);
        int int55 = localDateTime52.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property56.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property56.getFieldType();
        int int59 = localDateTime45.get(dateTimeFieldType58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime35.property(dateTimeFieldType58);
        org.joda.time.LocalDateTime.Property property61 = localDateTime33.property(dateTimeFieldType58);
        org.joda.time.LocalDateTime.Property property62 = localDateTime24.property(dateTimeFieldType58);
        int int63 = localDateTime8.get(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25 + "'", int16 == 25);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2001-11-25T02:57:58.090" + "'", str48, "2001-11-25T02:57:58.090");
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2001 + "'", int59 == 2001);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2020 + "'", int63 == 2020);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        int int7 = localDateTime6.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(645);
        boolean boolean11 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime6);
        java.util.Locale locale13 = null;
        java.lang.String str14 = localDateTime6.toString("129", locale13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10678327 + "'", int7 == 10678327);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "129" + "'", str14, "129");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        org.joda.time.LocalDateTime localDateTime8 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property2.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withMillisOfSecond(329);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 10449321);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withCenturyOfEra(592);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears(314);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy("33");
        org.joda.time.DurationField durationField8 = property2.getDurationField();
        org.joda.time.DateTimeField dateTimeField9 = property2.getField();
        org.joda.time.LocalDateTime localDateTime11 = property2.addToCopy(10472411);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "58" + "'", str3, "58");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYearOfEra(54);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusWeeks(9);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plus(readableDuration16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime15.isSupported(durationFieldType16);
        int[] intArray18 = localDateTime15.getValues();
        org.joda.time.Chronology chronology19 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withYear(10532917);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra(736);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 736 for era must be in the range [0,1]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[99, 12, 25, 10655657]");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        java.lang.String str8 = property2.getName();
        java.lang.String str9 = property2.getName();
        org.joda.time.LocalDateTime localDateTime10 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(1L);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        int int14 = property13.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(1L);
        int int23 = localDateTime22.getSecondOfMinute();
        org.joda.time.DateTime dateTime24 = localDateTime22.toDateTime();
        long long25 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        int int26 = property13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime localDateTime27 = property13.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(1L);
        boolean boolean38 = localDateTime32.isAfter((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.DurationFieldType durationFieldType39 = null;
        boolean boolean40 = localDateTime37.isSupported(durationFieldType39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime37.toDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = localDateTime27.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        long long44 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millisOfSecond" + "'", str8, "millisOfSecond");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 11651L + "'", long25 == 11651L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1606273078713L + "'", long44 == 1606273078713L);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readablePeriod13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(1L);
        int int17 = localDateTime16.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        long long20 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDateTime localDateTime21 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime22 = property5.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plus(readablePeriod23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.secondOfMinute();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.era();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withDurationAdded(readableDuration39, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readablePeriod43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusDays((int) (short) 0);
        java.lang.String str55 = localDateTime52.toString();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime59 = property58.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusSeconds((int) (byte) 100);
        int int62 = localDateTime59.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property63 = localDateTime59.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property63.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property63.getFieldType();
        int int66 = localDateTime52.get(dateTimeFieldType65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime42.property(dateTimeFieldType65);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime38.withField(dateTimeFieldType65, 10446457);
        int int70 = localDateTime38.getMillisOfSecond();
        org.joda.time.DateTime dateTime71 = localDateTime38.toDateTime();
        int int72 = property29.compareTo((org.joda.time.ReadableInstant) dateTime71);
        long long73 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime71);
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
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "2001-11-25T02:57:58.802" + "'", str55, "2001-11-25T02:57:58.802");
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2001 + "'", int66 == 2001);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localDateTime69);
// flaky:         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 802 + "'", int70 == 802);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-10678L) + "'", long73 == (-10678L));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        int int4 = localDateTime1.getSecondOfMinute();
        int int5 = localDateTime1.getCenturyOfEra();
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusMonths(1901);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusSeconds(16);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDateTime10.toDateTime(dateTimeZone11);
        java.lang.Class<?> wildcardClass13 = localDateTime10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withPeriodAdded(readablePeriod20, 330);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = localDateTime22.isSupported(durationFieldType23);
        int[] intArray25 = localDateTime22.getValues();
        org.joda.time.Chronology chronology26 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(chronology26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(275, (-292275054), 10502345, (int) (short) 100, 637, 356, 1606272960, chronology26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[99, 12, 25, 10655974]");
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withPeriodAdded(readablePeriod20, 330);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        java.util.Date date25 = localDateTime24.toDate();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        int int31 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.plusYears((int) (byte) 10);
        int int34 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        java.util.Date date37 = localDateTime36.toDate();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.fromDateFields(date37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime43 = property41.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        java.util.Date date48 = localDateTime47.toDate();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withYearOfCentury(1);
        int int54 = localDateTime47.compareTo((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime45.withFields((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime61 = property60.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plusSeconds((int) (byte) 100);
        int int64 = localDateTime61.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property65 = localDateTime61.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = property65.getFieldType();
        boolean boolean67 = localDateTime50.isSupported(dateTimeFieldType66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime38.withField(dateTimeFieldType66, 773);
        int int70 = localDateTime33.indexOf(dateTimeFieldType66);
        boolean boolean71 = localDateTime6.isSupported(dateTimeFieldType66);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime6.withCenturyOfEra(794);
        org.joda.time.DateTime dateTime74 = localDateTime73.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed Nov 25 02:57:58 UTC 2020");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Wed Nov 25 02:57:58 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Wed Nov 25 02:57:58 UTC 2020");
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        org.joda.time.LocalDateTime.Property property19 = localDateTime6.dayOfYear();
        org.joda.time.LocalDateTime.Property property20 = localDateTime6.year();
        java.util.Date date21 = localDateTime6.toDate();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:57:59 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed Nov 25 02:57:59 UTC 2020");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYearOfEra(54);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plus(readableDuration14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withDurationAdded(readableDuration16, 10453137);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusWeeks(23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withPeriodAdded(readablePeriod20, 330);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        java.util.Date date25 = localDateTime24.toDate();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        int int31 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.plusYears((int) (byte) 10);
        int int34 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        java.util.Date date37 = localDateTime36.toDate();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.fromDateFields(date37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime43 = property41.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        java.util.Date date48 = localDateTime47.toDate();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withYearOfCentury(1);
        int int54 = localDateTime47.compareTo((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime45.withFields((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime61 = property60.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plusSeconds((int) (byte) 100);
        int int64 = localDateTime61.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property65 = localDateTime61.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = property65.getFieldType();
        boolean boolean67 = localDateTime50.isSupported(dateTimeFieldType66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime38.withField(dateTimeFieldType66, 773);
        int int70 = localDateTime33.indexOf(dateTimeFieldType66);
        boolean boolean71 = localDateTime6.isSupported(dateTimeFieldType66);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime6.withCenturyOfEra(794);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, dateTimeZone74);
        int int76 = localDateTime6.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed Nov 25 02:57:59 UTC 2020");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Wed Nov 25 02:57:59 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Wed Nov 25 02:57:59 UTC 2020");
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(localDateTime73);
// flaky:         org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10679258 + "'", int76 == 10679258);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYearOfEra(48);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.year();
        int int6 = property5.getLeapAmount();
        org.joda.time.DurationField durationField7 = property5.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField8 = property5.getField();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromDateFields(date2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        java.util.Date date13 = localDateTime12.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        int int19 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusSeconds((int) (byte) 100);
        int int29 = localDateTime26.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property30 = localDateTime26.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        boolean boolean32 = localDateTime15.isSupported(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime3.withField(dateTimeFieldType31, 773);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime36.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.era();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundCeilingCopy();
        java.util.Locale locale49 = null;
        int int50 = property47.getMaximumTextLength(locale49);
        int int51 = property47.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minus(readablePeriod53);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(1L);
        int int57 = localDateTime56.getSecondOfMinute();
        org.joda.time.DateTime dateTime58 = localDateTime56.toDateTime();
        org.joda.time.DateTime dateTime59 = localDateTime54.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        long long60 = property47.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime61 = localDateTime43.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime43.plusMonths(3);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime43.minusWeeks(10446718);
        int int66 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minus(readablePeriod68);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.plusSeconds(861);
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.minus(readablePeriod73);
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(1L);
        int int77 = localDateTime76.getSecondOfMinute();
        org.joda.time.DateTime dateTime78 = localDateTime76.toDateTime();
        org.joda.time.DateTime dateTime79 = localDateTime74.toDateTime((org.joda.time.ReadableInstant) dateTime78);
        boolean boolean80 = localDateTime71.isAfter((org.joda.time.ReadablePartial) localDateTime74);
        int int81 = localDateTime74.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime74.plusDays(16);
        org.joda.time.ReadableDuration readableDuration84 = null;
        org.joda.time.LocalDateTime localDateTime85 = localDateTime74.plus(readableDuration84);
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.DateTime dateTime87 = localDateTime74.toDateTime(dateTimeZone86);
        org.joda.time.LocalDateTime.Property property88 = localDateTime74.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone89 = null;
        org.joda.time.LocalDateTime localDateTime90 = new org.joda.time.LocalDateTime(dateTimeZone89);
        org.joda.time.LocalDateTime.Property property91 = localDateTime90.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime92 = property91.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime94 = localDateTime92.plusSeconds((int) (byte) 100);
        int int95 = localDateTime92.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property96 = localDateTime92.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType97 = property96.getFieldType();
        int int98 = localDateTime74.indexOf(dateTimeFieldType97);
        org.joda.time.LocalDateTime.Property property99 = localDateTime43.property(dateTimeFieldType97);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:57:59 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed Nov 25 02:57:59 UTC 2020");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2020 + "'", int81 == 2020);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(localDateTime85);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertNotNull(localDateTime92);
        org.junit.Assert.assertNotNull(localDateTime94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertNotNull(property96);
        org.junit.Assert.assertNotNull(dateTimeFieldType97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertNotNull(property99);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        boolean boolean10 = property9.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        java.lang.String str11 = property10.toString();
        org.joda.time.Interval interval12 = property10.toInterval();
        boolean boolean13 = localDateTime4.equals((java.lang.Object) property10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.minus(readablePeriod14);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 3, 0, (int) ' ');
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.weekyear();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withPeriodAdded(readablePeriod23, 20);
        int int26 = localDateTime25.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYear(0);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusDays(19);
        boolean boolean31 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime28);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[dayOfMonth]" + "'", str11, "Property[dayOfMonth]");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusMinutes((int) (short) -1);
        int int13 = localDateTime12.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withMinuteOfHour((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.minusDays(545);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 856 + "'", int13 == 856);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        int int4 = localDateTime3.getYear();
        int int5 = localDateTime3.getEra();
        int int6 = localDateTime3.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 897 + "'", int6 == 897);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = localDateTime6.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withYearOfEra(10509629);
        int int11 = localDateTime6.getYear();
        int int12 = localDateTime6.getDayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        int int17 = property16.get();
        java.util.Locale locale18 = null;
        int int19 = property16.getMaximumTextLength(locale18);
        java.util.Locale locale20 = null;
        int int21 = property16.getMaximumTextLength(locale20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears(10433965);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMinutes(10437476);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond(536);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "81" + "'", str6, "81");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMillisOfDay(10671573);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusWeeks(997);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMillis(10430470);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        java.util.Date date15 = localDateTime14.toDate();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        int int21 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.minusMillis(4);
        org.joda.time.LocalDateTime.Property property24 = localDateTime17.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = property27.getDifference(readableInstant28);
        long long30 = property27.remainder();
        java.lang.String str31 = property27.getAsShortText();
        org.joda.time.DurationField durationField32 = property27.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime33 = property27.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.minusMillis(0);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.era();
        java.util.Date date44 = localDateTime42.toDate();
        boolean boolean45 = property34.equals((java.lang.Object) localDateTime42);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(1L);
        int int48 = localDateTime47.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.era();
        java.lang.String str50 = property49.getAsString();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.secondOfMinute();
        java.lang.String str54 = property53.getAsString();
        org.joda.time.DurationField durationField55 = property53.getDurationField();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minus(readablePeriod57);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(1L);
        int int61 = localDateTime60.getSecondOfMinute();
        org.joda.time.DateTime dateTime62 = localDateTime60.toDateTime();
        org.joda.time.DateTime dateTime63 = localDateTime58.toDateTime((org.joda.time.ReadableInstant) dateTime62);
        long long64 = property53.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime63);
        int int65 = property49.compareTo((org.joda.time.ReadableInstant) dateTime63);
        int int66 = property34.compareTo((org.joda.time.ReadableInstant) dateTime63);
        int int67 = property24.getDifference((org.joda.time.ReadableInstant) dateTime63);
        int int68 = property12.compareTo((org.joda.time.ReadableInstant) dateTime63);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10680183 + "'", int2 == 10680183);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T00:04:09.713" + "'", str11, "2020-11-25T00:04:09.713");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed Nov 25 02:58:00 UTC 2020");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "184" + "'", str31, "184");
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Sun Nov 25 02:58:00 UTC 2001");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1" + "'", str50, "1");
        org.junit.Assert.assertNotNull(property53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYearOfEra(54);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plus(readableDuration14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withDurationAdded(readableDuration16, 10453137);
        int int19 = localDateTime18.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 54 + "'", int19 == 54);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withDurationAdded(readableDuration7, 19);
        java.lang.String str10 = localDateTime4.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T02:58:00.378" + "'", str10, "2020-11-25T02:58:00.378");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.withMillisOfSecond(470);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYearOfEra(54);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime13.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusHours(10502345);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withMillisOfSecond(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.secondOfMinute();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.DurationField durationField9 = property7.getDurationField();
        int int10 = property7.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusMillis(0);
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusSeconds(3);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusMillis(0);
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime();
        org.joda.time.DateTime dateTime31 = localDateTime15.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        int int32 = property7.compareTo((org.joda.time.ReadableInstant) dateTime30);
        int int33 = property2.getDifference((org.joda.time.ReadableInstant) dateTime30);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 599615999 + "'", int33 == 599615999);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundCeilingCopy();
        java.util.Locale locale14 = null;
        int int15 = property12.getMaximumTextLength(locale14);
        int int16 = property12.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readablePeriod18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(1L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        org.joda.time.DateTime dateTime24 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        long long25 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.withPeriodAdded(readablePeriod27, 501);
        int int30 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property31 = localDateTime8.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25 + "'", int30 == 25);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(1L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        int int12 = property2.compareTo((org.joda.time.ReadableInstant) dateTime11);
        java.lang.Class<?> wildcardClass13 = dateTime11.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 11, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.year();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusMinutes(712);
        int int6 = localDateTime2.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusSeconds((int) (byte) 100);
        int int17 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.withField(dateTimeFieldType19, 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = localDateTime10.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime10.minusWeeks(5);
        java.lang.String str26 = localDateTime10.toString("33");
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime10.minus(readableDuration27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        java.util.Date date31 = localDateTime30.toDate();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.millisOfDay();
        int[] intArray33 = localDateTime30.getValues();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.withYearOfEra(10575721);
        boolean boolean36 = localDateTime28.isBefore((org.joda.time.ReadablePartial) localDateTime35);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:00 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "33" + "'", str26, "33");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 02:58:00 UTC 2020");
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(intArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[2020, 11, 25, 10680816]");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        java.lang.String str10 = property9.getAsText();
        java.util.Locale locale11 = null;
        int int12 = property9.getMaximumShortTextLength(locale11);
        int int13 = property9.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 292278993 + "'", int13 == 292278993);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears(10433965);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis(10429485);
        java.util.Date date14 = localDateTime13.toDate();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20" + "'", str6, "20");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 25 00:04:11 UTC 10435985");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withDurationAdded(readableDuration11, 10453137);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMillis(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withCenturyOfEra(10678327);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10678327 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:01 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
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
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMillis(999);
        int int13 = localDateTime10.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 175 + "'", int13 == 175);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(10412477);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusWeeks(48);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfYear(31);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = property13.getDifference(readableInstant14);
        long long16 = property13.remainder();
        java.lang.String str17 = property13.getAsShortText();
        org.joda.time.DurationField durationField18 = property13.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime19 = property13.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = property22.getDifference(readableInstant23);
        long long25 = property22.remainder();
        java.lang.String str26 = property22.getAsShortText();
        org.joda.time.DurationField durationField27 = property22.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime29 = property22.addToCopy((long) (byte) 1);
        int int30 = property22.getMinimumValueOverall();
        int int31 = property22.getMaximumValue();
        java.util.Locale locale33 = null;
        org.joda.time.LocalDateTime localDateTime34 = property22.setCopy("802", locale33);
        boolean boolean35 = localDateTime19.isBefore((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime37.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime37.minusMillis(10403113);
        boolean boolean47 = localDateTime34.isAfter((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime46.year();
        boolean boolean49 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "262" + "'", str17, "262");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "262" + "'", str26, "262");
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 999 + "'", int31 == 999);
        org.junit.Assert.assertNotNull(localDateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withPeriodAdded(readablePeriod3, 794);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMillis(10602366);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("663", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusSeconds(19);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(1L);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.minuteOfHour();
        int int15 = property14.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(1L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        int int27 = property14.compareTo((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean28 = property14.isLeap();
        java.util.Locale locale29 = null;
        int int30 = property14.getMaximumTextLength(locale29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property14.getFieldType();
        org.joda.time.LocalDateTime.Property property32 = localDateTime11.property(dateTimeFieldType31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusYears((int) (byte) 100);
        java.lang.String str41 = localDateTime40.toString();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.millisOfSecond();
        int int43 = localDateTime40.getEra();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime40.toDateTime(dateTimeZone44);
        int int46 = property32.compareTo((org.joda.time.ReadableInstant) dateTime45);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1901-11-25T02:58:01.511" + "'", str41, "1901-11-25T02:58:01.511");
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        int int4 = localDateTime2.getYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withMillisOfDay(10412477);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime2.withField(dateTimeFieldType11, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime2.minusWeeks(5);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(obj0, chronology16);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(10537914);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 685 + "'", int2 == 685);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusYears((int) (byte) 10);
        int int27 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime12.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime12.withHourOfDay(1);
        org.joda.time.Chronology chronology31 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withMillisOfDay(982);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:01 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        long long13 = property11.getDifferenceAsLong(readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(1L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        long long24 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        long long25 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime8.yearOfCentury();
        int int28 = localDateTime8.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = property31.getDifference(readableInstant32);
        long long34 = property31.remainder();
        java.lang.String str35 = property31.getAsShortText();
        org.joda.time.DurationField durationField36 = property31.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime38 = property31.addToCopy((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.minusYears(19);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusMonths((int) ' ');
        int int46 = localDateTime42.getWeekyear();
        org.joda.time.LocalDateTime.Property property47 = localDateTime42.dayOfYear();
        boolean boolean48 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime42);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 11651L + "'", long24 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1606273081826L + "'", long25 == 1606273081826L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "827" + "'", str35, "827");
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2001 + "'", int46 == 2001);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMillis(999);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plus(readableDuration13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withPeriodAdded(readablePeriod15, 10473563);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.minusMillis(10557415);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
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
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy((long) 599);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property2.setCopy("2001-11-25T02:53:28.345", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2001-11-25T02:53:28.345\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfEvenCopy();
        java.lang.String str4 = property2.getName();
        org.joda.time.LocalDateTime localDateTime6 = property2.addToCopy(10575721);
        int int7 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "millisOfSecond" + "'", str4, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(48);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime1, dateTimeZone5);
        int int7 = localDateTime6.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2020 + "'", int7 == 2020);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 3, 0, (int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withPeriodAdded(readablePeriod7, 20);
        int int10 = localDateTime9.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear(0);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localDateTime14.getFields();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusSeconds(10412477);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        java.util.Date date20 = localDateTime19.toDate();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.fromDateFields(date20);
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
        org.joda.time.LocalDateTime localDateTime52 = localDateTime21.withField(dateTimeFieldType49, 773);
        int int53 = localDateTime17.indexOf(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime12.withField(dateTimeFieldType49, 10449321);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime12.minusHours(15);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Wed Nov 25 02:58:02 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 02:58:02 UTC 2020");
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfFloorCopy();
        int int7 = localDateTime6.getDayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25 + "'", int7 == 25);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.DurationField durationField12 = property11.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property11.setCopy("802");
        java.lang.String str15 = property11.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020" + "'", str15, "2020");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("469", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime19, dateTimeZone20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusYears((int) (byte) 10);
        int int27 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = localDateTime12.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:02 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        java.lang.String str10 = property9.getAsText();
        java.util.Locale locale11 = null;
        int int12 = property9.getMaximumShortTextLength(locale11);
        org.joda.time.LocalDateTime localDateTime13 = property9.roundCeilingCopy();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property9.getAsText(locale14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = property11.getDifference(readableInstant12);
        long long14 = property11.remainder();
        java.lang.String str15 = property11.getAsShortText();
        org.joda.time.DurationField durationField16 = property11.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime18 = property11.addToCopy((long) (byte) 1);
        int int19 = property11.getMinimumValueOverall();
        int int20 = property11.getMaximumValue();
        java.util.Locale locale22 = null;
        org.joda.time.LocalDateTime localDateTime23 = property11.setCopy("802", locale22);
        boolean boolean24 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime26.minusMillis(10403113);
        boolean boolean36 = localDateTime23.isAfter((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime35.year();
        org.joda.time.LocalDateTime localDateTime39 = property37.addToCopy(10573990);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "886" + "'", str6, "886");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "886" + "'", str15, "886");
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 999 + "'", int20 == 999);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(1L);
        int int26 = localDateTime25.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.era();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withDayOfMonth(10609288);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10609288 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(10412477);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds((int) (byte) 100);
        int int20 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property21.getFieldType();
        boolean boolean23 = localDateTime11.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime1.withField(dateTimeFieldType22, 501);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withPeriodAdded(readablePeriod26, 10643254);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusSeconds(2001);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.plusMonths(10403113);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        java.lang.String str18 = property17.getAsText();
        org.joda.time.LocalDateTime localDateTime20 = property17.addWrapFieldToCopy(10679258);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "February" + "'", str18, "February");
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime15.isSupported(durationFieldType16);
        int[] intArray18 = localDateTime15.getValues();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusMonths(321);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[99, 12, 25, 10715124]");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        int int6 = property5.getLeapAmount();
        org.joda.time.DurationField durationField7 = property5.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(durationField7);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(114, 10616216, 10563651, 10519075, 10596619);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10519075 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        java.lang.String str4 = property3.getAsString();
        java.lang.String str5 = property3.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYear(10482000);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("minuteOfHour", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy("33");
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        int int9 = localDateTime8.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3" + "'", str3, "3");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1606273061);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfDay();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property3.getAsShortText(locale4);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10683765 + "'", int2 == 10683765);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10683765" + "'", str5, "10683765");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime11 = property7.addToCopy((long) 217);
        long long12 = property7.remainder();
        org.joda.time.DateTimeField dateTimeField13 = property7.getField();
        java.util.Locale locale14 = null;
        int int15 = property7.getMaximumShortTextLength(locale14);
        java.lang.String str16 = property7.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28609084000L + "'", long8 == 28609084000L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 28609084000L + "'", long12 == 28609084000L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020" + "'", str16, "2020");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDurationAdded(readableDuration10, 53);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.minusMonths(19);
        org.joda.time.LocalDateTime.Property property15 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime8.withWeekyear(2);
        int int18 = localDateTime17.getDayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 83 + "'", int18 == 83);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("294");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusSeconds(721);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10683988 + "'", int2 == 10683988);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        int int8 = localDateTime6.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withWeekOfWeekyear(2020);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2020 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime11 = property7.addToCopy((long) 217);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfDay(861);
        org.joda.time.DurationFieldType durationFieldType14 = null;
        boolean boolean15 = localDateTime13.isSupported(durationFieldType14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusMillis(0);
        int int18 = localDateTime17.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28609085000L + "'", long8 == 28609085000L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2237 + "'", int18 == 2237);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDurationAdded(readableDuration3, 10459929);
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.year();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy("33");
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths(861);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withWeekyear(599);
        java.util.Date date13 = localDateTime7.toDate();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed Nov 25 02:58:33 UTC 2020");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(861);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(1L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        int int20 = localDateTime4.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.minus(readablePeriod26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withPeriodAdded(readablePeriod34, 330);
        org.joda.time.DurationFieldType durationFieldType37 = null;
        boolean boolean38 = localDateTime36.isSupported(durationFieldType37);
        int[] intArray39 = localDateTime36.getValues();
        org.joda.time.Chronology chronology40 = localDateTime36.getChronology();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime4, chronology40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withDayOfMonth(997);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 997 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2001 + "'", int20 == 2001);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[99, 12, 25, 10715304]");
        org.junit.Assert.assertNotNull(chronology40);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusHours(615);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = property2.roundFloorCopy();
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        org.joda.time.DurationField durationField8 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property2.addToCopy(1606272967802L);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("46");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMonths(10411969);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "639" + "'", str6, "639");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withDayOfYear(2);
        int int20 = localDateTime19.getYearOfEra();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.lang.String str9 = property7.getAsString();
        org.joda.time.DurationField durationField10 = property7.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property7.getFieldType();
        org.joda.time.DateTimeField dateTimeField12 = property7.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20" + "'", str9, "20");
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(1L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMaximumValue();
        boolean boolean19 = property2.isLeap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = property2.setCopy(10564770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10564770 for millisOfSecond must be in the range [0,999]");
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
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273084822L + "'", long16 == 1606273084822L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusYears((int) (byte) 10);
        int int27 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime12.plusYears(861);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusMonths((int) (short) 1);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        org.joda.time.LocalDateTime localDateTime33 = property32.withMinimumValue();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.year();
        int int35 = localDateTime33.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:04 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withCenturyOfEra(0);
        int int11 = localDateTime5.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withCenturyOfEra(0);
        int int19 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime5.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime.Property property22 = localDateTime5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(1L);
        boolean boolean33 = localDateTime27.isAfter((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minus(readablePeriod36);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(1L);
        int int40 = localDateTime39.getSecondOfMinute();
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = localDateTime37.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = localDateTime32.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        long long44 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime42);
        int int45 = property3.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 58 + "'", int11 == 58);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 3, 0, (int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.weekyear();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfCentury();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        java.lang.String str10 = property9.getAsText();
        java.lang.Class<?> wildcardClass11 = property9.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMillis(999);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        java.util.Date date15 = localDateTime14.toDate();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        int int21 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime14.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant27 = null;
        long long28 = property26.getDifferenceAsLong(readableInstant27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(1L);
        int int37 = localDateTime36.getSecondOfMinute();
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime();
        long long39 = property34.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        long long40 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDateTime localDateTime41 = property26.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime42 = property26.withMaximumValue();
        int int43 = localDateTime23.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime23.getYearOfCentury();
        boolean boolean45 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime23);
        int int46 = localDateTime10.getDayOfMonth();
        java.util.Date date47 = localDateTime10.toDate();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed Nov 25 02:58:05 UTC 2020");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 11651L + "'", long39 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1606273085241L + "'", long40 == 1606273085241L);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20 + "'", int44 == 20);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Sat Apr 06 02:58:05 UTC 2019");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(1L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        long long14 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        int int15 = property2.compareTo((org.joda.time.ReadableInstant) dateTime13);
        boolean boolean16 = property2.isLeap();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property2.getAsShortText(locale17);
        java.lang.String str19 = property2.getName();
        java.lang.String str20 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11651L + "'", long14 == 11651L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "minuteOfHour" + "'", str19, "minuteOfHour");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Property[minuteOfHour]" + "'", str20, "Property[minuteOfHour]");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 3, 0, (int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.weekyear();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property6.setCopy(2);
        int int10 = property6.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.minus(readablePeriod16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.year();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withYearOfEra(54);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plus(readablePeriod23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.plusWeeks(9);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusYears(10568247);
        int int29 = property6.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime34 = property32.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        java.util.Date date39 = localDateTime38.toDate();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withYearOfCentury(1);
        int int45 = localDateTime38.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime36.withFields((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusSeconds((int) (byte) 100);
        int int55 = localDateTime52.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property56.getFieldType();
        boolean boolean58 = localDateTime41.isSupported(dateTimeFieldType57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime41.plusMinutes(921);
        java.lang.String str62 = localDateTime41.toString("14");
        int int63 = property6.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime.Property property64 = localDateTime41.era();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-292275054) + "'", int10 == (-292275054));
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Wed Nov 25 02:58:05 UTC 2020");
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "14" + "'", str62, "14");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(property64);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(10412477);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        java.util.Date date7 = localDateTime6.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromDateFields(date7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusSeconds((int) (byte) 100);
        int int34 = localDateTime31.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property35 = localDateTime31.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        boolean boolean37 = localDateTime20.isSupported(dateTimeFieldType36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime8.withField(dateTimeFieldType36, 773);
        int int40 = localDateTime4.indexOf(dateTimeFieldType36);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime4.plusDays(7);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime4.plus(readablePeriod43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime4.withPeriodAdded(readablePeriod45, 10481465);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 02:58:05 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:05 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime47);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(861);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(1L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        int int20 = localDateTime4.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        org.joda.time.LocalDateTime localDateTime15 = property5.addWrapFieldToCopy(1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks(356);
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
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        int int10 = localDateTime8.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusMillis(353);
        int int13 = localDateTime12.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 330 + "'", int10 == 330);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(861);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(1L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        int int14 = localDateTime7.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime7.plusDays(16);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime7.plus(readableDuration17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusMinutes(1606272827);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withYearOfEra(202);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2020 + "'", int14 == 2020);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withCenturyOfEra(0);
        int int9 = localDateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withCenturyOfEra(0);
        int int17 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property18 = localDateTime3.monthOfYear();
        boolean boolean19 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime.Property property20 = localDateTime3.yearOfCentury();
        org.joda.time.DurationField durationField21 = property20.getLeapDurationField();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 58 + "'", int9 == 58);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNull(durationField21);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMonths((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readablePeriod7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusDays((int) (short) 0);
        java.lang.String str19 = localDateTime16.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusSeconds((int) (byte) 100);
        int int26 = localDateTime23.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property27 = localDateTime23.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property27.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property27.getFieldType();
        int int30 = localDateTime16.get(dateTimeFieldType29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime6.property(dateTimeFieldType29);
        boolean boolean32 = localDateTime5.isSupported(dateTimeFieldType29);
        java.util.Date date33 = localDateTime5.toDate();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime5.minusMonths(501);
        int int36 = localDateTime35.getHourOfDay();
        java.util.Date date37 = localDateTime35.toDate();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2001-11-25T02:58:06.047" + "'", str19, "2001-11-25T02:58:06.047");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2001 + "'", int30 == 2001);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Tue Mar 25 02:58:07 UTC 2025");
        org.junit.Assert.assertNotNull(localDateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Sat Jun 25 02:58:07 UTC 1983");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(1L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        long long15 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        java.util.Locale locale17 = null;
        org.joda.time.LocalDateTime localDateTime18 = property2.setCopy("33", locale17);
        int int19 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField20 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999 + "'", int19 == 999);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("22");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusDays(1970);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withWeekyear(53);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withCenturyOfEra(1920000);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.secondOfMinute();
        java.lang.String str12 = property11.getAsString();
        org.joda.time.DurationField durationField13 = property11.getDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property11.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime21 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        java.util.Date date26 = localDateTime25.toDate();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withYearOfCentury(1);
        int int32 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime23.withFields((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime39 = property38.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusSeconds((int) (byte) 100);
        int int42 = localDateTime39.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property43 = localDateTime39.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property43.getFieldType();
        boolean boolean45 = localDateTime28.isSupported(dateTimeFieldType44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime16.property(dateTimeFieldType44);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime8.withField(dateTimeFieldType44, 10433965);
        org.joda.time.DateTime dateTime49 = localDateTime48.toDateTime();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray52 = localDateTime51.getFields();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusSeconds(10412477);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        java.util.Date date57 = localDateTime56.toDate();
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.fromDateFields(date57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = property61.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime63 = property61.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(dateTimeZone66);
        java.util.Date date68 = localDateTime67.toDate();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(dateTimeZone69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime70.withYearOfCentury(1);
        int int74 = localDateTime67.compareTo((org.joda.time.ReadablePartial) localDateTime70);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime70.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime65.withFields((org.joda.time.ReadablePartial) localDateTime70);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(dateTimeZone78);
        org.joda.time.LocalDateTime.Property property80 = localDateTime79.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime81 = property80.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.plusSeconds((int) (byte) 100);
        int int84 = localDateTime81.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property85 = localDateTime81.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = property85.getFieldType();
        boolean boolean87 = localDateTime70.isSupported(dateTimeFieldType86);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime58.withField(dateTimeFieldType86, 773);
        int int90 = localDateTime54.indexOf(dateTimeFieldType86);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime48.withField(dateTimeFieldType86, 74);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "6" + "'", str12, "6");
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed Nov 25 02:58:06 UTC 2020");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeFieldArray52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed Nov 25 02:58:06 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(date68);
// flaky:         org.junit.Assert.assertEquals(date68.toString(), "Wed Nov 25 02:58:06 UTC 2020");
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localDateTime73);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(dateTimeFieldType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(localDateTime89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(localDateTime92);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime15.isSupported(durationFieldType16);
        int[] intArray18 = localDateTime15.getValues();
        org.joda.time.Chronology chronology19 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plus(readablePeriod21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[99, 12, 25, 10715498]");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(861);
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
        int int29 = localDateTime0.getDayOfWeek();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = localDateTime0.toString(dateTimeFormatter30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfSecond();
        org.joda.time.DateTimeField[] dateTimeFieldArray40 = localDateTime38.getFields();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.minusSeconds(10449321);
        boolean boolean43 = localDateTime0.isAfter((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime0.withYearOfEra(321);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime0.plusYears(10602366);
        int int48 = localDateTime0.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 546 + "'", int5 == 546);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 02:58:06 UTC 2020");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2020 + "'", int28 == 2020);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T02:58:06.546" + "'", str31, "2020-11-25T02:58:06.546");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldArray40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeField dateTimeField11 = property5.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        int int9 = localDateTime8.getSecondOfMinute();
        int int10 = localDateTime8.getMillisOfDay();
        int int11 = localDateTime8.getEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = property8.getDifference(readableInstant9);
        long long11 = property8.remainder();
        org.joda.time.LocalDateTime localDateTime12 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMonths(100);
        int int15 = localDateTime14.size();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withDurationAdded(readableDuration16, 53);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.secondOfMinute();
        java.lang.String str22 = property21.getAsString();
        org.joda.time.DurationField durationField23 = property21.getDurationField();
        org.joda.time.LocalDateTime localDateTime24 = property21.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundHalfEvenCopy();
        boolean boolean27 = localDateTime18.isAfter((org.joda.time.ReadablePartial) localDateTime26);
        boolean boolean28 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.monthOfYear();
        boolean boolean31 = property29.equals((java.lang.Object) "489");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6" + "'", str22, "6");
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusHours(22);
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
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        int int14 = localDateTime12.getYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMillisOfDay(10412477);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime12.withField(dateTimeFieldType21, (int) (byte) 0);
        org.joda.time.LocalDateTime.Property property24 = localDateTime1.property(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2020 + "'", int14 == 2020);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        java.lang.String str8 = property2.getName();
        org.joda.time.LocalDateTime localDateTime10 = property2.addWrapFieldToCopy((-1));
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear(25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfSecond(10615829);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10615829 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millisOfSecond" + "'", str8, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withDurationAdded(readableDuration7, 19);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withDurationAdded(readableDuration10, 10594509);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("22");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays(66);
        int[] intArray4 = localDateTime1.getValues();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[22, 1, 1, 0]");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        java.lang.String str10 = localDateTime8.toString();
        java.util.Date date11 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromDateFields(date11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2029-03-25T02:58:07.164" + "'", str10, "2029-03-25T02:58:07.164");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Sun Mar 25 02:58:07 UTC 2029");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusMillis(470);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime4.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusHours(814);
        int int8 = localDateTime7.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 768 + "'", int8 == 768);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        java.lang.String str3 = property2.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "millisOfSecond" + "'", str3, "millisOfSecond");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        java.lang.String str10 = localDateTime8.toString();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2029-03-25T02:58:07.325" + "'", str10, "2029-03-25T02:58:07.325");
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        int int7 = localDateTime6.getMonthOfYear();
        java.util.Date date8 = localDateTime6.toDate();
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfYear();
        int int10 = localDateTime6.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 02:58:07 UTC 2020");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withCenturyOfEra(0);
        int int9 = localDateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withCenturyOfEra(0);
        int int17 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property18 = localDateTime3.monthOfYear();
        boolean boolean19 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        java.util.Date date22 = localDateTime21.toDate();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYearOfCentury(1);
        int int28 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime21.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant34 = null;
        long long35 = property33.getDifferenceAsLong(readableInstant34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(1L);
        int int44 = localDateTime43.getSecondOfMinute();
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime();
        long long46 = property41.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime45);
        long long47 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.LocalDateTime localDateTime48 = property33.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime49 = property33.withMaximumValue();
        int int50 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = localDateTime49.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime49.toDateTime(dateTimeZone52);
        int int54 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime.Property property55 = localDateTime49.dayOfWeek();
        int int56 = localDateTime49.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 58 + "'", int9 == 58);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Wed Nov 25 02:58:07 UTC 2020");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 11651L + "'", long46 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1606273087453L + "'", long47 == 1606273087453L);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(property55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 58 + "'", int56 == 58);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(861);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime6.getFields();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusSeconds(10412477);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        java.util.Date date12 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = property16.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        java.util.Date date23 = localDateTime22.toDate();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYearOfCentury(1);
        int int29 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusSeconds((int) (byte) 100);
        int int39 = localDateTime36.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property40 = localDateTime36.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property40.getFieldType();
        boolean boolean42 = localDateTime25.isSupported(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime13.withField(dateTimeFieldType41, 773);
        int int45 = localDateTime9.indexOf(dateTimeFieldType41);
        int int46 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        int int47 = localDateTime9.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime9.plusDays(10533618);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime9.plus(readableDuration50);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Wed Nov 25 02:58:07 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed Nov 25 02:58:07 UTC 2020");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        int int4 = property2.getMaximumValueOverall();
        int int5 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 999 + "'", int4 == 999);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDurationAdded(readableDuration3, 10459929);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekyear(238);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = property10.getLocalDateTime();
        int int13 = property10.getMinimumValue();
        org.joda.time.DurationField durationField14 = property10.getDurationField();
        org.joda.time.LocalDateTime localDateTime16 = property10.addToCopy(43);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withSecondOfMinute(0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.minus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withPeriodAdded(readablePeriod32, 330);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        java.util.Date date37 = localDateTime36.toDate();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withYearOfCentury(1);
        int int43 = localDateTime36.compareTo((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plusYears((int) (byte) 10);
        int int46 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime31.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime31.withHourOfDay(1);
        org.joda.time.Chronology chronology50 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime16, chronology50);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 881, chronology50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(1606273061, 2004, 321, 922, 527, 567, 10453137, chronology50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 922 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Wed Nov 25 02:58:07 UTC 2020");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(chronology50);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        int int3 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(1L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        long long14 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        int int15 = property2.compareTo((org.joda.time.ReadableInstant) dateTime13);
        boolean boolean16 = property2.isLeap();
        org.joda.time.LocalDateTime localDateTime18 = property2.addWrapFieldToCopy(1901);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = localDateTime18.getFields();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withMillisOfDay(16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11651L + "'", long14 == 11651L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        org.joda.time.LocalDateTime localDateTime8 = property2.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = localDateTime8.getField(2237);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2237");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = property11.getDifference(readableInstant12);
        long long14 = property11.remainder();
        java.lang.String str15 = property11.getAsShortText();
        org.joda.time.DurationField durationField16 = property11.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime18 = property11.addToCopy((long) (byte) 1);
        int int19 = property11.getMinimumValueOverall();
        int int20 = property11.getMaximumValue();
        java.util.Locale locale22 = null;
        org.joda.time.LocalDateTime localDateTime23 = property11.setCopy("802", locale22);
        boolean boolean24 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime23);
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
        org.joda.time.LocalDateTime localDateTime59 = localDateTime28.withField(dateTimeFieldType56, 773);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.hourOfDay();
        org.joda.time.LocalDateTime.Property property69 = localDateTime67.hourOfDay();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.minusSeconds(19);
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(1L);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.minuteOfHour();
        int int75 = property74.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime(dateTimeZone76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property81 = localDateTime80.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime(1L);
        int int84 = localDateTime83.getSecondOfMinute();
        org.joda.time.DateTime dateTime85 = localDateTime83.toDateTime();
        long long86 = property81.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime85);
        int int87 = property74.compareTo((org.joda.time.ReadableInstant) dateTime85);
        boolean boolean88 = property74.isLeap();
        java.util.Locale locale89 = null;
        int int90 = property74.getMaximumTextLength(locale89);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = property74.getFieldType();
        org.joda.time.LocalDateTime.Property property92 = localDateTime71.property(dateTimeFieldType91);
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = property92.getFieldType();
        org.joda.time.LocalDateTime.Property property94 = localDateTime59.property(dateTimeFieldType93);
        int int95 = localDateTime8.indexOf(dateTimeFieldType93);
        int int96 = localDateTime8.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "970" + "'", str6, "970");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "970" + "'", str15, "970");
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 999 + "'", int20 == 999);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Wed Nov 25 02:58:07 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Wed Nov 25 02:58:07 UTC 2020");
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
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 59 + "'", int75 == 59);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 11651L + "'", long86 == 11651L);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType91);
        org.junit.Assert.assertNotNull(property92);
        org.junit.Assert.assertNotNull(dateTimeFieldType93);
        org.junit.Assert.assertNotNull(property94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 2020 + "'", int96 == 2020);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        java.lang.String str8 = property2.getName();
        org.joda.time.LocalDateTime localDateTime10 = property2.addWrapFieldToCopy((-1));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDateTime10.getFieldTypes();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime10.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millisOfSecond" + "'", str8, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withPeriodAdded(readablePeriod10, 973);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2001-11-25T02:56:58.798", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        int int3 = localDateTime2.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusDays(637);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.withWeekyear(20);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.plusMonths(751);
        org.joda.time.Chronology chronology20 = localDateTime1.getChronology();
        int int21 = localDateTime1.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime1.withWeekOfWeekyear(314);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 314 for weekOfWeekyear must be in the range [1,53]");
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
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        int int4 = localDateTime1.getSecondOfMinute();
        int int5 = localDateTime1.getCenturyOfEra();
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withDurationAdded(readableDuration14, 19);
        int int17 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withWeekyear(10599411);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property8.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3" + "'", str10, "3");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears((int) (byte) 100);
        java.lang.String str7 = localDateTime6.toString();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.millisOfSecond();
        long long9 = property8.remainder();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property8.getAsShortText(locale10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1901-11-25T02:58:08.533" + "'", str7, "1901-11-25T02:58:08.533");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "533" + "'", str11, "533");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        org.joda.time.LocalDateTime.Property property19 = localDateTime6.dayOfYear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime6.plusDays(685);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:08 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        java.util.Date date17 = localDateTime16.toDate();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        int int23 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusSeconds((int) (byte) 100);
        int int33 = localDateTime30.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property34 = localDateTime30.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property34.getFieldType();
        boolean boolean36 = localDateTime19.isSupported(dateTimeFieldType35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime7.property(dateTimeFieldType35);
        org.joda.time.LocalDateTime localDateTime39 = property37.addToCopy(963);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int42 = localDateTime39.getValue(10532917);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10532917");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Wed Nov 25 02:58:08 UTC 2020");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusWeeks(10481313);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withYearOfEra(721);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withYear(653);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusSeconds(23);
        java.util.Date date8 = localDateTime7.toDate();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromDateFields(date8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 02:58:32 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readableDuration5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localDateTime4.isSupported(durationFieldType7);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusYears(19);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMonths((int) ' ');
        int int17 = localDateTime13.getWeekyear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusMinutes(58);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "919" + "'", str6, "919");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2001 + "'", int17 == 2001);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withDurationAdded(readableDuration17, 10677641);
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
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime5.withTime(921, 2237, 62, 16420852);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 921 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfFloorCopy();
        int int7 = localDateTime6.getDayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromDateFields(date2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMillis(16393350);
        int int8 = localDateTime5.getCenturyOfEra();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:09 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears(10433965);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = property14.getDifference(readableInstant15);
        long long17 = property14.remainder();
        java.lang.String str18 = property14.getAsShortText();
        org.joda.time.DurationField durationField19 = property14.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime20 = property14.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime21 = property14.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusYears(10433965);
        boolean boolean24 = localDateTime11.isEqual((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withYear(2237);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "195" + "'", str6, "195");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "195" + "'", str18, "195");
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDateTime26);
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
        int int5 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy("33");
        org.joda.time.DurationField durationField8 = property2.getDurationField();
        int int9 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9" + "'", str3, "9");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusDays(146);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.plusMonths(542);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = localDateTime12.getFields();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusSeconds(10412477);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromDateFields(date18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = property22.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        java.util.Date date29 = localDateTime28.toDate();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYearOfCentury(1);
        int int35 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime26.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusSeconds((int) (byte) 100);
        int int45 = localDateTime42.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property46 = localDateTime42.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        boolean boolean48 = localDateTime31.isSupported(dateTimeFieldType47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime19.withField(dateTimeFieldType47, 773);
        int int51 = localDateTime15.indexOf(dateTimeFieldType47);
        org.joda.time.LocalDateTime.Property property52 = localDateTime10.property(dateTimeFieldType47);
        int int53 = localDateTime10.getDayOfYear();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:09 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Wed Nov 25 02:58:09 UTC 2020");
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20 + "'", int53 == 20);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = localDateTime6.toDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.minuteOfHour();
        int int10 = localDateTime6.getMillisOfSecond();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime6.toString("2001-11-25T02:56:03.337", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 441 + "'", int10 == 441);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        int int10 = localDateTime8.getDayOfYear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 330 + "'", int10 == 330);
        org.junit.Assert.assertNotNull(property11);
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
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        int int8 = property2.get();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMillis(0);
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime();
        int int18 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime13.toDateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property22 = localDateTime13.property(dateTimeFieldType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 498 + "'", int8 == 498);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDurationAdded(readableDuration10, 53);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.minusMonths(19);
        org.joda.time.LocalDateTime.Property property15 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime8.withWeekyear(2);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMillis(10583727);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(56, 100, 10594509, 374, 55, 114, 10537498);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 374 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        java.lang.String str12 = property11.getName();
        java.util.Locale locale13 = null;
        int int14 = property11.getMaximumShortTextLength(locale13);
        int int15 = property11.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime17 = property11.addToCopy((long) 10593346);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "yearOfEra" + "'", str12, "yearOfEra");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusMinutes(10411969);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plus(readablePeriod5);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy(43);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute(0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = property13.roundCeilingCopy();
        java.lang.String str16 = property13.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[dayOfMonth]" + "'", str16, "Property[dayOfMonth]");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays((int) (short) 0);
        boolean boolean16 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.plusMinutes(10412477);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime5.withMinuteOfHour(10446718);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10446718 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears(10433965);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withCenturyOfEra(19);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime9.getFields();
        int int15 = localDateTime9.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "978" + "'", str6, "978");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.DurationField durationField11 = property8.getDurationField();
        org.joda.time.LocalDateTime localDateTime12 = property8.roundFloorCopy();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3" + "'", str10, "3");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 5);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(48);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusMonths(2);
        org.joda.time.DateTimeField dateTimeField12 = localDateTime1.getField(0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withCenturyOfEra(0);
        int int12 = localDateTime6.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withCenturyOfEra(0);
        int int20 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime.Property property21 = localDateTime6.monthOfYear();
        boolean boolean22 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime6);
        int int23 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        java.util.Locale locale24 = null;
        java.lang.String str25 = property2.getAsShortText(locale24);
        org.joda.time.LocalDateTime localDateTime27 = property2.addToCopy((long) 66);
        java.util.Locale locale28 = null;
        java.lang.String str29 = property2.getAsText(locale28);
        org.joda.time.LocalDateTime localDateTime30 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 58 + "'", int12 == 58);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "537" + "'", str25, "537");
        org.junit.Assert.assertNotNull(localDateTime27);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "537" + "'", str29, "537");
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusYears((int) (byte) 10);
        int int27 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime12.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime12.withHourOfDay(1);
        org.joda.time.Chronology chronology31 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        int int33 = localDateTime32.getYear();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withYear((int) '4');
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:10 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2020 + "'", int33 == 2020);
        org.junit.Assert.assertNotNull(localDateTime35);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMillis(999);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        java.util.Date date15 = localDateTime14.toDate();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        int int21 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime14.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant27 = null;
        long long28 = property26.getDifferenceAsLong(readableInstant27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(1L);
        int int37 = localDateTime36.getSecondOfMinute();
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime();
        long long39 = property34.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        long long40 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDateTime localDateTime41 = property26.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime42 = property26.withMaximumValue();
        int int43 = localDateTime23.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime23.getYearOfCentury();
        boolean boolean45 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime.Property property46 = localDateTime23.year();
        org.joda.time.LocalDateTime localDateTime47 = property46.roundFloorCopy();
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.plus(readableDuration49);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed Nov 25 02:58:10 UTC 2020");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 11651L + "'", long39 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1606273090656L + "'", long40 == 1606273090656L);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20 + "'", int44 == 20);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(localDateTime50);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusYears((int) (byte) 10);
        int int27 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = property30.getDifference(readableInstant31);
        long long33 = property30.remainder();
        java.lang.String str34 = property30.getAsShortText();
        org.joda.time.DurationField durationField35 = property30.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime37 = property30.addToCopy((long) (byte) 1);
        int int38 = property30.getMinimumValueOverall();
        int int39 = property30.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime41 = property30.setCopy("733");
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime45 = property44.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime46 = property44.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime47 = property44.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(1L);
        int int50 = localDateTime49.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property51 = localDateTime49.era();
        int int52 = localDateTime49.getSecondOfMinute();
        int int53 = localDateTime49.getCenturyOfEra();
        org.joda.time.DateTime dateTime54 = localDateTime49.toDateTime();
        int int55 = property44.compareTo((org.joda.time.ReadableInstant) dateTime54);
        long long56 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime57 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:10 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "757" + "'", str34, "757");
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 999 + "'", int39 == 999);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 19 + "'", int53 == 19);
        org.junit.Assert.assertNotNull(dateTime54);
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1606273090756L + "'", long56 == 1606273090756L);
        org.junit.Assert.assertNotNull(dateTime57);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("177");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDayOfYear(43);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readablePeriod13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfEra(48);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfWeek();
        boolean boolean18 = localDateTime11.equals((java.lang.Object) property17);
        org.joda.time.LocalDateTime localDateTime19 = property17.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = property17.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMinuteOfHour(10651969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10651969 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.getLocalDateTime();
        int int7 = property4.getMinimumValue();
        org.joda.time.DurationField durationField8 = property4.getDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property4.addToCopy(43);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withSecondOfMinute(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.minus(readablePeriod18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withPeriodAdded(readablePeriod26, 330);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        java.util.Date date31 = localDateTime30.toDate();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYearOfCentury(1);
        int int37 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.plusYears((int) (byte) 10);
        int int40 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime25.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime25.withHourOfDay(1);
        org.joda.time.Chronology chronology44 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime10, chronology44);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 10412477, chronology44);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(1606272997417L, chronology44);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 02:58:11 UTC 2020");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(chronology44);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusWeeks(997);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.minusMinutes((int) (short) -1);
        boolean boolean21 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        java.util.Date date24 = localDateTime23.toDate();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.fromDateFields(date24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime30 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        java.util.Date date35 = localDateTime34.toDate();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(1);
        int int41 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime32.withFields((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusSeconds((int) (byte) 100);
        int int51 = localDateTime48.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property52 = localDateTime48.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property52.getFieldType();
        boolean boolean54 = localDateTime37.isSupported(dateTimeFieldType53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime25.withField(dateTimeFieldType53, 773);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDateTime56.toDateTime(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime14.centuryOfEra();
        int int62 = property61.getMinimumValue();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10691147 + "'", int2 == 10691147);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Wed Nov 25 02:58:11 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Wed Nov 25 02:58:11 UTC 2020");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        int int10 = property9.getMinimumValue();
        java.lang.String str11 = property9.getAsText();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property9.getAsText(locale12);
        org.joda.time.LocalDateTime localDateTime14 = property9.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2120" + "'", str11, "2120");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2120" + "'", str13, "2120");
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        boolean boolean5 = property2.equals((java.lang.Object) "2001-11-25T02:53:34.725");
        org.joda.time.LocalDateTime localDateTime6 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfEra(3);
        int int18 = localDateTime15.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property20 = localDateTime12.hourOfDay();
        boolean boolean22 = property20.equals((java.lang.Object) "2020-11-25T02:56:06.243");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2020 + "'", int18 == 2020);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withMillisOfDay(10481313);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusWeeks(556);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.year();
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.yearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withPeriodAdded(readablePeriod20, 330);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = localDateTime22.isSupported(durationFieldType23);
        int[] intArray25 = localDateTime22.getValues();
        org.joda.time.Chronology chronology26 = localDateTime22.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(175, 40, 57, 356, 10594509, 16, 10583113, chronology26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 356 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[99, 12, 25, 10715565]");
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(10412477);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        java.util.Date date7 = localDateTime6.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromDateFields(date7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusSeconds((int) (byte) 100);
        int int34 = localDateTime31.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property35 = localDateTime31.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        boolean boolean37 = localDateTime20.isSupported(dateTimeFieldType36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime8.withField(dateTimeFieldType36, 773);
        int int40 = localDateTime4.indexOf(dateTimeFieldType36);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime4.plusDays(7);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime4.plus(readablePeriod43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime53 = localDateTime46.minusMinutes((int) (short) -1);
        boolean boolean54 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime56 = localDateTime4.withYearOfCentury(736);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 736 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 02:58:11 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:11 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.withWeekyear(20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField19 = localDateTime1.getField(43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 43");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusWeeks(997);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.minusMinutes((int) (short) -1);
        boolean boolean21 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        java.util.Date date24 = localDateTime23.toDate();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.fromDateFields(date24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime30 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        java.util.Date date35 = localDateTime34.toDate();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(1);
        int int41 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime32.withFields((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusSeconds((int) (byte) 100);
        int int51 = localDateTime48.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property52 = localDateTime48.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property52.getFieldType();
        boolean boolean54 = localDateTime37.isSupported(dateTimeFieldType53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime25.withField(dateTimeFieldType53, 773);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDateTime56.toDateTime(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime14.centuryOfEra();
        int int62 = localDateTime14.getWeekyear();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10691717 + "'", int2 == 10691717);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Wed Nov 25 02:58:11 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Wed Nov 25 02:58:11 UTC 2020");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2020 + "'", int62 == 2020);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime();
        int int9 = localDateTime4.getDayOfMonth();
        int int10 = localDateTime4.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2001 + "'", int10 == 2001);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy(43);
        org.joda.time.LocalDateTime localDateTime9 = property2.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = property2.addWrapFieldToCopy(55);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(1L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        long long27 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDateTime localDateTime28 = property13.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime29 = property13.withMaximumValue();
        int int30 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        int int31 = localDateTime10.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime10.minus(readablePeriod32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime10.withDurationAdded(readableDuration34, 10453137);
        int int37 = localDateTime10.getCenturyOfEra();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:11 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1606273091921L + "'", long27 == 1606273091921L);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        org.joda.time.LocalDateTime localDateTime21 = property19.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:12 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        int int5 = localDateTime1.getValue(0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withWeekyear(48);
        int int8 = localDateTime7.getMonthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = property3.getDifference(readableInstant4);
        long long6 = property3.remainder();
        java.lang.String str7 = property3.getAsShortText();
        org.joda.time.Interval interval8 = property3.toInterval();
        java.lang.String str9 = property3.getAsShortText();
        int int10 = property3.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime11 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYear((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.era();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        java.util.Locale locale28 = null;
        int int29 = property26.getMaximumTextLength(locale28);
        int int30 = property26.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minus(readablePeriod32);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(1L);
        int int36 = localDateTime35.getSecondOfMinute();
        org.joda.time.DateTime dateTime37 = localDateTime35.toDateTime();
        org.joda.time.DateTime dateTime38 = localDateTime33.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        long long39 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime40 = localDateTime22.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime22.plusMinutes(10430470);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime22.withCenturyOfEra(99);
        int int45 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.minus(readablePeriod51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withPeriodAdded(readablePeriod59, 330);
        org.joda.time.DurationFieldType durationFieldType62 = null;
        boolean boolean63 = localDateTime61.isSupported(durationFieldType62);
        int[] intArray64 = localDateTime61.getValues();
        org.joda.time.Chronology chronology65 = localDateTime61.getChronology();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime22, chronology65);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) 72, chronology65);
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now(chronology65);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(chronology65);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "246" + "'", str7, "246");
        org.junit.Assert.assertNotNull(interval8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "246" + "'", str9, "246");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray64);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[99, 12, 25, 10715246]");
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(localDateTime68);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusSeconds(861);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minus(readablePeriod29);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(1L);
        int int33 = localDateTime32.getSecondOfMinute();
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime();
        org.joda.time.DateTime dateTime35 = localDateTime30.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        boolean boolean36 = localDateTime27.isAfter((org.joda.time.ReadablePartial) localDateTime30);
        boolean boolean37 = localDateTime22.isEqual((org.joda.time.ReadablePartial) localDateTime30);
        int int38 = localDateTime22.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.minus(readablePeriod44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.withPeriodAdded(readablePeriod52, 330);
        org.joda.time.DurationFieldType durationFieldType55 = null;
        boolean boolean56 = localDateTime54.isSupported(durationFieldType55);
        int[] intArray57 = localDateTime54.getValues();
        org.joda.time.Chronology chronology58 = localDateTime54.getChronology();
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime22, chronology58);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, chronology58);
        org.joda.time.LocalDateTime localDateTime61 = org.joda.time.LocalDateTime.now(chronology58);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.withMonthOfYear((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.minus(readablePeriod64);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2001 + "'", int38 == 2001);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray57);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[99, 12, 25, 10715413]");
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        java.util.Locale locale7 = null;
        org.joda.time.LocalDateTime localDateTime8 = property2.setCopy("984", locale7);
        int int9 = property2.getLeapAmount();
        java.util.Locale locale10 = null;
        int int11 = property2.getMaximumTextLength(locale10);
        org.joda.time.LocalDateTime localDateTime13 = property2.addToCopy((long) 5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusWeeks(10481313);
        java.util.Locale locale10 = null;
        java.lang.String str11 = localDateTime6.toString("489", locale10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "489" + "'", str11, "489");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(10575721);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        java.util.Date date17 = localDateTime16.toDate();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        int int23 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusSeconds((int) (byte) 100);
        int int33 = localDateTime30.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property34 = localDateTime30.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property34.getFieldType();
        boolean boolean36 = localDateTime19.isSupported(dateTimeFieldType35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime7.property(dateTimeFieldType35);
        org.joda.time.LocalDateTime localDateTime39 = property37.addToCopy(963);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(1L);
        int int48 = localDateTime47.getSecondOfMinute();
        org.joda.time.DateTime dateTime49 = localDateTime47.toDateTime();
        long long50 = property45.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        int int51 = property37.compareTo((org.joda.time.ReadableInstant) dateTime49);
        java.lang.String str52 = property37.getAsString();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12" + "'", str3, "12");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Wed Nov 25 02:58:12 UTC 2020");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 11651L + "'", long50 == 11651L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2020" + "'", str52, "2020");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMinuteOfHour(33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMonthOfYear(721);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 721 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        java.lang.String str8 = property2.getName();
        org.joda.time.LocalDateTime localDateTime10 = property2.addWrapFieldToCopy((-1));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDateTime10.getFieldTypes();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.year();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfDay(10691717);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millisOfSecond" + "'", str8, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(10412477);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusDays(997);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        int int8 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMinuteOfHour(0);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
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
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.plusSeconds(501);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 52);
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusYears((int) (byte) 10);
        int int27 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime12.dayOfWeek();
        java.util.Locale locale29 = null;
        int int30 = property28.getMaximumShortTextLength(locale29);
        java.util.Locale locale31 = null;
        int int32 = property28.getMaximumShortTextLength(locale31);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:13 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
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
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        int int10 = localDateTime8.getDayOfYear();
        int int11 = localDateTime8.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDateTime8.toDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays(814);
        boolean boolean17 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 330 + "'", int10 == 330);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10693070 + "'", int11 == 10693070);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusDays(773);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.hourOfDay();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.hourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusSeconds(19);
        int int25 = localDateTime20.getMonthOfYear();
        int int26 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = localDateTime12.withDayOfWeek(305);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 305 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(861);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime6.getFields();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusSeconds(10412477);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        java.util.Date date12 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = property16.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        java.util.Date date23 = localDateTime22.toDate();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYearOfCentury(1);
        int int29 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusSeconds((int) (byte) 100);
        int int39 = localDateTime36.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property40 = localDateTime36.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property40.getFieldType();
        boolean boolean42 = localDateTime25.isSupported(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime13.withField(dateTimeFieldType41, 773);
        int int45 = localDateTime9.indexOf(dateTimeFieldType41);
        int int46 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime57 = property56.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusSeconds((int) (byte) 100);
        int int60 = localDateTime57.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property61 = localDateTime57.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property61.getFieldType();
        boolean boolean63 = localDateTime51.isSupported(dateTimeFieldType62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime0.property(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Wed Nov 25 02:58:13 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed Nov 25 02:58:13 UTC 2020");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(property64);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.getLocalDateTime();
        int int12 = property9.getMinimumValue();
        org.joda.time.DurationField durationField13 = property9.getDurationField();
        org.joda.time.LocalDateTime localDateTime15 = property9.addToCopy(43);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withSecondOfMinute(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.minus(readablePeriod23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withPeriodAdded(readablePeriod31, 330);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        java.util.Date date36 = localDateTime35.toDate();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withYearOfCentury(1);
        int int42 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.plusYears((int) (byte) 10);
        int int45 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime30.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime30.withHourOfDay(1);
        org.joda.time.Chronology chronology49 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime15, chronology49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(931, 985, 894, 678, 12, 10661020, 10691147, chronology49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 678 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Wed Nov 25 02:58:13 UTC 2020");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(chronology49);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = property3.getDifference(readableInstant4);
        long long6 = property3.remainder();
        java.lang.String str7 = property3.getAsShortText();
        org.joda.time.Interval interval8 = property3.toInterval();
        java.lang.String str9 = property3.getAsShortText();
        int int10 = property3.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime11 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYear((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.era();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        java.util.Locale locale28 = null;
        int int29 = property26.getMaximumTextLength(locale28);
        int int30 = property26.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minus(readablePeriod32);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(1L);
        int int36 = localDateTime35.getSecondOfMinute();
        org.joda.time.DateTime dateTime37 = localDateTime35.toDateTime();
        org.joda.time.DateTime dateTime38 = localDateTime33.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        long long39 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime40 = localDateTime22.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime22.plusMinutes(10430470);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime22.withCenturyOfEra(99);
        int int45 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.minus(readablePeriod51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withPeriodAdded(readablePeriod59, 330);
        org.joda.time.DurationFieldType durationFieldType62 = null;
        boolean boolean63 = localDateTime61.isSupported(durationFieldType62);
        int[] intArray64 = localDateTime61.getValues();
        org.joda.time.Chronology chronology65 = localDateTime61.getChronology();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime22, chronology65);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) 23, chronology65);
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now(chronology65);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "435" + "'", str7, "435");
        org.junit.Assert.assertNotNull(interval8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "435" + "'", str9, "435");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray64);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[99, 12, 25, 10715435]");
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(localDateTime68);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (short) 100);
        int int12 = localDateTime9.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "645" + "'", str6, "645");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMinutes(11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusDays(2029);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        org.joda.time.DurationField durationField15 = property14.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNull(durationField15);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        org.joda.time.LocalDateTime localDateTime10 = property7.setCopy("190");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        org.joda.time.DurationField durationField12 = property11.getRangeDurationField();
        org.joda.time.DurationField durationField13 = property11.getLeapDurationField();
        int int14 = property11.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.minus(readablePeriod20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withPeriodAdded(readablePeriod28, 330);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        java.util.Date date33 = localDateTime32.toDate();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYearOfCentury(1);
        int int39 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.plusYears((int) (byte) 10);
        int int42 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime27.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime27.withHourOfDay(1);
        int int46 = localDateTime45.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.plusMonths(10480784);
        int int49 = localDateTime45.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime50 = localDateTime45.toDateTime();
        int int51 = property11.compareTo((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:58:13.822" + "'", str10, "2001-11-25T02:58:13.822");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertNull(durationField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Wed Nov 25 02:58:13 UTC 2020");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMonths((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds(861);
        int int11 = localDateTime6.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        java.util.Date date14 = localDateTime13.toDate();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        int int20 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusSeconds((int) (byte) 100);
        int int29 = localDateTime26.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property30 = localDateTime26.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime22.withField(dateTimeFieldType31, 10);
        int int34 = localDateTime6.get(dateTimeFieldType31);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray35 = localDateTime6.getFieldTypes();
        boolean boolean36 = localDateTime3.isEqual((org.joda.time.ReadablePartial) localDateTime6);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime3.plusWeeks(599);
        int int39 = localDateTime38.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 953 + "'", int11 == 953);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 02:58:13 UTC 2020");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2020 + "'", int34 == 2020);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDateTime38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10694000 + "'", int39 == 10694000);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2001-11-25T02:55:31.095", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusSeconds(2001);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.plusMonths(10403113);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withEra(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
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
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        java.lang.String str10 = localDateTime8.toString();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusMinutes(0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.minusMillis(10459929);
        org.joda.time.LocalDateTime.Property property15 = localDateTime8.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2029-03-25T02:58:14.071" + "'", str10, "2029-03-25T02:58:14.071");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField(72);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 72");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusMillis(3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withDurationAdded(readableDuration5, 794);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.year();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        int int7 = localDateTime6.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(645);
        boolean boolean11 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime6);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.minusSeconds(10599411);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10694164 + "'", int7 == 10694164);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusYears((int) (byte) 10);
        int int27 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime12.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime12.withHourOfDay(1);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minus(readablePeriod31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:14 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(861);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 10);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusWeeks(814);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.secondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime6 = property2.getLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readablePeriod7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, dateTimeZone9);
        int int11 = localDateTime6.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusDays(22);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime10, dateTimeZone12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 11, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.year();
        int int4 = property3.getLeapAmount();
        int int5 = property3.get();
        int int6 = property3.getMaximumValue();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 292278993 + "'", int6 == 292278993);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minus(readablePeriod10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds(861);
        int int14 = localDateTime9.getMillisOfSecond();
        int int15 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromDateFields(date18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = property22.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        java.util.Date date29 = localDateTime28.toDate();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYearOfCentury(1);
        int int35 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime26.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusSeconds((int) (byte) 100);
        int int45 = localDateTime42.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property46 = localDateTime42.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        boolean boolean48 = localDateTime31.isSupported(dateTimeFieldType47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime19.withField(dateTimeFieldType47, 773);
        int int51 = localDateTime9.get(dateTimeFieldType47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime53 = localDateTime9.withEra(10470405);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10470405 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 546 + "'", int14 == 546);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:14 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Wed Nov 25 02:58:14 UTC 2020");
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2020 + "'", int51 == 2020);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(1L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfCentury(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273094605L + "'", long16 == 1606273094605L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy((long) (byte) 1);
        int int10 = property2.getMinimumValueOverall();
        int int11 = property2.getMaximumValue();
        java.util.Locale locale13 = null;
        org.joda.time.LocalDateTime localDateTime14 = property2.setCopy("802", locale13);
        java.lang.String str15 = property2.getName();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property2.getAsText(locale16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "669" + "'", str6, "669");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 999 + "'", int11 == 999);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "millisOfSecond" + "'", str15, "millisOfSecond");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "669" + "'", str17, "669");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        int int4 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localDateTime1.isSupported(durationFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withYearOfEra(4);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withYear(10646384);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYear(46599073);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 10449321);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.year();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = property2.setCopy("2020-11-25T02:58:06.546", locale4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T02:58:06.546\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.DurationField durationField12 = property11.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property11.setCopy("802");
        org.joda.time.LocalDateTime localDateTime16 = property11.setCopy(9);
        org.joda.time.LocalDateTime localDateTime18 = property11.setCopy("831");
        int int19 = localDateTime18.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusWeeks(997);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMillis(10430470);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime();
        int int13 = localDateTime9.getMillisOfDay();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10694906 + "'", int2 == 10694906);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T00:04:24.436" + "'", str11, "2020-11-25T00:04:24.436");
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 264436 + "'", int13 == 264436);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        boolean boolean5 = property2.equals((java.lang.Object) "2001-11-25T02:53:34.725");
        long long6 = property2.remainder();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property2.setCopy("2001-11-25T02:55:56.725", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2001-11-25T02:55:56.725\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusWeeks(997);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.minusMinutes((int) (short) -1);
        boolean boolean21 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime.Property property22 = localDateTime14.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime23 = property22.withMaximumValue();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10695003 + "'", int2 == 10695003);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        java.lang.String str11 = property10.toString();
        org.joda.time.Interval interval12 = property10.toInterval();
        boolean boolean13 = localDateTime4.equals((java.lang.Object) property10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.minus(readablePeriod14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.minusMonths(10440722);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[dayOfMonth]" + "'", str11, "Property[dayOfMonth]");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        int int9 = localDateTime8.getSecondOfMinute();
        boolean boolean11 = localDateTime8.equals((java.lang.Object) (-1.0f));
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.secondOfMinute();
        java.lang.String str13 = property12.getAsString();
        org.joda.time.LocalDateTime localDateTime14 = property12.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDurationAdded(readableDuration10, 53);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.minusMonths(19);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = property17.getDifference(readableInstant18);
        long long20 = property17.remainder();
        java.lang.String str21 = property17.getAsShortText();
        org.joda.time.Interval interval22 = property17.toInterval();
        java.lang.String str23 = property17.getAsShortText();
        int int24 = property17.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime25 = property17.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withYear((int) 'a');
        int int28 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = localDateTime27.toString(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "241" + "'", str21, "241");
        org.junit.Assert.assertNotNull(interval22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "241" + "'", str23, "241");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0097-11-25T02:58:15.241" + "'", str30, "0097-11-25T02:58:15.241");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606272807238L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withCenturyOfEra(0);
        int int9 = localDateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withCenturyOfEra(0);
        int int17 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property18 = localDateTime3.monthOfYear();
        boolean boolean19 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime3.withCenturyOfEra(999);
        int int22 = localDateTime21.getYear();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 58 + "'", int9 == 58);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99920 + "'", int22 == 99920);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusMillis(3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        int int6 = localDateTime4.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(1L);
        boolean boolean10 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.centuryOfEra();
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
        org.joda.time.LocalDateTime localDateTime29 = localDateTime13.minusMinutes(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime13.hourOfDay();
        boolean boolean31 = localDateTime9.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime.Property property32 = localDateTime13.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 58 + "'", int19 == 58);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfEvenCopy();
        java.lang.String str4 = property2.getName();
        org.joda.time.LocalDateTime localDateTime6 = property2.addToCopy(10575721);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "millisOfSecond" + "'", str4, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(1L);
        boolean boolean10 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.centuryOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.monthOfYear();
        java.lang.String str13 = property12.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[monthOfYear]" + "'", str13, "Property[monthOfYear]");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withDurationAdded(readableDuration7, 19);
        java.lang.String str10 = localDateTime9.toString();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusMinutes(10482000);
        int[] intArray13 = localDateTime12.getValues();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusDays(0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withEra(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T02:58:15.540" + "'", str10, "2020-11-25T02:58:15.540");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2040, 10, 30, 25095540]");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        int int6 = localDateTime4.getYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusDays((int) (short) 0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(861);
        int int5 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withMillisOfDay((int) (short) 100);
        int int8 = localDateTime0.getYearOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime0.weekyear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withDayOfYear((int) 'a');
        int int18 = localDateTime12.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.minus(readablePeriod24);
        boolean boolean26 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minus(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusDays((int) (short) 0);
        java.lang.String str40 = localDateTime37.toString();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusSeconds((int) (byte) 100);
        int int47 = localDateTime44.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property48.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property48.getFieldType();
        int int51 = localDateTime37.get(dateTimeFieldType50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime27.property(dateTimeFieldType50);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime25.withField(dateTimeFieldType50, 963);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime0.withField(dateTimeFieldType50, 768);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 661 + "'", int5 == 661);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2001-11-25T02:58:15.661" + "'", str40, "2001-11-25T02:58:15.661");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2001 + "'", int51 == 2001);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.lang.String str4 = property2.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = localDateTime11.getFields();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusSeconds(10449321);
        int int16 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withCenturyOfEra(0);
        int int24 = localDateTime18.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withCenturyOfEra(0);
        int int32 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime18.withWeekyear(20);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime18.plusMonths(751);
        org.joda.time.Chronology chronology37 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime11, chronology37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.yearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "826" + "'", str4, "826");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 58 + "'", int24 == 58);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        int int10 = property2.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusDays(264436);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "911" + "'", str6, "911");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "911" + "'", str8, "911");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(1L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime19 = property2.getLocalDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273095933L + "'", long16 == 1606273095933L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra((int) (byte) 10);
        java.util.Date date3 = localDateTime0.toDate();
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.dayOfYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Wed Nov 25 02:58:16 UTC 2020");
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy(59);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears(178);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusSeconds((int) (byte) 100);
        int int17 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.withField(dateTimeFieldType19, 10);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfMonth();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property22.getAsText(locale23);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:16 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "29" + "'", str24, "29");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy(43);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute(0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusMinutes((-26771215));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDateTime1.toDateTime(dateTimeZone4);
        int int6 = localDateTime1.getDayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy(43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localDateTime8.toString(dateTimeFormatter9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusDays(10442274);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusSeconds(10412477);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T02:58:59.341" + "'", str10, "2020-11-25T02:58:59.341");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfEvenCopy();
        java.lang.String str4 = property2.getAsShortText();
        org.joda.time.LocalDateTime localDateTime6 = property2.addToCopy(353);
        org.joda.time.LocalDateTime localDateTime7 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = property10.getDifference(readableInstant11);
        long long13 = property10.remainder();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = property10.getDifference(readableInstant14);
        java.lang.String str16 = property10.getName();
        org.joda.time.LocalDateTime localDateTime18 = property10.addWrapFieldToCopy((-1));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localDateTime18.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusWeeks(99);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withYear(773);
        org.joda.time.LocalDateTime.Property property24 = localDateTime18.centuryOfEra();
        boolean boolean25 = localDateTime7.isAfter((org.joda.time.ReadablePartial) localDateTime18);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "433" + "'", str4, "433");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "millisOfSecond" + "'", str16, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 653, dateTimeZone1);
        int int3 = localDateTime2.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 653 + "'", int3 == 653);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 35);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withPeriodAdded(readablePeriod3, 794);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withDayOfYear(225);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606272820537L, chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfCentury();
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusYears((int) (byte) 10);
        int int27 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        java.util.Date date30 = localDateTime29.toDate();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.fromDateFields(date30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime36 = property34.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        java.util.Date date41 = localDateTime40.toDate();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withYearOfCentury(1);
        int int47 = localDateTime40.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime38.withFields((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime54 = property53.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusSeconds((int) (byte) 100);
        int int57 = localDateTime54.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property58 = localDateTime54.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property58.getFieldType();
        boolean boolean60 = localDateTime43.isSupported(dateTimeFieldType59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime31.withField(dateTimeFieldType59, 773);
        int int63 = localDateTime26.indexOf(dateTimeFieldType59);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime26.minusMonths(938);
        org.joda.time.LocalDateTime.Property property66 = localDateTime26.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(dateTimeZone67);
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.minusYears((int) (byte) 100);
        java.lang.String str74 = localDateTime73.toString();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.minusSeconds(74);
        int int77 = localDateTime76.getDayOfYear();
        int int78 = localDateTime26.compareTo((org.joda.time.ReadablePartial) localDateTime76);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:16 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Wed Nov 25 02:58:16 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Wed Nov 25 02:58:16 UTC 2020");
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "1901-11-25T02:58:16.828" + "'", str74, "1901-11-25T02:58:16.828");
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 329 + "'", int77 == 329);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
    }
}
