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
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        boolean boolean16 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.YearMonth.Property property17 = yearMonth12.year();
        org.joda.time.YearMonth yearMonth19 = property17.addWrapFieldToCopy((int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology23);
        org.joda.time.YearMonth.Property property25 = yearMonth24.monthOfYear();
        int int26 = property25.getMaximumValue();
        java.util.Locale locale27 = null;
        int int28 = property25.getMaximumShortTextLength(locale27);
        java.util.Locale locale29 = null;
        int int30 = property25.getMaximumTextLength(locale29);
        java.lang.String str31 = property25.getName();
        org.joda.time.YearMonth yearMonth33 = property25.addWrapFieldToCopy(100);
        int int34 = yearMonth33.getMonthOfYear();
        org.joda.time.YearMonth.Property property35 = yearMonth33.year();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.YearMonth yearMonth39 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology38);
        org.joda.time.YearMonth yearMonth41 = yearMonth39.minusYears((int) (short) 0);
        int int42 = yearMonth39.size();
        org.joda.time.YearMonth yearMonth44 = yearMonth39.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        int int46 = yearMonth39.indexOf(dateTimeFieldType45);
        org.joda.time.YearMonth yearMonth48 = yearMonth39.plusMonths((-1));
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.YearMonth yearMonth52 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology51);
        org.joda.time.YearMonth yearMonth54 = yearMonth52.minusYears((int) (short) 0);
        int int55 = yearMonth52.size();
        org.joda.time.YearMonth yearMonth57 = yearMonth52.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = null;
        int int59 = yearMonth52.indexOf(dateTimeFieldType58);
        org.joda.time.Interval interval60 = yearMonth52.toInterval();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology63);
        org.joda.time.YearMonth.Property property65 = yearMonth64.monthOfYear();
        int int66 = property65.getMaximumValue();
        java.lang.String str67 = property65.getAsShortText();
        java.util.Locale locale68 = null;
        java.lang.String str69 = property65.getAsShortText(locale68);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = property65.getFieldType();
        int int71 = yearMonth52.get(dateTimeFieldType70);
        org.joda.time.YearMonth.Property property72 = yearMonth39.property(dateTimeFieldType70);
        org.joda.time.Chronology chronology73 = yearMonth39.getChronology();
        org.joda.time.YearMonth yearMonth74 = new org.joda.time.YearMonth(chronology73);
        org.joda.time.YearMonth yearMonth75 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.YearMonth yearMonth79 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology78);
        org.joda.time.YearMonth yearMonth81 = yearMonth79.minusYears((int) (short) 0);
        org.joda.time.Interval interval82 = yearMonth79.toInterval();
        org.joda.time.Chronology chronology83 = yearMonth79.getChronology();
        org.joda.time.YearMonth yearMonth84 = yearMonth75.withChronologyRetainFields(chronology83);
        org.joda.time.YearMonth yearMonth85 = new org.joda.time.YearMonth(chronology83);
        org.joda.time.YearMonth yearMonth86 = yearMonth74.withChronologyRetainFields(chronology83);
        org.joda.time.YearMonth yearMonth87 = yearMonth33.withChronologyRetainFields(chronology83);
        org.joda.time.YearMonth yearMonth88 = new org.joda.time.YearMonth((long) (-1), chronology83);
        org.joda.time.YearMonth yearMonth89 = yearMonth19.withChronologyRetainFields(chronology83);
        org.joda.time.YearMonth yearMonth90 = new org.joda.time.YearMonth((int) (byte) -1, (int) (short) 1, chronology83);
        org.joda.time.YearMonth yearMonth91 = new org.joda.time.YearMonth((long) 100, chronology83);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 12 + "'", int26 == 12);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "monthOfYear" + "'", str31, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(yearMonth48);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 12 + "'", int66 == 12);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Oct" + "'", str67, "Oct");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Oct" + "'", str69, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(yearMonth81);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertNotNull(yearMonth84);
        org.junit.Assert.assertNotNull(yearMonth86);
        org.junit.Assert.assertNotNull(yearMonth87);
        org.junit.Assert.assertNotNull(yearMonth89);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth12.withMonthOfYear((int) (byte) 10);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology24);
        org.joda.time.YearMonth yearMonth27 = yearMonth25.minusYears((int) (short) 0);
        int int28 = yearMonth25.size();
        boolean boolean29 = yearMonth21.isAfter((org.joda.time.ReadablePartial) yearMonth25);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth.Property property34 = yearMonth33.monthOfYear();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.YearMonth yearMonth38 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology37);
        org.joda.time.YearMonth yearMonth40 = yearMonth38.minusYears((int) (short) 0);
        int int41 = yearMonth38.size();
        org.joda.time.YearMonth yearMonth43 = yearMonth38.plusMonths((int) (byte) 10);
        int int44 = property34.compareTo((org.joda.time.ReadablePartial) yearMonth38);
        org.joda.time.Chronology chronology45 = yearMonth38.getChronology();
        org.joda.time.YearMonth yearMonth46 = yearMonth25.withChronologyRetainFields(chronology45);
        org.joda.time.YearMonth yearMonth47 = new org.joda.time.YearMonth((long) (short) 1, chronology45);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.YearMonth yearMonth50 = yearMonth47.withPeriodAdded(readablePeriod48, 100);
        org.joda.time.YearMonth yearMonth52 = yearMonth47.plusYears(10);
        org.joda.time.YearMonth yearMonth54 = yearMonth52.plusYears((int) '#');
        org.joda.time.YearMonth yearMonth57 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.YearMonth yearMonth59 = yearMonth57.withYear((int) (byte) 1);
        boolean boolean60 = yearMonth52.equals((java.lang.Object) yearMonth59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.YearMonth yearMonth63 = yearMonth52.withPeriodAdded(readablePeriod61, 2);
        int int64 = yearMonth12.compareTo((org.joda.time.ReadablePartial) yearMonth63);
        org.joda.time.Chronology chronology65 = yearMonth12.getChronology();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(yearMonth63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(chronology65);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth15 = property4.getYearMonth();
        java.lang.String str16 = property4.getAsText();
        org.joda.time.YearMonth yearMonth17 = property4.getYearMonth();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth.Property property22 = yearMonth21.monthOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology31);
        org.joda.time.YearMonth yearMonth34 = yearMonth32.minusYears((int) (short) 0);
        int int35 = yearMonth32.size();
        boolean boolean36 = yearMonth28.isAfter((org.joda.time.ReadablePartial) yearMonth32);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth.Property property41 = yearMonth40.monthOfYear();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        int int48 = yearMonth45.size();
        org.joda.time.YearMonth yearMonth50 = yearMonth45.plusMonths((int) (byte) 10);
        int int51 = property41.compareTo((org.joda.time.ReadablePartial) yearMonth45);
        org.joda.time.Chronology chronology52 = yearMonth45.getChronology();
        org.joda.time.YearMonth yearMonth53 = yearMonth32.withChronologyRetainFields(chronology52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.YearMonth yearMonth56 = yearMonth53.withPeriodAdded(readablePeriod54, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        int int58 = yearMonth56.indexOf(dateTimeFieldType57);
        boolean boolean59 = yearMonth21.isEqual((org.joda.time.ReadablePartial) yearMonth56);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology62);
        org.joda.time.YearMonth.Property property64 = yearMonth63.monthOfYear();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.YearMonth yearMonth68 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology67);
        org.joda.time.YearMonth yearMonth70 = yearMonth68.minusYears((int) (short) 0);
        int int71 = yearMonth68.size();
        org.joda.time.YearMonth yearMonth73 = yearMonth68.plusMonths((int) (byte) 10);
        int int74 = property64.compareTo((org.joda.time.ReadablePartial) yearMonth68);
        boolean boolean75 = yearMonth21.isEqual((org.joda.time.ReadablePartial) yearMonth68);
        boolean boolean76 = yearMonth17.isAfter((org.joda.time.ReadablePartial) yearMonth21);
        org.joda.time.YearMonth yearMonth78 = yearMonth17.plusMonths(2);
        org.joda.time.YearMonth yearMonth80 = yearMonth17.minusMonths(12);
        int[] intArray81 = yearMonth17.getValues();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertNotNull(yearMonth34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(yearMonth70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(yearMonth73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(yearMonth78);
        org.junit.Assert.assertNotNull(yearMonth80);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[97, 10]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        java.lang.String str11 = property4.toString();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth yearMonth17 = yearMonth15.minusYears((int) (short) 0);
        int int18 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth17);
        java.util.Locale locale19 = null;
        int int20 = property4.getMaximumShortTextLength(locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth22 = property4.setCopy(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[monthOfYear]" + "'", str11, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((long) (byte) 0, chronology1);
        org.joda.time.Interval interval3 = yearMonth2.toInterval();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.YearMonth yearMonth7 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology6);
        org.joda.time.YearMonth.Property property8 = yearMonth7.monthOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        org.joda.time.YearMonth yearMonth17 = yearMonth12.plusMonths((int) (byte) 10);
        int int18 = property8.compareTo((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = yearMonth12.toString(dateTimeFormatter19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology23);
        org.joda.time.YearMonth.Property property25 = yearMonth24.monthOfYear();
        int int26 = property25.getMinimumValue();
        java.util.Locale locale27 = null;
        int int28 = property25.getMaximumShortTextLength(locale27);
        org.joda.time.DurationField durationField29 = property25.getDurationField();
        boolean boolean30 = yearMonth12.equals((java.lang.Object) property25);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology33);
        org.joda.time.YearMonth yearMonth36 = yearMonth34.minusYears((int) (short) 0);
        int int37 = yearMonth34.size();
        org.joda.time.YearMonth yearMonth39 = yearMonth34.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        int int41 = yearMonth34.indexOf(dateTimeFieldType40);
        org.joda.time.YearMonth yearMonth43 = yearMonth34.plusMonths((-1));
        boolean boolean45 = yearMonth43.equals((java.lang.Object) 1);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology48);
        org.joda.time.YearMonth.Property property50 = yearMonth49.monthOfYear();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology53);
        org.joda.time.YearMonth yearMonth56 = yearMonth54.minusYears((int) (short) 0);
        int int57 = yearMonth54.size();
        org.joda.time.YearMonth yearMonth59 = yearMonth54.plusMonths((int) (byte) 10);
        int int60 = property50.compareTo((org.joda.time.ReadablePartial) yearMonth54);
        org.joda.time.YearMonth yearMonth61 = property50.getYearMonth();
        java.lang.String str62 = property50.getAsText();
        org.joda.time.YearMonth yearMonth63 = property50.getYearMonth();
        boolean boolean64 = yearMonth43.isBefore((org.joda.time.ReadablePartial) yearMonth63);
        org.joda.time.YearMonth yearMonth66 = yearMonth43.minusYears(3);
        int int67 = yearMonth12.compareTo((org.joda.time.ReadablePartial) yearMonth43);
        org.joda.time.YearMonth yearMonth69 = yearMonth43.plusMonths(1);
        org.joda.time.YearMonth.Property property70 = yearMonth43.year();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.YearMonth yearMonth74 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology73);
        org.joda.time.YearMonth.Property property75 = yearMonth74.monthOfYear();
        int int76 = property75.getMaximumValue();
        java.util.Locale locale77 = null;
        int int78 = property75.getMaximumShortTextLength(locale77);
        java.util.Locale locale79 = null;
        int int80 = property75.getMaximumTextLength(locale79);
        java.lang.String str81 = property75.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = property75.getFieldType();
        int int83 = yearMonth43.get(dateTimeFieldType82);
        int int84 = yearMonth2.get(dateTimeFieldType82);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0097-10" + "'", str20, "0097-10");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "October" + "'", str62, "October");
        org.junit.Assert.assertNotNull(yearMonth63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(yearMonth66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(yearMonth69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 12 + "'", int76 == 12);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 3 + "'", int78 == 3);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 9 + "'", int80 == 9);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Oct" + "'", str81, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 9 + "'", int83 == 9);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getName();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy(100);
        int int13 = yearMonth12.getMonthOfYear();
        org.joda.time.YearMonth.Property property14 = yearMonth12.year();
        java.lang.String str15 = property14.toString();
        java.util.Locale locale16 = null;
        int int17 = property14.getMaximumTextLength(locale16);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[year]" + "'", str15, "Property[year]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) (short) 100);
        int int2 = yearMonth1.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.parse("1");
        org.junit.Assert.assertNotNull(yearMonth1);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getAsShortText();
        int int11 = property4.getMaximumValueOverall();
        java.util.Locale locale12 = null;
        int int13 = property4.getMaximumTextLength(locale12);
        org.joda.time.DurationField durationField14 = property4.getDurationField();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property4.getAsShortText(locale15);
        java.util.Locale locale17 = null;
        int int18 = property4.getMaximumShortTextLength(locale17);
        org.joda.time.DurationField durationField19 = property4.getRangeDurationField();
        int int20 = property4.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Oct" + "'", str10, "Oct");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Oct" + "'", str16, "Oct");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.Interval interval11 = yearMonth3.toInterval();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth.Property property16 = yearMonth15.monthOfYear();
        int int17 = property16.getMaximumValue();
        java.lang.String str18 = property16.getAsShortText();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property16.getAsShortText(locale19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property16.getFieldType();
        int int22 = yearMonth3.get(dateTimeFieldType21);
        org.joda.time.Interval interval23 = yearMonth3.toInterval();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.YearMonth yearMonth27 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology26);
        org.joda.time.YearMonth.Property property28 = yearMonth27.monthOfYear();
        int int29 = property28.getMaximumValue();
        java.lang.String str30 = property28.getAsShortText();
        org.joda.time.YearMonth yearMonth32 = property28.addWrapFieldToCopy((int) (short) -1);
        int[] intArray33 = yearMonth32.getValues();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.YearMonth yearMonth37 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology36);
        org.joda.time.YearMonth.Property property38 = yearMonth37.monthOfYear();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth yearMonth44 = yearMonth42.minusYears((int) (short) 0);
        int int45 = yearMonth42.size();
        org.joda.time.YearMonth yearMonth47 = yearMonth42.plusMonths((int) (byte) 10);
        int int48 = property38.compareTo((org.joda.time.ReadablePartial) yearMonth42);
        org.joda.time.Chronology chronology49 = yearMonth42.getChronology();
        org.joda.time.YearMonth yearMonth50 = org.joda.time.YearMonth.now(chronology49);
        org.joda.time.YearMonth yearMonth51 = yearMonth32.withChronologyRetainFields(chronology49);
        org.joda.time.YearMonth yearMonth52 = new org.joda.time.YearMonth(chronology49);
        boolean boolean53 = yearMonth3.isEqual((org.joda.time.ReadablePartial) yearMonth52);
        org.joda.time.YearMonth.Property property54 = yearMonth52.monthOfYear();
        java.util.Locale locale56 = null;
        org.joda.time.YearMonth yearMonth57 = property54.setCopy("October", locale56);
        org.joda.time.YearMonth yearMonth58 = property54.getYearMonth();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Oct" + "'", str18, "Oct");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Oct" + "'", str20, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12 + "'", int29 == 12);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Oct" + "'", str30, "Oct");
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 9]");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertNotNull(yearMonth58);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.parse("2015-01");
        int int2 = yearMonth1.size();
        org.junit.Assert.assertNotNull(yearMonth1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth15 = property4.getYearMonth();
        java.lang.String str16 = property4.getAsText();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property4.getAsText(locale17);
        org.joda.time.DurationField durationField19 = property4.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property4.getFieldType();
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth(0L);
        java.lang.String str23 = yearMonth22.toString();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.YearMonth yearMonth27 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology26);
        org.joda.time.YearMonth yearMonth29 = yearMonth27.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth yearMonth35 = yearMonth33.minusYears((int) (short) 0);
        int int36 = yearMonth33.size();
        boolean boolean37 = yearMonth29.isAfter((org.joda.time.ReadablePartial) yearMonth33);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth.Property property42 = yearMonth41.monthOfYear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.YearMonth yearMonth46 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology45);
        org.joda.time.YearMonth yearMonth48 = yearMonth46.minusYears((int) (short) 0);
        int int49 = yearMonth46.size();
        org.joda.time.YearMonth yearMonth51 = yearMonth46.plusMonths((int) (byte) 10);
        int int52 = property42.compareTo((org.joda.time.ReadablePartial) yearMonth46);
        org.joda.time.Chronology chronology53 = yearMonth46.getChronology();
        org.joda.time.YearMonth yearMonth54 = yearMonth33.withChronologyRetainFields(chronology53);
        org.joda.time.YearMonth yearMonth56 = yearMonth33.withYear((int) (byte) 1);
        boolean boolean57 = yearMonth22.isEqual((org.joda.time.ReadablePartial) yearMonth56);
        org.joda.time.YearMonth yearMonth59 = yearMonth56.plusYears(10);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology62);
        org.joda.time.YearMonth yearMonth65 = yearMonth63.minusYears((int) (short) 0);
        int int66 = yearMonth63.size();
        org.joda.time.YearMonth yearMonth68 = yearMonth63.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        int int70 = yearMonth63.indexOf(dateTimeFieldType69);
        org.joda.time.YearMonth yearMonth72 = yearMonth63.plusMonths((-1));
        org.joda.time.YearMonth yearMonth74 = yearMonth63.plusMonths((-1));
        org.joda.time.YearMonth.Property property75 = yearMonth74.monthOfYear();
        int int76 = property75.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = property75.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property75.getFieldType();
        org.joda.time.YearMonth.Property property79 = yearMonth56.property(dateTimeFieldType78);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = null;
        int int81 = yearMonth56.indexOf(dateTimeFieldType80);
        int int82 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth56);
        java.lang.String str83 = property4.toString();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "October" + "'", str18, "October");
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01" + "'", str23, "1970-01");
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(yearMonth48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(yearMonth68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(yearMonth72);
        org.junit.Assert.assertNotNull(yearMonth74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 9 + "'", int76 == 9);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertNotNull(dateTimeFieldType78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Property[monthOfYear]" + "'", str83, "Property[monthOfYear]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.YearMonth yearMonth5 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology4);
        org.joda.time.YearMonth yearMonth7 = yearMonth5.minusYears((int) (short) 0);
        int int8 = yearMonth5.size();
        org.joda.time.YearMonth yearMonth10 = yearMonth5.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = yearMonth5.indexOf(dateTimeFieldType11);
        org.joda.time.YearMonth yearMonth14 = yearMonth5.plusMonths((-1));
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = yearMonth18.indexOf(dateTimeFieldType24);
        org.joda.time.Interval interval26 = yearMonth18.toInterval();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        int int32 = property31.getMaximumValue();
        java.lang.String str33 = property31.getAsShortText();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        int int37 = yearMonth18.get(dateTimeFieldType36);
        org.joda.time.YearMonth.Property property38 = yearMonth5.property(dateTimeFieldType36);
        org.joda.time.Chronology chronology39 = yearMonth5.getChronology();
        org.joda.time.YearMonth yearMonth40 = org.joda.time.YearMonth.now(chronology39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((-292275054), (-292275054), chronology39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(yearMonth40);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.lang.String str8 = property4.getAsString();
        org.joda.time.YearMonth yearMonth10 = property4.setCopy((int) (byte) 10);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(yearMonth10);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        org.joda.time.DurationField durationField8 = property4.getDurationField();
        int int9 = property4.getMaximumValue();
        org.joda.time.YearMonth yearMonth11 = property4.addWrapFieldToCopy(97);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertNotNull(yearMonth11);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.lang.String str8 = property4.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property4.getFieldType();
        int int10 = property4.getMaximumValue();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.YearMonth yearMonth16 = yearMonth14.plus(readablePeriod15);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = yearMonth16.getFields();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth.Property property22 = yearMonth21.monthOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        int int29 = yearMonth26.size();
        org.joda.time.YearMonth yearMonth31 = yearMonth26.plusMonths((int) (byte) 10);
        int int32 = property22.compareTo((org.joda.time.ReadablePartial) yearMonth26);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth yearMonth38 = yearMonth36.minusYears((int) (short) 0);
        boolean boolean39 = yearMonth26.isAfter((org.joda.time.ReadablePartial) yearMonth36);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        int int41 = yearMonth26.indexOf(dateTimeFieldType40);
        int int42 = yearMonth26.size();
        org.joda.time.YearMonth yearMonth44 = yearMonth26.minusMonths((int) (short) -1);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.YearMonth yearMonth48 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology47);
        org.joda.time.YearMonth.Property property49 = yearMonth48.monthOfYear();
        int int50 = property49.getMaximumValue();
        java.util.Locale locale51 = null;
        int int52 = property49.getMaximumShortTextLength(locale51);
        java.util.Locale locale53 = null;
        int int54 = property49.getMaximumTextLength(locale53);
        org.joda.time.DurationField durationField55 = property49.getRangeDurationField();
        java.util.Locale locale56 = null;
        java.lang.String str57 = property49.getAsShortText(locale56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property49.getFieldType();
        boolean boolean59 = yearMonth44.isSupported(dateTimeFieldType58);
        org.joda.time.YearMonth.Property property60 = yearMonth16.property(dateTimeFieldType58);
        java.util.Locale locale62 = null;
        org.joda.time.YearMonth yearMonth63 = property60.setCopy("1", locale62);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 12 + "'", int50 == 12);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 9 + "'", int54 == 9);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Oct" + "'", str57, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(yearMonth63);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth15 = property4.getYearMonth();
        java.lang.String str16 = property4.getAsText();
        org.joda.time.YearMonth yearMonth17 = property4.getYearMonth();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.YearMonth yearMonth19 = yearMonth17.minus(readablePeriod18);
        int[] intArray20 = yearMonth19.getValues();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10]");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) 100);
        int[] intArray2 = yearMonth1.getValues();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = yearMonth1.toInterval(dateTimeZone3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1970, 1]");
        org.junit.Assert.assertNotNull(interval4);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMinimumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.DurationField durationField7 = property4.getDurationField();
        org.joda.time.YearMonth yearMonth9 = property4.addToCopy(8);
        java.lang.String str10 = yearMonth9.toString();
        org.joda.time.YearMonth yearMonth12 = yearMonth9.minusMonths(0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.YearMonth yearMonth16 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology15);
        org.joda.time.YearMonth.Property property17 = yearMonth16.monthOfYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth yearMonth23 = yearMonth21.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.YearMonth yearMonth27 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology26);
        org.joda.time.YearMonth yearMonth29 = yearMonth27.minusYears((int) (short) 0);
        int int30 = yearMonth27.size();
        boolean boolean31 = yearMonth23.isAfter((org.joda.time.ReadablePartial) yearMonth27);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology34);
        org.joda.time.YearMonth.Property property36 = yearMonth35.monthOfYear();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth yearMonth42 = yearMonth40.minusYears((int) (short) 0);
        int int43 = yearMonth40.size();
        org.joda.time.YearMonth yearMonth45 = yearMonth40.plusMonths((int) (byte) 10);
        int int46 = property36.compareTo((org.joda.time.ReadablePartial) yearMonth40);
        org.joda.time.Chronology chronology47 = yearMonth40.getChronology();
        org.joda.time.YearMonth yearMonth48 = yearMonth27.withChronologyRetainFields(chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.YearMonth yearMonth51 = yearMonth48.withPeriodAdded(readablePeriod49, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = null;
        int int53 = yearMonth51.indexOf(dateTimeFieldType52);
        boolean boolean54 = yearMonth16.isEqual((org.joda.time.ReadablePartial) yearMonth51);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.YearMonth yearMonth58 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology57);
        org.joda.time.YearMonth.Property property59 = yearMonth58.monthOfYear();
        int int60 = property59.getMaximumValue();
        java.lang.String str61 = property59.getAsShortText();
        java.util.Locale locale62 = null;
        java.lang.String str63 = property59.getAsShortText(locale62);
        org.joda.time.YearMonth yearMonth65 = property59.setCopy("October");
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.DateTime dateTime67 = yearMonth65.toDateTime(readableInstant66);
        org.joda.time.DateTime dateTime68 = yearMonth51.toDateTime(readableInstant66);
        org.joda.time.DateTime dateTime69 = yearMonth9.toDateTime((org.joda.time.ReadableInstant) dateTime68);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0098-06" + "'", str10, "0098-06");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(yearMonth42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(yearMonth45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(yearMonth48);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 12 + "'", int60 == 12);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Oct" + "'", str61, "Oct");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Oct" + "'", str63, "Oct");
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology23);
        org.joda.time.YearMonth yearMonth26 = yearMonth24.minusYears((int) (short) 0);
        int int27 = yearMonth24.size();
        boolean boolean28 = yearMonth20.isAfter((org.joda.time.ReadablePartial) yearMonth24);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.YearMonth yearMonth30 = yearMonth24.minus(readablePeriod29);
        boolean boolean31 = property4.equals((java.lang.Object) yearMonth24);
        java.util.Locale locale33 = null;
        org.joda.time.YearMonth yearMonth34 = property4.setCopy("1", locale33);
        java.util.Locale locale35 = null;
        int int36 = property4.getMaximumShortTextLength(locale35);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth yearMonth43 = yearMonth41.minusYears((int) (short) 0);
        int int44 = yearMonth41.size();
        org.joda.time.YearMonth yearMonth46 = yearMonth41.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        int int48 = yearMonth41.indexOf(dateTimeFieldType47);
        org.joda.time.YearMonth yearMonth50 = yearMonth41.plusMonths((-1));
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology53);
        org.joda.time.YearMonth yearMonth56 = yearMonth54.minusYears((int) (short) 0);
        int int57 = yearMonth54.size();
        org.joda.time.YearMonth yearMonth59 = yearMonth54.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = null;
        int int61 = yearMonth54.indexOf(dateTimeFieldType60);
        org.joda.time.Interval interval62 = yearMonth54.toInterval();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.YearMonth yearMonth66 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology65);
        org.joda.time.YearMonth.Property property67 = yearMonth66.monthOfYear();
        int int68 = property67.getMaximumValue();
        java.lang.String str69 = property67.getAsShortText();
        java.util.Locale locale70 = null;
        java.lang.String str71 = property67.getAsShortText(locale70);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property67.getFieldType();
        int int73 = yearMonth54.get(dateTimeFieldType72);
        org.joda.time.YearMonth.Property property74 = yearMonth41.property(dateTimeFieldType72);
        org.joda.time.Chronology chronology75 = yearMonth41.getChronology();
        org.joda.time.YearMonth yearMonth76 = new org.joda.time.YearMonth(chronology75);
        org.joda.time.YearMonth yearMonth77 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.YearMonth yearMonth81 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology80);
        org.joda.time.YearMonth yearMonth83 = yearMonth81.minusYears((int) (short) 0);
        org.joda.time.Interval interval84 = yearMonth81.toInterval();
        org.joda.time.Chronology chronology85 = yearMonth81.getChronology();
        org.joda.time.YearMonth yearMonth86 = yearMonth77.withChronologyRetainFields(chronology85);
        org.joda.time.YearMonth yearMonth87 = new org.joda.time.YearMonth(chronology85);
        org.joda.time.YearMonth yearMonth88 = yearMonth76.withChronologyRetainFields(chronology85);
        org.joda.time.YearMonth yearMonth89 = new org.joda.time.YearMonth((long) (short) 10, chronology85);
        org.joda.time.YearMonth yearMonth90 = org.joda.time.YearMonth.now(chronology85);
        org.joda.time.YearMonth yearMonth91 = org.joda.time.YearMonth.now(chronology85);
        int int92 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth91);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(yearMonth34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 12 + "'", int68 == 12);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Oct" + "'", str69, "Oct");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Oct" + "'", str71, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(yearMonth83);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(yearMonth86);
        org.junit.Assert.assertNotNull(yearMonth88);
        org.junit.Assert.assertNotNull(yearMonth90);
        org.junit.Assert.assertNotNull(yearMonth91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = yearMonth8.getFields();
        org.joda.time.YearMonth yearMonth11 = yearMonth8.plusYears((int) (byte) 1);
        org.joda.time.YearMonth.Property property12 = yearMonth8.monthOfYear();
        int int13 = yearMonth8.getMonthOfYear();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        int int16 = property15.get();
        int int17 = property15.getMaximumValueOverall();
        java.lang.String str18 = property15.getAsText();
        org.joda.time.YearMonth yearMonth20 = property15.addToCopy(98);
        org.joda.time.YearMonth yearMonth22 = yearMonth20.plusMonths(2020);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "September" + "'", str18, "September");
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertNotNull(yearMonth22);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Interval interval6 = yearMonth3.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = yearMonth3.getFieldTypes();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.YearMonth yearMonth11 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology10);
        org.joda.time.YearMonth yearMonth13 = yearMonth11.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth yearMonth19 = yearMonth17.minusYears((int) (short) 0);
        int int20 = yearMonth17.size();
        boolean boolean21 = yearMonth13.isAfter((org.joda.time.ReadablePartial) yearMonth17);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology24);
        org.joda.time.YearMonth.Property property26 = yearMonth25.monthOfYear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth yearMonth32 = yearMonth30.minusYears((int) (short) 0);
        int int33 = yearMonth30.size();
        org.joda.time.YearMonth yearMonth35 = yearMonth30.plusMonths((int) (byte) 10);
        int int36 = property26.compareTo((org.joda.time.ReadablePartial) yearMonth30);
        org.joda.time.Chronology chronology37 = yearMonth30.getChronology();
        org.joda.time.YearMonth yearMonth38 = yearMonth17.withChronologyRetainFields(chronology37);
        org.joda.time.YearMonth yearMonth39 = yearMonth3.withChronologyRetainFields(chronology37);
        org.joda.time.YearMonth yearMonth41 = yearMonth39.withMonthOfYear(9);
        org.joda.time.YearMonth yearMonth43 = yearMonth39.plusYears(0);
        org.joda.time.YearMonth yearMonth45 = yearMonth43.plusYears((int) (byte) 0);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertNotNull(yearMonth45);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getName();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy(100);
        int int13 = yearMonth12.getMonthOfYear();
        org.joda.time.YearMonth.Property property14 = yearMonth12.year();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = yearMonth18.indexOf(dateTimeFieldType24);
        org.joda.time.YearMonth yearMonth27 = yearMonth18.plusMonths((-1));
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.minusYears((int) (short) 0);
        int int34 = yearMonth31.size();
        org.joda.time.YearMonth yearMonth36 = yearMonth31.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        int int38 = yearMonth31.indexOf(dateTimeFieldType37);
        org.joda.time.Interval interval39 = yearMonth31.toInterval();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology42);
        org.joda.time.YearMonth.Property property44 = yearMonth43.monthOfYear();
        int int45 = property44.getMaximumValue();
        java.lang.String str46 = property44.getAsShortText();
        java.util.Locale locale47 = null;
        java.lang.String str48 = property44.getAsShortText(locale47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property44.getFieldType();
        int int50 = yearMonth31.get(dateTimeFieldType49);
        org.joda.time.YearMonth.Property property51 = yearMonth18.property(dateTimeFieldType49);
        org.joda.time.Chronology chronology52 = yearMonth18.getChronology();
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth(chronology52);
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.YearMonth yearMonth58 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology57);
        org.joda.time.YearMonth yearMonth60 = yearMonth58.minusYears((int) (short) 0);
        org.joda.time.Interval interval61 = yearMonth58.toInterval();
        org.joda.time.Chronology chronology62 = yearMonth58.getChronology();
        org.joda.time.YearMonth yearMonth63 = yearMonth54.withChronologyRetainFields(chronology62);
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth(chronology62);
        org.joda.time.YearMonth yearMonth65 = yearMonth53.withChronologyRetainFields(chronology62);
        org.joda.time.YearMonth yearMonth66 = yearMonth12.withChronologyRetainFields(chronology62);
        int int67 = yearMonth66.size();
        int int68 = yearMonth66.getYear();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.YearMonth yearMonth72 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology71);
        org.joda.time.YearMonth.Property property73 = yearMonth72.monthOfYear();
        int int74 = property73.getMaximumValue();
        java.lang.String str75 = property73.getAsShortText();
        int int76 = property73.get();
        java.lang.String str77 = property73.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property73.getFieldType();
        org.joda.time.YearMonth.Property property79 = yearMonth66.property(dateTimeFieldType78);
        int int80 = property79.getMinimumValueOverall();
        java.util.Locale locale81 = null;
        java.lang.String str82 = property79.getAsShortText(locale81);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Oct" + "'", str46, "Oct");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Oct" + "'", str48, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(yearMonth60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(yearMonth63);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertNotNull(yearMonth66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 12 + "'", int74 == 12);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Oct" + "'", str75, "Oct");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "10" + "'", str77, "10");
        org.junit.Assert.assertNotNull(dateTimeFieldType78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Feb" + "'", str82, "Feb");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.YearMonth yearMonth8 = property4.addWrapFieldToCopy((int) (short) -1);
        int[] intArray9 = yearMonth8.getValues();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth.Property property14 = yearMonth13.monthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        int int24 = property14.compareTo((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.Chronology chronology25 = yearMonth18.getChronology();
        org.joda.time.YearMonth yearMonth26 = org.joda.time.YearMonth.now(chronology25);
        org.joda.time.YearMonth yearMonth27 = yearMonth8.withChronologyRetainFields(chronology25);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth.Property property32 = yearMonth31.monthOfYear();
        int int33 = property32.getMaximumValue();
        java.lang.String str34 = property32.getAsShortText();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property32.getAsShortText(locale35);
        org.joda.time.YearMonth yearMonth38 = property32.setCopy("October");
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = yearMonth38.toDateTime(readableInstant39);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.YearMonth yearMonth51 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology50);
        org.joda.time.YearMonth yearMonth53 = yearMonth51.minusYears((int) (short) 0);
        int int54 = yearMonth51.size();
        boolean boolean55 = yearMonth47.isAfter((org.joda.time.ReadablePartial) yearMonth51);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.YearMonth yearMonth59 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology58);
        org.joda.time.YearMonth.Property property60 = yearMonth59.monthOfYear();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology63);
        org.joda.time.YearMonth yearMonth66 = yearMonth64.minusYears((int) (short) 0);
        int int67 = yearMonth64.size();
        org.joda.time.YearMonth yearMonth69 = yearMonth64.plusMonths((int) (byte) 10);
        int int70 = property60.compareTo((org.joda.time.ReadablePartial) yearMonth64);
        org.joda.time.Chronology chronology71 = yearMonth64.getChronology();
        org.joda.time.YearMonth yearMonth72 = yearMonth51.withChronologyRetainFields(chronology71);
        org.joda.time.YearMonth yearMonth73 = new org.joda.time.YearMonth((long) (short) 1, chronology71);
        org.joda.time.YearMonth yearMonth74 = new org.joda.time.YearMonth((java.lang.Object) readableInstant39, chronology71);
        boolean boolean75 = yearMonth8.equals((java.lang.Object) yearMonth74);
        org.joda.time.YearMonth.Property property76 = yearMonth8.year();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 9]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Oct" + "'", str34, "Oct");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Oct" + "'", str36, "Oct");
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(yearMonth66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(yearMonth69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(yearMonth72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(property76);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = yearMonth3.getFieldTypes();
        org.joda.time.YearMonth.Property property10 = yearMonth3.year();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property10.getAsShortText(locale11);
        java.lang.String str13 = property10.getAsString();
        org.joda.time.DateTimeField dateTimeField14 = property10.getField();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97" + "'", str12, "97");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97" + "'", str13, "97");
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Interval interval14 = yearMonth5.toInterval();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = yearMonth18.indexOf(dateTimeFieldType24);
        org.joda.time.Interval interval26 = yearMonth18.toInterval();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        int int32 = property31.getMaximumValue();
        java.lang.String str33 = property31.getAsShortText();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        int int37 = yearMonth18.get(dateTimeFieldType36);
        org.joda.time.YearMonth.Property property38 = yearMonth5.property(dateTimeFieldType36);
        java.lang.String str39 = property38.getName();
        java.util.Locale locale40 = null;
        java.lang.String str41 = property38.getAsShortText(locale40);
        java.util.Locale locale42 = null;
        int int43 = property38.getMaximumShortTextLength(locale42);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "monthOfYear" + "'", str39, "monthOfYear");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Oct" + "'", str41, "Oct");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        int int25 = yearMonth22.size();
        org.joda.time.YearMonth yearMonth27 = yearMonth22.plusMonths((int) (byte) 10);
        int int28 = property18.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.Chronology chronology29 = yearMonth22.getChronology();
        org.joda.time.YearMonth yearMonth30 = yearMonth9.withChronologyRetainFields(chronology29);
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth(chronology29);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.plusMonths((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = yearMonth31.toString(dateTimeFormatter34);
        org.joda.time.YearMonth yearMonth38 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth yearMonth44 = yearMonth42.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.YearMonth yearMonth48 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology47);
        org.joda.time.YearMonth yearMonth50 = yearMonth48.minusYears((int) (short) 0);
        int int51 = yearMonth48.size();
        boolean boolean52 = yearMonth44.isAfter((org.joda.time.ReadablePartial) yearMonth48);
        org.joda.time.Interval interval53 = yearMonth44.toInterval();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.YearMonth yearMonth57 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology56);
        org.joda.time.YearMonth yearMonth59 = yearMonth57.minusYears((int) (short) 0);
        int int60 = yearMonth57.size();
        org.joda.time.YearMonth yearMonth62 = yearMonth57.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = null;
        int int64 = yearMonth57.indexOf(dateTimeFieldType63);
        org.joda.time.Interval interval65 = yearMonth57.toInterval();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.YearMonth yearMonth69 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology68);
        org.joda.time.YearMonth.Property property70 = yearMonth69.monthOfYear();
        int int71 = property70.getMaximumValue();
        java.lang.String str72 = property70.getAsShortText();
        java.util.Locale locale73 = null;
        java.lang.String str74 = property70.getAsShortText(locale73);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property70.getFieldType();
        int int76 = yearMonth57.get(dateTimeFieldType75);
        org.joda.time.YearMonth.Property property77 = yearMonth44.property(dateTimeFieldType75);
        boolean boolean78 = yearMonth38.isSupported(dateTimeFieldType75);
        org.joda.time.YearMonth.Property property79 = yearMonth31.property(dateTimeFieldType75);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2020-11" + "'", str35, "2020-11");
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNotNull(yearMonth62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 12 + "'", int71 == 12);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Oct" + "'", str72, "Oct");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Oct" + "'", str74, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(property79);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = yearMonth8.toString(dateTimeFormatter15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        int int22 = property21.getMinimumValue();
        java.util.Locale locale23 = null;
        int int24 = property21.getMaximumShortTextLength(locale23);
        org.joda.time.DurationField durationField25 = property21.getDurationField();
        boolean boolean26 = yearMonth8.equals((java.lang.Object) property21);
        java.util.Locale locale28 = null;
        org.joda.time.YearMonth yearMonth29 = property21.setCopy("October", locale28);
        int int30 = yearMonth29.size();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0097-10" + "'", str16, "0097-10");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.YearMonth yearMonth11 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology10);
        org.joda.time.YearMonth.Property property12 = yearMonth11.monthOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.YearMonth yearMonth16 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology15);
        org.joda.time.YearMonth yearMonth18 = yearMonth16.minusYears((int) (short) 0);
        int int19 = yearMonth16.size();
        org.joda.time.YearMonth yearMonth21 = yearMonth16.plusMonths((int) (byte) 10);
        int int22 = property12.compareTo((org.joda.time.ReadablePartial) yearMonth16);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Interval interval24 = yearMonth16.toInterval(dateTimeZone23);
        org.joda.time.YearMonth yearMonth26 = yearMonth16.minusYears((int) (short) 0);
        java.lang.String str27 = yearMonth16.toString();
        org.joda.time.YearMonth yearMonth29 = yearMonth16.withMonthOfYear(11);
        boolean boolean30 = property4.equals((java.lang.Object) 11);
        int int31 = property4.getMinimumValueOverall();
        org.joda.time.DurationField durationField32 = property4.getRangeDurationField();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth yearMonth38 = yearMonth36.minusYears((int) (short) 0);
        int int39 = yearMonth36.size();
        org.joda.time.YearMonth yearMonth41 = yearMonth36.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = null;
        int int43 = yearMonth36.indexOf(dateTimeFieldType42);
        int int44 = yearMonth36.getYear();
        boolean boolean45 = property4.equals((java.lang.Object) yearMonth36);
        org.joda.time.DurationFieldType durationFieldType46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth48 = yearMonth36.withFieldAdded(durationFieldType46, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0097-10" + "'", str27, "0097-10");
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.YearMonth yearMonth4 = yearMonth2.withYear((int) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology9);
        org.joda.time.YearMonth yearMonth12 = yearMonth10.minusYears((int) (short) 0);
        int int13 = yearMonth10.size();
        org.joda.time.YearMonth yearMonth15 = yearMonth10.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        int int17 = yearMonth10.indexOf(dateTimeFieldType16);
        org.joda.time.YearMonth yearMonth19 = yearMonth10.plusMonths((-1));
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology22);
        org.joda.time.YearMonth yearMonth25 = yearMonth23.minusYears((int) (short) 0);
        int int26 = yearMonth23.size();
        org.joda.time.YearMonth yearMonth28 = yearMonth23.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        int int30 = yearMonth23.indexOf(dateTimeFieldType29);
        org.joda.time.Interval interval31 = yearMonth23.toInterval();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology34);
        org.joda.time.YearMonth.Property property36 = yearMonth35.monthOfYear();
        int int37 = property36.getMaximumValue();
        java.lang.String str38 = property36.getAsShortText();
        java.util.Locale locale39 = null;
        java.lang.String str40 = property36.getAsShortText(locale39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property36.getFieldType();
        int int42 = yearMonth23.get(dateTimeFieldType41);
        org.joda.time.YearMonth.Property property43 = yearMonth10.property(dateTimeFieldType41);
        org.joda.time.Chronology chronology44 = yearMonth10.getChronology();
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth(chronology44);
        org.joda.time.YearMonth yearMonth46 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonth yearMonth50 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology49);
        org.joda.time.YearMonth yearMonth52 = yearMonth50.minusYears((int) (short) 0);
        org.joda.time.Interval interval53 = yearMonth50.toInterval();
        org.joda.time.Chronology chronology54 = yearMonth50.getChronology();
        org.joda.time.YearMonth yearMonth55 = yearMonth46.withChronologyRetainFields(chronology54);
        org.joda.time.YearMonth yearMonth56 = new org.joda.time.YearMonth(chronology54);
        org.joda.time.YearMonth yearMonth57 = yearMonth45.withChronologyRetainFields(chronology54);
        org.joda.time.YearMonth yearMonth58 = new org.joda.time.YearMonth((long) (short) 10, chronology54);
        org.joda.time.YearMonth yearMonth59 = new org.joda.time.YearMonth(chronology54);
        org.joda.time.YearMonth yearMonth60 = new org.joda.time.YearMonth((long) 98, chronology54);
        org.joda.time.YearMonth yearMonth61 = org.joda.time.YearMonth.now(chronology54);
        org.joda.time.YearMonth yearMonth62 = new org.joda.time.YearMonth((java.lang.Object) yearMonth4, chronology54);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.YearMonth yearMonth65 = yearMonth4.withPeriodAdded(readablePeriod63, 96);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 12 + "'", int37 == 12);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Oct" + "'", str38, "Oct");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Oct" + "'", str40, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertNotNull(yearMonth65);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth15 = property4.getYearMonth();
        java.lang.String str16 = property4.getAsText();
        org.joda.time.YearMonth yearMonth17 = property4.getYearMonth();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth.Property property22 = yearMonth21.monthOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology31);
        org.joda.time.YearMonth yearMonth34 = yearMonth32.minusYears((int) (short) 0);
        int int35 = yearMonth32.size();
        boolean boolean36 = yearMonth28.isAfter((org.joda.time.ReadablePartial) yearMonth32);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth.Property property41 = yearMonth40.monthOfYear();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        int int48 = yearMonth45.size();
        org.joda.time.YearMonth yearMonth50 = yearMonth45.plusMonths((int) (byte) 10);
        int int51 = property41.compareTo((org.joda.time.ReadablePartial) yearMonth45);
        org.joda.time.Chronology chronology52 = yearMonth45.getChronology();
        org.joda.time.YearMonth yearMonth53 = yearMonth32.withChronologyRetainFields(chronology52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.YearMonth yearMonth56 = yearMonth53.withPeriodAdded(readablePeriod54, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        int int58 = yearMonth56.indexOf(dateTimeFieldType57);
        boolean boolean59 = yearMonth21.isEqual((org.joda.time.ReadablePartial) yearMonth56);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology62);
        org.joda.time.YearMonth.Property property64 = yearMonth63.monthOfYear();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.YearMonth yearMonth68 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology67);
        org.joda.time.YearMonth yearMonth70 = yearMonth68.minusYears((int) (short) 0);
        int int71 = yearMonth68.size();
        org.joda.time.YearMonth yearMonth73 = yearMonth68.plusMonths((int) (byte) 10);
        int int74 = property64.compareTo((org.joda.time.ReadablePartial) yearMonth68);
        boolean boolean75 = yearMonth21.isEqual((org.joda.time.ReadablePartial) yearMonth68);
        boolean boolean76 = yearMonth17.isAfter((org.joda.time.ReadablePartial) yearMonth21);
        org.joda.time.DurationFieldType durationFieldType77 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth79 = yearMonth17.withFieldAdded(durationFieldType77, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertNotNull(yearMonth34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(yearMonth70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(yearMonth73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        org.joda.time.Interval interval7 = yearMonth4.toInterval();
        org.joda.time.Chronology chronology8 = yearMonth4.getChronology();
        org.joda.time.YearMonth yearMonth9 = yearMonth0.withChronologyRetainFields(chronology8);
        int int10 = yearMonth0.getYear();
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology2 = yearMonth1.getChronology();
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((long) 3, chronology2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth3.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = yearMonth3.toLocalDate(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property4.getFieldType();
        int int10 = property4.getMinimumValue();
        int int11 = property4.getMinimumValue();
        org.joda.time.YearMonth yearMonth13 = property4.addWrapFieldToCopy((int) 'a');
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((long) ' ');
        int int16 = yearMonth13.compareTo((org.joda.time.ReadablePartial) yearMonth15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        int int22 = property21.getMaximumValue();
        java.lang.String str23 = property21.getAsShortText();
        org.joda.time.YearMonth yearMonth25 = property21.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.YearMonth yearMonth27 = property21.addToCopy(11);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.minusYears((int) (short) 0);
        int int34 = yearMonth31.size();
        org.joda.time.YearMonth yearMonth36 = yearMonth31.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        int int38 = yearMonth31.indexOf(dateTimeFieldType37);
        org.joda.time.Interval interval39 = yearMonth31.toInterval();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology42);
        org.joda.time.YearMonth.Property property44 = yearMonth43.monthOfYear();
        int int45 = property44.getMaximumValue();
        java.lang.String str46 = property44.getAsShortText();
        java.util.Locale locale47 = null;
        java.lang.String str48 = property44.getAsShortText(locale47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property44.getFieldType();
        int int50 = yearMonth31.get(dateTimeFieldType49);
        org.joda.time.Interval interval51 = yearMonth31.toInterval();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = yearMonth31.toString(dateTimeFormatter52);
        int int54 = yearMonth31.getMonthOfYear();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.YearMonth yearMonth58 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology57);
        org.joda.time.YearMonth yearMonth60 = yearMonth58.minusYears((int) (short) 0);
        int int61 = yearMonth58.size();
        org.joda.time.YearMonth yearMonth63 = yearMonth58.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = null;
        int int65 = yearMonth58.indexOf(dateTimeFieldType64);
        org.joda.time.YearMonth yearMonth67 = yearMonth58.plusMonths((-1));
        org.joda.time.YearMonth yearMonth69 = yearMonth58.plusMonths((-1));
        org.joda.time.YearMonth.Property property70 = yearMonth69.monthOfYear();
        int int71 = property70.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property70.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property70.getFieldType();
        org.joda.time.YearMonth.Property property74 = yearMonth31.property(dateTimeFieldType73);
        boolean boolean75 = yearMonth27.isSupported(dateTimeFieldType73);
        org.joda.time.YearMonth.Property property76 = yearMonth15.property(dateTimeFieldType73);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray77 = yearMonth15.getFieldTypes();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Oct" + "'", str23, "Oct");
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Oct" + "'", str46, "Oct");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Oct" + "'", str48, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0097-10" + "'", str53, "0097-10");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(yearMonth60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNotNull(yearMonth63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertNotNull(yearMonth69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 9 + "'", int71 == 9);
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray77);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getName();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy(100);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology15 = yearMonth12.getChronology();
        org.joda.time.YearMonth yearMonth16 = new org.joda.time.YearMonth(chronology15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        int int22 = property21.getMaximumValue();
        java.lang.String str23 = property21.getAsShortText();
        java.util.Locale locale24 = null;
        java.lang.String str25 = property21.getAsShortText(locale24);
        org.joda.time.YearMonth yearMonth27 = property21.setCopy("October");
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = yearMonth27.toDateTime(readableInstant28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth.Property property34 = yearMonth33.monthOfYear();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.YearMonth yearMonth38 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology37);
        org.joda.time.YearMonth yearMonth40 = yearMonth38.minusYears((int) (short) 0);
        int int41 = yearMonth38.size();
        org.joda.time.YearMonth yearMonth43 = yearMonth38.plusMonths((int) (byte) 10);
        int int44 = property34.compareTo((org.joda.time.ReadablePartial) yearMonth38);
        org.joda.time.Chronology chronology45 = yearMonth38.getChronology();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology48);
        org.joda.time.YearMonth yearMonth51 = yearMonth49.minusYears((int) (short) 0);
        int int52 = yearMonth49.size();
        org.joda.time.YearMonth yearMonth54 = yearMonth49.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = null;
        int int56 = yearMonth49.indexOf(dateTimeFieldType55);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.YearMonth yearMonth60 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology59);
        org.joda.time.YearMonth.Property property61 = yearMonth60.monthOfYear();
        int int62 = property61.getMaximumValue();
        java.lang.String str63 = property61.getAsShortText();
        java.util.Locale locale64 = null;
        java.lang.String str65 = property61.getAsShortText(locale64);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = property61.getFieldType();
        org.joda.time.YearMonth.Property property67 = yearMonth49.property(dateTimeFieldType66);
        org.joda.time.YearMonth.Property property68 = yearMonth38.property(dateTimeFieldType66);
        int int69 = yearMonth27.indexOf(dateTimeFieldType66);
        org.joda.time.YearMonth.Property property70 = yearMonth16.property(dateTimeFieldType66);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Oct" + "'", str23, "Oct");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Oct" + "'", str25, "Oct");
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 12 + "'", int62 == 12);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Oct" + "'", str63, "Oct");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Oct" + "'", str65, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(property70);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        java.lang.String str2 = yearMonth1.toString();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        boolean boolean16 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology24);
        org.joda.time.YearMonth yearMonth27 = yearMonth25.minusYears((int) (short) 0);
        int int28 = yearMonth25.size();
        org.joda.time.YearMonth yearMonth30 = yearMonth25.plusMonths((int) (byte) 10);
        int int31 = property21.compareTo((org.joda.time.ReadablePartial) yearMonth25);
        org.joda.time.Chronology chronology32 = yearMonth25.getChronology();
        org.joda.time.YearMonth yearMonth33 = yearMonth12.withChronologyRetainFields(chronology32);
        org.joda.time.YearMonth yearMonth35 = yearMonth12.withYear((int) (byte) 1);
        boolean boolean36 = yearMonth1.isEqual((org.joda.time.ReadablePartial) yearMonth35);
        org.joda.time.YearMonth.Property property37 = yearMonth1.monthOfYear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth.Property property42 = yearMonth41.monthOfYear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.YearMonth yearMonth46 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology45);
        org.joda.time.YearMonth yearMonth48 = yearMonth46.minusYears((int) (short) 0);
        int int49 = yearMonth46.size();
        org.joda.time.YearMonth yearMonth51 = yearMonth46.plusMonths((int) (byte) 10);
        int int52 = property42.compareTo((org.joda.time.ReadablePartial) yearMonth46);
        org.joda.time.YearMonth yearMonth53 = property42.getYearMonth();
        java.lang.String str54 = property42.getAsText();
        org.joda.time.YearMonth yearMonth55 = property42.getYearMonth();
        org.joda.time.YearMonth yearMonth57 = property42.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.YearMonth yearMonth59 = yearMonth57.minusMonths((int) (short) 1);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology62);
        org.joda.time.YearMonth.Property property64 = yearMonth63.monthOfYear();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.YearMonth yearMonth68 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology67);
        org.joda.time.YearMonth yearMonth70 = yearMonth68.minusYears((int) (short) 0);
        int int71 = yearMonth68.size();
        org.joda.time.YearMonth yearMonth73 = yearMonth68.plusMonths((int) (byte) 10);
        int int74 = property64.compareTo((org.joda.time.ReadablePartial) yearMonth68);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.YearMonth yearMonth78 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology77);
        org.joda.time.YearMonth yearMonth80 = yearMonth78.minusYears((int) (short) 0);
        boolean boolean81 = yearMonth68.isAfter((org.joda.time.ReadablePartial) yearMonth78);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = null;
        int int83 = yearMonth68.indexOf(dateTimeFieldType82);
        int int84 = yearMonth68.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray85 = yearMonth68.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = yearMonth68.getFieldType(1);
        int int88 = yearMonth59.get(dateTimeFieldType87);
        boolean boolean89 = yearMonth1.isSupported(dateTimeFieldType87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01" + "'", str2, "1970-01");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(yearMonth48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "October" + "'", str54, "October");
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(yearMonth70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(yearMonth73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(yearMonth80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2 + "'", int84 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray85);
        org.junit.Assert.assertNotNull(dateTimeFieldType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 8 + "'", int88 == 8);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        int int25 = yearMonth22.size();
        org.joda.time.YearMonth yearMonth27 = yearMonth22.plusMonths((int) (byte) 10);
        int int28 = property18.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.Chronology chronology29 = yearMonth22.getChronology();
        org.joda.time.YearMonth yearMonth30 = yearMonth9.withChronologyRetainFields(chronology29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology33);
        org.joda.time.YearMonth yearMonth36 = yearMonth34.minusYears((int) (short) 0);
        int int37 = yearMonth34.size();
        org.joda.time.YearMonth yearMonth39 = yearMonth34.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        int int41 = yearMonth34.indexOf(dateTimeFieldType40);
        org.joda.time.Interval interval42 = yearMonth34.toInterval();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.YearMonth yearMonth46 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology45);
        org.joda.time.YearMonth.Property property47 = yearMonth46.monthOfYear();
        int int48 = property47.getMaximumValue();
        java.lang.String str49 = property47.getAsShortText();
        java.util.Locale locale50 = null;
        java.lang.String str51 = property47.getAsShortText(locale50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property47.getFieldType();
        int int53 = yearMonth34.get(dateTimeFieldType52);
        boolean boolean54 = yearMonth30.isSupported(dateTimeFieldType52);
        int int55 = yearMonth30.size();
        org.joda.time.YearMonth.Property property56 = yearMonth30.monthOfYear();
        int int57 = yearMonth30.getMonthOfYear();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 12 + "'", int48 == 12);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Oct" + "'", str49, "Oct");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Oct" + "'", str51, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        int int16 = property15.get();
        int int17 = property15.getMaximumValueOverall();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property15.getAsText(locale18);
        java.lang.String str20 = property15.getName();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "September" + "'", str19, "September");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "monthOfYear" + "'", str20, "monthOfYear");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        int int25 = yearMonth22.size();
        org.joda.time.YearMonth yearMonth27 = yearMonth22.plusMonths((int) (byte) 10);
        int int28 = property18.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.Chronology chronology29 = yearMonth22.getChronology();
        org.joda.time.YearMonth yearMonth30 = yearMonth9.withChronologyRetainFields(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.YearMonth yearMonth33 = yearMonth30.withPeriodAdded(readablePeriod31, (int) 'a');
        org.joda.time.YearMonth yearMonth35 = yearMonth30.minusMonths(292278993);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(yearMonth35);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth.Property property5 = yearMonth4.monthOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        org.joda.time.YearMonth yearMonth14 = yearMonth9.plusMonths((int) (byte) 10);
        int int15 = property5.compareTo((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        boolean boolean22 = yearMonth9.isAfter((org.joda.time.ReadablePartial) yearMonth19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = yearMonth19.toString(dateTimeFormatter23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth.Property property29 = yearMonth28.monthOfYear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth yearMonth35 = yearMonth33.minusYears((int) (short) 0);
        int int36 = yearMonth33.size();
        org.joda.time.YearMonth yearMonth38 = yearMonth33.plusMonths((int) (byte) 10);
        int int39 = property29.compareTo((org.joda.time.ReadablePartial) yearMonth33);
        org.joda.time.Chronology chronology40 = yearMonth33.getChronology();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology43);
        org.joda.time.YearMonth yearMonth46 = yearMonth44.minusYears((int) (short) 0);
        int int47 = yearMonth44.size();
        org.joda.time.YearMonth yearMonth49 = yearMonth44.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        int int51 = yearMonth44.indexOf(dateTimeFieldType50);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology54);
        org.joda.time.YearMonth.Property property56 = yearMonth55.monthOfYear();
        int int57 = property56.getMaximumValue();
        java.lang.String str58 = property56.getAsShortText();
        java.util.Locale locale59 = null;
        java.lang.String str60 = property56.getAsShortText(locale59);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property56.getFieldType();
        org.joda.time.YearMonth.Property property62 = yearMonth44.property(dateTimeFieldType61);
        org.joda.time.YearMonth.Property property63 = yearMonth33.property(dateTimeFieldType61);
        boolean boolean64 = yearMonth19.equals((java.lang.Object) property63);
        java.lang.String str65 = property63.getAsText();
        org.joda.time.YearMonth yearMonth67 = property63.addToCopy(1980);
        org.joda.time.YearMonth yearMonth69 = property63.addWrapFieldToCopy(1970);
        org.joda.time.Chronology chronology70 = yearMonth69.getChronology();
        org.joda.time.YearMonth yearMonth71 = new org.joda.time.YearMonth((long) 97, chronology70);
        org.joda.time.YearMonth yearMonth72 = new org.joda.time.YearMonth(chronology70);
        org.joda.time.YearMonth yearMonth73 = org.joda.time.YearMonth.now(chronology70);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0097-10" + "'", str24, "0097-10");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(yearMonth49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 12 + "'", int57 == 12);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Oct" + "'", str58, "Oct");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Oct" + "'", str60, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "October" + "'", str65, "October");
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertNotNull(yearMonth69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(yearMonth73);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        int int16 = property15.get();
        org.joda.time.YearMonth yearMonth17 = property15.getYearMonth();
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property18.getAsText(locale19);
        java.lang.String str21 = property18.getAsShortText();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology31);
        org.joda.time.YearMonth yearMonth34 = yearMonth32.minusYears((int) (short) 0);
        int int35 = yearMonth32.size();
        boolean boolean36 = yearMonth28.isAfter((org.joda.time.ReadablePartial) yearMonth32);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth.Property property41 = yearMonth40.monthOfYear();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        int int48 = yearMonth45.size();
        org.joda.time.YearMonth yearMonth50 = yearMonth45.plusMonths((int) (byte) 10);
        int int51 = property41.compareTo((org.joda.time.ReadablePartial) yearMonth45);
        org.joda.time.Chronology chronology52 = yearMonth45.getChronology();
        org.joda.time.YearMonth yearMonth53 = yearMonth32.withChronologyRetainFields(chronology52);
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth((long) (short) 1, chronology52);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.YearMonth yearMonth57 = yearMonth54.withPeriodAdded(readablePeriod55, 100);
        org.joda.time.YearMonth yearMonth59 = yearMonth54.plusYears(10);
        org.joda.time.YearMonth.Property property60 = yearMonth54.year();
        int int61 = property18.compareTo((org.joda.time.ReadablePartial) yearMonth54);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "September" + "'", str20, "September");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Sep" + "'", str21, "Sep");
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertNotNull(yearMonth34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) 96);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        int int11 = property4.getMinimumValueOverall();
        int int12 = property4.getMinimumValue();
        org.joda.time.YearMonth yearMonth13 = property4.getYearMonth();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(yearMonth13);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.YearMonth yearMonth3 = yearMonth1.minus(readablePeriod2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = yearMonth1.toString(dateTimeFormatter4);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth yearMonth17 = yearMonth15.minusYears((int) (short) 0);
        int int18 = yearMonth15.size();
        boolean boolean19 = yearMonth11.isAfter((org.joda.time.ReadablePartial) yearMonth15);
        org.joda.time.Interval interval20 = yearMonth11.toInterval();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology23);
        org.joda.time.YearMonth yearMonth26 = yearMonth24.minusYears((int) (short) 0);
        int int27 = yearMonth24.size();
        org.joda.time.YearMonth yearMonth29 = yearMonth24.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        int int31 = yearMonth24.indexOf(dateTimeFieldType30);
        org.joda.time.Interval interval32 = yearMonth24.toInterval();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth.Property property37 = yearMonth36.monthOfYear();
        int int38 = property37.getMaximumValue();
        java.lang.String str39 = property37.getAsShortText();
        java.util.Locale locale40 = null;
        java.lang.String str41 = property37.getAsShortText(locale40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property37.getFieldType();
        int int43 = yearMonth24.get(dateTimeFieldType42);
        org.joda.time.YearMonth.Property property44 = yearMonth11.property(dateTimeFieldType42);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.YearMonth yearMonth46 = yearMonth11.minus(readablePeriod45);
        org.joda.time.YearMonth yearMonth48 = yearMonth11.minusYears((int) (byte) 100);
        int int49 = yearMonth1.compareTo((org.joda.time.ReadablePartial) yearMonth48);
        org.joda.time.YearMonth yearMonth52 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.YearMonth yearMonth54 = yearMonth52.withYear((int) (byte) 1);
        boolean boolean55 = yearMonth1.isAfter((org.joda.time.ReadablePartial) yearMonth52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = null;
        java.lang.String str57 = yearMonth1.toString(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(yearMonth3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11" + "'", str5, "2020-11");
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 12 + "'", int38 == 12);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Oct" + "'", str39, "Oct");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Oct" + "'", str41, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertNotNull(yearMonth48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "2020-11" + "'", str57, "2020-11");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        int int16 = property15.get();
        java.util.Locale locale17 = null;
        int int18 = property15.getMaximumShortTextLength(locale17);
        java.util.Locale locale19 = null;
        int int20 = property15.getMaximumShortTextLength(locale19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property15.getFieldType();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        int int25 = yearMonth22.size();
        org.joda.time.YearMonth yearMonth27 = yearMonth22.plusMonths((int) (byte) 10);
        int int28 = property18.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.Chronology chronology29 = yearMonth22.getChronology();
        org.joda.time.YearMonth yearMonth30 = yearMonth9.withChronologyRetainFields(chronology29);
        org.joda.time.YearMonth yearMonth32 = yearMonth9.withYear((int) (byte) 1);
        int int33 = yearMonth32.getMonthOfYear();
        org.joda.time.YearMonth.Property property34 = yearMonth32.year();
        org.joda.time.YearMonth yearMonth36 = property34.setCopy("9");
        int int37 = property34.getMinimumValue();
        int int38 = property34.getMinimumValueOverall();
        java.lang.String str39 = property34.getAsShortText();
        java.lang.String str40 = property34.toString();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-292275054) + "'", int37 == (-292275054));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-292275054) + "'", int38 == (-292275054));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1" + "'", str39, "1");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Property[year]" + "'", str40, "Property[year]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        boolean boolean14 = yearMonth12.equals((java.lang.Object) 1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.YearMonth yearMonth16 = yearMonth12.minus(readablePeriod15);
        org.joda.time.YearMonth.Property property17 = yearMonth16.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = yearMonth16.toString(dateTimeFormatter18);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = yearMonth16.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = yearMonth16.getFieldType((int) (short) 1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth.Property property27 = yearMonth26.monthOfYear();
        int int28 = property27.getMaximumValue();
        java.lang.String str29 = property27.getAsShortText();
        java.util.Locale locale30 = null;
        java.lang.String str31 = property27.getAsShortText(locale30);
        int int32 = property27.getMinimumValueOverall();
        org.joda.time.DurationField durationField33 = property27.getRangeDurationField();
        org.joda.time.YearMonth yearMonth35 = property27.addWrapFieldToCopy((int) ' ');
        org.joda.time.YearMonth yearMonth37 = property27.addWrapFieldToCopy(2);
        org.joda.time.Chronology chronology38 = yearMonth37.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth39 = new org.joda.time.YearMonth((java.lang.Object) (short) 1, chronology38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0097-09" + "'", str19, "0097-09");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray20);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Oct" + "'", str29, "Oct");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Oct" + "'", str31, "Oct");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertNotNull(chronology38);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth15 = property4.getYearMonth();
        java.lang.String str16 = property4.getAsText();
        org.joda.time.YearMonth yearMonth17 = property4.getYearMonth();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth.Property property22 = yearMonth21.monthOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology31);
        org.joda.time.YearMonth yearMonth34 = yearMonth32.minusYears((int) (short) 0);
        int int35 = yearMonth32.size();
        boolean boolean36 = yearMonth28.isAfter((org.joda.time.ReadablePartial) yearMonth32);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth.Property property41 = yearMonth40.monthOfYear();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        int int48 = yearMonth45.size();
        org.joda.time.YearMonth yearMonth50 = yearMonth45.plusMonths((int) (byte) 10);
        int int51 = property41.compareTo((org.joda.time.ReadablePartial) yearMonth45);
        org.joda.time.Chronology chronology52 = yearMonth45.getChronology();
        org.joda.time.YearMonth yearMonth53 = yearMonth32.withChronologyRetainFields(chronology52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.YearMonth yearMonth56 = yearMonth53.withPeriodAdded(readablePeriod54, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        int int58 = yearMonth56.indexOf(dateTimeFieldType57);
        boolean boolean59 = yearMonth21.isEqual((org.joda.time.ReadablePartial) yearMonth56);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology62);
        org.joda.time.YearMonth.Property property64 = yearMonth63.monthOfYear();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.YearMonth yearMonth68 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology67);
        org.joda.time.YearMonth yearMonth70 = yearMonth68.minusYears((int) (short) 0);
        int int71 = yearMonth68.size();
        org.joda.time.YearMonth yearMonth73 = yearMonth68.plusMonths((int) (byte) 10);
        int int74 = property64.compareTo((org.joda.time.ReadablePartial) yearMonth68);
        boolean boolean75 = yearMonth21.isEqual((org.joda.time.ReadablePartial) yearMonth68);
        boolean boolean76 = yearMonth17.isAfter((org.joda.time.ReadablePartial) yearMonth21);
        org.joda.time.YearMonth yearMonth78 = yearMonth17.plusMonths(2);
        int int79 = yearMonth78.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.Interval interval81 = yearMonth78.toInterval(dateTimeZone80);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = yearMonth78.getFieldType(1);
        org.joda.time.YearMonth yearMonth85 = new org.joda.time.YearMonth((long) 100);
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.Interval interval87 = yearMonth85.toInterval(dateTimeZone86);
        int int89 = yearMonth85.getValue((int) (short) 0);
        boolean boolean90 = yearMonth78.isBefore((org.joda.time.ReadablePartial) yearMonth85);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertNotNull(yearMonth34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(yearMonth70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(yearMonth73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(yearMonth78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 12 + "'", int79 == 12);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1970 + "'", int89 == 1970);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getAsShortText();
        int int11 = property4.get();
        org.joda.time.YearMonth yearMonth13 = property4.addToCopy(3);
        java.lang.String str14 = property4.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property4.getFieldType();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth.Property property20 = yearMonth19.monthOfYear();
        int int21 = property20.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField22 = property20.getField();
        org.joda.time.YearMonth yearMonth24 = property20.addToCopy((int) (short) 0);
        org.joda.time.YearMonth yearMonth26 = yearMonth24.withYear(12);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Interval interval28 = yearMonth26.toInterval(dateTimeZone27);
        int int29 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth26);
        org.joda.time.YearMonth yearMonth31 = property4.addWrapFieldToCopy(3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Oct" + "'", str10, "Oct");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(yearMonth31);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) ' ');
        org.joda.time.Chronology chronology2 = yearMonth1.getChronology();
        int int4 = yearMonth1.getValue(0);
        int int5 = yearMonth1.size();
        org.joda.time.YearMonth.Property property6 = yearMonth1.monthOfYear();
        org.joda.time.YearMonth yearMonth8 = property6.addWrapFieldToCopy((int) ' ');
        int[] intArray9 = yearMonth8.getValues();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1970, 9]");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((int) (short) 10, 9);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        int int16 = property15.get();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property15.getAsShortText(locale17);
        java.lang.String str19 = property15.getAsText();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Sep" + "'", str18, "Sep");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "September" + "'", str19, "September");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) 100);
        org.joda.time.YearMonth.Property property2 = yearMonth1.monthOfYear();
        org.joda.time.YearMonth yearMonth4 = property2.addWrapFieldToCopy(0);
        int int5 = property2.getMinimumValueOverall();
        org.joda.time.YearMonth yearMonth6 = property2.getYearMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(yearMonth6);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology15 = yearMonth8.getChronology();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        int int22 = yearMonth19.size();
        org.joda.time.YearMonth yearMonth24 = yearMonth19.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        int int26 = yearMonth19.indexOf(dateTimeFieldType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        int int32 = property31.getMaximumValue();
        java.lang.String str33 = property31.getAsShortText();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        org.joda.time.YearMonth.Property property37 = yearMonth19.property(dateTimeFieldType36);
        org.joda.time.YearMonth.Property property38 = yearMonth8.property(dateTimeFieldType36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth yearMonth44 = yearMonth42.minusYears((int) (short) 0);
        int int45 = yearMonth42.size();
        org.joda.time.YearMonth yearMonth47 = yearMonth42.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        int int49 = yearMonth42.indexOf(dateTimeFieldType48);
        org.joda.time.YearMonth yearMonth51 = yearMonth42.plusMonths((-1));
        boolean boolean53 = yearMonth51.equals((java.lang.Object) 1);
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth((long) 100);
        boolean boolean56 = yearMonth51.isBefore((org.joda.time.ReadablePartial) yearMonth55);
        int int57 = yearMonth8.compareTo((org.joda.time.ReadablePartial) yearMonth51);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.YearMonth yearMonth60 = yearMonth51.withPeriodAdded(readablePeriod58, (int) (byte) -1);
        org.joda.time.YearMonth.Property property61 = yearMonth51.monthOfYear();
        int int62 = property61.getMaximumValue();
        int int63 = property61.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(yearMonth60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 12 + "'", int62 == 12);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 12 + "'", int63 == 12);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = yearMonth3.getFieldTypes();
        int[] intArray10 = yearMonth3.getValues();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        int int22 = yearMonth19.size();
        org.joda.time.YearMonth yearMonth24 = yearMonth19.plusMonths((int) (byte) 10);
        int int25 = property15.compareTo((org.joda.time.ReadablePartial) yearMonth19);
        org.joda.time.Chronology chronology26 = yearMonth19.getChronology();
        org.joda.time.YearMonth yearMonth27 = org.joda.time.YearMonth.now(chronology26);
        org.joda.time.YearMonth yearMonth28 = org.joda.time.YearMonth.now(chronology26);
        org.joda.time.YearMonth yearMonth29 = new org.joda.time.YearMonth((java.lang.Object) yearMonth3, chronology26);
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth(0L);
        java.lang.String str32 = yearMonth31.toString();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth yearMonth38 = yearMonth36.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth yearMonth44 = yearMonth42.minusYears((int) (short) 0);
        int int45 = yearMonth42.size();
        boolean boolean46 = yearMonth38.isAfter((org.joda.time.ReadablePartial) yearMonth42);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonth yearMonth50 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology49);
        org.joda.time.YearMonth.Property property51 = yearMonth50.monthOfYear();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology54);
        org.joda.time.YearMonth yearMonth57 = yearMonth55.minusYears((int) (short) 0);
        int int58 = yearMonth55.size();
        org.joda.time.YearMonth yearMonth60 = yearMonth55.plusMonths((int) (byte) 10);
        int int61 = property51.compareTo((org.joda.time.ReadablePartial) yearMonth55);
        org.joda.time.Chronology chronology62 = yearMonth55.getChronology();
        org.joda.time.YearMonth yearMonth63 = yearMonth42.withChronologyRetainFields(chronology62);
        org.joda.time.YearMonth yearMonth65 = yearMonth42.withYear((int) (byte) 1);
        boolean boolean66 = yearMonth31.isEqual((org.joda.time.ReadablePartial) yearMonth65);
        boolean boolean67 = yearMonth3.isAfter((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.YearMonth yearMonth69 = yearMonth31.minusYears(1980);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10]");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01" + "'", str32, "1970-01");
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(yearMonth60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(yearMonth63);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(yearMonth69);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        org.joda.time.Interval interval9 = yearMonth6.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = yearMonth6.getFieldTypes();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth yearMonth16 = yearMonth14.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth yearMonth22 = yearMonth20.minusYears((int) (short) 0);
        int int23 = yearMonth20.size();
        boolean boolean24 = yearMonth16.isAfter((org.joda.time.ReadablePartial) yearMonth20);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth.Property property29 = yearMonth28.monthOfYear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth yearMonth35 = yearMonth33.minusYears((int) (short) 0);
        int int36 = yearMonth33.size();
        org.joda.time.YearMonth yearMonth38 = yearMonth33.plusMonths((int) (byte) 10);
        int int39 = property29.compareTo((org.joda.time.ReadablePartial) yearMonth33);
        org.joda.time.Chronology chronology40 = yearMonth33.getChronology();
        org.joda.time.YearMonth yearMonth41 = yearMonth20.withChronologyRetainFields(chronology40);
        org.joda.time.YearMonth yearMonth42 = yearMonth6.withChronologyRetainFields(chronology40);
        org.joda.time.YearMonth yearMonth43 = org.joda.time.YearMonth.now(chronology40);
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth(3, (int) (byte) 1, chronology40);
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((long) (short) -1, chronology40);
        org.joda.time.YearMonth yearMonth46 = org.joda.time.YearMonth.now(chronology40);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertNotNull(yearMonth42);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertNotNull(yearMonth46);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        boolean boolean14 = yearMonth12.equals((java.lang.Object) 1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.YearMonth yearMonth16 = yearMonth12.minus(readablePeriod15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth yearMonth22 = yearMonth20.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        int int29 = yearMonth26.size();
        boolean boolean30 = yearMonth22.isAfter((org.joda.time.ReadablePartial) yearMonth26);
        org.joda.time.YearMonth.Property property31 = yearMonth26.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property31.getFieldType();
        boolean boolean33 = yearMonth16.isSupported(dateTimeFieldType32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.YearMonth yearMonth37 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology36);
        org.joda.time.YearMonth.Property property38 = yearMonth37.monthOfYear();
        int int39 = property38.getMaximumValue();
        java.lang.String str40 = property38.getAsShortText();
        int int41 = property38.get();
        java.lang.String str42 = property38.getAsString();
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth((java.lang.Object) str42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.YearMonth yearMonth47 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology46);
        org.joda.time.YearMonth yearMonth49 = yearMonth47.minusYears((int) (short) 0);
        int int50 = yearMonth47.size();
        org.joda.time.YearMonth yearMonth52 = yearMonth47.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        int int54 = yearMonth47.indexOf(dateTimeFieldType53);
        org.joda.time.YearMonth yearMonth56 = yearMonth47.plusMonths((-1));
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.YearMonth yearMonth60 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology59);
        org.joda.time.YearMonth yearMonth62 = yearMonth60.minusYears((int) (short) 0);
        int int63 = yearMonth60.size();
        org.joda.time.YearMonth yearMonth65 = yearMonth60.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = null;
        int int67 = yearMonth60.indexOf(dateTimeFieldType66);
        org.joda.time.Interval interval68 = yearMonth60.toInterval();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.YearMonth yearMonth72 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology71);
        org.joda.time.YearMonth.Property property73 = yearMonth72.monthOfYear();
        int int74 = property73.getMaximumValue();
        java.lang.String str75 = property73.getAsShortText();
        java.util.Locale locale76 = null;
        java.lang.String str77 = property73.getAsShortText(locale76);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property73.getFieldType();
        int int79 = yearMonth60.get(dateTimeFieldType78);
        org.joda.time.YearMonth.Property property80 = yearMonth47.property(dateTimeFieldType78);
        java.lang.String str81 = property80.getAsText();
        java.lang.String str82 = property80.getAsString();
        java.lang.String str83 = property80.getAsShortText();
        org.joda.time.YearMonth yearMonth85 = property80.addToCopy(0);
        org.joda.time.DurationField durationField86 = property80.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = property80.getFieldType();
        boolean boolean88 = yearMonth43.isSupported(dateTimeFieldType87);
        boolean boolean89 = yearMonth16.isSupported(dateTimeFieldType87);
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int91 = yearMonth16.get(dateTimeFieldType90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 12 + "'", int39 == 12);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Oct" + "'", str40, "Oct");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "10" + "'", str42, "10");
        org.junit.Assert.assertNotNull(yearMonth49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertNotNull(yearMonth62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 12 + "'", int74 == 12);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Oct" + "'", str75, "Oct");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Oct" + "'", str77, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "October" + "'", str81, "October");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "10" + "'", str82, "10");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Oct" + "'", str83, "Oct");
        org.junit.Assert.assertNotNull(yearMonth85);
        org.junit.Assert.assertNotNull(durationField86);
        org.junit.Assert.assertNotNull(dateTimeFieldType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getName();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy(100);
        int int13 = yearMonth12.getMonthOfYear();
        org.joda.time.YearMonth.Property property14 = yearMonth12.year();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = yearMonth18.indexOf(dateTimeFieldType24);
        org.joda.time.YearMonth yearMonth27 = yearMonth18.plusMonths((-1));
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.minusYears((int) (short) 0);
        int int34 = yearMonth31.size();
        org.joda.time.YearMonth yearMonth36 = yearMonth31.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        int int38 = yearMonth31.indexOf(dateTimeFieldType37);
        org.joda.time.Interval interval39 = yearMonth31.toInterval();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology42);
        org.joda.time.YearMonth.Property property44 = yearMonth43.monthOfYear();
        int int45 = property44.getMaximumValue();
        java.lang.String str46 = property44.getAsShortText();
        java.util.Locale locale47 = null;
        java.lang.String str48 = property44.getAsShortText(locale47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property44.getFieldType();
        int int50 = yearMonth31.get(dateTimeFieldType49);
        org.joda.time.YearMonth.Property property51 = yearMonth18.property(dateTimeFieldType49);
        org.joda.time.Chronology chronology52 = yearMonth18.getChronology();
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth(chronology52);
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.YearMonth yearMonth58 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology57);
        org.joda.time.YearMonth yearMonth60 = yearMonth58.minusYears((int) (short) 0);
        org.joda.time.Interval interval61 = yearMonth58.toInterval();
        org.joda.time.Chronology chronology62 = yearMonth58.getChronology();
        org.joda.time.YearMonth yearMonth63 = yearMonth54.withChronologyRetainFields(chronology62);
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth(chronology62);
        org.joda.time.YearMonth yearMonth65 = yearMonth53.withChronologyRetainFields(chronology62);
        org.joda.time.YearMonth yearMonth66 = yearMonth12.withChronologyRetainFields(chronology62);
        int int67 = yearMonth66.size();
        org.joda.time.YearMonth.Property property68 = yearMonth66.monthOfYear();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Oct" + "'", str46, "Oct");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Oct" + "'", str48, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(yearMonth60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(yearMonth63);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertNotNull(yearMonth66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(property68);
    }
}

