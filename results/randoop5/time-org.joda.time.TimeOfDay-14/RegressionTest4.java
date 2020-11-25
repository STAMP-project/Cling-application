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
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.millisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
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
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay12 = property6.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay13 = property6.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay14 = property6.getTimeOfDay();
        org.joda.time.DurationField durationField15 = property6.getRangeDurationField();
        java.util.Locale locale16 = null;
        int int17 = property6.getMaximumTextLength(locale16);
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
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusHours(999);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        java.lang.String str10 = property8.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property8.getFieldType();
        org.joda.time.TimeOfDay timeOfDay13 = property8.addNoWrapToCopy(97);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(timeOfDay13);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.minusMinutes(0);
        org.joda.time.DateTime dateTime32 = timeOfDay31.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property33 = timeOfDay31.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay31.withHourOfDay(1);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay31.withMillisOfSecond((int) ' ');
        java.lang.String str38 = timeOfDay37.toString();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay37.minusHours(0);
        boolean boolean41 = timeOfDay9.isAfter((org.joda.time.ReadablePartial) timeOfDay40);
        org.joda.time.DateTime dateTime42 = timeOfDay40.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay46 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology49 = timeOfDay48.getChronology();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology49);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(chronology49);
        org.joda.time.TimeOfDay.Property property52 = timeOfDay51.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property52.getFieldType();
        org.joda.time.TimeOfDay timeOfDay54 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay54.minusHours((int) '#');
        int int57 = timeOfDay54.getHourOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray58 = timeOfDay54.getFieldTypes();
        int int59 = property52.compareTo((org.joda.time.ReadablePartial) timeOfDay54);
        org.joda.time.TimeOfDay timeOfDay60 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay60.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay63 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay63.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology66 = timeOfDay65.getChronology();
        org.joda.time.TimeOfDay timeOfDay67 = new org.joda.time.TimeOfDay(chronology66);
        org.joda.time.Chronology chronology68 = timeOfDay67.getChronology();
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay62.withChronologyRetainFields(chronology68);
        int int70 = timeOfDay62.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay72 = timeOfDay62.plusMinutes((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay73 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay62);
        int int74 = property52.compareTo((org.joda.time.ReadablePartial) timeOfDay62);
        org.joda.time.TimeOfDay timeOfDay76 = property52.setCopy(10);
        org.joda.time.TimeOfDay timeOfDay77 = property52.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay81 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay83 = timeOfDay81.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology84 = timeOfDay83.getChronology();
        org.joda.time.TimeOfDay timeOfDay85 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology84);
        org.joda.time.TimeOfDay timeOfDay86 = new org.joda.time.TimeOfDay(chronology84);
        org.joda.time.TimeOfDay timeOfDay88 = timeOfDay86.plusSeconds(4);
        java.lang.String str89 = timeOfDay86.toString();
        org.joda.time.DateTime dateTime90 = timeOfDay86.toDateTimeToday();
        org.joda.time.DateTime dateTime91 = timeOfDay77.toDateTime((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTime dateTime92 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) dateTime90);
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
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "T00:00:00.032" + "'", str38, "T00:00:00.032");
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertNotNull(timeOfDay77);
        org.junit.Assert.assertNotNull(timeOfDay81);
        org.junit.Assert.assertNotNull(timeOfDay83);
        org.junit.Assert.assertNotNull(chronology84);
        org.junit.Assert.assertNotNull(timeOfDay88);
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "T01:37:35.538" + "'", str89, "T01:37:35.538");
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(dateTime92);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.minusMinutes(0);
        org.joda.time.LocalTime localTime14 = timeOfDay10.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay10.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology20 = timeOfDay19.getChronology();
        int int21 = timeOfDay16.compareTo((org.joda.time.ReadablePartial) timeOfDay19);
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay16.plusMillis(3);
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology27 = timeOfDay26.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = timeOfDay26.getFieldTypes();
        org.joda.time.TimeOfDay.Property property29 = timeOfDay26.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay26.minusHours(999);
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(chronology32);
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay16.withChronologyRetainFields(chronology32);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(13, 37, 33, chronology32);
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(13, 23, 4, 3, chronology32);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((long) 'a', chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = timeOfDay37.toString(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "T00:00:00.097" + "'", str39, "T00:00:00.097");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 999);
        org.joda.time.DateTimeField dateTimeField3 = timeOfDay1.getField((int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology7 = timeOfDay6.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.minusMinutes(0);
        org.joda.time.DateTime dateTime10 = timeOfDay9.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property11 = timeOfDay9.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay9.withHourOfDay(1);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay9.withMillisOfSecond((int) ' ');
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay18.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = timeOfDay25.getFieldTypes();
        org.joda.time.TimeOfDay.Property property28 = timeOfDay25.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay25.minusHours(999);
        org.joda.time.TimeOfDay.Property property31 = timeOfDay30.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property31.getFieldType();
        java.lang.String str33 = property31.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property31.getFieldType();
        org.joda.time.TimeOfDay.Property property35 = timeOfDay18.property(dateTimeFieldType34);
        boolean boolean36 = timeOfDay9.isSupported(dateTimeFieldType34);
        int int37 = timeOfDay1.get(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        org.joda.time.LocalTime localTime10 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property11 = timeOfDay2.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay2.minusHours((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay15 = timeOfDay2.withHourOfDay(97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(timeOfDay13);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay15.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay15.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay15.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology27 = timeOfDay26.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology27);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(chronology27);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay15.withChronologyRetainFields(chronology27);
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology34 = timeOfDay33.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray35 = timeOfDay33.getFieldTypes();
        org.joda.time.TimeOfDay.Property property36 = timeOfDay33.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay33.minusHours(999);
        org.joda.time.TimeOfDay.Property property39 = timeOfDay38.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        boolean boolean41 = timeOfDay15.isSupported(dateTimeFieldType40);
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay11.withField(dateTimeFieldType40, 13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = timeOfDay11.getFieldTypes();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray44);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property6.getFieldType();
        org.joda.time.TimeOfDay timeOfDay11 = property6.addToCopy(999);
        org.joda.time.DateTimeField dateTimeField12 = property6.getField();
        org.joda.time.TimeOfDay timeOfDay13 = property6.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.plusMillis((int) (short) 0);
        java.lang.Class<?> wildcardClass16 = timeOfDay13.getClass();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(wildcardClass16);
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
        java.lang.String str9 = property6.getName();
        int int10 = property6.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay12 = property6.addToCopy(0);
        org.joda.time.DurationField durationField13 = property6.getDurationField();
        org.joda.time.TimeOfDay timeOfDay14 = property6.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay16 = property6.addNoWrapToCopy((int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.TimeOfDay timeOfDay18 = property6.getTimeOfDay();
        int int19 = timeOfDay18.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay18.withPeriodAdded(readablePeriod20, 959);
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
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeOfDay22);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusHours(999);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        java.util.Locale locale10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = property8.setCopy("13", locale10);
        java.lang.String str12 = property8.getAsText();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property8.getAsText(locale13);
        java.lang.String str15 = property8.getAsText();
        java.lang.String str16 = property8.getAsShortText();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology6);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.hourOfDay();
        org.joda.time.TimeOfDay.Property property10 = timeOfDay8.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay12 = property10.addNoWrapToCopy(23);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(timeOfDay12);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(1, 0, (int) (byte) 0, 10, chronology10);
        int int13 = timeOfDay12.size();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay12.millisOfSecond();
        int int15 = property14.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay17 = property14.addToCopy(58);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology24 = timeOfDay23.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(chronology24);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay20.withChronologyRetainFields(chronology26);
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay20.withHourOfDay((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay20.minusMillis(13);
        org.joda.time.TimeOfDay timeOfDay34 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology37 = timeOfDay36.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(chronology37);
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay((long) (short) 0, chronology37);
        org.joda.time.TimeOfDay timeOfDay40 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology37);
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology44 = timeOfDay43.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray45 = timeOfDay43.getFieldTypes();
        org.joda.time.TimeOfDay.Property property46 = timeOfDay43.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay43.minusHours(999);
        org.joda.time.TimeOfDay.Property property49 = timeOfDay48.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property49.getFieldType();
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay40.withField(dateTimeFieldType50, (int) '#');
        int int53 = timeOfDay20.indexOf(dateTimeFieldType50);
        org.joda.time.LocalTime localTime54 = timeOfDay20.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay20.plusMillis(13);
        boolean boolean57 = timeOfDay17.isEqual((org.joda.time.ReadablePartial) timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 999 + "'", int15 == 999);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        int int10 = timeOfDay2.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay2.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.withHourOfDay(852);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 852 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
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
        java.util.Locale locale9 = null;
        java.lang.String str10 = property6.getAsText(locale9);
        java.lang.String str11 = property6.getAsString();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property6.getAsText(locale12);
        java.util.Locale locale14 = null;
        int int15 = property6.getMaximumTextLength(locale14);
        org.joda.time.TimeOfDay timeOfDay17 = property6.addWrapFieldToCopy(531);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(timeOfDay17);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.String str7 = property6.toString();
        java.lang.String str8 = property6.getAsString();
        org.joda.time.DateTimeField dateTimeField9 = property6.getField();
        org.joda.time.TimeOfDay timeOfDay11 = property6.addWrapFieldToCopy(45);
        java.lang.String str12 = property6.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property6.getFieldType();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[millisOfSecond]" + "'", str7, "Property[millisOfSecond]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay5.withHourOfDay(1);
        int int10 = timeOfDay5.getHourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = timeOfDay5.toString(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "T00:00:00.001" + "'", str12, "T00:00:00.001");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.plusHours((int) (short) -1);
        int int8 = timeOfDay7.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withMinuteOfHour((int) (byte) 0);
        int int13 = timeOfDay10.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay10.minusMillis(228);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeOfDay15);
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
        int int7 = property6.get();
        org.joda.time.TimeOfDay timeOfDay9 = property6.addNoWrapToCopy((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.DateTime dateTime16 = timeOfDay15.toDateTimeToday();
        int int17 = property6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        int int18 = property6.get();
        java.util.Locale locale19 = null;
        int int20 = property6.getMaximumShortTextLength(locale19);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay2.withHourOfDay((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.plus(readablePeriod9);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.plusHours((int) 'a');
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay10.withSecondOfMinute(3);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay10.secondOfMinute();
        java.util.Locale locale16 = null;
        int int17 = property15.getMaximumShortTextLength(locale16);
        org.joda.time.TimeOfDay timeOfDay18 = property15.withMaximumValue();
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(chronology19);
    }
}
