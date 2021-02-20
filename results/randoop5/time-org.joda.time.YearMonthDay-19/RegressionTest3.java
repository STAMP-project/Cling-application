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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusMonths((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.withYear(25);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minus(readablePeriod12);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay13.plusMonths((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay15.withYear((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.minusYears((int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay17.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property22 = yearMonthDay21.monthOfYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay8 = property2.setCopy((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay9 = property2.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale13 = null;
        java.lang.String str14 = yearMonthDay11.toString("1970-01-01", locale13);
        java.lang.String str15 = yearMonthDay11.toString();
        boolean boolean16 = yearMonthDay9.isBefore((org.joda.time.ReadablePartial) yearMonthDay11);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay9.toDateMidnight(dateTimeZone17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        int int3 = property2.getMaximumValue();
        java.lang.String str4 = property2.getAsText();
        org.joda.time.YearMonthDay yearMonthDay5 = property2.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.plusMonths((int) (byte) 0);
        org.joda.time.DateTime dateTime8 = yearMonthDay7.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTime8);
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
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTimeAtCurrentTime(dateTimeZone30);
        int int32 = property14.compareTo((org.joda.time.ReadableInstant) dateTime31);
        java.lang.Class<?> wildcardClass33 = property14.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay4 = property2.addToCopy((int) '4');
        int int5 = property2.getMinimumValue();
        java.lang.String str6 = property2.getAsText();
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumTextLength(locale7);
        int int9 = property2.getMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay11 = property2.setCopy("22");
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.plusMonths(25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay13.withPeriodAdded(readablePeriod16, 2);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay18.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = yearMonthDay18.toDateTimeAtMidnight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay3.toDateTime(timeOfDay14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        int int17 = yearMonthDay1.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = yearMonthDay19.indexOf(dateTimeFieldType20);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight24 = yearMonthDay19.toDateMidnight();
        java.lang.String str25 = yearMonthDay19.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = yearMonthDay19.getFields();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay28.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay30 = property29.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField31 = property29.getField();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property29.getAsText(locale32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property29.getFieldType();
        boolean boolean35 = yearMonthDay19.isSupported(dateTimeFieldType34);
        org.joda.time.YearMonthDay.Property property36 = yearMonthDay1.property(dateTimeFieldType34);
        int int37 = property36.getMinimumValue();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay1.withPeriodAdded(readablePeriod4, (int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonthDay8.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay8.minusYears((int) 'a');
        org.joda.time.DateTime dateTime13 = yearMonthDay8.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay8.withPeriodAdded(readablePeriod14, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay16.withDayOfMonth(1);
        boolean boolean20 = yearMonthDay16.equals((java.lang.Object) (short) -1);
        org.joda.time.LocalDate localDate21 = yearMonthDay16.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = yearMonthDay23.indexOf(dateTimeFieldType24);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay23.minusYears((int) 'a');
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay23.withPeriodAdded(readablePeriod29, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay31.plusMonths(1);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay33.minusDays(10);
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        int int39 = yearMonthDay37.indexOf(dateTimeFieldType38);
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay37.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight42 = yearMonthDay37.toDateMidnight();
        java.lang.String str43 = yearMonthDay37.toString();
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay45.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay47 = property46.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField48 = property46.getField();
        java.util.Locale locale49 = null;
        java.lang.String str50 = property46.getAsText(locale49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property46.getFieldType();
        int int52 = yearMonthDay37.get(dateTimeFieldType51);
        int int53 = yearMonthDay37.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        int int57 = yearMonthDay55.indexOf(dateTimeFieldType56);
        org.joda.time.YearMonthDay yearMonthDay59 = yearMonthDay55.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight60 = yearMonthDay55.toDateMidnight();
        java.lang.String str61 = yearMonthDay55.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray62 = yearMonthDay55.getFields();
        org.joda.time.YearMonthDay yearMonthDay64 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property65 = yearMonthDay64.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay66 = property65.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField67 = property65.getField();
        java.util.Locale locale68 = null;
        java.lang.String str69 = property65.getAsText(locale68);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = property65.getFieldType();
        boolean boolean71 = yearMonthDay55.isSupported(dateTimeFieldType70);
        org.joda.time.YearMonthDay.Property property72 = yearMonthDay37.property(dateTimeFieldType70);
        int int73 = yearMonthDay33.indexOf(dateTimeFieldType70);
        int int74 = localDate21.indexOf(dateTimeFieldType70);
        boolean boolean75 = yearMonthDay1.isBefore((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay1.plusDays((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.YearMonthDay yearMonthDay79 = yearMonthDay1.plus(readablePeriod78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1" + "'", str50, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay59);
        org.junit.Assert.assertNotNull(dateMidnight60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1970-01-01" + "'", str61, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(yearMonthDay66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1" + "'", str69, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(yearMonthDay77);
        org.junit.Assert.assertNotNull(yearMonthDay79);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        java.lang.String str14 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Property[dayOfMonth]" + "'", str14, "Property[dayOfMonth]");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        org.joda.time.YearMonthDay yearMonthDay84 = yearMonthDay65.plusMonths(9);
        int int85 = yearMonthDay84.getMonthOfYear();
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
        org.junit.Assert.assertNotNull(yearMonthDay84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
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
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        java.lang.String str10 = property7.getAsText();
        java.lang.String str11 = property7.getAsText();
        java.util.Locale locale12 = null;
        int int13 = property7.getMaximumTextLength(locale12);
        org.joda.time.DurationField durationField14 = property7.getRangeDurationField();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "January" + "'", str9, "January");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "January" + "'", str10, "January");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "January" + "'", str11, "January");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        int int7 = yearMonthDay5.indexOf(dateTimeFieldType6);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay5.minusYears((int) 'a');
        org.joda.time.DateTime dateTime10 = yearMonthDay5.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay5.withPeriodAdded(readablePeriod11, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay13.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay15.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology18 = yearMonthDay17.getChronology();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) -1, chronology18);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(chronology18);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(chronology18);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay2.withChronologyRetainFields(chronology18);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) 2, chronology18);
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(chronology18);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Interval interval26 = yearMonthDay24.toInterval(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(interval26);
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
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.lang.String str8 = property7.getAsString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        java.lang.String str5 = yearMonthDay1.toString();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusMonths((int) '#');
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay1.toDateTime(timeOfDay8, dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay6 = property2.setCopy(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = yearMonthDay5.toDateMidnight(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = yearMonthDay9.getFieldTypes();
        int int11 = yearMonthDay5.compareTo((org.joda.time.ReadablePartial) yearMonthDay9);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = yearMonthDay13.toString("1970-01-01", locale15);
        java.lang.String str17 = yearMonthDay13.toString();
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay13.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate20 = yearMonthDay13.toLocalDate();
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
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay13.withChronologyRetainFields(chronology36);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay(chronology36);
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay9.withChronologyRetainFields(chronology36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(yearMonthDay40);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        int int18 = property2.getMinimumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay20 = property2.addWrapFieldToCopy(2);
        java.lang.String str21 = property2.getAsText();
        java.lang.String str22 = property2.getAsShortText();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property2.getAsText(locale23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property2.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
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
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = yearMonthDay9.toString(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = yearMonthDay3.toString(dateTimeFormatter4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = yearMonthDay3.toDateMidnight(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        int int11 = yearMonthDay9.indexOf(dateTimeFieldType10);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight14 = yearMonthDay9.toDateMidnight();
        java.lang.String str15 = yearMonthDay9.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = yearMonthDay9.getFields();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay18.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay20 = property19.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        java.util.Locale locale22 = null;
        java.lang.String str23 = property19.getAsText(locale22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property19.getFieldType();
        boolean boolean25 = yearMonthDay9.isSupported(dateTimeFieldType24);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay9.plusMonths((int) (short) 0);
        org.joda.time.YearMonthDay.Property property28 = yearMonthDay9.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay9.plusDays((int) (short) -1);
        boolean boolean31 = yearMonthDay3.isBefore((org.joda.time.ReadablePartial) yearMonthDay9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
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
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.withDayOfMonth((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay13.year();
        org.joda.time.YearMonthDay yearMonthDay15 = property14.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        int int19 = yearMonthDay17.indexOf(dateTimeFieldType18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay17.minusYears((int) 'a');
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay17.plusYears((int) '4');
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay17.minusDays((int) (short) 1);
        int int26 = property14.compareTo((org.joda.time.ReadablePartial) yearMonthDay17);
        java.lang.String str27 = property14.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "year" + "'", str27, "year");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        int int17 = property16.getMaximumValue();
        java.lang.String str18 = property16.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property16.getFieldType();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property16.getAsShortText(locale20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Jan" + "'", str18, "Jan");
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Jan" + "'", str21, "Jan");
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
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        int int31 = yearMonthDay29.indexOf(dateTimeFieldType30);
        org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay29.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight34 = yearMonthDay29.toDateMidnight();
        java.lang.String str35 = yearMonthDay29.toString();
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property38 = yearMonthDay37.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay39 = property38.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField40 = property38.getField();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property38.getAsText(locale41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property38.getFieldType();
        int int44 = yearMonthDay29.get(dateTimeFieldType43);
        int int45 = yearMonthDay9.indexOf(dateTimeFieldType43);
        int int46 = yearMonthDay9.getYear();
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay9.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.Interval interval50 = yearMonthDay9.toInterval(dateTimeZone49);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1" + "'", str42, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1970 + "'", int46 == 1970);
        org.junit.Assert.assertNotNull(yearMonthDay48);
        org.junit.Assert.assertNotNull(interval50);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.plusYears((int) '4');
        int int8 = yearMonthDay1.getMonthOfYear();
        org.joda.time.Chronology chronology9 = yearMonthDay1.getChronology();
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay1.plusMonths(9);
        org.joda.time.LocalDate localDate12 = yearMonthDay11.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = yearMonthDay11.toInterval(dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay16.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay18 = property17.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property17.getAsText(locale20);
        org.joda.time.YearMonthDay yearMonthDay22 = property17.withMinimumValue();
        int int23 = property17.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property17.getFieldType();
        int int25 = yearMonthDay11.get(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        int int29 = yearMonthDay27.indexOf(dateTimeFieldType28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay27.minusYears((int) 'a');
        org.joda.time.DateTime dateTime32 = yearMonthDay27.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay27.withPeriodAdded(readablePeriod33, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay35.withDayOfMonth(1);
        boolean boolean39 = yearMonthDay35.equals((java.lang.Object) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay35.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime42 = yearMonthDay35.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property45 = yearMonthDay44.dayOfMonth();
        boolean boolean47 = property45.equals((java.lang.Object) '4');
        java.lang.String str48 = property45.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property45.getFieldType();
        boolean boolean50 = yearMonthDay35.equals((java.lang.Object) property45);
        org.joda.time.DateTimeField dateTimeField51 = property45.getField();
        java.util.Locale locale52 = null;
        int int53 = property45.getMaximumShortTextLength(locale52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property45.getFieldType();
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay17.withField(dateTimeFieldType54, (int) (byte) 10);
        int int57 = yearMonthDay56.getYear();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1" + "'", str48, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(yearMonthDay56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        java.util.Locale locale11 = null;
        java.lang.String str12 = property2.getAsText(locale11);
        int int13 = property2.getMinimumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay14 = property2.getYearMonthDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay14);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale4 = null;
        java.lang.String str5 = yearMonthDay2.toString("1970-01-01", locale4);
        java.lang.String str6 = yearMonthDay2.toString();
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay2.minusYears((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay2.minusMonths((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = yearMonthDay13.toString("1970-01-01", locale15);
        java.lang.String str17 = yearMonthDay13.toString();
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay13.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate20 = yearMonthDay13.toLocalDate();
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
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay13.withChronologyRetainFields(chronology36);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (byte) -1, chronology36);
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay2.withChronologyRetainFields(chronology36);
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay((long) (byte) 0, chronology36);
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay41.minusYears(1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(yearMonthDay40);
        org.junit.Assert.assertNotNull(yearMonthDay43);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMinimumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay10 = property2.addToCopy(9);
        java.lang.Object obj11 = null;
        boolean boolean12 = property2.equals(obj11);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay15 = property2.setCopy("Jan", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Jan\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        org.joda.time.YearMonthDay yearMonthDay9 = property2.addToCopy((int) (short) 100);
        java.lang.String str10 = property2.getAsText();
        java.lang.String str11 = property2.getAsShortText();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property2.getAsShortText(locale12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        int int3 = property2.getMaximumValue();
        int int4 = property2.getMaximumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay6 = property2.addWrapFieldToCopy((int) '#');
        org.joda.time.YearMonthDay yearMonthDay8 = property2.addWrapFieldToCopy(10);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusYears((int) (byte) -1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        java.lang.String str7 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.lang.Object obj0 = null;
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
        int int15 = yearMonthDay14.getMonthOfYear();
        org.joda.time.Chronology chronology16 = yearMonthDay14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(obj0, chronology16);
        int[] intArray18 = yearMonthDay17.getValues();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[2020, 11, 25]");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        org.joda.time.DateTime dateTime14 = yearMonthDay9.toDateTimeAtMidnight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        int int5 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale10 = null;
        java.lang.String str11 = yearMonthDay8.toString("1970-01-01", locale10);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        java.lang.String str15 = property12.toString();
        org.joda.time.YearMonthDay yearMonthDay17 = property12.addWrapFieldToCopy(1969);
        boolean boolean18 = property2.equals((java.lang.Object) 1969);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[dayOfMonth]" + "'", str15, "Property[dayOfMonth]");
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.dayOfMonth();
        org.joda.time.Interval interval6 = yearMonthDay1.toInterval();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = yearMonthDay1.toInterval(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        int int16 = yearMonthDay14.indexOf(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay14.minusYears((int) 'a');
        org.joda.time.DateTime dateTime19 = yearMonthDay14.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay14.withPeriodAdded(readablePeriod20, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay22.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay24.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology27 = yearMonthDay26.getChronology();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) -1, chronology27);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(chronology27);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(chronology27);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay11.withChronologyRetainFields(chronology27);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) 2, chronology27);
        int int33 = yearMonthDay1.compareTo((org.joda.time.ReadablePartial) yearMonthDay32);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay1.plusMonths(10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay35);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay13.minusYears((-1));
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.Interval interval40 = yearMonthDay38.toInterval(dateTimeZone39);
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
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(interval40);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale46 = null;
        java.lang.String str47 = yearMonthDay44.toString("1970-01-01", locale46);
        java.lang.String str48 = yearMonthDay44.toString();
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay44.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate51 = yearMonthDay44.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = null;
        int int56 = yearMonthDay54.indexOf(dateTimeFieldType55);
        org.joda.time.YearMonthDay yearMonthDay58 = yearMonthDay54.minusYears((int) 'a');
        org.joda.time.DateTime dateTime59 = yearMonthDay54.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.YearMonthDay yearMonthDay62 = yearMonthDay54.withPeriodAdded(readablePeriod60, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay64 = yearMonthDay62.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay66 = yearMonthDay64.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology67 = yearMonthDay66.getChronology();
        org.joda.time.YearMonthDay yearMonthDay68 = new org.joda.time.YearMonthDay((long) (short) -1, chronology67);
        org.joda.time.YearMonthDay yearMonthDay69 = yearMonthDay44.withChronologyRetainFields(chronology67);
        org.joda.time.YearMonthDay yearMonthDay70 = new org.joda.time.YearMonthDay((long) 10, chronology67);
        boolean boolean71 = yearMonthDay1.equals((java.lang.Object) 10);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.Interval interval73 = yearMonthDay1.toInterval(dateTimeZone72);
        org.joda.time.TimeOfDay timeOfDay74 = null;
        org.joda.time.DateTime dateTime75 = yearMonthDay1.toDateTime(timeOfDay74);
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay1.withYear((int) (byte) 100);
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01" + "'", str47, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-01-01" + "'", str48, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(yearMonthDay62);
        org.junit.Assert.assertNotNull(yearMonthDay64);
        org.junit.Assert.assertNotNull(yearMonthDay66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(yearMonthDay69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(yearMonthDay77);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        int int17 = yearMonthDay1.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = yearMonthDay19.indexOf(dateTimeFieldType20);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight24 = yearMonthDay19.toDateMidnight();
        java.lang.String str25 = yearMonthDay19.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = yearMonthDay19.getFields();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay28.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay30 = property29.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField31 = property29.getField();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property29.getAsText(locale32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property29.getFieldType();
        boolean boolean35 = yearMonthDay19.isSupported(dateTimeFieldType34);
        org.joda.time.YearMonthDay.Property property36 = yearMonthDay1.property(dateTimeFieldType34);
        java.lang.String str37 = property36.getName();
        org.joda.time.YearMonthDay yearMonthDay39 = property36.addToCopy(3);
        org.joda.time.DurationField durationField40 = property36.getDurationField();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "dayOfMonth" + "'", str37, "dayOfMonth");
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(durationField40);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay14.plus(readablePeriod19);
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
        org.junit.Assert.assertNotNull(yearMonthDay20);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(chronology17);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.plusYears((int) (byte) 10);
        org.joda.time.DateMidnight dateMidnight22 = yearMonthDay19.toDateMidnight();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay19.minus(readablePeriod23);
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
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(yearMonthDay24);
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
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property7.getDurationField();
        int int11 = property7.getMinimumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay13 = property7.addToCopy((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay14 = property7.withMaximumValue();
        java.lang.Class<?> wildcardClass15 = yearMonthDay14.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        java.lang.String str32 = yearMonthDay13.toString("1970-01-02");
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay13.plusMonths(100);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-02" + "'", str32, "1970-01-02");
        org.junit.Assert.assertNotNull(yearMonthDay34);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = yearMonthDay18.getFields();
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay18.withYear(0);
        int int22 = yearMonthDay21.size();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay21.minus(readablePeriod23);
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
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(yearMonthDay24);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale34 = null;
        java.lang.String str35 = yearMonthDay32.toString("1970-01-01", locale34);
        java.lang.String str36 = yearMonthDay32.toString();
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay32.minusYears((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay32.minusMonths((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale44 = null;
        java.lang.String str45 = yearMonthDay42.toString("1970-01-01", locale44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.dayOfMonth();
        org.joda.time.Interval interval47 = yearMonthDay42.toInterval();
        int int48 = yearMonthDay40.compareTo((org.joda.time.ReadablePartial) yearMonthDay42);
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = null;
        int int52 = yearMonthDay50.indexOf(dateTimeFieldType51);
        org.joda.time.YearMonthDay yearMonthDay54 = yearMonthDay50.minusYears((int) 'a');
        org.joda.time.DateTime dateTime55 = yearMonthDay50.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.YearMonthDay yearMonthDay58 = yearMonthDay50.withPeriodAdded(readablePeriod56, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay60 = yearMonthDay58.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay62 = yearMonthDay58.plusDays(1);
        boolean boolean63 = yearMonthDay40.isEqual((org.joda.time.ReadablePartial) yearMonthDay58);
        org.joda.time.YearMonthDay yearMonthDay65 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = null;
        int int67 = yearMonthDay65.indexOf(dateTimeFieldType66);
        org.joda.time.YearMonthDay yearMonthDay69 = yearMonthDay65.minusYears((int) 'a');
        org.joda.time.DateTime dateTime70 = yearMonthDay65.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.YearMonthDay yearMonthDay73 = yearMonthDay65.withPeriodAdded(readablePeriod71, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay75 = yearMonthDay73.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay73.plusDays(1);
        boolean boolean78 = yearMonthDay40.isEqual((org.joda.time.ReadablePartial) yearMonthDay77);
        boolean boolean79 = yearMonthDay25.isEqual((org.joda.time.ReadablePartial) yearMonthDay77);
        java.lang.String str80 = yearMonthDay25.toString();
        org.joda.time.YearMonthDay yearMonthDay82 = yearMonthDay25.plusDays(1);
        org.joda.time.DateTime dateTime83 = yearMonthDay82.toDateTimeAtCurrentTime();
        int int84 = property2.compareTo((org.joda.time.ReadablePartial) yearMonthDay82);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(yearMonthDay40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01" + "'", str45, "1970-01-01");
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(yearMonthDay58);
        org.junit.Assert.assertNotNull(yearMonthDay60);
        org.junit.Assert.assertNotNull(yearMonthDay62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(yearMonthDay73);
        org.junit.Assert.assertNotNull(yearMonthDay75);
        org.junit.Assert.assertNotNull(yearMonthDay77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "1970-01-01" + "'", str80, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay7 = property5.addToCopy((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.minusMonths((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        org.joda.time.DateTimeField dateTimeField16 = yearMonthDay13.getField((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay13.plusDays((int) '4');
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay18.minusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay18.withPeriodAdded(readablePeriod21, 1971);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(yearMonthDay23);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((int) (short) 100, (int) (short) 1, 11);
        int int4 = yearMonthDay3.size();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay3.plusMonths((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(yearMonthDay6);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay1.minus(readablePeriod35);
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
        org.junit.Assert.assertNotNull(yearMonthDay36);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property7.getDurationField();
        java.lang.String str11 = property7.getAsText();
        int int12 = property7.getMinimumValueOverall();
        java.lang.String str13 = property7.getAsText();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "January" + "'", str11, "January");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "January" + "'", str13, "January");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        boolean boolean11 = yearMonthDay1.equals((java.lang.Object) "1");
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = yearMonthDay1.getFields();
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay1.minusMonths((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight6 = yearMonthDay1.toDateMidnight();
        java.lang.String str7 = yearMonthDay1.toString();
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.minusDays(100);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale13 = null;
        java.lang.String str14 = yearMonthDay11.toString("1970-01-01", locale13);
        java.lang.String str15 = yearMonthDay11.toString();
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay11.minusYears((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay19.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay21 = property20.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = yearMonthDay21.toString(dateTimeFormatter22);
        boolean boolean24 = yearMonthDay11.isBefore((org.joda.time.ReadablePartial) yearMonthDay21);
        java.util.Locale locale26 = null;
        java.lang.String str27 = yearMonthDay21.toString("1", locale26);
        org.joda.time.DateMidnight dateMidnight28 = yearMonthDay21.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        int int32 = yearMonthDay30.indexOf(dateTimeFieldType31);
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay30.minusYears((int) 'a');
        org.joda.time.DateTime dateTime35 = yearMonthDay30.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay30.withPeriodAdded(readablePeriod36, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay38.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay38.minus(readablePeriod41);
        java.util.Locale locale44 = null;
        java.lang.String str45 = yearMonthDay38.toString("1970-01-01", locale44);
        boolean boolean46 = yearMonthDay21.isEqual((org.joda.time.ReadablePartial) yearMonthDay38);
        org.joda.time.YearMonthDay.Property property47 = yearMonthDay38.dayOfMonth();
        boolean boolean48 = yearMonthDay9.isBefore((org.joda.time.ReadablePartial) yearMonthDay38);
        org.joda.time.DateMidnight dateMidnight49 = yearMonthDay9.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay9.minusDays(22);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = null;
        int int55 = yearMonthDay53.indexOf(dateTimeFieldType54);
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay53.minusYears((int) 'a');
        org.joda.time.DateTime dateTime58 = yearMonthDay53.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.YearMonthDay yearMonthDay61 = yearMonthDay53.withPeriodAdded(readablePeriod59, (int) 'a');
        boolean boolean63 = yearMonthDay53.equals((java.lang.Object) "1");
        org.joda.time.DateTimeField[] dateTimeFieldArray64 = yearMonthDay53.getFields();
        org.joda.time.YearMonthDay yearMonthDay66 = yearMonthDay53.minusMonths((int) (short) 0);
        boolean boolean67 = yearMonthDay51.isBefore((org.joda.time.ReadablePartial) yearMonthDay66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01" + "'", str23, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1" + "'", str27, "1");
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(yearMonthDay40);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01" + "'", str45, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray64);
        org.junit.Assert.assertNotNull(yearMonthDay66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        java.lang.String str14 = property7.getName();
        java.util.Locale locale15 = null;
        int int16 = property7.getMaximumTextLength(locale15);
        java.util.Locale locale17 = null;
        int int18 = property7.getMaximumShortTextLength(locale17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "monthOfYear" + "'", str14, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = yearMonthDay19.indexOf(dateTimeFieldType20);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.minusYears((int) 'a');
        boolean boolean24 = yearMonthDay13.isEqual((org.joda.time.ReadablePartial) yearMonthDay19);
        org.joda.time.YearMonthDay.Property property25 = yearMonthDay13.dayOfMonth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (byte) 0);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = yearMonthDay4.toString("1970-01-01", locale6);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.dayOfMonth();
        java.util.Locale locale10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = property8.setCopy("1", locale10);
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
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay25.withYear((int) (short) 1);
        boolean boolean30 = yearMonthDay11.isEqual((org.joda.time.ReadablePartial) yearMonthDay29);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale34 = null;
        java.lang.String str35 = yearMonthDay32.toString("1970-01-01", locale34);
        java.lang.String str36 = yearMonthDay32.toString();
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay32.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate39 = yearMonthDay32.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        int int44 = yearMonthDay42.indexOf(dateTimeFieldType43);
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay42.minusYears((int) 'a');
        org.joda.time.DateTime dateTime47 = yearMonthDay42.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay42.withPeriodAdded(readablePeriod48, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay50.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay54 = yearMonthDay52.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology55 = yearMonthDay54.getChronology();
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay((long) (short) -1, chronology55);
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay32.withChronologyRetainFields(chronology55);
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay(chronology55);
        org.joda.time.YearMonthDay yearMonthDay59 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay11, chronology55);
        boolean boolean60 = yearMonthDay1.isBefore((org.joda.time.ReadablePartial) yearMonthDay11);
        org.joda.time.YearMonthDay yearMonthDay62 = yearMonthDay1.plusMonths((int) (short) 10);
        int int63 = yearMonthDay1.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(yearMonthDay52);
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(yearMonthDay62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1970 + "'", int63 == 1970);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTimeAtMidnight(dateTimeZone16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale5 = null;
        java.lang.String str6 = yearMonthDay3.toString("1970-01-01", locale5);
        java.lang.String str7 = yearMonthDay3.toString();
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay3.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate10 = yearMonthDay3.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        int int15 = yearMonthDay13.indexOf(dateTimeFieldType14);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay13.minusYears((int) 'a');
        org.joda.time.DateTime dateTime18 = yearMonthDay13.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay13.withPeriodAdded(readablePeriod19, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay21.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay23.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology26 = yearMonthDay25.getChronology();
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1, chronology26);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay3.withChronologyRetainFields(chronology26);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((long) 10, chronology26);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(chronology26);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay((long) 97, chronology26);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        int int24 = yearMonthDay22.indexOf(dateTimeFieldType23);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay22.minusYears((int) 'a');
        org.joda.time.DateTime dateTime27 = yearMonthDay22.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay22.withPeriodAdded(readablePeriod28, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay30.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay30.minus(readablePeriod33);
        org.joda.time.YearMonthDay.Property property35 = yearMonthDay34.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property38 = yearMonthDay37.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay39 = property38.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField40 = property38.getField();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property38.getAsText(locale41);
        org.joda.time.YearMonthDay yearMonthDay44 = property38.setCopy((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay45 = property38.withMaximumValue();
        boolean boolean46 = yearMonthDay34.equals((java.lang.Object) property38);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property49 = yearMonthDay48.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay50 = property49.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = yearMonthDay50.toString(dateTimeFormatter51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateMidnight dateMidnight54 = yearMonthDay50.toDateMidnight(dateTimeZone53);
        int int55 = yearMonthDay34.compareTo((org.joda.time.ReadablePartial) yearMonthDay50);
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = null;
        int int59 = yearMonthDay57.indexOf(dateTimeFieldType58);
        org.joda.time.YearMonthDay yearMonthDay61 = yearMonthDay57.minusYears((int) 'a');
        org.joda.time.DateTime dateTime62 = yearMonthDay57.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay57.withPeriodAdded(readablePeriod63, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay67 = yearMonthDay65.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.YearMonthDay yearMonthDay69 = yearMonthDay65.minus(readablePeriod68);
        org.joda.time.YearMonthDay yearMonthDay71 = yearMonthDay69.minusYears(1970);
        org.joda.time.YearMonthDay yearMonthDay73 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = null;
        int int75 = yearMonthDay73.indexOf(dateTimeFieldType74);
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay73.minusYears((int) 'a');
        org.joda.time.DateTime dateTime78 = yearMonthDay73.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.YearMonthDay yearMonthDay81 = yearMonthDay73.withPeriodAdded(readablePeriod79, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay83 = yearMonthDay81.withDayOfMonth(1);
        boolean boolean85 = yearMonthDay81.equals((java.lang.Object) (short) -1);
        int int86 = yearMonthDay69.compareTo((org.joda.time.ReadablePartial) yearMonthDay81);
        boolean boolean87 = yearMonthDay50.isEqual((org.joda.time.ReadablePartial) yearMonthDay69);
        org.joda.time.DateTimeZone dateTimeZone88 = null;
        org.joda.time.DateMidnight dateMidnight89 = yearMonthDay50.toDateMidnight(dateTimeZone88);
        boolean boolean90 = yearMonthDay9.isBefore((org.joda.time.ReadablePartial) yearMonthDay50);
        org.joda.time.YearMonthDay yearMonthDay92 = yearMonthDay50.minusYears(1970);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1" + "'", str42, "1");
        org.junit.Assert.assertNotNull(yearMonthDay44);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01" + "'", str52, "1970-01-01");
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(yearMonthDay65);
        org.junit.Assert.assertNotNull(yearMonthDay67);
        org.junit.Assert.assertNotNull(yearMonthDay69);
        org.junit.Assert.assertNotNull(yearMonthDay71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(yearMonthDay81);
        org.junit.Assert.assertNotNull(yearMonthDay83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(dateMidnight89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(yearMonthDay92);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay13.withYear((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = yearMonthDay19.indexOf(dateTimeFieldType20);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.minusYears((int) 'a');
        org.joda.time.DateTime dateTime24 = yearMonthDay19.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay19.withPeriodAdded(readablePeriod25, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay27.plusMonths(1);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.minusDays(10);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        int int35 = yearMonthDay33.indexOf(dateTimeFieldType34);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay33.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight38 = yearMonthDay33.toDateMidnight();
        java.lang.String str39 = yearMonthDay33.toString();
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property42 = yearMonthDay41.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay43 = property42.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField44 = property42.getField();
        java.util.Locale locale45 = null;
        java.lang.String str46 = property42.getAsText(locale45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property42.getFieldType();
        int int48 = yearMonthDay33.get(dateTimeFieldType47);
        int int49 = yearMonthDay33.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = null;
        int int53 = yearMonthDay51.indexOf(dateTimeFieldType52);
        org.joda.time.YearMonthDay yearMonthDay55 = yearMonthDay51.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight56 = yearMonthDay51.toDateMidnight();
        java.lang.String str57 = yearMonthDay51.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray58 = yearMonthDay51.getFields();
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property61 = yearMonthDay60.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay62 = property61.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField63 = property61.getField();
        java.util.Locale locale64 = null;
        java.lang.String str65 = property61.getAsText(locale64);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = property61.getFieldType();
        boolean boolean67 = yearMonthDay51.isSupported(dateTimeFieldType66);
        org.joda.time.YearMonthDay.Property property68 = yearMonthDay33.property(dateTimeFieldType66);
        int int69 = yearMonthDay29.indexOf(dateTimeFieldType66);
        org.joda.time.YearMonthDay.Property property70 = yearMonthDay13.property(dateTimeFieldType66);
        int int71 = property70.getMinimumValueOverall();
        java.util.Locale locale73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay74 = property70.setCopy("Property[year]", locale73);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[year]\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01" + "'", str39, "1970-01-01");
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1" + "'", str46, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay55);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-01" + "'", str57, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray58);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(yearMonthDay62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1" + "'", str65, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale19 = null;
        java.lang.String str20 = yearMonthDay17.toString("1970-01-01", locale19);
        java.lang.String str21 = yearMonthDay17.toString();
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay17.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate24 = yearMonthDay17.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        int int29 = yearMonthDay27.indexOf(dateTimeFieldType28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay27.minusYears((int) 'a');
        org.joda.time.DateTime dateTime32 = yearMonthDay27.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay27.withPeriodAdded(readablePeriod33, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay35.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay37.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology40 = yearMonthDay39.getChronology();
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay((long) (short) -1, chronology40);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay17.withChronologyRetainFields(chronology40);
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay(0L, chronology40);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay43.toDateTimeAtCurrentTime(dateTimeZone44);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        int int49 = yearMonthDay47.indexOf(dateTimeFieldType48);
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay47.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight52 = yearMonthDay47.toDateMidnight();
        java.lang.String str53 = yearMonthDay47.toString();
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        int int57 = yearMonthDay55.indexOf(dateTimeFieldType56);
        org.joda.time.YearMonthDay yearMonthDay59 = yearMonthDay55.minusYears((int) 'a');
        org.joda.time.DateTime dateTime60 = yearMonthDay55.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.YearMonthDay yearMonthDay63 = yearMonthDay55.withPeriodAdded(readablePeriod61, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = yearMonthDay63.toDateTimeAtMidnight(dateTimeZone64);
        boolean boolean66 = yearMonthDay47.isAfter((org.joda.time.ReadablePartial) yearMonthDay63);
        org.joda.time.YearMonthDay yearMonthDay68 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        int int70 = yearMonthDay68.indexOf(dateTimeFieldType69);
        org.joda.time.YearMonthDay yearMonthDay72 = yearMonthDay68.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight73 = yearMonthDay68.toDateMidnight();
        java.lang.String str74 = yearMonthDay68.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray75 = yearMonthDay68.getFields();
        org.joda.time.YearMonthDay yearMonthDay77 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property78 = yearMonthDay77.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay79 = property78.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField80 = property78.getField();
        java.util.Locale locale81 = null;
        java.lang.String str82 = property78.getAsText(locale81);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = property78.getFieldType();
        boolean boolean84 = yearMonthDay68.isSupported(dateTimeFieldType83);
        boolean boolean85 = yearMonthDay47.isSupported(dateTimeFieldType83);
        org.joda.time.YearMonthDay yearMonthDay87 = yearMonthDay43.withField(dateTimeFieldType83, 31);
        org.joda.time.Chronology chronology88 = yearMonthDay87.getChronology();
        boolean boolean89 = yearMonthDay9.isAfter((org.joda.time.ReadablePartial) yearMonthDay87);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str91 = yearMonthDay9.toString("dayOfMonth");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01" + "'", str53, "1970-01-01");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(yearMonthDay63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay72);
        org.junit.Assert.assertNotNull(dateMidnight73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "1970-01-01" + "'", str74, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray75);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(yearMonthDay79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "1" + "'", str82, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(yearMonthDay87);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay1.year();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.YearMonthDay yearMonthDay11 = property8.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        int int15 = yearMonthDay13.indexOf(dateTimeFieldType14);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay13.minusYears((int) 'a');
        org.joda.time.DateTime dateTime18 = yearMonthDay13.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay13.withPeriodAdded(readablePeriod19, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay21.plusMonths(1);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay23.minusDays(10);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        int int29 = yearMonthDay27.indexOf(dateTimeFieldType28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay27.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight32 = yearMonthDay27.toDateMidnight();
        java.lang.String str33 = yearMonthDay27.toString();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property36 = yearMonthDay35.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay37 = property36.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField38 = property36.getField();
        java.util.Locale locale39 = null;
        java.lang.String str40 = property36.getAsText(locale39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property36.getFieldType();
        int int42 = yearMonthDay27.get(dateTimeFieldType41);
        int int43 = yearMonthDay27.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        int int47 = yearMonthDay45.indexOf(dateTimeFieldType46);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay45.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight50 = yearMonthDay45.toDateMidnight();
        java.lang.String str51 = yearMonthDay45.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray52 = yearMonthDay45.getFields();
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property55 = yearMonthDay54.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay56 = property55.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField57 = property55.getField();
        java.util.Locale locale58 = null;
        java.lang.String str59 = property55.getAsText(locale58);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property55.getFieldType();
        boolean boolean61 = yearMonthDay45.isSupported(dateTimeFieldType60);
        org.joda.time.YearMonthDay.Property property62 = yearMonthDay27.property(dateTimeFieldType60);
        int int63 = yearMonthDay23.indexOf(dateTimeFieldType60);
        int int64 = yearMonthDay11.get(dateTimeFieldType60);
        org.joda.time.Chronology chronology65 = yearMonthDay11.getChronology();
        org.joda.time.YearMonthDay.Property property66 = yearMonthDay11.dayOfMonth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970" + "'", str10, "1970");
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1" + "'", str40, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01" + "'", str51, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(yearMonthDay56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1" + "'", str59, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(property66);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        int int31 = yearMonthDay29.indexOf(dateTimeFieldType30);
        org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay29.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight34 = yearMonthDay29.toDateMidnight();
        java.lang.String str35 = yearMonthDay29.toString();
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property38 = yearMonthDay37.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay39 = property38.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField40 = property38.getField();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property38.getAsText(locale41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property38.getFieldType();
        int int44 = yearMonthDay29.get(dateTimeFieldType43);
        int int45 = yearMonthDay9.indexOf(dateTimeFieldType43);
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay9.minusYears(1);
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property50 = yearMonthDay49.dayOfMonth();
        int int51 = property50.getMaximumValue();
        int int52 = property50.getMaximumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay54 = property50.addToCopy((-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property50.getFieldType();
        org.joda.time.YearMonthDay.Property property56 = yearMonthDay9.property(dateTimeFieldType55);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1" + "'", str42, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 31 + "'", int51 == 31);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 31 + "'", int52 == 31);
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(property56);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(1, (int) (byte) -1, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property23.getFieldType();
        org.joda.time.YearMonthDay yearMonthDay26 = property23.withMaximumValue();
        java.lang.String str27 = property23.getAsString();
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
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1" + "'", str27, "1");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        boolean boolean4 = property2.equals((java.lang.Object) '4');
        java.lang.String str5 = property2.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property2.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay8 = property2.setCopy((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay26.toDateTime(timeOfDay31, dateTimeZone32);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay26.plusYears((int) '4');
        org.joda.time.DateTime dateTime36 = yearMonthDay26.toDateTimeAtMidnight();
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
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        boolean boolean4 = property2.equals((java.lang.Object) '4');
        java.lang.String str5 = property2.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        int int7 = property2.getMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay8 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertNotNull(yearMonthDay8);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay13.plusDays(1);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay15.minusDays((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = property2.withMinimumValue();
        int int8 = property2.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property2.getFieldType();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay11.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay13 = property12.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        org.joda.time.YearMonthDay yearMonthDay15 = property12.getYearMonthDay();
        int int16 = property12.get();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        int int20 = yearMonthDay18.indexOf(dateTimeFieldType19);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay18.minusYears((int) 'a');
        org.joda.time.DateTime dateTime23 = yearMonthDay18.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay18.withPeriodAdded(readablePeriod24, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay26.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay26.minus(readablePeriod29);
        int int31 = yearMonthDay30.getMonthOfYear();
        int[] intArray32 = yearMonthDay30.getValues();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay30.toDateTimeAtCurrentTime(dateTimeZone33);
        int int35 = property12.compareTo((org.joda.time.ReadableInstant) dateTime34);
        int int36 = property2.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property39 = yearMonthDay38.dayOfMonth();
        java.util.Locale locale40 = null;
        int int41 = property39.getMaximumTextLength(locale40);
        org.joda.time.DurationField durationField42 = property39.getDurationField();
        java.util.Locale locale43 = null;
        java.lang.String str44 = property39.getAsShortText(locale43);
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        int int48 = yearMonthDay46.indexOf(dateTimeFieldType47);
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay46.minusYears((int) 'a');
        org.joda.time.Chronology chronology51 = yearMonthDay50.getChronology();
        boolean boolean52 = property39.equals((java.lang.Object) yearMonthDay50);
        org.joda.time.YearMonthDay yearMonthDay53 = property39.withMaximumValue();
        java.lang.String str54 = yearMonthDay53.toString();
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = yearMonthDay53.toDateTime(timeOfDay55, dateTimeZone56);
        int int58 = property2.compareTo((org.joda.time.ReadableInstant) dateTime57);
        int int59 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1" + "'", str44, "1");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1970-01-31" + "'", str54, "1970-01-31");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        java.util.Locale locale12 = null;
        java.lang.String str13 = property7.getAsShortText(locale12);
        org.joda.time.YearMonthDay yearMonthDay14 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate15 = yearMonthDay14.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay14.plusYears((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property19 = yearMonthDay14.property(dateTimeFieldType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "January" + "'", str10, "January");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Jan" + "'", str11, "Jan");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Jan" + "'", str13, "Jan");
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        java.lang.Object obj17 = null;
        boolean boolean18 = property16.equals(obj17);
        int int19 = property16.getMinimumValueOverall();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight6 = yearMonthDay1.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay1.minusYears((int) '4');
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale12 = null;
        java.lang.String str13 = yearMonthDay10.toString("1970-01-01", locale12);
        java.lang.String str14 = yearMonthDay10.toString();
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay10.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate17 = yearMonthDay10.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        int int22 = yearMonthDay20.indexOf(dateTimeFieldType21);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay20.minusYears((int) 'a');
        org.joda.time.DateTime dateTime25 = yearMonthDay20.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay20.withPeriodAdded(readablePeriod26, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay30.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology33 = yearMonthDay32.getChronology();
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay((long) (short) -1, chronology33);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay10.withChronologyRetainFields(chronology33);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(chronology33);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay1.withChronologyRetainFields(chronology33);
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay37.plusDays(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertNotNull(yearMonthDay39);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(0L, chronology25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay28.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        int int34 = yearMonthDay32.indexOf(dateTimeFieldType33);
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay32.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight37 = yearMonthDay32.toDateMidnight();
        java.lang.String str38 = yearMonthDay32.toString();
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        int int42 = yearMonthDay40.indexOf(dateTimeFieldType41);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay40.minusYears((int) 'a');
        org.joda.time.DateTime dateTime45 = yearMonthDay40.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay40.withPeriodAdded(readablePeriod46, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTimeAtMidnight(dateTimeZone49);
        boolean boolean51 = yearMonthDay32.isAfter((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = null;
        int int55 = yearMonthDay53.indexOf(dateTimeFieldType54);
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay53.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight58 = yearMonthDay53.toDateMidnight();
        java.lang.String str59 = yearMonthDay53.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray60 = yearMonthDay53.getFields();
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property63 = yearMonthDay62.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay64 = property63.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField65 = property63.getField();
        java.util.Locale locale66 = null;
        java.lang.String str67 = property63.getAsText(locale66);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property63.getFieldType();
        boolean boolean69 = yearMonthDay53.isSupported(dateTimeFieldType68);
        boolean boolean70 = yearMonthDay32.isSupported(dateTimeFieldType68);
        org.joda.time.YearMonthDay yearMonthDay72 = yearMonthDay28.withField(dateTimeFieldType68, 31);
        org.joda.time.Chronology chronology73 = yearMonthDay72.getChronology();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.DateTime dateTime75 = yearMonthDay72.toDateTimeAtCurrentTime(dateTimeZone74);
        org.joda.time.YearMonthDay yearMonthDay77 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property78 = yearMonthDay77.dayOfMonth();
        java.util.Locale locale79 = null;
        int int80 = property78.getMaximumTextLength(locale79);
        org.joda.time.DurationField durationField81 = property78.getDurationField();
        org.joda.time.YearMonthDay yearMonthDay83 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property84 = yearMonthDay83.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay85 = property84.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField86 = property84.getField();
        java.util.Locale locale87 = null;
        java.lang.String str88 = property84.getAsText(locale87);
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = property84.getFieldType();
        int int90 = property84.getMaximumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay92 = property84.addToCopy(97);
        int int93 = property78.compareTo((org.joda.time.ReadablePartial) yearMonthDay92);
        boolean boolean94 = yearMonthDay72.isBefore((org.joda.time.ReadablePartial) yearMonthDay92);
        org.joda.time.DateTimeZone dateTimeZone95 = null;
        org.joda.time.DateTime dateTime96 = yearMonthDay92.toDateTimeAtCurrentTime(dateTimeZone95);
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
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay36);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(yearMonthDay48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970-01-01" + "'", str59, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray60);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(yearMonthDay64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1" + "'", str67, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(yearMonthDay72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertNotNull(durationField81);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(yearMonthDay85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "1" + "'", str88, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 31 + "'", int90 == 31);
        org.junit.Assert.assertNotNull(yearMonthDay92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(dateTime96);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay8 = property2.setCopy((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = yearMonthDay8.toInterval(dateTimeZone9);
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
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property28 = yearMonthDay27.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay29 = property28.withMinimumValue();
        java.util.Locale locale30 = null;
        java.lang.String str31 = property28.getAsShortText(locale30);
        org.joda.time.DateTimeField dateTimeField32 = property28.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property28.getFieldType();
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay24.property(dateTimeFieldType33);
        org.joda.time.YearMonthDay yearMonthDay35 = property34.getYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property34.getFieldType();
        int int37 = yearMonthDay8.indexOf(dateTimeFieldType36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType39 = yearMonthDay8.getFieldType(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1" + "'", str31, "1");
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(10, 11, (int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay3.minusMonths(1);
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.withPeriodAdded(readablePeriod7, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.withDayOfMonth((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay13.year();
        org.joda.time.YearMonthDay yearMonthDay15 = property14.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay16 = property14.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(yearMonthDay16);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField8 = property2.getField();
        int int9 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        int int3 = property2.getMaximumValue();
        java.lang.String str4 = property2.getAsText();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = property2.withMinimumValue();
        java.lang.String str9 = yearMonthDay7.toString("1970-10-01");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = yearMonthDay7.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay7.plusYears(22);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-10-01" + "'", str9, "1970-10-01");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(yearMonthDay12);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((java.lang.Object) localDate14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay15.dayOfMonth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField3 = yearMonthDay1.getField((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (byte) 0);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = yearMonthDay4.toString("1970-01-01", locale6);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.dayOfMonth();
        java.util.Locale locale10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = property8.setCopy("1", locale10);
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
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay25.withYear((int) (short) 1);
        boolean boolean30 = yearMonthDay11.isEqual((org.joda.time.ReadablePartial) yearMonthDay29);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale34 = null;
        java.lang.String str35 = yearMonthDay32.toString("1970-01-01", locale34);
        java.lang.String str36 = yearMonthDay32.toString();
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay32.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate39 = yearMonthDay32.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        int int44 = yearMonthDay42.indexOf(dateTimeFieldType43);
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay42.minusYears((int) 'a');
        org.joda.time.DateTime dateTime47 = yearMonthDay42.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay42.withPeriodAdded(readablePeriod48, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay50.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay54 = yearMonthDay52.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology55 = yearMonthDay54.getChronology();
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay((long) (short) -1, chronology55);
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay32.withChronologyRetainFields(chronology55);
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay(chronology55);
        org.joda.time.YearMonthDay yearMonthDay59 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay11, chronology55);
        boolean boolean60 = yearMonthDay1.isBefore((org.joda.time.ReadablePartial) yearMonthDay11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay62 = yearMonthDay11.withDayOfMonth(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(yearMonthDay52);
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.YearMonthDay yearMonthDay5 = property2.getYearMonthDay();
        java.lang.String str6 = property2.getAsString();
        java.lang.String str7 = property2.getAsString();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        int int11 = yearMonthDay9.indexOf(dateTimeFieldType10);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minusYears((int) 'a');
        org.joda.time.DateTime dateTime14 = yearMonthDay9.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay9.withPeriodAdded(readablePeriod15, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay17.toDateTimeAtMidnight(dateTimeZone18);
        int int20 = property2.compareTo((org.joda.time.ReadableInstant) dateTime19);
        java.lang.String str21 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = yearMonthDay3.toString(dateTimeFormatter4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay3.toDateTime(timeOfDay6);
        org.joda.time.Chronology chronology8 = yearMonthDay3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay3.minus(readablePeriod9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = yearMonthDay3.toString("Jan", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((int) (short) 100, (int) (short) 1, 11);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay3.minusMonths(12);
        org.junit.Assert.assertNotNull(yearMonthDay5);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay1.plus(readablePeriod44);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay47.plusMonths((int) (short) 10);
        int int50 = yearMonthDay1.compareTo((org.joda.time.ReadablePartial) yearMonthDay49);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property53 = yearMonthDay52.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay54 = property53.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField55 = property53.getField();
        java.util.Locale locale56 = null;
        java.lang.String str57 = property53.getAsText(locale56);
        org.joda.time.YearMonthDay yearMonthDay59 = property53.setCopy((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay60 = property53.withMaximumValue();
        org.joda.time.Chronology chronology61 = yearMonthDay60.getChronology();
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay49, chronology61);
        org.joda.time.YearMonthDay yearMonthDay64 = yearMonthDay62.plusMonths((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.YearMonthDay yearMonthDay67 = yearMonthDay64.withPeriodAdded(readablePeriod65, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = yearMonthDay67.toDateTimeAtCurrentTime(dateTimeZone68);
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
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1" + "'", str57, "1");
        org.junit.Assert.assertNotNull(yearMonthDay59);
        org.junit.Assert.assertNotNull(yearMonthDay60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(yearMonthDay64);
        org.junit.Assert.assertNotNull(yearMonthDay67);
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight6 = yearMonthDay1.toDateMidnight();
        java.lang.String str7 = yearMonthDay1.toString();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        int int11 = yearMonthDay9.indexOf(dateTimeFieldType10);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minusYears((int) 'a');
        org.joda.time.DateTime dateTime14 = yearMonthDay9.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay9.withPeriodAdded(readablePeriod15, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay17.toDateTimeAtMidnight(dateTimeZone18);
        boolean boolean20 = yearMonthDay1.isAfter((org.joda.time.ReadablePartial) yearMonthDay17);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay17.plus(readablePeriod21);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay17.minusDays(100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay24.withPeriodAdded(readablePeriod27, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay29.toDateTimeAtMidnight(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) 1969);
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = yearMonthDay3.indexOf(dateTimeFieldType4);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay3.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight8 = yearMonthDay3.toDateMidnight();
        java.lang.String str9 = yearMonthDay3.toString();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay11.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay13 = property12.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property12.getAsText(locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property12.getFieldType();
        int int18 = yearMonthDay3.get(dateTimeFieldType17);
        int int19 = yearMonthDay3.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        int int23 = yearMonthDay21.indexOf(dateTimeFieldType22);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay21.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay21.toDateMidnight();
        java.lang.String str27 = yearMonthDay21.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = yearMonthDay21.getFields();
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property31 = yearMonthDay30.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay32 = property31.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField33 = property31.getField();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        boolean boolean37 = yearMonthDay21.isSupported(dateTimeFieldType36);
        org.joda.time.YearMonthDay.Property property38 = yearMonthDay3.property(dateTimeFieldType36);
        org.joda.time.YearMonthDay.Property property39 = yearMonthDay1.property(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1" + "'", str35, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        org.joda.time.YearMonthDay yearMonthDay82 = yearMonthDay71.plusMonths(1873);
        int int83 = yearMonthDay82.getYear();
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
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2126 + "'", int83 == 2126);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        org.joda.time.DateMidnight dateMidnight14 = yearMonthDay9.toDateMidnight();
        java.lang.String str15 = yearMonthDay9.toString();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay17.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay19 = property18.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField20 = property18.getField();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property18.getAsText(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property18.getFieldType();
        int int24 = yearMonthDay9.get(dateTimeFieldType23);
        int int25 = yearMonthDay9.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        int int29 = yearMonthDay27.indexOf(dateTimeFieldType28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay27.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight32 = yearMonthDay27.toDateMidnight();
        java.lang.String str33 = yearMonthDay27.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray34 = yearMonthDay27.getFields();
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property37 = yearMonthDay36.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay38 = property37.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField39 = property37.getField();
        java.util.Locale locale40 = null;
        java.lang.String str41 = property37.getAsText(locale40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property37.getFieldType();
        boolean boolean43 = yearMonthDay27.isSupported(dateTimeFieldType42);
        org.joda.time.YearMonthDay.Property property44 = yearMonthDay9.property(dateTimeFieldType42);
        int int45 = yearMonthDay1.indexOf(dateTimeFieldType42);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay1.minus(readablePeriod46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay47.minus(readablePeriod48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1" + "'", str41, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(yearMonthDay49);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(0L, chronology25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay28.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        int int34 = yearMonthDay32.indexOf(dateTimeFieldType33);
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay32.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight37 = yearMonthDay32.toDateMidnight();
        java.lang.String str38 = yearMonthDay32.toString();
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        int int42 = yearMonthDay40.indexOf(dateTimeFieldType41);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay40.minusYears((int) 'a');
        org.joda.time.DateTime dateTime45 = yearMonthDay40.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay40.withPeriodAdded(readablePeriod46, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTimeAtMidnight(dateTimeZone49);
        boolean boolean51 = yearMonthDay32.isAfter((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = null;
        int int55 = yearMonthDay53.indexOf(dateTimeFieldType54);
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay53.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight58 = yearMonthDay53.toDateMidnight();
        java.lang.String str59 = yearMonthDay53.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray60 = yearMonthDay53.getFields();
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property63 = yearMonthDay62.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay64 = property63.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField65 = property63.getField();
        java.util.Locale locale66 = null;
        java.lang.String str67 = property63.getAsText(locale66);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property63.getFieldType();
        boolean boolean69 = yearMonthDay53.isSupported(dateTimeFieldType68);
        boolean boolean70 = yearMonthDay32.isSupported(dateTimeFieldType68);
        org.joda.time.YearMonthDay yearMonthDay72 = yearMonthDay28.withField(dateTimeFieldType68, 31);
        org.joda.time.Chronology chronology73 = yearMonthDay72.getChronology();
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.YearMonthDay yearMonthDay76 = yearMonthDay72.withPeriodAdded(readablePeriod74, 12);
        org.joda.time.DateTimeField[] dateTimeFieldArray77 = yearMonthDay72.getFields();
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.YearMonthDay yearMonthDay80 = yearMonthDay72.withPeriodAdded(readablePeriod78, (int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.YearMonthDay yearMonthDay82 = yearMonthDay80.plus(readablePeriod81);
        java.lang.String str83 = yearMonthDay82.toString();
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
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay36);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(yearMonthDay48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970-01-01" + "'", str59, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray60);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(yearMonthDay64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1" + "'", str67, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(yearMonthDay72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(yearMonthDay76);
        org.junit.Assert.assertNotNull(dateTimeFieldArray77);
        org.junit.Assert.assertNotNull(yearMonthDay80);
        org.junit.Assert.assertNotNull(yearMonthDay82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "1970-01-31" + "'", str83, "1970-01-31");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.year();
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = yearMonthDay4.toString("1970-01-01", locale6);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.dayOfMonth();
        org.joda.time.Interval interval9 = yearMonthDay4.toInterval();
        int[] intArray10 = yearMonthDay4.getValues();
        boolean boolean11 = yearMonthDay1.equals((java.lang.Object) intArray10);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        int int15 = yearMonthDay13.indexOf(dateTimeFieldType14);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay13.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay13.toDateMidnight();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay13.minus(readablePeriod19);
        int int21 = yearMonthDay1.compareTo((org.joda.time.ReadablePartial) yearMonthDay20);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay20.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay20.toDateTime(timeOfDay24, dateTimeZone25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1970, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        boolean boolean67 = yearMonthDay13.isEqual((org.joda.time.ReadablePartial) yearMonthDay65);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray68 = yearMonthDay13.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
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
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray68);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        int int18 = property2.getMinimumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay20 = property2.addWrapFieldToCopy(2);
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        int int24 = yearMonthDay22.indexOf(dateTimeFieldType23);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay22.minusYears((int) 'a');
        org.joda.time.DateTime dateTime27 = yearMonthDay22.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay22.withPeriodAdded(readablePeriod28, (int) 'a');
        boolean boolean32 = yearMonthDay22.equals((java.lang.Object) "1");
        org.joda.time.DateTimeField[] dateTimeFieldArray33 = yearMonthDay22.getFields();
        boolean boolean34 = yearMonthDay20.isAfter((org.joda.time.ReadablePartial) yearMonthDay22);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property5.getAsText(locale8);
        java.lang.String str10 = property5.toString();
        java.util.Locale locale11 = null;
        int int12 = property5.getMaximumShortTextLength(locale11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[dayOfMonth]" + "'", str10, "Property[dayOfMonth]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        int int12 = property7.getMinimumValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "January" + "'", str9, "January");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "January" + "'", str10, "January");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        java.lang.String str15 = property7.getAsText();
        org.joda.time.YearMonthDay yearMonthDay16 = property7.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = yearMonthDay19.indexOf(dateTimeFieldType20);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.minusYears((int) 'a');
        org.joda.time.DateTime dateTime24 = yearMonthDay19.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay19.withPeriodAdded(readablePeriod25, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay27.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology32 = yearMonthDay31.getChronology();
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((long) (short) -1, chronology32);
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(chronology32);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(chronology32);
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale39 = null;
        java.lang.String str40 = yearMonthDay37.toString("1970-01-01", locale39);
        java.lang.String str41 = yearMonthDay37.toString();
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay37.minusYears((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay37.minusMonths((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale49 = null;
        java.lang.String str50 = yearMonthDay47.toString("1970-01-01", locale49);
        org.joda.time.YearMonthDay.Property property51 = yearMonthDay47.dayOfMonth();
        org.joda.time.Interval interval52 = yearMonthDay47.toInterval();
        int int53 = yearMonthDay45.compareTo((org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        int int57 = yearMonthDay55.indexOf(dateTimeFieldType56);
        org.joda.time.YearMonthDay yearMonthDay59 = yearMonthDay55.minusYears((int) 'a');
        org.joda.time.DateTime dateTime60 = yearMonthDay55.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.YearMonthDay yearMonthDay63 = yearMonthDay55.withPeriodAdded(readablePeriod61, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay63.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay67 = yearMonthDay63.plusDays(1);
        boolean boolean68 = yearMonthDay45.isEqual((org.joda.time.ReadablePartial) yearMonthDay63);
        org.joda.time.YearMonthDay yearMonthDay70 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = null;
        int int72 = yearMonthDay70.indexOf(dateTimeFieldType71);
        org.joda.time.YearMonthDay yearMonthDay74 = yearMonthDay70.minusYears((int) 'a');
        org.joda.time.DateTime dateTime75 = yearMonthDay70.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        org.joda.time.YearMonthDay yearMonthDay78 = yearMonthDay70.withPeriodAdded(readablePeriod76, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay80 = yearMonthDay78.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay82 = yearMonthDay78.plusDays(1);
        boolean boolean83 = yearMonthDay45.isEqual((org.joda.time.ReadablePartial) yearMonthDay82);
        boolean boolean84 = yearMonthDay35.isEqual((org.joda.time.ReadablePartial) yearMonthDay82);
        boolean boolean85 = yearMonthDay16.isAfter((org.joda.time.ReadablePartial) yearMonthDay82);
        org.joda.time.YearMonthDay yearMonthDay87 = yearMonthDay82.minusDays(1969);
        org.joda.time.TimeOfDay timeOfDay88 = null;
        org.joda.time.DateTime dateTime89 = yearMonthDay82.toDateTime(timeOfDay88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "January" + "'", str10, "January");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "January" + "'", str15, "January");
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01" + "'", str40, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01" + "'", str41, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01" + "'", str50, "1970-01-01");
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(yearMonthDay63);
        org.junit.Assert.assertNotNull(yearMonthDay65);
        org.junit.Assert.assertNotNull(yearMonthDay67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(yearMonthDay78);
        org.junit.Assert.assertNotNull(yearMonthDay80);
        org.junit.Assert.assertNotNull(yearMonthDay82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(yearMonthDay87);
        org.junit.Assert.assertNotNull(dateTime89);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(0, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.dayOfMonth();
        org.joda.time.DurationField durationField6 = property5.getRangeDurationField();
        int int7 = property5.getMaximumValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumShortTextLength(locale8);
        org.joda.time.YearMonthDay yearMonthDay11 = property7.setCopy(2);
        int int12 = property7.getMaximumValueOverall();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property7.getAsText(locale13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property7.getFieldType();
        java.lang.String str16 = property7.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "January" + "'", str14, "January");
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "monthOfYear" + "'", str16, "monthOfYear");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        int int17 = yearMonthDay1.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = yearMonthDay1.toDateMidnight(dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay1.plus(readablePeriod20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay1.plus(readablePeriod22);
        org.joda.time.Interval interval24 = yearMonthDay23.toInterval();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(interval24);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        org.joda.time.DurationField durationField24 = property2.getRangeDurationField();
        int int25 = property2.get();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.YearMonthDay yearMonthDay5 = property2.getYearMonthDay();
        int int6 = property2.get();
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
        int int21 = yearMonthDay20.getMonthOfYear();
        int[] intArray22 = yearMonthDay20.getValues();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = yearMonthDay20.toDateTimeAtCurrentTime(dateTimeZone23);
        int int25 = property2.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DurationField durationField26 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.YearMonthDay yearMonthDay5 = property2.getYearMonthDay();
        java.lang.String str6 = property2.getAsString();
        java.lang.String str7 = property2.getAsString();
        java.lang.String str8 = property2.getAsString();
        org.joda.time.YearMonthDay yearMonthDay10 = property2.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        int int14 = yearMonthDay12.indexOf(dateTimeFieldType13);
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay12.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight17 = yearMonthDay12.toDateMidnight();
        java.lang.String str18 = yearMonthDay12.toString();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay20.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay22 = property21.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField23 = property21.getField();
        java.util.Locale locale24 = null;
        java.lang.String str25 = property21.getAsText(locale24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property21.getFieldType();
        int int27 = yearMonthDay12.get(dateTimeFieldType26);
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay12.plusYears(2);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        int int33 = yearMonthDay31.indexOf(dateTimeFieldType32);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay31.minusYears((int) 'a');
        org.joda.time.DateTime dateTime36 = yearMonthDay31.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay31.withPeriodAdded(readablePeriod37, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay39.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay39.minus(readablePeriod42);
        int int44 = yearMonthDay43.getMonthOfYear();
        org.joda.time.Chronology chronology45 = yearMonthDay43.getChronology();
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        int int49 = yearMonthDay47.indexOf(dateTimeFieldType48);
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay47.minusYears((int) 'a');
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay47.plusYears((int) '4');
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property56 = yearMonthDay55.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay57 = property56.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField58 = property56.getField();
        java.util.Locale locale59 = null;
        java.lang.String str60 = property56.getAsText(locale59);
        org.joda.time.YearMonthDay yearMonthDay61 = property56.withMinimumValue();
        int int62 = property56.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property56.getFieldType();
        boolean boolean64 = yearMonthDay53.isSupported(dateTimeFieldType63);
        int int65 = yearMonthDay43.get(dateTimeFieldType63);
        int int66 = yearMonthDay12.get(dateTimeFieldType63);
        org.joda.time.YearMonthDay.Property property67 = yearMonthDay10.property(dateTimeFieldType63);
        java.lang.String str68 = property67.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01" + "'", str18, "1970-01-01");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1" + "'", str60, "1");
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 31 + "'", int62 == 31);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "dayOfMonth" + "'", str68, "dayOfMonth");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        org.joda.time.DateTime dateTime31 = yearMonthDay13.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime32 = yearMonthDay13.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay13.plus(readablePeriod33);
        org.joda.time.Interval interval35 = yearMonthDay34.toInterval();
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
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertNotNull(interval35);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight6 = yearMonthDay1.toDateMidnight();
        java.lang.String str7 = yearMonthDay1.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = yearMonthDay1.getFields();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay1.minus(readablePeriod9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale14 = null;
        java.lang.String str15 = yearMonthDay12.toString("1970-01-01", locale14);
        java.lang.String str16 = yearMonthDay12.toString();
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay12.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = yearMonthDay12.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        int int24 = yearMonthDay22.indexOf(dateTimeFieldType23);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay22.minusYears((int) 'a');
        org.joda.time.DateTime dateTime27 = yearMonthDay22.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay22.withPeriodAdded(readablePeriod28, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay30.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay32.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology35 = yearMonthDay34.getChronology();
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) -1, chronology35);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay12.withChronologyRetainFields(chronology35);
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay37.withYear(100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = yearMonthDay37.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay37.minus(readablePeriod41);
        int int43 = yearMonthDay10.compareTo((org.joda.time.ReadablePartial) yearMonthDay37);
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
        org.joda.time.YearMonthDay yearMonthDay77 = new org.joda.time.YearMonthDay((long) 10, chronology74);
        org.joda.time.YearMonthDay yearMonthDay78 = new org.joda.time.YearMonthDay((int) (byte) 10, 1, (int) (byte) 1, chronology74);
        org.joda.time.YearMonthDay yearMonthDay79 = new org.joda.time.YearMonthDay((long) 1, chronology74);
        org.joda.time.YearMonthDay yearMonthDay80 = new org.joda.time.YearMonthDay((long) (short) 1, chronology74);
        org.joda.time.YearMonthDay yearMonthDay81 = yearMonthDay37.withChronologyRetainFields(chronology74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
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
        org.junit.Assert.assertNotNull(yearMonthDay81);
    }
}

