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
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime0.withDurationAdded((long) ' ', 10);
        org.joda.time.DateTime.Property property4 = dateTime3.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        int int14 = dateTime12.getDayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime24 = dateTime22.minusYears(1);
        org.joda.time.LocalDateTime localDateTime25 = dateTime22.toLocalDateTime();
        org.joda.time.DateTime dateTime27 = dateTime22.minusMonths((int) (byte) 1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    @Ignore
  public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        boolean boolean14 = dateTime12.isBefore(0L);
        org.joda.time.DateTime dateTime16 = dateTime12.withYearOfCentury(0);
        int int17 = dateTime16.getSecondOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime(chronology21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime20.withDurationAdded(readableDuration23, 100);
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime29 = dateTime25.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate30 = dateTime29.toLocalDate();
        org.joda.time.DateTime dateTime32 = dateTime29.minusDays((int) '4');
        int int33 = dateTime29.getMinuteOfHour();
        boolean boolean34 = dateTime16.isBefore((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.minuteOfDay();
        java.lang.Object obj39 = null;
        boolean boolean40 = property38.equals(obj39);
        org.joda.time.DateTimeField dateTimeField41 = property38.getField();
        org.joda.time.DurationField durationField42 = property38.getRangeDurationField();
        long long43 = property38.remainder();
        org.joda.time.DateTime dateTime44 = property38.roundHalfEvenCopy();
        int int45 = property38.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property38.getFieldType();
        org.joda.time.DateTime dateTime48 = dateTime16.withField(dateTimeFieldType46, 0);
        org.joda.time.ReadableInstant readableInstant49 = null;
        boolean boolean50 = dateTime48.isEqual(readableInstant49);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14400 + "'", int17 == 14400);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1439 + "'", int45 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        long long14 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withPeriodAdded(readablePeriod15, 59);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks((-292275054));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    @Ignore
  public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        boolean boolean16 = dateTime12.isEqualNow();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        java.lang.String str21 = property20.getAsText();
        org.joda.time.DateTime dateTime22 = property20.withMaximumValue();
        org.joda.time.DateTime dateTime23 = property20.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        org.joda.time.DateTime dateTime25 = dateTime12.toDateTime(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.era();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    @Ignore
  public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime11.plus(readableDuration29);
        org.joda.time.DateTime.Property property31 = dateTime11.weekyear();
        org.joda.time.DateTime dateTime33 = property31.setCopy((int) (byte) 100);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    @Ignore
  public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        java.util.GregorianCalendar gregorianCalendar32 = dateTime31.toGregorianCalendar();
        int int33 = dateTime31.getYearOfCentury();
        org.joda.time.DateTime dateTime35 = dateTime31.minusMinutes(4);
        org.joda.time.DateTime dateTime37 = dateTime31.plus((long) 86398);
        org.joda.time.DateTime dateTime38 = dateTime37.toDateTime();
        int int39 = dateTime37.getMonthOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(gregorianCalendar32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 70 + "'", int33 == 70);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    @Ignore
  public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        int int27 = dateTime11.getYear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 1, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.minus(readableDuration32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        org.joda.time.DateTime.Property property35 = dateTime33.weekyear();
        org.joda.time.DateTimeField dateTimeField36 = property35.getField();
        int int37 = dateTime11.get(dateTimeField36);
        boolean boolean39 = dateTime11.isBefore((long) 14400);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    @Ignore
  public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        java.lang.String str14 = property13.getAsText();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime17.toMutableDateTime();
        int int19 = dateTime17.getDayOfMonth();
        long long20 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime21 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int) (byte) 10);
        long long24 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime23.plusMillis(20);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readablePeriod27);
        java.lang.String str30 = dateTime26.toString("1970");
        long long31 = dateTime26.getMillis();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970" + "'", str30, "1970");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-6047999979L) + "'", long31 == (-6047999979L));
    }

    @Test
    @Ignore
  public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withCenturyOfEra(4);
        java.util.Date date14 = dateTime13.toDate();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 00:00:01 UTC 469");
    }

    @Test
    @Ignore
  public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.plusMonths((-1));
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime15.plus(readableDuration20);
        org.joda.time.DateMidnight dateMidnight22 = dateTime21.toDateMidnight();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight22);
    }

    @Test
    @Ignore
  public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes((int) (byte) -1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 100);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.minus(readableDuration22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) readableDuration22);
        org.joda.time.DateTime.Property property25 = dateTime24.millisOfSecond();
        long long26 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalTime localTime27 = dateTime24.toLocalTime();
        org.joda.time.DateTime dateTime28 = dateTime24.toDateTime();
        org.joda.time.DateTime dateTime29 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime31 = dateTime24.minusMonths(99);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.minus(readableDuration36);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime37.toMutableDateTime();
        org.joda.time.DateTime.Property property39 = dateTime37.weekyear();
        org.joda.time.DateTime.Property property40 = dateTime37.era();
        org.joda.time.DateTime dateTime42 = property40.addWrapFieldToCopy(292278993);
        org.joda.time.DateTime dateTime43 = property40.getDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property40.getFieldType();
        int int45 = dateTime24.get(dateTimeFieldType44);
        int int46 = dateTime2.get(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-18591L) + "'", long26 == (-18591L));
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    @Ignore
  public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime10.withHourOfDay(0);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes(12);
        org.joda.time.DateMidnight dateMidnight15 = dateTime14.toDateMidnight();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.minus(readableDuration20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        org.joda.time.DateTime.Property property23 = dateTime21.weekyear();
        org.joda.time.DateTime dateTime25 = property23.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.minus(readableDuration30);
        int int32 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.minuteOfDay();
        java.lang.String str37 = property36.getAsText();
        org.joda.time.DateTimeField dateTimeField38 = property36.getField();
        int int39 = dateTime28.get(dateTimeField38);
        int int40 = dateTime14.get(dateTimeField38);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 49 + "'", int40 == 49);
    }

    @Test
    @Ignore
  public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime10 = dateTime7.toLocalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = dateTime7.toString(dateTimeFormatter11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfDay();
        java.lang.String str17 = property16.getAsText();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        int int22 = dateTime20.getDayOfMonth();
        long long23 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime24 = property16.withMinimumValue();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.toDateTime(chronology28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded(readableDuration30, 100);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withZone(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = dateTime34.toLocalDateTime();
        org.joda.time.DateTime dateTime36 = dateTime24.withFields((org.joda.time.ReadablePartial) localDateTime35);
        int int37 = dateTime24.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime39 = dateTime24.withYear(4);
        org.joda.time.DateTime dateTime41 = dateTime24.withMillis((long) (byte) 10);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime24.plus(readableDuration42);
        boolean boolean44 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.LocalDateTime localDateTime45 = dateTime7.toLocalDateTime();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 1, chronology47);
        org.joda.time.DateTime.Property property49 = dateTime48.minuteOfDay();
        java.lang.String str50 = property49.getAsText();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (byte) 1, chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime53.toMutableDateTime();
        int int55 = dateTime53.getDayOfMonth();
        long long56 = property49.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime57 = property49.withMinimumValue();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 1, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = dateTime60.toDateTime(chronology61);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.DateTime dateTime65 = dateTime60.withDurationAdded(readableDuration63, 100);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = dateTime65.withZone(dateTimeZone66);
        org.joda.time.LocalDateTime localDateTime68 = dateTime67.toLocalDateTime();
        org.joda.time.DateTime dateTime69 = dateTime57.withFields((org.joda.time.ReadablePartial) localDateTime68);
        int int70 = dateTime57.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime72 = dateTime57.withYear(4);
        org.joda.time.DateTime dateTime74 = dateTime57.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.DateTime dateTime77 = dateTime74.withPeriodAdded(readablePeriod75, (int) (byte) 0);
        org.joda.time.DateTime dateTime79 = dateTime77.plusYears((int) (byte) 0);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime((long) (byte) 1, chronology81);
        org.joda.time.DateTime.Property property83 = dateTime82.minuteOfDay();
        java.lang.String str84 = property83.getAsText();
        org.joda.time.DateTime dateTime85 = property83.roundHalfEvenCopy();
        int int86 = property83.get();
        java.util.Locale locale87 = null;
        int int88 = property83.getMaximumTextLength(locale87);
        int int89 = property83.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = property83.getFieldType();
        org.joda.time.DateTime dateTime92 = dateTime77.withField(dateTimeFieldType90, (int) (short) 1);
        org.joda.time.DateTime dateTime94 = dateTime7.withField(dateTimeFieldType90, 12);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str12, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0" + "'", str50, "0");
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "0" + "'", str84, "0");
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 4 + "'", int88 == 4);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType90);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertNotNull(dateTime94);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 100);
        org.joda.time.DateTime dateTime19 = dateTime16.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.DateTime dateTime26 = dateTime23.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime23.toMutableDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime23.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.toDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime33.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime39.getZone();
        org.joda.time.DateTime dateTime41 = dateTime30.toDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(0L, dateTimeZone40);
        org.joda.time.DateTime dateTime44 = dateTime16.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime dateTime45 = dateTime8.toDateTime(dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight46 = dateTime45.toDateMidnight();
        boolean boolean47 = dateMidnight46.isAfterNow();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    @Ignore
  public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        long long29 = dateTime28.getMillis();
        int int30 = dateTime28.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime28.getZone();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime(chronology35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime39 = dateTime34.withDurationAdded(readableDuration37, 100);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.withZone(dateTimeZone40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime39.plus(readableDuration42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 1, chronology45);
        org.joda.time.DateTime.Property property47 = dateTime46.minuteOfDay();
        java.lang.String str48 = property47.getAsText();
        org.joda.time.DateTime dateTime49 = property47.roundHalfEvenCopy();
        int int50 = dateTime43.compareTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (byte) 1, chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime53.toMutableDateTime();
        org.joda.time.DateTime dateTime56 = dateTime53.withMillisOfSecond((int) '#');
        boolean boolean57 = dateTime43.equals((java.lang.Object) dateTime56);
        org.joda.time.DateTime dateTime59 = dateTime56.withDayOfYear(4);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (byte) 1, chronology61);
        org.joda.time.DateTime.Property property63 = dateTime62.minuteOfDay();
        java.lang.String str64 = property63.getAsText();
        org.joda.time.DateTime dateTime65 = property63.roundHalfEvenCopy();
        int int66 = property63.get();
        java.util.Locale locale67 = null;
        int int68 = property63.getMaximumTextLength(locale67);
        int int69 = property63.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = property63.getFieldType();
        org.joda.time.DateTime.Property property71 = dateTime59.property(dateTimeFieldType70);
        org.joda.time.DateTime.Property property72 = dateTime28.property(dateTimeFieldType70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime74 = dateTime28.withHourOfDay(379);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 379 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0" + "'", str48, "0");
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0" + "'", str64, "0");
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 4 + "'", int68 == 4);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(property72);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime14.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime14.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        int int26 = dateTime24.getDayOfMonth();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.toDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime24.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        org.joda.time.DateTime dateTime32 = dateTime21.toDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(0L, dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime7.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone31);
        boolean boolean37 = dateTime36.isBeforeNow();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime7.getZone();
        org.joda.time.DateTime.Property property10 = dateTime7.centuryOfEra();
        org.joda.time.DateTime dateTime11 = property10.getDateTime();
        java.lang.String str12 = property10.toString();
        org.joda.time.DateTime dateTime13 = property10.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[centuryOfEra]" + "'", str12, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(0L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.DateTime dateTime5 = dateTime1.minusWeeks((int) ' ');
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        int int7 = property6.get();
        org.joda.time.DateTime dateTime9 = property6.addToCopy(35L);
        java.lang.String str10 = property6.toString();
        org.joda.time.DateTime dateTime11 = property6.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[centuryOfEra]" + "'", str10, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.TimeOfDay timeOfDay8 = dateTime5.toTimeOfDay();
        org.joda.time.DateTime dateTime10 = dateTime5.withMillis(0L);
        boolean boolean11 = dateTime5.isBeforeNow();
        org.joda.time.DateTime dateTime13 = dateTime5.minusMonths(86399999);
        boolean boolean14 = dateTime5.isBeforeNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    @Ignore
  public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        int int10 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime12 = property8.setCopy((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        int int15 = dateTime12.getDayOfYear();
        int int16 = dateTime12.getSecondOfDay();
        org.joda.time.DateTime dateTime18 = dateTime12.withMillisOfSecond(5);
        int int19 = dateTime12.getSecondOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear(20);
        org.joda.time.DateTime dateTime13 = dateTime11.withMonthOfYear((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMonths(19);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMonths((int) '4');
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    @Ignore
  public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(100);
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime13 = property11.setCopy((int) (byte) 1);
        org.joda.time.DateTime dateTime14 = property11.roundCeilingCopy();
        org.joda.time.DateTime dateTime16 = dateTime14.withDayOfYear((int) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTime();
        org.joda.time.DateTime dateTime22 = dateTime19.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfDay();
        java.lang.String str27 = property26.getAsText();
        org.joda.time.DateTime dateTime28 = property26.roundHalfEvenCopy();
        int int29 = property26.get();
        java.util.Locale locale30 = null;
        int int31 = property26.getMaximumTextLength(locale30);
        int int32 = property26.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property26.getFieldType();
        org.joda.time.DateTime.Property property34 = dateTime19.property(dateTimeFieldType33);
        org.joda.time.DateTime.Property property35 = dateTime14.property(dateTimeFieldType33);
        boolean boolean36 = dateTime14.isAfterNow();
        org.joda.time.DateTime.Property property37 = dateTime14.hourOfDay();
        org.joda.time.DateTime dateTime38 = property37.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime dateTime8 = dateTime2.withMillisOfDay(99);
        int int9 = dateTime8.getDayOfMonth();
        org.joda.time.LocalDate localDate10 = dateTime8.toLocalDate();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    @Ignore
  public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        int int10 = dateTime2.getMillisOfDay();
        int int11 = dateTime2.getYearOfCentury();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 70 + "'", int11 == 70);
    }

    @Test
    @Ignore
  public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        int int12 = property3.get();
        org.joda.time.DateTime dateTime13 = property3.roundFloorCopy();
        org.joda.time.DateTime dateTime14 = property3.roundCeilingCopy();
        org.joda.time.DateTime dateTime15 = property3.withMaximumValue();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    @Ignore
  public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        int int12 = property3.get();
        org.joda.time.DateTime dateTime13 = property3.roundFloorCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.plus((long) 14400);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime18.toMutableDateTime();
        int int20 = dateTime18.getDayOfMonth();
        org.joda.time.DateTime dateTime22 = dateTime18.withYearOfEra(1);
        org.joda.time.DateTime dateTime24 = dateTime18.plusHours(0);
        boolean boolean25 = dateTime24.isEqualNow();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        java.lang.String str30 = property29.getAsText();
        org.joda.time.DateTime dateTime31 = property29.roundHalfEvenCopy();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.minuteOfDay();
        java.lang.String str36 = property35.getAsText();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime39.toMutableDateTime();
        int int41 = dateTime39.getDayOfMonth();
        long long42 = property35.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        int int43 = property35.get();
        org.joda.time.Interval interval44 = property35.toInterval();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 1, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.toDateTime(chronology48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime52 = dateTime47.withDurationAdded(readableDuration50, 100);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.withZone(dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime55 = dateTime52.toLocalDateTime();
        int int56 = property35.compareTo((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.DateTime dateTime57 = dateTime31.withFields((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 1, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = dateTime60.toDateTime(chronology61);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.DateTime dateTime65 = dateTime60.withDurationAdded(readableDuration63, 100);
        org.joda.time.DateTime.Property property66 = dateTime60.yearOfCentury();
        org.joda.time.DateTime dateTime67 = property66.roundFloorCopy();
        org.joda.time.DateTime dateTime69 = dateTime67.plus((long) (short) -1);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (byte) 1, chronology72);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime73.toMutableDateTime();
        org.joda.time.DateTime dateTime76 = dateTime73.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime73.toMutableDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime73.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime((long) (byte) 1, chronology82);
        org.joda.time.MutableDateTime mutableDateTime84 = dateTime83.toMutableDateTime();
        int int85 = dateTime83.getDayOfMonth();
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.DateTime dateTime87 = dateTime83.toDateTime(chronology86);
        org.joda.time.DateTime dateTime89 = dateTime83.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone90 = dateTime89.getZone();
        org.joda.time.DateTime dateTime91 = dateTime80.toDateTime(dateTimeZone90);
        org.joda.time.DateTime dateTime92 = new org.joda.time.DateTime(dateTimeZone90);
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime(0L, dateTimeZone90);
        org.joda.time.DateTime dateTime94 = dateTime67.withZoneRetainFields(dateTimeZone90);
        org.joda.time.DateTime dateTime95 = dateTime31.withZoneRetainFields(dateTimeZone90);
        org.joda.time.MutableDateTime mutableDateTime96 = dateTime24.toMutableDateTime(dateTimeZone90);
        org.joda.time.DateTime dateTime97 = new org.joda.time.DateTime((java.lang.Object) dateTime15, dateTimeZone90);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime99 = dateTime97.withMonthOfYear(20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(mutableDateTime78);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(mutableDateTime84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(dateTimeZone90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(dateTime95);
        org.junit.Assert.assertNotNull(mutableDateTime96);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        int int10 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime12 = property8.setCopy((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        org.joda.time.DateTime dateTime16 = dateTime12.plusYears(70);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readableDuration17);
        org.joda.time.DateTime dateTime20 = dateTime16.plusMonths(29);
        boolean boolean22 = dateTime16.isAfter((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.DateTime dateTime13 = dateTime10.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime10.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime19 = dateTime10.plusMonths((int) (short) 0);
        org.joda.time.DateTime.Property property20 = dateTime19.year();
        org.joda.time.DateTime dateTime22 = dateTime19.plusMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime6.withChronology(chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime24.withMonthOfYear(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    @Ignore
  public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.util.Locale locale7 = null;
        int int8 = property3.getMaximumTextLength(locale7);
        int int9 = property3.get();
        org.joda.time.DateTime dateTime10 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime13.withYearOfEra(1);
        org.joda.time.DateTime dateTime20 = dateTime13.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime22 = dateTime20.minusYears(4);
        org.joda.time.DateTime dateTime24 = dateTime20.withDayOfWeek(1);
        int int25 = property3.getDifference((org.joda.time.ReadableInstant) dateTime24);
        java.lang.String str26 = property3.getAsText();
        java.util.Locale locale27 = null;
        int int28 = property3.getMaximumTextLength(locale27);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4319 + "'", int25 == 4319);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    @Ignore
  public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        int int8 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.DateTime dateTime14 = property12.withMaximumValue();
        org.joda.time.DateTime dateTime16 = property12.setCopy((int) (byte) 10);
        int int17 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime19 = dateTime2.plusDays(4319);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.minus(readableDuration24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        org.joda.time.DateTime.Property property27 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime29 = property27.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMillis(12);
        org.joda.time.DateTime dateTime33 = dateTime29.minusDays(1439);
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours(1969);
        boolean boolean36 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime33);
        long long37 = dateTime33.getMillis();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-124329599999L) + "'", long37 == (-124329599999L));
    }

    @Test
    @Ignore
  public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.getDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology10);
        org.joda.time.DateTime dateTime12 = dateTime5.withChronology(chronology10);
        org.joda.time.DateTime.Property property13 = dateTime5.minuteOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1");
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks(330);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime9.withWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime13.withWeekOfWeekyear(154);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 154 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology4 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(chronology4);
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology4);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded(readableDuration7, (int) '#');
        org.joda.time.DateTime.Property property10 = dateTime6.era();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    @Ignore
  public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime7.plusMillis(1970);
        org.joda.time.DateTime.Property property12 = dateTime11.monthOfYear();
        org.joda.time.DateTime.Property property13 = dateTime11.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime16.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime16.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        int int28 = dateTime26.getDayOfMonth();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime26.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        org.joda.time.DateTime dateTime34 = dateTime23.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime11.toMutableDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 1, chronology39);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime40.toMutableDateTime();
        org.joda.time.DateTime dateTime43 = dateTime40.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 1, chronology45);
        org.joda.time.DateTime.Property property47 = dateTime46.minuteOfDay();
        java.lang.String str48 = property47.getAsText();
        org.joda.time.DateTime dateTime49 = property47.roundHalfEvenCopy();
        int int50 = property47.get();
        java.util.Locale locale51 = null;
        int int52 = property47.getMaximumTextLength(locale51);
        int int53 = property47.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property47.getFieldType();
        org.joda.time.DateTime.Property property55 = dateTime40.property(dateTimeFieldType54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (byte) 1, chronology60);
        org.joda.time.DateTime.Property property62 = dateTime61.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.DateTime dateTime64 = dateTime61.minus(readableDuration63);
        int int65 = dateTime58.compareTo((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Chronology chronology66 = dateTime58.getChronology();
        org.joda.time.DateTime dateTime67 = dateTime40.toDateTime(chronology66);
        org.joda.time.DateTime dateTime68 = dateTime11.toDateTime(chronology66);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((int) (byte) 1, 2922789, 29, 48, 14400, chronology66);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0" + "'", str48, "0");
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime68);
    }

    @Test
    @Ignore
  public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.util.Locale locale7 = null;
        int int8 = property3.getMaximumTextLength(locale7);
        int int9 = property3.get();
        org.joda.time.DateTime dateTime10 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime13.withYearOfEra(1);
        org.joda.time.DateTime dateTime20 = dateTime13.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime22 = dateTime20.minusYears(4);
        org.joda.time.DateTime dateTime24 = dateTime20.withDayOfWeek(1);
        int int25 = property3.getDifference((org.joda.time.ReadableInstant) dateTime24);
        int int26 = dateTime24.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4319 + "'", int25 == 4319);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    @Ignore
  public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.toDateTime(chronology30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.withDurationAdded(readableDuration32, 100);
        org.joda.time.DateTime.Property property35 = dateTime29.yearOfCentury();
        org.joda.time.DateTime dateTime36 = property35.roundFloorCopy();
        org.joda.time.DateTime dateTime38 = dateTime36.plus((long) (short) -1);
        org.joda.time.DateTime dateTime40 = dateTime36.withWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.DateTime dateTime42 = dateTime11.withChronology(chronology41);
        org.joda.time.DateTime dateTime43 = dateTime11.toDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = dateTime43.toString(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str45, "1970-01-01T00:00:00.001Z");
    }

    @Test
    @Ignore
  public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        int int29 = dateTime11.getMillisOfDay();
        org.joda.time.DateTime dateTime31 = dateTime11.plusWeeks(4);
        org.joda.time.DateTime dateTime33 = dateTime11.plus((long) (-18595));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime11 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime7.minus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours((int) (short) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.withDayOfMonth(19);
        int int18 = dateTime13.getYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime9.withWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        boolean boolean16 = dateTime13.isAfter(0L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withZone(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime19);
        boolean boolean22 = dateTime5.isAfter((long) (byte) -1);
        org.joda.time.DateTime dateTime24 = dateTime5.minusYears(4);
        org.joda.time.DateTime dateTime26 = dateTime24.withYear(14400);
        org.joda.time.DateTime.Property property27 = dateTime24.millisOfSecond();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(100);
        int int11 = dateTime10.getMillisOfSecond();
        boolean boolean12 = dateTime10.isEqualNow();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    @Ignore
  public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        boolean boolean14 = dateTime12.isBefore(0L);
        int int15 = dateTime12.getDayOfYear();
        int int16 = dateTime12.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime12.minus(readableDuration17);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14400 + "'", int16 == 14400);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime10.withHourOfDay(0);
        boolean boolean14 = dateTime12.isEqual((-18591L));
        org.joda.time.TimeOfDay timeOfDay15 = dateTime12.toTimeOfDay();
        org.joda.time.DateTime dateTime20 = dateTime12.withTime((int) (short) 10, (int) (short) 1, 0, 43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime12.withDayOfWeek(9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.minus(readableDuration12);
        int int14 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime10.withPeriodAdded(readablePeriod15, 1439);
        org.joda.time.Chronology chronology18 = dateTime10.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(581, 1439, 5, 43, 0, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    @Ignore
  public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime23.getYearOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime.Property property8 = dateTime5.era();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(292278993);
        org.joda.time.DateTime dateTime11 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) (byte) 10);
        boolean boolean15 = dateTime13.isBefore((long) 366);
        org.joda.time.DateTime dateTime16 = dateTime13.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    @Ignore
  public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        int int18 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        org.joda.time.DateTime dateTime24 = dateTime21.withMillisOfSecond((int) '#');
        boolean boolean25 = dateTime11.equals((java.lang.Object) dateTime24);
        org.joda.time.DateTime dateTime27 = dateTime24.withDayOfYear(4);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 1, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfDay();
        java.lang.String str32 = property31.getAsText();
        org.joda.time.DateTime dateTime33 = property31.roundHalfEvenCopy();
        int int34 = property31.get();
        java.util.Locale locale35 = null;
        int int36 = property31.getMaximumTextLength(locale35);
        int int37 = property31.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property31.getFieldType();
        org.joda.time.DateTime.Property property39 = dateTime27.property(dateTimeFieldType38);
        org.joda.time.DateTime.Property property40 = dateTime27.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property40.getFieldType();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
    }

    @Test
    @Ignore
  public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        int int8 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime2.toMutableDateTime(chronology13);
        int int16 = dateTime2.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    @Ignore
  public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 100);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.minus(readableDuration22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) readableDuration22);
        org.joda.time.DateTime.Property property25 = dateTime24.millisOfSecond();
        long long26 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalTime localTime27 = dateTime24.toLocalTime();
        boolean boolean28 = property7.equals((java.lang.Object) localTime27);
        org.joda.time.DateTime dateTime30 = property7.addWrapFieldToCopy(24);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-18591L) + "'", long26 == (-18591L));
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        int int9 = dateTime2.getMonthOfYear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime2.plus(readableDuration10);
        int int12 = dateTime2.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime6.plusMonths(1970);
        org.joda.time.DateTime dateTime15 = dateTime12.withDurationAdded(0L, 157);
        org.joda.time.DateTime dateTime17 = dateTime15.minus((-4481087184000001L));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(19, 35, 581, 1970, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        java.util.GregorianCalendar gregorianCalendar32 = dateTime31.toGregorianCalendar();
        org.joda.time.DateTime.Property property33 = dateTime31.weekOfWeekyear();
        org.joda.time.DateTime dateTime34 = dateTime31.withEarlierOffsetAtOverlap();
        boolean boolean36 = dateTime31.isEqual((long) (short) 100);
        org.joda.time.DateTime dateTime38 = dateTime31.minusWeeks(99);
        int int39 = dateTime38.getDayOfMonth();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(gregorianCalendar32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
    }

    @Test
    @Ignore
  public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        org.joda.time.DateTime dateTime29 = dateTime26.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime26.toMutableDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime26.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime36.toMutableDateTime();
        int int38 = dateTime36.getDayOfMonth();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTime(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime36.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime42.getZone();
        org.joda.time.DateTime dateTime44 = dateTime33.toDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime23.withZone(dateTimeZone43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 1, chronology47);
        org.joda.time.DateTime.Property property49 = dateTime48.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime51 = dateTime48.minus(readableDuration50);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime51.toMutableDateTime();
        org.joda.time.DateTime.Property property53 = dateTime51.weekyear();
        org.joda.time.DateTime.Property property54 = dateTime51.era();
        org.joda.time.DateTime.Property property55 = dateTime51.minuteOfHour();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.minuteOfDay();
        java.lang.String str60 = property59.getAsText();
        org.joda.time.DateTime dateTime61 = property59.withMaximumValue();
        org.joda.time.DateTime dateTime62 = property59.withMinimumValue();
        org.joda.time.DateTime dateTime63 = dateTime62.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property64 = dateTime63.yearOfEra();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (byte) 1, chronology66);
        org.joda.time.DateTime.Property property68 = dateTime67.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.DateTime dateTime70 = dateTime67.minus(readableDuration69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((java.lang.Object) readableDuration69);
        org.joda.time.DateTime dateTime73 = dateTime71.plusWeeks(0);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (byte) 1, chronology75);
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime76.toMutableDateTime();
        org.joda.time.DateTime dateTime79 = dateTime76.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime((long) (byte) 1, chronology81);
        org.joda.time.DateTime.Property property83 = dateTime82.minuteOfDay();
        java.lang.String str84 = property83.getAsText();
        org.joda.time.DateTime dateTime85 = property83.roundHalfEvenCopy();
        int int86 = property83.get();
        java.util.Locale locale87 = null;
        int int88 = property83.getMaximumTextLength(locale87);
        int int89 = property83.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = property83.getFieldType();
        org.joda.time.DateTime.Property property91 = dateTime76.property(dateTimeFieldType90);
        int int92 = dateTime73.get(dateTimeFieldType90);
        int int93 = dateTime63.get(dateTimeFieldType90);
        org.joda.time.DateTime.Property property94 = dateTime51.property(dateTimeFieldType90);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime96 = dateTime23.withField(dateTimeFieldType90, 2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0" + "'", str60, "0");
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(mutableDateTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "0" + "'", str84, "0");
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 4 + "'", int88 == 4);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType90);
        org.junit.Assert.assertNotNull(property91);
// flaky:         org.junit.Assert.assertTrue("'" + int92 + "' != '" + 157 + "'", int92 == 157);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(property94);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        int int14 = dateTime12.getDayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime24.plusMillis(1970);
        org.joda.time.DateTime.Property property29 = dateTime28.monthOfYear();
        org.joda.time.DateTime.Property property30 = dateTime28.dayOfYear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        org.joda.time.DateTime dateTime36 = dateTime33.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime33.toMutableDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime33.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime43.toMutableDateTime();
        int int45 = dateTime43.getDayOfMonth();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = dateTime43.toDateTime(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime43.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime49.getZone();
        org.joda.time.DateTime dateTime51 = dateTime40.toDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime28.toMutableDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime55 = dateTime21.withZone(dateTimeZone50);
        org.joda.time.DateTime.Property property56 = dateTime55.yearOfEra();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 1, chronology58);
        org.joda.time.DateTime dateTime60 = dateTime59.toDateTimeISO();
        org.joda.time.Chronology chronology61 = dateTime60.getChronology();
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime55.toMutableDateTime(chronology61);
        boolean boolean64 = dateTime55.isEqual((-4481087184000001L));
        int int65 = dateTime55.getSecondOfMinute();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 40 + "'", int65 == 40);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        int int10 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime12 = property8.setCopy((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        org.joda.time.DateTime dateTime16 = dateTime12.minusDays(0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.minus(readableDuration25);
        int int27 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime23.withPeriodAdded(readablePeriod28, 1439);
        org.joda.time.Chronology chronology31 = dateTime23.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) ' ', chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.DateTime dateTime36 = dateTime35.toDateTimeISO();
        org.joda.time.Chronology chronology37 = dateTime36.getChronology();
        org.joda.time.DateTime dateTime38 = dateTime32.toDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime16.toMutableDateTime(chronology37);
        org.joda.time.DateTime.Property property40 = dateTime16.era();
        org.joda.time.DateTime dateTime42 = dateTime16.withCenturyOfEra(12);
        org.joda.time.DateTime dateTime44 = dateTime42.minusDays((int) ' ');
        org.joda.time.DateTime.Property property45 = dateTime42.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
    }

    @Test
    @Ignore
  public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readablePeriod7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, (int) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.plusWeeks(0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(chronology18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.withDurationAdded(readableDuration20, 100);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.minus(readableDuration28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) readableDuration28);
        org.joda.time.DateTime.Property property31 = dateTime30.millisOfSecond();
        long long32 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime34 = dateTime30.minusMillis((int) (short) -1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTime(chronology38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withDurationAdded(readableDuration40, 100);
        org.joda.time.DateTime dateTime44 = dateTime37.plusMillis((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay45 = dateTime37.toTimeOfDay();
        boolean boolean46 = dateTime30.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime37.minus(readableDuration47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = dateTime48.toString(dateTimeFormatter49);
        org.joda.time.DateTime dateTime53 = dateTime48.withDurationAdded((-1L), 2922789);
        int int54 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-18591L) + "'", long32 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str50, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTime2.toString("19", locale5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusWeeks(10);
        org.joda.time.DateTime dateTime10 = dateTime8.withDayOfYear(70);
        org.joda.time.DateTime.Property property11 = dateTime10.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime10.getZone();
        org.joda.time.DateTime dateTime14 = dateTime10.withYearOfCentury(8);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19" + "'", str6, "19");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.TimeOfDay timeOfDay8 = dateTime5.toTimeOfDay();
        org.joda.time.DateTime dateTime10 = dateTime5.withMillis(0L);
        int int11 = dateTime5.getMillisOfSecond();
        org.joda.time.DateTime dateTime13 = dateTime5.withYear(874);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    @Ignore
  public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        java.lang.String str14 = property13.getAsText();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime17.toMutableDateTime();
        int int19 = dateTime17.getDayOfMonth();
        long long20 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime21 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int) (byte) 10);
        long long24 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.toDateTime(chronology28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded(readableDuration30, 100);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withZone(dateTimeZone33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.plus(readableDuration35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.minuteOfDay();
        java.lang.String str41 = property40.getAsText();
        org.joda.time.DateTime dateTime42 = property40.roundHalfEvenCopy();
        int int43 = dateTime36.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 1, chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime46.toMutableDateTime();
        org.joda.time.DateTime dateTime49 = dateTime46.withMillisOfSecond((int) '#');
        boolean boolean50 = dateTime36.equals((java.lang.Object) dateTime49);
        org.joda.time.DateTime dateTime52 = dateTime49.withDayOfYear(4);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (byte) 1, chronology54);
        org.joda.time.DateTime.Property property56 = dateTime55.minuteOfDay();
        java.lang.String str57 = property56.getAsText();
        org.joda.time.DateTime dateTime58 = property56.roundHalfEvenCopy();
        int int59 = property56.get();
        java.util.Locale locale60 = null;
        int int61 = property56.getMaximumTextLength(locale60);
        int int62 = property56.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property56.getFieldType();
        org.joda.time.DateTime.Property property64 = dateTime52.property(dateTimeFieldType63);
        long long65 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime52);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0" + "'", str57, "0");
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime12.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime12.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        int int24 = dateTime22.getDayOfMonth();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime22.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        org.joda.time.DateTime dateTime30 = dateTime19.toDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime34 = dateTime32.minusYears(1);
        org.joda.time.LocalDateTime localDateTime35 = dateTime32.toLocalDateTime();
        org.joda.time.DateTime dateTime36 = dateTime9.withFields((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.minus(readableDuration37);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(49, (int) 'a', 3, 1971, 86398, 99, 86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1971 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime7.millisOfSecond();
        org.joda.time.DateTime.Property property13 = dateTime7.millisOfDay();
        org.joda.time.DateTime.Property property14 = dateTime7.hourOfDay();
        int int15 = property14.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.withDurationAdded(readableDuration12, 100);
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        org.joda.time.DateTime dateTime24 = dateTime21.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime21.toMutableDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime21.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        int int33 = dateTime31.getDayOfMonth();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.toDateTime(chronology34);
        org.joda.time.DateTime dateTime37 = dateTime31.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime37.getZone();
        org.joda.time.DateTime dateTime39 = dateTime28.toDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(0L, dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime14.withZoneRetainFields(dateTimeZone38);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((int) (byte) 100, 292278993, 2, 12, (int) (byte) -1, (int) (short) 1, (int) (short) 10, dateTimeZone38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readablePeriod7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, (int) '#');
        org.joda.time.DateTime dateTime13 = dateTime6.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime13.toYearMonthDay();
        org.joda.time.DateTime.Property property15 = dateTime13.yearOfEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    @Ignore
  public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime.Property property8 = dateTime5.era();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        java.lang.String str14 = property13.getAsText();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime17.toMutableDateTime();
        int int19 = dateTime17.getDayOfMonth();
        long long20 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime21 = property13.withMinimumValue();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withDurationAdded(readableDuration27, 100);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withZone(dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime32 = dateTime31.toLocalDateTime();
        org.joda.time.DateTime dateTime33 = dateTime21.withFields((org.joda.time.ReadablePartial) localDateTime32);
        int int34 = dateTime21.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime36 = dateTime21.withYear(4);
        org.joda.time.DateTime dateTime38 = dateTime21.withMillis((long) (byte) 10);
        long long39 = dateTime38.getMillis();
        int int40 = dateTime38.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime9.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime42.toMutableDateTime();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 1, chronology45);
        org.joda.time.DateTime.Property property47 = dateTime46.minuteOfDay();
        java.lang.String str48 = property47.getAsText();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 1, chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime51.toMutableDateTime();
        int int53 = dateTime51.getDayOfMonth();
        long long54 = property47.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime55 = property47.withMinimumValue();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = dateTime58.toDateTime(chronology59);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.DateTime dateTime63 = dateTime58.withDurationAdded(readableDuration61, 100);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = dateTime63.withZone(dateTimeZone64);
        org.joda.time.LocalDateTime localDateTime66 = dateTime65.toLocalDateTime();
        org.joda.time.DateTime dateTime67 = dateTime55.withFields((org.joda.time.ReadablePartial) localDateTime66);
        int int68 = dateTime55.getYearOfCentury();
        org.joda.time.DateTime dateTime69 = dateTime55.toDateTimeISO();
        org.joda.time.DateTime dateTime71 = dateTime55.withMillis((long) 3);
        boolean boolean72 = mutableDateTime43.equals((java.lang.Object) 3);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0" + "'", str48, "0");
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 70 + "'", int68 == 70);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    @Ignore
  public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withZone(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTime dateTime23 = dateTime5.withDurationAdded((long) (short) -1, 1439);
        int int24 = dateTime23.getSecondOfDay();
        java.util.Date date25 = dateTime23.toDate();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        java.lang.String str30 = property29.getAsText();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        int int35 = dateTime33.getDayOfMonth();
        long long36 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime37 = property29.withMinimumValue();
        org.joda.time.DateTime dateTime39 = dateTime37.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property40 = dateTime37.year();
        org.joda.time.DateTime dateTime42 = dateTime37.withSecondOfMinute((int) ' ');
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 1, chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime45.toMutableDateTime();
        org.joda.time.DateTime dateTime48 = dateTime45.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime45.toMutableDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime45.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime54 = dateTime45.plusMonths((int) (short) 0);
        org.joda.time.DateTime.Property property55 = dateTime54.year();
        org.joda.time.DateTime dateTime57 = dateTime54.plusMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology58 = dateTime57.getChronology();
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime37.toMutableDateTime(chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime23.toMutableDateTime(chronology58);
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(chronology58);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 86398 + "'", int24 == 86398);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 23:59:58 UTC 1969");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
    }

    @Test
    @Ignore
  public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.DurationField durationField7 = property3.getRangeDurationField();
        long long8 = property3.remainder();
        org.joda.time.DateTime dateTime9 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField10 = property3.getField();
        org.joda.time.DateTime dateTime11 = property3.roundHalfFloorCopy();
        java.util.Date date12 = dateTime11.toDate();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    @Ignore
  public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.plus(readableDuration34);
        org.joda.time.DateTime.Property property36 = dateTime35.minuteOfDay();
        org.joda.time.DurationField durationField37 = property36.getDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(durationField37);
    }

    @Test
    @Ignore
  public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.TimeOfDay timeOfDay7 = dateTime2.toTimeOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        java.lang.String str12 = property11.getAsText();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        int int17 = dateTime15.getDayOfMonth();
        long long18 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = property11.withMinimumValue();
        int int20 = property11.get();
        org.joda.time.DateTime dateTime21 = property11.roundFloorCopy();
        org.joda.time.DateTime dateTime23 = property11.addToCopy(100);
        int int24 = dateTime23.getEra();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.toDateTime(chronology28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded(readableDuration30, 100);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withZone(dateTimeZone33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.plus(readableDuration35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.minuteOfDay();
        java.lang.String str41 = property40.getAsText();
        org.joda.time.DateTime dateTime42 = property40.roundHalfEvenCopy();
        int int43 = dateTime36.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 1, chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime46.toMutableDateTime();
        int int48 = dateTime46.getDayOfMonth();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = dateTime46.toDateTime(chronology49);
        org.joda.time.DateTime dateTime52 = dateTime46.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime52.getZone();
        org.joda.time.DateTime dateTime54 = dateTime42.toDateTime(dateTimeZone53);
        boolean boolean55 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = dateTime58.toDateTime(chronology59);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.DateTime dateTime63 = dateTime58.withDurationAdded(readableDuration61, 100);
        org.joda.time.DateTime dateTime65 = dateTime58.plusMillis((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay66 = dateTime58.toTimeOfDay();
        org.joda.time.DateTime dateTime67 = dateTime54.withFields((org.joda.time.ReadablePartial) timeOfDay66);
        boolean boolean68 = dateTime2.equals((java.lang.Object) dateTime54);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.DateTime dateTime70 = dateTime54.minus(readableDuration69);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateTime70);
    }

    @Test
    @Ignore
  public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTime dateTime31 = dateTime28.minus((long) 155);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime34.toMutableDateTime();
        int int36 = dateTime34.getDayOfMonth();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.toDateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime34.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime40.getZone();
        org.joda.time.DateTime dateTime42 = dateTime28.toDateTime(dateTimeZone41);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime dateTime8 = dateTime2.plusMonths((-292275054));
        org.joda.time.DateTime dateTime10 = dateTime8.withMillisOfDay(330);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        int int12 = dateTime10.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime10.withYearOfEra(1);
        org.joda.time.DateTime dateTime17 = dateTime10.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime19 = dateTime17.minusYears(4);
        boolean boolean20 = dateTime5.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property21 = dateTime17.hourOfDay();
        org.joda.time.DurationField durationField22 = property21.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = property21.setCopy((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime11.getZone();
        org.joda.time.DateTime dateTime15 = dateTime11.withDurationAdded(0L, (-18595));
        org.joda.time.Chronology chronology16 = dateTime11.getChronology();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    @Ignore
  public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property6.getFieldType();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes((int) (byte) -1);
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        int int14 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime dateTime16 = dateTime12.withYearOfEra(1);
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime(chronology21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime20.withDurationAdded(readableDuration23, 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withZone(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = dateTime27.toLocalDateTime();
        int int29 = property17.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.DateTime dateTime30 = dateTime2.withFields((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.DateTime dateTime32 = dateTime2.withCenturyOfEra(19);
        org.joda.time.DateTime.Property property33 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime34 = dateTime2.toDateTimeISO();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plus((-18591L));
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        org.joda.time.DateTime dateTime15 = dateTime12.withYearOfEra(34);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.minus(readablePeriod16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime12.withDurationAdded(readableDuration18, (int) (byte) 10);
        org.joda.time.DateTime.Property property21 = dateTime20.year();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime2.centuryOfEra();
        int int7 = property6.getMinimumValue();
        org.joda.time.DateTime dateTime8 = property6.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime9 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime11 = dateTime8.withMillis((-18591L));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    @Ignore
  public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        java.util.Date date14 = dateTime12.toDate();
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime17 = property15.addWrapFieldToCopy(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Jan 05 04:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime2.plusHours(5);
        org.joda.time.DateTime dateTime8 = dateTime2.withHourOfDay(3);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime14.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime14.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        int int26 = dateTime24.getDayOfMonth();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.toDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime24.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        org.joda.time.DateTime dateTime32 = dateTime21.toDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(0L, dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime7.withZoneRetainFields(dateTimeZone31);
        int int36 = dateTime35.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime38 = dateTime35.withCenturyOfEra((-18595));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -18595 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    @Ignore
  public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.minus(readableDuration14);
        int int16 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        java.lang.String str21 = property20.getAsText();
        org.joda.time.DateTimeField dateTimeField22 = property20.getField();
        int int23 = dateTime12.get(dateTimeField22);
        org.joda.time.DateTime dateTime25 = dateTime12.plusHours(20);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMonths((int) (byte) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMonths(8);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.DateTime dateTime4 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology5 = dateTime3.getChronology();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology5);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime11.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        int int23 = dateTime21.getDayOfMonth();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime21.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime27.getZone();
        org.joda.time.DateTime dateTime29 = dateTime18.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(0L, dateTimeZone28);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime33 = dateTime7.withZone(dateTimeZone28);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 4, dateTimeZone28);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    @Ignore
  public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime7 = property3.setCopy((int) (byte) 10);
        java.lang.String str8 = property3.getAsShortText();
        boolean boolean9 = property3.isLeap();
        org.joda.time.DateTime dateTime10 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime11 = property3.roundFloorCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfYear((int) 'a');
        org.joda.time.DateTime dateTime14 = dateTime13.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime8 = dateTime2.plusHours(0);
        org.joda.time.DateTime.Property property9 = dateTime2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime2.withTime(49, (int) (short) 1, 86399, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    @Ignore
  public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withDurationAdded(readableDuration13, 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.withZone(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.plus(readableDuration18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.minuteOfDay();
        java.lang.String str24 = property23.getAsText();
        org.joda.time.DateTime dateTime25 = property23.roundHalfEvenCopy();
        int int26 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        int int31 = dateTime29.getDayOfMonth();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.toDateTime(chronology32);
        org.joda.time.DateTime dateTime35 = dateTime29.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        org.joda.time.DateTime dateTime37 = dateTime25.toDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 'a', dateTimeZone36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((int) 'a', 86399, 163, 86340, 19, 14400, 9336, dateTimeZone36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86340 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime1.withDate((int) 'a', 1, 4319);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4319 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.toDateTime(chronology30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.withDurationAdded(readableDuration32, 100);
        org.joda.time.DateTime.Property property35 = dateTime29.yearOfCentury();
        org.joda.time.DateTime dateTime36 = property35.roundFloorCopy();
        org.joda.time.DateTime dateTime38 = dateTime36.plus((long) (short) -1);
        org.joda.time.DateTime dateTime40 = dateTime36.withWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.DateTime dateTime42 = dateTime11.withChronology(chronology41);
        org.joda.time.DateTime dateTime43 = dateTime11.toDateTime();
        org.joda.time.DateTime.Property property44 = dateTime11.era();
        org.joda.time.DurationField durationField45 = property44.getRangeDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNull(durationField45);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTime2.toString("19", locale5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.DateTime dateTime10 = dateTime9.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology11 = dateTime9.getChronology();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) "19", chronology11);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19" + "'", str6, "19");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    @Ignore
  public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        java.util.GregorianCalendar gregorianCalendar32 = dateTime31.toGregorianCalendar();
        org.joda.time.DateTime.Property property33 = dateTime31.weekOfWeekyear();
        org.joda.time.DateTime dateTime34 = dateTime31.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property35 = dateTime31.yearOfCentury();
        org.joda.time.DateTime dateTime37 = dateTime31.plusDays((int) '#');
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(gregorianCalendar32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(330, 1969, (int) (byte) 10, 0, (int) (short) -1, 0, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(100);
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime13 = property11.setCopy((int) (byte) 1);
        int int14 = property11.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    @Ignore
  public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology10);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology10);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.minus(readableDuration19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        org.joda.time.DateTime.Property property22 = dateTime20.weekyear();
        org.joda.time.DateTime.Property property23 = dateTime20.era();
        org.joda.time.DateTime dateTime24 = property23.roundFloorCopy();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfDay();
        java.lang.String str29 = property28.getAsText();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        int int34 = dateTime32.getDayOfMonth();
        long long35 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime36 = property28.withMinimumValue();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.toDateTime(chronology40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime44 = dateTime39.withDurationAdded(readableDuration42, 100);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withZone(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime47 = dateTime46.toLocalDateTime();
        org.joda.time.DateTime dateTime48 = dateTime36.withFields((org.joda.time.ReadablePartial) localDateTime47);
        int int49 = dateTime36.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime51 = dateTime36.withYear(4);
        org.joda.time.DateTime dateTime53 = dateTime36.withMillis((long) (byte) 10);
        long long54 = dateTime53.getMillis();
        int int55 = dateTime53.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime53.getZone();
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime24.toMutableDateTime(dateTimeZone56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(obj14, dateTimeZone56);
        int int59 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (byte) 1, chronology61);
        org.joda.time.DateTime.Property property63 = dateTime62.minuteOfDay();
        java.lang.String str64 = property63.getAsText();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (byte) 1, chronology66);
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime67.toMutableDateTime();
        int int69 = dateTime67.getDayOfMonth();
        long long70 = property63.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTime dateTime71 = property63.withMinimumValue();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) (byte) 1, chronology73);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = dateTime74.toDateTime(chronology75);
        org.joda.time.ReadableDuration readableDuration77 = null;
        org.joda.time.DateTime dateTime79 = dateTime74.withDurationAdded(readableDuration77, 100);
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.DateTime dateTime81 = dateTime79.withZone(dateTimeZone80);
        org.joda.time.LocalDateTime localDateTime82 = dateTime81.toLocalDateTime();
        org.joda.time.DateTime dateTime83 = dateTime71.withFields((org.joda.time.ReadablePartial) localDateTime82);
        int int84 = dateTime71.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime86 = dateTime71.withYear(4);
        org.joda.time.DateTime dateTime88 = dateTime71.withMillis((long) (byte) 10);
        int int89 = dateTime71.getMillisOfDay();
        org.joda.time.DateTime.Property property90 = dateTime71.minuteOfDay();
        org.joda.time.Chronology chronology91 = dateTime71.getChronology();
        org.joda.time.DateTime dateTime92 = dateTime58.withChronology(chronology91);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime((int) 'a', 379, 0, 1968, 14400, (-292275054), chronology91);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1968 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0" + "'", str64, "0");
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(chronology91);
        org.junit.Assert.assertNotNull(dateTime92);
    }

    @Test
    @Ignore
  public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZone(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.plus(readableDuration20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DateTime dateTime27 = property25.roundHalfEvenCopy();
        int int28 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        org.joda.time.DateTime dateTime34 = dateTime31.withMillisOfSecond((int) '#');
        boolean boolean35 = dateTime21.equals((java.lang.Object) dateTime34);
        boolean boolean36 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime34);
        java.util.GregorianCalendar gregorianCalendar37 = dateTime9.toGregorianCalendar();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar37);
    }

    @Test
    @Ignore
  public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.plusMonths((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = dateTime15.toString(dateTimeFormatter20);
        org.joda.time.YearMonthDay yearMonthDay22 = dateTime15.toYearMonthDay();
        org.joda.time.DateTime.Property property23 = dateTime15.era();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T02:37:51.558Z" + "'", str21, "2020-11-25T02:37:51.558Z");
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    @Ignore
  public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property34 = dateTime31.millisOfDay();
        java.lang.String str35 = property34.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Property[millisOfDay]" + "'", str35, "Property[millisOfDay]");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime2.withMillis((long) 1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTimeISO();
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime10.toMutableDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    @Ignore
  public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = property7.setCopy((-18595));
        org.joda.time.DateTime dateTime12 = dateTime11.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfDay();
        java.lang.String str17 = property16.getAsText();
        org.joda.time.DateTime dateTime18 = property16.roundHalfEvenCopy();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfDay();
        java.lang.String str23 = property22.getAsText();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        int int28 = dateTime26.getDayOfMonth();
        long long29 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        int int30 = property22.get();
        org.joda.time.Interval interval31 = property22.toInterval();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime(chronology35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime39 = dateTime34.withDurationAdded(readableDuration37, 100);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.withZone(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = dateTime39.toLocalDateTime();
        int int43 = property22.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.DateTime dateTime44 = dateTime18.withFields((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 1, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.toDateTime(chronology48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime52 = dateTime47.withDurationAdded(readableDuration50, 100);
        org.joda.time.DateTime.Property property53 = dateTime47.yearOfCentury();
        org.joda.time.DateTime dateTime54 = property53.roundFloorCopy();
        org.joda.time.DateTime dateTime56 = dateTime54.plus((long) (short) -1);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 1, chronology59);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime60.toMutableDateTime();
        org.joda.time.DateTime dateTime63 = dateTime60.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime60.toMutableDateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime67 = dateTime60.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (byte) 1, chronology69);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime70.toMutableDateTime();
        int int72 = dateTime70.getDayOfMonth();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = dateTime70.toDateTime(chronology73);
        org.joda.time.DateTime dateTime76 = dateTime70.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime76.getZone();
        org.joda.time.DateTime dateTime78 = dateTime67.toDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime(0L, dateTimeZone77);
        org.joda.time.DateTime dateTime81 = dateTime54.withZoneRetainFields(dateTimeZone77);
        org.joda.time.DateTime dateTime82 = dateTime18.withZoneRetainFields(dateTimeZone77);
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime84 = dateTime11.toDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(dateTimeZone77);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime84);
    }
}
