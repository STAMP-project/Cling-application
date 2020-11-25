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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusMonths((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = yearMonthDay1.toString(dateTimeFormatter4);
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
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay((long) (byte) -1, chronology31);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay1.withChronologyRetainFields(chronology31);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay35.withPeriodAdded(readablePeriod36, 3);
        org.joda.time.TimeOfDay timeOfDay39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay35.toDateTime(timeOfDay39, dateTimeZone40);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
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
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(dateTime41);
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
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        org.joda.time.DurationField durationField11 = property7.getRangeDurationField();
        org.joda.time.YearMonthDay yearMonthDay12 = property7.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay14 = property7.addWrapFieldToCopy(1);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale18 = null;
        java.lang.String str19 = yearMonthDay16.toString("1970-01-01", locale18);
        java.lang.String str20 = yearMonthDay16.toString();
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay16.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate23 = yearMonthDay16.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        int int28 = yearMonthDay26.indexOf(dateTimeFieldType27);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay26.minusYears((int) 'a');
        org.joda.time.DateTime dateTime31 = yearMonthDay26.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay26.withPeriodAdded(readablePeriod32, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay34.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay36.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology39 = yearMonthDay38.getChronology();
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) -1, chronology39);
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay16.withChronologyRetainFields(chronology39);
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        int int45 = yearMonthDay43.indexOf(dateTimeFieldType44);
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay43.minusYears((int) 'a');
        org.joda.time.DateTime dateTime48 = yearMonthDay43.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay43.withPeriodAdded(readablePeriod49, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay51.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.YearMonthDay yearMonthDay55 = yearMonthDay51.minus(readablePeriod54);
        int int56 = yearMonthDay55.getMonthOfYear();
        int[] intArray57 = yearMonthDay55.getValues();
        boolean boolean58 = yearMonthDay16.isBefore((org.joda.time.ReadablePartial) yearMonthDay55);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.YearMonthDay yearMonthDay60 = yearMonthDay16.plus(readablePeriod59);
        int int61 = property7.compareTo((org.joda.time.ReadablePartial) yearMonthDay60);
        int int62 = property7.getMinimumValueOverall();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "January" + "'", str9, "January");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertNotNull(yearMonthDay36);
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertNotNull(yearMonthDay55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1970, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(yearMonthDay60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = yearMonthDay23.indexOf(dateTimeFieldType24);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay23.minusYears((int) 'a');
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay23.monthOfYear();
        java.util.Locale locale30 = null;
        java.lang.String str31 = property29.getAsText(locale30);
        java.lang.String str32 = property29.getAsText();
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale36 = null;
        java.lang.String str37 = yearMonthDay34.toString("1970-01-01", locale36);
        java.lang.String str38 = yearMonthDay34.toString();
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay34.minusYears((int) (byte) -1);
        boolean boolean41 = property29.equals((java.lang.Object) yearMonthDay40);
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        int int45 = yearMonthDay43.indexOf(dateTimeFieldType44);
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay43.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight48 = yearMonthDay43.toDateMidnight();
        java.lang.String str49 = yearMonthDay43.toString();
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay51.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay53 = property52.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField54 = property52.getField();
        java.util.Locale locale55 = null;
        java.lang.String str56 = property52.getAsText(locale55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property52.getFieldType();
        int int58 = yearMonthDay43.get(dateTimeFieldType57);
        int int59 = yearMonthDay43.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = null;
        int int63 = yearMonthDay61.indexOf(dateTimeFieldType62);
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay61.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight66 = yearMonthDay61.toDateMidnight();
        java.lang.String str67 = yearMonthDay61.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray68 = yearMonthDay61.getFields();
        org.joda.time.YearMonthDay yearMonthDay70 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property71 = yearMonthDay70.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay72 = property71.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField73 = property71.getField();
        java.util.Locale locale74 = null;
        java.lang.String str75 = property71.getAsText(locale74);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property71.getFieldType();
        boolean boolean77 = yearMonthDay61.isSupported(dateTimeFieldType76);
        org.joda.time.YearMonthDay.Property property78 = yearMonthDay43.property(dateTimeFieldType76);
        org.joda.time.YearMonthDay.Property property79 = yearMonthDay40.property(dateTimeFieldType76);
        int int80 = yearMonthDay19.compareTo((org.joda.time.ReadablePartial) yearMonthDay40);
        org.joda.time.YearMonthDay yearMonthDay82 = yearMonthDay19.plusYears((-1));
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "January" + "'", str31, "January");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "January" + "'", str32, "January");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01" + "'", str49, "1970-01-01");
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1" + "'", str56, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay65);
        org.junit.Assert.assertNotNull(dateMidnight66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1970-01-01" + "'", str67, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(yearMonthDay72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "1" + "'", str75, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay82);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = property2.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay9 = property2.addToCopy((int) (short) 100);
        java.lang.String str10 = property2.getAsText();
        java.util.Locale locale11 = null;
        int int12 = property2.getMaximumShortTextLength(locale11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        org.joda.time.YearMonthDay yearMonthDay12 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay12);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        org.joda.time.DurationFieldType durationFieldType29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay28.withFieldAdded(durationFieldType29, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        int int3 = property2.getMaximumValue();
        java.lang.String str4 = property2.getAsText();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = property2.withMinimumValue();
        java.lang.String str9 = yearMonthDay7.toString("1970-10-01");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = yearMonthDay7.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-10-01" + "'", str9, "1970-10-01");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property7.getFieldType();
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        int int36 = yearMonthDay34.indexOf(dateTimeFieldType35);
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay34.minusYears((int) 'a');
        org.joda.time.DateTime dateTime39 = yearMonthDay34.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay34.withPeriodAdded(readablePeriod40, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay42.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay42.minus(readablePeriod45);
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay46.plusMonths((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay48.withYear((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay50.minusYears((int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale56 = null;
        java.lang.String str57 = yearMonthDay54.toString("1970-01-01", locale56);
        boolean boolean58 = yearMonthDay50.isEqual((org.joda.time.ReadablePartial) yearMonthDay54);
        int[] intArray59 = yearMonthDay54.getValues();
        org.joda.time.YearMonthDay yearMonthDay61 = yearMonthDay54.plusDays(3);
        int int62 = property7.compareTo((org.joda.time.ReadablePartial) yearMonthDay54);
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
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(yearMonthDay44);
        org.junit.Assert.assertNotNull(yearMonthDay46);
        org.junit.Assert.assertNotNull(yearMonthDay48);
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(yearMonthDay52);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-01" + "'", str57, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
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
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        java.lang.String str10 = property7.getAsText();
        java.lang.String str11 = property7.getAsText();
        java.lang.String str12 = property7.getAsString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "January" + "'", str9, "January");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "January" + "'", str10, "January");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "January" + "'", str11, "January");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay9.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight15 = yearMonthDay9.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay9.minusMonths(22);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Interval interval20 = yearMonthDay9.toInterval(dateTimeZone19);
        org.joda.time.Chronology chronology21 = yearMonthDay9.getChronology();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        java.lang.String str10 = property7.getAsText();
        org.joda.time.YearMonthDay yearMonthDay12 = property7.setCopy("January");
        org.joda.time.YearMonthDay yearMonthDay14 = property7.addToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = yearMonthDay14.toDateMidnight(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale20 = null;
        java.lang.String str21 = yearMonthDay18.toString("1970-01-01", locale20);
        java.lang.String str22 = yearMonthDay18.toString();
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay18.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate25 = yearMonthDay18.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        int int30 = yearMonthDay28.indexOf(dateTimeFieldType29);
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay28.minusYears((int) 'a');
        org.joda.time.DateTime dateTime33 = yearMonthDay28.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay28.withPeriodAdded(readablePeriod34, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay36.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay38.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology41 = yearMonthDay40.getChronology();
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay((long) (short) -1, chronology41);
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay18.withChronologyRetainFields(chronology41);
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
        int int58 = yearMonthDay57.getMonthOfYear();
        int[] intArray59 = yearMonthDay57.getValues();
        boolean boolean60 = yearMonthDay18.isBefore((org.joda.time.ReadablePartial) yearMonthDay57);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.YearMonthDay yearMonthDay62 = yearMonthDay18.plus(readablePeriod61);
        boolean boolean63 = yearMonthDay14.isBefore((org.joda.time.ReadablePartial) yearMonthDay18);
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay18.withYear((int) 'a');
        int int66 = yearMonthDay65.size();
        int int67 = yearMonthDay65.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = null;
        int int71 = yearMonthDay69.indexOf(dateTimeFieldType70);
        org.joda.time.YearMonthDay yearMonthDay73 = yearMonthDay69.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight74 = yearMonthDay69.toDateMidnight();
        java.lang.String str75 = yearMonthDay69.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray76 = yearMonthDay69.getFields();
        org.joda.time.YearMonthDay yearMonthDay78 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property79 = yearMonthDay78.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay80 = property79.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField81 = property79.getField();
        java.util.Locale locale82 = null;
        java.lang.String str83 = property79.getAsText(locale82);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = property79.getFieldType();
        boolean boolean85 = yearMonthDay69.isSupported(dateTimeFieldType84);
        org.joda.time.YearMonthDay yearMonthDay87 = yearMonthDay69.plusMonths((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = yearMonthDay87.getFieldType((int) (byte) 0);
        int int90 = yearMonthDay65.get(dateTimeFieldType89);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str92 = yearMonthDay65.toString("Property[year]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "January" + "'", str10, "January");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(yearMonthDay36);
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(yearMonthDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertNotNull(yearMonthDay55);
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1970, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(yearMonthDay62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(yearMonthDay65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay73);
        org.junit.Assert.assertNotNull(dateMidnight74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "1970-01-01" + "'", str75, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray76);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(yearMonthDay80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "1" + "'", str83, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(yearMonthDay87);
        org.junit.Assert.assertNotNull(dateTimeFieldType89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 97 + "'", int90 == 97);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = yearMonthDay3.indexOf(dateTimeFieldType4);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay3.minusYears((int) 'a');
        org.joda.time.DateTime dateTime8 = yearMonthDay3.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay3.withPeriodAdded(readablePeriod9, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay13.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology16 = yearMonthDay15.getChronology();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) -1, chronology16);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) 9, chronology16);
        java.lang.Class<?> wildcardClass19 = yearMonthDay18.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale26 = null;
        java.lang.String str27 = yearMonthDay24.toString("1970-01-01", locale26);
        java.lang.String str28 = yearMonthDay24.toString();
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay24.minusYears((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property33 = yearMonthDay32.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay34 = property33.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = yearMonthDay34.toString(dateTimeFormatter35);
        boolean boolean37 = yearMonthDay24.isBefore((org.joda.time.ReadablePartial) yearMonthDay34);
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay24.plusDays((int) '4');
        org.joda.time.LocalDate localDate40 = yearMonthDay39.toLocalDate();
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay39.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = yearMonthDay39.toDateTimeAtMidnight(dateTimeZone42);
        int int44 = property20.compareTo((org.joda.time.ReadableInstant) dateTime43);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        int int4 = yearMonthDay2.indexOf(dateTimeFieldType3);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay2.minusYears((int) 'a');
        org.joda.time.DateTime dateTime7 = yearMonthDay2.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay2.withPeriodAdded(readablePeriod8, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay10.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay10.minus(readablePeriod13);
        org.joda.time.Chronology chronology15 = yearMonthDay10.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) 12, chronology15);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay17.toDateTimeAtMidnight(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay15.withYear((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.minusYears((int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale23 = null;
        java.lang.String str24 = yearMonthDay21.toString("1970-01-01", locale23);
        boolean boolean25 = yearMonthDay17.isEqual((org.joda.time.ReadablePartial) yearMonthDay21);
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay21.toDateMidnight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateMidnight26);
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
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.YearMonthDay yearMonthDay81 = yearMonthDay1.minus(readablePeriod80);
        org.joda.time.YearMonthDay yearMonthDay83 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = null;
        int int85 = yearMonthDay83.indexOf(dateTimeFieldType84);
        org.joda.time.YearMonthDay yearMonthDay87 = yearMonthDay83.minusYears((int) 'a');
        org.joda.time.DateTime dateTime88 = yearMonthDay83.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod89 = null;
        org.joda.time.YearMonthDay yearMonthDay91 = yearMonthDay83.withPeriodAdded(readablePeriod89, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay93 = yearMonthDay91.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay95 = yearMonthDay93.withDayOfMonth((int) (byte) 1);
        int int96 = yearMonthDay95.getMonthOfYear();
        boolean boolean97 = yearMonthDay1.isEqual((org.joda.time.ReadablePartial) yearMonthDay95);
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
        org.junit.Assert.assertNotNull(yearMonthDay81);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay87);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(yearMonthDay91);
        org.junit.Assert.assertNotNull(yearMonthDay93);
        org.junit.Assert.assertNotNull(yearMonthDay95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.YearMonthDay yearMonthDay5 = property2.getYearMonthDay();
        int int6 = property2.get();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsShortText(locale8);
        java.util.Locale locale10 = null;
        java.lang.String str11 = property2.getAsText(locale10);
        java.lang.String str12 = property2.getAsShortText();
        java.util.Locale locale13 = null;
        int int14 = property2.getMaximumTextLength(locale13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = yearMonthDay13.toString(dateTimeFormatter14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay13.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay17 = property16.getYearMonthDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(yearMonthDay17);
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
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minus(readablePeriod12);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay13.plusMonths((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay15.withYear((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.minusYears((int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale23 = null;
        java.lang.String str24 = yearMonthDay21.toString("1970-01-01", locale23);
        boolean boolean25 = yearMonthDay17.isEqual((org.joda.time.ReadablePartial) yearMonthDay21);
        int[] intArray26 = yearMonthDay21.getValues();
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay21.plusDays(3);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.plusDays(1969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(yearMonthDay30);
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
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minus(readablePeriod12);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay9.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay16.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay18 = property17.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property17.getAsText(locale20);
        org.joda.time.YearMonthDay yearMonthDay23 = property17.setCopy((int) (short) 1);
        java.util.Locale locale24 = null;
        java.lang.String str25 = property17.getAsShortText(locale24);
        java.lang.String str26 = property17.getName();
        boolean boolean27 = yearMonthDay9.equals((java.lang.Object) str26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = yearMonthDay9.toString(dateTimeFormatter28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay9.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay9.toDateTimeAtMidnight(dateTimeZone32);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "dayOfMonth" + "'", str26, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay28.dayOfMonth();
        org.joda.time.LocalDate localDate30 = yearMonthDay28.toLocalDate();
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
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate30);
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
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = yearMonthDay13.toInterval(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTimeAtMidnight();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay13.toDateTime(readableInstant17);
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
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((long) (short) -1, chronology34);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay13, chronology34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay36.toDateTimeAtCurrentTime(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        java.lang.String str10 = property7.getAsText();
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
        org.joda.time.YearMonthDay.Property property25 = yearMonthDay24.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay24.toDateTimeAtCurrentTime(dateTimeZone26);
        int int28 = property7.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale32 = null;
        java.lang.String str33 = yearMonthDay30.toString("1970-01-01", locale32);
        java.lang.String str34 = yearMonthDay30.toString();
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay30.minusYears((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay36.plusDays((int) (short) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray39 = yearMonthDay36.getFieldTypes();
        int int40 = property7.compareTo((org.joda.time.ReadablePartial) yearMonthDay36);
        java.lang.String str41 = property7.toString();
        int int42 = property7.getMinimumValue();
        java.util.Locale locale43 = null;
        java.lang.String str44 = property7.getAsShortText(locale43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "January" + "'", str10, "January");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01" + "'", str34, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay36);
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Property[monthOfYear]" + "'", str41, "Property[monthOfYear]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Jan" + "'", str44, "Jan");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property28 = yearMonthDay27.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay29 = property28.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField30 = property28.getField();
        java.util.Locale locale31 = null;
        java.lang.String str32 = property28.getAsText(locale31);
        org.joda.time.YearMonthDay yearMonthDay34 = property28.setCopy((int) (short) 1);
        java.util.Locale locale35 = null;
        java.lang.String str36 = property28.getAsShortText(locale35);
        boolean boolean37 = property17.equals((java.lang.Object) str36);
        org.joda.time.DurationField durationField38 = property17.getRangeDurationField();
        org.joda.time.YearMonthDay yearMonthDay40 = property17.addWrapFieldToCopy((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1" + "'", str32, "1");
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1" + "'", str36, "1");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(yearMonthDay40);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        boolean boolean13 = yearMonthDay9.equals((java.lang.Object) (short) -1);
        org.joda.time.LocalDate localDate14 = yearMonthDay9.toLocalDate();
        int int15 = yearMonthDay9.getYear();
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay9.plusYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.plusDays((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight6 = yearMonthDay1.toDateMidnight();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay1.minus(readablePeriod7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay1.plusMonths((int) (short) 100);
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
        org.joda.time.Chronology chronology25 = yearMonthDay20.getChronology();
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay10.withChronologyRetainFields(chronology25);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = yearMonthDay26.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay26.minusDays((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        int int33 = yearMonthDay31.indexOf(dateTimeFieldType32);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay31.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight36 = yearMonthDay31.toDateMidnight();
        java.lang.String str37 = yearMonthDay31.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray38 = yearMonthDay31.getFields();
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay40.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay42 = property41.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField43 = property41.getField();
        java.util.Locale locale44 = null;
        java.lang.String str45 = property41.getAsText(locale44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property41.getFieldType();
        boolean boolean47 = yearMonthDay31.isSupported(dateTimeFieldType46);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay31.plusMonths((int) (short) 0);
        org.joda.time.YearMonthDay.Property property50 = yearMonthDay31.dayOfMonth();
        boolean boolean51 = yearMonthDay26.equals((java.lang.Object) property50);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale55 = null;
        java.lang.String str56 = yearMonthDay53.toString("1970-01-01", locale55);
        java.lang.String str57 = yearMonthDay53.toString();
        org.joda.time.YearMonthDay yearMonthDay59 = yearMonthDay53.minusYears((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property62 = yearMonthDay61.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay63 = property62.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = null;
        java.lang.String str65 = yearMonthDay63.toString(dateTimeFormatter64);
        boolean boolean66 = yearMonthDay53.isBefore((org.joda.time.ReadablePartial) yearMonthDay63);
        java.util.Locale locale68 = null;
        java.lang.String str69 = yearMonthDay63.toString("1", locale68);
        org.joda.time.DateMidnight dateMidnight70 = yearMonthDay63.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay72 = yearMonthDay63.plusYears((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay74 = yearMonthDay63.plusMonths(1970);
        int int75 = yearMonthDay26.compareTo((org.joda.time.ReadablePartial) yearMonthDay63);
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay26.minusDays((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.DateTime dateTime79 = yearMonthDay77.toDateTime(readableInstant78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1" + "'", str45, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1970-01-01" + "'", str56, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-01" + "'", str57, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(yearMonthDay63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1970-01-01" + "'", str65, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1" + "'", str69, "1");
        org.junit.Assert.assertNotNull(dateMidnight70);
        org.junit.Assert.assertNotNull(yearMonthDay72);
        org.junit.Assert.assertNotNull(yearMonthDay74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay77);
        org.junit.Assert.assertNotNull(dateTime79);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        java.lang.String str32 = property7.getName();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "monthOfYear" + "'", str32, "monthOfYear");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        org.joda.time.YearMonthDay yearMonthDay82 = yearMonthDay65.withDayOfMonth(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay84 = yearMonthDay82.withMonthOfYear(1971);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1971 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(yearMonthDay82);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.withDayOfMonth((int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay11.minusMonths(1873);
        org.joda.time.LocalDate localDate16 = yearMonthDay15.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay15.minusMonths(31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight6 = yearMonthDay1.toDateMidnight();
        java.lang.String str7 = yearMonthDay1.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = yearMonthDay1.getFields();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay1.minus(readablePeriod9);
        org.joda.time.LocalDate localDate11 = yearMonthDay1.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay1.withPeriodAdded(readablePeriod12, (int) ' ');
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay14.withPeriodAdded(readablePeriod15, (int) (short) 10);
        org.joda.time.LocalDate localDate18 = yearMonthDay14.toLocalDate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        org.joda.time.YearMonthDay yearMonthDay69 = yearMonthDay65.minusMonths(1873);
        int[] intArray70 = yearMonthDay69.getValues();
        java.util.Locale locale72 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str73 = yearMonthDay69.toString("monthOfYear", locale72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
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
        org.junit.Assert.assertNotNull(yearMonthDay69);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1813, 12, 2]");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.plusMonths(1);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.minusDays(10);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay11.year();
        org.joda.time.DateMidnight dateMidnight15 = yearMonthDay11.toDateMidnight();
        java.lang.String str17 = yearMonthDay11.toString("1970-02-22");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-02-22" + "'", str17, "1970-02-22");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        org.joda.time.YearMonthDay yearMonthDay13 = property7.addToCopy((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay14 = property7.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay16 = property7.setCopy(12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(yearMonthDay16);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.lang.String str5 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = property2.withMinimumValue();
        int int8 = property2.get();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsShortText(locale9);
        org.joda.time.DurationField durationField11 = property2.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((java.lang.Object) property2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.YearMonthDay$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay18.dayOfMonth();
        boolean boolean20 = yearMonthDay13.equals((java.lang.Object) property19);
        java.util.Locale locale21 = null;
        int int22 = property19.getMaximumTextLength(locale21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        java.util.Locale locale10 = null;
        java.lang.String str11 = property7.getAsShortText(locale10);
        java.util.Locale locale12 = null;
        int int13 = property7.getMaximumTextLength(locale12);
        int int14 = property7.getMaximumValueOverall();
        java.lang.String str15 = property7.getAsText();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property7.getAsText(locale16);
        org.joda.time.YearMonthDay yearMonthDay19 = property7.addToCopy(22);
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay22 = property7.setCopy("dayOfMonth", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"dayOfMonth\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Jan" + "'", str11, "Jan");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "January" + "'", str15, "January");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "January" + "'", str17, "January");
        org.junit.Assert.assertNotNull(yearMonthDay19);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        int int8 = yearMonthDay6.indexOf(dateTimeFieldType7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay6.minusYears((int) 'a');
        org.joda.time.DateTime dateTime11 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay6.withPeriodAdded(readablePeriod12, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay14.toDateTimeAtMidnight(dateTimeZone15);
        int int17 = property2.compareTo((org.joda.time.ReadableInstant) dateTime16);
        java.lang.String str18 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay8 = property2.setCopy((int) (short) 1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsShortText(locale9);
        java.lang.String str11 = property2.getName();
        org.joda.time.YearMonthDay yearMonthDay13 = property2.setCopy(10);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale17 = null;
        java.lang.String str18 = yearMonthDay15.toString("1970-01-01", locale17);
        java.lang.String str19 = yearMonthDay15.toString();
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay15.minusYears((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay23.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay25 = property24.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = yearMonthDay25.toString(dateTimeFormatter26);
        boolean boolean28 = yearMonthDay15.isBefore((org.joda.time.ReadablePartial) yearMonthDay25);
        java.util.Locale locale30 = null;
        java.lang.String str31 = yearMonthDay25.toString("1", locale30);
        org.joda.time.DateMidnight dateMidnight32 = yearMonthDay25.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay25.plusYears((int) (byte) 0);
        int int35 = property2.compareTo((org.joda.time.ReadablePartial) yearMonthDay25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "dayOfMonth" + "'", str11, "dayOfMonth");
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01" + "'", str18, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1" + "'", str31, "1");
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay18.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay20 = property19.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        java.util.Locale locale22 = null;
        java.lang.String str23 = property19.getAsText(locale22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property19.getFieldType();
        int int25 = property19.getMaximumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        int int29 = yearMonthDay27.indexOf(dateTimeFieldType28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay27.minusYears((int) 'a');
        org.joda.time.DateTime dateTime32 = yearMonthDay27.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay27.withPeriodAdded(readablePeriod33, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay35.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay37.withDayOfMonth((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property40 = yearMonthDay39.year();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay39.plusDays((int) (byte) 1);
        boolean boolean43 = property19.equals((java.lang.Object) yearMonthDay42);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        int int47 = yearMonthDay45.indexOf(dateTimeFieldType46);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay45.minusYears((int) 'a');
        org.joda.time.DateTime dateTime50 = yearMonthDay45.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay45.withPeriodAdded(readablePeriod51, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay55 = yearMonthDay53.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay55.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.Interval interval59 = yearMonthDay57.toInterval(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = yearMonthDay57.toDateTimeAtMidnight();
        org.joda.time.DateTimeField[] dateTimeFieldArray61 = yearMonthDay57.getFields();
        org.joda.time.YearMonthDay yearMonthDay63 = yearMonthDay57.plusMonths(1970);
        org.joda.time.YearMonthDay yearMonthDay65 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = null;
        int int67 = yearMonthDay65.indexOf(dateTimeFieldType66);
        org.joda.time.YearMonthDay yearMonthDay69 = yearMonthDay65.minusYears((int) 'a');
        org.joda.time.DateTime dateTime70 = yearMonthDay65.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.YearMonthDay yearMonthDay73 = yearMonthDay65.withPeriodAdded(readablePeriod71, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay75 = yearMonthDay73.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay75.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology78 = yearMonthDay77.getChronology();
        org.joda.time.YearMonthDay yearMonthDay80 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property81 = yearMonthDay80.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay82 = property81.withMinimumValue();
        java.util.Locale locale83 = null;
        java.lang.String str84 = property81.getAsShortText(locale83);
        org.joda.time.DateTimeField dateTimeField85 = property81.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = property81.getFieldType();
        org.joda.time.YearMonthDay.Property property87 = yearMonthDay77.property(dateTimeFieldType86);
        org.joda.time.YearMonthDay.Property property88 = yearMonthDay57.property(dateTimeFieldType86);
        int int89 = yearMonthDay42.indexOf(dateTimeFieldType86);
        org.joda.time.YearMonthDay.Property property90 = yearMonthDay16.property(dateTimeFieldType86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 31 + "'", int25 == 31);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertNotNull(yearMonthDay55);
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTimeFieldArray61);
        org.junit.Assert.assertNotNull(yearMonthDay63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(yearMonthDay73);
        org.junit.Assert.assertNotNull(yearMonthDay75);
        org.junit.Assert.assertNotNull(yearMonthDay77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(yearMonthDay82);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "1" + "'", str84, "1");
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTimeFieldType86);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
        org.junit.Assert.assertNotNull(property90);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight6 = yearMonthDay1.toDateMidnight();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay1.minus(readablePeriod7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay1.plusMonths((int) (short) 100);
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
        org.joda.time.Chronology chronology25 = yearMonthDay20.getChronology();
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay10.withChronologyRetainFields(chronology25);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField29 = yearMonthDay27.getField(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(yearMonthDay26);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValueOverall();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        int int11 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusMonths((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.withYear(25);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        org.joda.time.Chronology chronology15 = yearMonthDay13.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonthDay13.getFieldTypes();
        int int17 = yearMonthDay13.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = yearMonthDay13.toString("1970-01-01", locale15);
        java.lang.String str17 = yearMonthDay13.toString();
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay13.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate20 = yearMonthDay13.toLocalDate();
        boolean boolean21 = yearMonthDay9.equals((java.lang.Object) localDate20);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay9.minusDays((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight24 = yearMonthDay9.toDateMidnight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(dateMidnight24);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay8 = property2.setCopy((int) (short) 1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsShortText(locale9);
        org.joda.time.YearMonthDay yearMonthDay12 = property2.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.DurationField durationField13 = property2.getRangeDurationField();
        org.joda.time.YearMonthDay yearMonthDay15 = property2.addToCopy(100);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        boolean boolean13 = yearMonthDay9.equals((java.lang.Object) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay9.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime16 = yearMonthDay9.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay18.dayOfMonth();
        boolean boolean21 = property19.equals((java.lang.Object) '4');
        java.lang.String str22 = property19.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property19.getFieldType();
        boolean boolean24 = yearMonthDay9.equals((java.lang.Object) property19);
        org.joda.time.DateTimeField dateTimeField25 = property19.getField();
        java.util.Locale locale26 = null;
        int int27 = property19.getMaximumShortTextLength(locale26);
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay30 = property19.setCopy("1978-05-01", locale29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1978-05-01\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = yearMonthDay3.toString(dateTimeFormatter4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay3.toDateTime(timeOfDay6, dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((java.lang.Object) 10L);
        boolean boolean11 = yearMonthDay3.isAfter((org.joda.time.ReadablePartial) yearMonthDay10);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay3.plusYears(1970);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay3.plusYears((int) (short) -1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        java.lang.String str10 = property7.getAsText();
        org.joda.time.DurationField durationField11 = property7.getDurationField();
        java.util.Locale locale12 = null;
        int int13 = property7.getMaximumShortTextLength(locale12);
        int int14 = property7.getMaximumValueOverall();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "January" + "'", str9, "January");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "January" + "'", str10, "January");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        int int4 = yearMonthDay2.indexOf(dateTimeFieldType3);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay2.minusYears((int) 'a');
        org.joda.time.DateTime dateTime7 = yearMonthDay2.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay2.withPeriodAdded(readablePeriod8, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.Chronology chronology13 = yearMonthDay10.getChronology();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) 3, chronology13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        java.lang.String str10 = property7.getAsText();
        java.lang.String str11 = property7.getAsShortText();
        org.joda.time.YearMonthDay yearMonthDay12 = property7.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTimeAtMidnight(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "January" + "'", str10, "January");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Jan" + "'", str11, "Jan");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTime14);
    }
}

