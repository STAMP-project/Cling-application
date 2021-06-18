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
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        int int11 = yearMonthDay9.indexOf(dateTimeFieldType10);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minusYears((int) 'a');
        org.joda.time.DateTime dateTime14 = yearMonthDay9.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay9.monthOfYear();
        java.util.Locale locale16 = null;
        int int17 = property15.getMaximumTextLength(locale16);
        java.lang.String str18 = property15.getAsText();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        int int22 = yearMonthDay20.indexOf(dateTimeFieldType21);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay20.minusYears((int) 'a');
        org.joda.time.DateTime dateTime25 = yearMonthDay20.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay20.withPeriodAdded(readablePeriod26, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay28.minus(readablePeriod31);
        org.joda.time.YearMonthDay.Property property33 = yearMonthDay32.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = yearMonthDay32.toDateTimeAtCurrentTime(dateTimeZone34);
        int int36 = property15.compareTo((org.joda.time.ReadableInstant) dateTime35);
        int int37 = property7.compareTo((org.joda.time.ReadableInstant) dateTime35);
        int int38 = property7.getMinimumValueOverall();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "January" + "'", str18, "January");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay1.year();
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay1.plusDays(1971);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property13 = yearMonthDay12.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay14 = property13.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property13.getAsText(locale16);
        org.joda.time.YearMonthDay yearMonthDay19 = property13.setCopy((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay20 = property13.withMaximumValue();
        org.joda.time.Chronology chronology21 = yearMonthDay20.getChronology();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(chronology21);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay10.withChronologyRetainFields(chronology21);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale27 = null;
        java.lang.String str28 = yearMonthDay25.toString("1970-01-01", locale27);
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay25.dayOfMonth();
        int int30 = property29.getMaximumValue();
        int int31 = property29.getMinimumValueOverall();
        org.joda.time.DurationField durationField32 = property29.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property29.getFieldType();
        int int34 = yearMonthDay10.indexOf(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 31 + "'", int30 == 31);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight6 = yearMonthDay1.toDateMidnight();
        java.lang.String str7 = yearMonthDay1.toString();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay9.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay11 = property10.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property10.getAsText(locale13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property10.getFieldType();
        int int16 = yearMonthDay1.get(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay1.plusYears(2);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay1);
        org.joda.time.DateTimeField[] dateTimeFieldArray20 = yearMonthDay19.getFields();
        int int21 = yearMonthDay19.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTimeFieldArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        java.lang.String str5 = yearMonthDay1.toString();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate8 = yearMonthDay1.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = yearMonthDay11.indexOf(dateTimeFieldType12);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay11.minusYears((int) 'a');
        org.joda.time.DateTime dateTime16 = yearMonthDay11.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay11.withPeriodAdded(readablePeriod17, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay21.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology24 = yearMonthDay23.getChronology();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1, chronology24);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay1.withChronologyRetainFields(chronology24);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay26.minus(readablePeriod27);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property31 = yearMonthDay30.dayOfMonth();
        java.util.Locale locale32 = null;
        int int33 = property31.getMaximumTextLength(locale32);
        org.joda.time.DurationField durationField34 = property31.getDurationField();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property31.getAsShortText(locale35);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        int int40 = yearMonthDay38.indexOf(dateTimeFieldType39);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay38.minusYears((int) 'a');
        org.joda.time.Chronology chronology43 = yearMonthDay42.getChronology();
        boolean boolean44 = property31.equals((java.lang.Object) yearMonthDay42);
        org.joda.time.YearMonthDay yearMonthDay45 = property31.withMaximumValue();
        boolean boolean46 = yearMonthDay28.isAfter((org.joda.time.ReadablePartial) yearMonthDay45);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1" + "'", str36, "1");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = yearMonthDay11.indexOf(dateTimeFieldType12);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay11.minusYears((int) 'a');
        org.joda.time.DateTime dateTime16 = yearMonthDay11.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay11.withPeriodAdded(readablePeriod17, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.minus(readablePeriod22);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTimeAtCurrentTime(dateTimeZone25);
        int int27 = property7.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.YearMonthDay yearMonthDay29 = property7.addToCopy(31);
        java.lang.String str30 = property7.getAsText();
        int int31 = property7.getMinimumValueOverall();
        java.util.Locale locale32 = null;
        int int33 = property7.getMaximumShortTextLength(locale32);
        org.joda.time.YearMonthDay yearMonthDay34 = property7.withMaximumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = yearMonthDay34.toString(dateTimeFormatter35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "January" + "'", str9, "January");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "January" + "'", str30, "January");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-12-01" + "'", str36, "1970-12-01");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMinimumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay10 = property2.addToCopy(9);
        int int11 = property2.get();
        int int12 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay4 = property2.addToCopy((int) '4');
        int int5 = property2.getMinimumValue();
        java.lang.String str6 = property2.getAsText();
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumTextLength(locale7);
        int int9 = property2.getMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay11 = property2.setCopy("22");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertNotNull(yearMonthDay11);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.dayOfMonth();
        int int6 = property5.getMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay7 = property5.withMinimumValue();
        java.lang.String str8 = property5.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[dayOfMonth]" + "'", str8, "Property[dayOfMonth]");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        java.lang.String str5 = yearMonthDay1.toString();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate8 = yearMonthDay1.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = yearMonthDay11.indexOf(dateTimeFieldType12);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay11.minusYears((int) 'a');
        org.joda.time.DateTime dateTime16 = yearMonthDay11.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay11.withPeriodAdded(readablePeriod17, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay21.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology24 = yearMonthDay23.getChronology();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1, chronology24);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay1.withChronologyRetainFields(chronology24);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        int int30 = yearMonthDay28.indexOf(dateTimeFieldType29);
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay28.minusYears((int) 'a');
        org.joda.time.DateTime dateTime33 = yearMonthDay28.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay28.withPeriodAdded(readablePeriod34, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay36.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay36.minus(readablePeriod39);
        int int41 = yearMonthDay40.getMonthOfYear();
        int[] intArray42 = yearMonthDay40.getValues();
        boolean boolean43 = yearMonthDay1.isBefore((org.joda.time.ReadablePartial) yearMonthDay40);
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay40.plusYears(1970);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay45.toDateTimeAtMidnight(dateTimeZone46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(yearMonthDay36);
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(yearMonthDay40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1970, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertNotNull(dateTime47);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.plusYears((int) '4');
        int int8 = yearMonthDay1.getMonthOfYear();
        org.joda.time.Chronology chronology9 = yearMonthDay1.getChronology();
        int int11 = yearMonthDay1.getValue(2);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay1.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        int int18 = yearMonthDay16.indexOf(dateTimeFieldType17);
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay16.minusYears((int) 'a');
        org.joda.time.DateTime dateTime21 = yearMonthDay16.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay16.withPeriodAdded(readablePeriod22, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay24.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay24.minus(readablePeriod27);
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay28.monthOfYear();
        org.joda.time.Chronology chronology30 = yearMonthDay28.getChronology();
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(chronology30);
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay1.withChronologyRetainFields(chronology30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay1.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        int int38 = yearMonthDay36.indexOf(dateTimeFieldType37);
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay36.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight41 = yearMonthDay36.toDateMidnight();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay36.minus(readablePeriod42);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        int int47 = yearMonthDay45.indexOf(dateTimeFieldType46);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay45.minusYears((int) 'a');
        org.joda.time.DateTime dateTime50 = yearMonthDay45.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay45.withPeriodAdded(readablePeriod51, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay55 = yearMonthDay53.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay53.minus(readablePeriod56);
        org.joda.time.YearMonthDay yearMonthDay59 = yearMonthDay57.minusYears(1970);
        int int60 = yearMonthDay36.compareTo((org.joda.time.ReadablePartial) yearMonthDay57);
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = null;
        int int64 = yearMonthDay62.indexOf(dateTimeFieldType63);
        org.joda.time.YearMonthDay yearMonthDay66 = yearMonthDay62.minusYears((int) 'a');
        org.joda.time.DateTime dateTime67 = yearMonthDay62.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.YearMonthDay yearMonthDay70 = yearMonthDay62.withPeriodAdded(readablePeriod68, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay72 = yearMonthDay70.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay74 = yearMonthDay72.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology75 = yearMonthDay74.getChronology();
        org.joda.time.YearMonthDay yearMonthDay77 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property78 = yearMonthDay77.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay79 = property78.withMinimumValue();
        java.util.Locale locale80 = null;
        java.lang.String str81 = property78.getAsShortText(locale80);
        org.joda.time.DateTimeField dateTimeField82 = property78.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = property78.getFieldType();
        org.joda.time.YearMonthDay.Property property84 = yearMonthDay74.property(dateTimeFieldType83);
        int int85 = yearMonthDay36.get(dateTimeFieldType83);
        org.joda.time.YearMonthDay.Property property86 = yearMonthDay1.property(dateTimeFieldType83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay40);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertNotNull(yearMonthDay55);
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertNotNull(yearMonthDay59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(yearMonthDay70);
        org.junit.Assert.assertNotNull(yearMonthDay72);
        org.junit.Assert.assertNotNull(yearMonthDay74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(yearMonthDay79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "1" + "'", str81, "1");
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(property86);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = yearMonthDay3.indexOf(dateTimeFieldType4);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay3.minusYears((int) 'a');
        org.joda.time.DateTime dateTime8 = yearMonthDay3.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay3.withPeriodAdded(readablePeriod9, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.plusMonths(1);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay13.minusDays(10);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay13.toDateTime(timeOfDay16, dateTimeZone17);
        boolean boolean19 = yearMonthDay1.equals((java.lang.Object) yearMonthDay13);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = yearMonthDay23.indexOf(dateTimeFieldType24);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay23.minusYears((int) 'a');
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay23.withPeriodAdded(readablePeriod29, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay31.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay33.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology36 = yearMonthDay35.getChronology();
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay((long) (short) -1, chronology36);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((long) 9, chronology36);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay(chronology36);
        boolean boolean40 = yearMonthDay13.isEqual((org.joda.time.ReadablePartial) yearMonthDay39);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay13.withYear(3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(yearMonthDay42);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.withDayOfMonth((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay11.minus(readablePeriod14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale10 = null;
        java.lang.String str11 = yearMonthDay8.toString("1970-01-01", locale10);
        java.lang.String str12 = yearMonthDay8.toString();
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay8.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate15 = yearMonthDay8.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        int int20 = yearMonthDay18.indexOf(dateTimeFieldType19);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay18.minusYears((int) 'a');
        org.joda.time.DateTime dateTime23 = yearMonthDay18.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay18.withPeriodAdded(readablePeriod24, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay26.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology31 = yearMonthDay30.getChronology();
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1, chronology31);
        org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay8.withChronologyRetainFields(chronology31);
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay((long) 10, chronology31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((int) (byte) 10, 1, (int) (byte) 1, chronology31);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((int) (short) 100, (int) (byte) 10, 1, chronology31);
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay(chronology31);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        int int41 = yearMonthDay39.indexOf(dateTimeFieldType40);
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay39.minusYears((int) 'a');
        org.joda.time.DateTime dateTime44 = yearMonthDay39.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay39.withPeriodAdded(readablePeriod45, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay47.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay47.plusDays(1);
        int int52 = yearMonthDay47.getYear();
        org.joda.time.YearMonthDay.Property property53 = yearMonthDay47.year();
        org.joda.time.YearMonthDay yearMonthDay55 = property53.addToCopy(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property53.getFieldType();
        int int57 = yearMonthDay37.indexOf(dateTimeFieldType56);
        org.joda.time.TimeOfDay timeOfDay58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = yearMonthDay37.toDateTime(timeOfDay58, dateTimeZone59);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1970 + "'", int52 == 1970);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(yearMonthDay55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(dateTime60);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.dayOfMonth();
        org.joda.time.Interval interval6 = yearMonthDay1.toInterval();
        int[] intArray7 = yearMonthDay1.getValues();
        int int8 = yearMonthDay1.getYear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay1.plus(readablePeriod9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        int int14 = yearMonthDay12.indexOf(dateTimeFieldType13);
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay12.minusYears((int) 'a');
        org.joda.time.DateTime dateTime17 = yearMonthDay12.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay12.withPeriodAdded(readablePeriod18, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay20.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay20.minus(readablePeriod23);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay24.minusYears(1970);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay24.plusMonths(1873);
        boolean boolean29 = yearMonthDay10.isEqual((org.joda.time.ReadablePartial) yearMonthDay28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1970, 1, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (byte) 0);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonthDay8.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay8.minusYears((int) 'a');
        org.joda.time.DateTime dateTime13 = yearMonthDay8.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay8.withPeriodAdded(readablePeriod14, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay16.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay16.minus(readablePeriod19);
        org.joda.time.Chronology chronology21 = yearMonthDay16.getChronology();
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay5.withChronologyRetainFields(chronology21);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (byte) -1, chronology21);
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((int) (byte) 100, 10, (int) (short) 1, chronology21);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(yearMonthDay22);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        java.lang.String str3 = property2.toString();
        java.lang.String str4 = property2.getName();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = property2.withMinimumValue();
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property2.getFieldType();
        java.lang.String str10 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[dayOfMonth]" + "'", str3, "Property[dayOfMonth]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfMonth" + "'", str4, "dayOfMonth");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[dayOfMonth]" + "'", str10, "Property[dayOfMonth]");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = yearMonthDay13.toInterval(dateTimeZone14);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay13.withMonthOfYear(10);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = yearMonthDay19.indexOf(dateTimeFieldType20);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight24 = yearMonthDay19.toDateMidnight();
        java.lang.String str25 = yearMonthDay19.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = yearMonthDay19.getFields();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay19.minus(readablePeriod27);
        org.joda.time.LocalDate localDate29 = yearMonthDay19.toLocalDate();
        boolean boolean30 = yearMonthDay13.isBefore((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        int int34 = yearMonthDay32.indexOf(dateTimeFieldType33);
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay32.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight37 = yearMonthDay32.toDateMidnight();
        java.lang.String str38 = yearMonthDay32.toString();
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay40.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay42 = property41.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField43 = property41.getField();
        java.util.Locale locale44 = null;
        java.lang.String str45 = property41.getAsText(locale44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property41.getFieldType();
        int int47 = yearMonthDay32.get(dateTimeFieldType46);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay32.plusYears(2);
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay32);
        boolean boolean51 = yearMonthDay13.isAfter((org.joda.time.ReadablePartial) yearMonthDay50);
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay50.plusYears((-292275054));
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = yearMonthDay50.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = yearMonthDay50.getFieldType(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay36);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1" + "'", str45, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertNotNull(dateTimeFieldArray54);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minus(readablePeriod12);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay13.plusMonths((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay13.plusYears(22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale4 = null;
        java.lang.String str5 = yearMonthDay2.toString("1970-01-01", locale4);
        java.lang.String str6 = yearMonthDay2.toString();
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay2.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate9 = yearMonthDay2.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        int int14 = yearMonthDay12.indexOf(dateTimeFieldType13);
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay12.minusYears((int) 'a');
        org.joda.time.DateTime dateTime17 = yearMonthDay12.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay12.withPeriodAdded(readablePeriod18, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay20.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay22.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology25 = yearMonthDay24.getChronology();
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1, chronology25);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay2.withChronologyRetainFields(chronology25);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) 10, chronology25);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(chronology25);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(yearMonthDay27);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = yearMonthDay13.toInterval(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTimeAtMidnight();
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = yearMonthDay13.getFields();
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay13.plusMonths(1970);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        int int23 = yearMonthDay21.indexOf(dateTimeFieldType22);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay21.minusYears((int) 'a');
        org.joda.time.DateTime dateTime26 = yearMonthDay21.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay21.withPeriodAdded(readablePeriod27, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay31.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology34 = yearMonthDay33.getChronology();
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property37 = yearMonthDay36.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay38 = property37.withMinimumValue();
        java.util.Locale locale39 = null;
        java.lang.String str40 = property37.getAsShortText(locale39);
        org.joda.time.DateTimeField dateTimeField41 = property37.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property37.getFieldType();
        org.joda.time.YearMonthDay.Property property43 = yearMonthDay33.property(dateTimeFieldType42);
        org.joda.time.YearMonthDay.Property property44 = yearMonthDay13.property(dateTimeFieldType42);
        java.lang.String str46 = yearMonthDay13.toString("4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1" + "'", str40, "1");
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "4" + "'", str46, "4");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay3.minusYears((int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        int int9 = yearMonthDay7.indexOf(dateTimeFieldType8);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay7.minusYears((int) 'a');
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property13 = yearMonthDay7.monthOfYear();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property13.getAsText(locale14);
        java.lang.String str16 = property13.getAsText();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale20 = null;
        java.lang.String str21 = yearMonthDay18.toString("1970-01-01", locale20);
        java.lang.String str22 = yearMonthDay18.toString();
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay18.minusYears((int) (byte) -1);
        boolean boolean25 = property13.equals((java.lang.Object) yearMonthDay24);
        org.joda.time.YearMonthDay yearMonthDay26 = property13.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay26.withPeriodAdded(readablePeriod27, 12);
        boolean boolean30 = yearMonthDay3.isBefore((org.joda.time.ReadablePartial) yearMonthDay26);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        int int34 = yearMonthDay32.indexOf(dateTimeFieldType33);
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay32.minusYears((int) 'a');
        org.joda.time.DateTime dateTime37 = yearMonthDay32.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay32.withPeriodAdded(readablePeriod38, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay40.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay40.plusDays(1);
        int int45 = yearMonthDay40.getYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = yearMonthDay40.toString(dateTimeFormatter46);
        boolean boolean48 = yearMonthDay26.isAfter((org.joda.time.ReadablePartial) yearMonthDay40);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "January" + "'", str15, "January");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "January" + "'", str16, "January");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(yearMonthDay40);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(yearMonthDay44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1970 + "'", int45 == 1970);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01" + "'", str47, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        java.lang.String str3 = property2.toString();
        java.lang.String str4 = property2.getName();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = property2.withMinimumValue();
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property2.getFieldType();
        org.joda.time.YearMonthDay yearMonthDay10 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[dayOfMonth]" + "'", str3, "Property[dayOfMonth]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfMonth" + "'", str4, "dayOfMonth");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumTextLength(locale3);
        org.joda.time.DurationField durationField5 = property2.getDurationField();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        int int9 = yearMonthDay7.indexOf(dateTimeFieldType8);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay7.minusYears((int) 'a');
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay7.withPeriodAdded(readablePeriod13, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay15.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay15.minus(readablePeriod18);
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay19.monthOfYear();
        boolean boolean21 = property2.equals((java.lang.Object) yearMonthDay19);
        java.lang.String str22 = property2.getAsShortText();
        java.lang.String str23 = property2.getAsString();
        org.joda.time.DurationField durationField24 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minus(readablePeriod12);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay13.monthOfYear();
        int int15 = yearMonthDay13.size();
        int int16 = yearMonthDay13.getYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.dayOfMonth();
        int int6 = property5.getMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay7 = property5.withMinimumValue();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property5.getAsShortText(locale8);
        java.util.Locale locale10 = null;
        int int11 = property5.getMaximumShortTextLength(locale10);
        org.joda.time.YearMonthDay yearMonthDay12 = property5.withMaximumValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonthDay12);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minus(readablePeriod12);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay13.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay16 = property14.addToCopy((int) (short) 10);
        java.util.Locale locale17 = null;
        java.lang.String str18 = property14.getAsShortText(locale17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Jan" + "'", str18, "Jan");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        int int3 = property2.getMaximumValue();
        int int4 = property2.getMaximumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay6 = property2.addWrapFieldToCopy((int) '#');
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay8.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay10 = property9.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField11 = property9.getField();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property9.getAsText(locale12);
        org.joda.time.YearMonthDay yearMonthDay15 = property9.setCopy((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay16 = property9.withMaximumValue();
        org.joda.time.Chronology chronology17 = yearMonthDay16.getChronology();
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay6.withChronologyRetainFields(chronology17);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay18);
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay18.dayOfMonth();
        boolean boolean22 = property20.equals((java.lang.Object) "1970-10-01");
        org.joda.time.YearMonthDay yearMonthDay23 = property20.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale27 = null;
        java.lang.String str28 = yearMonthDay25.toString("1970-01-01", locale27);
        java.lang.String str29 = yearMonthDay25.toString();
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay25.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate32 = yearMonthDay25.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        int int37 = yearMonthDay35.indexOf(dateTimeFieldType36);
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay35.minusYears((int) 'a');
        org.joda.time.DateTime dateTime40 = yearMonthDay35.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay35.withPeriodAdded(readablePeriod41, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay43.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay45.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology48 = yearMonthDay47.getChronology();
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay((long) (short) -1, chronology48);
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay25.withChronologyRetainFields(chronology48);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        int int54 = yearMonthDay52.indexOf(dateTimeFieldType53);
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay52.minusYears((int) 'a');
        org.joda.time.DateTime dateTime57 = yearMonthDay52.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.YearMonthDay yearMonthDay60 = yearMonthDay52.withPeriodAdded(readablePeriod58, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay62 = yearMonthDay60.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.YearMonthDay yearMonthDay64 = yearMonthDay60.minus(readablePeriod63);
        int int65 = yearMonthDay64.getMonthOfYear();
        int[] intArray66 = yearMonthDay64.getValues();
        boolean boolean67 = yearMonthDay25.isBefore((org.joda.time.ReadablePartial) yearMonthDay64);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.YearMonthDay yearMonthDay69 = yearMonthDay25.plus(readablePeriod68);
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay73 = yearMonthDay71.plusMonths((int) (short) 10);
        int int74 = yearMonthDay25.compareTo((org.joda.time.ReadablePartial) yearMonthDay73);
        org.joda.time.YearMonthDay yearMonthDay76 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property77 = yearMonthDay76.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay78 = property77.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField79 = property77.getField();
        java.util.Locale locale80 = null;
        java.lang.String str81 = property77.getAsText(locale80);
        org.joda.time.YearMonthDay yearMonthDay83 = property77.setCopy((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay84 = property77.withMaximumValue();
        org.joda.time.Chronology chronology85 = yearMonthDay84.getChronology();
        org.joda.time.YearMonthDay yearMonthDay86 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay73, chronology85);
        org.joda.time.YearMonthDay yearMonthDay88 = yearMonthDay86.plusMonths((int) (short) 1);
        org.joda.time.DateMidnight dateMidnight89 = yearMonthDay86.toDateMidnight();
        int int90 = property20.compareTo((org.joda.time.ReadableInstant) dateMidnight89);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(yearMonthDay60);
        org.junit.Assert.assertNotNull(yearMonthDay62);
        org.junit.Assert.assertNotNull(yearMonthDay64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1970, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(yearMonthDay69);
        org.junit.Assert.assertNotNull(yearMonthDay73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(yearMonthDay78);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "1" + "'", str81, "1");
        org.junit.Assert.assertNotNull(yearMonthDay83);
        org.junit.Assert.assertNotNull(yearMonthDay84);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(yearMonthDay88);
        org.junit.Assert.assertNotNull(dateMidnight89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusMonths((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale7 = null;
        java.lang.String str8 = yearMonthDay5.toString("1970-01-01", locale7);
        java.lang.String str9 = yearMonthDay5.toString();
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay5.minusYears((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay13.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay15 = property14.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = yearMonthDay15.toString(dateTimeFormatter16);
        boolean boolean18 = yearMonthDay5.isBefore((org.joda.time.ReadablePartial) yearMonthDay15);
        java.util.Locale locale20 = null;
        java.lang.String str21 = yearMonthDay15.toString("1", locale20);
        org.joda.time.DateMidnight dateMidnight22 = yearMonthDay15.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        int int26 = yearMonthDay24.indexOf(dateTimeFieldType25);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay24.minusYears((int) 'a');
        org.joda.time.DateTime dateTime29 = yearMonthDay24.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay24.withPeriodAdded(readablePeriod30, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay32.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay32.minus(readablePeriod35);
        java.util.Locale locale38 = null;
        java.lang.String str39 = yearMonthDay32.toString("1970-01-01", locale38);
        boolean boolean40 = yearMonthDay15.isEqual((org.joda.time.ReadablePartial) yearMonthDay32);
        boolean boolean41 = yearMonthDay1.isAfter((org.joda.time.ReadablePartial) yearMonthDay15);
        org.joda.time.DateTimeField[] dateTimeFieldArray42 = yearMonthDay1.getFields();
        org.joda.time.LocalDate localDate43 = yearMonthDay1.toLocalDate();
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertNotNull(yearMonthDay36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01" + "'", str39, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray42);
        org.junit.Assert.assertNotNull(localDate43);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        boolean boolean11 = yearMonthDay1.equals((java.lang.Object) "1");
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        int int15 = yearMonthDay13.indexOf(dateTimeFieldType14);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay13.minusYears((int) 'a');
        org.joda.time.DateTime dateTime18 = yearMonthDay13.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay13.withPeriodAdded(readablePeriod19, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay21.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay23.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Interval interval27 = yearMonthDay25.toInterval(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTimeAtMidnight();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay25.toDateTime(readableInstant29);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        int int35 = yearMonthDay33.indexOf(dateTimeFieldType34);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay33.minusYears((int) 'a');
        org.joda.time.DateTime dateTime38 = yearMonthDay33.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay33.withPeriodAdded(readablePeriod39, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay41.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay43.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology46 = yearMonthDay45.getChronology();
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((long) (short) -1, chronology46);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay25, chronology46);
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale53 = null;
        java.lang.String str54 = yearMonthDay51.toString("1970-01-01", locale53);
        java.lang.String str55 = yearMonthDay51.toString();
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay51.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate58 = yearMonthDay51.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = null;
        int int63 = yearMonthDay61.indexOf(dateTimeFieldType62);
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay61.minusYears((int) 'a');
        org.joda.time.DateTime dateTime66 = yearMonthDay61.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.YearMonthDay yearMonthDay69 = yearMonthDay61.withPeriodAdded(readablePeriod67, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay71 = yearMonthDay69.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay73 = yearMonthDay71.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology74 = yearMonthDay73.getChronology();
        org.joda.time.YearMonthDay yearMonthDay75 = new org.joda.time.YearMonthDay((long) (short) -1, chronology74);
        org.joda.time.YearMonthDay yearMonthDay76 = yearMonthDay51.withChronologyRetainFields(chronology74);
        org.joda.time.YearMonthDay yearMonthDay77 = new org.joda.time.YearMonthDay((long) (byte) -1, chronology74);
        org.joda.time.YearMonthDay yearMonthDay78 = yearMonthDay48.withChronologyRetainFields(chronology74);
        int int79 = yearMonthDay1.compareTo((org.joda.time.ReadablePartial) yearMonthDay78);
        org.joda.time.TimeOfDay timeOfDay80 = null;
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.DateTime dateTime82 = yearMonthDay1.toDateTime(timeOfDay80, dateTimeZone81);
        org.joda.time.DateTimeField[] dateTimeFieldArray83 = yearMonthDay1.getFields();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1970-01-01" + "'", str54, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1970-01-01" + "'", str55, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(yearMonthDay69);
        org.junit.Assert.assertNotNull(yearMonthDay71);
        org.junit.Assert.assertNotNull(yearMonthDay73);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(yearMonthDay76);
        org.junit.Assert.assertNotNull(yearMonthDay78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTimeFieldArray83);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minus(readablePeriod12);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay13.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay16.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay18 = property17.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property17.getAsText(locale20);
        org.joda.time.YearMonthDay yearMonthDay23 = property17.setCopy((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay24 = property17.withMaximumValue();
        boolean boolean25 = yearMonthDay13.equals((java.lang.Object) property17);
        org.joda.time.YearMonthDay yearMonthDay26 = property17.withMinimumValue();
        int int27 = property17.getMinimumValue();
        org.joda.time.DurationField durationField28 = property17.getDurationField();
        org.joda.time.DurationField durationField29 = property17.getDurationField();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minus(readablePeriod12);
        java.lang.String str15 = yearMonthDay13.toString("1970-12-01");
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = yearMonthDay13.toDateMidnight(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-12-01" + "'", str15, "1970-12-01");
        org.junit.Assert.assertNotNull(dateMidnight17);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight6 = yearMonthDay1.toDateMidnight();
        java.lang.String str7 = yearMonthDay1.toString();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay9.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay11 = property10.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property10.getAsText(locale13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property10.getFieldType();
        int int16 = yearMonthDay1.get(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay1.plusYears(2);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay18.toDateTime(timeOfDay19, dateTimeZone20);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = yearMonthDay18.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        int int4 = yearMonthDay2.indexOf(dateTimeFieldType3);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay2.minusYears((int) 'a');
        org.joda.time.DateTime dateTime7 = yearMonthDay2.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay2.withPeriodAdded(readablePeriod8, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay10.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology15 = yearMonthDay14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1, chronology15);
        org.joda.time.Chronology chronology17 = yearMonthDay16.getChronology();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay16.plus(readablePeriod18);
        org.joda.time.LocalDate localDate20 = yearMonthDay19.toLocalDate();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        int int4 = yearMonthDay2.indexOf(dateTimeFieldType3);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay2.minusYears((int) 'a');
        org.joda.time.DateTime dateTime7 = yearMonthDay2.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay2.withPeriodAdded(readablePeriod8, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay10.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology15 = yearMonthDay14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1, chronology15);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale22 = null;
        java.lang.String str23 = yearMonthDay20.toString("1970-01-01", locale22);
        java.lang.String str24 = yearMonthDay20.toString();
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay20.minusYears((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay20.minusMonths((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale32 = null;
        java.lang.String str33 = yearMonthDay30.toString("1970-01-01", locale32);
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay30.dayOfMonth();
        org.joda.time.Interval interval35 = yearMonthDay30.toInterval();
        int int36 = yearMonthDay28.compareTo((org.joda.time.ReadablePartial) yearMonthDay30);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        int int40 = yearMonthDay38.indexOf(dateTimeFieldType39);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay38.minusYears((int) 'a');
        org.joda.time.DateTime dateTime43 = yearMonthDay38.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay38.withPeriodAdded(readablePeriod44, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay46.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay46.plusDays(1);
        boolean boolean51 = yearMonthDay28.isEqual((org.joda.time.ReadablePartial) yearMonthDay46);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = null;
        int int55 = yearMonthDay53.indexOf(dateTimeFieldType54);
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay53.minusYears((int) 'a');
        org.joda.time.DateTime dateTime58 = yearMonthDay53.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.YearMonthDay yearMonthDay61 = yearMonthDay53.withPeriodAdded(readablePeriod59, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay63 = yearMonthDay61.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay61.plusDays(1);
        boolean boolean66 = yearMonthDay28.isEqual((org.joda.time.ReadablePartial) yearMonthDay65);
        boolean boolean67 = yearMonthDay18.isEqual((org.joda.time.ReadablePartial) yearMonthDay65);
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property70 = yearMonthDay69.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay71 = property70.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = null;
        java.lang.String str73 = yearMonthDay71.toString(dateTimeFormatter72);
        org.joda.time.TimeOfDay timeOfDay74 = null;
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = yearMonthDay71.toDateTime(timeOfDay74, dateTimeZone75);
        org.joda.time.YearMonthDay yearMonthDay78 = new org.joda.time.YearMonthDay((java.lang.Object) 10L);
        boolean boolean79 = yearMonthDay71.isAfter((org.joda.time.ReadablePartial) yearMonthDay78);
        boolean boolean80 = yearMonthDay65.isAfter((org.joda.time.ReadablePartial) yearMonthDay71);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.DateTime dateTime82 = yearMonthDay71.toDateTimeAtMidnight(dateTimeZone81);
        int int83 = yearMonthDay71.size();
        java.util.Locale locale85 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = yearMonthDay71.toString("dayOfMonth", locale85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01" + "'", str23, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(yearMonthDay46);
        org.junit.Assert.assertNotNull(yearMonthDay48);
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertNotNull(yearMonthDay63);
        org.junit.Assert.assertNotNull(yearMonthDay65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(yearMonthDay71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1970-01-01" + "'", str73, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 3 + "'", int83 == 3);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        java.lang.String str4 = yearMonthDay1.toString();
        org.joda.time.DateTime dateTime5 = yearMonthDay1.toDateTimeAtMidnight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = yearMonthDay4.indexOf(dateTimeFieldType5);
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay4.minusYears((int) 'a');
        org.joda.time.DateTime dateTime9 = yearMonthDay4.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay4.withPeriodAdded(readablePeriod10, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay14.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology17 = yearMonthDay16.getChronology();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) -1, chronology17);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) 9, chronology17);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(1L, chronology17);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minus(readablePeriod12);
        int int14 = yearMonthDay13.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay13.plusYears((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay13.toDateMidnight(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateMidnight18);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = yearMonthDay11.indexOf(dateTimeFieldType12);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay11.minusYears((int) 'a');
        org.joda.time.DateTime dateTime16 = yearMonthDay11.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay11.withPeriodAdded(readablePeriod17, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.minus(readablePeriod22);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTimeAtCurrentTime(dateTimeZone25);
        int int27 = property7.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.YearMonthDay yearMonthDay29 = property7.addToCopy(31);
        java.util.Locale locale30 = null;
        java.lang.String str31 = property7.getAsText(locale30);
        int int32 = property7.getMinimumValueOverall();
        java.util.Locale locale34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay35 = property7.setCopy("hi!", locale34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "January" + "'", str9, "January");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "January" + "'", str31, "January");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.year();
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = yearMonthDay1.getFields();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        int int7 = yearMonthDay5.indexOf(dateTimeFieldType6);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay5.minusYears((int) 'a');
        org.joda.time.DateTime dateTime10 = yearMonthDay5.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay5.withPeriodAdded(readablePeriod11, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay13.minus(readablePeriod16);
        org.joda.time.DateTime dateTime18 = yearMonthDay17.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay20.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay22 = property21.withMinimumValue();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property21.getAsShortText(locale23);
        org.joda.time.DateTimeField dateTimeField25 = property21.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property21.getFieldType();
        int int27 = yearMonthDay17.get(dateTimeFieldType26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay17.minus(readablePeriod28);
        boolean boolean30 = yearMonthDay1.equals((java.lang.Object) yearMonthDay17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property7.getDurationField();
        int int11 = property7.getMinimumValueOverall();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property7.getAsText(locale12);
        int int14 = property7.getMinimumValue();
        java.lang.String str15 = property7.toString();
        org.joda.time.DurationField durationField16 = property7.getRangeDurationField();
        org.joda.time.YearMonthDay yearMonthDay18 = property7.addWrapFieldToCopy((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "January" + "'", str13, "January");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[monthOfYear]" + "'", str15, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology14 = yearMonthDay13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay16.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay18 = property17.withMinimumValue();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property17.getAsShortText(locale19);
        org.joda.time.DateTimeField dateTimeField21 = property17.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property17.getFieldType();
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay13.property(dateTimeFieldType22);
        org.joda.time.YearMonthDay yearMonthDay24 = property23.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay26 = property23.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        int int30 = yearMonthDay28.indexOf(dateTimeFieldType29);
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay28.minusYears((int) 'a');
        org.joda.time.DateTime dateTime33 = yearMonthDay28.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay28.monthOfYear();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property34.getAsText(locale35);
        java.lang.String str37 = property34.getAsText();
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale41 = null;
        java.lang.String str42 = yearMonthDay39.toString("1970-01-01", locale41);
        java.lang.String str43 = yearMonthDay39.toString();
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay39.minusYears((int) (byte) -1);
        boolean boolean46 = property34.equals((java.lang.Object) yearMonthDay45);
        org.joda.time.YearMonthDay yearMonthDay47 = property34.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay47.withPeriodAdded(readablePeriod48, 12);
        int[] intArray51 = yearMonthDay47.getValues();
        int int52 = property23.compareTo((org.joda.time.ReadablePartial) yearMonthDay47);
        java.lang.String str53 = property23.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "January" + "'", str36, "January");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "January" + "'", str37, "January");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01" + "'", str42, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1970, 12, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Property[dayOfMonth]" + "'", str53, "Property[dayOfMonth]");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight6 = yearMonthDay1.toDateMidnight();
        java.lang.String str7 = yearMonthDay1.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = yearMonthDay1.getFields();
        int[] intArray9 = yearMonthDay1.getValues();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay11.dayOfMonth();
        java.util.Locale locale13 = null;
        int int14 = property12.getMaximumTextLength(locale13);
        org.joda.time.DurationField durationField15 = property12.getDurationField();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        int int19 = yearMonthDay17.indexOf(dateTimeFieldType18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay17.minusYears((int) 'a');
        org.joda.time.DateTime dateTime22 = yearMonthDay17.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay17.withPeriodAdded(readablePeriod23, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay25.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay25.minus(readablePeriod28);
        org.joda.time.YearMonthDay.Property property30 = yearMonthDay29.monthOfYear();
        boolean boolean31 = property12.equals((java.lang.Object) yearMonthDay29);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        int int35 = yearMonthDay33.indexOf(dateTimeFieldType34);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay33.minusYears((int) 'a');
        org.joda.time.DateTime dateTime38 = yearMonthDay33.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property39 = yearMonthDay33.monthOfYear();
        java.util.Locale locale40 = null;
        java.lang.String str41 = property39.getAsText(locale40);
        java.lang.String str42 = property39.getAsText();
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale46 = null;
        java.lang.String str47 = yearMonthDay44.toString("1970-01-01", locale46);
        java.lang.String str48 = yearMonthDay44.toString();
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay44.minusYears((int) (byte) -1);
        boolean boolean51 = property39.equals((java.lang.Object) yearMonthDay50);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = null;
        int int55 = yearMonthDay53.indexOf(dateTimeFieldType54);
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay53.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight58 = yearMonthDay53.toDateMidnight();
        java.lang.String str59 = yearMonthDay53.toString();
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property62 = yearMonthDay61.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay63 = property62.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField64 = property62.getField();
        java.util.Locale locale65 = null;
        java.lang.String str66 = property62.getAsText(locale65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property62.getFieldType();
        int int68 = yearMonthDay53.get(dateTimeFieldType67);
        int int69 = yearMonthDay53.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = null;
        int int73 = yearMonthDay71.indexOf(dateTimeFieldType72);
        org.joda.time.YearMonthDay yearMonthDay75 = yearMonthDay71.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight76 = yearMonthDay71.toDateMidnight();
        java.lang.String str77 = yearMonthDay71.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray78 = yearMonthDay71.getFields();
        org.joda.time.YearMonthDay yearMonthDay80 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property81 = yearMonthDay80.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay82 = property81.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField83 = property81.getField();
        java.util.Locale locale84 = null;
        java.lang.String str85 = property81.getAsText(locale84);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = property81.getFieldType();
        boolean boolean87 = yearMonthDay71.isSupported(dateTimeFieldType86);
        org.joda.time.YearMonthDay.Property property88 = yearMonthDay53.property(dateTimeFieldType86);
        org.joda.time.YearMonthDay.Property property89 = yearMonthDay50.property(dateTimeFieldType86);
        int int90 = yearMonthDay29.compareTo((org.joda.time.ReadablePartial) yearMonthDay50);
        boolean boolean91 = yearMonthDay1.isBefore((org.joda.time.ReadablePartial) yearMonthDay29);
        org.joda.time.DateTimeZone dateTimeZone92 = null;
        org.joda.time.DateMidnight dateMidnight93 = yearMonthDay29.toDateMidnight(dateTimeZone92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "January" + "'", str41, "January");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "January" + "'", str42, "January");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01" + "'", str47, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-01-01" + "'", str48, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970-01-01" + "'", str59, "1970-01-01");
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(yearMonthDay63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1" + "'", str66, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay75);
        org.junit.Assert.assertNotNull(dateMidnight76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "1970-01-01" + "'", str77, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray78);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(yearMonthDay82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "1" + "'", str85, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(dateMidnight93);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minus(readablePeriod12);
        int int14 = yearMonthDay13.getMonthOfYear();
        int[] intArray15 = yearMonthDay13.getValues();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay13.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay13.plusMonths(0);
        org.joda.time.DateTimeField[] dateTimeFieldArray20 = yearMonthDay19.getFields();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(dateTimeFieldArray20);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        java.lang.String str5 = yearMonthDay1.toString();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate8 = yearMonthDay1.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = yearMonthDay11.indexOf(dateTimeFieldType12);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay11.minusYears((int) 'a');
        org.joda.time.DateTime dateTime16 = yearMonthDay11.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay11.withPeriodAdded(readablePeriod17, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay21.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology24 = yearMonthDay23.getChronology();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1, chronology24);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay1.withChronologyRetainFields(chronology24);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay26.withYear(100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = yearMonthDay26.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay26.minus(readablePeriod30);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale35 = null;
        java.lang.String str36 = yearMonthDay33.toString("1970-01-01", locale35);
        java.lang.String str37 = yearMonthDay33.toString();
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay33.minusYears((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay33.minusMonths((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale45 = null;
        java.lang.String str46 = yearMonthDay43.toString("1970-01-01", locale45);
        org.joda.time.YearMonthDay.Property property47 = yearMonthDay43.dayOfMonth();
        org.joda.time.Interval interval48 = yearMonthDay43.toInterval();
        int int49 = yearMonthDay41.compareTo((org.joda.time.ReadablePartial) yearMonthDay43);
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = null;
        int int53 = yearMonthDay51.indexOf(dateTimeFieldType52);
        org.joda.time.YearMonthDay yearMonthDay55 = yearMonthDay51.minusYears((int) 'a');
        org.joda.time.DateTime dateTime56 = yearMonthDay51.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.YearMonthDay yearMonthDay59 = yearMonthDay51.withPeriodAdded(readablePeriod57, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay61 = yearMonthDay59.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay63 = yearMonthDay59.plusDays(1);
        boolean boolean64 = yearMonthDay41.isEqual((org.joda.time.ReadablePartial) yearMonthDay59);
        org.joda.time.YearMonthDay yearMonthDay66 = yearMonthDay59.plusMonths((int) (byte) 100);
        org.joda.time.YearMonthDay yearMonthDay68 = yearMonthDay66.plusMonths((int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay70 = new org.joda.time.YearMonthDay((long) (byte) 0);
        org.joda.time.YearMonthDay.Property property71 = yearMonthDay70.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay73 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = null;
        int int75 = yearMonthDay73.indexOf(dateTimeFieldType74);
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay73.minusYears((int) 'a');
        org.joda.time.DateTime dateTime78 = yearMonthDay73.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.YearMonthDay yearMonthDay81 = yearMonthDay73.withPeriodAdded(readablePeriod79, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay83 = yearMonthDay81.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        org.joda.time.YearMonthDay yearMonthDay85 = yearMonthDay81.minus(readablePeriod84);
        org.joda.time.Chronology chronology86 = yearMonthDay81.getChronology();
        org.joda.time.YearMonthDay yearMonthDay87 = yearMonthDay70.withChronologyRetainFields(chronology86);
        org.joda.time.YearMonthDay yearMonthDay88 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay66, chronology86);
        org.joda.time.YearMonthDay yearMonthDay90 = yearMonthDay88.plusDays((int) '4');
        org.joda.time.ReadablePeriod readablePeriod91 = null;
        org.joda.time.YearMonthDay yearMonthDay93 = yearMonthDay88.withPeriodAdded(readablePeriod91, 10);
        boolean boolean94 = yearMonthDay26.isAfter((org.joda.time.ReadablePartial) yearMonthDay93);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01" + "'", str46, "1970-01-01");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(yearMonthDay59);
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertNotNull(yearMonthDay63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(yearMonthDay66);
        org.junit.Assert.assertNotNull(yearMonthDay68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(yearMonthDay81);
        org.junit.Assert.assertNotNull(yearMonthDay83);
        org.junit.Assert.assertNotNull(yearMonthDay85);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(yearMonthDay87);
        org.junit.Assert.assertNotNull(yearMonthDay90);
        org.junit.Assert.assertNotNull(yearMonthDay93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }
}

