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
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(chronology3);
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = timeOfDay5.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.plusSeconds(10);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.minusMinutes(0);
        org.joda.time.LocalTime localTime15 = timeOfDay11.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay11.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay17.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay21 = timeOfDay8.withField(dateTimeFieldType19, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.withMillisOfSecond(10);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addNoWrapToCopy(0);
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property4.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay10 = property4.setCopy("T00:00:00.010");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T00:00:00.010\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = timeOfDay5.toString(dateTimeFormatter9);
        boolean boolean11 = timeOfDay2.isEqual((org.joda.time.ReadablePartial) timeOfDay5);
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology22);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology22);
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology28 = timeOfDay27.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = timeOfDay27.getFieldTypes();
        org.joda.time.TimeOfDay.Property property30 = timeOfDay27.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay27.minusHours(999);
        org.joda.time.TimeOfDay.Property property33 = timeOfDay32.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        int int35 = timeOfDay24.get(dateTimeFieldType34);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay5.withField(dateTimeFieldType34, (int) '#');
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay5.plusSeconds(100);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay5.minusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay42 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay42.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology45 = timeOfDay44.getChronology();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay44.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property48 = timeOfDay44.millisOfSecond();
        java.lang.Object obj49 = null;
        boolean boolean50 = property48.equals(obj49);
        java.util.Locale locale51 = null;
        int int52 = property48.getMaximumShortTextLength(locale51);
        org.joda.time.TimeOfDay timeOfDay53 = property48.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay53.withMinuteOfHour(1);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = timeOfDay55.toDateTimeToday(dateTimeZone56);
        org.joda.time.DateTime dateTime58 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        int int59 = timeOfDay41.size();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "T00:00:00.001" + "'", str10, "T00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay6 = property5.withMinimumValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = property5.equals(obj7);
        org.joda.time.TimeOfDay timeOfDay9 = property5.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay11 = property5.addWrapFieldToCopy(0);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plus(readablePeriod13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeOfDay14.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(timeOfDay14);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay2.plusMillis((int) '#');
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withMillisOfSecond(100);
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay16.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = timeOfDay16.toString(dateTimeFormatter20);
        boolean boolean22 = timeOfDay13.isEqual((org.joda.time.ReadablePartial) timeOfDay16);
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology33);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology33);
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology39 = timeOfDay38.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = timeOfDay38.getFieldTypes();
        org.joda.time.TimeOfDay.Property property41 = timeOfDay38.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay38.minusHours(999);
        org.joda.time.TimeOfDay.Property property44 = timeOfDay43.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property44.getFieldType();
        int int46 = timeOfDay35.get(dateTimeFieldType45);
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay16.withField(dateTimeFieldType45, (int) '#');
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay8.withField(dateTimeFieldType45, (int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay8.minusMillis(2);
        org.joda.time.DateTime dateTime53 = timeOfDay8.toDateTimeToday();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "T00:00:00.001" + "'", str21, "T00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(dateTime53);
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
        int int9 = property6.getMaximumShortTextLength(locale8);
        int int10 = property6.getMinimumValueOverall();
        int int11 = property6.getMaximumValue();
        java.lang.String str12 = property6.getAsShortText();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 999 + "'", int11 == 999);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.joda.time.TimeOfDay timeOfDay14 = property4.withMaximumValue();
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.secondOfMinute();
        int int16 = property15.get();
        int int17 = property15.getMaximumValue();
        java.lang.String str18 = property15.getName();
        java.lang.String str19 = property15.getAsText();
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(chronology26);
        org.joda.time.Chronology chronology28 = timeOfDay27.getChronology();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay22.withChronologyRetainFields(chronology28);
        org.joda.time.TimeOfDay.Property property30 = timeOfDay22.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay32 = property30.addToCopy(999);
        boolean boolean33 = property15.equals((java.lang.Object) property30);
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
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "secondOfMinute" + "'", str18, "secondOfMinute");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        org.joda.time.TimeOfDay timeOfDay14 = property4.withMaximumValue();
        int int15 = property4.getMaximumValue();
        java.lang.String str16 = property4.getAsText();
        org.joda.time.TimeOfDay timeOfDay17 = property4.withMinimumValue();
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
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 999 + "'", int15 == 999);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(timeOfDay17);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay2.minusMillis((int) ' ');
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.millisOfSecond();
        int int13 = timeOfDay11.getMinuteOfHour();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay11.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.minusMinutes(0);
        org.joda.time.LocalTime localTime21 = timeOfDay17.toLocalTime();
        org.joda.time.TimeOfDay.Property property22 = timeOfDay17.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay17.plus(readablePeriod23);
        org.joda.time.TimeOfDay.Property property25 = timeOfDay17.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay17.minusMinutes(32);
        org.joda.time.DateTime dateTime28 = timeOfDay17.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(chronology32);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(chronology32);
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay17.withChronologyRetainFields(chronology32);
        int int36 = property14.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay4.millisOfSecond();
        java.lang.Object obj9 = null;
        boolean boolean10 = property8.equals(obj9);
        java.lang.String str11 = property8.getName();
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay14.plusHours((int) (short) -1);
        int int20 = property8.compareTo((org.joda.time.ReadablePartial) timeOfDay19);
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology24 = timeOfDay23.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay23.minusMinutes(0);
        boolean boolean27 = property8.equals((java.lang.Object) timeOfDay23);
        org.joda.time.TimeOfDay timeOfDay28 = property8.getTimeOfDay();
        java.lang.String str29 = timeOfDay28.toString();
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray34 = timeOfDay32.getFieldTypes();
        org.joda.time.TimeOfDay.Property property35 = timeOfDay32.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay32.minusHours(999);
        org.joda.time.TimeOfDay.Property property38 = timeOfDay37.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property38.getFieldType();
        org.joda.time.TimeOfDay.Property property40 = timeOfDay28.property(dateTimeFieldType39);
        org.joda.time.TimeOfDay timeOfDay45 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology48 = timeOfDay47.getChronology();
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology48);
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay((-1L), chronology48);
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay28.withChronologyRetainFields(chronology48);
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay((long) ' ', chronology48);
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(1L, chronology48);
        org.joda.time.TimeOfDay timeOfDay54 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay54.minusHours((int) '#');
        int int57 = timeOfDay54.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay54.withSecondOfMinute(13);
        org.joda.time.TimeOfDay timeOfDay60 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay60.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology63 = timeOfDay62.getChronology();
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay62.minusMinutes(0);
        org.joda.time.LocalTime localTime66 = timeOfDay62.toLocalTime();
        org.joda.time.TimeOfDay.Property property67 = timeOfDay62.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay62.plus(readablePeriod68);
        int int70 = timeOfDay59.compareTo((org.joda.time.ReadablePartial) timeOfDay69);
        boolean boolean71 = timeOfDay53.isBefore((org.joda.time.ReadablePartial) timeOfDay59);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.TimeOfDay timeOfDay73 = timeOfDay53.minus(readablePeriod72);
        int int74 = timeOfDay73.getHourOfDay();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "millisOfSecond" + "'", str11, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "T00:00:00.001" + "'", str29, "T00:00:00.001");
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(timeOfDay73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay5.millisOfSecond();
        java.util.Locale locale7 = null;
        int int8 = property6.getMaximumShortTextLength(locale7);
        org.joda.time.DateTimeField dateTimeField9 = property6.getField();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(dateTimeField9);
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
        int int15 = timeOfDay12.getValue(1);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusMinutes((int) '4');
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay12.plus(readablePeriod18);
        java.lang.String str20 = timeOfDay12.toString();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "T00:00:00.001" + "'", str20, "T00:00:00.001");
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
        java.lang.String str39 = property38.getName();
        org.joda.time.TimeOfDay timeOfDay40 = property38.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.minusMillis((int) (byte) -1);
        int int44 = timeOfDay43.size();
        org.joda.time.TimeOfDay.Property property45 = timeOfDay43.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay47 = property45.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay49 = property45.addWrapFieldToCopy((int) (byte) -1);
        int int50 = property38.compareTo((org.joda.time.ReadablePartial) timeOfDay49);
        org.joda.time.TimeOfDay timeOfDay51 = property38.withMinimumValue();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "minuteOfHour" + "'", str39, "minuteOfHour");
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(timeOfDay51);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay5.withHourOfDay(1);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay5.withHourOfDay(12);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay6 = property4.getTimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = timeOfDay6.getFieldType(46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 46");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 999 + "'", int5 == 999);
        org.junit.Assert.assertNotNull(timeOfDay6);
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
        java.lang.String str9 = property6.getName();
        java.lang.String str10 = property6.getAsShortText();
        java.lang.String str11 = property6.getAsShortText();
        int int12 = property6.get();
        org.joda.time.TimeOfDay timeOfDay14 = property6.addNoWrapToCopy((int) '#');
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay16 = property15.getTimeOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay16.getFieldTypes();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
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
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusHours((int) (short) -1);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology30);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology30);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(chronology30);
        org.joda.time.TimeOfDay timeOfDay34 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 999, chronology30);
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.plusMinutes(1);
        org.joda.time.TimeOfDay.Property property37 = timeOfDay34.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay39 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay40 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology43 = timeOfDay42.getChronology();
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay42.minusMinutes(0);
        org.joda.time.DateTime dateTime46 = timeOfDay45.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property47 = timeOfDay45.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay48 = property47.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.minusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay51 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay51.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology54 = timeOfDay53.getChronology();
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay53.minusMinutes(0);
        org.joda.time.DateTime dateTime57 = timeOfDay56.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property58 = timeOfDay56.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay59 = property58.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay59.minusMinutes((int) (byte) 10);
        boolean boolean62 = timeOfDay48.isEqual((org.joda.time.ReadablePartial) timeOfDay59);
        boolean boolean63 = timeOfDay39.isAfter((org.joda.time.ReadablePartial) timeOfDay48);
        int int64 = timeOfDay48.getSecondOfMinute();
        boolean boolean65 = timeOfDay34.isEqual((org.joda.time.ReadablePartial) timeOfDay48);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray66 = timeOfDay48.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay48.withHourOfDay(23);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = timeOfDay68.toDateTimeToday(dateTimeZone69);
        int int71 = property6.compareTo((org.joda.time.ReadableInstant) dateTime70);
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
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray66);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.joda.time.TimeOfDay timeOfDay14 = property6.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = timeOfDay20.toString(dateTimeFormatter24);
        boolean boolean26 = timeOfDay17.isEqual((org.joda.time.ReadablePartial) timeOfDay20);
        org.joda.time.DateTimeField dateTimeField28 = timeOfDay17.getField((int) (byte) 0);
        org.joda.time.Chronology chronology29 = timeOfDay17.getChronology();
        int int30 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay17.plusSeconds((-1));
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.minusMinutes(0);
        org.joda.time.DateTime dateTime39 = timeOfDay38.toDateTimeToday();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay38.plus(readablePeriod40);
        org.joda.time.TimeOfDay.Property property42 = timeOfDay38.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology46 = timeOfDay45.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = timeOfDay45.getFieldTypes();
        org.joda.time.TimeOfDay.Property property48 = timeOfDay45.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay49 = property48.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property48.getFieldType();
        boolean boolean51 = timeOfDay38.isSupported(dateTimeFieldType50);
        org.joda.time.TimeOfDay.Property property52 = timeOfDay32.property(dateTimeFieldType50);
        int int53 = property52.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "T00:00:00.001" + "'", str25, "T00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay6 = property5.withMinimumValue();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property5.getAsShortText(locale7);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology20 = timeOfDay19.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology20);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology20);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology20);
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 999, chronology20);
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.plusMinutes(1);
        org.joda.time.TimeOfDay.Property property27 = timeOfDay24.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay32.minusMinutes(0);
        org.joda.time.DateTime dateTime36 = timeOfDay35.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property37 = timeOfDay35.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay38 = property37.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology44 = timeOfDay43.getChronology();
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay43.minusMinutes(0);
        org.joda.time.DateTime dateTime47 = timeOfDay46.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property48 = timeOfDay46.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay49 = property48.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.minusMinutes((int) (byte) 10);
        boolean boolean52 = timeOfDay38.isEqual((org.joda.time.ReadablePartial) timeOfDay49);
        boolean boolean53 = timeOfDay29.isAfter((org.joda.time.ReadablePartial) timeOfDay38);
        int int54 = timeOfDay38.getSecondOfMinute();
        boolean boolean55 = timeOfDay24.isEqual((org.joda.time.ReadablePartial) timeOfDay38);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = timeOfDay38.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay38.withHourOfDay(23);
        org.joda.time.TimeOfDay timeOfDay59 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay59.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology62 = timeOfDay61.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray63 = timeOfDay61.getFieldTypes();
        org.joda.time.TimeOfDay.Property property64 = timeOfDay61.minuteOfHour();
        org.joda.time.DurationField durationField65 = property64.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay66 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay66.minusMillis((int) (byte) -1);
        int int69 = timeOfDay68.size();
        org.joda.time.TimeOfDay.Property property70 = timeOfDay68.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay71 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay73 = timeOfDay71.minusMillis((int) (byte) -1);
        int int74 = timeOfDay73.size();
        org.joda.time.TimeOfDay timeOfDay76 = timeOfDay73.plusMillis((int) (short) 0);
        int int77 = property70.compareTo((org.joda.time.ReadablePartial) timeOfDay76);
        org.joda.time.TimeOfDay timeOfDay78 = property70.withMinimumValue();
        org.joda.time.DurationField durationField79 = property70.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay80 = property70.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay81 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay83 = timeOfDay81.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology84 = timeOfDay83.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray85 = timeOfDay83.getFieldTypes();
        org.joda.time.TimeOfDay.Property property86 = timeOfDay83.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay88 = timeOfDay83.minusHours(999);
        org.joda.time.TimeOfDay.Property property89 = timeOfDay88.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay91 = property89.addNoWrapToCopy((int) '#');
        org.joda.time.TimeOfDay timeOfDay93 = timeOfDay91.withMillisOfSecond(59);
        boolean boolean94 = timeOfDay80.isBefore((org.joda.time.ReadablePartial) timeOfDay91);
        org.joda.time.DateTime dateTime95 = timeOfDay80.toDateTimeToday();
        int int96 = property64.compareTo((org.joda.time.ReadableInstant) dateTime95);
        org.joda.time.DateTime dateTime97 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) dateTime95);
        int int98 = property5.compareTo((org.joda.time.ReadableInstant) dateTime97);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray56);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 4 + "'", int69 == 4);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(timeOfDay71);
        org.junit.Assert.assertNotNull(timeOfDay73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4 + "'", int74 == 4);
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(timeOfDay78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(timeOfDay80);
        org.junit.Assert.assertNotNull(timeOfDay81);
        org.junit.Assert.assertNotNull(timeOfDay83);
        org.junit.Assert.assertNotNull(chronology84);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray85);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(timeOfDay88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(timeOfDay91);
        org.junit.Assert.assertNotNull(timeOfDay93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(dateTime95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(dateTime97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        int int15 = timeOfDay12.getValue(1);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusMinutes((int) '4');
        org.joda.time.TimeOfDay.Property property18 = timeOfDay12.hourOfDay();
        org.joda.time.DurationField durationField19 = property18.getRangeDurationField();
        java.lang.String str20 = property18.getName();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hourOfDay" + "'", str20, "hourOfDay");
    }
}

