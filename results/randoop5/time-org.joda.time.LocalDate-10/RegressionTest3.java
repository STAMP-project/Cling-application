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
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology7 = localDate4.getChronology();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) date2, chronology7);
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate15.minusWeeks((-1));
        boolean boolean18 = localDate11.isEqual((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate20 = localDate11.plusDays((int) (short) 100);
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks((-1));
        boolean boolean32 = localDate25.isEqual((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate.Property property33 = localDate29.yearOfCentury();
        java.lang.String str34 = property33.getAsShortText();
        org.joda.time.LocalDate localDate35 = property33.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        int int37 = localDate35.indexOf(dateTimeFieldType36);
        org.joda.time.LocalDate.Property property38 = localDate35.dayOfWeek();
        java.lang.String str39 = property38.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property38.getFieldType();
        int int41 = localDate20.indexOf(dateTimeFieldType40);
        int int42 = localDate8.get(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1" + "'", str34, "1");
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Thursday" + "'", str39, "Thursday");
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks((-1));
        boolean boolean13 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate.Property property14 = localDate6.year();
        int int15 = property14.get();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = localDate19.indexOf(dateTimeFieldType20);
        org.joda.time.LocalTime localTime22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate19.toDateTime(localTime22, dateTimeZone23);
        long long25 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        int int26 = property4.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate32 = localDate30.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate34 = localDate32.minusWeeks((-1));
        boolean boolean35 = localDate28.isEqual((org.joda.time.ReadablePartial) localDate32);
        org.joda.time.LocalDate.Property property36 = localDate32.yearOfCentury();
        boolean boolean38 = property36.equals((java.lang.Object) 100L);
        java.lang.String str39 = property36.toString();
        org.joda.time.DateTimeField dateTimeField40 = property36.getField();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDate localDate45 = localDate42.withPeriodAdded(readablePeriod43, 0);
        org.joda.time.LocalDate localDate47 = localDate45.minusDays((int) (byte) 100);
        int int48 = localDate47.getMonthOfYear();
        int int49 = localDate47.getCenturyOfEra();
        int int50 = property36.compareTo((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.LocalDate localDate52 = property36.setCopy("4");
        int int53 = property4.compareTo((org.joda.time.ReadablePartial) localDate52);
        org.joda.time.LocalDate localDate54 = property4.getLocalDate();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2020 + "'", int15 == 2020);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2019L + "'", long25 == 2019L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Property[yearOfCentury]" + "'", str39, "Property[yearOfCentury]");
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 19 + "'", int49 == 19);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(localDate54);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        int int12 = localDate11.getMonthOfYear();
        int int13 = localDate11.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate15 = localDate11.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate11.withPeriodAdded(readablePeriod16, (-1));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        int int2 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDate.Property property3 = localDate1.centuryOfEra();
        org.joda.time.Interval interval4 = localDate1.toInterval();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate10 = localDate8.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtCurrentTime(dateTimeZone11);
        boolean boolean13 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date18 = localDate17.toDate();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology23 = localDate20.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology23);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(0L, chronology23);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (byte) 10, chronology23);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.LocalDate.Property property28 = localDate27.centuryOfEra();
        boolean boolean29 = localDate1.isBefore((org.joda.time.ReadablePartial) localDate27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        java.lang.String str13 = property9.getAsText();
        java.lang.String str14 = property9.getAsText();
        org.joda.time.LocalDate localDate15 = property9.getLocalDate();
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = property9.setCopy("Property[dayOfWeek]", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[dayOfWeek]\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((-1));
        boolean boolean9 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.LocalDate localDate11 = localDate2.plusDays((int) (short) 100);
        boolean boolean12 = localDate0.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate.Property property13 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        org.joda.time.LocalDate localDate16 = property13.roundFloorCopy();
        int int17 = property13.getMaximumValue();
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        int int5 = localDate1.getYearOfCentury();
        org.joda.time.LocalDate localDate7 = localDate1.minusDays((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        org.joda.time.LocalDate.Property property12 = localDate11.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate11.withEra(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        boolean boolean11 = property9.equals((java.lang.Object) 100L);
        java.lang.String str12 = property9.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        int int15 = localDate14.getCenturyOfEra();
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtCurrentTime();
        int int17 = property9.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalDate localDate18 = property9.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[yearOfCentury]" + "'", str12, "Property[yearOfCentury]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2019) + "'", int17 == (-2019));
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = localDate8.indexOf(dateTimeFieldType9);
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate8.toDateTime(localTime11, dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate1.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDate localDate16 = localDate1.minusMonths((-292275054));
        int int17 = localDate1.getDayOfWeek();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        int int12 = localDate7.getDayOfYear();
        java.lang.String str13 = localDate7.toString();
        java.lang.String str15 = localDate7.toString("1");
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = localDate7.toDateMidnight(dateTimeZone16);
        org.joda.time.LocalDate.Property property18 = localDate7.year();
        org.joda.time.LocalDate.Property property19 = localDate7.weekyear();
        org.joda.time.LocalDate localDate20 = property19.roundCeilingCopy();
        int int21 = localDate20.getCenturyOfEra();
        int int22 = localDate20.getDayOfYear();
        org.joda.time.LocalDate.Property property23 = localDate20.weekyear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate12 = property9.roundFloorCopy();
        org.joda.time.LocalDate localDate14 = property9.addWrapFieldToCopy(19);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate20 = localDate18.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate22 = localDate20.minusWeeks((-1));
        boolean boolean23 = localDate16.isEqual((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate.Property property24 = localDate20.yearOfCentury();
        java.lang.String str25 = property24.getAsShortText();
        org.joda.time.LocalDate localDate27 = property24.addWrapFieldToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Interval interval29 = localDate27.toInterval(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate27.plusWeeks((-1));
        org.joda.time.LocalDate localDate33 = localDate31.withCenturyOfEra(4);
        int int34 = property9.compareTo((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property35 = localDate31.monthOfYear();
        org.joda.time.DurationField durationField36 = property35.getRangeDurationField();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(durationField36);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        int int18 = property9.getDifference((org.joda.time.ReadableInstant) dateTime17);
        java.lang.String str19 = property9.getAsString();
        java.lang.String str20 = property9.getAsString();
        int int21 = property9.getMinimumValueOverall();
        java.lang.String str22 = property9.getName();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property9.getAsText(locale23);
        int int25 = property9.get();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019 + "'", int18 == 2019);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020" + "'", str19, "2020");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020" + "'", str20, "2020");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-292275054) + "'", int21 == (-292275054));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "year" + "'", str22, "year");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020" + "'", str24, "2020");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2020 + "'", int25 == 2020);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((-1));
        org.joda.time.LocalDate.Property property6 = localDate5.monthOfYear();
        java.lang.String str7 = property6.toString();
        int int8 = property6.getMaximumValue();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate16 = localDate14.minusWeeks((-1));
        boolean boolean17 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate.Property property18 = localDate14.yearOfCentury();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.LocalDate localDate20 = property18.withMaximumValue();
        org.joda.time.LocalDate localDate21 = property18.roundFloorCopy();
        org.joda.time.LocalDate localDate23 = property18.addWrapFieldToCopy(19);
        boolean boolean24 = property6.equals((java.lang.Object) property18);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property6.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = property6.setCopy("1971-01-01");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1971-01-01\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[monthOfYear]" + "'", str7, "Property[monthOfYear]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) -1);
        org.joda.time.LocalTime localTime2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTime(localTime2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = localDate1.toDateMidnight(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate1.withDayOfWeek(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate1.withWeekOfWeekyear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        org.joda.time.LocalDate.Property property15 = localDate14.weekOfWeekyear();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfCentury(0);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate24 = localDate22.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate26 = localDate24.minusWeeks((-1));
        boolean boolean27 = localDate20.isEqual((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate localDate29 = localDate20.plusDays((int) (short) 100);
        boolean boolean30 = localDate18.isEqual((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate.Property property31 = localDate18.dayOfWeek();
        boolean boolean32 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology33);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate38 = localDate36.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate40 = localDate38.minusWeeks((-1));
        boolean boolean41 = localDate34.isEqual((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.LocalDate.Property property42 = localDate38.yearOfCentury();
        java.lang.String str43 = property42.getAsShortText();
        org.joda.time.LocalDate localDate45 = property42.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate47 = property42.addToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate49 = property42.addWrapFieldToCopy((int) '#');
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology50);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate55 = localDate53.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate57 = localDate55.minusWeeks((-1));
        boolean boolean58 = localDate51.isEqual((org.joda.time.ReadablePartial) localDate55);
        org.joda.time.LocalDate.Property property59 = localDate51.year();
        int int60 = property59.get();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate64 = localDate62.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = null;
        int int66 = localDate64.indexOf(dateTimeFieldType65);
        org.joda.time.LocalTime localTime67 = null;
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = localDate64.toDateTime(localTime67, dateTimeZone68);
        long long70 = property59.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime69);
        int int71 = property42.getDifference((org.joda.time.ReadableInstant) dateTime69);
        int int72 = property42.getMinimumValueOverall();
        org.joda.time.LocalDate localDate73 = property42.withMaximumValue();
        boolean boolean74 = localDate18.isAfter((org.joda.time.ReadablePartial) localDate73);
        int int75 = localDate18.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1" + "'", str43, "1");
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2020 + "'", int60 == 2020);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 2019L + "'", long70 == 2019L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2020 + "'", int75 == 2020);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        int int5 = localDate1.getYearOfCentury();
        org.joda.time.LocalDate localDate7 = localDate1.minusDays((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.LocalDate localDate16 = localDate11.minusWeeks((int) (byte) -1);
        boolean boolean17 = localDate7.isBefore((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate localDate19 = localDate16.withDayOfYear(70);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) localDate19, dateTimeZone20);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate25 = localDate23.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology26 = localDate23.getChronology();
        org.joda.time.LocalDate.Property property27 = localDate23.yearOfEra();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate31 = localDate29.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        int int33 = localDate31.indexOf(dateTimeFieldType32);
        org.joda.time.LocalTime localTime34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate31.toDateTime(localTime34, dateTimeZone35);
        int int37 = property27.getDifference((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.LocalDate localDate38 = property27.roundCeilingCopy();
        java.lang.String str39 = property27.getName();
        java.lang.String str40 = property27.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property27.getFieldType();
        org.joda.time.LocalDate localDate43 = localDate19.withField(dateTimeFieldType41, 10025);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1968 + "'", int37 == 1968);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "yearOfEra" + "'", str39, "yearOfEra");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "yearOfEra" + "'", str40, "yearOfEra");
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(localDate43);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate10 = localDate1.minusYears((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate1.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology7 = localDate4.getChronology();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) date2, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = localDate8.toDateMidnight(dateTimeZone9);
        org.joda.time.LocalDate.Property property11 = localDate8.weekOfWeekyear();
        int int12 = localDate8.size();
        int int13 = localDate8.getYear();
        int int14 = localDate8.getYear();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        java.lang.String str1 = localDate0.toString();
        org.joda.time.LocalDate.Property property2 = localDate0.year();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2020-11-25" + "'", str1, "2020-11-25");
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        int int12 = localDate11.getMonthOfYear();
        int int13 = localDate11.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate15 = localDate11.plusWeeks(0);
        org.joda.time.LocalDate.Property property16 = localDate11.centuryOfEra();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.weekyear();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = localDate5.toInterval(dateTimeZone6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        boolean boolean16 = localDate9.isEqual((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.LocalDate.Property property17 = localDate13.yearOfCentury();
        java.lang.String str18 = property17.getAsShortText();
        org.joda.time.LocalDate localDate20 = property17.addWrapFieldToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate20.plusWeeks((-1));
        org.joda.time.LocalDate localDate26 = localDate24.withCenturyOfEra(4);
        int int27 = localDate24.getEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate33 = localDate31.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate35 = localDate33.minusWeeks((-1));
        boolean boolean36 = localDate29.isEqual((org.joda.time.ReadablePartial) localDate33);
        org.joda.time.LocalDate.Property property37 = localDate33.yearOfCentury();
        java.lang.String str38 = property37.getAsShortText();
        org.joda.time.LocalDate localDate40 = property37.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate42 = property37.addToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate44 = property37.addWrapFieldToCopy((int) '#');
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate48 = localDate46.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        int int50 = localDate48.indexOf(dateTimeFieldType49);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate54 = localDate52.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology55 = localDate52.getChronology();
        int int56 = localDate48.compareTo((org.joda.time.ReadablePartial) localDate52);
        int int57 = localDate52.getDayOfYear();
        java.lang.String str58 = localDate52.toString();
        java.lang.String str60 = localDate52.toString("1");
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = localDate52.toDateMidnight(dateTimeZone61);
        org.joda.time.LocalDate.Property property63 = localDate52.year();
        org.joda.time.LocalDate localDate64 = localDate44.withFields((org.joda.time.ReadablePartial) localDate52);
        boolean boolean65 = localDate24.isAfter((org.joda.time.ReadablePartial) localDate52);
        org.joda.time.LocalDate.Property property66 = localDate24.centuryOfEra();
        boolean boolean67 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate localDate69 = localDate5.withYearOfEra(10025);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1970-01-01" + "'", str58, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1" + "'", str60, "1");
        org.junit.Assert.assertNotNull(dateMidnight62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(localDate69);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((-1));
        org.joda.time.LocalDate localDate7 = localDate3.minusMonths(25);
        int[] intArray8 = localDate7.getValues();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        int int14 = localDate12.indexOf(dateTimeFieldType13);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology19 = localDate16.getChronology();
        int int20 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate.Property property21 = localDate12.weekOfWeekyear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate27 = localDate25.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate29 = localDate27.minusWeeks((-1));
        boolean boolean30 = localDate23.isEqual((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate32 = localDate27.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property33 = localDate27.year();
        org.joda.time.LocalDate localDate35 = property33.setCopy((int) 'a');
        org.joda.time.LocalDate localDate37 = property33.addToCopy(48);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = localDate37.getFieldType(1);
        boolean boolean40 = localDate12.isSupported(dateTimeFieldType39);
        org.joda.time.LocalDate.Property property41 = localDate7.property(dateTimeFieldType39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate43 = localDate7.withDayOfMonth((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-2, 12, 1]");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        java.lang.String str12 = localDate11.toString();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) localDate11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate21 = localDate19.minusWeeks((-1));
        boolean boolean22 = localDate15.isEqual((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate.Property property23 = localDate19.yearOfCentury();
        java.lang.String str24 = property23.getAsShortText();
        org.joda.time.LocalDate localDate25 = property23.withMaximumValue();
        org.joda.time.LocalDate localDate27 = localDate25.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDate localDate29 = localDate27.minusMonths((int) (byte) 1);
        int int30 = localDate13.compareTo((org.joda.time.ReadablePartial) localDate29);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0099-01-01" + "'", str12, "0099-01-01");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks((-1));
        boolean boolean13 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate.Property property14 = localDate6.year();
        int int15 = property14.get();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = localDate19.indexOf(dateTimeFieldType20);
        org.joda.time.LocalTime localTime22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate19.toDateTime(localTime22, dateTimeZone23);
        long long25 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        int int26 = property4.compareTo((org.joda.time.ReadableInstant) dateTime24);
        int int27 = property4.getLeapAmount();
        org.joda.time.LocalDate localDate29 = property4.addWrapFieldToCopy(330);
        org.joda.time.LocalDate.Property property30 = localDate29.weekOfWeekyear();
        org.joda.time.LocalDate.Property property31 = localDate29.dayOfMonth();
        java.lang.String str32 = property31.getAsString();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2020 + "'", int15 == 2020);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2019L + "'", long25 == 2019L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1" + "'", str32, "1");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        int int9 = localDate5.getYearOfEra();
        int int10 = localDate5.size();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate18 = localDate16.minusWeeks((-1));
        boolean boolean19 = localDate12.isEqual((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate.Property property20 = localDate16.yearOfCentury();
        java.lang.String str21 = property20.getAsShortText();
        org.joda.time.LocalDate localDate23 = property20.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate25 = property20.addToCopy((int) (short) 1);
        int int26 = property20.getLeapAmount();
        boolean boolean27 = localDate5.equals((java.lang.Object) property20);
        org.joda.time.LocalDate localDate29 = localDate5.withWeekyear(1970);
        org.joda.time.LocalDate localDate31 = localDate29.plusDays((int) '4');
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate7.minusYears((int) ' ');
        org.joda.time.LocalDate localDate17 = localDate7.minusYears((int) '#');
        org.joda.time.LocalDate localDate19 = localDate7.withDayOfYear(330);
        org.joda.time.LocalDate localDate21 = localDate19.plusYears(13);
        org.joda.time.LocalDate.Property property22 = localDate19.year();
        org.joda.time.LocalDate localDate24 = localDate19.withYearOfCentury(12);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, 0);
        org.joda.time.LocalDate localDate6 = localDate1.plusYears(2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate14 = localDate12.minusWeeks((-1));
        boolean boolean15 = localDate8.isEqual((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate.Property property16 = localDate12.yearOfCentury();
        java.lang.String str17 = property16.getAsShortText();
        org.joda.time.LocalDate localDate19 = property16.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate21 = property16.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date24 = localDate23.toDate();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate28 = localDate26.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology29 = localDate26.getChronology();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) date24, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = localDate30.toDateMidnight(dateTimeZone31);
        org.joda.time.LocalDate.Property property33 = localDate30.weekOfWeekyear();
        org.joda.time.LocalDate localDate34 = property33.roundHalfEvenCopy();
        boolean boolean35 = localDate21.isBefore((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.LocalDate localDate37 = localDate21.minusYears((int) '4');
        int int38 = localDate21.getCenturyOfEra();
        int[] intArray39 = localDate21.getValues();
        boolean boolean40 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate localDate42 = localDate1.withYearOfEra((int) '#');
        org.joda.time.LocalDate localDate44 = localDate42.plusYears((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField46 = localDate44.getField(334);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 334");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[11, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate44);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate7 = localDate4.withPeriodAdded(readablePeriod5, 48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withDayOfYear(2922750);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922750 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property12 = localDate3.weekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate3.withYearOfEra(2);
        org.joda.time.LocalDate localDate16 = localDate3.minusYears(100);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(330);
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfCentury();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate25 = localDate23.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate27 = localDate25.minusWeeks((-1));
        boolean boolean28 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate.Property property29 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.roundHalfEvenCopy();
        boolean boolean31 = property19.equals((java.lang.Object) property29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((-1));
        boolean boolean40 = localDate33.isEqual((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate localDate42 = localDate37.withYear((int) (short) 0);
        org.joda.time.DateTime dateTime43 = localDate37.toDateTimeAtStartOfDay();
        long long44 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-99L) + "'", long44 == (-99L));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate7.minusYears((int) ' ');
        org.joda.time.LocalDate.Property property16 = localDate15.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate15.minus(readablePeriod17);
        org.joda.time.LocalDate localDate20 = localDate15.plusWeeks(99);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = localDate20.getFieldType(0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addWrapFieldToCopy((int) (short) 10);
        java.util.Locale locale15 = null;
        java.lang.String str16 = property9.getAsShortText(locale15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) locale15);
        org.joda.time.LocalDate localDate19 = localDate17.withYear(1);
        org.joda.time.LocalDate.Property property20 = localDate17.dayOfWeek();
        int int21 = localDate17.getYearOfCentury();
        org.joda.time.LocalDate localDate23 = localDate17.plusYears((int) (byte) 100);
        int int24 = localDate23.getEra();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property12 = localDate3.weekOfWeekyear();
        long long13 = property12.remainder();
        org.joda.time.LocalDate localDate14 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        int int16 = localDate14.getEra();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate16 = localDate14.withMonthOfYear(10);
        int int17 = localDate14.getWeekyear();
        org.joda.time.LocalDate localDate19 = localDate14.withYear(13);
        org.joda.time.LocalDate.Property property20 = localDate14.era();
        org.joda.time.LocalDate.Property property21 = localDate14.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology8 = localDate5.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) date3, chronology8);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(chronology8);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(2019L, chronology8);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        java.util.Locale locale15 = null;
        int int16 = property14.getMaximumShortTextLength(locale15);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate10 = localDate5.withYear((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate18 = localDate16.minusWeeks((-1));
        boolean boolean19 = localDate12.isEqual((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate.Property property20 = localDate12.year();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate26 = localDate24.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology27 = localDate24.getChronology();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 99, chronology27);
        boolean boolean30 = localDate12.equals((java.lang.Object) 99);
        boolean boolean31 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate.Property property32 = localDate10.weekyear();
        org.joda.time.LocalDate.Property property33 = localDate10.dayOfWeek();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        int int7 = property4.getMinimumValue();
        org.joda.time.LocalDate localDate8 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate9 = property4.withMinimumValue();
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfEra();
        org.joda.time.LocalDate localDate11 = property10.roundFloorCopy();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate13 = localDate3.withCenturyOfEra((int) '4');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = localDate13.getFieldTypes();
        org.joda.time.LocalDate localDate16 = localDate13.withYear(13);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology8 = localDate5.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, chronology8);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(chronology8);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 70, chronology8);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 2922750, chronology8);
        org.joda.time.LocalDate.Property property14 = localDate13.weekyear();
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        int int17 = localDate15.indexOf(dateTimeFieldType16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology22 = localDate19.getChronology();
        int int23 = localDate15.compareTo((org.joda.time.ReadablePartial) localDate19);
        int int24 = localDate15.size();
        boolean boolean25 = localDate7.isBefore((org.joda.time.ReadablePartial) localDate15);
        java.lang.String str27 = localDate15.toString("1970-01-01");
        int int28 = localDate15.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate30 = localDate15.plus(readablePeriod29);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, 0);
        org.joda.time.LocalDate localDate6 = localDate4.minusDays((int) (byte) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.year();
        org.joda.time.LocalDate localDate9 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        int int11 = localDate9.getValue(0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate9.withPeriodAdded(readablePeriod12, (int) (short) 1);
        org.joda.time.DateTime dateTime15 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate17 = localDate9.withWeekyear((int) (short) 10);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        org.joda.time.LocalDate localDate12 = property9.addToCopy((-1));
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = localDate12.toDateMidnight(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType16 = localDate12.getFieldType(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 20");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks((-1));
        boolean boolean12 = localDate5.isEqual((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate localDate14 = localDate9.withYear((int) (short) 0);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate17 = localDate15.plusMonths((int) '4');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate23 = localDate21.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate25 = localDate23.minusWeeks((-1));
        boolean boolean26 = localDate19.isEqual((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate.Property property27 = localDate23.yearOfCentury();
        java.lang.String str28 = property27.getAsShortText();
        org.joda.time.LocalDate localDate30 = property27.addWrapFieldToCopy(0);
        org.joda.time.LocalDate.Property property31 = localDate30.weekOfWeekyear();
        boolean boolean32 = localDate15.isAfter((org.joda.time.ReadablePartial) localDate30);
        int int33 = localDate30.getCenturyOfEra();
        org.joda.time.LocalDate.Property property34 = localDate30.dayOfMonth();
        org.joda.time.LocalDate localDate36 = localDate30.withYear((int) (short) 0);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(chronology37);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate42 = localDate40.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate44 = localDate42.minusWeeks((-1));
        boolean boolean45 = localDate38.isEqual((org.joda.time.ReadablePartial) localDate42);
        org.joda.time.LocalDate.Property property46 = localDate42.yearOfCentury();
        java.lang.String str47 = property46.getAsShortText();
        org.joda.time.LocalDate localDate48 = property46.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        int int50 = localDate48.indexOf(dateTimeFieldType49);
        org.joda.time.LocalDate.Property property51 = localDate48.dayOfWeek();
        java.lang.String str52 = property51.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property51.getFieldType();
        boolean boolean54 = localDate30.isSupported(dateTimeFieldType53);
        int int55 = localDate9.get(dateTimeFieldType53);
        org.joda.time.LocalDate.Property property56 = localDate3.property(dateTimeFieldType53);
        org.joda.time.DurationField durationField57 = property56.getDurationField();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1" + "'", str28, "1");
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1" + "'", str47, "1");
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Thursday" + "'", str52, "Thursday");
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(durationField57);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = localDate12.toInterval(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate12.plusWeeks((-1));
        int int17 = localDate16.getDayOfMonth();
        boolean boolean19 = localDate16.equals((java.lang.Object) "");
        int int20 = localDate16.getEra();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) localDate16, dateTimeZone21);
        int int23 = localDate16.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 25 + "'", int17 == 25);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) localDate8);
        org.joda.time.LocalDate localDate11 = localDate8.minusYears(1970);
        org.joda.time.LocalDate.Property property12 = localDate8.dayOfMonth();
        org.joda.time.LocalDate localDate13 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (byte) 100);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date18 = localDate17.toDate();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.fromDateFields(date18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate21 = localDate19.minus(readablePeriod20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate27 = localDate25.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate29 = localDate27.minusWeeks((-1));
        boolean boolean30 = localDate23.isEqual((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((-1));
        boolean boolean40 = localDate33.isEqual((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate.Property property41 = localDate33.year();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate45 = localDate43.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate47 = localDate45.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = localDate45.toDateTimeAtCurrentTime(dateTimeZone48);
        int int50 = property41.getDifference((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate56 = localDate54.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate58 = localDate56.minusWeeks((-1));
        boolean boolean59 = localDate52.isEqual((org.joda.time.ReadablePartial) localDate56);
        org.joda.time.DateTime dateTime60 = localDate56.toDateTimeAtMidnight();
        int int61 = property41.getDifference((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime dateTime62 = localDate27.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime dateTime63 = localDate21.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.LocalDate.Property property64 = localDate21.dayOfWeek();
        org.joda.time.LocalDate.Property property65 = localDate21.weekyear();
        org.joda.time.LocalDate localDate67 = localDate21.plusYears((int) (byte) 10);
        int int68 = localDate67.getMonthOfYear();
        int int69 = localDate15.compareTo((org.joda.time.ReadablePartial) localDate67);
        int int70 = localDate13.compareTo((org.joda.time.ReadablePartial) localDate67);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2019 + "'", int50 == 2019);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2019 + "'", int61 == 2019);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        org.joda.time.LocalDate localDate11 = property9.setCopy("2020");
        org.joda.time.LocalDate localDate12 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate14 = localDate12.withDayOfYear(9);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, 329);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        int int7 = property4.getMinimumValue();
        org.joda.time.LocalDate localDate8 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate9 = property4.withMinimumValue();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        int int15 = localDate13.indexOf(dateTimeFieldType14);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology20 = localDate17.getChronology();
        int int21 = localDate13.compareTo((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.LocalDate.Property property22 = localDate13.weekOfWeekyear();
        org.joda.time.LocalDate localDate24 = localDate13.withYearOfEra(2);
        org.joda.time.LocalDate localDate26 = localDate13.minusYears(100);
        org.joda.time.LocalDate.Property property27 = localDate26.yearOfEra();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate31 = localDate29.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology32 = localDate29.getChronology();
        org.joda.time.LocalDate.Property property33 = localDate29.yearOfEra();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        int int39 = localDate37.indexOf(dateTimeFieldType38);
        org.joda.time.LocalTime localTime40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate37.toDateTime(localTime40, dateTimeZone41);
        int int43 = property33.getDifference((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.LocalDate localDate44 = property33.roundCeilingCopy();
        java.lang.String str45 = property33.getName();
        java.lang.String str46 = property33.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property33.getFieldType();
        boolean boolean48 = localDate26.isSupported(dateTimeFieldType47);
        org.joda.time.LocalDate localDate50 = localDate9.withField(dateTimeFieldType47, 32);
        org.joda.time.LocalDate.Property property51 = localDate9.weekOfWeekyear();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1968 + "'", int43 == 1968);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "yearOfEra" + "'", str45, "yearOfEra");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "yearOfEra" + "'", str46, "yearOfEra");
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        int int12 = localDate7.getDayOfYear();
        java.lang.String str13 = localDate7.toString();
        java.lang.String str15 = localDate7.toString("1");
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = localDate7.toDateMidnight(dateTimeZone16);
        org.joda.time.LocalDate.Property property18 = localDate7.year();
        int int19 = property18.getMaximumValue();
        org.joda.time.DurationField durationField20 = property18.getRangeDurationField();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 292278993 + "'", int19 == 292278993);
        org.junit.Assert.assertNull(durationField20);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        int int2 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDate.Property property3 = localDate1.centuryOfEra();
        int int4 = property3.get();
        org.joda.time.LocalDate localDate6 = property3.addToCopy((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = property3.roundHalfEvenCopy();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        boolean boolean16 = localDate9.isEqual((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.LocalDate.Property property17 = localDate9.year();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate21.toDateTimeAtCurrentTime(dateTimeZone24);
        int int26 = property17.getDifference((org.joda.time.ReadableInstant) dateTime25);
        java.lang.String str27 = property17.getAsString();
        org.joda.time.LocalDate localDate29 = property17.addWrapFieldToCopy((int) ' ');
        org.joda.time.LocalDate localDate30 = property17.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = localDate30.isSupported(dateTimeFieldType31);
        org.joda.time.DateTime dateTime33 = localDate30.toDateTimeAtStartOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate41 = localDate39.minusWeeks((-1));
        boolean boolean42 = localDate35.isEqual((org.joda.time.ReadablePartial) localDate39);
        org.joda.time.LocalDate.Property property43 = localDate39.yearOfCentury();
        java.lang.String str44 = property43.getAsShortText();
        org.joda.time.LocalDate localDate46 = property43.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate48 = property43.addToCopy((int) (short) 1);
        org.joda.time.LocalDate.Property property49 = localDate48.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property49.getFieldType();
        boolean boolean51 = localDate30.isSupported(dateTimeFieldType50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate53 = localDate7.withField(dateTimeFieldType50, 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2019 + "'", int26 == 2019);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020" + "'", str27, "2020");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1" + "'", str44, "1");
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        org.joda.time.LocalDate localDate12 = property9.addToCopy((-1));
        org.joda.time.LocalDate.Property property13 = localDate12.centuryOfEra();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date16 = localDate15.toDate();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromDateFields(date16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.plus(readablePeriod18);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) localDate12, chronology20);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        org.joda.time.LocalDate.Property property5 = localDate1.yearOfEra();
        java.lang.String str6 = property5.getAsString();
        int int7 = property5.getMaximumValue();
        org.joda.time.LocalDate localDate8 = property5.withMinimumValue();
        org.joda.time.LocalDate localDate10 = property5.setCopy(1970);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks(16);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970" + "'", str6, "1970");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 292278993 + "'", int7 == 292278993);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = localDate11.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfWeek();
        org.joda.time.LocalDate localDate16 = property14.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate17 = property14.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property14.getFieldType();
        java.lang.String str19 = property14.toString();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[dayOfWeek]" + "'", str19, "Property[dayOfWeek]");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = localDate11.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfWeek();
        org.joda.time.LocalDate localDate16 = property14.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate18 = localDate16.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate21 = localDate19.plusMonths((int) '4');
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate27 = localDate25.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate29 = localDate27.minusWeeks((-1));
        boolean boolean30 = localDate23.isEqual((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate.Property property31 = localDate27.yearOfCentury();
        java.lang.String str32 = property31.getAsShortText();
        org.joda.time.LocalDate localDate34 = property31.addWrapFieldToCopy(0);
        org.joda.time.LocalDate.Property property35 = localDate34.weekOfWeekyear();
        boolean boolean36 = localDate19.isAfter((org.joda.time.ReadablePartial) localDate34);
        int int37 = localDate34.getCenturyOfEra();
        int int38 = localDate34.getDayOfMonth();
        boolean boolean39 = localDate16.isBefore((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.LocalDate.Property property40 = localDate16.monthOfYear();
        int int41 = property40.get();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1" + "'", str32, "1");
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date4 = localDate3.toDate();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology9 = localDate6.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) date4, chronology9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 13, chronology9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 48, chronology9);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((-1));
        org.joda.time.LocalDate.Property property6 = localDate5.monthOfYear();
        java.lang.String str7 = property6.toString();
        java.lang.String str8 = property6.getAsShortText();
        long long9 = property6.remainder();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date12 = localDate11.toDate();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) date12, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate18.toDateMidnight(dateTimeZone19);
        long long21 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.LocalDate localDate22 = property6.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = localDate22.withEra((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[monthOfYear]" + "'", str7, "Property[monthOfYear]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Jan" + "'", str8, "Jan");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 604800000L + "'", long9 == 604800000L);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-23627L) + "'", long21 == (-23627L));
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, 0);
        org.joda.time.LocalDate localDate6 = localDate4.minusDays((int) (byte) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.year();
        org.joda.time.LocalDate localDate9 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) localDate4);
        org.joda.time.LocalDate localDate12 = localDate10.plusYears((-50));
        int int13 = localDate10.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDate10.indexOf(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        int int18 = localDate10.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate14.toDateMidnight(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate14.minusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.LocalDate localDate25 = localDate4.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate25.plus(readablePeriod26);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks((-1));
        boolean boolean13 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate.Property property14 = localDate6.year();
        int int15 = property14.get();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = localDate19.indexOf(dateTimeFieldType20);
        org.joda.time.LocalTime localTime22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate19.toDateTime(localTime22, dateTimeZone23);
        long long25 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        int int26 = property4.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDate localDate27 = property4.withMinimumValue();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate33 = localDate31.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate35 = localDate33.minusWeeks((-1));
        boolean boolean36 = localDate29.isEqual((org.joda.time.ReadablePartial) localDate33);
        org.joda.time.LocalDate.Property property37 = localDate33.yearOfCentury();
        java.lang.String str38 = property37.getAsShortText();
        org.joda.time.LocalDate localDate39 = property37.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        int int41 = localDate39.indexOf(dateTimeFieldType40);
        org.joda.time.LocalDate.Property property42 = localDate39.dayOfWeek();
        int[] intArray43 = localDate39.getValues();
        org.joda.time.DateTime dateTime44 = localDate39.toDateTimeAtCurrentTime();
        int int45 = property4.compareTo((org.joda.time.ReadablePartial) localDate39);
        int int46 = property4.get();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2020 + "'", int15 == 2020);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2019L + "'", long25 == 2019L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[99, 1, 1]");
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 70 + "'", int46 == 70);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        int int18 = property9.getDifference((org.joda.time.ReadableInstant) dateTime17);
        java.lang.String str19 = property9.getAsString();
        org.joda.time.LocalDate localDate21 = property9.addWrapFieldToCopy((int) ' ');
        org.joda.time.LocalDate localDate22 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate23 = property9.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate25 = localDate23.minus(readablePeriod24);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property27 = localDate26.year();
        int int28 = localDate26.getYear();
        int int29 = localDate26.getEra();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate35 = localDate33.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate37 = localDate35.minusWeeks((-1));
        boolean boolean38 = localDate31.isEqual((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.LocalDate.Property property39 = localDate31.year();
        int int40 = property39.get();
        org.joda.time.LocalDate localDate42 = property39.addToCopy((-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = localDate42.isSupported(dateTimeFieldType43);
        int int45 = localDate26.compareTo((org.joda.time.ReadablePartial) localDate42);
        boolean boolean46 = localDate23.isBefore((org.joda.time.ReadablePartial) localDate42);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology47);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate52 = localDate50.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate54 = localDate52.minusWeeks((-1));
        boolean boolean55 = localDate48.isEqual((org.joda.time.ReadablePartial) localDate52);
        org.joda.time.LocalDate.Property property56 = localDate48.year();
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate60 = localDate58.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate62 = localDate60.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = localDate60.toDateTimeAtCurrentTime(dateTimeZone63);
        int int65 = property56.getDifference((org.joda.time.ReadableInstant) dateTime64);
        java.lang.String str66 = property56.getAsString();
        org.joda.time.LocalDate localDate68 = property56.addWrapFieldToCopy((int) ' ');
        org.joda.time.LocalDate localDate69 = property56.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate70 = property56.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDate localDate72 = localDate70.minus(readablePeriod71);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateMidnight dateMidnight74 = localDate72.toDateMidnight(dateTimeZone73);
        org.joda.time.DateTime dateTime75 = localDate23.toDateTime((org.joda.time.ReadableInstant) dateMidnight74);
        org.joda.time.LocalDate.Property property76 = localDate23.era();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019 + "'", int18 == 2019);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020" + "'", str19, "2020");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2020 + "'", int28 == 2020);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2020 + "'", int40 == 2020);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2019 + "'", int65 == 2019);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "2020" + "'", str66, "2020");
        org.junit.Assert.assertNotNull(localDate68);
        org.junit.Assert.assertNotNull(localDate69);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertNotNull(dateMidnight74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(property76);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        int int9 = localDate1.getYearOfCentury();
        org.joda.time.LocalDate.Property property10 = localDate1.dayOfYear();
        org.joda.time.DateTime dateTime11 = localDate1.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) localDate8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(6);
        org.joda.time.LocalDate.Property property12 = localDate9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = localDate9.toInterval(dateTimeZone13);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval14);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) '4');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks((-1));
        boolean boolean12 = localDate5.isEqual((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate localDate14 = localDate5.plusDays((int) (short) 100);
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        boolean boolean24 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate.Property property25 = localDate21.yearOfCentury();
        java.lang.String str26 = property25.getAsShortText();
        org.joda.time.LocalDate localDate27 = property25.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        int int29 = localDate27.indexOf(dateTimeFieldType28);
        org.joda.time.LocalDate.Property property30 = localDate27.dayOfWeek();
        int int31 = localDate27.getEra();
        int int32 = property15.compareTo((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate34 = localDate27.withWeekyear((int) (short) -1);
        int int35 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.LocalDate localDate37 = localDate0.withWeekOfWeekyear(20);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(chronology38);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate43 = localDate41.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate45 = localDate43.minusWeeks((-1));
        boolean boolean46 = localDate39.isEqual((org.joda.time.ReadablePartial) localDate43);
        org.joda.time.LocalDate localDate48 = localDate43.withYear((int) (short) 0);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate52 = localDate50.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        int int54 = localDate52.indexOf(dateTimeFieldType53);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate58 = localDate56.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology59 = localDate56.getChronology();
        int int60 = localDate52.compareTo((org.joda.time.ReadablePartial) localDate56);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = localDate56.toDateMidnight(dateTimeZone61);
        org.joda.time.LocalDate localDate64 = localDate56.minusYears((int) ' ');
        org.joda.time.DateTime dateTime65 = localDate64.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate68 = localDate66.plusMonths((int) '4');
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate(chronology69);
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate74 = localDate72.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate76 = localDate74.minusWeeks((-1));
        boolean boolean77 = localDate70.isEqual((org.joda.time.ReadablePartial) localDate74);
        org.joda.time.LocalDate.Property property78 = localDate74.yearOfCentury();
        java.lang.String str79 = property78.getAsShortText();
        org.joda.time.LocalDate localDate80 = property78.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = null;
        int int82 = localDate80.indexOf(dateTimeFieldType81);
        org.joda.time.LocalDate.Property property83 = localDate80.dayOfWeek();
        java.lang.String str84 = property83.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = property83.getFieldType();
        org.joda.time.LocalDate.Property property86 = localDate66.property(dateTimeFieldType85);
        org.joda.time.LocalDate.Property property87 = localDate64.property(dateTimeFieldType85);
        org.joda.time.LocalDate.Property property88 = localDate43.property(dateTimeFieldType85);
        boolean boolean89 = localDate37.isAfter((org.joda.time.ReadablePartial) localDate43);
        org.joda.time.LocalDate.Property property90 = localDate43.weekyear();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1" + "'", str26, "1");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight62);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(localDate68);
        org.junit.Assert.assertNotNull(localDate74);
        org.junit.Assert.assertNotNull(localDate76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "1" + "'", str79, "1");
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Thursday" + "'", str84, "Thursday");
        org.junit.Assert.assertNotNull(dateTimeFieldType85);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(property90);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        boolean boolean16 = localDate9.isEqual((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.LocalDate localDate18 = localDate9.plusDays((int) (short) 100);
        org.joda.time.LocalDate localDate20 = localDate9.withYearOfEra((int) ' ');
        org.joda.time.LocalDate localDate22 = localDate9.plusWeeks(292278993);
        boolean boolean23 = localDate6.isBefore((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.LocalDate.Property property24 = localDate22.year();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date27 = localDate26.toDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate26.minus(readablePeriod28);
        org.joda.time.DateTime dateTime30 = localDate29.toDateTimeAtCurrentTime();
        boolean boolean31 = property24.equals((java.lang.Object) localDate29);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, 0);
        org.joda.time.LocalDate localDate6 = localDate4.minusDays((int) (byte) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.year();
        org.joda.time.LocalDate localDate9 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        int int11 = localDate9.getValue(0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate9.withPeriodAdded(readablePeriod12, (int) (short) 1);
        int int15 = localDate9.getWeekyear();
        int int16 = localDate9.getYear();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2020 + "'", int15 == 2020);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2020 + "'", int16 == 2020);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        int int7 = property4.getMinimumValue();
        org.joda.time.LocalDate localDate8 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate9 = property4.withMinimumValue();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        int int15 = localDate13.indexOf(dateTimeFieldType14);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology20 = localDate17.getChronology();
        int int21 = localDate13.compareTo((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.LocalDate.Property property22 = localDate13.weekOfWeekyear();
        org.joda.time.LocalDate localDate24 = localDate13.withYearOfEra(2);
        org.joda.time.LocalDate localDate26 = localDate13.minusYears(100);
        org.joda.time.LocalDate.Property property27 = localDate26.yearOfEra();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate31 = localDate29.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology32 = localDate29.getChronology();
        org.joda.time.LocalDate.Property property33 = localDate29.yearOfEra();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        int int39 = localDate37.indexOf(dateTimeFieldType38);
        org.joda.time.LocalTime localTime40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate37.toDateTime(localTime40, dateTimeZone41);
        int int43 = property33.getDifference((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.LocalDate localDate44 = property33.roundCeilingCopy();
        java.lang.String str45 = property33.getName();
        java.lang.String str46 = property33.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property33.getFieldType();
        boolean boolean48 = localDate26.isSupported(dateTimeFieldType47);
        org.joda.time.LocalDate localDate50 = localDate9.withField(dateTimeFieldType47, 32);
        org.joda.time.LocalDate localDate52 = localDate9.plusYears(365);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1968 + "'", int43 == 1968);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "yearOfEra" + "'", str45, "yearOfEra");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "yearOfEra" + "'", str46, "yearOfEra");
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate52);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 99, chronology6);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology16 = localDate13.getChronology();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 0, chronology16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 99, chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology16);
        int int20 = localDate9.compareTo((org.joda.time.ReadablePartial) localDate19);
        int int21 = localDate19.getDayOfYear();
        org.joda.time.LocalDate localDate23 = localDate19.plusWeeks(0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 330 + "'", int21 == 330);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate10 = localDate5.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property11 = localDate5.year();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate15.minusWeeks((-1));
        org.joda.time.LocalDate.Property property18 = localDate17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate17.toDateTimeAtCurrentTime(dateTimeZone19);
        int int21 = property11.getDifference((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalDate localDate22 = property11.withMaximumValue();
        org.joda.time.DurationField durationField23 = property11.getDurationField();
        java.util.Locale locale24 = null;
        java.lang.String str25 = property11.getAsShortText(locale24);
        org.joda.time.DateTimeField dateTimeField26 = property11.getField();
        org.joda.time.LocalDate localDate27 = property11.withMinimumValue();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.plusMonths((int) '4');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((-1));
        boolean boolean14 = localDate7.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate.Property property15 = localDate11.yearOfCentury();
        java.lang.String str16 = property15.getAsShortText();
        org.joda.time.LocalDate localDate18 = property15.addWrapFieldToCopy(0);
        org.joda.time.LocalDate.Property property19 = localDate18.weekOfWeekyear();
        boolean boolean20 = localDate3.isAfter((org.joda.time.ReadablePartial) localDate18);
        int int21 = localDate18.getCenturyOfEra();
        org.joda.time.Chronology chronology22 = localDate18.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(48, (int) (short) 1, 1980, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1980 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate18 = localDate16.minusWeeks((-1));
        int int19 = property9.compareTo((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate localDate21 = localDate16.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate16.minus(readablePeriod22);
        org.joda.time.LocalDate localDate25 = localDate16.minusYears(70);
        org.joda.time.LocalDate localDate27 = localDate16.withCenturyOfEra(98);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate10 = localDate8.minusWeeks((-1));
        boolean boolean11 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate.Property property12 = localDate8.yearOfCentury();
        java.lang.String str13 = property12.getAsShortText();
        org.joda.time.LocalDate localDate15 = property12.addWrapFieldToCopy(0);
        org.joda.time.LocalDate.Property property16 = localDate15.weekOfWeekyear();
        boolean boolean17 = localDate0.isAfter((org.joda.time.ReadablePartial) localDate15);
        int int18 = localDate15.getCenturyOfEra();
        org.joda.time.Chronology chronology19 = localDate15.getChronology();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(chronology19);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology19);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        int int7 = property4.getMinimumValue();
        org.joda.time.LocalDate localDate8 = property4.roundFloorCopy();
        java.lang.String str9 = property4.getAsShortText();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate15.minusWeeks((-1));
        boolean boolean18 = localDate11.isEqual((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate.Property property19 = localDate11.year();
        int int20 = property19.get();
        org.joda.time.LocalDate localDate22 = property19.addToCopy((-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        int int25 = property4.compareTo((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.Interval interval26 = localDate22.toInterval();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "70" + "'", str9, "70");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(interval26);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property5 = localDate4.dayOfYear();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((-1));
        boolean boolean14 = localDate7.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        boolean boolean24 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate.Property property25 = localDate17.year();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtCurrentTime(dateTimeZone32);
        int int34 = property25.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate40 = localDate38.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate42 = localDate40.minusWeeks((-1));
        boolean boolean43 = localDate36.isEqual((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.DateTime dateTime44 = localDate40.toDateTimeAtMidnight();
        int int45 = property25.getDifference((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime47 = localDate5.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalDate.Property property48 = localDate5.dayOfWeek();
        org.joda.time.LocalDate.Property property49 = localDate5.weekyear();
        org.joda.time.LocalDate localDate51 = localDate5.plusYears((int) (byte) 10);
        org.joda.time.LocalDate.Property property52 = localDate5.dayOfWeek();
        java.util.Locale locale53 = null;
        java.lang.String str54 = property52.getAsShortText(locale53);
        org.joda.time.DurationField durationField55 = property52.getRangeDurationField();
        java.lang.String str56 = property52.getName();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2019 + "'", int34 == 2019);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2019 + "'", int45 == 2019);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Thu" + "'", str54, "Thu");
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "dayOfWeek" + "'", str56, "dayOfWeek");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        int int5 = localDate1.getYearOfCentury();
        org.joda.time.LocalDate localDate7 = localDate1.minusDays((int) ' ');
        org.joda.time.Chronology chronology8 = localDate1.getChronology();
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        boolean boolean10 = property9.isLeap();
        org.joda.time.LocalDate localDate11 = property9.roundHalfFloorCopy();
        org.joda.time.DurationField durationField12 = property9.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        int int10 = localDate5.getYearOfCentury();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 70 + "'", int10 == 70);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        java.lang.String str12 = property9.getAsShortText();
        int int13 = property9.getMinimumValue();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        org.joda.time.DateTimeField dateTimeField11 = property9.getField();
        int int12 = property9.getMaximumValueOverall();
        int int13 = property9.getLeapAmount();
        int int14 = property9.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292278993 + "'", int12 == 292278993);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-292275054) + "'", int14 == (-292275054));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((-1));
        boolean boolean14 = localDate7.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        boolean boolean24 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate.Property property25 = localDate17.year();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtCurrentTime(dateTimeZone32);
        int int34 = property25.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate40 = localDate38.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate42 = localDate40.minusWeeks((-1));
        boolean boolean43 = localDate36.isEqual((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.DateTime dateTime44 = localDate40.toDateTimeAtMidnight();
        int int45 = property25.getDifference((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime47 = localDate5.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalDate.Property property48 = localDate5.dayOfWeek();
        org.joda.time.LocalDate.Property property49 = localDate5.weekyear();
        org.joda.time.LocalDate localDate51 = localDate5.plusYears((int) (byte) 10);
        int int52 = localDate51.getMonthOfYear();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date55 = localDate54.toDate();
        org.joda.time.LocalDate localDate56 = org.joda.time.LocalDate.fromDateFields(date55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalDate localDate58 = localDate56.minus(readablePeriod57);
        org.joda.time.LocalDate.Property property59 = localDate58.dayOfWeek();
        org.joda.time.LocalDate localDate61 = localDate58.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate.Property property62 = localDate58.yearOfCentury();
        boolean boolean63 = localDate51.isAfter((org.joda.time.ReadablePartial) localDate58);
        org.joda.time.LocalDate localDate65 = localDate51.minusDays(31);
        int int66 = localDate65.getWeekOfWeekyear();
        java.lang.String str68 = localDate65.toString("53");
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2019 + "'", int34 == 2019);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2019 + "'", int45 == 2019);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 48 + "'", int66 == 48);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "53" + "'", str68, "53");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date17 = localDate16.toDate();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology22 = localDate19.getChronology();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) date17, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = localDate23.toDateMidnight(dateTimeZone24);
        org.joda.time.LocalDate.Property property26 = localDate23.weekOfWeekyear();
        org.joda.time.LocalDate localDate27 = property26.roundHalfEvenCopy();
        boolean boolean28 = localDate14.isBefore((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate30 = localDate14.minusYears((int) '4');
        int int31 = localDate14.getCenturyOfEra();
        int int32 = localDate14.getMonthOfYear();
        org.joda.time.LocalDate localDate34 = localDate14.minusYears((-10));
        int int35 = localDate14.size();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        int int18 = property9.getDifference((org.joda.time.ReadableInstant) dateTime17);
        java.lang.String str19 = property9.getAsString();
        org.joda.time.LocalDate localDate21 = property9.addWrapFieldToCopy((int) ' ');
        org.joda.time.LocalDate localDate22 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate23 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate25 = property9.addToCopy((int) (byte) -1);
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfEra();
        org.joda.time.LocalDate localDate28 = property26.addToCopy(100);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019 + "'", int18 == 2019);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020" + "'", str19, "2020");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = localDate8.indexOf(dateTimeFieldType9);
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate8.toDateTime(localTime11, dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate1.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime15 = localDate1.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date4 = localDate3.toDate();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology9 = localDate6.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) date4, chronology9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, chronology9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (byte) 10, chronology9);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology9);
        int int14 = localDate13.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property15 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate17 = localDate13.plusDays((int) (byte) 1);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1971-01-01");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate10 = localDate8.minusWeeks((-1));
        boolean boolean11 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate.Property property12 = localDate8.yearOfCentury();
        java.lang.String str13 = property12.getAsShortText();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate21 = localDate19.minusWeeks((-1));
        boolean boolean22 = localDate15.isEqual((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate.Property property23 = localDate15.year();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate27 = localDate25.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate29 = localDate27.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtCurrentTime(dateTimeZone30);
        int int32 = property23.getDifference((org.joda.time.ReadableInstant) dateTime31);
        long long33 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        boolean boolean34 = localDate2.equals((java.lang.Object) property12);
        org.joda.time.Interval interval35 = localDate2.toInterval();
        int[] intArray36 = localDate2.getValues();
        java.lang.String str37 = localDate2.toString();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2019 + "'", int32 == 2019);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[2025, 3, 25]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2025-03-25" + "'", str37, "2025-03-25");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((-1));
        org.joda.time.LocalDate.Property property6 = localDate5.monthOfYear();
        java.lang.String str7 = property6.toString();
        int int8 = property6.getMaximumValue();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate16 = localDate14.minusWeeks((-1));
        boolean boolean17 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate.Property property18 = localDate14.yearOfCentury();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.LocalDate localDate20 = property18.withMaximumValue();
        org.joda.time.LocalDate localDate21 = property18.roundFloorCopy();
        org.joda.time.LocalDate localDate23 = property18.addWrapFieldToCopy(19);
        boolean boolean24 = property6.equals((java.lang.Object) property18);
        org.joda.time.Interval interval25 = property18.toInterval();
        int int26 = property18.getMinimumValue();
        org.joda.time.DurationField durationField27 = property18.getDurationField();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate33 = localDate31.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate35 = localDate33.minusWeeks((-1));
        boolean boolean36 = localDate29.isEqual((org.joda.time.ReadablePartial) localDate33);
        org.joda.time.LocalDate.Property property37 = localDate29.year();
        org.joda.time.LocalDate localDate39 = localDate29.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDate39.toDateTimeAtStartOfDay(dateTimeZone40);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.Chronology chronology44 = localDate43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(chronology44);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) dateTimeZone40, chronology44);
        boolean boolean47 = property18.equals((java.lang.Object) chronology44);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology44);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[monthOfYear]" + "'", str7, "Property[monthOfYear]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        boolean boolean16 = localDate9.isEqual((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.LocalDate localDate18 = localDate9.plusDays((int) (short) 100);
        org.joda.time.LocalDate localDate20 = localDate9.withYearOfEra((int) ' ');
        org.joda.time.LocalDate localDate22 = localDate9.plusWeeks(292278993);
        boolean boolean23 = localDate6.isBefore((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.LocalDate.Property property24 = localDate22.year();
        long long25 = property24.remainder();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(chronology26);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate31 = localDate29.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate33 = localDate31.minusWeeks((-1));
        boolean boolean34 = localDate27.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property35 = localDate31.yearOfCentury();
        org.joda.time.LocalDate localDate37 = localDate31.withYearOfCentury((int) '#');
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(chronology38);
        int int40 = localDate39.getDayOfYear();
        org.joda.time.LocalDate localDate41 = localDate31.withFields((org.joda.time.ReadablePartial) localDate39);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date44 = localDate43.toDate();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate48 = localDate46.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology49 = localDate46.getChronology();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((java.lang.Object) date44, chronology49);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((java.lang.Object) localDate31, chronology49);
        org.joda.time.DateTime dateTime52 = localDate31.toDateTimeAtMidnight();
        long long53 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime52);
        java.util.Locale locale54 = null;
        int int55 = property24.getMaximumShortTextLength(locale54);
        org.joda.time.LocalDate localDate56 = property24.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25833600000L + "'", long25 == 25833600000L);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 330 + "'", int40 == 330);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 5603648L + "'", long53 == 5603648L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
        org.junit.Assert.assertNotNull(localDate56);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) -1);
        org.joda.time.LocalTime localTime2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTime(localTime2);
        org.joda.time.LocalDate.Property property4 = localDate1.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.plus(readablePeriod15);
        org.joda.time.LocalDate localDate18 = localDate14.plusMonths(2019);
        org.joda.time.LocalDate localDate20 = localDate14.plusWeeks(330);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((-1));
        boolean boolean9 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.LocalDate localDate11 = localDate2.plusDays((int) (short) 100);
        boolean boolean12 = localDate0.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate.Property property13 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date16 = localDate15.toDate();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate15.minus(readablePeriod17);
        org.joda.time.LocalDate localDate20 = localDate18.plusMonths(99);
        boolean boolean21 = localDate0.isEqual((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate23 = localDate20.plusWeeks(2019);
        org.joda.time.LocalDate.Property property24 = localDate20.yearOfCentury();
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate10 = localDate8.minusWeeks((-1));
        boolean boolean11 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate.Property property12 = localDate8.yearOfCentury();
        java.lang.String str13 = property12.getAsShortText();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate21 = localDate19.minusWeeks((-1));
        boolean boolean22 = localDate15.isEqual((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate.Property property23 = localDate15.year();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate27 = localDate25.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate29 = localDate27.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtCurrentTime(dateTimeZone30);
        int int32 = property23.getDifference((org.joda.time.ReadableInstant) dateTime31);
        long long33 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        boolean boolean34 = localDate2.equals((java.lang.Object) property12);
        org.joda.time.LocalDate localDate36 = localDate2.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDate.Property property37 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate39 = localDate2.withDayOfMonth(10);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) localDate2);
        int int41 = localDate40.size();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2019 + "'", int32 == 2019);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        int int11 = property9.get();
        org.joda.time.DateTimeField dateTimeField12 = property9.getField();
        int int13 = property9.getMaximumValue();
        org.joda.time.DurationField durationField14 = property9.getDurationField();
        int int15 = property9.getMinimumValueOverall();
        org.joda.time.DurationField durationField16 = property9.getRangeDurationField();
        org.joda.time.LocalDate localDate17 = property9.roundHalfEvenCopy();
        java.lang.String str18 = property9.getAsString();
        java.util.Locale locale19 = null;
        int int20 = property9.getMaximumTextLength(locale19);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 292278993 + "'", int13 == 292278993);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-292275054) + "'", int15 == (-292275054));
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020" + "'", str18, "2020");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology7 = localDate4.getChronology();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) date2, chronology7);
        java.util.Date date9 = localDate8.toDate();
        org.joda.time.LocalDate.Property property10 = localDate8.era();
        int[] intArray11 = localDate8.getValues();
        org.joda.time.LocalDate localDate13 = localDate8.withDayOfYear(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate8.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology7 = localDate4.getChronology();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) date2, chronology7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(chronology7);
        org.joda.time.LocalDate localDate11 = localDate9.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.LocalDate localDate13 = localDate11.withWeekOfWeekyear((int) ' ');
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfYear();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((-1));
        boolean boolean9 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.LocalDate localDate11 = localDate2.plusDays((int) (short) 100);
        boolean boolean12 = localDate0.isEqual((org.joda.time.ReadablePartial) localDate11);
        int int13 = localDate11.getWeekOfWeekyear();
        int int14 = localDate11.getYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate20 = localDate18.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate22 = localDate20.minusWeeks((-1));
        boolean boolean23 = localDate16.isEqual((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate25 = localDate20.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property26 = localDate20.year();
        org.joda.time.LocalDate localDate28 = property26.setCopy((int) 'a');
        org.joda.time.LocalDate localDate30 = property26.addToCopy(99);
        boolean boolean31 = localDate11.equals((java.lang.Object) property26);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = localDate11.getFieldTypes();
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2021 + "'", int14 == 2021);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray32);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeField dateTimeField10 = localDate5.getField((int) (byte) 1);
        org.joda.time.LocalDate.Property property11 = localDate5.yearOfCentury();
        java.util.Locale locale12 = null;
        int int13 = property11.getMaximumTextLength(locale12);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        org.joda.time.LocalDate.Property property15 = localDate14.weekOfWeekyear();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfCentury(0);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate24 = localDate22.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate26 = localDate24.minusWeeks((-1));
        boolean boolean27 = localDate20.isEqual((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate localDate29 = localDate20.plusDays((int) (short) 100);
        boolean boolean30 = localDate18.isEqual((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate.Property property31 = localDate18.dayOfWeek();
        boolean boolean32 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology33);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate38 = localDate36.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate40 = localDate38.minusWeeks((-1));
        boolean boolean41 = localDate34.isEqual((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.LocalDate.Property property42 = localDate38.yearOfCentury();
        java.lang.String str43 = property42.getAsShortText();
        org.joda.time.LocalDate localDate45 = property42.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate47 = property42.addToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate49 = property42.addWrapFieldToCopy((int) '#');
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology50);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate55 = localDate53.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate57 = localDate55.minusWeeks((-1));
        boolean boolean58 = localDate51.isEqual((org.joda.time.ReadablePartial) localDate55);
        org.joda.time.LocalDate.Property property59 = localDate51.year();
        int int60 = property59.get();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate64 = localDate62.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = null;
        int int66 = localDate64.indexOf(dateTimeFieldType65);
        org.joda.time.LocalTime localTime67 = null;
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = localDate64.toDateTime(localTime67, dateTimeZone68);
        long long70 = property59.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime69);
        int int71 = property42.getDifference((org.joda.time.ReadableInstant) dateTime69);
        int int72 = property42.getMinimumValueOverall();
        org.joda.time.LocalDate localDate73 = property42.withMaximumValue();
        boolean boolean74 = localDate18.isAfter((org.joda.time.ReadablePartial) localDate73);
        int int75 = localDate73.size();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1" + "'", str43, "1");
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2020 + "'", int60 == 2020);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 2019L + "'", long70 == 2019L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDate10.indexOf(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        int int18 = localDate10.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate14.toDateMidnight(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate14.minusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.LocalDate localDate25 = localDate4.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate.Property property26 = localDate4.era();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate30 = localDate28.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        int int32 = localDate30.indexOf(dateTimeFieldType31);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate36 = localDate34.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology37 = localDate34.getChronology();
        int int38 = localDate30.compareTo((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = localDate34.toDateMidnight(dateTimeZone39);
        org.joda.time.LocalDate localDate42 = localDate34.minusYears((int) ' ');
        int int43 = localDate34.getMonthOfYear();
        boolean boolean44 = localDate4.isAfter((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate48 = localDate46.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        int int50 = localDate48.indexOf(dateTimeFieldType49);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate54 = localDate52.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology55 = localDate52.getChronology();
        int int56 = localDate48.compareTo((org.joda.time.ReadablePartial) localDate52);
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate60 = localDate58.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        int int62 = localDate60.indexOf(dateTimeFieldType61);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate66 = localDate64.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology67 = localDate64.getChronology();
        int int68 = localDate60.compareTo((org.joda.time.ReadablePartial) localDate64);
        int int69 = localDate60.size();
        boolean boolean70 = localDate52.isBefore((org.joda.time.ReadablePartial) localDate60);
        java.lang.String str72 = localDate60.toString("1970-01-01");
        org.joda.time.LocalDate localDate73 = localDate34.withFields((org.joda.time.ReadablePartial) localDate60);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1970-01-01" + "'", str72, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate73);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((-1));
        boolean boolean14 = localDate7.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        boolean boolean24 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate.Property property25 = localDate17.year();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtCurrentTime(dateTimeZone32);
        int int34 = property25.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate40 = localDate38.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate42 = localDate40.minusWeeks((-1));
        boolean boolean43 = localDate36.isEqual((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.DateTime dateTime44 = localDate40.toDateTimeAtMidnight();
        int int45 = property25.getDifference((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime47 = localDate5.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalDate.Property property48 = localDate5.dayOfWeek();
        int int49 = property48.get();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2019 + "'", int34 == 2019);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2019 + "'", int45 == 2019);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        int int7 = property4.getMinimumValue();
        org.joda.time.LocalDate localDate8 = property4.roundFloorCopy();
        java.lang.String str9 = property4.getAsShortText();
        org.joda.time.LocalDate localDate10 = property4.getLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property4.getFieldType();
        int int12 = property4.getMaximumValue();
        org.joda.time.LocalDate localDate13 = property4.roundCeilingCopy();
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra(3);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "70" + "'", str9, "70");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate7.minusYears((int) ' ');
        org.joda.time.LocalDate localDate17 = localDate7.minusYears((int) '#');
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfCentury();
        int int19 = property18.getMinimumValueOverall();
        org.joda.time.DurationField durationField20 = property18.getDurationField();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDate10.indexOf(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        int int18 = localDate10.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate14.toDateMidnight(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate14.minusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.LocalDate localDate25 = localDate4.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date28 = localDate27.toDate();
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.fromDateFields(date28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDate localDate31 = localDate29.minus(readablePeriod30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((-1));
        boolean boolean40 = localDate33.isEqual((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTime dateTime41 = localDate37.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology42);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate47 = localDate45.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate49 = localDate47.minusWeeks((-1));
        boolean boolean50 = localDate43.isEqual((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.LocalDate.Property property51 = localDate43.year();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate55 = localDate53.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate57 = localDate55.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDate55.toDateTimeAtCurrentTime(dateTimeZone58);
        int int60 = property51.getDifference((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(chronology61);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate66 = localDate64.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate68 = localDate66.minusWeeks((-1));
        boolean boolean69 = localDate62.isEqual((org.joda.time.ReadablePartial) localDate66);
        org.joda.time.DateTime dateTime70 = localDate66.toDateTimeAtMidnight();
        int int71 = property51.getDifference((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime72 = localDate37.toDateTime((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime73 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime74 = localDate14.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.LocalDate localDate76 = localDate14.minusWeeks(31);
        int int77 = localDate14.getDayOfYear();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDate localDate79 = new org.joda.time.LocalDate(chronology78);
        org.joda.time.LocalDate localDate81 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate83 = localDate81.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate85 = localDate83.minusWeeks((-1));
        boolean boolean86 = localDate79.isEqual((org.joda.time.ReadablePartial) localDate83);
        org.joda.time.LocalDate.Property property87 = localDate83.yearOfCentury();
        java.lang.String str88 = property87.getAsShortText();
        org.joda.time.LocalDate localDate90 = property87.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate92 = property87.addToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate94 = localDate92.withMonthOfYear(10);
        org.joda.time.LocalDate.Property property95 = localDate92.monthOfYear();
        int int96 = localDate14.compareTo((org.joda.time.ReadablePartial) localDate92);
        int[] intArray97 = localDate92.getValues();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2019 + "'", int60 == 2019);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertNotNull(localDate68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2019 + "'", int71 == 2019);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(localDate76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(localDate83);
        org.junit.Assert.assertNotNull(localDate85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "1" + "'", str88, "1");
        org.junit.Assert.assertNotNull(localDate90);
        org.junit.Assert.assertNotNull(localDate92);
        org.junit.Assert.assertNotNull(localDate94);
        org.junit.Assert.assertNotNull(property95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[2, 1, 1]");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate12 = property9.roundFloorCopy();
        org.joda.time.LocalDate localDate13 = property9.getLocalDate();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = localDate11.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfWeek();
        org.joda.time.LocalDate localDate16 = localDate11.minusWeeks((int) (byte) 0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((-1));
        boolean boolean25 = localDate18.isEqual((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.LocalDate localDate27 = localDate18.plusDays((int) (short) 100);
        org.joda.time.DateTime dateTime28 = localDate27.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate30 = localDate27.plusDays(32);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate33 = localDate27.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.LocalDate localDate35 = localDate27.minusDays(0);
        boolean boolean36 = localDate11.isBefore((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(chronology37);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate42 = localDate40.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate44 = localDate42.minusWeeks((-1));
        boolean boolean45 = localDate38.isEqual((org.joda.time.ReadablePartial) localDate42);
        org.joda.time.LocalDate localDate47 = localDate42.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property48 = localDate42.year();
        org.joda.time.LocalDate localDate50 = property48.setCopy((int) 'a');
        org.joda.time.LocalDate localDate52 = property48.addToCopy(48);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = localDate52.getFieldType(1);
        org.joda.time.LocalDate.Property property55 = localDate52.yearOfEra();
        boolean boolean56 = localDate11.equals((java.lang.Object) localDate52);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        java.lang.String str12 = localDate11.toString();
        int int13 = localDate11.getYearOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = localDate11.toString(dateTimeFormatter14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate11.toInterval(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0099-01-01" + "'", str12, "0099-01-01");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0099-01-01" + "'", str15, "0099-01-01");
        org.junit.Assert.assertNotNull(interval17);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addWrapFieldToCopy((int) (short) 10);
        java.util.Locale locale15 = null;
        java.lang.String str16 = property9.getAsShortText(locale15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) locale15);
        org.joda.time.LocalDate localDate19 = localDate17.withYear(1);
        org.joda.time.LocalDate.Property property20 = localDate17.dayOfWeek();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate25 = localDate22.withPeriodAdded(readablePeriod23, 0);
        org.joda.time.LocalDate localDate27 = localDate25.minusDays((int) (byte) 100);
        int int28 = localDate27.getMonthOfYear();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (byte) -1);
        org.joda.time.LocalTime localTime31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTime(localTime31);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        int int34 = property20.compareTo((org.joda.time.ReadableInstant) dateTime32);
        int int35 = property20.getMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) property20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) '4');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks((-1));
        boolean boolean12 = localDate5.isEqual((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate localDate14 = localDate5.plusDays((int) (short) 100);
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        boolean boolean24 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate.Property property25 = localDate21.yearOfCentury();
        java.lang.String str26 = property25.getAsShortText();
        org.joda.time.LocalDate localDate27 = property25.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        int int29 = localDate27.indexOf(dateTimeFieldType28);
        org.joda.time.LocalDate.Property property30 = localDate27.dayOfWeek();
        int int31 = localDate27.getEra();
        int int32 = property15.compareTo((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate34 = localDate27.withWeekyear((int) (short) -1);
        int int35 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate34);
        int int36 = localDate34.getDayOfWeek();
        org.joda.time.LocalDate.Property property37 = localDate34.dayOfMonth();
        org.joda.time.LocalDate localDate38 = property37.withMaximumValue();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1" + "'", str26, "1");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDate38);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate16 = property9.addWrapFieldToCopy((int) '#');
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((-1));
        boolean boolean25 = localDate18.isEqual((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.LocalDate.Property property26 = localDate18.year();
        int int27 = property26.get();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate31 = localDate29.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        int int33 = localDate31.indexOf(dateTimeFieldType32);
        org.joda.time.LocalTime localTime34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate31.toDateTime(localTime34, dateTimeZone35);
        long long37 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        int int38 = property9.getDifference((org.joda.time.ReadableInstant) dateTime36);
        int int39 = property9.getMinimumValueOverall();
        org.joda.time.DurationField durationField40 = property9.getLeapDurationField();
        int int41 = property9.getLeapAmount();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2020 + "'", int27 == 2020);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 2019L + "'", long37 == 2019L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(durationField40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate15.withWeekOfWeekyear(48);
        org.joda.time.LocalDate localDate19 = localDate17.minusMonths((-10024));
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date22 = localDate21.toDate();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.fromDateFields(date22);
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfCentury();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(chronology25);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate30 = localDate28.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate32 = localDate30.minusWeeks((-1));
        boolean boolean33 = localDate26.isEqual((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.LocalDate.Property property34 = localDate26.year();
        int int35 = property34.get();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        int int41 = localDate39.indexOf(dateTimeFieldType40);
        org.joda.time.LocalTime localTime42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDate39.toDateTime(localTime42, dateTimeZone43);
        long long45 = property34.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
        int int46 = property24.compareTo((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology47);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate52 = localDate50.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate54 = localDate52.minusWeeks((-1));
        boolean boolean55 = localDate48.isEqual((org.joda.time.ReadablePartial) localDate52);
        org.joda.time.LocalDate.Property property56 = localDate52.yearOfCentury();
        boolean boolean58 = property56.equals((java.lang.Object) 100L);
        java.lang.String str59 = property56.toString();
        org.joda.time.DateTimeField dateTimeField60 = property56.getField();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDate localDate65 = localDate62.withPeriodAdded(readablePeriod63, 0);
        org.joda.time.LocalDate localDate67 = localDate65.minusDays((int) (byte) 100);
        int int68 = localDate67.getMonthOfYear();
        int int69 = localDate67.getCenturyOfEra();
        int int70 = property56.compareTo((org.joda.time.ReadablePartial) localDate67);
        org.joda.time.LocalDate localDate72 = property56.setCopy("4");
        int int73 = property24.compareTo((org.joda.time.ReadablePartial) localDate72);
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date76 = localDate75.toDate();
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        org.joda.time.LocalDate localDate78 = localDate75.minus(readablePeriod77);
        org.joda.time.DateTime dateTime79 = localDate78.toDateTimeAtCurrentTime();
        boolean boolean80 = localDate72.equals((java.lang.Object) localDate78);
        boolean boolean81 = localDate17.equals((java.lang.Object) localDate78);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2020 + "'", int35 == 2020);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 2019L + "'", long45 == 2019L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Property[yearOfCentury]" + "'", str59, "Property[yearOfCentury]");
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 9 + "'", int68 == 9);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 19 + "'", int69 == 19);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        int int18 = property9.getDifference((org.joda.time.ReadableInstant) dateTime17);
        java.lang.String str19 = property9.getAsString();
        org.joda.time.LocalDate localDate21 = property9.addWrapFieldToCopy((int) ' ');
        org.joda.time.LocalDate localDate22 = property9.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDate localDate26 = localDate22.minusYears(330);
        int int27 = localDate26.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019 + "'", int18 == 2019);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020" + "'", str19, "2020");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate7.minusYears((int) ' ');
        int int16 = localDate7.getMonthOfYear();
        java.lang.String str17 = localDate7.toString();
        int int18 = localDate7.getDayOfYear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, 0);
        org.joda.time.LocalDate localDate6 = localDate4.withWeekyear(19);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(19, 1, (int) (short) 1, chronology12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.minus(readablePeriod15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = localDate16.getFieldType((int) (short) 0);
        int int19 = localDate4.get(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        int int11 = property9.get();
        long long12 = property9.remainder();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((-1));
        boolean boolean21 = localDate14.isEqual((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate28 = localDate26.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate30 = localDate28.minusWeeks((-1));
        boolean boolean31 = localDate24.isEqual((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate.Property property32 = localDate24.year();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate36 = localDate34.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate38 = localDate36.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDate36.toDateTimeAtCurrentTime(dateTimeZone39);
        int int41 = property32.getDifference((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology42);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate47 = localDate45.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate49 = localDate47.minusWeeks((-1));
        boolean boolean50 = localDate43.isEqual((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtMidnight();
        int int52 = property32.getDifference((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime53 = localDate18.toDateTime((org.joda.time.ReadableInstant) dateTime51);
        long long54 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalDate localDate56 = property9.addToCopy(20);
        java.lang.String str57 = property9.getAsText();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate61 = localDate59.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate63 = localDate61.minusWeeks((-1));
        org.joda.time.LocalDate.Property property64 = localDate63.monthOfYear();
        java.lang.String str65 = property64.toString();
        java.lang.String str66 = property64.getAsShortText();
        long long67 = property64.remainder();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date70 = localDate69.toDate();
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate74 = localDate72.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology75 = localDate72.getChronology();
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate((java.lang.Object) date70, chronology75);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.DateMidnight dateMidnight78 = localDate76.toDateMidnight(dateTimeZone77);
        long long79 = property64.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight78);
        int int80 = property9.getDifference((org.joda.time.ReadableInstant) dateMidnight78);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 28425600000L + "'", long12 == 28425600000L);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2019 + "'", int41 == 2019);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2019 + "'", int52 == 2019);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 2019L + "'", long54 == 2019L);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "2020" + "'", str57, "2020");
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Property[monthOfYear]" + "'", str65, "Property[monthOfYear]");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Jan" + "'", str66, "Jan");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 604800000L + "'", long67 == 604800000L);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(dateMidnight78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-23627L) + "'", long79 == (-23627L));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 50 + "'", int80 == 50);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((-1));
        boolean boolean9 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.LocalDate localDate11 = localDate2.plusDays((int) (short) 100);
        boolean boolean12 = localDate0.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate.Property property13 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date16 = localDate15.toDate();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate15.minus(readablePeriod17);
        org.joda.time.LocalDate localDate20 = localDate18.plusMonths(99);
        boolean boolean21 = localDate0.isEqual((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) localDate20, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate20.plusDays(31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = localDate20.withDayOfMonth(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate7.minusYears((int) ' ');
        org.joda.time.LocalDate localDate17 = localDate7.minusYears((int) '#');
        org.joda.time.LocalDate localDate19 = localDate7.withDayOfYear(330);
        org.joda.time.LocalDate.Property property20 = localDate7.weekOfWeekyear();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) localDate7);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, 0);
        org.joda.time.LocalDate localDate6 = localDate4.minusDays((int) (byte) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.year();
        org.joda.time.LocalDate localDate9 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        int int11 = localDate9.getValue(0);
        int int12 = localDate9.getYear();
        org.joda.time.LocalDate localDate14 = localDate9.withMonthOfYear((int) (short) 10);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        org.joda.time.LocalDate.Property property15 = localDate14.weekOfWeekyear();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfCentury(0);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate24 = localDate22.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate26 = localDate24.minusWeeks((-1));
        boolean boolean27 = localDate20.isEqual((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate localDate29 = localDate20.plusDays((int) (short) 100);
        boolean boolean30 = localDate18.isEqual((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate.Property property31 = localDate18.dayOfWeek();
        boolean boolean32 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate localDate34 = localDate17.minusMonths(1970);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate34.withPeriodAdded(readablePeriod35, 1968);
        org.joda.time.Chronology chronology38 = localDate34.getChronology();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(chronology38);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 292278993, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) dateTimeZone1, chronology5);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(chronology5);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate10 = localDate7.withPeriodAdded(readablePeriod8, (int) '4');
        org.joda.time.Interval interval11 = localDate10.toInterval();
        int int12 = localDate10.getWeekyear();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        boolean boolean10 = property9.isLeap();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        int int16 = localDate14.indexOf(dateTimeFieldType15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate20 = localDate18.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology21 = localDate18.getChronology();
        int int22 = localDate14.compareTo((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate.Property property23 = localDate14.weekOfWeekyear();
        int int24 = property9.compareTo((org.joda.time.ReadablePartial) localDate14);
        java.lang.Class<?> wildcardClass25 = localDate14.getClass();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = localDate12.toInterval(dateTimeZone13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = localDate12.isSupported(dateTimeFieldType15);
        int int17 = localDate12.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDate12.isSupported(dateTimeFieldType18);
        org.joda.time.DateTimeField[] dateTimeFieldArray20 = localDate12.getFields();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate12.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate28 = localDate26.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate30 = localDate28.minusWeeks((-1));
        boolean boolean31 = localDate24.isEqual((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate.Property property32 = localDate28.yearOfCentury();
        java.lang.String str33 = property32.getAsShortText();
        org.joda.time.LocalDate localDate34 = property32.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        int int36 = localDate34.indexOf(dateTimeFieldType35);
        org.joda.time.LocalDate.Property property37 = localDate34.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate34.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate34.withWeekOfWeekyear(52);
        org.joda.time.LocalDate localDate43 = localDate34.plusYears(0);
        boolean boolean44 = localDate12.isAfter((org.joda.time.ReadablePartial) localDate34);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        org.joda.time.DateTimeField dateTimeField11 = property9.getField();
        org.joda.time.LocalDate localDate13 = property9.setCopy(99);
        org.joda.time.LocalDate.Property property14 = localDate13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate13.toDateTimeAtCurrentTime(dateTimeZone15);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate18 = localDate16.minusWeeks((-1));
        boolean boolean19 = localDate12.isEqual((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate.Property property20 = localDate12.year();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate24 = localDate22.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate26 = localDate24.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtCurrentTime(dateTimeZone27);
        int int29 = property20.getDifference((org.joda.time.ReadableInstant) dateTime28);
        long long30 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalDate localDate31 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate32 = property9.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) property9, dateTimeZone33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2019 + "'", int29 == 2019);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate32);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate10 = localDate5.withYear((int) (short) 0);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate16 = localDate14.minusWeeks((-1));
        org.joda.time.LocalDate localDate18 = localDate14.minusMonths(25);
        org.joda.time.LocalDate localDate20 = localDate18.minusDays(1);
        org.joda.time.LocalDate localDate21 = localDate10.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate.Property property22 = localDate20.dayOfMonth();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property22.getAsShortText(locale23);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "30" + "'", str24, "30");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfEra();
        org.joda.time.LocalDate.Property property13 = localDate11.year();
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDate11.getFields();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate11.toDateTimeAtStartOfDay(dateTimeZone15);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 99, chronology6);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology16 = localDate13.getChronology();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 0, chronology16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 99, chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology16);
        int int20 = localDate9.compareTo((org.joda.time.ReadablePartial) localDate19);
        int int21 = localDate19.getDayOfWeek();
        org.joda.time.LocalDate.Property property22 = localDate19.dayOfYear();
        int int23 = localDate19.getYearOfCentury();
        int int24 = localDate19.getYear();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2020 + "'", int24 == 2020);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        int int18 = property9.getDifference((org.joda.time.ReadableInstant) dateTime17);
        java.lang.String str19 = property9.getAsString();
        java.lang.String str20 = property9.getAsString();
        int int21 = property9.getMinimumValueOverall();
        java.lang.String str22 = property9.getName();
        org.joda.time.LocalDate localDate24 = property9.addWrapFieldToCopy(2021);
        org.joda.time.LocalDate localDate25 = property9.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019 + "'", int18 == 2019);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020" + "'", str19, "2020");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020" + "'", str20, "2020");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-292275054) + "'", int21 == (-292275054));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "year" + "'", str22, "year");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        int int11 = property9.get();
        org.joda.time.DateTimeField dateTimeField12 = property9.getField();
        int int13 = property9.getMaximumValue();
        org.joda.time.DurationField durationField14 = property9.getDurationField();
        org.joda.time.DurationField durationField15 = property9.getDurationField();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 292278993 + "'", int13 == 292278993);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date4 = localDate3.toDate();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology9 = localDate6.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) date4, chronology9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, chronology9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (byte) 10, chronology9);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology9);
        int int14 = localDate13.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property15 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate17 = localDate13.withCenturyOfEra(1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate23 = localDate21.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate25 = localDate23.minusWeeks((-1));
        boolean boolean26 = localDate19.isEqual((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate.Property property27 = localDate23.yearOfCentury();
        java.lang.String str28 = property27.getAsShortText();
        org.joda.time.LocalDate localDate29 = property27.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        int int31 = localDate29.indexOf(dateTimeFieldType30);
        org.joda.time.LocalDate.Property property32 = localDate29.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate29.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate38 = localDate36.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology39 = localDate36.getChronology();
        int int40 = localDate36.getYearOfCentury();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate44 = localDate42.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        int int46 = localDate44.indexOf(dateTimeFieldType45);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate50 = localDate48.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology51 = localDate48.getChronology();
        int int52 = localDate44.compareTo((org.joda.time.ReadablePartial) localDate48);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateMidnight dateMidnight54 = localDate48.toDateMidnight(dateTimeZone53);
        org.joda.time.LocalDate localDate56 = localDate48.minusYears((int) ' ');
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate(chronology57);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate62 = localDate60.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate64 = localDate62.minusWeeks((-1));
        boolean boolean65 = localDate58.isEqual((org.joda.time.ReadablePartial) localDate62);
        org.joda.time.LocalDate localDate67 = localDate62.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property68 = localDate62.year();
        org.joda.time.LocalDate localDate70 = property68.setCopy((int) 'a');
        org.joda.time.LocalDate localDate72 = property68.addToCopy(48);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = localDate72.getFieldType(1);
        org.joda.time.LocalDate.Property property75 = localDate48.property(dateTimeFieldType74);
        org.joda.time.LocalDate.Property property76 = localDate36.property(dateTimeFieldType74);
        org.joda.time.LocalDate.Property property77 = localDate29.property(dateTimeFieldType74);
        int int78 = localDate13.indexOf(dateTimeFieldType74);
        org.joda.time.DurationFieldType durationFieldType79 = null;
        boolean boolean80 = localDate13.isSupported(durationFieldType79);
        int int81 = localDate13.getDayOfYear();
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1" + "'", str28, "1");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 70 + "'", int40 == 70);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertNotNull(dateTimeFieldType74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 330 + "'", int81 == 330);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 99, chronology6);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology16 = localDate13.getChronology();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 0, chronology16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 99, chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology16);
        int int20 = localDate9.compareTo((org.joda.time.ReadablePartial) localDate19);
        int int21 = localDate19.getDayOfWeek();
        org.joda.time.LocalDate.Property property22 = localDate19.dayOfYear();
        org.joda.time.LocalDate.Property property23 = localDate19.dayOfWeek();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.plus(readablePeriod16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology7 = localDate4.getChronology();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) date2, chronology7);
        org.joda.time.LocalDate.Property property9 = localDate8.weekOfWeekyear();
        int int10 = property9.get();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        int int2 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDate.Property property3 = localDate1.yearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate10 = localDate5.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property11 = localDate5.weekyear();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks((-1));
        boolean boolean10 = localDate3.isEqual((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property11 = localDate7.yearOfCentury();
        java.lang.String str12 = property11.getAsShortText();
        org.joda.time.LocalDate localDate14 = property11.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate16 = property11.addToCopy((int) (short) 1);
        org.joda.time.LocalDate.Property property17 = localDate16.weekOfWeekyear();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfCentury(0);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate26 = localDate24.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate28 = localDate26.minusWeeks((-1));
        boolean boolean29 = localDate22.isEqual((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.LocalDate localDate31 = localDate22.plusDays((int) (short) 100);
        boolean boolean32 = localDate20.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property33 = localDate20.dayOfWeek();
        boolean boolean34 = localDate19.isEqual((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate36 = localDate19.minusMonths(1970);
        boolean boolean37 = localDate1.isBefore((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date41 = localDate40.toDate();
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.fromDateFields(date41);
        org.joda.time.LocalDate localDate44 = localDate42.withWeekyear(52);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date47 = localDate46.toDate();
        java.util.Locale locale49 = null;
        java.lang.String str50 = localDate46.toString("2020", locale49);
        org.joda.time.Chronology chronology51 = localDate46.getChronology();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((java.lang.Object) localDate42, chronology51);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 49, chronology51);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((java.lang.Object) localDate19, chronology51);
        org.joda.time.LocalDate localDate55 = org.joda.time.LocalDate.now(chronology51);
        org.joda.time.LocalDate.Property property56 = localDate55.era();
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2020" + "'", str50, "2020");
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(property56);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate16 = localDate14.withMonthOfYear(10);
        int int17 = localDate14.getWeekyear();
        org.joda.time.LocalDate localDate19 = localDate14.withYear(13);
        int[] intArray20 = localDate14.getValues();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate26 = localDate24.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate28 = localDate26.minusWeeks((-1));
        boolean boolean29 = localDate22.isEqual((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.LocalDate.Property property30 = localDate26.yearOfCentury();
        java.lang.String str31 = property30.getAsShortText();
        org.joda.time.LocalDate localDate32 = property30.withMaximumValue();
        org.joda.time.LocalDate localDate34 = localDate32.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDate localDate36 = localDate34.minusMonths((int) (byte) 1);
        org.joda.time.LocalDate localDate38 = localDate36.withWeekOfWeekyear(48);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date41 = localDate40.toDate();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate45 = localDate43.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology46 = localDate43.getChronology();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) date41, chronology46);
        java.util.Date date48 = localDate47.toDate();
        org.joda.time.LocalDate.Property property49 = localDate47.era();
        org.joda.time.LocalDate.Property property50 = localDate47.dayOfMonth();
        boolean boolean51 = localDate38.equals((java.lang.Object) property50);
        int int52 = localDate14.compareTo((org.joda.time.ReadablePartial) localDate38);
        java.util.Locale locale54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = localDate38.toString("Thursday", locale54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[2, 1, 1]");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1" + "'", str31, "1");
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        int int12 = localDate7.getDayOfYear();
        java.lang.String str13 = localDate7.toString();
        java.lang.String str15 = localDate7.toString("1");
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = localDate7.toDateMidnight(dateTimeZone16);
        int[] intArray18 = localDate7.getValues();
        org.joda.time.LocalDate.Property property19 = localDate7.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = property19.setCopy("4");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"4\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        int int5 = localDate1.getYearOfCentury();
        org.joda.time.LocalDate localDate7 = localDate1.minusDays((int) ' ');
        int[] intArray8 = localDate1.getValues();
        org.joda.time.DateTime dateTime9 = localDate1.toDateTimeAtStartOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localDate1.toString(dateTimeFormatter10);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology18 = localDate15.getChronology();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 4, chronology18);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 3, chronology18);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) localDate1, chronology18);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date4 = localDate3.toDate();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology9 = localDate6.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) date4, chronology9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, chronology9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (byte) 10, chronology9);
        org.joda.time.Interval interval13 = localDate12.toInterval();
        org.joda.time.LocalDate localDate15 = localDate12.withWeekOfWeekyear(12);
        java.lang.String str16 = localDate15.toString();
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-03-19" + "'", str16, "1970-03-19");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology7 = localDate4.getChronology();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 0, chronology7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(0L, chronology7);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(chronology7);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 70, chronology7);
        org.joda.time.LocalDate localDate13 = localDate11.withWeekyear(27);
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate13.toDateTime(localTime14, dateTimeZone15);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        boolean boolean11 = property9.equals((java.lang.Object) 100L);
        java.lang.String str12 = property9.toString();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, 0);
        org.joda.time.LocalDate localDate20 = localDate18.minusDays((int) (byte) 100);
        int int21 = localDate20.getMonthOfYear();
        int int22 = localDate20.getCenturyOfEra();
        int int23 = property9.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate25 = property9.setCopy("4");
        org.joda.time.LocalDate localDate26 = property9.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[yearOfCentury]" + "'", str12, "Property[yearOfCentury]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        int int11 = property9.get();
        org.joda.time.DateTimeField dateTimeField12 = property9.getField();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((-1));
        boolean boolean21 = localDate14.isEqual((org.joda.time.ReadablePartial) localDate18);
        int int22 = localDate18.getYearOfEra();
        int int23 = localDate18.size();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks((-1));
        boolean boolean32 = localDate25.isEqual((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate.Property property33 = localDate29.yearOfCentury();
        java.lang.String str34 = property33.getAsShortText();
        org.joda.time.LocalDate localDate36 = property33.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate38 = property33.addToCopy((int) (short) 1);
        int int39 = property33.getLeapAmount();
        boolean boolean40 = localDate18.equals((java.lang.Object) property33);
        int int41 = localDate18.getYearOfEra();
        org.joda.time.DateMidnight dateMidnight42 = localDate18.toDateMidnight();
        long long43 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight42);
        boolean boolean44 = property9.isLeap();
        org.joda.time.LocalDate localDate45 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate46 = property9.roundHalfEvenCopy();
        org.joda.time.DurationField durationField47 = property9.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1" + "'", str34, "1");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2019L + "'", long43 == 2019L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(durationField47);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        int int5 = localDate1.getYearOfCentury();
        org.joda.time.LocalDate localDate7 = localDate1.minusDays((int) ' ');
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date10 = localDate9.toDate();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.fromDateFields(date10);
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((-1));
        boolean boolean21 = localDate14.isEqual((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate.Property property22 = localDate14.year();
        int int23 = property22.get();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate27 = localDate25.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        int int29 = localDate27.indexOf(dateTimeFieldType28);
        org.joda.time.LocalTime localTime30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate27.toDateTime(localTime30, dateTimeZone31);
        long long33 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime32);
        int int34 = property12.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.LocalDate localDate35 = property12.withMinimumValue();
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfEra((int) ' ');
        org.joda.time.LocalDate localDate38 = localDate7.withFields((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.LocalDate localDate40 = localDate35.withYearOfEra((int) (byte) 1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2020 + "'", int23 == 2020);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2019L + "'", long33 == 2019L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        int int11 = property9.get();
        long long12 = property9.remainder();
        java.util.Locale locale13 = null;
        int int14 = property9.getMaximumShortTextLength(locale13);
        java.lang.String str15 = property9.toString();
        org.joda.time.LocalDate localDate16 = property9.getLocalDate();
        org.joda.time.LocalDate.Property property17 = localDate16.dayOfWeek();
        org.joda.time.LocalDate localDate19 = property17.addToCopy(0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 28425600000L + "'", long12 == 28425600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[year]" + "'", str15, "Property[year]");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((-1));
        boolean boolean9 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.LocalDate localDate11 = localDate2.plusDays((int) (short) 100);
        boolean boolean12 = localDate0.isEqual((org.joda.time.ReadablePartial) localDate11);
        int int13 = localDate11.getWeekOfWeekyear();
        int int14 = localDate11.getYear();
        org.joda.time.LocalTime localTime15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate11.toDateTime(localTime15, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate11.minusYears(9);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2021 + "'", int14 == 2021);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = localDate11.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfWeek();
        int[] intArray15 = localDate11.getValues();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, 0);
        org.joda.time.LocalDate localDate22 = localDate20.minusDays((int) (byte) 100);
        int int23 = localDate11.compareTo((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.LocalDate.Property property24 = localDate22.dayOfWeek();
        org.joda.time.LocalDate localDate25 = property24.withMaximumValue();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[99, 1, 1]");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((-1));
        boolean boolean14 = localDate7.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        boolean boolean24 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate.Property property25 = localDate17.year();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtCurrentTime(dateTimeZone32);
        int int34 = property25.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate40 = localDate38.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate42 = localDate40.minusWeeks((-1));
        boolean boolean43 = localDate36.isEqual((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.DateTime dateTime44 = localDate40.toDateTimeAtMidnight();
        int int45 = property25.getDifference((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime47 = localDate5.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalDate.Property property48 = localDate5.dayOfWeek();
        org.joda.time.LocalDate.Property property49 = localDate5.weekyear();
        org.joda.time.LocalDate localDate51 = localDate5.plusYears((int) (byte) 10);
        org.joda.time.LocalDate localDate53 = localDate51.withYearOfCentury(3);
        org.joda.time.LocalDate.Property property54 = localDate53.centuryOfEra();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2019 + "'", int34 == 2019);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2019 + "'", int45 == 2019);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(property54);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDate10.indexOf(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        int int18 = localDate10.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate14.toDateMidnight(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate14.minusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.LocalDate localDate25 = localDate4.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(chronology26);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate31 = localDate29.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate33 = localDate31.minusWeeks((-1));
        boolean boolean34 = localDate27.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property35 = localDate31.yearOfCentury();
        java.lang.String str36 = property35.getAsShortText();
        org.joda.time.LocalDate localDate38 = property35.addWrapFieldToCopy(0);
        boolean boolean39 = localDate4.isAfter((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.LocalDate.Property property40 = localDate38.era();
        int int41 = property40.getMaximumValue();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1" + "'", str36, "1");
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, 0);
        org.joda.time.LocalDate localDate6 = localDate4.minusDays((int) (byte) 100);
        int int7 = localDate6.getMonthOfYear();
        org.joda.time.LocalDate.Property property8 = localDate6.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate.Property property13 = localDate12.weekOfWeekyear();
        int int14 = property13.getMinimumValue();
        org.joda.time.LocalDate localDate16 = property13.addWrapFieldToCopy(53);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks((-1));
        boolean boolean13 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate.Property property14 = localDate6.year();
        int int15 = property14.get();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = localDate19.indexOf(dateTimeFieldType20);
        org.joda.time.LocalTime localTime22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate19.toDateTime(localTime22, dateTimeZone23);
        long long25 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        int int26 = property4.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDate localDate28 = property4.addWrapFieldToCopy((-10));
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2020 + "'", int15 == 2020);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2019L + "'", long25 == 2019L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        org.joda.time.DateTimeField dateTimeField11 = property9.getField();
        int int12 = property9.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        org.joda.time.LocalDate localDate14 = property9.withMinimumValue();
        org.joda.time.DurationField durationField15 = property9.getDurationField();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292278993 + "'", int12 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property12 = localDate3.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) localDate3, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.plusMonths(1939);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        int int15 = property9.getLeapAmount();
        org.joda.time.DurationField durationField16 = property9.getDurationField();
        org.joda.time.LocalDate localDate18 = property9.setCopy(2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((-1));
        boolean boolean9 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.LocalDate localDate11 = localDate2.plusDays((int) (short) 100);
        boolean boolean12 = localDate0.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate.Property property13 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        int int16 = property13.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property13.getFieldType();
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = localDate11.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfWeek();
        org.joda.time.LocalDate localDate16 = localDate11.minusWeeks((int) (byte) 0);
        java.lang.String str18 = localDate11.toString("2020-11-25");
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(chronology24);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(19, 1, (int) (short) 1, chronology24);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate26.minus(readablePeriod27);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDate28.getFieldType((int) (short) 0);
        org.joda.time.LocalDate.Property property31 = localDate11.property(dateTimeFieldType30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((-1));
        boolean boolean40 = localDate33.isEqual((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate.Property property41 = localDate37.yearOfCentury();
        java.lang.String str42 = property41.getAsShortText();
        org.joda.time.LocalDate localDate44 = property41.addWrapFieldToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = localDate44.toInterval(dateTimeZone45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        boolean boolean48 = localDate44.isSupported(dateTimeFieldType47);
        int int49 = localDate44.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        boolean boolean51 = localDate44.isSupported(dateTimeFieldType50);
        org.joda.time.DateTimeField[] dateTimeFieldArray52 = localDate44.getFields();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate44.toDateTimeAtStartOfDay(dateTimeZone53);
        int int55 = property31.getDifference((org.joda.time.ReadableInstant) dateTime54);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25" + "'", str18, "2020-11-25");
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1" + "'", str42, "1");
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 98 + "'", int55 == 98);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        org.joda.time.LocalDate.Property property15 = localDate14.weekOfWeekyear();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfCentury(0);
        int int18 = localDate17.getWeekyear();
        org.joda.time.LocalDate.Property property19 = localDate17.weekyear();
        java.lang.String str20 = property19.getName();
        int int21 = property19.get();
        int int22 = property19.getLeapAmount();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "weekyear" + "'", str20, "weekyear");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        int int7 = localDate4.getMonthOfYear();
        org.joda.time.LocalDate localDate9 = localDate4.withWeekyear(0);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.LocalDate localDate16 = localDate14.minusDays((int) (byte) 100);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.year();
        org.joda.time.LocalDate localDate19 = localDate14.withFields((org.joda.time.ReadablePartial) localDate17);
        int int20 = localDate14.getEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localDate14.getFieldTypes();
        boolean boolean22 = localDate4.equals((java.lang.Object) dateTimeFieldTypeArray21);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addWrapFieldToCopy((int) (short) 10);
        java.util.Locale locale15 = null;
        java.lang.String str16 = property9.getAsShortText(locale15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) locale15);
        org.joda.time.LocalDate localDate19 = localDate17.withYear(1);
        org.joda.time.LocalDate.Property property20 = localDate17.centuryOfEra();
        java.util.Date date21 = localDate17.toDate();
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.fromDateFields(date21);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((-1));
        boolean boolean14 = localDate7.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        boolean boolean24 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate.Property property25 = localDate17.year();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtCurrentTime(dateTimeZone32);
        int int34 = property25.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate40 = localDate38.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate42 = localDate40.minusWeeks((-1));
        boolean boolean43 = localDate36.isEqual((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.DateTime dateTime44 = localDate40.toDateTimeAtMidnight();
        int int45 = property25.getDifference((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime47 = localDate5.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalDate.Property property48 = localDate5.dayOfWeek();
        org.joda.time.LocalDate.Property property49 = localDate5.weekyear();
        int int50 = property49.getMinimumValueOverall();
        java.util.Locale locale51 = null;
        int int52 = property49.getMaximumShortTextLength(locale51);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2019 + "'", int34 == 2019);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2019 + "'", int45 == 2019);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-292275054) + "'", int50 == (-292275054));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((-1));
        boolean boolean9 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.LocalDate localDate11 = localDate2.plusDays((int) (short) 100);
        boolean boolean12 = localDate0.isEqual((org.joda.time.ReadablePartial) localDate11);
        int int13 = localDate11.getWeekOfWeekyear();
        int int14 = localDate11.getYear();
        org.joda.time.LocalDate.Property property15 = localDate11.monthOfYear();
        int int16 = property15.get();
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2021 + "'", int14 == 2021);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        int int13 = property9.getMaximumValue();
        org.joda.time.LocalDate localDate14 = property9.roundHalfEvenCopy();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        boolean boolean16 = localDate14.isSupported(durationFieldType15);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        org.joda.time.LocalDate.Property property15 = localDate14.weekOfWeekyear();
        org.joda.time.LocalDate localDate16 = property15.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        int int7 = property4.getMinimumValue();
        org.joda.time.LocalDate localDate8 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate9 = property4.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField10 = property4.getField();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }
}

