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
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay21.plus(readablePeriod34);
        org.joda.time.TimeOfDay.Property property36 = timeOfDay21.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay38 = property36.addWrapFieldToCopy(0);
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.plusSeconds((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.plus(readablePeriod41);
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
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay42);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay9 = property7.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 0);
        boolean boolean12 = timeOfDay9.isAfter((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.Chronology chronology13 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusHours((int) '#');
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay20.millisOfSecond();
        java.lang.Object obj25 = null;
        boolean boolean26 = property24.equals(obj25);
        java.util.Locale locale27 = null;
        int int28 = property24.getMaximumShortTextLength(locale27);
        org.joda.time.TimeOfDay timeOfDay29 = property24.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay32.minusMinutes(0);
        org.joda.time.LocalTime localTime36 = timeOfDay32.toLocalTime();
        org.joda.time.TimeOfDay.Property property37 = timeOfDay32.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay32.plus(readablePeriod38);
        org.joda.time.TimeOfDay timeOfDay40 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.minusMillis((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology46 = timeOfDay45.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = timeOfDay45.getFieldTypes();
        org.joda.time.TimeOfDay.Property property48 = timeOfDay45.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay45.minusHours(999);
        org.joda.time.TimeOfDay.Property property51 = timeOfDay50.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property51.getFieldType();
        boolean boolean53 = timeOfDay40.isSupported(dateTimeFieldType52);
        org.joda.time.TimeOfDay.Property property54 = timeOfDay39.property(dateTimeFieldType52);
        org.joda.time.TimeOfDay.Property property55 = timeOfDay29.property(dateTimeFieldType52);
        int int56 = timeOfDay16.get(dateTimeFieldType52);
        int int57 = timeOfDay11.get(dateTimeFieldType52);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) 'a');
        org.joda.time.TimeOfDay.Property property4 = timeOfDay3.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addNoWrapToCopy(30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.withHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = timeOfDay2.getFields();
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay.Property property10 = timeOfDay7.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay11 = property10.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        int int13 = timeOfDay2.get(dateTimeFieldType12);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay2.minusSeconds((int) (byte) -1);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeOfDay15);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay12 = property6.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay13 = property6.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay14 = property6.getTimeOfDay();
        int int15 = timeOfDay14.getSecondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay14.plusHours((int) 'a');
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(timeOfDay18);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 100, (int) (byte) 0, 43, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(1, 0, (int) (byte) 0, 10, chronology10);
        int int13 = timeOfDay12.size();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay12.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay17.millisOfSecond();
        java.lang.Object obj22 = null;
        boolean boolean23 = property21.equals(obj22);
        java.lang.String str24 = property21.getName();
        java.lang.String str25 = property21.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay26 = property21.withMinimumValue();
        org.joda.time.DateTime dateTime27 = timeOfDay26.toDateTimeToday();
        int int28 = property14.compareTo((org.joda.time.ReadableInstant) dateTime27);
        java.lang.String str29 = property14.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay31 = property14.setCopy((int) (short) 10);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "millisOfSecond" + "'", str24, "millisOfSecond");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertNotNull(timeOfDay31);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.plus(readablePeriod8);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.DateTime dateTime16 = timeOfDay15.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property17 = timeOfDay15.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay15.withHourOfDay(1);
        boolean boolean20 = timeOfDay9.equals((java.lang.Object) timeOfDay15);
        int int21 = timeOfDay9.getMillisOfSecond();
        int int22 = timeOfDay9.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay25.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property29 = timeOfDay25.millisOfSecond();
        java.lang.Object obj30 = null;
        boolean boolean31 = property29.equals(obj30);
        java.lang.String str32 = property29.getName();
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay35.plusHours((int) (short) -1);
        int int41 = property29.compareTo((org.joda.time.ReadablePartial) timeOfDay40);
        org.joda.time.TimeOfDay timeOfDay42 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay42.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology45 = timeOfDay44.getChronology();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay44.minusMinutes(0);
        boolean boolean48 = property29.equals((java.lang.Object) timeOfDay44);
        org.joda.time.TimeOfDay timeOfDay49 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology52 = timeOfDay51.getChronology();
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay51.minusMinutes(0);
        org.joda.time.DateTime dateTime55 = timeOfDay54.toDateTimeToday();
        org.joda.time.DateTime dateTime56 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = timeOfDay44.toDateTimeToday(dateTimeZone57);
        int int59 = timeOfDay44.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay44.withSecondOfMinute(13);
        org.joda.time.TimeOfDay timeOfDay63 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay64 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay66 = timeOfDay64.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology67 = timeOfDay66.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray68 = timeOfDay66.getFieldTypes();
        org.joda.time.TimeOfDay.Property property69 = timeOfDay66.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay71 = timeOfDay66.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay75 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay77 = timeOfDay75.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology78 = timeOfDay77.getChronology();
        org.joda.time.TimeOfDay timeOfDay79 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology78);
        org.joda.time.TimeOfDay timeOfDay80 = new org.joda.time.TimeOfDay(chronology78);
        org.joda.time.TimeOfDay timeOfDay81 = timeOfDay66.withChronologyRetainFields(chronology78);
        org.joda.time.TimeOfDay timeOfDay82 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay84 = timeOfDay82.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology85 = timeOfDay84.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray86 = timeOfDay84.getFieldTypes();
        org.joda.time.TimeOfDay.Property property87 = timeOfDay84.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay89 = timeOfDay84.minusHours(999);
        org.joda.time.TimeOfDay.Property property90 = timeOfDay89.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = property90.getFieldType();
        boolean boolean92 = timeOfDay66.isSupported(dateTimeFieldType91);
        boolean boolean93 = timeOfDay63.isSupported(dateTimeFieldType91);
        int int94 = timeOfDay61.get(dateTimeFieldType91);
        org.joda.time.TimeOfDay.Property property95 = timeOfDay9.property(dateTimeFieldType91);
        org.joda.time.TimeOfDay.Property property96 = timeOfDay9.millisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "millisOfSecond" + "'", str32, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay64);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(timeOfDay71);
        org.junit.Assert.assertNotNull(timeOfDay75);
        org.junit.Assert.assertNotNull(timeOfDay77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(timeOfDay81);
        org.junit.Assert.assertNotNull(timeOfDay82);
        org.junit.Assert.assertNotNull(timeOfDay84);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray86);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(timeOfDay89);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(dateTimeFieldType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 13 + "'", int94 == 13);
        org.junit.Assert.assertNotNull(property95);
        org.junit.Assert.assertNotNull(property96);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        org.joda.time.TimeOfDay timeOfDay11 = property6.withMaximumValue();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property6.getAsShortText(locale12);
        org.joda.time.TimeOfDay timeOfDay15 = property6.addToCopy(48);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay15.hourOfDay();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay6 = property5.withMinimumValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = property5.equals(obj7);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusHours((int) '#');
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.hourOfDay();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay15 = property5.addToCopy(59);
        int int16 = property5.get();
        java.lang.String str17 = property5.getAsText();
        org.joda.time.TimeOfDay timeOfDay19 = property5.addWrapFieldToCopy(28);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(timeOfDay19);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(10, (int) (byte) 0, 2);
        org.joda.time.TimeOfDay.Property property4 = timeOfDay3.hourOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        java.lang.String str6 = property4.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property4.getFieldType();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[hourOfDay]" + "'", str6, "Property[hourOfDay]");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        int int14 = timeOfDay1.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay1.plusHours((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = timeOfDay1.toString(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(timeOfDay16);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "T01:37:35.241" + "'", str18, "T01:37:35.241");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay12 = property6.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.plusHours(100);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology21);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay23.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
        int int26 = timeOfDay12.get(dateTimeFieldType25);
        org.joda.time.TimeOfDay.Property property27 = timeOfDay12.millisOfSecond();
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
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
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
        org.joda.time.TimeOfDay timeOfDay12 = property6.addToCopy(0);
        org.joda.time.DurationField durationField13 = property6.getDurationField();
        org.joda.time.TimeOfDay timeOfDay14 = property6.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay17.millisOfSecond();
        java.lang.Object obj22 = null;
        boolean boolean23 = property21.equals(obj22);
        java.util.Locale locale24 = null;
        int int25 = property21.getMaximumShortTextLength(locale24);
        org.joda.time.TimeOfDay timeOfDay26 = property21.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.withMinuteOfHour(1);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusHours(10);
        boolean boolean31 = timeOfDay14.isEqual((org.joda.time.ReadablePartial) timeOfDay28);
        int int32 = timeOfDay28.size();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.plus(readablePeriod8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay2.withPeriodAdded(readablePeriod10, (int) (short) 100);
        org.joda.time.LocalTime localTime13 = timeOfDay2.toLocalTime();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay2.plus(readablePeriod14);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay2.minusMinutes(3);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay20.millisOfSecond();
        java.lang.Object obj25 = null;
        boolean boolean26 = property24.equals(obj25);
        java.lang.String str27 = property24.getName();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay30.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay30.plusHours((int) (short) -1);
        int int36 = property24.compareTo((org.joda.time.ReadablePartial) timeOfDay35);
        org.joda.time.TimeOfDay.Property property37 = timeOfDay35.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay35.minusMinutes((int) (short) -1);
        boolean boolean40 = timeOfDay17.isEqual((org.joda.time.ReadablePartial) timeOfDay35);
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.minusHours((int) '#');
        org.joda.time.TimeOfDay.Property property44 = timeOfDay43.hourOfDay();
        java.lang.String str45 = property44.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay46 = property44.withMinimumValue();
        org.joda.time.Chronology chronology47 = timeOfDay46.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay17, chronology47);
        org.joda.time.Chronology chronology49 = timeOfDay48.getChronology();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "millisOfSecond" + "'", str27, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "13" + "'", str45, "13");
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(chronology49);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay11.millisOfSecond();
        int int16 = timeOfDay11.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay11.minusMillis((int) (byte) 1);
        org.joda.time.Chronology chronology19 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(13, (int) (byte) 0, (int) (byte) 1, (int) (short) 1, chronology19);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((int) (short) 0, 34, 58, chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((int) (short) -1, 2, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay12 = property6.withMaximumValue();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property6.getAsText(locale13);
        int int15 = property6.getMinimumValue();
        org.joda.time.DurationField durationField16 = property6.getRangeDurationField();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.joda.time.TimeOfDay timeOfDay46 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology49 = timeOfDay48.getChronology();
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay48.minusMinutes(0);
        org.joda.time.DateTime dateTime52 = timeOfDay51.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property53 = timeOfDay51.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay54 = property53.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay55.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology58 = timeOfDay57.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray59 = timeOfDay57.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay57.withSecondOfMinute(0);
        int int62 = property53.compareTo((org.joda.time.ReadablePartial) timeOfDay57);
        int[] intArray63 = timeOfDay57.getValues();
        boolean boolean64 = timeOfDay28.isAfter((org.joda.time.ReadablePartial) timeOfDay57);
        org.joda.time.TimeOfDay.Property property65 = timeOfDay57.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay57.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = timeOfDay67.toDateTimeToday(dateTimeZone68);
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
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray59);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.joda.time.TimeOfDay.Property property48 = timeOfDay2.millisOfSecond();
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
        org.junit.Assert.assertNotNull(property48);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        int int22 = property19.get();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property19.getAsText(locale23);
        java.util.Locale locale25 = null;
        int int26 = property19.getMaximumTextLength(locale25);
        org.joda.time.TimeOfDay timeOfDay27 = property19.getTimeOfDay();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(timeOfDay27);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusHours(999);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.minus(readablePeriod8);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay12.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay12.withSecondOfMinute(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = timeOfDay12.getFieldType((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay12.withPeriodAdded(readablePeriod19, (int) '4');
        boolean boolean22 = timeOfDay9.isBefore((org.joda.time.ReadablePartial) timeOfDay12);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay12.plusMillis((int) (short) 0);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeOfDay24);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology16);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((-1L), chronology16);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(chronology16);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay5.withChronologyRetainFields(chronology16);
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 36, chronology16);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((int) (short) 0, 22, chronology16);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay21);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) (byte) 1, (int) (short) 10);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.millisOfSecond();
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        java.lang.String str20 = property19.getAsString();
        int int21 = property19.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((long) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property32 = timeOfDay28.millisOfSecond();
        int int33 = property32.get();
        org.joda.time.DurationField durationField34 = property32.getDurationField();
        java.lang.Class<?> wildcardClass35 = durationField34.getClass();
        boolean boolean36 = timeOfDay25.equals((java.lang.Object) durationField34);
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology40 = timeOfDay39.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = timeOfDay39.getFieldTypes();
        org.joda.time.TimeOfDay.Property property42 = timeOfDay39.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay39.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay48 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology51 = timeOfDay50.getChronology();
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology51);
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(chronology51);
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay39.withChronologyRetainFields(chronology51);
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay55.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology58 = timeOfDay57.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray59 = timeOfDay57.getFieldTypes();
        org.joda.time.TimeOfDay.Property property60 = timeOfDay57.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay57.minusHours(999);
        org.joda.time.TimeOfDay.Property property63 = timeOfDay62.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property63.getFieldType();
        boolean boolean65 = timeOfDay39.isSupported(dateTimeFieldType64);
        int int66 = timeOfDay25.indexOf(dateTimeFieldType64);
        org.joda.time.Chronology chronology67 = timeOfDay25.getChronology();
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, 4, chronology67);
        int int69 = property19.compareTo((org.joda.time.ReadablePartial) timeOfDay68);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.plus(readablePeriod8);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay15.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay15.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay15.minusHours(999);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay20.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property21.getFieldType();
        boolean boolean23 = timeOfDay10.isSupported(dateTimeFieldType22);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay9.property(dateTimeFieldType22);
        org.joda.time.TimeOfDay.Property property25 = timeOfDay9.minuteOfHour();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DateTimeField dateTimeField27 = property25.getField();
        org.joda.time.TimeOfDay timeOfDay29 = property25.addToCopy(0);
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray34 = timeOfDay32.getFieldTypes();
        org.joda.time.TimeOfDay.Property property35 = timeOfDay32.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay32.minusHours(999);
        org.joda.time.TimeOfDay.Property property38 = timeOfDay37.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property38.getFieldType();
        java.lang.String str40 = property38.getAsShortText();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property38.getAsShortText(locale41);
        org.joda.time.TimeOfDay timeOfDay44 = property38.addWrapFieldToCopy((int) 'a');
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTimeToday(dateTimeZone46);
        boolean boolean48 = property25.equals((java.lang.Object) timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay5.withHourOfDay(1);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay5.withMillisOfSecond((int) ' ');
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.minusMinutes(0);
        org.joda.time.DateTime dateTime18 = timeOfDay17.toDateTimeToday();
        org.joda.time.DateTime dateTime19 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay5.withMinuteOfHour(36);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay21.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay23 = property22.withMinimumValue();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(timeOfDay23);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.String str7 = property6.toString();
        org.joda.time.DurationField durationField8 = property6.getDurationField();
        org.joda.time.TimeOfDay timeOfDay9 = property6.withMinimumValue();
        org.joda.time.DurationField durationField10 = property6.getDurationField();
        int int11 = property6.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay14.millisOfSecond();
        java.lang.String str19 = property18.toString();
        org.joda.time.DurationField durationField20 = property18.getDurationField();
        int int21 = property18.get();
        org.joda.time.TimeOfDay timeOfDay23 = property18.addToCopy((int) ' ');
        java.lang.String str24 = property18.getName();
        org.joda.time.TimeOfDay timeOfDay25 = property18.getTimeOfDay();
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.millisOfSecond();
        int int27 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[millisOfSecond]" + "'", str7, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 999 + "'", int11 == 999);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[millisOfSecond]" + "'", str19, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "millisOfSecond" + "'", str24, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay12 = property6.withMaximumValue();
        java.lang.String str13 = property6.getName();
        java.util.Locale locale14 = null;
        int int15 = property6.getMaximumShortTextLength(locale14);
        int int16 = property6.getMinimumValue();
        int int17 = property6.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "millisOfSecond" + "'", str13, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        int int7 = timeOfDay2.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.minusMillis((int) (byte) 1);
        int int10 = timeOfDay2.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay2.withMillisOfSecond(13);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withMillisOfSecond(1);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.plusHours(0);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.withHourOfDay(48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(17, 23, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay2.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusHours(59);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay8.plusHours((int) (byte) 0);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay12.secondOfMinute();
        java.lang.String str14 = property13.toString();
        int int15 = property13.getMaximumValue();
        int int16 = property13.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 3);
        org.joda.time.DateTime dateTime19 = timeOfDay18.toDateTimeToday();
        int int20 = property13.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Property[secondOfMinute]" + "'", str14, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 59 + "'", int16 == 59);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology6);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        org.joda.time.TimeOfDay timeOfDay12 = property9.addNoWrapToCopy(0);
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
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay34.plus(readablePeriod47);
        org.joda.time.Chronology chronology49 = timeOfDay34.getChronology();
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay12.withChronologyRetainFields(chronology49);
        org.joda.time.TimeOfDay timeOfDay58 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay60 = timeOfDay58.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology61 = timeOfDay60.getChronology();
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology61);
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology61);
        org.joda.time.TimeOfDay timeOfDay64 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay66 = timeOfDay64.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology67 = timeOfDay66.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray68 = timeOfDay66.getFieldTypes();
        org.joda.time.TimeOfDay.Property property69 = timeOfDay66.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay71 = timeOfDay66.minusHours(999);
        org.joda.time.TimeOfDay.Property property72 = timeOfDay71.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property72.getFieldType();
        int int74 = timeOfDay63.get(dateTimeFieldType73);
        int int75 = timeOfDay50.indexOf(dateTimeFieldType73);
        org.joda.time.TimeOfDay.Property property76 = timeOfDay50.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay77 = property76.withMinimumValue();
        int int78 = property76.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(timeOfDay12);
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
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(timeOfDay64);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(timeOfDay71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(timeOfDay77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        java.lang.String str10 = property6.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay11 = property6.withMinimumValue();
        int int12 = property6.getMaximumValueOverall();
        java.lang.String str13 = property6.getAsString();
        java.lang.String str14 = property6.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology21);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.plusSeconds(4);
        java.lang.String str26 = timeOfDay23.toString();
        org.joda.time.DateTime dateTime27 = timeOfDay23.toDateTimeToday();
        int int28 = property6.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 999 + "'", int12 == 999);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "T01:37:37.330" + "'", str26, "T01:37:37.330");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = timeOfDay28.toDateTimeToday(dateTimeZone29);
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
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        org.joda.time.TimeOfDay.Property property38 = timeOfDay21.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay21.withMillisOfSecond((int) (short) 10);
        org.joda.time.TimeOfDay.Property property41 = timeOfDay21.secondOfMinute();
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
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(chronology26);
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay2.withChronologyRetainFields(chronology26);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay2.minusHours(10);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay2.withMillisOfSecond(32);
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
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology31);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology31);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(chronology31);
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 999, chronology31);
        boolean boolean36 = timeOfDay17.isEqual((org.joda.time.ReadablePartial) timeOfDay35);
        org.joda.time.TimeOfDay.Property property37 = timeOfDay35.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay38 = property37.getTimeOfDay();
        int int39 = property37.get();
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
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay12 = property6.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.plusHours(100);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology21);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay23.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
        int int26 = timeOfDay12.get(dateTimeFieldType25);
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay12.plusMinutes((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay12.minusMillis(28);
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
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.millisOfSecond();
        java.util.Locale locale2 = null;
        java.lang.String str3 = property1.getAsText(locale2);
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay12.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property13.getFieldType();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusHours((int) '#');
        int int18 = timeOfDay15.getHourOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = timeOfDay15.getFieldTypes();
        int int20 = property13.compareTo((org.joda.time.ReadablePartial) timeOfDay15);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay15.plusMillis(4);
        java.lang.String str23 = timeOfDay22.toString();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.minus(readablePeriod24);
        int int26 = property1.compareTo((org.joda.time.ReadablePartial) timeOfDay25);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "930" + "'", str3, "930");
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "T00:00:00.004" + "'", str23, "T00:00:00.004");
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        org.joda.time.TimeOfDay timeOfDay23 = property19.addWrapFieldToCopy(13);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property19.getFieldType();
        org.joda.time.DateTimeField dateTimeField25 = property19.getField();
        java.lang.String str26 = property19.getName();
        java.lang.String str27 = property19.getAsText();
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
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "secondOfMinute" + "'", str26, "secondOfMinute");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(17, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.plus(readablePeriod7);
        int int9 = timeOfDay6.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.plusSeconds(0);
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis(0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = timeOfDay13.getValue(114);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 114");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay21.plus(readablePeriod34);
        org.joda.time.TimeOfDay.Property property36 = timeOfDay21.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay21.plusMillis(999);
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.plusMinutes(35);
        java.lang.String str41 = timeOfDay40.toString();
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
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "T00:35:01.000" + "'", str41, "T00:35:01.000");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        org.joda.time.TimeOfDay timeOfDay23 = property19.addWrapFieldToCopy(13);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay30.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property34 = timeOfDay30.millisOfSecond();
        int int35 = property34.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology39 = timeOfDay38.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = timeOfDay38.getFieldTypes();
        int int41 = property34.compareTo((org.joda.time.ReadablePartial) timeOfDay38);
        org.joda.time.TimeOfDay timeOfDay49 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology52 = timeOfDay51.getChronology();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology52);
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology52);
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay55.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology58 = timeOfDay57.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray59 = timeOfDay57.getFieldTypes();
        org.joda.time.TimeOfDay.Property property60 = timeOfDay57.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay57.minusHours(999);
        org.joda.time.TimeOfDay.Property property63 = timeOfDay62.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property63.getFieldType();
        int int65 = timeOfDay54.get(dateTimeFieldType64);
        int int66 = timeOfDay38.indexOf(dateTimeFieldType64);
        int int67 = timeOfDay27.get(dateTimeFieldType64);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = timeOfDay27.getValue(56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 56");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 999 + "'", int35 == 999);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 13 + "'", int67 == 13);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        int int5 = timeOfDay4.size();
        org.joda.time.TimeOfDay.Property property6 = timeOfDay4.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        int int10 = timeOfDay9.size();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.plusMillis((int) (short) 0);
        int int13 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay12);
        org.joda.time.TimeOfDay timeOfDay14 = property6.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay17.millisOfSecond();
        java.lang.Object obj22 = null;
        boolean boolean23 = property21.equals(obj22);
        java.lang.String str24 = property21.getName();
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology28 = timeOfDay27.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay27.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay27.plusHours((int) (short) -1);
        int int33 = property21.compareTo((org.joda.time.ReadablePartial) timeOfDay32);
        org.joda.time.TimeOfDay timeOfDay34 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology37 = timeOfDay36.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay36.minusMinutes(0);
        boolean boolean40 = property21.equals((java.lang.Object) timeOfDay36);
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology44 = timeOfDay43.getChronology();
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay43.minusMinutes(0);
        org.joda.time.DateTime dateTime47 = timeOfDay46.toDateTimeToday();
        org.joda.time.DateTime dateTime48 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        int int49 = property6.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime50 = timeOfDay1.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.TimeOfDay.Property property51 = timeOfDay1.secondOfMinute();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "millisOfSecond" + "'", str24, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(100, 48, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.DateTimeField dateTimeField4 = timeOfDay2.getField(0);
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay.Property property10 = timeOfDay7.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay.Property property16 = timeOfDay13.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay13.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology25);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(chronology25);
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay13.withChronologyRetainFields(chronology25);
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay7.withChronologyRetainFields(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((java.lang.Object) 0, chronology25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay29);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay2.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay2.minusSeconds(0);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay2.plusSeconds(3);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withMinuteOfHour(28);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay12.minus(readablePeriod15);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeOfDay16.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay4.plusHours((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay4.withMinuteOfHour((int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay14.millisOfSecond();
        java.lang.Object obj19 = null;
        boolean boolean20 = property18.equals(obj19);
        java.lang.String str21 = property18.getName();
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay24.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay24.plusHours((int) (short) -1);
        int int30 = property18.compareTo((org.joda.time.ReadablePartial) timeOfDay29);
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology34 = timeOfDay33.getChronology();
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay33.minusMinutes(0);
        boolean boolean37 = property18.equals((java.lang.Object) timeOfDay33);
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology41 = timeOfDay40.getChronology();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay40.minusMinutes(0);
        org.joda.time.DateTime dateTime44 = timeOfDay43.toDateTimeToday();
        org.joda.time.DateTime dateTime45 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay4.plusMinutes(3);
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.minusMillis(59);
        org.joda.time.TimeOfDay timeOfDay59 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay59.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology62 = timeOfDay61.getChronology();
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology62);
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology62);
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(chronology62);
        org.joda.time.TimeOfDay timeOfDay66 = new org.joda.time.TimeOfDay((long) ' ', chronology62);
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay50.withChronologyRetainFields(chronology62);
        org.joda.time.TimeOfDay timeOfDay68 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, chronology62);
        org.joda.time.TimeOfDay timeOfDay69 = new org.joda.time.TimeOfDay((long) (short) 10, chronology62);
        org.joda.time.Chronology chronology70 = timeOfDay69.getChronology();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "millisOfSecond" + "'", str21, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(chronology70);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 34);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusHours((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.withPeriodAdded(readablePeriod6, 34);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.minusMinutes(0);
        org.joda.time.LocalTime localTime15 = timeOfDay11.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay11.withHourOfDay((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = timeOfDay17.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        boolean boolean21 = timeOfDay1.isBefore((org.joda.time.ReadablePartial) timeOfDay5);
        org.joda.time.LocalTime localTime22 = timeOfDay1.toLocalTime();
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localTime22);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusSeconds((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay7.millisOfSecond();
        java.lang.Object obj12 = null;
        boolean boolean13 = property11.equals(obj12);
        java.lang.String str14 = property11.getName();
        int int15 = property11.getMaximumValueOverall();
        java.lang.String str16 = property11.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property11.getFieldType();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay4.withField(dateTimeFieldType17, 0);
        int int20 = timeOfDay19.getMillisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "millisOfSecond" + "'", str14, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 999 + "'", int15 == 999);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay6 = property5.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property5.getFieldType();
        org.joda.time.TimeOfDay timeOfDay9 = property5.addNoWrapToCopy(13);
        org.joda.time.TimeOfDay timeOfDay10 = property5.getTimeOfDay();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        org.joda.time.TimeOfDay timeOfDay27 = property6.addNoWrapToCopy((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusHours((int) (byte) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = timeOfDay29.getFieldTypes();
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
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        int int10 = property6.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay12 = property6.addToCopy(0);
        org.joda.time.DurationField durationField13 = property6.getDurationField();
        org.joda.time.TimeOfDay timeOfDay14 = property6.withMaximumValue();
        java.lang.String str15 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay18.millisOfSecond();
        java.lang.Object obj23 = null;
        boolean boolean24 = property22.equals(obj23);
        java.lang.String str25 = property22.getName();
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay28.plusHours((int) (short) -1);
        int int34 = property22.compareTo((org.joda.time.ReadablePartial) timeOfDay33);
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology38 = timeOfDay37.getChronology();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay37.minusMinutes(0);
        boolean boolean41 = property22.equals((java.lang.Object) timeOfDay37);
        org.joda.time.TimeOfDay timeOfDay42 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay42.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology45 = timeOfDay44.getChronology();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay44.minusMinutes(0);
        org.joda.time.DateTime dateTime48 = timeOfDay47.toDateTimeToday();
        org.joda.time.DateTime dateTime49 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = timeOfDay37.toDateTimeToday(dateTimeZone50);
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay37.withMillisOfSecond(4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = timeOfDay53.toString(dateTimeFormatter54);
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property57 = timeOfDay53.minuteOfHour();
        java.lang.String str58 = timeOfDay53.toString();
        int int59 = timeOfDay53.getHourOfDay();
        int int60 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay53);
        java.util.Locale locale61 = null;
        java.lang.String str62 = property6.getAsShortText(locale61);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "millisOfSecond" + "'", str25, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "T00:00:00.004" + "'", str55, "T00:00:00.004");
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "T00:00:00.004" + "'", str58, "T00:00:00.004");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1" + "'", str62, "1");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 13);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusMillis((int) 'a');
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay1);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay1.minusMinutes((int) (byte) 10);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay6);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.plusHours((int) (short) -1);
        int int8 = timeOfDay2.getHourOfDay();
        int int9 = timeOfDay2.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay2.minus(readablePeriod10);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.plusHours((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay15.withPeriodAdded(readablePeriod16, 34);
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay21.minusMinutes(0);
        org.joda.time.LocalTime localTime25 = timeOfDay21.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay21.withHourOfDay((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = timeOfDay27.toDateTimeToday(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime31 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        java.lang.String str33 = timeOfDay2.toString("492");
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "492" + "'", str33, "492");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology8);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(chronology8);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay10.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property11.getFieldType();
        org.joda.time.TimeOfDay timeOfDay14 = property11.addNoWrapToCopy(0);
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay17.millisOfSecond();
        java.lang.Object obj22 = null;
        boolean boolean23 = property21.equals(obj22);
        java.lang.String str24 = property21.getName();
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology28 = timeOfDay27.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay27.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay27.plusHours((int) (short) -1);
        int int33 = property21.compareTo((org.joda.time.ReadablePartial) timeOfDay32);
        org.joda.time.TimeOfDay timeOfDay34 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology37 = timeOfDay36.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay36.minusMinutes(0);
        boolean boolean40 = property21.equals((java.lang.Object) timeOfDay36);
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology44 = timeOfDay43.getChronology();
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay43.minusMinutes(0);
        org.joda.time.DateTime dateTime47 = timeOfDay46.toDateTimeToday();
        org.joda.time.DateTime dateTime48 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay36.plus(readablePeriod49);
        org.joda.time.Chronology chronology51 = timeOfDay36.getChronology();
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay14.withChronologyRetainFields(chronology51);
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(13, 11, chronology51);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "millisOfSecond" + "'", str24, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(timeOfDay52);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusHours(999);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = timeOfDay7.isSupported(dateTimeFieldType9);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay7.hourOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (byte) 100);
        boolean boolean15 = timeOfDay7.isAfter((org.joda.time.ReadablePartial) timeOfDay14);
        int int17 = timeOfDay14.getValue(0);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.plus(readablePeriod6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay5.getFieldTypes();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay5.withHourOfDay(1);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay5.withMillisOfSecond((int) ' ');
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.minusMinutes(0);
        org.joda.time.DateTime dateTime18 = timeOfDay17.toDateTimeToday();
        org.joda.time.DateTime dateTime19 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay5.plus(readablePeriod20);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay5.secondOfMinute();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = timeOfDay5.toString(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "T00:00:00.001" + "'", str24, "T00:00:00.001");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay22.withMinuteOfHour(10);
        boolean boolean28 = timeOfDay17.isEqual((org.joda.time.ReadablePartial) timeOfDay22);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((long) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology34 = timeOfDay33.getChronology();
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay33.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property37 = timeOfDay33.millisOfSecond();
        int int38 = property37.get();
        org.joda.time.DurationField durationField39 = property37.getDurationField();
        java.lang.Class<?> wildcardClass40 = durationField39.getClass();
        boolean boolean41 = timeOfDay30.equals((java.lang.Object) durationField39);
        org.joda.time.TimeOfDay timeOfDay42 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay42.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology45 = timeOfDay44.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray46 = timeOfDay44.getFieldTypes();
        org.joda.time.TimeOfDay.Property property47 = timeOfDay44.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay44.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay53 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay53.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology56 = timeOfDay55.getChronology();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology56);
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(chronology56);
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay44.withChronologyRetainFields(chronology56);
        org.joda.time.TimeOfDay timeOfDay60 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay60.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology63 = timeOfDay62.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray64 = timeOfDay62.getFieldTypes();
        org.joda.time.TimeOfDay.Property property65 = timeOfDay62.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay62.minusHours(999);
        org.joda.time.TimeOfDay.Property property68 = timeOfDay67.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property68.getFieldType();
        boolean boolean70 = timeOfDay44.isSupported(dateTimeFieldType69);
        int int71 = timeOfDay30.indexOf(dateTimeFieldType69);
        org.joda.time.TimeOfDay timeOfDay73 = timeOfDay17.withField(dateTimeFieldType69, 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = null;
        java.lang.String str75 = timeOfDay73.toString(dateTimeFormatter74);
        org.joda.time.TimeOfDay.Property property76 = timeOfDay73.secondOfMinute();
        int int77 = property76.getMaximumValue();
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
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(chronology56);
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(timeOfDay73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "T23:00:01.001" + "'", str75, "T23:00:01.001");
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 59 + "'", int77 == 59);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay9 = property7.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 0);
        boolean boolean12 = timeOfDay9.isAfter((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay11.millisOfSecond();
        java.lang.String str14 = timeOfDay11.toString();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay11.withSecondOfMinute(0);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "T00:00:00.000" + "'", str14, "T00:00:00.000");
        org.junit.Assert.assertNotNull(timeOfDay16);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        org.joda.time.TimeOfDay timeOfDay23 = property19.addNoWrapToCopy((int) ' ');
        java.util.Locale locale24 = null;
        java.lang.String str25 = property19.getAsText(locale24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property19.getFieldType();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        org.joda.time.TimeOfDay timeOfDay23 = property19.addNoWrapToCopy((int) ' ');
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology27 = timeOfDay26.getChronology();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay26.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property30 = timeOfDay26.millisOfSecond();
        java.lang.Object obj31 = null;
        boolean boolean32 = property30.equals(obj31);
        java.lang.String str33 = property30.getName();
        org.joda.time.TimeOfDay timeOfDay34 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology37 = timeOfDay36.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay36.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay36.plusHours((int) (short) -1);
        int int42 = property30.compareTo((org.joda.time.ReadablePartial) timeOfDay41);
        org.joda.time.DateTimeField dateTimeField43 = property30.getField();
        java.lang.String str44 = property30.getAsText();
        java.lang.String str45 = property30.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property30.getFieldType();
        int int47 = timeOfDay23.indexOf(dateTimeFieldType46);
        org.joda.time.TimeOfDay.Property property48 = timeOfDay23.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay50 = property48.addWrapFieldToCopy(999);
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
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "millisOfSecond" + "'", str33, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1" + "'", str44, "1");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1" + "'", str45, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(timeOfDay50);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = timeOfDay5.toString(dateTimeFormatter9);
        boolean boolean11 = timeOfDay2.isEqual((org.joda.time.ReadablePartial) timeOfDay5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = timeOfDay2.getField((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "T00:00:00.001" + "'", str10, "T00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.plus(readablePeriod7);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay6.plusSeconds((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.minusMinutes(0);
        org.joda.time.DateTime dateTime17 = timeOfDay16.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay16.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay19 = property18.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.minusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = timeOfDay24.getFieldTypes();
        org.joda.time.TimeOfDay.Property property27 = timeOfDay24.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay28 = property27.withMinimumValue();
        boolean boolean29 = timeOfDay21.isAfter((org.joda.time.ReadablePartial) timeOfDay28);
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.minusSeconds(37);
        boolean boolean32 = timeOfDay6.isEqual((org.joda.time.ReadablePartial) timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay2.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay8.minus(readablePeriod10);
        int int12 = timeOfDay8.size();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay8.plusMinutes((-1));
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay8.plus(readablePeriod15);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology20 = timeOfDay19.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay19.minusMinutes(0);
        org.joda.time.DateTime dateTime23 = timeOfDay22.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property24 = timeOfDay22.secondOfMinute();
        java.util.Locale locale26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = property24.setCopy("13", locale26);
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay30.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property34 = timeOfDay30.millisOfSecond();
        java.lang.Object obj35 = null;
        boolean boolean36 = property34.equals(obj35);
        java.util.Locale locale37 = null;
        int int38 = property34.getMaximumShortTextLength(locale37);
        org.joda.time.TimeOfDay timeOfDay39 = property34.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay39.withMinuteOfHour(1);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = timeOfDay41.toDateTimeToday(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime45 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.TimeOfDay.Property property46 = timeOfDay16.millisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        int int10 = property6.getMaximumValueOverall();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property6.getAsShortText(locale11);
        int int13 = property6.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property6.getFieldType();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 999 + "'", int13 == 999);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay14.minusMinutes((int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay14.withSecondOfMinute(37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = timeOfDay22.toString(dateTimeFormatter23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = timeOfDay22.toDateTimeToday(dateTimeZone25);
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
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "T00:00:37.001" + "'", str24, "T00:00:37.001");
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology9);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((-1L), chronology9);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((int) (byte) 0, 37, chronology9);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology9);
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.secondOfMinute();
        java.lang.String str15 = property14.getAsString();
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology27 = timeOfDay26.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology27);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology27);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(chronology27);
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 999, chronology27);
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.plusMinutes(1);
        org.joda.time.TimeOfDay.Property property34 = timeOfDay31.secondOfMinute();
        org.joda.time.DurationField durationField35 = property34.getDurationField();
        org.joda.time.TimeOfDay timeOfDay37 = property34.setCopy((int) ' ');
        int[] intArray38 = timeOfDay37.getValues();
        int int39 = property14.compareTo((org.joda.time.ReadablePartial) timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "40" + "'", str15, "40");
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 32, 999]");
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.plus(readablePeriod7);
        int int9 = timeOfDay6.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.plusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeOfDay6.getValue(178);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 178");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeOfDay11);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay17.getFields();
        int int20 = timeOfDay17.getSecondOfMinute();
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
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addNoWrapToCopy(0);
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
        org.joda.time.TimeOfDay timeOfDay33 = property13.withMinimumValue();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray34 = timeOfDay33.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology38 = timeOfDay37.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay33.withChronologyRetainFields(chronology38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay39.minus(readablePeriod40);
        org.joda.time.TimeOfDay timeOfDay42 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay42.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology45 = timeOfDay44.getChronology();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay44.minusMinutes(0);
        org.joda.time.DateTime dateTime48 = timeOfDay47.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property49 = timeOfDay47.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay50 = property49.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay51 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay51.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology54 = timeOfDay53.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray55 = timeOfDay53.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay53.withSecondOfMinute(0);
        int int58 = property49.compareTo((org.joda.time.ReadablePartial) timeOfDay53);
        boolean boolean59 = timeOfDay39.isBefore((org.joda.time.ReadablePartial) timeOfDay53);
        boolean boolean60 = property4.equals((java.lang.Object) boolean59);
        java.lang.String str61 = property4.toString();
        org.joda.time.TimeOfDay timeOfDay63 = property4.addToCopy((int) (short) 100);
        java.lang.String str64 = property4.getName();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
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
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray34);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Property[millisOfSecond]" + "'", str61, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "millisOfSecond" + "'", str64, "millisOfSecond");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withMillisOfSecond(37);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay8.withHourOfDay(3);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay8.minuteOfHour();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusHours(999);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        java.util.Locale locale10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = property8.setCopy("13", locale10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.plus(readablePeriod12);
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay16.getFieldTypes();
        org.joda.time.TimeOfDay.Property property19 = timeOfDay16.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay16.minusHours(999);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay21.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = timeOfDay21.isSupported(dateTimeFieldType23);
        org.joda.time.TimeOfDay.Property property25 = timeOfDay21.hourOfDay();
        boolean boolean26 = timeOfDay13.isEqual((org.joda.time.ReadablePartial) timeOfDay21);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = timeOfDay13.getFieldType(1);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology11);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology11);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology11);
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 999, chronology11);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.plusMinutes(1);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay15.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.TimeOfDay timeOfDay21 = property18.addNoWrapToCopy(0);
        org.joda.time.DurationField durationField22 = property18.getRangeDurationField();
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 100);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.withHourOfDay(13);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.plusMillis(999);
        org.joda.time.LocalTime localTime8 = timeOfDay7.toLocalTime();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis((int) (byte) -1);
        int int8 = timeOfDay7.size();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusMillis((int) (short) 0);
        int int11 = property4.compareTo((org.joda.time.ReadablePartial) timeOfDay10);
        org.joda.time.TimeOfDay timeOfDay12 = property4.withMinimumValue();
        org.joda.time.DurationField durationField13 = property4.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField14 = property4.getField();
        org.joda.time.TimeOfDay timeOfDay16 = property4.setCopy(1);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis((int) (byte) -1);
        int int20 = timeOfDay19.size();
        org.joda.time.TimeOfDay.Property property21 = timeOfDay19.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay23 = property21.addNoWrapToCopy(0);
        int int24 = property21.getMinimumValueOverall();
        boolean boolean25 = property4.equals((java.lang.Object) property21);
        org.joda.time.TimeOfDay timeOfDay27 = property4.addNoWrapToCopy(58);
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = timeOfDay30.getFieldTypes();
        org.joda.time.TimeOfDay.Property property33 = timeOfDay30.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay30.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay39 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay39.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology42 = timeOfDay41.getChronology();
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology42);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(chronology42);
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay30.withChronologyRetainFields(chronology42);
        org.joda.time.TimeOfDay timeOfDay46 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology49 = timeOfDay48.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray50 = timeOfDay48.getFieldTypes();
        org.joda.time.TimeOfDay.Property property51 = timeOfDay48.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay48.minusHours(999);
        org.joda.time.Chronology chronology54 = timeOfDay53.getChronology();
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(chronology54);
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay30.withChronologyRetainFields(chronology54);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay56.minus(readablePeriod57);
        int int59 = timeOfDay27.compareTo((org.joda.time.ReadablePartial) timeOfDay58);
        org.joda.time.TimeOfDay.Property property60 = timeOfDay58.millisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(property60);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        int int14 = timeOfDay1.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay1.plusMinutes(59);
        org.joda.time.DateTime dateTime17 = timeOfDay1.toDateTimeToday();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addWrapFieldToCopy((int) (byte) 0);
        int int7 = property4.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay.Property property13 = timeOfDay10.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay14 = property13.withMinimumValue();
        java.lang.Object obj15 = null;
        boolean boolean16 = property13.equals(obj15);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusHours((int) '#');
        org.joda.time.TimeOfDay.Property property20 = timeOfDay19.hourOfDay();
        int int21 = property13.compareTo((org.joda.time.ReadablePartial) timeOfDay19);
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay19.plusSeconds(3);
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology27 = timeOfDay26.getChronology();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay26.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property30 = timeOfDay26.millisOfSecond();
        java.lang.Object obj31 = null;
        boolean boolean32 = property30.equals(obj31);
        java.lang.String str33 = property30.getName();
        org.joda.time.TimeOfDay timeOfDay34 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology37 = timeOfDay36.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay36.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay36.plusHours((int) (short) -1);
        int int42 = property30.compareTo((org.joda.time.ReadablePartial) timeOfDay41);
        org.joda.time.TimeOfDay.Property property43 = timeOfDay41.secondOfMinute();
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTimeToday();
        org.joda.time.DateTime dateTime45 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        int int46 = property4.compareTo((org.joda.time.ReadableInstant) dateTime45);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "millisOfSecond" + "'", str33, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.millisOfSecond();
        org.joda.time.TimeOfDay.Property property2 = timeOfDay0.hourOfDay();
        java.util.Locale locale3 = null;
        java.lang.String str4 = property2.getAsShortText(locale3);
        int int5 = property2.get();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay5.withHourOfDay(1);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay5.withMillisOfSecond((int) ' ');
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.minusMinutes(0);
        org.joda.time.DateTime dateTime18 = timeOfDay17.toDateTimeToday();
        org.joda.time.DateTime dateTime19 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay5.withMinuteOfHour(36);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay21.secondOfMinute();
        java.util.Locale locale23 = null;
        int int24 = property22.getMaximumTextLength(locale23);
        org.joda.time.TimeOfDay timeOfDay26 = property22.addWrapFieldToCopy(22);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(timeOfDay26);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay6 = property5.withMinimumValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = property5.equals(obj7);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusHours((int) '#');
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.hourOfDay();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay15 = property5.addToCopy(59);
        java.util.Locale locale16 = null;
        java.lang.String str17 = property5.getAsText(locale16);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.secondOfMinute();
        int int8 = property7.getMinimumValue();
        int int9 = property7.getMaximumValueOverall();
        java.util.Locale locale10 = null;
        int int11 = property7.getMaximumTextLength(locale10);
        org.joda.time.TimeOfDay timeOfDay12 = property7.getTimeOfDay();
        int int13 = property7.get();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology6);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.plusSeconds(4);
        java.lang.String str11 = timeOfDay8.toString();
        org.joda.time.Chronology chronology12 = timeOfDay8.getChronology();
        org.joda.time.Chronology chronology13 = timeOfDay8.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay8.withSecondOfMinute(4);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay8.minusMinutes((int) (byte) 100);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis((int) (short) 0);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(timeOfDay10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "T01:37:41.757" + "'", str11, "T01:37:41.757");
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        int int10 = property6.get();
        java.lang.String str11 = property6.getName();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "millisOfSecond" + "'", str11, "millisOfSecond");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology13);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology13);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(chronology13);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((long) ' ', chronology13);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay1, chronology13);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withMillisOfSecond((int) (short) 100);
        int int21 = timeOfDay18.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay18.plusSeconds(30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = timeOfDay23.toString(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 23 + "'", int21 == 23);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "T00:00:29.999" + "'", str25, "T00:00:29.999");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(43, (int) (byte) 0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay6 = property5.withMinimumValue();
        java.util.Locale locale8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = property5.setCopy("0", locale8);
        org.joda.time.TimeOfDay.Property property10 = timeOfDay9.minuteOfHour();
        org.joda.time.DurationField durationField11 = property10.getRangeDurationField();
        int int12 = property10.getMinimumValueOverall();
        java.lang.String str13 = property10.getAsShortText();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology7 = timeOfDay6.getChronology();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology7);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((-1L), chronology7);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay12.millisOfSecond();
        java.lang.Object obj17 = null;
        boolean boolean18 = property16.equals(obj17);
        java.lang.String str19 = property16.getName();
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay22.plusHours((int) (short) -1);
        int int28 = property16.compareTo((org.joda.time.ReadablePartial) timeOfDay27);
        org.joda.time.TimeOfDay.Property property29 = timeOfDay27.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay31 = property29.setCopy((int) ' ');
        org.joda.time.TimeOfDay timeOfDay33 = property29.addNoWrapToCopy((int) ' ');
        boolean boolean34 = timeOfDay9.isBefore((org.joda.time.ReadablePartial) timeOfDay33);
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay33.plusHours(161);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay33.minus(readablePeriod37);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "millisOfSecond" + "'", str19, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay16.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property20 = timeOfDay16.millisOfSecond();
        java.lang.Object obj21 = null;
        boolean boolean22 = property20.equals(obj21);
        java.lang.String str23 = property20.getName();
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology27 = timeOfDay26.getChronology();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay26.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay26.plusHours((int) (short) -1);
        int int32 = property20.compareTo((org.joda.time.ReadablePartial) timeOfDay31);
        org.joda.time.TimeOfDay.Property property33 = timeOfDay31.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay35 = property33.setCopy((int) ' ');
        org.joda.time.TimeOfDay timeOfDay37 = property33.addWrapFieldToCopy(13);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property33.getFieldType();
        boolean boolean39 = timeOfDay1.isSupported(dateTimeFieldType38);
        org.joda.time.TimeOfDay.Property property40 = timeOfDay1.minuteOfHour();
        org.joda.time.DurationField durationField41 = property40.getRangeDurationField();
        int int42 = property40.getMinimumValue();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "millisOfSecond" + "'", str23, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay2.withHourOfDay((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = timeOfDay2.getFieldType(0);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.plusHours((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withMinuteOfHour((int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay12.millisOfSecond();
        java.lang.Object obj17 = null;
        boolean boolean18 = property16.equals(obj17);
        java.lang.String str19 = property16.getName();
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay22.plusHours((int) (short) -1);
        int int28 = property16.compareTo((org.joda.time.ReadablePartial) timeOfDay27);
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay31.minusMinutes(0);
        boolean boolean35 = property16.equals((java.lang.Object) timeOfDay31);
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology39 = timeOfDay38.getChronology();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay38.minusMinutes(0);
        org.joda.time.DateTime dateTime42 = timeOfDay41.toDateTimeToday();
        org.joda.time.DateTime dateTime43 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime44 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay2.plusMinutes(3);
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.minusMillis(59);
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay46.minusMinutes((int) (byte) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = timeOfDay46.getFieldTypes();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "millisOfSecond" + "'", str19, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray51);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay6 = property5.withMinimumValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = property5.equals(obj7);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusHours((int) '#');
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.hourOfDay();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay11.plusSeconds(3);
        org.joda.time.DateTime dateTime16 = timeOfDay15.toDateTimeToday();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(dateTimeZone3);
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.minusMinutes(0);
        org.joda.time.LocalTime localTime11 = timeOfDay7.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay7.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay7.minusSeconds(0);
        boolean boolean16 = timeOfDay4.isEqual((org.joda.time.ReadablePartial) timeOfDay15);
        int int17 = timeOfDay4.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay4.plusMinutes(59);
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology31);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology31);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(chronology31);
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 999, chronology31);
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay19.withChronologyRetainFields(chronology31);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((int) (short) 1, 15, 35, chronology31);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay36);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 100);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology7 = timeOfDay6.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property10 = timeOfDay6.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay13.millisOfSecond();
        java.lang.Object obj18 = null;
        boolean boolean19 = property17.equals(obj18);
        java.lang.String str20 = property17.getName();
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology24 = timeOfDay23.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay23.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay23.plusHours((int) (short) -1);
        int int29 = property17.compareTo((org.joda.time.ReadablePartial) timeOfDay28);
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay32.minusMinutes(0);
        boolean boolean36 = property17.equals((java.lang.Object) timeOfDay32);
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology40 = timeOfDay39.getChronology();
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay39.minusMinutes(0);
        org.joda.time.DateTime dateTime43 = timeOfDay42.toDateTimeToday();
        org.joda.time.DateTime dateTime44 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay32.plus(readablePeriod45);
        int int47 = property10.compareTo((org.joda.time.ReadablePartial) timeOfDay32);
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay32.plusSeconds((int) (byte) 0);
        int int50 = timeOfDay3.compareTo((org.joda.time.ReadablePartial) timeOfDay49);
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay49.plusMinutes(178);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "millisOfSecond" + "'", str20, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(timeOfDay52);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 13);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plus(readablePeriod2);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusMillis((int) 'a');
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = timeOfDay11.toString(dateTimeFormatter15);
        boolean boolean17 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology28 = timeOfDay27.getChronology();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology28);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology28);
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology34 = timeOfDay33.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray35 = timeOfDay33.getFieldTypes();
        org.joda.time.TimeOfDay.Property property36 = timeOfDay33.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay33.minusHours(999);
        org.joda.time.TimeOfDay.Property property39 = timeOfDay38.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        int int41 = timeOfDay30.get(dateTimeFieldType40);
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay11.withField(dateTimeFieldType40, (int) '#');
        boolean boolean44 = timeOfDay3.isSupported(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "T00:00:00.001" + "'", str16, "T00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        int int7 = timeOfDay2.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.minusMillis((int) (byte) 1);
        int int10 = timeOfDay2.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay2.withMillisOfSecond(13);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withMillisOfSecond(1);
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = timeOfDay14.isEqual(readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (byte) -1);
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = timeOfDay1.toDateTimeToday(dateTimeZone3);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay1.minusHours(178);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(timeOfDay6);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay11.withSecondOfMinute(0);
        int int16 = property7.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        java.util.Locale locale18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = property7.setCopy("0", locale18);
        java.lang.String str20 = property7.getName();
        int int21 = property7.getMaximumValue();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "secondOfMinute" + "'", str20, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.plus(readablePeriod7);
        int int9 = timeOfDay6.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.plusSeconds(0);
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis(0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay11.plus(readablePeriod14);
        java.lang.Class<?> wildcardClass16 = timeOfDay11.getClass();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}
