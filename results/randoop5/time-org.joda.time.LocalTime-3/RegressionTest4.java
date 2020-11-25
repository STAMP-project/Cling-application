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
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property2.addWrapFieldToCopy(57);
        org.joda.time.LocalTime localTime8 = property2.roundHalfCeilingCopy();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        boolean boolean11 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.LocalTime.Property property6 = localTime3.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property6.getFieldType();
        org.joda.time.LocalTime localTime9 = property6.addNoWrapToCopy(37);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        int int18 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.LocalTime localTime20 = localTime17.plusHours(10);
        org.joda.time.LocalTime localTime22 = localTime17.minusSeconds(53);
        boolean boolean23 = localTime9.isEqual((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.LocalTime localTime27 = property26.getLocalTime();
        org.joda.time.LocalTime localTime28 = property26.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property26.getFieldType();
        org.joda.time.LocalTime localTime30 = property26.withMaximumValue();
        org.joda.time.LocalTime localTime31 = property26.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.LocalTime localTime37 = localTime35.plusMinutes((int) ' ');
        org.joda.time.LocalTime.Property property38 = localTime35.millisOfDay();
        org.joda.time.LocalTime localTime40 = property38.addNoWrapToCopy(43);
        org.joda.time.LocalTime localTime41 = localTime31.withFields((org.joda.time.ReadablePartial) localTime40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.LocalTime.Property property44 = localTime43.secondOfMinute();
        org.joda.time.LocalTime localTime46 = localTime43.withMillisOfDay((int) '#');
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        int int48 = localTime46.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.Interval interval52 = property51.toInterval();
        org.joda.time.LocalTime localTime53 = property51.roundFloorCopy();
        org.joda.time.LocalTime localTime55 = property51.addNoWrapToCopy((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(dateTimeZone56);
        org.joda.time.LocalTime.Property property58 = localTime57.secondOfMinute();
        org.joda.time.LocalTime localTime60 = localTime57.withMillisOfDay((int) '#');
        org.joda.time.LocalTime localTime62 = localTime60.minusHours(10);
        int int63 = localTime60.size();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime(dateTimeZone64);
        org.joda.time.LocalTime.Property property66 = localTime65.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime(dateTimeZone67);
        org.joda.time.LocalTime.Property property69 = localTime68.secondOfMinute();
        org.joda.time.Interval interval70 = property69.toInterval();
        org.joda.time.LocalTime localTime71 = property69.roundFloorCopy();
        int int72 = localTime65.compareTo((org.joda.time.ReadablePartial) localTime71);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime(dateTimeZone73);
        org.joda.time.LocalTime.Property property75 = localTime74.secondOfMinute();
        org.joda.time.LocalTime localTime76 = property75.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = property75.getFieldType();
        boolean boolean78 = localTime65.isSupported(dateTimeFieldType77);
        boolean boolean79 = localTime60.isSupported(dateTimeFieldType77);
        org.joda.time.LocalTime.Property property80 = localTime55.property(dateTimeFieldType77);
        boolean boolean81 = localTime46.isSupported(dateTimeFieldType77);
        org.joda.time.LocalTime localTime83 = localTime41.withField(dateTimeFieldType77, 16);
        org.joda.time.LocalTime.Property property84 = localTime9.property(dateTimeFieldType77);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = null;
        java.lang.String str86 = localTime9.toString(dateTimeFormatter85);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(property84);
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "01:56:35.295" + "'", str86, "01:56:35.295");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        java.lang.String str7 = property2.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property2.getFieldType();
        int int9 = property2.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = property12.addNoWrapToCopy((int) (byte) 10);
        java.util.Locale locale17 = null;
        java.lang.String str18 = property12.getAsText(locale17);
        boolean boolean19 = property2.equals((java.lang.Object) property12);
        org.joda.time.LocalTime localTime20 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property21 = localTime20.minuteOfHour();
        int int22 = property21.getMaximumValueOverall();
        java.lang.String str23 = property21.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondOfMinute" + "'", str7, "secondOfMinute");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35" + "'", str18, "35");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "56" + "'", str23, "56");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.LocalTime.Property property6 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime8 = property6.addNoWrapToCopy(43);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond((int) (byte) 100);
        int[] intArray11 = localTime8.getValues();
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday();
        java.util.Locale locale14 = null;
        java.lang.String str15 = localTime8.toString("01:53:59.038", locale14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 56, 35, 549]");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "01:53:59.038" + "'", str15, "01:53:59.038");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        java.lang.String str7 = property2.getName();
        java.lang.String str8 = property2.getName();
        org.joda.time.DateTimeField dateTimeField9 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondOfMinute" + "'", str7, "secondOfMinute");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "secondOfMinute" + "'", str8, "secondOfMinute");
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1606262404));
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(2);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1606269351));
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.setCopy("51");
        int[] intArray5 = localTime4.getValues();
        org.joda.time.DateTimeField dateTimeField7 = localTime4.getField(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime4.toDateTimeToday(dateTimeZone8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 56, 51, 673]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.minusHours(10);
        int int7 = localTime4.size();
        org.joda.time.LocalTime.Property property8 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1606262404));
        org.joda.time.LocalTime localTime12 = localTime10.minusMillis((int) (short) -1);
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localTime12);
        int int14 = localTime12.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 57 + "'", int14 == 57);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.setCopy("51");
        int[] intArray5 = localTime4.getValues();
        int int7 = localTime4.getValue(0);
        org.joda.time.DateTime dateTime8 = localTime4.toDateTimeToday();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property12.getFieldType();
        org.joda.time.LocalTime localTime16 = property12.withMinimumValue();
        org.joda.time.LocalTime localTime18 = property12.addCopy((long) (short) 100);
        org.joda.time.LocalTime localTime20 = localTime18.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localTime20.getFieldTypes();
        int int22 = localTime20.getMinuteOfHour();
        int int23 = localTime9.compareTo((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.LocalTime.Property property24 = localTime20.hourOfDay();
        boolean boolean25 = localTime4.isEqual((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.Chronology chronology26 = localTime4.getChronology();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime29 = localTime4.withPeriodAdded(readablePeriod27, (-1606255572));
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime31 = localTime4.minus(readablePeriod30);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 56, 51, 743]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 58 + "'", int22 == 58);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.minusMinutes((int) '4');
        org.joda.time.LocalTime.Property property19 = localTime18.hourOfDay();
        java.lang.String str20 = property19.getName();
        org.joda.time.LocalTime localTime21 = property19.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hourOfDay" + "'", str20, "hourOfDay");
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours(10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime7.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        int int21 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.LocalTime localTime23 = localTime20.plusHours(10);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime();
        int int25 = localTime24.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        int int34 = localTime27.compareTo((org.joda.time.ReadablePartial) localTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.LocalTime localTime38 = property37.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        boolean boolean40 = localTime27.isSupported(dateTimeFieldType39);
        org.joda.time.LocalTime.Property property41 = localTime24.property(dateTimeFieldType39);
        int int42 = localTime23.indexOf(dateTimeFieldType39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = localTime23.toString(dateTimeFormatter43);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray45 = localTime23.getFieldTypes();
        int int46 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalTime localTime48 = localTime7.minus(readablePeriod47);
        org.joda.time.LocalTime localTime50 = localTime7.plusSeconds((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone51);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.LocalTime localTime54 = property53.getLocalTime();
        org.joda.time.LocalTime localTime55 = property53.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property53.getFieldType();
        boolean boolean57 = property53.isLeap();
        org.joda.time.DurationField durationField58 = property53.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property53.getFieldType();
        int int60 = localTime7.get(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "11:56:35.000" + "'", str44, "11:56:35.000");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
// flaky:         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        java.lang.String str4 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35" + "'", str4, "35");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        boolean boolean6 = property2.isLeap();
        java.lang.String str7 = property2.getAsShortText();
        org.joda.time.LocalTime localTime8 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        int int13 = property11.getMaximumValueOverall();
        int int14 = property11.getMinimumValueOverall();
        org.joda.time.LocalTime localTime15 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime16 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime18.withPeriodAdded(readablePeriod19, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.LocalTime localTime28 = property26.roundFloorCopy();
        org.joda.time.LocalTime localTime29 = property26.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.LocalTime localTime33 = property32.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property32.getFieldType();
        int int35 = localTime29.get(dateTimeFieldType34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalTime localTime38 = localTime29.withPeriodAdded(readablePeriod36, (int) (short) 100);
        org.joda.time.LocalTime localTime40 = localTime29.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime42 = localTime29.minusMinutes((int) '4');
        org.joda.time.Chronology chronology43 = localTime29.getChronology();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((long) 46, chronology43);
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.fromMillisOfDay((long) 11, chronology43);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((java.lang.Object) localTime21, chronology43);
        int int47 = property11.compareTo((org.joda.time.ReadablePartial) localTime46);
        int int48 = property2.compareTo((org.joda.time.ReadablePartial) localTime46);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "36" + "'", str7, "36");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 36 + "'", int35 == 36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.minusHours(10);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime17 = localTime14.plusHours(10);
        int int18 = localTime17.getHourOfDay();
        boolean boolean19 = localTime6.isAfter((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.LocalTime localTime21 = localTime17.withMillisOfSecond(48);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalTime localTime27 = property25.roundFloorCopy();
        org.joda.time.LocalTime localTime29 = property25.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property25.getFieldType();
        int int31 = localTime22.get(dateTimeFieldType30);
        org.joda.time.LocalTime.Property property32 = localTime21.property(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        org.joda.time.LocalTime localTime34 = property32.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.LocalTime localTime38 = property37.getLocalTime();
        int int39 = property37.get();
        org.joda.time.LocalTime localTime41 = property37.addCopy((int) (byte) 1);
        java.lang.String str43 = localTime41.toString("49");
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.LocalTime localTime48 = localTime45.withMillisOfDay((int) '#');
        org.joda.time.LocalTime localTime50 = localTime48.minusHours(10);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalTime localTime52 = localTime50.minus(readablePeriod51);
        org.joda.time.LocalTime localTime54 = localTime50.minusMinutes((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalTime localTime56 = localTime50.plus(readablePeriod55);
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime();
        int int58 = localTime57.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(dateTimeZone59);
        org.joda.time.LocalTime.Property property61 = localTime60.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime(dateTimeZone62);
        org.joda.time.LocalTime.Property property64 = localTime63.secondOfMinute();
        org.joda.time.Interval interval65 = property64.toInterval();
        org.joda.time.LocalTime localTime66 = property64.roundFloorCopy();
        int int67 = localTime60.compareTo((org.joda.time.ReadablePartial) localTime66);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(dateTimeZone68);
        org.joda.time.LocalTime.Property property70 = localTime69.secondOfMinute();
        org.joda.time.LocalTime localTime71 = property70.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property70.getFieldType();
        boolean boolean73 = localTime60.isSupported(dateTimeFieldType72);
        org.joda.time.LocalTime.Property property74 = localTime57.property(dateTimeFieldType72);
        org.joda.time.LocalTime localTime76 = localTime57.plusMillis((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        org.joda.time.LocalTime localTime78 = localTime76.minus(readablePeriod77);
        org.joda.time.LocalTime localTime80 = localTime76.plusHours((-1606255688));
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.LocalTime localTime82 = new org.joda.time.LocalTime(dateTimeZone81);
        org.joda.time.LocalTime.Property property83 = localTime82.secondOfMinute();
        org.joda.time.LocalTime localTime84 = property83.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = property83.getFieldType();
        org.joda.time.LocalTime.Property property86 = localTime76.property(dateTimeFieldType85);
        boolean boolean87 = localTime56.isSupported(dateTimeFieldType85);
        org.joda.time.LocalTime.Property property88 = localTime41.property(dateTimeFieldType85);
        org.joda.time.LocalTime.Property property89 = localTime41.secondOfMinute();
        org.joda.time.LocalTime.Property property90 = localTime41.minuteOfHour();
        org.joda.time.LocalTime localTime92 = localTime41.plusSeconds((-1606262408));
        org.joda.time.DateTimeZone dateTimeZone93 = null;
        org.joda.time.DateTime dateTime94 = localTime92.toDateTimeToday(dateTimeZone93);
        int int95 = property32.compareTo((org.joda.time.ReadableInstant) dateTime94);
        org.joda.time.DurationField durationField96 = property32.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 36 + "'", int31 == 36);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 36 + "'", int39 == 36);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "49" + "'", str43, "49");
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertNotNull(dateTimeFieldType85);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(localTime92);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertNull(durationField96);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
        int int9 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime10 = property2.roundCeilingCopy();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.setCopy("51");
        int[] intArray5 = localTime4.getValues();
        org.joda.time.LocalTime localTime7 = localTime4.minusSeconds(6719483);
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 56, 51, 168]");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        org.joda.time.DurationField durationField9 = property2.getRangeDurationField();
        int int10 = property2.getMinimumValue();
        org.joda.time.LocalTime localTime11 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes(41);
        org.joda.time.LocalTime.Property property8 = localTime5.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime5.withHourOfDay((-1606262413));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262413 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 43);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.joda.time.LocalTime localTime6 = property4.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property4.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) dateTime10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = localTime11.toString("52", locale13);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime11);
        org.joda.time.LocalTime localTime17 = localTime15.withMinuteOfHour(41);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52" + "'", str14, "52");
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 54);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.joda.time.LocalTime localTime6 = property4.roundFloorCopy();
        org.joda.time.LocalTime localTime8 = property4.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property4.getFieldType();
        org.joda.time.LocalTime localTime11 = localTime1.withField(dateTimeFieldType9, 22);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime1.minus(readablePeriod12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = localTime1.toString("2", locale15);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2" + "'", str16, "2");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1606255426L), dateTimeZone1);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime12 = localTime9.withMillisOfDay((int) '#');
        org.joda.time.LocalTime localTime14 = localTime12.minusHours(10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        int int23 = localTime16.compareTo((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.LocalTime localTime25 = localTime22.plusHours(10);
        int int26 = localTime25.getHourOfDay();
        boolean boolean27 = localTime14.isAfter((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.LocalTime localTime29 = localTime25.withMillisOfSecond(48);
        boolean boolean30 = localTime7.isEqual((org.joda.time.ReadablePartial) localTime25);
        int int31 = localTime25.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.Interval interval35 = property34.toInterval();
        org.joda.time.LocalTime localTime36 = property34.roundFloorCopy();
        org.joda.time.LocalTime localTime38 = property34.addNoWrapToCopy((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime43 = localTime40.withMillisOfDay((int) '#');
        org.joda.time.LocalTime localTime45 = localTime43.minusHours(10);
        int int46 = localTime43.size();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.Interval interval53 = property52.toInterval();
        org.joda.time.LocalTime localTime54 = property52.roundFloorCopy();
        int int55 = localTime48.compareTo((org.joda.time.ReadablePartial) localTime54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(dateTimeZone56);
        org.joda.time.LocalTime.Property property58 = localTime57.secondOfMinute();
        org.joda.time.LocalTime localTime59 = property58.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property58.getFieldType();
        boolean boolean61 = localTime48.isSupported(dateTimeFieldType60);
        boolean boolean62 = localTime43.isSupported(dateTimeFieldType60);
        org.joda.time.LocalTime.Property property63 = localTime38.property(dateTimeFieldType60);
        int int64 = localTime25.indexOf(dateTimeFieldType60);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 36 + "'", int31 == 36);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(18);
        org.joda.time.LocalTime localTime5 = localTime1.withMillisOfDay(6839629);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        java.util.Locale locale6 = null;
        int int7 = property3.getMaximumShortTextLength(locale6);
        org.joda.time.LocalTime localTime8 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property11.addNoWrapToCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 43);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime23 = property20.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localTime23.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localTime17.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        int int27 = property11.getDifference((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        org.joda.time.LocalTime localTime33 = property30.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localTime33.toDateTimeToday(dateTimeZone34);
        int int36 = property11.getDifference((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTimeField dateTimeField37 = property11.getField();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime localTime41 = localTime39.plusMillis(41);
        int int42 = localTime41.getSecondOfMinute();
        boolean boolean43 = property11.equals((java.lang.Object) localTime41);
        boolean boolean44 = localTime8.isAfter((org.joda.time.ReadablePartial) localTime41);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(dateTimeZone48);
        org.joda.time.LocalTime.Property property50 = localTime49.secondOfMinute();
        org.joda.time.Interval interval51 = property50.toInterval();
        org.joda.time.LocalTime localTime52 = property50.roundFloorCopy();
        int int53 = localTime46.compareTo((org.joda.time.ReadablePartial) localTime52);
        org.joda.time.LocalTime localTime55 = localTime52.plusHours(10);
        org.joda.time.Chronology chronology56 = localTime55.getChronology();
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime((java.lang.Object) localTime41, chronology56);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((-1606255470L), chronology56);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1606255403) + "'", int27 == (-1606255403));
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1606262423) + "'", int36 == (-1606262423));
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(localTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 36 + "'", int42 == 36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(chronology56);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.minusHours(10);
        org.joda.time.LocalTime localTime8 = localTime6.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime10 = localTime8.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime8.plus(readablePeriod11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime15 = localTime8.withPeriodAdded(readablePeriod13, (-1606255660));
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime8.plus(readablePeriod16);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        int int19 = localTime18.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalTime localTime27 = property25.roundFloorCopy();
        int int28 = localTime21.compareTo((org.joda.time.ReadablePartial) localTime27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property31.getFieldType();
        boolean boolean34 = localTime21.isSupported(dateTimeFieldType33);
        org.joda.time.LocalTime.Property property35 = localTime18.property(dateTimeFieldType33);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localTime18.getFieldType(0);
        boolean boolean38 = localTime17.isSupported(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        int int10 = property8.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 43);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        int int18 = property2.getDifference((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.LocalTime localTime24 = property21.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localTime24.toDateTimeToday(dateTimeZone25);
        int int27 = property2.getDifference((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeField dateTimeField28 = property2.getField();
        org.joda.time.Interval interval29 = property2.toInterval();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.LocalTime localTime33 = property32.getLocalTime();
        boolean boolean35 = property32.equals((java.lang.Object) false);
        int int36 = property32.getLeapAmount();
        java.lang.String str37 = property32.getAsShortText();
        boolean boolean38 = property32.isLeap();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.Interval interval47 = property46.toInterval();
        org.joda.time.LocalTime localTime48 = property46.roundFloorCopy();
        org.joda.time.LocalTime localTime50 = property46.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone51);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.Interval interval54 = property53.toInterval();
        org.joda.time.LocalTime localTime55 = property53.roundFloorCopy();
        org.joda.time.LocalTime localTime56 = property53.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = localTime56.toDateTimeToday(dateTimeZone57);
        org.joda.time.DateTime dateTime59 = localTime50.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        int int60 = property41.compareTo((org.joda.time.ReadableInstant) dateTime59);
        long long61 = property32.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean62 = property2.equals((java.lang.Object) long61);
        org.joda.time.LocalTime localTime63 = property2.withMaximumValue();
        java.lang.String str64 = property2.getAsShortText();
        org.joda.time.LocalTime localTime65 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1606255403) + "'", int18 == (-1606255403));
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1606262423) + "'", int27 == (-1606262423));
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "36" + "'", str37, "36");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1606262399L) + "'", long61 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(localTime63);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "36" + "'", str64, "36");
        org.junit.Assert.assertNotNull(localTime65);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(716L);
        int int2 = localTime1.getSecondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getLeapDurationField();
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        java.lang.String str9 = property2.getAsShortText();
        int int10 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "36" + "'", str9, "36");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }
}
