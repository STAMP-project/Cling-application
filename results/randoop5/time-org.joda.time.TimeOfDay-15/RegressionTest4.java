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
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        int int7 = timeOfDay2.getMillisOfSecond();
        org.joda.time.TimeOfDay.Property property8 = timeOfDay2.minuteOfHour();
        java.lang.String str9 = property8.toString();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay12.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology20 = timeOfDay19.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay19.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property23 = timeOfDay19.millisOfSecond();
        java.lang.Object obj24 = null;
        boolean boolean25 = property23.equals(obj24);
        java.lang.String str26 = property23.getName();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay29.plusHours((int) (short) -1);
        int int35 = property23.compareTo((org.joda.time.ReadablePartial) timeOfDay34);
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology39 = timeOfDay38.getChronology();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay38.minusMinutes(0);
        boolean boolean42 = property23.equals((java.lang.Object) timeOfDay38);
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology46 = timeOfDay45.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay45.minusMinutes(0);
        org.joda.time.DateTime dateTime49 = timeOfDay48.toDateTimeToday();
        org.joda.time.DateTime dateTime50 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay38.plus(readablePeriod51);
        int int53 = property16.compareTo((org.joda.time.ReadablePartial) timeOfDay38);
        int int54 = property8.compareTo((org.joda.time.ReadablePartial) timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[minuteOfHour]" + "'", str9, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "millisOfSecond" + "'", str26, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusHours((int) (short) -1);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.DateTimeField dateTimeField19 = property6.getField();
        java.lang.String str20 = property6.getAsText();
        int int21 = property6.get();
        org.joda.time.TimeOfDay timeOfDay23 = property6.setCopy(2);
        java.lang.String str24 = property6.getName();
        int int25 = property6.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "millisOfSecond" + "'", str24, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusHours((int) (short) -1);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay17.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay17.minusMinutes((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.plusMillis((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.plusHours(592);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 13);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = timeOfDay1.toDateTimeToday(dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.withHourOfDay(663);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 663 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(26, 131, 8, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.DurationField durationField6 = property5.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.minusMinutes(0);
        org.joda.time.DateTime dateTime13 = timeOfDay12.toDateTimeToday();
        int int14 = property5.compareTo((org.joda.time.ReadableInstant) dateTime13);
        int int15 = property5.getMaximumValue();
        int int16 = property5.get();
        java.lang.String str17 = property5.getAsText();
        java.lang.String str18 = property5.getAsString();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property5.getAsText(locale19);
        java.lang.String str21 = property5.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay24.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property28 = timeOfDay24.millisOfSecond();
        java.lang.Object obj29 = null;
        boolean boolean30 = property28.equals(obj29);
        java.lang.String str31 = property28.getName();
        org.joda.time.DurationField durationField32 = property28.getDurationField();
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.minusMinutes(0);
        org.joda.time.LocalTime localTime39 = timeOfDay35.toLocalTime();
        org.joda.time.TimeOfDay.Property property40 = timeOfDay35.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = timeOfDay35.toDateTimeToday(dateTimeZone41);
        boolean boolean43 = property28.equals((java.lang.Object) dateTime42);
        int int44 = property5.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "millisOfSecond" + "'", str31, "millisOfSecond");
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay5.millisOfSecond();
        java.lang.String str7 = property6.getAsString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property6.getAsShortText(locale8);
        org.joda.time.TimeOfDay timeOfDay10 = property6.withMinimumValue();
        int int11 = property6.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusHours((int) (short) -1);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay17.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay21 = property19.setCopy((int) ' ');
        java.util.Locale locale22 = null;
        int int23 = property19.getMaximumTextLength(locale22);
        org.joda.time.DurationField durationField24 = property19.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(chronology31);
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay27.withChronologyRetainFields(chronology33);
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay27.withHourOfDay((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay27.minusMillis(13);
        int[] intArray39 = timeOfDay38.getValues();
        org.joda.time.DateTime dateTime40 = timeOfDay38.toDateTimeToday();
        int int41 = property19.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[12, 59, 59, 987]");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.plusHours(4);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay2);
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = timeOfDay17.getFieldTypes();
        org.joda.time.TimeOfDay.Property property20 = timeOfDay17.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay17.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology29);
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(chronology29);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay17.withChronologyRetainFields(chronology29);
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, chronology29);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay((int) (short) 0, 59, (int) '#', chronology29);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(chronology29);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay10, chronology36);
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsText();
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = timeOfDay14.getFieldTypes();
        int int17 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay14);
        org.joda.time.Chronology chronology18 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay.Property property19 = timeOfDay14.secondOfMinute();
        org.joda.time.LocalTime localTime20 = timeOfDay14.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = timeOfDay14.toDateTimeToday(dateTimeZone21);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay9.millisOfSecond();
        java.lang.Object obj14 = null;
        boolean boolean15 = property13.equals(obj14);
        java.lang.String str16 = property13.getName();
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology20 = timeOfDay19.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay19.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay19.plusHours((int) (short) -1);
        int int25 = property13.compareTo((org.joda.time.ReadablePartial) timeOfDay24);
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.minusMinutes(0);
        boolean boolean32 = property13.equals((java.lang.Object) timeOfDay28);
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.minusMinutes(0);
        org.joda.time.DateTime dateTime39 = timeOfDay38.toDateTimeToday();
        org.joda.time.DateTime dateTime40 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay28.plus(readablePeriod41);
        int int43 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay28);
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay28.plusSeconds((int) (byte) 0);
        int int46 = timeOfDay45.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay47 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay47.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology50 = timeOfDay49.getChronology();
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay49.minusMinutes(0);
        org.joda.time.LocalTime localTime53 = timeOfDay49.toLocalTime();
        org.joda.time.TimeOfDay.Property property54 = timeOfDay49.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay49.plus(readablePeriod55);
        org.joda.time.TimeOfDay timeOfDay57 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay57.minusMillis((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay60 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay60.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology63 = timeOfDay62.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray64 = timeOfDay62.getFieldTypes();
        org.joda.time.TimeOfDay.Property property65 = timeOfDay62.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay62.minusHours(999);
        org.joda.time.TimeOfDay.Property property68 = timeOfDay67.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property68.getFieldType();
        boolean boolean70 = timeOfDay57.isSupported(dateTimeFieldType69);
        org.joda.time.TimeOfDay.Property property71 = timeOfDay56.property(dateTimeFieldType69);
        int int72 = timeOfDay45.indexOf(dateTimeFieldType69);
        org.joda.time.TimeOfDay timeOfDay74 = timeOfDay45.minusHours(968);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "millisOfSecond" + "'", str16, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertNotNull(timeOfDay74);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.DurationField durationField6 = property5.getRangeDurationField();
        java.lang.String str7 = property5.toString();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[minuteOfHour]" + "'", str7, "Property[minuteOfHour]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusMinutes(0);
        org.joda.time.LocalTime localTime8 = timeOfDay4.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay4.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay4.minusSeconds(0);
        boolean boolean13 = timeOfDay1.isEqual((org.joda.time.ReadablePartial) timeOfDay12);
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology24 = timeOfDay23.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology24);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology24);
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray31 = timeOfDay29.getFieldTypes();
        org.joda.time.TimeOfDay.Property property32 = timeOfDay29.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay29.minusHours(999);
        org.joda.time.TimeOfDay.Property property35 = timeOfDay34.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        int int37 = timeOfDay26.get(dateTimeFieldType36);
        boolean boolean38 = timeOfDay12.isBefore((org.joda.time.ReadablePartial) timeOfDay26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay40 = timeOfDay12.withSecondOfMinute(305);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 305 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        int int10 = property6.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay12 = property6.addNoWrapToCopy((int) '#');
        java.util.Locale locale13 = null;
        java.lang.String str14 = property6.getAsText(locale13);
        java.util.Locale locale15 = null;
        java.lang.String str16 = property6.getAsText(locale15);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusHours((int) (short) -1);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay21.minusMinutes(0);
        boolean boolean25 = property6.equals((java.lang.Object) timeOfDay21);
        org.joda.time.TimeOfDay timeOfDay26 = property6.withMinimumValue();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = timeOfDay26.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay26.minusMillis(36);
        org.joda.time.TimeOfDay.Property property30 = timeOfDay29.minuteOfHour();
        int int31 = timeOfDay29.getMillisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 964 + "'", int31 == 964);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (-1));
        org.junit.Assert.assertNotNull(timeOfDay1);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay8 = property4.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.plusSeconds(2);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((long) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay15.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay15.millisOfSecond();
        java.lang.Object obj20 = null;
        boolean boolean21 = property19.equals(obj20);
        java.lang.String str22 = property19.getName();
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay25.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay25.plusHours((int) (short) -1);
        int int31 = property19.compareTo((org.joda.time.ReadablePartial) timeOfDay30);
        org.joda.time.TimeOfDay timeOfDay32 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay32.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology35 = timeOfDay34.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay34.minusMinutes(0);
        boolean boolean38 = property19.equals((java.lang.Object) timeOfDay34);
        org.joda.time.TimeOfDay timeOfDay39 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay39.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology42 = timeOfDay41.getChronology();
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay41.minusMinutes(0);
        org.joda.time.DateTime dateTime45 = timeOfDay44.toDateTimeToday();
        org.joda.time.DateTime dateTime46 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime47 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay12.plusMinutes(4);
        boolean boolean50 = timeOfDay10.equals((java.lang.Object) timeOfDay49);
        org.joda.time.TimeOfDay.Property property51 = timeOfDay10.hourOfDay();
        org.joda.time.LocalTime localTime52 = timeOfDay10.toLocalTime();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "millisOfSecond" + "'", str22, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localTime52);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 100, chronology1);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology10);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay15.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay15.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay15.minusHours(999);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay20.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property21.getFieldType();
        int int23 = timeOfDay12.get(dateTimeFieldType22);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay12.plusMinutes((int) '4');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = timeOfDay25.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = timeOfDay25.getFieldTypes();
        int[] intArray29 = timeOfDay25.getValues();
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[3, 53, 0, 10]");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(1, 23, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = timeOfDay3.getValue(919);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 919");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(6, 793);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 793 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusHours((int) (short) -1);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay21.minusMinutes(0);
        boolean boolean25 = property6.equals((java.lang.Object) timeOfDay21);
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.minusMinutes(0);
        org.joda.time.DateTime dateTime32 = timeOfDay31.toDateTimeToday();
        org.joda.time.DateTime dateTime33 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = timeOfDay21.toDateTimeToday(dateTimeZone34);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay21.withMillisOfSecond(4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = timeOfDay37.toString(dateTimeFormatter38);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay37.plusHours(37);
        org.joda.time.TimeOfDay.Property property43 = timeOfDay42.secondOfMinute();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "T00:00:00.004" + "'", str39, "T00:00:00.004");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology14);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay2.withChronologyRetainFields(chronology14);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = timeOfDay20.getFieldTypes();
        org.joda.time.TimeOfDay.Property property23 = timeOfDay20.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay20.minusHours(999);
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        boolean boolean28 = timeOfDay2.isSupported(dateTimeFieldType27);
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay32 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay32.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology35 = timeOfDay34.getChronology();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(chronology35);
        org.joda.time.Chronology chronology37 = timeOfDay36.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay31.withChronologyRetainFields(chronology37);
        int int39 = timeOfDay31.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay31.plusMinutes((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay42 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay42.minusHours((int) '#');
        int int45 = timeOfDay42.getHourOfDay();
        boolean boolean46 = timeOfDay41.isBefore((org.joda.time.ReadablePartial) timeOfDay42);
        boolean boolean47 = timeOfDay2.isEqual((org.joda.time.ReadablePartial) timeOfDay42);
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay2.minusMillis((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.withMinuteOfHour(964);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 964 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(timeOfDay49);
    }
}

