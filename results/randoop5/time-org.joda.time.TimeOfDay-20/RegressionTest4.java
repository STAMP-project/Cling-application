import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = timeOfDay12.toDateTimeToday(dateTimeZone18);
        org.joda.time.TimeOfDay.Property property20 = timeOfDay12.secondOfMinute();
        java.lang.String str21 = property20.getAsString();
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay24.minusMinutes(0);
        org.joda.time.DateTime dateTime28 = timeOfDay27.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property29 = timeOfDay27.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay27.withHourOfDay(1);
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay27.withMillisOfSecond((int) ' ');
        org.joda.time.TimeOfDay timeOfDay34 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology37 = timeOfDay36.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay36.minusMinutes(0);
        org.joda.time.DateTime dateTime40 = timeOfDay39.toDateTimeToday();
        org.joda.time.DateTime dateTime41 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay27.plus(readablePeriod42);
        org.joda.time.TimeOfDay.Property property44 = timeOfDay27.secondOfMinute();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = timeOfDay27.toDateTime(readableInstant45);
        int int47 = property20.compareTo((org.joda.time.ReadableInstant) dateTime46);
        java.lang.String str48 = property20.getAsString();
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
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0" + "'", str48, "0");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 58);
        org.junit.Assert.assertNotNull(timeOfDay1);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = timeOfDay12.toDateTimeToday(dateTimeZone18);
        org.joda.time.TimeOfDay.Property property20 = timeOfDay12.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay22 = property20.addNoWrapToCopy(118);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMillis((int) ' ');
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.withMinuteOfHour(53);
        int int27 = timeOfDay24.size();
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
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) (byte) 0, (int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusSeconds(34);
        int int5 = timeOfDay2.getSecondOfMinute();
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        int int10 = timeOfDay2.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay2.plusMinutes((int) (byte) 0);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay2.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay15 = property13.addToCopy(35);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(timeOfDay15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.joda.time.TimeOfDay timeOfDay21 = property7.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField22 = property7.getField();
        org.joda.time.TimeOfDay timeOfDay24 = property7.addToCopy((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay26 = property7.setCopy(1);
        int int27 = timeOfDay26.getHourOfDay();
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
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay2 = property1.withMaximumValue();
        java.util.Locale locale3 = null;
        java.lang.String str4 = property1.getAsShortText(locale3);
        java.lang.String str5 = property1.toString();
        org.joda.time.TimeOfDay timeOfDay6 = property1.withMinimumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(timeOfDay2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "578" + "'", str4, "578");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[millisOfSecond]" + "'", str5, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(timeOfDay6);
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
        java.lang.String str11 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay12 = property6.withMaximumValue();
        org.joda.time.TimeOfDay.Property property13 = timeOfDay12.hourOfDay();
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
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.minusMinutes(0);
        boolean boolean39 = property20.equals((java.lang.Object) timeOfDay35);
        org.joda.time.TimeOfDay timeOfDay41 = property20.addNoWrapToCopy((int) (short) 10);
        int int42 = timeOfDay12.compareTo((org.joda.time.ReadablePartial) timeOfDay41);
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay41.withSecondOfMinute(42);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay41.withPeriodAdded(readablePeriod45, 97);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(property13);
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
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay47);
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
        org.joda.time.TimeOfDay.Property property31 = timeOfDay29.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay33 = property31.setCopy((int) ' ');
        org.joda.time.TimeOfDay timeOfDay35 = property31.addWrapFieldToCopy(13);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        org.joda.time.DurationField durationField37 = property31.getDurationField();
        boolean boolean38 = property6.equals((java.lang.Object) property31);
        java.lang.String str39 = property6.getAsText();
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
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1" + "'", str39, "1");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minus(readablePeriod4);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withHourOfDay((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.withPeriodAdded(readablePeriod8, 118);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay2.withHourOfDay((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay2.minusMillis(13);
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(chronology19);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((long) (short) 0, chronology19);
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology19);
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = timeOfDay25.getFieldTypes();
        org.joda.time.TimeOfDay.Property property28 = timeOfDay25.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay25.minusHours(999);
        org.joda.time.TimeOfDay.Property property31 = timeOfDay30.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property31.getFieldType();
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay22.withField(dateTimeFieldType32, (int) '#');
        int int35 = timeOfDay2.indexOf(dateTimeFieldType32);
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology39 = timeOfDay38.getChronology();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay38.minusMinutes(0);
        org.joda.time.LocalTime localTime42 = timeOfDay38.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay38.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay45 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology48 = timeOfDay47.getChronology();
        int int49 = timeOfDay44.compareTo((org.joda.time.ReadablePartial) timeOfDay47);
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay44.plusMillis(3);
        org.joda.time.TimeOfDay timeOfDay52 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay52.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology55 = timeOfDay54.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = timeOfDay54.getFieldTypes();
        org.joda.time.TimeOfDay.Property property57 = timeOfDay54.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay54.minusHours(999);
        org.joda.time.Chronology chronology60 = timeOfDay59.getChronology();
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay(chronology60);
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay44.withChronologyRetainFields(chronology60);
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay2.withChronologyRetainFields(chronology60);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray64 = timeOfDay2.getFieldTypes();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray64);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay3 = property1.addNoWrapToCopy((int) (byte) 1);
        int int4 = property1.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay6 = property1.addToCopy(37);
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.withMillisOfSecond(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withHourOfDay(35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.plusHours(4);
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
        int int32 = property29.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property29.getFieldType();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay2.withField(dateTimeFieldType33, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((long) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology41 = timeOfDay40.getChronology();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay40.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property44 = timeOfDay40.millisOfSecond();
        int int45 = property44.get();
        org.joda.time.DurationField durationField46 = property44.getDurationField();
        java.lang.Class<?> wildcardClass47 = durationField46.getClass();
        boolean boolean48 = timeOfDay37.equals((java.lang.Object) durationField46);
        org.joda.time.TimeOfDay timeOfDay49 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology52 = timeOfDay51.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray53 = timeOfDay51.getFieldTypes();
        org.joda.time.TimeOfDay.Property property54 = timeOfDay51.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay51.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay60 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay60.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology63 = timeOfDay62.getChronology();
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology63);
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(chronology63);
        org.joda.time.TimeOfDay timeOfDay66 = timeOfDay51.withChronologyRetainFields(chronology63);
        org.joda.time.TimeOfDay timeOfDay67 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay67.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology70 = timeOfDay69.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray71 = timeOfDay69.getFieldTypes();
        org.joda.time.TimeOfDay.Property property72 = timeOfDay69.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay74 = timeOfDay69.minusHours(999);
        org.joda.time.TimeOfDay.Property property75 = timeOfDay74.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property75.getFieldType();
        boolean boolean77 = timeOfDay51.isSupported(dateTimeFieldType76);
        int int78 = timeOfDay37.indexOf(dateTimeFieldType76);
        int int79 = timeOfDay2.get(dateTimeFieldType76);
        org.joda.time.TimeOfDay timeOfDay81 = timeOfDay2.plusMinutes(23);
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.DateTime dateTime83 = timeOfDay2.toDateTimeToday(dateTimeZone82);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(timeOfDay74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(timeOfDay81);
        org.junit.Assert.assertNotNull(dateTime83);
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
        java.lang.String str7 = property6.toString();
        org.joda.time.DurationField durationField8 = property6.getDurationField();
        int int9 = property6.get();
        org.joda.time.TimeOfDay timeOfDay11 = property6.addToCopy((int) ' ');
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.minusMinutes(0);
        org.joda.time.DateTime dateTime18 = timeOfDay17.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property19 = timeOfDay17.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay20 = property19.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMinutes((int) (byte) 10);
        boolean boolean23 = property6.equals((java.lang.Object) (byte) 10);
        java.lang.String str24 = property6.getAsShortText();
        int int25 = property6.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[millisOfSecond]" + "'", str7, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
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
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay((long) (short) 0, chronology21);
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology21);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((long) (-1), chronology21);
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay14.withChronologyRetainFields(chronology21);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay30.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay30.plusHours((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology39 = timeOfDay38.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = timeOfDay38.getFieldTypes();
        org.joda.time.TimeOfDay.Property property41 = timeOfDay38.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay38.minusHours(999);
        org.joda.time.TimeOfDay.Property property44 = timeOfDay43.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property44.getFieldType();
        java.lang.String str46 = property44.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property44.getFieldType();
        int int48 = timeOfDay35.get(dateTimeFieldType47);
        org.joda.time.TimeOfDay.Property property49 = timeOfDay27.property(dateTimeFieldType47);
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay26.withField(dateTimeFieldType47, 34);
        int int52 = timeOfDay26.getSecondOfMinute();
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
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0" + "'", str46, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
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
        org.joda.time.TimeOfDay.Property property11 = timeOfDay8.hourOfDay();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(chronology5);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) (short) 0, chronology5);
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology5);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay11.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay11.minusHours(999);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property17.getFieldType();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay8.withField(dateTimeFieldType18, (int) '#');
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay8.minusMillis((int) (short) 100);
        org.joda.time.TimeOfDay.Property property23 = timeOfDay22.minuteOfHour();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 100);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        int int6 = timeOfDay2.getMinuteOfHour();
        int int7 = timeOfDay2.getSecondOfMinute();
        int[] intArray8 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay.Property property9 = timeOfDay2.secondOfMinute();
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
        org.joda.time.DateTimeField dateTimeField29 = property16.getField();
        java.lang.String str30 = property16.getAsText();
        int int31 = property16.get();
        org.joda.time.TimeOfDay timeOfDay33 = property16.setCopy(2);
        boolean boolean34 = timeOfDay2.isBefore((org.joda.time.ReadablePartial) timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(property9);
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
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        int int66 = timeOfDay57.getMillisOfSecond();
        org.joda.time.TimeOfDay.Property property67 = timeOfDay57.millisOfSecond();
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
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(property67);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addNoWrapToCopy(0);
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.minusMinutes(0);
        org.joda.time.LocalTime localTime14 = timeOfDay10.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay10.withHourOfDay((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = timeOfDay16.toDateTimeToday(dateTimeZone17);
        int int19 = property7.compareTo((org.joda.time.ReadableInstant) dateTime18);
        int int20 = property7.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField21 = property7.getField();
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay24.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay24.plusHours((int) (short) -1);
        int int30 = timeOfDay29.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.plusHours((int) (short) 0);
        boolean boolean33 = property7.equals((java.lang.Object) timeOfDay29);
        org.joda.time.TimeOfDay timeOfDay35 = property7.addNoWrapToCopy(24);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeOfDay35);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay5.withHourOfDay(1);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay5.withMillisOfSecond((int) ' ');
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((long) (byte) 0);
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
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.minusMinutes(0);
        boolean boolean39 = property20.equals((java.lang.Object) timeOfDay35);
        org.joda.time.TimeOfDay timeOfDay40 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology43 = timeOfDay42.getChronology();
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay42.minusMinutes(0);
        org.joda.time.DateTime dateTime46 = timeOfDay45.toDateTimeToday();
        org.joda.time.DateTime dateTime47 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime48 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
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
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay6 = property5.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(999);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology10);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusSeconds((int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField17 = timeOfDay15.getField((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay15.withSecondOfMinute((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology30);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology30);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(chronology30);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(chronology30);
        org.joda.time.TimeOfDay.Property property35 = timeOfDay34.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay37 = property35.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology41 = timeOfDay40.getChronology();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay40.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay40.plusHours((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay40.withMinuteOfHour((int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay48 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology51 = timeOfDay50.getChronology();
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay50.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property54 = timeOfDay50.millisOfSecond();
        java.lang.Object obj55 = null;
        boolean boolean56 = property54.equals(obj55);
        java.lang.String str57 = property54.getName();
        org.joda.time.TimeOfDay timeOfDay58 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay60 = timeOfDay58.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology61 = timeOfDay60.getChronology();
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay60.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay60.plusHours((int) (short) -1);
        int int66 = property54.compareTo((org.joda.time.ReadablePartial) timeOfDay65);
        org.joda.time.TimeOfDay timeOfDay67 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay67.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology70 = timeOfDay69.getChronology();
        org.joda.time.TimeOfDay timeOfDay72 = timeOfDay69.minusMinutes(0);
        boolean boolean73 = property54.equals((java.lang.Object) timeOfDay69);
        org.joda.time.TimeOfDay timeOfDay74 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay76 = timeOfDay74.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology77 = timeOfDay76.getChronology();
        org.joda.time.TimeOfDay timeOfDay79 = timeOfDay76.minusMinutes(0);
        org.joda.time.DateTime dateTime80 = timeOfDay79.toDateTimeToday();
        org.joda.time.DateTime dateTime81 = timeOfDay69.toDateTime((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.DateTime dateTime82 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime dateTime83 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Chronology chronology84 = timeOfDay37.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay85 = new org.joda.time.TimeOfDay((java.lang.Object) (short) 1, chronology84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "millisOfSecond" + "'", str57, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(timeOfDay74);
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(timeOfDay79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(chronology84);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay2.withHourOfDay((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay2.minusMillis(13);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay2.plusMillis(58);
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology27 = timeOfDay26.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology27);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology27);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(chronology27);
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 999, chronology27);
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.plusMinutes(1);
        org.joda.time.TimeOfDay.Property property34 = timeOfDay31.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property34.getFieldType();
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay2.withField(dateTimeFieldType35, 53);
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay2.withSecondOfMinute(42);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay2.minusSeconds(52);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay5.withHourOfDay(1);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay5.plus(readablePeriod10);
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        org.joda.time.DurationField durationField11 = property6.getDurationField();
        org.joda.time.TimeOfDay timeOfDay13 = property6.addToCopy(999);
        org.joda.time.TimeOfDay timeOfDay15 = property6.addNoWrapToCopy((-1));
        java.util.Locale locale16 = null;
        int int17 = property6.getMaximumTextLength(locale16);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addNoWrapToCopy(0);
        org.joda.time.TimeOfDay timeOfDay8 = property4.addWrapFieldToCopy((-1));
        java.util.Locale locale9 = null;
        java.lang.String str10 = property4.getAsShortText(locale9);
        org.joda.time.TimeOfDay timeOfDay11 = property4.withMaximumValue();
        int int12 = timeOfDay11.getSecondOfMinute();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay9 = property7.setCopy(4);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusHours((int) '#');
        int int13 = timeOfDay10.getHourOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay10.minuteOfHour();
        boolean boolean15 = timeOfDay9.equals((java.lang.Object) property14);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = timeOfDay9.withFieldAdded(durationFieldType16, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        int int17 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay18 = property5.getTimeOfDay();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.withFieldAdded(durationFieldType19, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeOfDay18);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology10);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = timeOfDay13.toString(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "T01:37:42.478" + "'", str16, "T01:37:42.478");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        int int14 = timeOfDay12.getValue((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay12.withMillisOfSecond((int) (byte) 10);
        boolean boolean17 = timeOfDay8.isBefore((org.joda.time.ReadablePartial) timeOfDay12);
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology29);
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology29);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(chronology29);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(chronology29);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(chronology29);
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 3, chronology29);
        boolean boolean36 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    @Ignore
  public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology4 = timeOfDay3.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(chronology4);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0L, chronology6);
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.minusMinutes(0);
        org.joda.time.LocalTime localTime14 = timeOfDay10.toLocalTime();
        org.joda.time.TimeOfDay.Property property15 = timeOfDay10.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay10.plusHours(4);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = timeOfDay20.getFieldTypes();
        org.joda.time.TimeOfDay.Property property23 = timeOfDay20.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay20.minusHours(999);
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay10.withField(dateTimeFieldType27, (int) (byte) 1);
        int int30 = timeOfDay7.indexOf(dateTimeFieldType27);
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology34 = timeOfDay33.getChronology();
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay33.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property37 = timeOfDay33.millisOfSecond();
        int int38 = property37.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay();
        int int40 = property37.compareTo((org.joda.time.ReadablePartial) timeOfDay39);
        int int42 = timeOfDay39.getValue((int) (byte) 0);
        org.joda.time.TimeOfDay.Property property43 = timeOfDay39.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay45 = property43.addToCopy((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay46 = property43.withMinimumValue();
        int int47 = timeOfDay7.compareTo((org.joda.time.ReadablePartial) timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 999 + "'", int38 == 999);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
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
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay8.plus(readablePeriod53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay8.minus(readablePeriod55);
        int int57 = timeOfDay8.size();
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
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 4 + "'", int57 == 4);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0L, chronology1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology11);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology11);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology11);
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 999, chronology11);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.plusMinutes(1);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay15.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay15.minusSeconds(59);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay15.minusMinutes(2);
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = timeOfDay22.toString("T00:00:00.100", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        int int3 = timeOfDay0.getHourOfDay();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay0.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay7.millisOfSecond();
        java.lang.Object obj12 = null;
        boolean boolean13 = property11.equals(obj12);
        java.lang.String str14 = property11.getName();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay17.plusHours((int) (short) -1);
        int int23 = property11.compareTo((org.joda.time.ReadablePartial) timeOfDay22);
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology27 = timeOfDay26.getChronology();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay26.minusMinutes(0);
        boolean boolean30 = property11.equals((java.lang.Object) timeOfDay26);
        org.joda.time.TimeOfDay timeOfDay31 = property11.getTimeOfDay();
        java.lang.String str32 = timeOfDay31.toString();
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray37 = timeOfDay35.getFieldTypes();
        org.joda.time.TimeOfDay.Property property38 = timeOfDay35.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay35.minusHours(999);
        org.joda.time.TimeOfDay.Property property41 = timeOfDay40.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property41.getFieldType();
        org.joda.time.TimeOfDay.Property property43 = timeOfDay31.property(dateTimeFieldType42);
        boolean boolean44 = timeOfDay0.isSupported(dateTimeFieldType42);
        org.joda.time.DurationFieldType durationFieldType45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay47 = timeOfDay0.withFieldAdded(durationFieldType45, 999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "millisOfSecond" + "'", str14, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "T00:00:00.001" + "'", str32, "T00:00:00.001");
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay2.plusMillis((int) '#');
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withHourOfDay(23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = timeOfDay8.withMinuteOfHour(395);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 395 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        org.joda.time.TimeOfDay timeOfDay17 = property5.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.minusMinutes(0);
        org.joda.time.LocalTime localTime24 = timeOfDay20.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay20.withHourOfDay((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.plus(readablePeriod27);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.plusHours((int) 'a');
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.minusMillis((int) (byte) -1);
        int int34 = timeOfDay33.size();
        org.joda.time.TimeOfDay.Property property35 = timeOfDay33.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.minusMillis((int) (byte) -1);
        int int39 = timeOfDay38.size();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay38.plusMillis((int) (short) 0);
        int int42 = property35.compareTo((org.joda.time.ReadablePartial) timeOfDay41);
        org.joda.time.TimeOfDay timeOfDay43 = property35.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay44 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay44.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology47 = timeOfDay46.getChronology();
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay46.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property50 = timeOfDay46.millisOfSecond();
        java.lang.Object obj51 = null;
        boolean boolean52 = property50.equals(obj51);
        java.lang.String str53 = property50.getName();
        org.joda.time.TimeOfDay timeOfDay54 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay54.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology57 = timeOfDay56.getChronology();
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay56.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay56.plusHours((int) (short) -1);
        int int62 = property50.compareTo((org.joda.time.ReadablePartial) timeOfDay61);
        org.joda.time.TimeOfDay timeOfDay63 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay63.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology66 = timeOfDay65.getChronology();
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay65.minusMinutes(0);
        boolean boolean69 = property50.equals((java.lang.Object) timeOfDay65);
        org.joda.time.TimeOfDay timeOfDay70 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay72 = timeOfDay70.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology73 = timeOfDay72.getChronology();
        org.joda.time.TimeOfDay timeOfDay75 = timeOfDay72.minusMinutes(0);
        org.joda.time.DateTime dateTime76 = timeOfDay75.toDateTimeToday();
        org.joda.time.DateTime dateTime77 = timeOfDay65.toDateTime((org.joda.time.ReadableInstant) dateTime76);
        int int78 = property35.compareTo((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.DateTime dateTime79 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) dateTime77);
        int int80 = property5.compareTo((org.joda.time.ReadableInstant) dateTime79);
        java.lang.String str81 = property5.getAsText();
        org.joda.time.TimeOfDay timeOfDay82 = property5.getTimeOfDay();
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
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "millisOfSecond" + "'", str53, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(timeOfDay70);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(timeOfDay75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "0" + "'", str81, "0");
        org.junit.Assert.assertNotNull(timeOfDay82);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 100);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.plusMillis(37);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.minusMinutes(0);
        org.joda.time.DateTime dateTime13 = timeOfDay12.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay12.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay15 = property14.getTimeOfDay();
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, 3, 53, 100, chronology16);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1, chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(507, 10, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 507 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(timeOfDay18);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(4, (int) (short) 1, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay8.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay8.millisOfSecond();
        java.lang.Object obj13 = null;
        boolean boolean14 = property12.equals(obj13);
        java.lang.String str15 = property12.getName();
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay18.plusHours((int) (short) -1);
        int int24 = property12.compareTo((org.joda.time.ReadablePartial) timeOfDay23);
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology28 = timeOfDay27.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay27.minusMinutes(0);
        boolean boolean31 = property12.equals((java.lang.Object) timeOfDay27);
        org.joda.time.TimeOfDay timeOfDay32 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay32.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology35 = timeOfDay34.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay34.minusMinutes(0);
        org.joda.time.DateTime dateTime38 = timeOfDay37.toDateTimeToday();
        org.joda.time.DateTime dateTime39 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = timeOfDay27.toDateTimeToday(dateTimeZone40);
        int int42 = timeOfDay27.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay27.withSecondOfMinute(13);
        org.joda.time.TimeOfDay timeOfDay46 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay47 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay47.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology50 = timeOfDay49.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = timeOfDay49.getFieldTypes();
        org.joda.time.TimeOfDay.Property property52 = timeOfDay49.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay49.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay58 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay60 = timeOfDay58.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology61 = timeOfDay60.getChronology();
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology61);
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay(chronology61);
        org.joda.time.TimeOfDay timeOfDay64 = timeOfDay49.withChronologyRetainFields(chronology61);
        org.joda.time.TimeOfDay timeOfDay65 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay65.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology68 = timeOfDay67.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray69 = timeOfDay67.getFieldTypes();
        org.joda.time.TimeOfDay.Property property70 = timeOfDay67.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay72 = timeOfDay67.minusHours(999);
        org.joda.time.TimeOfDay.Property property73 = timeOfDay72.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = property73.getFieldType();
        boolean boolean75 = timeOfDay49.isSupported(dateTimeFieldType74);
        boolean boolean76 = timeOfDay46.isSupported(dateTimeFieldType74);
        int int77 = timeOfDay44.get(dateTimeFieldType74);
        int int78 = timeOfDay5.get(dateTimeFieldType74);
        boolean boolean79 = timeOfDay3.isSupported(dateTimeFieldType74);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "millisOfSecond" + "'", str15, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(timeOfDay64);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(dateTimeFieldType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 13 + "'", int77 == 13);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.getTimeOfDay();
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(chronology15);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((long) (short) 0, chronology15);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology15);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay8, chronology15);
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property26 = timeOfDay22.millisOfSecond();
        java.lang.Object obj27 = null;
        boolean boolean28 = property26.equals(obj27);
        java.util.Locale locale29 = null;
        int int30 = property26.getMaximumShortTextLength(locale29);
        java.lang.String str31 = property26.getAsString();
        org.joda.time.TimeOfDay timeOfDay32 = property26.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay32.plusHours(100);
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology41 = timeOfDay40.getChronology();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology41);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(chronology41);
        org.joda.time.TimeOfDay.Property property44 = timeOfDay43.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property44.getFieldType();
        int int46 = timeOfDay32.get(dateTimeFieldType45);
        org.joda.time.TimeOfDay.Property property47 = timeOfDay19.property(dateTimeFieldType45);
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay19.plusMinutes(23);
        org.joda.time.LocalTime localTime50 = timeOfDay49.toLocalTime();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1" + "'", str31, "1");
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(localTime50);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.minusMinutes(0);
        org.joda.time.LocalTime localTime15 = timeOfDay11.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay11.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        int int22 = timeOfDay17.compareTo((org.joda.time.ReadablePartial) timeOfDay20);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay17.plusMillis(3);
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology28 = timeOfDay27.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = timeOfDay27.getFieldTypes();
        org.joda.time.TimeOfDay.Property property30 = timeOfDay27.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay27.minusHours(999);
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(chronology33);
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay17.withChronologyRetainFields(chronology33);
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(13, 37, 42, chronology33);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(13, 23, 4, 3, chronology33);
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay((long) 'a', chronology33);
        org.joda.time.TimeOfDay timeOfDay39 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (byte) 1, chronology33);
        org.joda.time.TimeOfDay.Property property40 = timeOfDay39.millisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay2.minusSeconds((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property14 = timeOfDay2.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay17.millisOfSecond();
        java.lang.Object obj22 = null;
        boolean boolean23 = property21.equals(obj22);
        java.lang.String str24 = property21.getName();
        int int25 = property21.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay27 = property21.addNoWrapToCopy((int) '#');
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusHours(1);
        int int30 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay29);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay2.plusSeconds((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "millisOfSecond" + "'", str24, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 999 + "'", int25 == 999);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(timeOfDay32);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.joda.time.TimeOfDay timeOfDay14 = property6.getTimeOfDay();
        java.lang.String str15 = property6.getAsShortText();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology10);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.hourOfDay();
        int int16 = property15.getMaximumValueOverall();
        int int17 = property15.getMaximumValue();
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay20.millisOfSecond();
        java.lang.Object obj25 = null;
        boolean boolean26 = property24.equals(obj25);
        java.lang.String str27 = property24.getName();
        int int28 = property24.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay30 = property24.addToCopy(0);
        org.joda.time.DurationField durationField31 = property24.getDurationField();
        org.joda.time.TimeOfDay timeOfDay32 = property24.withMaximumValue();
        java.lang.String str33 = property24.getAsString();
        java.lang.String str34 = property24.getName();
        boolean boolean35 = property15.equals((java.lang.Object) property24);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 23 + "'", int16 == 23);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 23 + "'", int17 == 23);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "millisOfSecond" + "'", str27, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 999 + "'", int28 == 999);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "millisOfSecond" + "'", str34, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        java.util.Locale locale17 = null;
        int int18 = property7.getMaximumTextLength(locale17);
        org.joda.time.TimeOfDay timeOfDay19 = property7.withMinimumValue();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(timeOfDay19);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusHours(999);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        int int10 = property8.get();
        int int11 = property8.get();
        java.lang.String str12 = property8.getAsString();
        org.joda.time.TimeOfDay timeOfDay13 = property8.withMaximumValue();
        java.lang.String str14 = property8.getAsText();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property8.getAsText(locale15);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis((int) (byte) -1);
        int int20 = timeOfDay19.size();
        org.joda.time.TimeOfDay.Property property21 = timeOfDay19.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay23 = property21.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay25 = property21.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.plusSeconds(2);
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withSecondOfMinute(10);
        int int30 = property8.compareTo((org.joda.time.ReadablePartial) timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        int int13 = timeOfDay12.getHourOfDay();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    @Ignore
  public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addWrapFieldToCopy((int) (byte) 0);
        int int7 = property4.getMinimumValue();
        org.joda.time.DurationField durationField8 = property4.getDurationField();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis((int) (byte) -1);
        int int14 = timeOfDay13.size();
        org.joda.time.TimeOfDay.Property property15 = timeOfDay13.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMillis((int) (byte) -1);
        int int19 = timeOfDay18.size();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.plusMillis((int) (short) 0);
        int int22 = property15.compareTo((org.joda.time.ReadablePartial) timeOfDay21);
        org.joda.time.TimeOfDay timeOfDay23 = property15.withMinimumValue();
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
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology46 = timeOfDay45.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay45.minusMinutes(0);
        boolean boolean49 = property30.equals((java.lang.Object) timeOfDay45);
        org.joda.time.TimeOfDay timeOfDay50 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay50.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology53 = timeOfDay52.getChronology();
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay52.minusMinutes(0);
        org.joda.time.DateTime dateTime56 = timeOfDay55.toDateTimeToday();
        org.joda.time.DateTime dateTime57 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) dateTime56);
        int int58 = property15.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime59 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        java.lang.String str61 = timeOfDay10.toString("1");
        java.lang.String str62 = timeOfDay10.toString();
        org.joda.time.TimeOfDay timeOfDay63 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay63.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology66 = timeOfDay65.getChronology();
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay65.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property69 = timeOfDay65.millisOfSecond();
        java.lang.Object obj70 = null;
        boolean boolean71 = property69.equals(obj70);
        java.lang.String str72 = property69.getName();
        int int73 = property69.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay75 = property69.addNoWrapToCopy((int) '#');
        org.joda.time.TimeOfDay timeOfDay76 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay78 = timeOfDay76.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology79 = timeOfDay78.getChronology();
        org.joda.time.TimeOfDay timeOfDay81 = timeOfDay78.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property82 = timeOfDay78.millisOfSecond();
        int int83 = property82.getMaximumValueOverall();
        int int84 = property82.get();
        boolean boolean85 = timeOfDay75.equals((java.lang.Object) int84);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = null;
        java.lang.String str87 = timeOfDay75.toString(dateTimeFormatter86);
        boolean boolean88 = timeOfDay10.equals((java.lang.Object) timeOfDay75);
        org.joda.time.DateTime dateTime89 = timeOfDay10.toDateTimeToday();
        int int90 = property4.compareTo((org.joda.time.ReadableInstant) dateTime89);
        java.util.Locale locale91 = null;
        java.lang.String str92 = property4.getAsText(locale91);
        int int93 = property4.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
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
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1" + "'", str61, "1");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "T00:00:00.000" + "'", str62, "T00:00:00.000");
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "millisOfSecond" + "'", str72, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 999 + "'", int73 == 999);
        org.junit.Assert.assertNotNull(timeOfDay75);
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertNotNull(timeOfDay78);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(timeOfDay81);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 999 + "'", int83 == 999);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "T00:00:00.036" + "'", str87, "T00:00:00.036");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "1" + "'", str92, "1");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        java.util.Locale locale13 = null;
        java.lang.String str14 = property12.getAsText(locale13);
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = timeOfDay17.getFieldTypes();
        org.joda.time.TimeOfDay.Property property20 = timeOfDay17.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay17.minusHours(999);
        org.joda.time.TimeOfDay.Property property23 = timeOfDay22.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property23.getFieldType();
        int int25 = property23.get();
        int int26 = property23.get();
        java.lang.String str27 = property23.getAsString();
        org.joda.time.TimeOfDay timeOfDay28 = property23.getTimeOfDay();
        org.joda.time.DateTime dateTime29 = timeOfDay28.toDateTimeToday();
        int int30 = property12.compareTo((org.joda.time.ReadablePartial) timeOfDay28);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay28.plusHours(543);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "968" + "'", str14, "968");
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(timeOfDay32);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        org.joda.time.TimeOfDay timeOfDay21 = property7.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay23 = property7.addToCopy(0);
        org.joda.time.TimeOfDay timeOfDay24 = property7.withMinimumValue();
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
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay24);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay8 = property4.addToCopy(58);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property4.getFieldType();
        java.lang.String str10 = property4.getAsShortText();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay2.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        int int13 = timeOfDay8.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay8.plusMillis(3);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusHours((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = timeOfDay15.toDateTimeToday(dateTimeZone18);
        java.lang.String str20 = timeOfDay15.toString();
        int int21 = timeOfDay15.getHourOfDay();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "T10:00:00.004" + "'", str20, "T10:00:00.004");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(968, 8, 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 968 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        org.joda.time.DurationField durationField11 = property6.getDurationField();
        org.joda.time.TimeOfDay timeOfDay13 = property6.addToCopy(999);
        org.joda.time.TimeOfDay timeOfDay15 = property6.addNoWrapToCopy((-1));
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay21.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = timeOfDay21.toString(dateTimeFormatter25);
        boolean boolean27 = timeOfDay18.isEqual((org.joda.time.ReadablePartial) timeOfDay21);
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology38 = timeOfDay37.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology38);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology38);
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology44 = timeOfDay43.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray45 = timeOfDay43.getFieldTypes();
        org.joda.time.TimeOfDay.Property property46 = timeOfDay43.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay43.minusHours(999);
        org.joda.time.TimeOfDay.Property property49 = timeOfDay48.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property49.getFieldType();
        int int51 = timeOfDay40.get(dateTimeFieldType50);
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay21.withField(dateTimeFieldType50, (int) '#');
        org.joda.time.TimeOfDay timeOfDay61 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay61.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology64 = timeOfDay63.getChronology();
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology64);
        org.joda.time.TimeOfDay timeOfDay66 = new org.joda.time.TimeOfDay(1, 0, (int) (byte) 0, 10, chronology64);
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay21.withChronologyRetainFields(chronology64);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = timeOfDay21.toDateTimeToday(dateTimeZone68);
        int int70 = property6.compareTo((org.joda.time.ReadableInstant) dateTime69);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "T00:00:00.001" + "'", str26, "T00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.joda.time.TimeOfDay.Property property32 = timeOfDay28.millisOfSecond();
        java.lang.Object obj33 = null;
        boolean boolean34 = property32.equals(obj33);
        java.lang.String str35 = property32.getName();
        int int36 = property32.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay38 = property32.addToCopy(0);
        org.joda.time.DurationField durationField39 = property32.getDurationField();
        org.joda.time.TimeOfDay timeOfDay40 = property32.withMaximumValue();
        java.lang.String str41 = property32.getAsString();
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay44 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay44.minusMillis((int) (byte) -1);
        int int47 = timeOfDay46.size();
        org.joda.time.TimeOfDay.Property property48 = timeOfDay46.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay49 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.minusMillis((int) (byte) -1);
        int int52 = timeOfDay51.size();
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay51.plusMillis((int) (short) 0);
        int int55 = property48.compareTo((org.joda.time.ReadablePartial) timeOfDay54);
        org.joda.time.TimeOfDay timeOfDay56 = property48.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay57 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay57.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology60 = timeOfDay59.getChronology();
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay59.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property63 = timeOfDay59.millisOfSecond();
        java.lang.Object obj64 = null;
        boolean boolean65 = property63.equals(obj64);
        java.lang.String str66 = property63.getName();
        org.joda.time.TimeOfDay timeOfDay67 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay67.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology70 = timeOfDay69.getChronology();
        org.joda.time.TimeOfDay timeOfDay72 = timeOfDay69.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay74 = timeOfDay69.plusHours((int) (short) -1);
        int int75 = property63.compareTo((org.joda.time.ReadablePartial) timeOfDay74);
        org.joda.time.TimeOfDay timeOfDay76 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay78 = timeOfDay76.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology79 = timeOfDay78.getChronology();
        org.joda.time.TimeOfDay timeOfDay81 = timeOfDay78.minusMinutes(0);
        boolean boolean82 = property63.equals((java.lang.Object) timeOfDay78);
        org.joda.time.TimeOfDay timeOfDay83 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay85 = timeOfDay83.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology86 = timeOfDay85.getChronology();
        org.joda.time.TimeOfDay timeOfDay88 = timeOfDay85.minusMinutes(0);
        org.joda.time.DateTime dateTime89 = timeOfDay88.toDateTimeToday();
        org.joda.time.DateTime dateTime90 = timeOfDay78.toDateTime((org.joda.time.ReadableInstant) dateTime89);
        int int91 = property48.compareTo((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTime dateTime92 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) dateTime90);
        int int93 = property32.compareTo((org.joda.time.ReadableInstant) dateTime90);
        int int94 = property25.compareTo((org.joda.time.ReadableInstant) dateTime90);
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
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "millisOfSecond" + "'", str35, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 999 + "'", int36 == 999);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1" + "'", str41, "1");
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "millisOfSecond" + "'", str66, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertNotNull(timeOfDay74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertNotNull(timeOfDay78);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(timeOfDay81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(timeOfDay83);
        org.junit.Assert.assertNotNull(timeOfDay85);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(timeOfDay88);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusHours(999);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay2.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay2.plusSeconds(100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = timeOfDay10.toDateTimeToday(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusMinutes(0);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property9 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property9.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay15.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay15.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay19 = property18.withMinimumValue();
        boolean boolean20 = timeOfDay12.isAfter((org.joda.time.ReadablePartial) timeOfDay19);
        boolean boolean21 = timeOfDay0.isEqual((org.joda.time.ReadablePartial) timeOfDay19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay0.minus(readablePeriod22);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay23.millisOfSecond();
        org.joda.time.TimeOfDay.Property property25 = timeOfDay23.secondOfMinute();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
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
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay11.withSecondOfMinute(0);
        int int16 = property7.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        int[] intArray17 = timeOfDay11.getValues();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay11.getFieldTypes();
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay25.minusMinutes(0);
        org.joda.time.LocalTime localTime29 = timeOfDay25.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay25.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay25.minusSeconds(0);
        boolean boolean34 = timeOfDay22.isEqual((org.joda.time.ReadablePartial) timeOfDay33);
        int int36 = timeOfDay33.getValue(1);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay33.withPeriodAdded(readablePeriod37, 0);
        boolean boolean40 = timeOfDay15.equals((java.lang.Object) 0);
        org.joda.time.TimeOfDay.Property property41 = timeOfDay15.hourOfDay();
        java.lang.String str42 = property41.toString();
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
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Property[hourOfDay]" + "'", str42, "Property[hourOfDay]");
    }
}
