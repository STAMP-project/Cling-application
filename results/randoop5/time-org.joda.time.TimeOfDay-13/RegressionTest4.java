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
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 13);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMinutes((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay1.withPeriodAdded(readablePeriod4, 22);
        int int7 = timeOfDay1.getSecondOfMinute();
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        org.joda.time.TimeOfDay.Property property19 = timeOfDay17.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay21 = property19.setCopy((int) ' ');
        java.util.Locale locale22 = null;
        int int23 = property19.getMaximumTextLength(locale22);
        java.util.Locale locale24 = null;
        int int25 = property19.getMaximumShortTextLength(locale24);
        org.joda.time.TimeOfDay timeOfDay26 = property19.getTimeOfDay();
        int int27 = property19.getMaximumValue();
        org.joda.time.TimeOfDay timeOfDay28 = property19.getTimeOfDay();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59 + "'", int27 == 59);
        org.junit.Assert.assertNotNull(timeOfDay28);
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
        org.joda.time.TimeOfDay.Property property36 = timeOfDay21.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay37 = property36.getTimeOfDay();
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
        org.junit.Assert.assertNotNull(timeOfDay37);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay3 = property1.addNoWrapToCopy((int) (byte) 1);
        int int4 = property1.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay6 = property1.addToCopy(37);
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay9.getFieldTypes();
        org.joda.time.TimeOfDay.Property property12 = timeOfDay9.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay9.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology21);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay9.withChronologyRetainFields(chronology21);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology25);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = timeOfDay26.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay30.minusMinutes(0);
        org.joda.time.LocalTime localTime34 = timeOfDay30.toLocalTime();
        org.joda.time.TimeOfDay.Property property35 = timeOfDay30.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay30.plusHours(4);
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology41 = timeOfDay40.getChronology();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay40.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property44 = timeOfDay40.millisOfSecond();
        java.lang.Object obj45 = null;
        boolean boolean46 = property44.equals(obj45);
        java.lang.String str47 = property44.getName();
        org.joda.time.TimeOfDay timeOfDay48 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology51 = timeOfDay50.getChronology();
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay50.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay50.plusHours((int) (short) -1);
        int int56 = property44.compareTo((org.joda.time.ReadablePartial) timeOfDay55);
        org.joda.time.TimeOfDay.Property property57 = timeOfDay55.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay59 = property57.setCopy((int) ' ');
        int int60 = property57.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property57.getFieldType();
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay30.withField(dateTimeFieldType61, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay26.withField(dateTimeFieldType61, (int) '#');
        int int66 = timeOfDay6.indexOf(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "millisOfSecond" + "'", str47, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
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
        java.lang.String str9 = property6.getName();
        int int10 = property6.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay12 = property6.addToCopy(0);
        org.joda.time.DurationField durationField13 = property6.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay15 = property6.addNoWrapToCopy(442);
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
        org.junit.Assert.assertNotNull(timeOfDay15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology7 = timeOfDay6.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.plusHours((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay6.withMinuteOfHour((int) (short) 0);
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
        org.joda.time.DateTime dateTime48 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay((int) (byte) 0, 101, 101);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 101 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology11);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((-1L), chronology11);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(4, 101, 337, (int) (byte) 10, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 101 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
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
        int int47 = property4.compareTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DurationField durationField48 = property4.getRangeDurationField();
        int int49 = property4.getMinimumValueOverall();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = timeOfDay13.toString(dateTimeFormatter17);
        boolean boolean19 = timeOfDay10.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology30);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology30);
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray37 = timeOfDay35.getFieldTypes();
        org.joda.time.TimeOfDay.Property property38 = timeOfDay35.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay35.minusHours(999);
        org.joda.time.TimeOfDay.Property property41 = timeOfDay40.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property41.getFieldType();
        int int43 = timeOfDay32.get(dateTimeFieldType42);
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay13.withField(dateTimeFieldType42, (int) '#');
        int int46 = timeOfDay45.getMinuteOfHour();
        int int47 = timeOfDay45.size();
        org.joda.time.TimeOfDay timeOfDay51 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay51.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology54 = timeOfDay53.getChronology();
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology54);
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(chronology54);
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay56.plusSeconds(4);
        org.joda.time.DateTimeField[] dateTimeFieldArray59 = timeOfDay56.getFields();
        org.joda.time.TimeOfDay timeOfDay60 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay60.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology63 = timeOfDay62.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray64 = timeOfDay62.getFields();
        org.joda.time.TimeOfDay timeOfDay65 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay65.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology68 = timeOfDay67.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray69 = timeOfDay67.getFieldTypes();
        org.joda.time.TimeOfDay.Property property70 = timeOfDay67.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay71 = property70.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property70.getFieldType();
        int int73 = timeOfDay62.get(dateTimeFieldType72);
        int int74 = timeOfDay56.get(dateTimeFieldType72);
        org.joda.time.TimeOfDay timeOfDay76 = timeOfDay45.withField(dateTimeFieldType72, 59);
        int int77 = timeOfDay2.indexOf(dateTimeFieldType72);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "T00:00:00.001" + "'", str18, "T00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(dateTimeFieldArray59);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeFieldArray64);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(timeOfDay71);
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 37 + "'", int74 == 37);
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay(1L);
        int[] intArray2 = timeOfDay1.getValues();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = timeOfDay1.getFieldTypes();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay(1L);
        org.joda.time.Chronology chronology4 = timeOfDay3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(100, 29, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(chronology4);
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
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.get();
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getName();
        int int12 = property6.getMinimumValue();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 999 + "'", int7 == 999);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "millisOfSecond" + "'", str11, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay((int) (byte) 10, 23, chronology2);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.millisOfSecond();
        org.joda.time.TimeOfDay.Property property2 = timeOfDay0.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay4 = property2.addNoWrapToCopy(13);
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.minusMinutes(0);
        org.joda.time.DateTime dateTime11 = timeOfDay10.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property12 = timeOfDay10.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay13 = property12.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay16.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay16.withSecondOfMinute(0);
        int int21 = property12.compareTo((org.joda.time.ReadablePartial) timeOfDay16);
        java.util.Locale locale23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = property12.setCopy("0", locale23);
        java.lang.String str25 = property12.getName();
        org.joda.time.TimeOfDay timeOfDay26 = property12.withMaximumValue();
        boolean boolean27 = property2.equals((java.lang.Object) timeOfDay26);
        org.joda.time.LocalTime localTime28 = timeOfDay26.toLocalTime();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "secondOfMinute" + "'", str25, "secondOfMinute");
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localTime28);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology10);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMillis((int) (byte) -1);
        int int19 = timeOfDay18.size();
        org.joda.time.TimeOfDay.Property property20 = timeOfDay18.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay22 = property20.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.plus(readablePeriod23);
        int int25 = timeOfDay22.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay22.plusSeconds(0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = timeOfDay27.getFieldTypes();
        int int29 = timeOfDay14.compareTo((org.joda.time.ReadablePartial) timeOfDay27);
        int int30 = timeOfDay14.getMinuteOfHour();
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 37 + "'", int30 == 37);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology7 = timeOfDay6.getChronology();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(chronology7);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((long) (short) 0, chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minus(readablePeriod10);
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
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, chronology27);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay11, chronology27);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay((long) (byte) 1, chronology27);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(chronology27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(35, 871, chronology27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(timeOfDay11);
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
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(505, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 505 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        int int7 = timeOfDay2.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.minusMillis((int) (byte) 1);
        int int10 = timeOfDay2.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay16.getFieldTypes();
        org.joda.time.TimeOfDay.Property property19 = timeOfDay16.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay20 = property19.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        int int22 = timeOfDay13.indexOf(dateTimeFieldType21);
        boolean boolean23 = timeOfDay2.isSupported(dateTimeFieldType21);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay2.withSecondOfMinute((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = timeOfDay28.getFieldTypes();
        org.joda.time.TimeOfDay.Property property31 = timeOfDay28.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay28.minusHours(999);
        org.joda.time.Chronology chronology34 = timeOfDay33.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(chronology34);
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay25, chronology34);
        org.joda.time.TimeOfDay.Property property37 = timeOfDay36.secondOfMinute();
        java.lang.String str38 = property37.getName();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "secondOfMinute" + "'", str38, "secondOfMinute");
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
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay2.plusMillis((int) '#');
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay2.minusSeconds(0);
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 999);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = timeOfDay12.getFields();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay16.minusMinutes(0);
        org.joda.time.DateTime dateTime20 = timeOfDay19.toDateTimeToday();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay19.withPeriodAdded(readablePeriod21, 3);
        boolean boolean24 = timeOfDay12.isEqual((org.joda.time.ReadablePartial) timeOfDay23);
        boolean boolean25 = timeOfDay10.isBefore((org.joda.time.ReadablePartial) timeOfDay23);
        int int26 = timeOfDay10.getMillisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(1, 10);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(chronology9);
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay5.withChronologyRetainFields(chronology11);
        int int13 = timeOfDay5.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay5.plusMinutes((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay5.plusMinutes(59);
        boolean boolean20 = timeOfDay2.isAfter((org.joda.time.ReadablePartial) timeOfDay19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay2.withPeriodAdded(readablePeriod21, (int) 'a');
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay23.withPeriodAdded(readablePeriod24, 0);
        int int27 = timeOfDay26.size();
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
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
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.minusMinutes(0);
        org.joda.time.LocalTime localTime33 = timeOfDay29.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay29.withHourOfDay((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.plus(readablePeriod36);
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.plusHours((int) 'a');
        org.joda.time.TimeOfDay timeOfDay40 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.minusMillis((int) (byte) -1);
        int int43 = timeOfDay42.size();
        org.joda.time.TimeOfDay.Property property44 = timeOfDay42.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay45 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.minusMillis((int) (byte) -1);
        int int48 = timeOfDay47.size();
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay47.plusMillis((int) (short) 0);
        int int51 = property44.compareTo((org.joda.time.ReadablePartial) timeOfDay50);
        org.joda.time.TimeOfDay timeOfDay52 = property44.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay53 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay53.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology56 = timeOfDay55.getChronology();
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay55.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property59 = timeOfDay55.millisOfSecond();
        java.lang.Object obj60 = null;
        boolean boolean61 = property59.equals(obj60);
        java.lang.String str62 = property59.getName();
        org.joda.time.TimeOfDay timeOfDay63 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay63.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology66 = timeOfDay65.getChronology();
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay65.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay70 = timeOfDay65.plusHours((int) (short) -1);
        int int71 = property59.compareTo((org.joda.time.ReadablePartial) timeOfDay70);
        org.joda.time.TimeOfDay timeOfDay72 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay74 = timeOfDay72.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology75 = timeOfDay74.getChronology();
        org.joda.time.TimeOfDay timeOfDay77 = timeOfDay74.minusMinutes(0);
        boolean boolean78 = property59.equals((java.lang.Object) timeOfDay74);
        org.joda.time.TimeOfDay timeOfDay79 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay81 = timeOfDay79.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology82 = timeOfDay81.getChronology();
        org.joda.time.TimeOfDay timeOfDay84 = timeOfDay81.minusMinutes(0);
        org.joda.time.DateTime dateTime85 = timeOfDay84.toDateTimeToday();
        org.joda.time.DateTime dateTime86 = timeOfDay74.toDateTime((org.joda.time.ReadableInstant) dateTime85);
        int int87 = property44.compareTo((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.DateTime dateTime88 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.DateTime dateTime89 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.TimeOfDay timeOfDay91 = timeOfDay14.plusMillis(37);
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
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "millisOfSecond" + "'", str62, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(timeOfDay70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertNotNull(timeOfDay74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(timeOfDay77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(timeOfDay79);
        org.junit.Assert.assertNotNull(timeOfDay81);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(timeOfDay84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(timeOfDay91);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(178, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 178 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        java.lang.String str9 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusHours((int) (short) -1);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay17.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay17.plusMillis((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay24.minusMinutes(0);
        org.joda.time.LocalTime localTime28 = timeOfDay24.toLocalTime();
        org.joda.time.TimeOfDay.Property property29 = timeOfDay24.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay24.plus(readablePeriod30);
        org.joda.time.TimeOfDay timeOfDay32 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay32.minusMillis((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology38 = timeOfDay37.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray39 = timeOfDay37.getFieldTypes();
        org.joda.time.TimeOfDay.Property property40 = timeOfDay37.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay37.minusHours(999);
        org.joda.time.TimeOfDay.Property property43 = timeOfDay42.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property43.getFieldType();
        boolean boolean45 = timeOfDay32.isSupported(dateTimeFieldType44);
        org.joda.time.TimeOfDay.Property property46 = timeOfDay31.property(dateTimeFieldType44);
        org.joda.time.TimeOfDay.Property property47 = timeOfDay31.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay48 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology51 = timeOfDay50.getChronology();
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay50.minusMinutes(0);
        org.joda.time.DateTime dateTime54 = timeOfDay53.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property55 = timeOfDay53.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay53.withHourOfDay(1);
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay53.withMillisOfSecond((int) ' ');
        java.lang.String str60 = timeOfDay59.toString();
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay59.minusHours(0);
        boolean boolean63 = timeOfDay31.isAfter((org.joda.time.ReadablePartial) timeOfDay62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTimeToday(dateTimeZone64);
        org.joda.time.DateTime dateTime66 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) dateTime65);
        int int67 = timeOfDay17.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay69 = timeOfDay17.withMinuteOfHour(89);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 89 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "T00:00:00.032" + "'", str60, "T00:00:00.032");
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay2.plusMillis((int) '#');
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withMillisOfSecond(100);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay8.minusHours((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis(4);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        org.joda.time.TimeOfDay.Property property28 = timeOfDay27.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay27.withSecondOfMinute(35);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMinutes(1);
        org.joda.time.TimeOfDay.Property property33 = timeOfDay30.secondOfMinute();
        java.lang.String str34 = property33.getAsString();
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
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "35" + "'", str34, "35");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = timeOfDay12.toString(dateTimeFormatter13);
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = timeOfDay17.getFieldTypes();
        org.joda.time.TimeOfDay.Property property20 = timeOfDay17.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay17.minusHours(999);
        org.joda.time.TimeOfDay.Property property23 = timeOfDay22.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property23.getFieldType();
        java.lang.String str25 = property23.getAsShortText();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property23.getAsShortText(locale26);
        org.joda.time.TimeOfDay timeOfDay29 = property23.addWrapFieldToCopy((int) 'a');
        int int30 = timeOfDay29.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay29.withPeriodAdded(readablePeriod31, 0);
        int int34 = timeOfDay33.size();
        boolean boolean35 = timeOfDay12.isAfter((org.joda.time.ReadablePartial) timeOfDay33);
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology40 = timeOfDay39.getChronology();
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay39.minusMinutes(0);
        org.joda.time.DateTime dateTime43 = timeOfDay42.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property44 = timeOfDay42.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay45 = property44.getTimeOfDay();
        org.joda.time.Chronology chronology46 = timeOfDay45.getChronology();
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0L, chronology46);
        boolean boolean48 = timeOfDay12.equals((java.lang.Object) timeOfDay47);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = timeOfDay12.getFieldType((int) (byte) 0);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "T03:01:00.010" + "'", str14, "T03:01:00.010");
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 37 + "'", int30 == 37);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology4 = timeOfDay3.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(chronology4);
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) (short) 0, chronology4);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.minus(readablePeriod7);
        int int9 = timeOfDay8.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology13);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.withMinuteOfHour((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay20.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay20.plusMillis((int) '#');
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.withMillisOfSecond(100);
        int int29 = timeOfDay17.compareTo((org.joda.time.ReadablePartial) timeOfDay28);
        org.joda.time.TimeOfDay.Property property30 = timeOfDay28.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay32 = property30.setCopy(4);
        java.lang.String str33 = property30.getAsText();
        org.joda.time.TimeOfDay timeOfDay34 = property30.withMinimumValue();
        boolean boolean35 = timeOfDay8.equals((java.lang.Object) timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology6);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusHours((int) '#');
        int int14 = timeOfDay11.getHourOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay11.getFieldTypes();
        int int16 = property9.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(chronology23);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay19.withChronologyRetainFields(chronology25);
        int int27 = timeOfDay19.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay19.plusMinutes((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay19);
        int int31 = property9.compareTo((org.joda.time.ReadablePartial) timeOfDay19);
        int int32 = property9.getMinimumValueOverall();
        int int33 = property9.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property9.getFieldType();
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 23 + "'", int33 == 23);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.joda.time.TimeOfDay timeOfDay15 = property6.addToCopy((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology20 = timeOfDay19.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(chronology20);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((long) (short) 0, chronology20);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minus(readablePeriod23);
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
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology44 = timeOfDay43.getChronology();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(chronology44);
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay((long) (short) 0, chronology44);
        org.joda.time.TimeOfDay timeOfDay47 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology44);
        org.joda.time.TimeOfDay timeOfDay48 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology51 = timeOfDay50.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray52 = timeOfDay50.getFieldTypes();
        org.joda.time.TimeOfDay.Property property53 = timeOfDay50.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay50.minusHours(999);
        org.joda.time.TimeOfDay.Property property56 = timeOfDay55.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property56.getFieldType();
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay47.withField(dateTimeFieldType57, (int) '#');
        int int60 = timeOfDay27.indexOf(dateTimeFieldType57);
        org.joda.time.TimeOfDay timeOfDay61 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay61.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology64 = timeOfDay63.getChronology();
        org.joda.time.TimeOfDay timeOfDay66 = timeOfDay63.minusMinutes(0);
        org.joda.time.LocalTime localTime67 = timeOfDay63.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay63.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay70 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay72 = timeOfDay70.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology73 = timeOfDay72.getChronology();
        int int74 = timeOfDay69.compareTo((org.joda.time.ReadablePartial) timeOfDay72);
        org.joda.time.TimeOfDay timeOfDay76 = timeOfDay69.plusMillis(3);
        org.joda.time.TimeOfDay timeOfDay77 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay79 = timeOfDay77.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology80 = timeOfDay79.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray81 = timeOfDay79.getFieldTypes();
        org.joda.time.TimeOfDay.Property property82 = timeOfDay79.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay84 = timeOfDay79.minusHours(999);
        org.joda.time.Chronology chronology85 = timeOfDay84.getChronology();
        org.joda.time.TimeOfDay timeOfDay86 = new org.joda.time.TimeOfDay(chronology85);
        org.joda.time.TimeOfDay timeOfDay87 = timeOfDay69.withChronologyRetainFields(chronology85);
        org.joda.time.TimeOfDay timeOfDay88 = timeOfDay27.withChronologyRetainFields(chronology85);
        org.joda.time.TimeOfDay timeOfDay89 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay22, chronology85);
        int int90 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay22);
        org.joda.time.LocalTime localTime91 = timeOfDay22.toLocalTime();
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
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertNotNull(timeOfDay70);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertNotNull(timeOfDay77);
        org.junit.Assert.assertNotNull(timeOfDay79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray81);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(timeOfDay84);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(timeOfDay87);
        org.junit.Assert.assertNotNull(timeOfDay88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertNotNull(localTime91);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        java.lang.String str21 = property6.getAsText();
        java.util.Locale locale22 = null;
        java.lang.String str23 = property6.getAsShortText(locale22);
        java.util.Locale locale24 = null;
        int int25 = property6.getMaximumTextLength(locale24);
        int int26 = property6.getMinimumValueOverall();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.joda.time.TimeOfDay.Property property36 = timeOfDay35.millisOfSecond();
        org.joda.time.DurationField durationField37 = property36.getDurationField();
        java.lang.Class<?> wildcardClass38 = durationField37.getClass();
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
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        java.lang.String str15 = property6.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay16 = property6.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay17 = property6.getTimeOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property6.getField();
        java.lang.String str19 = property6.getName();
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
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "millisOfSecond" + "'", str19, "millisOfSecond");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(1, 0, (int) (byte) 0, 10, chronology10);
        int int13 = timeOfDay12.size();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.plusMinutes(3);
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.minusMinutes(0);
        org.joda.time.LocalTime localTime22 = timeOfDay18.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay18.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology28 = timeOfDay27.getChronology();
        int int29 = timeOfDay24.compareTo((org.joda.time.ReadablePartial) timeOfDay27);
        boolean boolean30 = timeOfDay15.isAfter((org.joda.time.ReadablePartial) timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        org.joda.time.DateTimeField dateTimeField48 = property47.getField();
        int int49 = property47.get();
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
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = timeOfDay5.getFieldTypes();
        org.joda.time.TimeOfDay.Property property8 = timeOfDay5.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay5.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology17);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(chronology17);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay5.withChronologyRetainFields(chronology17);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.withPeriodAdded(readablePeriod21, 4);
        int int24 = timeOfDay20.getMillisOfSecond();
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
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology44 = timeOfDay43.getChronology();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(chronology44);
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay((long) (short) 0, chronology44);
        org.joda.time.TimeOfDay timeOfDay47 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology44);
        org.joda.time.TimeOfDay timeOfDay48 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology51 = timeOfDay50.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray52 = timeOfDay50.getFieldTypes();
        org.joda.time.TimeOfDay.Property property53 = timeOfDay50.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay50.minusHours(999);
        org.joda.time.TimeOfDay.Property property56 = timeOfDay55.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property56.getFieldType();
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay47.withField(dateTimeFieldType57, (int) '#');
        int int60 = timeOfDay27.indexOf(dateTimeFieldType57);
        org.joda.time.TimeOfDay timeOfDay61 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay61.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology64 = timeOfDay63.getChronology();
        org.joda.time.TimeOfDay timeOfDay66 = timeOfDay63.minusMinutes(0);
        org.joda.time.LocalTime localTime67 = timeOfDay63.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay63.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay70 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay72 = timeOfDay70.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology73 = timeOfDay72.getChronology();
        int int74 = timeOfDay69.compareTo((org.joda.time.ReadablePartial) timeOfDay72);
        org.joda.time.TimeOfDay timeOfDay76 = timeOfDay69.plusMillis(3);
        org.joda.time.TimeOfDay timeOfDay77 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay79 = timeOfDay77.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology80 = timeOfDay79.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray81 = timeOfDay79.getFieldTypes();
        org.joda.time.TimeOfDay.Property property82 = timeOfDay79.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay84 = timeOfDay79.minusHours(999);
        org.joda.time.Chronology chronology85 = timeOfDay84.getChronology();
        org.joda.time.TimeOfDay timeOfDay86 = new org.joda.time.TimeOfDay(chronology85);
        org.joda.time.TimeOfDay timeOfDay87 = timeOfDay69.withChronologyRetainFields(chronology85);
        org.joda.time.TimeOfDay timeOfDay88 = timeOfDay27.withChronologyRetainFields(chronology85);
        org.joda.time.TimeOfDay timeOfDay89 = timeOfDay20.withChronologyRetainFields(chronology85);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay90 = new org.joda.time.TimeOfDay(573, 250, 442, chronology85);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 573 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertNotNull(timeOfDay70);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertNotNull(timeOfDay77);
        org.junit.Assert.assertNotNull(timeOfDay79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray81);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(timeOfDay84);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(timeOfDay87);
        org.junit.Assert.assertNotNull(timeOfDay88);
        org.junit.Assert.assertNotNull(timeOfDay89);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        java.lang.String str20 = property7.toString();
        org.joda.time.DurationField durationField21 = property7.getDurationField();
        org.joda.time.TimeOfDay timeOfDay22 = property7.getTimeOfDay();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Property[secondOfMinute]" + "'", str20, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(timeOfDay22);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusMinutes(0);
        org.joda.time.LocalTime localTime8 = timeOfDay4.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay4.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        int int15 = timeOfDay10.compareTo((org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay10.plusMillis(3);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = timeOfDay20.getFieldTypes();
        org.joda.time.TimeOfDay.Property property23 = timeOfDay20.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay20.minusHours(999);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(chronology26);
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay10.withChronologyRetainFields(chronology26);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(chronology26);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((int) (byte) 10, 2, chronology26);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(timeOfDay28);
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
        int int36 = timeOfDay21.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology40 = timeOfDay39.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = timeOfDay39.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay39.withSecondOfMinute(0);
        org.joda.time.LocalTime localTime44 = timeOfDay43.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay46 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology49 = timeOfDay48.getChronology();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(chronology49);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay((long) (short) 0, chronology49);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay51.minus(readablePeriod52);
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay55.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology58 = timeOfDay57.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray59 = timeOfDay57.getFieldTypes();
        org.joda.time.TimeOfDay.Property property60 = timeOfDay57.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay57.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay66 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay66.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology69 = timeOfDay68.getChronology();
        org.joda.time.TimeOfDay timeOfDay70 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology69);
        org.joda.time.TimeOfDay timeOfDay71 = new org.joda.time.TimeOfDay(chronology69);
        org.joda.time.TimeOfDay timeOfDay72 = timeOfDay57.withChronologyRetainFields(chronology69);
        org.joda.time.TimeOfDay timeOfDay73 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, chronology69);
        org.joda.time.TimeOfDay timeOfDay74 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay53, chronology69);
        int int75 = localTime44.compareTo((org.joda.time.ReadablePartial) timeOfDay53);
        boolean boolean76 = timeOfDay21.isBefore((org.joda.time.ReadablePartial) timeOfDay53);
        org.joda.time.TimeOfDay timeOfDay77 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay79 = timeOfDay77.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology80 = timeOfDay79.getChronology();
        org.joda.time.TimeOfDay timeOfDay82 = timeOfDay79.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property83 = timeOfDay79.millisOfSecond();
        java.lang.Object obj84 = null;
        boolean boolean85 = property83.equals(obj84);
        java.lang.String str86 = property83.getName();
        org.joda.time.TimeOfDay timeOfDay87 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay89 = timeOfDay87.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology90 = timeOfDay89.getChronology();
        org.joda.time.TimeOfDay timeOfDay92 = timeOfDay89.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay94 = timeOfDay89.plusHours((int) (short) -1);
        int int95 = property83.compareTo((org.joda.time.ReadablePartial) timeOfDay94);
        org.joda.time.TimeOfDay.Property property96 = timeOfDay94.secondOfMinute();
        boolean boolean97 = timeOfDay53.equals((java.lang.Object) property96);
        java.lang.String str98 = property96.getAsShortText();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertNotNull(timeOfDay73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(timeOfDay77);
        org.junit.Assert.assertNotNull(timeOfDay79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(timeOfDay82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "millisOfSecond" + "'", str86, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay87);
        org.junit.Assert.assertNotNull(timeOfDay89);
        org.junit.Assert.assertNotNull(chronology90);
        org.junit.Assert.assertNotNull(timeOfDay92);
        org.junit.Assert.assertNotNull(timeOfDay94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertNotNull(property96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "0" + "'", str98, "0");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay3.withPeriodAdded(readablePeriod4, 34);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.minus(readablePeriod7);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay11.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay11.plusMillis((int) '#');
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withMillisOfSecond(100);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay17.minusHours((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay17.minusSeconds(999);
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(chronology30);
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay26.withChronologyRetainFields(chronology32);
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay17.withChronologyRetainFields(chronology32);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay17.withPeriodAdded(readablePeriod35, (int) '#');
        boolean boolean38 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay37);
        int int39 = timeOfDay37.size();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay37.plusSeconds(22);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(timeOfDay41);
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
        int int10 = property6.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay12 = property6.addNoWrapToCopy((int) '#');
        org.joda.time.DateTime dateTime13 = timeOfDay12.toDateTimeToday();
        org.joda.time.LocalTime localTime14 = timeOfDay12.toLocalTime();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.withPeriodAdded(readablePeriod15, 852);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(timeOfDay17);
    }
}
