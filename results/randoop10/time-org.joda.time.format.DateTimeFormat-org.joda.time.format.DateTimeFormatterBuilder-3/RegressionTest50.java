import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest50 {

    public static boolean debug = false;

    @Test
    public void test25001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25001");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime7 = dateTime4.minusYears(0);
        int int8 = property2.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime10 = dateTime4.minusSeconds(59);
        org.joda.time.DateTime dateTime12 = dateTime4.minusMillis(1970);
        org.joda.time.DateTime dateTime14 = dateTime4.withSecondOfMinute((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.plus(readablePeriod21);
        org.joda.time.DateTime.Property property23 = dateTime22.millisOfDay();
        org.joda.time.DurationField durationField24 = property23.getDurationField();
        org.joda.time.DateTime dateTime26 = property23.addWrapFieldToCopy((int) '#');
        java.util.Locale locale27 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 'a', chronology29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfEven();
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime35 = property31.set("22", locale34);
        java.lang.String str36 = locale27.getDisplayScript(locale34);
        int int37 = property23.getMaximumShortTextLength(locale34);
        java.lang.String str38 = dateTimeZone17.getShortName((long) 99, locale34);
        long long42 = dateTimeZone17.convertLocalToUTC((long) 54341029, false, (long) 46);
        org.joda.time.DateTime dateTime43 = dateTime4.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTime dateTime45 = dateTime4.withMillis((long) 305);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+05:23" + "'", str38, "+05:23");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 34961029L + "'", long42 == 34961029L);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
    }

    @Test
    public void test25002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25002");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int26 = localTime22.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology27, locale28);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.year();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, (long) '#');
        java.lang.String str35 = dateTimeZone32.getID();
        int int37 = dateTimeZone32.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology38 = chronology27.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField39 = durationFieldType18.getField(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.era();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology38);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime41.addWeekyears((-1645420448));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1645418426 for weekyear must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-62166787199903L) + "'", long17 == (-62166787199903L));
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
    }

    @Test
    public void test25003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25003");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 'a', chronology7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfEven();
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime13 = property9.set("22", locale12);
        mutableDateTime13.addYears(10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.DateTime dateTime19 = property18.withMinimumValue();
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime23 = dateTime19.plusMillis(1);
        mutableDateTime13.setDate((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime13.add(readablePeriod25, (int) (short) 0);
        org.joda.time.Chronology chronology28 = mutableDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.dayOfYear();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(chronology28);
        org.joda.time.DurationField durationField31 = chronology28.days();
        org.joda.time.DateTime dateTime32 = dateTime5.toDateTime(chronology28);
        org.joda.time.DurationField durationField33 = chronology28.millis();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test25004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25004");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology5);
        int int8 = mutableDateTime7.getSecondOfMinute();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean12 = localTime10.isSupported(dateTimeFieldType11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.property(dateTimeFieldType11);
        mutableDateTime7.setMillis((long) 54341029);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.getMutableDateTime();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime22 = localTime20.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int24 = localTime20.get(dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = localTime20.getChronology();
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology25, locale26);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = dateTimeField28.getType();
        boolean boolean30 = mutableDateTime18.isSupported(dateTimeFieldType29);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(10L);
        org.joda.time.DateTime dateTime33 = dateTime32.toDateTime();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.withDurationAdded(readableDuration34, (-8));
        org.joda.time.DateTime dateTime38 = dateTime36.minusWeeks(8);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMinutes(2022);
        org.joda.time.DateTime dateTime41 = dateTime38.toDateTimeISO();
        org.joda.time.DateTime dateTime43 = dateTime38.withMillisOfDay(0);
        mutableDateTime18.setTime((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime18.add(readablePeriod45, 1000736784);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 28 + "'", int8 == 28);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test25005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25005");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate localDate8 = localDate6.plusWeeks(0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDate6.getFieldTypes();
        org.joda.time.Chronology chronology10 = localDate6.getChronology();
        org.joda.time.LocalDate.Property property11 = localDate6.yearOfEra();
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test25006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25006");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone1.getDisplayName(true, 54691310);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 54691310");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test25007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25007");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withDayOfYear(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime11 = dateTime7.withDayOfMonth(8);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis(21);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.minus(readableDuration14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readableDuration18);
        int int20 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime22 = dateTime11.withYearOfCentury(13);
        org.joda.time.LocalDate localDate23 = dateTime11.toLocalDate();
        org.joda.time.DateTime.Property property24 = dateTime11.yearOfEra();
        boolean boolean25 = localDate0.equals((java.lang.Object) dateTime11);
        org.joda.time.DateTime dateTime27 = dateTime11.minusWeeks(54650);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test25008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25008");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) '#');
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime8.plusMillis(1);
        org.joda.time.DateTime.Property property13 = dateTime12.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean15 = dateTime12.isSupported(dateTimeFieldType14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime4.property(dateTimeFieldType14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withWeekOfWeekyear(10);
        int int21 = localDateTime20.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.secondOfMinute();
        int int23 = localDateTime20.indexOf(dateTimeFieldType22);
        java.lang.String str25 = localDateTime20.toString("2");
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.plusMinutes(33);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.hourOfDay();
        int int32 = localDateTime30.getWeekOfWeekyear();
        int int33 = localDateTime30.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.hourOfDay();
        int int39 = localDateTime37.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.dayOfYear();
        org.joda.time.LocalDateTime localDateTime42 = property40.setCopy(3);
        org.joda.time.LocalDateTime localDateTime44 = property40.addToCopy((long) 43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withYearOfCentury(31);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDateTime.Property property55 = localDateTime53.property(dateTimeFieldType54);
        org.joda.time.DurationFieldType durationFieldType56 = dateTimeFieldType54.getDurationType();
        boolean boolean57 = localDateTime46.isSupported(dateTimeFieldType54);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime27.withField(dateTimeFieldType54, 362);
        int int60 = mutableDateTime4.get(dateTimeFieldType54);
        mutableDateTime4.setWeekyear(811);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(chronology63);
        org.joda.time.DateTime.Property property65 = dateTime64.yearOfCentury();
        org.joda.time.DateTime dateTime66 = property65.withMinimumValue();
        org.joda.time.DateTime dateTime68 = dateTime66.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime70 = dateTime66.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone71 = dateTime70.getZone();
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.minusDays((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.yearOfEra();
        org.joda.time.LocalDateTime.Property property77 = localDateTime75.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime78 = property77.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime79 = property77.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.secondOfDay();
        java.lang.String str81 = dateTimeFieldType80.toString();
        int int82 = localDateTime79.get(dateTimeFieldType80);
        int int83 = dateTime70.get(dateTimeFieldType80);
        mutableDateTime4.set(dateTimeFieldType80, 535);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 66 + "'", int21 == 66);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2" + "'", str25, "2");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 70 + "'", int39 == 70);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(localDateTime59);
// flaky:         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 490 + "'", int60 == 490);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(dateTimeFieldType80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "secondOfDay" + "'", str81, "secondOfDay");
// flaky:         org.junit.Assert.assertTrue("'" + int82 + "' != '" + 54928 + "'", int82 == 54928);
// flaky:         org.junit.Assert.assertTrue("'" + int83 + "' != '" + 54928 + "'", int83 == 54928);
    }

    @Test
    public void test25009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25009");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology7, locale8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.secondOfDay();
        org.joda.time.DurationField durationField12 = chronology10.halfdays();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) '#', chronology10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology10.add(readablePeriod14, 4741L, (-101));
        org.joda.time.DurationField durationField18 = chronology10.millis();
        org.joda.time.DateTimeField dateTimeField19 = chronology10.clockhourOfHalfday();
        long long21 = dateTimeField19.roundHalfEven((long) (byte) 1);
        long long23 = dateTimeField19.roundFloor(19380017L);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = dateTimeField19.set(0L, "2022-02-21T15:12:21.616");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T15:12:21.616\" for clockhourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4741L + "'", long17 == 4741L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 18000000L + "'", long23 == 18000000L);
    }

    @Test
    public void test25010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25010");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime6 = dateTime4.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime4.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime4.getZone();
        long long11 = dateTimeZone9.nextTransition(100L);
        long long13 = dateTimeZone9.convertUTCToLocal((long) 46);
        java.util.TimeZone timeZone14 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 28, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone17.getMillisKeepLocal(dateTimeZone18, (long) '#');
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone17);
        java.lang.String str23 = dateTimeZone17.getNameKey((long) ' ');
        boolean boolean24 = dateTimeZone17.isFixed();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone17);
        boolean boolean26 = dateTimeZone9.equals((java.lang.Object) mutableDateTime25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = mutableDateTime25.toDateTime(dateTimeZone27);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 46L + "'", long13 == 46L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test25011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25011");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        long long10 = dateTimeZone6.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 'a', dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        org.joda.time.DateTime dateTime14 = dateTime12.plus(278580097L);
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded(0L, 54544924);
        org.joda.time.DateTime.Property property18 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime19 = property18.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test25012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25012");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology8, locale9);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.plus(readablePeriod15);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfDay();
        org.joda.time.DurationField durationField18 = property17.getDurationField();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        long long22 = dateTimeField19.add((-259199980L), (int) (short) 1);
        java.lang.String str23 = dateTimeField19.toString();
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        int int25 = dateTimeField19.getMaximumShortTextLength(locale24);
        java.lang.String str26 = dateTimeField11.getAsText((long) 'a', locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 52, chronology1, locale24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfCentury();
        org.joda.time.DateTime dateTime31 = property30.withMinimumValue();
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime35 = dateTime31.plusHours((int) (byte) 0);
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfMonth();
        org.joda.time.DateTime dateTime38 = dateTime35.withWeekyear((int) (short) 0);
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime42 = localTime40.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int44 = localTime40.get(dateTimeFieldType43);
        org.joda.time.Chronology chronology45 = localTime40.getChronology();
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology45, locale46);
        org.joda.time.DateTimeField dateTimeField48 = chronology45.year();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        long long52 = dateTimeZone49.getMillisKeepLocal(dateTimeZone50, (long) '#');
        java.lang.String str53 = dateTimeZone50.getID();
        int int55 = dateTimeZone50.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology56 = chronology45.withZone(dateTimeZone50);
        org.joda.time.DurationField durationField57 = chronology56.centuries();
        org.joda.time.DateTime dateTime58 = dateTime35.toDateTime(chronology56);
        org.joda.time.DateTimeField dateTimeField59 = chronology56.centuryOfEra();
        dateTimeParserBucket27.saveField(dateTimeField59, 79);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-259199979L) + "'", long22 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DateTimeField[millisOfDay]" + "'", str23, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970" + "'", str26, "1970");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 35L + "'", long52 == 35L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "UTC" + "'", str53, "UTC");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeField59);
    }

    @Test
    public void test25013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25013");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate localDate8 = localDate6.minusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localDate6.isSupported(durationFieldType9);
        org.joda.time.LocalDate.Property property12 = localDate6.yearOfEra();
        org.joda.time.LocalDate localDate13 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        org.joda.time.DurationField durationField15 = property12.getDurationField();
        org.joda.time.DurationField durationField16 = property12.getDurationField();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "seconds" + "'", str10, "seconds");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test25014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25014");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str4 = dateTimeZone2.getName((long) 54);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        int int8 = dateTime6.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime10 = dateTime6.plusSeconds((int) (short) 0);
        org.joda.time.DateTime dateTime12 = dateTime6.withMillisOfDay((int) (byte) 0);
        int int13 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone15);
        int int17 = localDateTime16.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean19 = localDateTime16.isSupported(dateTimeFieldType18);
        int int20 = localDateTime16.getWeekOfWeekyear();
        int int21 = localDateTime16.getEra();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.plusMinutes(0);
        org.joda.time.DateTime dateTime24 = dateTime12.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology26);
        boolean boolean29 = localTime27.equals((java.lang.Object) 10L);
        org.joda.time.LocalTime localTime31 = localTime27.plusMinutes((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime27.plus(readablePeriod32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 'a', chronology35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField38 = property37.getField();
        org.joda.time.MutableDateTime mutableDateTime39 = property37.roundCeiling();
        boolean boolean40 = localTime33.equals((java.lang.Object) property37);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) 'a', chronology42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime43.toMutableDateTime(dateTimeZone45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.property(dateTimeFieldType47);
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean53 = localTime51.isSupported(dateTimeFieldType52);
        boolean boolean54 = localTime49.equals((java.lang.Object) boolean53);
        boolean boolean55 = property48.equals((java.lang.Object) localTime49);
        org.joda.time.LocalTime localTime57 = localTime49.plusHours(59);
        org.joda.time.LocalTime.Property property58 = localTime57.millisOfDay();
        org.joda.time.LocalTime localTime59 = property58.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property60 = localTime59.secondOfMinute();
        org.joda.time.LocalTime localTime61 = property60.roundCeilingCopy();
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime65 = localTime63.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int67 = localTime63.get(dateTimeFieldType66);
        org.joda.time.Chronology chronology68 = localTime63.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.months();
        org.joda.time.DurationField durationField70 = chronology68.days();
        org.joda.time.DateTimeField dateTimeField71 = chronology68.dayOfWeek();
        org.joda.time.DurationField durationField72 = durationFieldType62.getField(chronology68);
        org.joda.time.LocalTime localTime74 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime76 = localTime74.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int78 = localTime74.get(dateTimeFieldType77);
        org.joda.time.Chronology chronology79 = localTime74.getChronology();
        java.util.Locale locale80 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology79, locale80);
        org.joda.time.DurationField durationField82 = durationFieldType62.getField(chronology79);
        boolean boolean83 = localTime61.isSupported(durationFieldType62);
        java.lang.String str84 = durationFieldType62.getName();
        org.joda.time.LocalTime localTime86 = localTime33.withFieldAdded(durationFieldType62, 442);
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.LocalTime localTime89 = localTime33.withPeriodAdded(readablePeriod87, 54383306);
        // The following exception was thrown during execution in test generation
        try {
            int int90 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localTime33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+05:23" + "'", str4, "+05:23");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19380000 + "'", int13 == 19380000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(durationField82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "millis" + "'", str84, "millis");
        org.junit.Assert.assertNotNull(localTime86);
        org.junit.Assert.assertNotNull(localTime89);
    }

    @Test
    public void test25015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25015");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime7.toGregorianCalendar();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar8);
        org.joda.time.LocalDate.Property property10 = localDate9.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate9.minus(readablePeriod11);
        org.joda.time.LocalDate.Property property13 = localDate9.year();
        org.joda.time.LocalDate localDate14 = property13.roundFloorCopy();
        org.joda.time.LocalDate localDate15 = property13.getLocalDate();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test25016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25016");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        java.util.Locale locale11 = new java.util.Locale("", "seconds");
        java.lang.String str12 = localDateTime6.toString("22", locale11);
        int int13 = localDateTime6.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime6.getFields();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime6.minus(readableDuration15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusYears(83155380);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plus(readableDuration19);
        int int21 = localDateTime18.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.dayOfYear();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plusYears(54383493);
        int int25 = localDateTime24.getYearOfEra();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale11.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 86399001 + "'", int13 == 86399001);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 28771887 + "'", int25 == 28771887);
    }

    @Test
    public void test25017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25017");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendMinuteOfHour(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendYear(57, 23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendTwoDigitYear(11);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap17 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendTimeZoneShortName(strMap17);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder14.appendFractionOfHour(28, 14);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder21.appendYearOfCentury(891, 2105);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test25018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25018");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder0.build();
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder8 = builder0.setVariant("Chinese");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.Builder builder10 = builder8.clear();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test25019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25019");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendWeekyear(39, 5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendMillisOfDay(59);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendWeekOfWeekyear(20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendHourOfDay(8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTwoDigitWeekyear(107);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder19.appendTwoDigitWeekyear(54371, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder19.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendWeekyear(54450685, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder26.appendHourOfHalfday(292278993);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder26.appendTwoDigitYear(19408, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder26.appendTimeZoneOffset("2022-02-21T15:14:02.723", "02:00:58.000", true, 843, 54383493);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
    }

    @Test
    public void test25020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25020");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 'a', chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfEven();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set("22", locale7);
        mutableDateTime8.addYears(10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis(1);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime8.add(readablePeriod20, (int) (short) 0);
        org.joda.time.Chronology chronology23 = mutableDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.dayOfYear();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 'a', chronology27);
        mutableDateTime28.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime28.secondOfDay();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 'a', chronology33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.yearOfCentury();
        mutableDateTime34.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology38 = null;
        mutableDateTime34.setChronology(chronology38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.weekyear();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.add((long) 1);
        mutableDateTime42.addDays((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.DateTime dateTime47 = mutableDateTime42.toDateTime();
        java.util.TimeZone timeZone49 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        mutableDateTime42.setZone(dateTimeZone51);
        mutableDateTime28.setZone(dateTimeZone51);
        org.joda.time.Chronology chronology54 = chronology23.withZone(dateTimeZone51);
        org.joda.time.Chronology chronology55 = chronology54.withUTC();
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(1104969599999L, chronology55);
        org.joda.time.Chronology chronology57 = chronology55.withUTC();
        org.joda.time.Chronology chronology58 = chronology57.withUTC();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.clockhourOfDay();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
    }

    @Test
    public void test25021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25021");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str1 = durationFieldType0.getName();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.months();
        org.joda.time.DurationField durationField10 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField12 = durationFieldType2.getField(chronology8);
        boolean boolean13 = durationFieldType0.isSupported(chronology8);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfSecond();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder16.setExtension('a', "");
        java.util.Locale.Builder builder20 = builder16.clear();
        java.util.Locale locale21 = builder16.build();
        java.util.Locale locale22 = builder16.build();
        java.lang.String str23 = dateTimeField14.getAsText(17, locale22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology25);
        org.joda.time.LocalTime.Property property27 = localTime26.hourOfDay();
        org.joda.time.LocalTime localTime28 = property27.withMaximumValue();
        org.joda.time.LocalTime localTime30 = property27.addCopy((-259199979L));
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        org.joda.time.DateTime dateTime34 = property33.withMinimumValue();
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) (byte) 10);
        org.joda.time.DateTime.Property property37 = dateTime36.millisOfSecond();
        org.joda.time.DateTime dateTime38 = localTime30.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.LocalTime localTime40 = localTime30.withMillisOfDay(21);
        int int41 = dateTimeField14.getMaximumValue((org.joda.time.ReadablePartial) localTime40);
        int int42 = localTime40.getMinuteOfHour();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "seconds" + "'", str1, "seconds");
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "17" + "'", str23, "17");
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 999 + "'", int41 == 999);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test25022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25022");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        int int6 = property5.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.roundHalfEven();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.centuryOfEra();
        int int9 = mutableDateTime7.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime7.add(readableDuration10);
        mutableDateTime7.addMinutes(55);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusDays(0);
        int int18 = localDateTime14.getWeekyear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        int int24 = mutableDateTime7.get(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1969 + "'", int24 == 1969);
    }

    @Test
    public void test25023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25023");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        mutableDateTime7.addYears(10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis(1);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime7.add(readablePeriod19, (int) 'u');
        mutableDateTime7.setYear(99);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale25 = dateTimeFormatter24.getLocale();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime27.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime27.toMutableDateTime(dateTimeZone31);
        int int35 = dateTimeFormatter24.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime32, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime39 = localTime37.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int41 = localTime37.get(dateTimeFieldType40);
        org.joda.time.Chronology chronology42 = localTime37.getChronology();
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology42, locale43);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime32.toMutableDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime7.toMutableDateTime(chronology42);
        org.joda.time.Chronology chronology47 = mutableDateTime46.getChronology();
        mutableDateTime46.setMinuteOfDay(101);
        java.lang.String str50 = mutableDateTime46.toString();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-101) + "'", int35 == (-101));
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0099-02-21T01:41:00.000Z" + "'", str50, "0099-02-21T01:41:00.000Z");
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    public void test25024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25024");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        java.lang.String str10 = dateTimeField6.toString();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        int int12 = dateTimeField6.getMaximumShortTextLength(locale11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withWeekOfWeekyear(10);
        int int17 = localDateTime13.getWeekyear();
        org.joda.time.Chronology chronology18 = localDateTime13.getChronology();
        int[] intArray21 = new int[] { 2 };
        int[] intArray23 = dateTimeField6.add((org.joda.time.ReadablePartial) localDateTime13, 5, intArray21, 0);
        java.lang.String str24 = localDateTime13.toString();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime13.withYear(41);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withDurationAdded(readableDuration27, 22);
        org.joda.time.LocalDateTime.Property property30 = localDateTime26.secondOfMinute();
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.lang.String str32 = locale31.getCountry();
        java.lang.String str33 = property30.getAsShortText(locale31);
        org.joda.time.LocalDateTime localDateTime34 = property30.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[millisOfDay]" + "'", str10, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[2]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[2]");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-21T15:15:28.747" + "'", str24, "2022-02-21T15:15:28.747");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "28" + "'", str33, "28");
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test25025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25025");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        java.lang.String str10 = dateTimeField6.toString();
        long long12 = dateTimeField6.roundHalfCeiling((-259199979L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.joda.time.format.DateTimeFormat.fullTime();
        java.util.Locale locale15 = dateTimeFormatter14.getLocale();
        org.joda.time.Chronology chronology16 = dateTimeFormatter14.getChronolgy();
        int int17 = dateTimeFormatter14.getDefaultYear();
        org.joda.time.Chronology chronology18 = dateTimeFormatter14.getChronolgy();
        java.lang.String str20 = dateTimeFormatter14.print((long) 75600097);
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.toLanguageTag();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter14.withLocale(locale21);
        java.lang.String str25 = dateTimeField6.getAsShortText(292277064L, locale21);
        boolean boolean27 = dateTimeField6.isLeap(54546L);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[millisOfDay]" + "'", str10, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-259199979L) + "'", long12 == (-259199979L));
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2000 + "'", int17 == 2000);
        org.junit.Assert.assertNull(chronology18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "9:00:00 PM +00:00" + "'", str20, "9:00:00 PM +00:00");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ko-KR" + "'", str23, "ko-KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "33077064" + "'", str25, "33077064");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test25026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25026");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readableDuration2);
        org.joda.time.DateTime dateTime5 = dateTime1.withMillis(0L);
        org.joda.time.DateTime dateTime7 = dateTime1.plusHours(17268551);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTime dateTime10 = property8.addToCopy((long) 54907052);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test25027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25027");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusMillis(16);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfCentury();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test25028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25028");
        java.io.IOException iOException2 = new java.io.IOException("10");
        java.io.IOException iOException5 = new java.io.IOException("00:00:00.097");
        java.io.IOException iOException6 = new java.io.IOException("\ud55c\uad6d\uc5b4", (java.lang.Throwable) iOException5);
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException("zh_TW", (java.lang.Throwable) iOException5);
        java.lang.String str9 = iOException8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: zh_TW" + "'", str9, "java.io.IOException: zh_TW");
    }

    @Test
    public void test25029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25029");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay6 = dateTime5.toTimeOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology8);
        boolean boolean11 = localTime9.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime9.plus(readablePeriod12);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime5, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime5.minusMillis(4);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 'a', chronology19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.yearOfCentury();
        mutableDateTime20.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology24 = null;
        mutableDateTime20.setChronology(chronology24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.weekyear();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime20);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime20.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration29 = null;
        mutableDateTime28.add(readableDuration29);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.weekyears();
        mutableDateTime28.add(durationFieldType31, 44);
        org.joda.time.DateTime dateTime35 = dateTime17.withFieldAdded(durationFieldType31, 7);
        org.joda.time.DateTime.Property property36 = dateTime35.year();
        org.joda.time.DateTime.Property property37 = dateTime35.era();
        org.joda.time.DateTimeField dateTimeField38 = property37.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test25030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25030");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays(0);
        int int4 = localDateTime0.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.minusSeconds((-54353560));
        org.joda.time.LocalDateTime localDateTime9 = localDateTime0.minusHours(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra(1940);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusHours(46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withEra(2122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2122 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test25031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25031");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property4.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime5.plusYears((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.plus(readableDuration8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.plus(readableDuration10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int16 = localTime12.get(dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = localTime12.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.months();
        org.joda.time.DurationField durationField19 = chronology17.days();
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime11.toMutableDateTime(chronology17);
        java.lang.String str21 = chronology17.toString();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = locale22.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 23, chronology17, locale22, (java.lang.Integer) 1940, 54388519);
        org.joda.time.DateTimeZone dateTimeZone27 = chronology17.getZone();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((java.lang.Object) "1", chronology17);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = chronology17.get(readablePeriod29, 43515L, (-54377L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ISOChronology[UTC]" + "'", str21, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "it" + "'", str23, "it");
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test25032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25032");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withPivotYear((java.lang.Integer) (-84));
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter0.getParser();
        int int7 = dateTimeFormatter0.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimePrinter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeParser6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test25033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25033");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime5 = property2.addWrapFieldToCopy(20);
        long long6 = property2.remainder();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category7, locale8);
        java.lang.String str12 = property2.getAsShortText(locale8);
        java.util.Set<java.lang.String> strSet13 = locale8.getUnicodeLocaleAttributes();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology16);
        boolean boolean18 = strSet15.remove((java.lang.Object) mutableDateTime17);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder19.setExtension('a', "");
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder23.setExtension('a', "");
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale.Builder[] builderArray28 = new java.util.Locale.Builder[] { builder19, builder26, builder27 };
        java.util.Locale.Builder[] builderArray29 = strSet15.toArray(builderArray28);
        boolean boolean30 = strSet15.isEmpty();
        boolean boolean31 = strSet15.isEmpty();
        boolean boolean32 = strSet13.addAll((java.util.Collection<java.lang.String>) strSet15);
        java.util.Spliterator<java.lang.String> strSpliterator33 = strSet15.spliterator();
        java.util.Iterator<java.lang.String> strItor34 = strSet15.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator35 = strSet15.spliterator();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime39 = localTime37.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int41 = localTime37.get(dateTimeFieldType40);
        org.joda.time.Chronology chronology42 = localTime37.getChronology();
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology42, locale43);
        org.joda.time.DateTimeZone dateTimeZone45 = chronology42.getZone();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.dayOfWeek();
        boolean boolean47 = strSet15.contains((java.lang.Object) chronology42);
        org.joda.time.DateTimeField dateTimeField48 = chronology42.clockhourOfDay();
        long long51 = dateTimeField48.add(680400139L, 4461205394L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4461328832L + "'", long6 == 4461328832L);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builderArray28);
        org.junit.Assert.assertNotNull(builderArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSpliterator33);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertNotNull(strSpliterator35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 16060340098800139L + "'", long51 == 16060340098800139L);
    }

    @Test
    public void test25034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25034");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withDefaultYear(1998);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int11 = localTime7.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localTime7.getChronology();
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology12, locale13);
        org.joda.time.DateTimeZone dateTimeZone15 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.dayOfWeek();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 21, chronology12);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.dayOfWeek();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter3.withChronology(chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter3.withPivotYear(54408245);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.parse("halfdays", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"halfdays\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test25035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25035");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime12 = mutableDateTime10.toDateTime();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime17 = localTime15.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int19 = localTime15.get(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = localTime15.getChronology();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology20, locale21);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.year();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone24.getMillisKeepLocal(dateTimeZone25, (long) '#');
        java.lang.String str28 = dateTimeZone25.getID();
        int int30 = dateTimeZone25.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology31 = chronology20.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField32 = chronology20.millisOfSecond();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(chronology20);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology35);
        org.joda.time.LocalTime.Property property37 = localTime36.hourOfDay();
        org.joda.time.LocalTime localTime38 = property37.roundCeilingCopy();
        int[] intArray40 = chronology20.get((org.joda.time.ReadablePartial) localTime38, (long) 1970);
        org.joda.time.DateTimeField dateTimeField41 = chronology20.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(chronology20);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime42);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27 == 35L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 1, 970]");
        org.junit.Assert.assertNotNull(dateTimeField41);
    }

    @Test
    public void test25036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25036");
        java.util.Locale locale1 = new java.util.Locale("54893");
        org.junit.Assert.assertEquals(locale1.toString(), "54893");
    }

    @Test
    public void test25037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25037");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readableDuration2);
        org.joda.time.DateTime dateTime5 = dateTime1.withMillis(0L);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.weekOfWeekyear();
        org.joda.time.DateTime dateTime10 = dateTime7.plusWeeks(966);
        org.joda.time.DateTime dateTime11 = dateTime7.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay12 = dateTime11.toYearMonthDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
    }

    @Test
    public void test25038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25038");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.LocalDate localDate11 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate13 = property7.addWrapFieldToCopy(100);
        int int14 = localDate13.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = localDate13.getField(54761683);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54761683");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test25039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25039");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Chronology chronology1 = dateTime0.getChronology();
        org.joda.time.DurationField durationField2 = chronology1.seconds();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 'a', chronology5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.yearOfCentury();
        int int8 = property7.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfEven();
        mutableDateTime9.setSecondOfDay((int) (short) 100);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property14.withMinimumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.minusYears(2);
        int int18 = dateTime17.getDayOfMonth();
        org.joda.time.DateTime.Property property19 = dateTime17.year();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime17.getZone();
        java.lang.String str22 = dateTimeZone20.getNameKey((long) (-1));
        java.lang.String str23 = dateTimeZone20.getID();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withWeekOfWeekyear(10);
        int int28 = localDateTime24.getWeekyear();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withYear(2000);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusHours((int) 'a');
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.millisOfSecond();
        boolean boolean34 = dateTimeZone20.equals((java.lang.Object) property33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone20);
        long long38 = dateTimeZone20.convertLocalToUTC(0L, true);
        mutableDateTime9.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime40 = dateTime3.toDateTime(dateTimeZone20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology42 = dateTimeFormatter41.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter41.withPivotYear((int) (short) 0);
        java.lang.String str45 = dateTime3.toString(dateTimeFormatter41);
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("12");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter41.withLocale(locale47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter41.withOffsetParsed();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2022 + "'", int28 == 2022);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "3:15 PM" + "'", str45, "3:15 PM");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
    }

    @Test
    public void test25040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25040");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        java.lang.String str7 = localTime4.toString(dateTimeFormatter5);
        java.lang.String str9 = dateTimeFormatter5.print((long) 54345623);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.Chronology chronology11 = dateTimeFormatter5.getChronolgy();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int16 = localTime12.get(dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = localTime12.getChronology();
        java.lang.String str18 = dateTimeFormatter5.print((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime23 = localTime21.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int25 = localTime21.get(dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = localTime21.getChronology();
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology26, locale27);
        long long30 = dateTimeParserBucket28.computeMillis(false);
        java.util.Locale locale31 = dateTimeParserBucket28.getLocale();
        java.lang.Integer int32 = dateTimeParserBucket28.getPivotYear();
        dateTimeParserBucket28.setPivotYear((java.lang.Integer) 345598981);
        java.util.Locale locale35 = dateTimeParserBucket28.getLocale();
        java.lang.String str36 = localTime12.toString("19", locale35);
        java.lang.String str37 = locale35.getScript();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12:00 AM" + "'", str7, "12:00 AM");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3:05 PM" + "'", str9, "3:05 PM");
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "12:00 AM" + "'", str18, "12:00 AM");
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "19" + "'", str36, "19");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test25041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25041");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(54383493);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25042");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendCenturyOfEra(22, 41);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendYearOfEra(54409662, 54855491);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test25043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25043");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime5 = localTime2.withFieldAdded(durationFieldType3, 100);
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfDay(21);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone8.getMillisKeepLocal(dateTimeZone9, (long) '#');
        java.lang.String str12 = dateTimeZone9.getID();
        org.joda.time.DateTime dateTime13 = localTime7.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTime dateTime15 = dateTime13.plusWeeks((-54353560));
        int int16 = dateTime13.getEra();
        org.joda.time.DateTime dateTime18 = dateTime13.plusHours(0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test25044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25044");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(1);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean10 = dateTime7.isSupported(dateTimeFieldType9);
        org.joda.time.Instant instant11 = dateTime7.toInstant();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        boolean boolean16 = timeZone12.hasSameRules(timeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTime dateTime18 = dateTime7.toDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTime.Property property21 = dateTime18.hourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test25045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25045");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        int int4 = localDateTime0.getWeekyear();
        org.joda.time.Chronology chronology5 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.year();
        int int7 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime0.plusMillis(558);
        int int10 = localDateTime0.getYearOfCentury();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
    }

    @Test
    public void test25046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25046");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusYears(2);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime.Property property15 = dateTime13.year();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime13.getZone();
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = dateTimeZone16.getName((long) 43, locale18);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(4460753826L, dateTimeZone16);
        int int22 = dateTimeZone16.getOffsetFromLocal(441817562668L);
        long long24 = dateTimeZone16.convertUTCToLocal((long) 468);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(54713, 0, 54435852, (-992), 39989669, 971, (int) (short) 10, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -992 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 468L + "'", long24 == 468L);
    }

    @Test
    public void test25047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25047");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property6.addToCopy(132);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) property6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test25048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25048");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        long long10 = dateTimeParserBucket8.computeMillis(false);
        dateTimeParserBucket8.setPivotYear((java.lang.Integer) 2);
        java.lang.Integer int13 = dateTimeParserBucket8.getOffsetInteger();
        java.lang.Integer int14 = dateTimeParserBucket8.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket8.getZone();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a', chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.yearOfCentury();
        mutableDateTime18.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology22 = null;
        mutableDateTime18.setChronology(chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 'a', chronology25);
        mutableDateTime26.addWeekyears((int) (byte) -1);
        int int29 = mutableDateTime26.getDayOfMonth();
        mutableDateTime26.setWeekyear((int) (short) 0);
        boolean boolean32 = mutableDateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.plus(readablePeriod35);
        org.joda.time.DateTime.Property property37 = dateTime36.millisOfDay();
        org.joda.time.DurationField durationField38 = property37.getDurationField();
        org.joda.time.DateTimeField dateTimeField39 = property37.getField();
        long long42 = dateTimeField39.add((-259199980L), (int) (short) 1);
        java.lang.String str43 = dateTimeField39.toString();
        int int45 = dateTimeField39.getMinimumValue((long) 10);
        mutableDateTime18.setRounding(dateTimeField39);
        dateTimeParserBucket8.saveField(dateTimeField39, 54371101);
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime51 = localTime49.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int53 = localTime49.get(dateTimeFieldType52);
        org.joda.time.Chronology chronology54 = localTime49.getChronology();
        org.joda.time.LocalTime localTime55 = org.joda.time.LocalTime.now(chronology54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        long long59 = chronology54.add(readablePeriod56, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField60 = chronology54.minutes();
        org.joda.time.DateTimeField dateTimeField61 = chronology54.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime62 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = null;
        java.lang.String str64 = mutableDateTime62.toString(dateTimeFormatter63);
        int int65 = mutableDateTime62.getEra();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((long) 'a', chronology67);
        mutableDateTime68.addWeekyears((int) (byte) -1);
        int int71 = mutableDateTime68.getDayOfMonth();
        int int72 = mutableDateTime68.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime68.toMutableDateTime(dateTimeZone73);
        long long78 = dateTimeZone73.convertLocalToUTC((long) (byte) 0, true, 5050L);
        int int80 = dateTimeZone73.getOffsetFromLocal(4460783880L);
        mutableDateTime62.setZoneRetainFields(dateTimeZone73);
        dateTimeParserBucket8.setZone(dateTimeZone73);
        java.util.TimeZone timeZone83 = dateTimeZone73.toTimeZone();
        java.util.TimeZone.setDefault(timeZone83);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-259199979L) + "'", long42 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "DateTimeField[millisOfDay]" + "'", str43, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 4460736516L + "'", long59 == 4460736516L);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(mutableDateTime62);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "2022-02-21T15:15:29.009Z" + "'", str64, "2022-02-21T15:15:29.009Z");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(timeZone83);
        org.junit.Assert.assertEquals(timeZone83.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test25049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25049");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours((int) ' ');
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        org.joda.time.DateTime.Property property7 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        java.lang.String str10 = dateTimeField9.toString();
        int int11 = dateTimeField9.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[minuteOfDay]" + "'", str10, "DateTimeField[minuteOfDay]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test25050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25050");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        java.lang.String str10 = dateTimeField6.toString();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        int int12 = dateTimeField6.getMaximumShortTextLength(locale11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withWeekOfWeekyear(10);
        int int17 = localDateTime13.getWeekyear();
        org.joda.time.Chronology chronology18 = localDateTime13.getChronology();
        int[] intArray21 = new int[] { 2 };
        int[] intArray23 = dateTimeField6.add((org.joda.time.ReadablePartial) localDateTime13, 5, intArray21, 0);
        java.lang.String str24 = localDateTime13.toString();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime13.withYear(41);
        org.joda.time.LocalDateTime.Property property27 = localDateTime13.dayOfMonth();
        org.joda.time.LocalDateTime.Property property28 = localDateTime13.monthOfYear();
        java.lang.String str29 = localDateTime13.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[millisOfDay]" + "'", str10, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[2]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[2]");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-21T15:15:29.039" + "'", str24, "2022-02-21T15:15:29.039");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022-02-21T15:15:29.039" + "'", str29, "2022-02-21T15:15:29.039");
    }

    @Test
    public void test25051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25051");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.withMaximumValue();
        org.joda.time.LocalTime localTime9 = localTime7.plusMillis(54376);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime7.plus(readablePeriod10);
        org.joda.time.LocalTime.Property property12 = localTime7.minuteOfHour();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test25052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25052");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        int int8 = localDate7.getEra();
        org.joda.time.LocalDate.Property property9 = localDate7.era();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.joda.time.LocalDate localDate11 = property9.roundFloorCopy();
        org.joda.time.LocalDate.Property property12 = localDate11.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = property12.setCopy("2022-02-21T15:14:15.703Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T15:14:15.703Z\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test25053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25053");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(10L);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.withDurationAdded(readableDuration3, (-8));
        org.joda.time.DateTime dateTime7 = dateTime1.minusWeeks((int) '#');
        int int8 = dateTime7.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime();
        java.lang.String str11 = dateTime7.toString("-1");
        org.joda.time.DateTime.Property property12 = dateTime7.millisOfSecond();
        long long13 = dateTime7.getMillis();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 121 + "'", int8 == 121);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-21167999990L) + "'", long13 == (-21167999990L));
    }

    @Test
    public void test25054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25054");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusWeeks((int) '4');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 'a', chronology7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.yearOfCentury();
        mutableDateTime8.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology12 = null;
        mutableDateTime8.setChronology(chronology12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(10L);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.DateTime dateTime21 = property20.withMinimumValue();
        org.joda.time.DateTime dateTime23 = dateTime21.minusYears(2);
        org.joda.time.DateTime dateTime25 = dateTime21.withWeekyear(21);
        int int26 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime21);
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime30 = localTime28.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int32 = localTime28.get(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = localTime28.getChronology();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.now(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology33);
        mutableDateTime8.setChronology(chronology33);
        org.joda.time.DateTime dateTime37 = dateTime5.withChronology(chronology33);
        org.joda.time.DateTime dateTime38 = dateTime37.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime40 = dateTime38.minusDays((-2720));
        org.joda.time.DateTime dateTime42 = dateTime38.minusHours(404);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test25055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25055");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.months();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.year();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.yearOfEra();
        int int10 = dateTimeField9.getMaximumValue();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("5");
        java.lang.String str13 = locale12.getVariant();
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.lang.String str18 = locale12.getDisplayCountry(locale15);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.lang.String str21 = locale12.getDisplayLanguage(locale20);
        int int22 = dateTimeField9.getMaximumShortTextLength(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.joda.time.format.DateTimeFormat.patternForStyle("\uc624\ud6c4 3:06", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: ???? 3:06");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test25056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25056");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime11.getZone();
        boolean boolean17 = property6.equals((java.lang.Object) dateTimeZone16);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder19.setExtension('a', "");
        java.util.Locale.Builder builder23 = builder19.clear();
        java.util.Locale locale24 = builder19.build();
        java.util.Locale locale25 = builder19.build();
        java.lang.String str26 = locale25.toLanguageTag();
        java.lang.String str27 = dateTimeZone16.getShortName(82800010L, locale25);
        java.lang.String str28 = locale25.getDisplayCountry();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "und" + "'", str26, "und");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test25057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25057");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate localDate8 = localDate0.minusWeeks(21);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate0.minus(readablePeriod9);
        org.joda.time.LocalDate.Property property11 = localDate0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate0.withPeriodAdded(readablePeriod12, 54391465);
        org.joda.time.LocalDate localDate16 = localDate0.minusWeeks((int) ' ');
        int int17 = localDate16.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate19 = localDate16.minusDays(107);
        org.joda.time.LocalDate localDate21 = localDate16.minusMonths((-213));
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate24 = localDate22.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate26 = localDate24.minusDays((int) 'a');
        org.joda.time.LocalDate.Property property27 = localDate26.era();
        org.joda.time.LocalDate localDate28 = property27.roundHalfCeilingCopy();
        int int29 = localDate28.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate31 = localDate28.plusDays(21);
        org.joda.time.LocalDate localDate33 = localDate31.minusDays(31);
        org.joda.time.LocalDate localDate35 = localDate33.plusWeeks(39982076);
        boolean boolean36 = localDate21.isBefore((org.joda.time.ReadablePartial) localDate33);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 28 + "'", int17 == 28);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test25058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25058");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology8);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology8, locale12, (java.lang.Integer) 70, 41);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(10368000052L, chronology8);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 'a', chronology18);
        mutableDateTime19.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.hourOfDay();
        int int23 = property22.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.roundHalfEven();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.centuryOfEra();
        int int26 = mutableDateTime24.getYearOfCentury();
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone29);
        int int31 = localDateTime30.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean33 = localDateTime30.isSupported(dateTimeFieldType32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime30.yearOfCentury();
        org.joda.time.LocalDateTime.Property property35 = localDateTime30.yearOfEra();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime37 = property35.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField38 = property35.getField();
        int int40 = dateTimeField38.getMaximumValue((long) 2127);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime24.setRounding(dateTimeField38, 71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 71");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 69 + "'", int26 == 69);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 292278993 + "'", int40 == 292278993);
    }

    @Test
    public void test25059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25059");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        java.util.Locale locale11 = new java.util.Locale("", "seconds");
        java.lang.String str12 = localDateTime6.toString("22", locale11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readableDuration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMillis(278);
        int int18 = localDateTime17.getEra();
        int int19 = localDateTime17.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale11.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 59 + "'", int19 == 59);
    }

    @Test
    public void test25060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25060");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMaximumValue();
        org.joda.time.LocalTime localTime5 = property3.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime5.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime5.plusSeconds((-25));
        org.joda.time.LocalTime.Property property10 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test25061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25061");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        int int3 = dateTime1.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfHour();
        org.joda.time.DateTime dateTime8 = dateTime6.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test25062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25062");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        int int3 = localDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean5 = localDateTime2.isSupported(dateTimeFieldType4);
        int int6 = localDateTime2.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusDays((int) 'a');
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.era();
        int int10 = localDateTime2.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.minusSeconds(6);
        org.joda.time.Chronology chronology13 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test25063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25063");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addHours(0);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime0.getZone();
        mutableDateTime0.setMillis((long) 999);
        mutableDateTime0.addWeeks(1);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int14 = localTime10.get(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localTime10.getChronology();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology15, locale16);
        org.joda.time.DateTimeField dateTimeField18 = chronology15.year();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone19.getMillisKeepLocal(dateTimeZone20, (long) '#');
        java.lang.String str23 = dateTimeZone20.getID();
        int int25 = dateTimeZone20.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology26 = chronology15.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.hourOfDay();
        org.joda.time.DurationField durationField28 = chronology26.years();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.Chronology chronology32 = chronology26.withZone(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime0.toMutableDateTime(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime0.add(readablePeriod34);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
    }

    @Test
    public void test25064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25064");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime2.add(readableDuration6, 8);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime11.add(readablePeriod12);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.yearOfEra();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.millisOfDay();
        boolean boolean18 = mutableDateTime11.isAfter(65001L);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25065");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
        boolean boolean4 = strSet1.remove((java.lang.Object) mutableDateTime3);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "");
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder[] builderArray14 = new java.util.Locale.Builder[] { builder5, builder12, builder13 };
        java.util.Locale.Builder[] builderArray15 = strSet1.toArray(builderArray14);
        java.util.stream.Stream<java.lang.String> strStream16 = strSet1.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "seconds", "Thursday" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology28);
        boolean boolean30 = strSet27.remove((java.lang.Object) mutableDateTime29);
        java.util.Iterator<java.lang.String> strItor31 = strSet27.iterator();
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strSet27);
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.util.Locale locale34 = locale33.stripExtensions();
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.lang.String str37 = locale34.getDisplayName();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 'a', chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundHalfEven();
        java.util.Locale locale44 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime45 = property41.set("22", locale44);
        java.lang.String str46 = locale34.getDisplayScript(locale44);
        java.util.Locale locale47 = java.util.Locale.ROOT;
        java.lang.String str48 = locale44.getDisplayScript(locale47);
        java.util.Set<java.lang.String> strSet49 = locale44.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strSet49);
        org.joda.time.tz.NameProvider nameProvider51 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale52 = java.util.Locale.CANADA;
        java.util.Locale locale53 = locale52.stripExtensions();
        java.util.Locale locale54 = java.util.Locale.ROOT;
        java.lang.String str55 = locale53.getDisplayVariant(locale54);
        java.lang.String str56 = locale53.getDisplayName();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) 'a', chronology58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime61 = property60.roundHalfEven();
        java.util.Locale locale63 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime64 = property60.set("22", locale63);
        java.lang.String str65 = locale53.getDisplayScript(locale63);
        java.lang.String str68 = nameProvider51.getName(locale63, "Canada", "2022-02-21T15:05:41.396Z");
        java.util.Set<java.lang.String> strSet69 = locale63.getUnicodeLocaleAttributes();
        strSet69.clear();
        java.util.Spliterator<java.lang.String> strSpliterator71 = strSet69.spliterator();
        boolean boolean72 = strSet49.retainAll((java.util.Collection<java.lang.String>) strSet69);
        boolean boolean73 = strSet1.containsAll((java.util.Collection<java.lang.String>) strSet49);
        org.joda.time.LocalTime localTime75 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime77 = localTime75.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int79 = localTime75.get(dateTimeFieldType78);
        org.joda.time.Chronology chronology80 = localTime75.getChronology();
        java.util.Locale locale81 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket82 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology80, locale81);
        org.joda.time.Chronology chronology83 = dateTimeParserBucket82.getChronology();
        java.util.Locale locale84 = dateTimeParserBucket82.getLocale();
        java.util.Set<java.lang.String> strSet85 = locale84.getUnicodeLocaleKeys();
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.LocalTime localTime88 = new org.joda.time.LocalTime((long) (short) 10, chronology87);
        int int89 = localTime88.getSecondOfMinute();
        org.joda.time.LocalTime localTime91 = localTime88.withHourOfDay((int) (short) 10);
        org.joda.time.LocalTime.Property property92 = localTime91.minuteOfHour();
        org.joda.time.LocalTime localTime93 = property92.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod94 = null;
        org.joda.time.LocalTime localTime96 = localTime93.withPeriodAdded(readablePeriod94, 1969);
        boolean boolean97 = strSet85.contains((java.lang.Object) 1969);
        java.lang.Object[] objArray98 = strSet85.toArray();
        boolean boolean99 = strSet49.containsAll((java.util.Collection<java.lang.String>) strSet85);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builderArray14);
        org.junit.Assert.assertNotNull(builderArray15);
        org.junit.Assert.assertNotNull(strStream16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "English (Canada)" + "'", str37, "English (Canada)");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(nameProvider51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "English (Canada)" + "'", str56, "English (Canada)");
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(strSpliterator71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(dateTimeFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertNotNull(locale84);
// flaky:         org.junit.Assert.assertEquals(locale84.toString(), "");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(localTime91);
        org.junit.Assert.assertNotNull(property92);
        org.junit.Assert.assertNotNull(localTime93);
        org.junit.Assert.assertNotNull(localTime96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(objArray98);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray98), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray98), "[]");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test25066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25066");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 'a', chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfEven();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set("22", locale7);
        mutableDateTime8.addYears(10);
        int int13 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "12:00 AM", 7);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.weekOfWeekyear();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getOffset(7L);
        mutableDateTime8.setZoneRetainFields(dateTimeZone17);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.addWrapField(54723);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-8) + "'", int13 == (-8));
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test25067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25067");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        java.util.Locale locale11 = new java.util.Locale("", "seconds");
        java.lang.String str12 = localDateTime6.toString("22", locale11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minusYears((int) (short) 0);
        int int16 = localDateTime6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone18);
        int int20 = localDateTime19.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean22 = localDateTime19.isSupported(dateTimeFieldType21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withYearOfEra(457071);
        int int25 = localDateTime24.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusMinutes(2021);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale11.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test25068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25068");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.minusDays(457071);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate7.minus(readablePeriod8);
        java.lang.String str10 = localDate7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localDate7.getField(61616);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 61616");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0770-09-22" + "'", str10, "0770-09-22");
    }

    @Test
    public void test25069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25069");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        java.util.Locale locale11 = new java.util.Locale("", "seconds");
        java.lang.String str12 = localDateTime6.toString("22", locale11);
        int int13 = localDateTime6.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime6.getFields();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime6.minus(readableDuration15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusMillis((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withDayOfYear(392);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 392 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale11.toString(), "_SECONDS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 86399001 + "'", int13 == 86399001);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test25070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25070");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) '#');
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.property(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.DateTime dateTime10 = property9.withMinimumValue();
        org.joda.time.DateTime dateTime12 = dateTime10.plusYears((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay13 = dateTime12.toTimeOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime20 = localTime17.withPeriodAdded(readablePeriod18, (int) (byte) -1);
        org.joda.time.LocalTime.Property property21 = localTime20.millisOfSecond();
        org.joda.time.LocalTime localTime22 = property21.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean28 = localTime26.isSupported(dateTimeFieldType27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder24.appendSignedDecimal(dateTimeFieldType27, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder24.appendMillisOfSecond(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder33.appendText(dateTimeFieldType34);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder33.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder33.appendTwoDigitWeekyear(45);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder33.appendClockhourOfDay((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder33.appendYearOfCentury(100, 24);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder33.appendDecimal(dateTimeFieldType45, 345598981, (int) 'u');
        boolean boolean49 = localTime23.isSupported(dateTimeFieldType45);
        boolean boolean50 = dateTime14.isSupported(dateTimeFieldType45);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime4.property(dateTimeFieldType45);
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType45.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(durationFieldType52);
    }

    @Test
    public void test25071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25071");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        int int6 = dateTime5.getDayOfMonth();
        org.joda.time.DateTime.Property property7 = dateTime5.year();
        org.joda.time.LocalDateTime localDateTime8 = dateTime5.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minus(readableDuration9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withWeekyear(3);
        org.joda.time.LocalDateTime.Property property13 = localDateTime8.dayOfWeek();
        int int14 = localDateTime8.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test25072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25072");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        mutableDateTime7.addYears(10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis(1);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime7.add(readablePeriod19, (int) (short) 0);
        org.joda.time.Chronology chronology22 = mutableDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(chronology22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long28 = dateTimeZone25.getMillisKeepLocal(dateTimeZone26, (long) '#');
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) dateTime24, dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.minuteOfDay();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.secondOfMinute();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime31.era();
        int int35 = property34.getMinimumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime37 = property34.add(607);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test25073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25073");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendWeekyear(39, 5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendMillisOfDay(59);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendWeekOfWeekyear(20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendHourOfDay(8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatterBuilder15.toFormatter();
        boolean boolean21 = dateTimeFormatter20.isParser();
        java.lang.Appendable appendable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter20.printTo(appendable22, (long) 78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25074");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.plusHours((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.withDayOfYear((int) '4');
        org.joda.time.DateTime dateTime12 = localDate11.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property13 = localDate11.year();
        org.joda.time.LocalDate localDate15 = localDate11.withWeekyear(54432);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a', chronology17);
        mutableDateTime18.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.hourOfDay();
        int int22 = property21.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.roundHalfEven();
        mutableDateTime23.addDays(6);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate28 = localDate26.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate30 = localDate28.minusDays((int) 'a');
        org.joda.time.LocalDate.Property property31 = localDate30.era();
        org.joda.time.LocalDate localDate32 = property31.roundHalfCeilingCopy();
        int int33 = localDate32.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate35 = localDate32.plusDays(21);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfCentury();
        org.joda.time.DateTime dateTime39 = property38.withMinimumValue();
        org.joda.time.DateTime dateTime41 = dateTime39.minusYears(2);
        int int42 = dateTime41.getDayOfMonth();
        org.joda.time.DateTime.Property property43 = dateTime41.year();
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime41.getZone();
        java.util.Locale locale46 = java.util.Locale.CANADA;
        java.lang.String str47 = dateTimeZone44.getName((long) 43, locale46);
        org.joda.time.DateTime dateTime48 = localDate32.toDateTimeAtCurrentTime(dateTimeZone44);
        mutableDateTime23.setZoneRetainFields(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime23.getZone();
        org.joda.time.DateTime dateTime51 = localDate15.toDateTimeAtMidnight(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusDays(616);
        int int54 = property8.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 21 + "'", int42 == 21);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test25075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25075");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        java.lang.String str7 = localTime4.toString(dateTimeFormatter5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone14);
        long long18 = dateTimeZone14.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 'a', dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter5.withZone(dateTimeZone14);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = dateTimeFormatter5.getPrinter();
        org.joda.time.Chronology chronology22 = dateTimeFormatter5.getChronolgy();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime26 = localTime24.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int28 = localTime24.get(dateTimeFieldType27);
        org.joda.time.Chronology chronology29 = localTime24.getChronology();
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology29, locale30);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.Chronology chronology33 = chronology32.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter5.withChronology(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now();
        mutableDateTime35.addHours(0);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime35.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime35.getZone();
        int int42 = dateTimeFormatter34.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime35, "Thursday, January 1, 1970 12:00:00 AM +00:00", 54494261);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12:00 AM" + "'", str7, "12:00 AM");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimePrinter21);
        org.junit.Assert.assertNull(chronology22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-54494262) + "'", int42 == (-54494262));
    }

    @Test
    public void test25076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25076");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        long long10 = dateTimeParserBucket8.computeMillis(false);
        long long13 = dateTimeParserBucket8.computeMillis(false, "1970-01-01T00:00:00.000Z");
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        org.joda.time.LocalTime.Property property20 = localTime19.millisOfSecond();
        org.joda.time.LocalTime localTime21 = property20.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 'a', chronology25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.yearOfCentury();
        int int28 = property27.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.roundHalfEven();
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleAttributes();
        int int32 = property27.getMaximumShortTextLength(locale30);
        dateTimeParserBucket8.saveField(dateTimeFieldType22, "Chinese", locale30);
        java.lang.String str34 = locale30.getISO3Country();
        java.util.Locale locale35 = locale30.stripExtensions();
        java.lang.String str36 = locale30.getScript();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 99 + "'", int28 == 99);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "TWN" + "'", str34, "TWN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test25077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25077");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekyear(21);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.DateTime.Property property9 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(54507);
        int int12 = dateTime7.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test25078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25078");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DateTime dateTime5 = property4.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.DateTime dateTime8 = property6.addToCopy(39);
        org.joda.time.DateTime dateTime10 = dateTime8.plus((long) 54691310);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test25079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25079");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.DurationField durationField8 = chronology5.weekyears();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField11 = chronology5.centuryOfEra();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test25080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25080");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate4 = localDate2.minusDays((int) 'a');
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str7 = dateTimeFieldType6.toString();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.yearOfCentury();
        mutableDateTime10.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology14 = null;
        mutableDateTime10.setChronology(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.months();
        mutableDateTime10.add(durationFieldType17, 100);
        org.joda.time.Chronology chronology20 = mutableDateTime10.getChronology();
        boolean boolean21 = dateTimeFieldType6.isSupported(chronology20);
        org.joda.time.LocalDate localDate23 = localDate4.withField(dateTimeFieldType6, 53);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.DateTime dateTime27 = property26.withMinimumValue();
        org.joda.time.DateTime dateTime29 = dateTime27.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime31 = dateTime27.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime27.getZone();
        long long34 = dateTimeZone32.nextTransition(100L);
        long long36 = dateTimeZone32.convertUTCToLocal((long) 46);
        java.lang.String str37 = dateTimeZone32.getID();
        java.lang.String str39 = dateTimeZone32.getName((long) 'u');
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 'a', chronology41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime44 = property43.roundHalfEven();
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime47 = property43.set("22", locale46);
        mutableDateTime47.addYears(10);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfCentury();
        org.joda.time.DateTime dateTime53 = property52.withMinimumValue();
        org.joda.time.DateTime dateTime55 = dateTime53.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime57 = dateTime53.plusMillis(1);
        mutableDateTime47.setDate((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime60 = dateTime57.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.UTC;
        long long64 = dateTimeZone61.getMillisKeepLocal(dateTimeZone62, (long) '#');
        org.joda.time.MutableDateTime mutableDateTime65 = org.joda.time.MutableDateTime.now(dateTimeZone62);
        boolean boolean66 = dateTimeZone62.isFixed();
        long long68 = dateTimeZone62.previousTransition((long) '4');
        org.joda.time.DateTime dateTime69 = dateTime60.withZoneRetainFields(dateTimeZone62);
        long long71 = dateTimeZone32.getMillisKeepLocal(dateTimeZone62, 4460814089L);
        org.joda.time.DateTime dateTime72 = localDate23.toDateTimeAtMidnight(dateTimeZone32);
        int int73 = localDate23.getEra();
        // The following exception was thrown during execution in test generation
        try {
            int int75 = localDate23.getValue(61889);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 61889");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "yearOfCentury" + "'", str7, "yearOfCentury");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 46L + "'", long36 == 46L);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 35L + "'", long64 == 35L);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 52L + "'", long68 == 52L);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 4460814089L + "'", long71 == 4460814089L);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
    }

    @Test
    public void test25081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25081");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder0.build();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.plus(readablePeriod8);
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfDay();
        org.joda.time.DurationField durationField11 = property10.getDurationField();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        long long15 = dateTimeField12.add((-259199980L), (int) (short) 1);
        boolean boolean16 = dateTimeField12.isSupported();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale20 = builder18.build();
        java.lang.String str21 = dateTimeField12.getAsText(10, locale20);
        java.util.Locale.Builder builder22 = builder0.setLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = locale20.getUnicodeLocaleType("2022-02-21T15:15:29.009Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-21T15:15:29.009Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-259199979L) + "'", long15 == (-259199979L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test25082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25082");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime7 = property6.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.LocalTime localTime9 = property6.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfDay(1);
        org.joda.time.LocalTime.Property property12 = localTime9.minuteOfHour();
        org.joda.time.LocalTime localTime14 = localTime9.minusMinutes(54549194);
        org.joda.time.LocalTime localTime16 = localTime9.plusMillis(54585708);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime9.getValue(40436006);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 40436006");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test25083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25083");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime3.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        int int11 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter0.getPrinter();
        java.util.Locale locale14 = new java.util.Locale("6");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter0.withLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = dateTimeFormatter0.parseLocalDate("2022-02-21T15:12:36.290");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T15:12:36.290\" is malformed at \"22-02-21T15:12:36.290\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
        org.junit.Assert.assertNotNull(dateTimePrinter12);
        org.junit.Assert.assertEquals(locale14.toString(), "6");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test25084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25084");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((long) 1);
        mutableDateTime10.addDays((int) (short) 100);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime19 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime20 = property15.roundHalfCeilingCopy();
        mutableDateTime10.setTime((org.joda.time.ReadableInstant) dateTime20);
        int int22 = mutableDateTime10.getSecondOfDay();
        mutableDateTime10.addMillis(75600097);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test25085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25085");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDefaultYear(1998);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        int int4 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtStartOfDay(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate5.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property12 = localDate5.yearOfEra();
        org.joda.time.LocalDate localDate13 = property12.roundCeilingCopy();
        org.joda.time.LocalDate localDate15 = property12.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.LocalDate localDate17 = localDate15.plusMonths(0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 'a', chronology19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfWeek();
        org.joda.time.DateTime dateTime22 = mutableDateTime20.toDateTime();
        boolean boolean23 = localDate17.equals((java.lang.Object) mutableDateTime20);
        org.joda.time.DateTime dateTime24 = mutableDateTime20.toDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.days();
        mutableDateTime20.add(durationFieldType25, (int) 'x');
        java.lang.String str28 = dateTimeFormatter3.print((org.joda.time.ReadableInstant) mutableDateTime20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime30 = dateTimeFormatter3.parseMutableDateTime("2020-03-23");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2020-03-23\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1998 + "'", int4 == 1998);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Friday, May 1, 1970 12:00:00 AM +00:00" + "'", str28, "Friday, May 1, 1970 12:00:00 AM +00:00");
    }

    @Test
    public void test25086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25086");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int9 = localTime5.get(dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = localTime5.getChronology();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology10, locale11);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.DurationField durationField15 = chronology13.halfdays();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) '#', chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.dayOfWeek();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(chronology13);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = durationFieldType1.getField(chronology13);
        java.lang.String str21 = durationFieldType1.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "years" + "'", str2, "years");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "years" + "'", str21, "years");
    }

    @Test
    public void test25087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25087");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime11.getZone();
        boolean boolean17 = property6.equals((java.lang.Object) dateTimeZone16);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder19.setExtension('a', "");
        java.util.Locale.Builder builder23 = builder19.clear();
        java.util.Locale locale24 = builder19.build();
        java.util.Locale locale25 = builder19.build();
        java.lang.String str26 = locale25.toLanguageTag();
        java.lang.String str27 = dateTimeZone16.getShortName(82800010L, locale25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone16);
        long long32 = dateTimeZone16.convertLocalToUTC((long) 922, false);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "und" + "'", str26, "und");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 922L + "'", long32 == 922L);
    }

    @Test
    public void test25088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25088");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime3.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        int int11 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter0.withDefaultYear(54348);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter13.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatter15.getPrinter();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 'a', chronology18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.yearOfCentury();
        mutableDateTime19.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology23 = null;
        mutableDateTime19.setChronology(chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a', chronology26);
        mutableDateTime27.addWeekyears((int) (byte) -1);
        int int30 = mutableDateTime27.getDayOfMonth();
        mutableDateTime27.setWeekyear((int) (short) 0);
        boolean boolean33 = mutableDateTime19.isAfter((org.joda.time.ReadableInstant) mutableDateTime27);
        long long34 = mutableDateTime27.getMillis();
        mutableDateTime27.addHours(99);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime27.weekyear();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfCentury();
        org.joda.time.DateTime dateTime42 = dateTime39.withSecondOfMinute(0);
        mutableDateTime27.setDate((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime.Property property44 = dateTime39.hourOfDay();
        org.joda.time.DateTime dateTime45 = property44.roundHalfFloorCopy();
        java.util.Locale.Builder builder46 = new java.util.Locale.Builder();
        java.util.Locale locale47 = builder46.build();
        java.lang.String str49 = locale47.getExtension('x');
        java.lang.String str50 = property44.getAsShortText(locale47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter15.withLocale(locale47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter51.withOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-101) + "'", int11 == (-101));
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimePrinter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimePrinter16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-62166787199903L) + "'", long34 == (-62166787199903L));
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "15" + "'", str50, "15");
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
    }

    @Test
    public void test25089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25089");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekyear(909);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(100);
        org.joda.time.DateTime dateTime9 = dateTime5.plusDays(54352);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int14 = localTime10.get(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localTime10.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.months();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.year();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = dateTimeField18.getType();
        org.joda.time.DateTime.Property property20 = dateTime5.property(dateTimeFieldType19);
        org.joda.time.DateTime dateTime22 = dateTime5.plusDays(448);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears(253);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test25090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25090");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        java.lang.String str10 = dateTimeField6.toString();
        int int12 = dateTimeField6.getMinimumValue((long) 10);
        java.lang.String str14 = dateTimeField6.getAsText(5543L);
        long long17 = dateTimeField6.addWrapField((long) 54905311, 54843);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[millisOfDay]" + "'", str10, "DateTimeField[millisOfDay]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "5543" + "'", str14, "5543");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 54960154L + "'", long17 == 54960154L);
    }

    @Test
    public void test25091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25091");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours((int) ' ');
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, 2);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtMidnight(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test25092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25092");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        long long10 = dateTimeParserBucket8.computeMillis(false);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readablePeriod13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        long long20 = dateTimeField17.add((-259199980L), (int) (short) 1);
        boolean boolean21 = dateTimeField17.isSupported();
        dateTimeParserBucket8.saveField(dateTimeField17, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime28 = localTime26.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int30 = localTime26.get(dateTimeFieldType29);
        org.joda.time.Chronology chronology31 = localTime26.getChronology();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology31, locale32);
        org.joda.time.Chronology chronology34 = dateTimeParserBucket33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.monthOfYear();
        org.joda.time.Chronology chronology36 = chronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType24.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfEra();
        dateTimeParserBucket8.saveField(dateTimeField38, 292278993);
        org.joda.time.Chronology chronology41 = dateTimeParserBucket8.getChronology();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-259199979L) + "'", long20 == (-259199979L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(chronology41);
    }

    @Test
    public void test25093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25093");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology5.add(readablePeriod7, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField11 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology5);
        mutableDateTime13.addSeconds((int) '4');
        int int16 = mutableDateTime13.getSecondOfDay();
        mutableDateTime13.addYears(1970);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime13.yearOfEra();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4460736516L + "'", long10 == 4460736516L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 54981 + "'", int16 == 54981);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test25094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25094");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfCentury();
        int int5 = localDateTime3.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusHours(558);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(62023);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 66 + "'", int5 == 66);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test25095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25095");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekyear(21);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime10.minusYears(0);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int18 = localTime14.get(dateTimeFieldType17);
        org.joda.time.DateTime dateTime19 = dateTime13.withFields((org.joda.time.ReadablePartial) localTime14);
        boolean boolean20 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int26 = localTime22.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.now(chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology27);
        int int30 = mutableDateTime29.getSecondOfMinute();
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean34 = localTime32.isSupported(dateTimeFieldType33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime29.property(dateTimeFieldType33);
        mutableDateTime29.setMillis((long) 54341029);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfCentury();
        org.joda.time.DateTime dateTime42 = dateTime39.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime39.toMutableDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = mutableDateTime29.toDateTime(dateTimeZone43);
        long long47 = dateTimeZone43.convertUTCToLocal((long) 17268551);
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(1L, dateTimeZone43);
        org.joda.time.DateTime dateTime49 = dateTime19.toDateTime(dateTimeZone43);
        int int50 = dateTime19.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29 + "'", int30 == 29);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 17268551L + "'", long47 == 17268551L);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 22 + "'", int50 == 22);
    }

    @Test
    public void test25096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25096");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
        boolean boolean4 = strSet1.remove((java.lang.Object) mutableDateTime3);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "");
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder[] builderArray14 = new java.util.Locale.Builder[] { builder5, builder12, builder13 };
        java.util.Locale.Builder[] builderArray15 = strSet1.toArray(builderArray14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "seconds", "Thursday" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
        org.joda.time.DateTime dateTime30 = property29.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime32 = property29.addWrapFieldToCopy(20);
        long long33 = property29.remainder();
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale35 = java.util.Locale.CANADA;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.lang.String str37 = locale35.getDisplayScript();
        java.util.Locale.setDefault(category34, locale35);
        java.lang.String str39 = property29.getAsShortText(locale35);
        java.util.Set<java.lang.String> strSet40 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str41 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet40);
        boolean boolean42 = strSet1.containsAll((java.util.Collection<java.lang.String>) strSet40);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.lang.String[] strArray48 = new java.lang.String[] { "seconds", "Thursday" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(chronology54);
        org.joda.time.DateTime.Property property56 = dateTime55.yearOfCentury();
        org.joda.time.DateTime dateTime57 = property56.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime59 = property56.addWrapFieldToCopy(20);
        long long60 = property56.remainder();
        java.util.Locale.Category category61 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale62 = java.util.Locale.CANADA;
        java.util.Locale locale63 = locale62.stripExtensions();
        java.lang.String str64 = locale62.getDisplayScript();
        java.util.Locale.setDefault(category61, locale62);
        java.lang.String str66 = property56.getAsShortText(locale62);
        java.util.Set<java.lang.String> strSet67 = locale62.getUnicodeLocaleAttributes();
        java.lang.String str68 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strSet67);
        boolean boolean69 = strSet1.addAll((java.util.Collection<java.lang.String>) strSet67);
        java.util.Spliterator<java.lang.String> strSpliterator70 = strSet67.spliterator();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builderArray14);
        org.junit.Assert.assertNotNull(builderArray15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 4461329596L + "'", long33 == 4461329596L);
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.FORMAT + "'", category34.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "22" + "'", str39, "22");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 4461329596L + "'", long60 == 4461329596L);
        org.junit.Assert.assertTrue("'" + category61 + "' != '" + java.util.Locale.Category.FORMAT + "'", category61.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "22" + "'", str66, "22");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strSpliterator70);
    }

    @Test
    public void test25097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25097");
        java.lang.String[] strArray36 = new java.lang.String[] { "\ufffd\ufffd\ufffd\ufffd 12:00 AM", "UTC", "0", "1/1/32 12:00 AM", "12:00 AM", "English (Canada)", "DateTimeField[millisOfDay]", "0001-01-03T23:59:59.001", "12:00:00 AM +00:00", "en", "22", "secondOfDay", "2022-02-21T15:05:40.918", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "0001-01-03T23:59:59.001", "Thursday", "secondOfDay", "1/1/32 12:00 AM", "\ud55c\uad6d\uc5b4", "4", "en_CA", "DateTimeField[millisOfDay]", "en_CA", "Jan", "Dec 29, 1969", "", "12:00 AM", "2022-02-21T15:05:37.737Z", "0", "English (Canada)", "100", "secondOfDay", "100", "Property[dayOfMonth]", "4", "1/1/70 12:00 AM" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        java.lang.Object obj39 = null;
        boolean boolean40 = strSet37.remove(obj39);
        java.util.Locale locale41 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology43);
        boolean boolean45 = strSet42.remove((java.lang.Object) mutableDateTime44);
        java.util.Locale.Builder builder46 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder49 = builder46.setExtension('a', "");
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder53 = builder50.setExtension('a', "");
        java.util.Locale.Builder builder54 = new java.util.Locale.Builder();
        java.util.Locale.Builder[] builderArray55 = new java.util.Locale.Builder[] { builder46, builder53, builder54 };
        java.util.Locale.Builder[] builderArray56 = strSet42.toArray(builderArray55);
        java.io.IOException iOException58 = new java.io.IOException("00:00:00.097");
        java.lang.Throwable throwable61 = null;
        java.io.IOException iOException62 = new java.io.IOException("22", throwable61);
        java.io.IOException iOException63 = new java.io.IOException("English (Canada)", (java.lang.Throwable) iOException62);
        java.io.IOException iOException64 = new java.io.IOException((java.lang.Throwable) iOException62);
        iOException58.addSuppressed((java.lang.Throwable) iOException62);
        java.lang.Exception[] exceptionArray66 = new java.lang.Exception[] { iOException62 };
        java.lang.Exception[] exceptionArray67 = strSet42.toArray(exceptionArray66);
        boolean boolean68 = strSet37.addAll((java.util.Collection<java.lang.String>) strSet42);
        java.util.stream.Stream<java.lang.String> strStream69 = strSet42.stream();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.lang.String str72 = dateTimeFormatter70.print((-259199980L));
        int int73 = dateTimeFormatter70.getDefaultYear();
        boolean boolean74 = dateTimeFormatter70.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter70.withPivotYear((java.lang.Integer) 54359);
        boolean boolean77 = strSet42.equals((java.lang.Object) dateTimeFormatter70);
        org.joda.time.LocalDate localDate78 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate80 = localDate78.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate82 = localDate80.minusDays((int) 'a');
        org.joda.time.LocalDate.Property property83 = localDate80.era();
        int int84 = localDate80.getYearOfCentury();
        org.joda.time.Chronology chronology85 = localDate80.getChronology();
        org.joda.time.LocalDate localDate87 = localDate80.plusWeeks(56);
        org.joda.time.LocalDate localDate89 = localDate87.plusYears(74100000);
        java.lang.String str90 = dateTimeFormatter70.print((org.joda.time.ReadablePartial) localDate89);
        org.joda.time.LocalDate localDate92 = localDate89.plusDays(54745696);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builderArray55);
        org.junit.Assert.assertNotNull(builderArray56);
        org.junit.Assert.assertNotNull(exceptionArray66);
        org.junit.Assert.assertNotNull(exceptionArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strStream69);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Dec 29, 1969" + "'", str72, "Dec 29, 1969");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2000 + "'", int73 == 2000);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(localDate82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 22 + "'", int84 == 22);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(localDate87);
        org.junit.Assert.assertNotNull(localDate89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Mar 20, 74102023" + "'", str90, "Mar 20, 74102023");
        org.junit.Assert.assertNotNull(localDate92);
    }

    @Test
    public void test25098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25098");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        java.lang.String str5 = dateTime3.toString();
        org.joda.time.DateTime dateTime7 = dateTime3.minus((-31449599903L));
        org.joda.time.DateTime.Property property8 = dateTime3.monthOfYear();
        org.joda.time.DateTime dateTime9 = property8.withMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime9);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int17 = localTime13.get(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology18, locale19);
        org.joda.time.DateTimeZone dateTimeZone21 = chronology18.getZone();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField23 = chronology18.dayOfYear();
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeField23.getAsText((long) 152, locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withPivotYear((int) (short) 0);
        boolean boolean31 = dateTimeFormatter30.isPrinter();
        org.joda.time.Chronology chronology32 = dateTimeFormatter30.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter30.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter30.withPivotYear((java.lang.Integer) 66);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfCentury();
        org.joda.time.DateTime dateTime39 = property38.withMinimumValue();
        org.joda.time.DateTime dateTime41 = dateTime39.minusYears(2);
        int int42 = dateTime41.getDayOfMonth();
        org.joda.time.DateTime.Property property43 = dateTime41.year();
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime41.getZone();
        java.lang.String str46 = dateTimeZone44.getNameKey((long) (-1));
        long long50 = dateTimeZone44.convertLocalToUTC((long) 1940, false, (long) 70);
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.now(dateTimeZone44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter35.withZone(dateTimeZone44);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((java.lang.Object) str26, dateTimeZone44);
        mutableDateTime11.setZoneRetainFields(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21T15:15:29.650Z" + "'", str5, "2022-02-21T15:15:29.650Z");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1" + "'", str26, "1");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 21 + "'", int42 == 21);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1940L + "'", long50 == 1940L);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
    }

    @Test
    public void test25099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25099");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        boolean boolean2 = dateTimeFormatter0.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25100");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTime dateTime7 = property4.addWrapFieldToCopy((int) '#');
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(53);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.plus(readableDuration11);
        org.joda.time.DateTime dateTime14 = dateTime7.minus(4460789454L);
        java.util.Date date15 = dateTime14.toDate();
        org.joda.time.DateTime dateTime17 = dateTime14.minusYears(54389);
        org.joda.time.DateTime.Property property18 = dateTime14.millisOfDay();
        org.joda.time.DateTime dateTime19 = property18.roundFloorCopy();
        int int20 = dateTime19.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:09:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test25101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        mutableDateTime7.addYears(10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis(1);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime7.add(readablePeriod19, (int) (short) 0);
        org.joda.time.Chronology chronology22 = mutableDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(chronology22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a', chronology26);
        mutableDateTime27.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime27.secondOfDay();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 'a', chronology32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.yearOfCentury();
        mutableDateTime33.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology37 = null;
        mutableDateTime33.setChronology(chronology37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.weekyear();
        org.joda.time.MutableDateTime mutableDateTime41 = property39.add((long) 1);
        mutableDateTime41.addDays((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime41.add(readablePeriod44);
        org.joda.time.DateTime dateTime46 = mutableDateTime41.toDateTime();
        java.util.TimeZone timeZone48 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        mutableDateTime41.setZone(dateTimeZone50);
        mutableDateTime27.setZone(dateTimeZone50);
        org.joda.time.Chronology chronology53 = chronology22.withZone(dateTimeZone50);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.minuteOfHour();
        java.util.Locale.Builder builder57 = new java.util.Locale.Builder();
        java.util.Locale locale58 = java.util.Locale.JAPAN;
        java.util.Locale.Builder builder59 = builder57.setLocale(locale58);
        java.util.Locale.Builder builder61 = builder57.setLanguage("");
        java.util.Locale.Builder builder62 = builder57.clearExtensions();
        java.util.Locale locale63 = builder57.build();
        java.lang.String str64 = dateTimeField55.getAsShortText(86399043, locale63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeField55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "_JP");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "86399043" + "'", str64, "86399043");
    }

    @Test
    public void test25102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25102");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("jpn");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"jpn\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25103");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(788972743151L);
        org.joda.time.LocalTime localTime3 = localTime1.minusMillis(686);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test25104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25104");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        int int6 = property5.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.roundHalfEven();
        mutableDateTime7.addDays(6);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate14 = localDate12.minusDays((int) 'a');
        org.joda.time.LocalDate.Property property15 = localDate14.era();
        org.joda.time.LocalDate localDate16 = property15.roundHalfCeilingCopy();
        int int17 = localDate16.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate19 = localDate16.plusDays(21);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime23 = property22.withMinimumValue();
        org.joda.time.DateTime dateTime25 = dateTime23.minusYears(2);
        int int26 = dateTime25.getDayOfMonth();
        org.joda.time.DateTime.Property property27 = dateTime25.year();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime25.getZone();
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.lang.String str31 = dateTimeZone28.getName((long) 43, locale30);
        org.joda.time.DateTime dateTime32 = localDate16.toDateTimeAtCurrentTime(dateTimeZone28);
        mutableDateTime7.setZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime7.getZone();
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        java.lang.String str36 = timeZone35.getID();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 21 + "'", int26 == 21);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
    }

    @Test
    public void test25105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25105");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        boolean boolean6 = dateTime4.isAfter(345653329L);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.minus(readableDuration7);
        org.joda.time.YearMonthDay yearMonthDay9 = dateTime8.toYearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = yearMonthDay9.getField(164);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 164");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(yearMonthDay9);
    }

    @Test
    public void test25106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25106");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) 10, chronology1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.withHourOfDay((int) (short) 10);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        java.lang.String str8 = property6.getName();
        org.joda.time.LocalTime localTime9 = property6.roundFloorCopy();
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime12 = localTime9.minusSeconds((int) (byte) 0);
        org.joda.time.LocalTime localTime14 = localTime9.plusMillis(54832);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "minuteOfHour" + "'", str8, "minuteOfHour");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test25107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25107");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long13 = dateTimeZone10.getMillisKeepLocal(dateTimeZone11, (long) '#');
        java.lang.String str14 = dateTimeZone11.getID();
        int int16 = dateTimeZone11.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology17);
        int int20 = mutableDateTime19.getEra();
        int int21 = mutableDateTime19.getRoundingMode();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.dayOfWeek();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test25108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25108");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusDays((-101));
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfDay();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(257);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test25109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25109");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(37);
        long long4 = dateTimeZone1.adjustOffset(0L, true);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.minusYears(2);
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DateTime.Property property12 = dateTime10.year();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime10.getZone();
        java.lang.String str15 = dateTimeZone13.getNameKey((long) (-1));
        long long19 = dateTimeZone13.convertLocalToUTC((long) 1940, false, (long) 70);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTimeISO();
        mutableDateTime22.setWeekyear(54361031);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a', chronology26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.yearOfCentury();
        mutableDateTime27.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.plus(readablePeriod33);
        mutableDateTime27.setTime((org.joda.time.ReadableInstant) dateTime34);
        mutableDateTime27.addMonths((-59));
        int int38 = mutableDateTime27.getYearOfCentury();
        int int39 = mutableDateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime27.add(readableDuration40, (int) 'u');
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(732);
        mutableDateTime27.setZone(dateTimeZone44);
        long long47 = dateTimeZone1.getMillisKeepLocal(dateTimeZone44, (long) 101);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1940L + "'", long19 == 1940L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 65 + "'", int38 == 65);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 133199369L + "'", long47 == 133199369L);
    }

    @Test
    public void test25110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25110");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.Chronology chronology10 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.minuteOfDay();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getScript();
        int int16 = dateTimeField13.getMaximumTextLength(locale14);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test25111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25111");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean6 = timeZone2.observesDaylightTime();
        int int7 = timeZone2.getRawOffset();
        int int9 = timeZone2.getOffset(4460789454L);
        java.time.ZoneId zoneId10 = timeZone2.toZoneId();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone(zoneId10);
        boolean boolean12 = timeZone11.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test25112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25112");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) (-259199980L));
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMinutes((-8));
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readableDuration13);
        int int15 = localDateTime12.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusSeconds(86399043);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withDayOfMonth(54832);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54832 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-259199979L) + "'", long9 == (-259199979L));
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 362 + "'", int15 == 362);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test25113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(39);
        long long3 = dateTimeZone1.nextTransition(2170L);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusDays((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusYears(46);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minus(readablePeriod14);
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2170L + "'", long3 == 2170L);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test25114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25114");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("2022-02-21T15:14:15.253");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-21t15:14:15.253");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25115");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfEra(39, (int) (byte) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendDayOfWeek(99);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendSecondOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder14.appendDayOfMonth(45);
        boolean boolean21 = dateTimeFormatterBuilder20.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendSecondOfDay(1888);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test25116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25116");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendMillisOfSecond(20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendClockhourOfDay((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatterBuilder11.toFormatter();
        java.util.Locale locale13 = dateTimeFormatter12.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withDefaultYear(99);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a', chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.yearOfCentury();
        mutableDateTime18.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology22 = null;
        mutableDateTime18.setChronology(chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 'a', chronology25);
        mutableDateTime26.addWeekyears((int) (byte) -1);
        int int29 = mutableDateTime26.getDayOfMonth();
        mutableDateTime26.setWeekyear((int) (short) 0);
        boolean boolean32 = mutableDateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime26);
        long long33 = mutableDateTime26.getMillis();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime26.copy();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfWeek();
        mutableDateTime34.setMinuteOfDay(0);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime34.secondOfMinute();
        int int41 = dateTimeFormatter15.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime34, "10:02:10.021", 83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter15.withOffsetParsed();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-62166787199903L) + "'", long33 == (-62166787199903L));
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-84) + "'", int41 == (-84));
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
    }

    @Test
    public void test25117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25117");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendMillisOfSecond(20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime15 = localTime12.withField(dateTimeFieldType13, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder9.appendFixedSignedDecimal(dateTimeFieldType13, 1998);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str19 = dateTimeFieldType18.toString();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 'a', chronology21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.yearOfCentury();
        mutableDateTime22.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology26 = null;
        mutableDateTime22.setChronology(chronology26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.months();
        mutableDateTime22.add(durationFieldType29, 100);
        org.joda.time.Chronology chronology32 = mutableDateTime22.getChronology();
        boolean boolean33 = dateTimeFieldType18.isSupported(chronology32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder9.appendFraction(dateTimeFieldType18, 47, 926);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalTime localTime42 = localTime39.withPeriodAdded(readablePeriod40, (int) (byte) -1);
        int int43 = localTime42.size();
        org.joda.time.LocalTime localTime45 = localTime42.plusSeconds(6);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((long) (short) 10, chronology47);
        org.joda.time.LocalTime localTime50 = localTime48.plusMillis(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int52 = localTime48.get(dateTimeFieldType51);
        java.lang.String str53 = dateTimeFieldType51.getName();
        int int54 = localTime42.get(dateTimeFieldType51);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder36.appendShortText(dateTimeFieldType51);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder55.appendDayOfYear(53);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder55.appendCenturyOfEra(54474, 54624);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "yearOfCentury" + "'", str19, "yearOfCentury");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hourOfDay" + "'", str53, "hourOfDay");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
    }

    @Test
    public void test25118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25118");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        mutableDateTime10.setSecondOfDay(22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 'a', chronology24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.yearOfCentury();
        mutableDateTime25.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology29 = null;
        mutableDateTime25.setChronology(chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 'a', chronology32);
        mutableDateTime33.addWeekyears((int) (byte) -1);
        int int36 = mutableDateTime33.getDayOfMonth();
        mutableDateTime33.setWeekyear((int) (short) 0);
        boolean boolean39 = mutableDateTime25.isAfter((org.joda.time.ReadableInstant) mutableDateTime33);
        long long40 = mutableDateTime33.getMillis();
        org.joda.time.ReadableDuration readableDuration41 = null;
        mutableDateTime33.add(readableDuration41);
        mutableDateTime10.setDate((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        long long47 = dateTimeZone44.getMillisKeepLocal(dateTimeZone45, (long) '#');
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(dateTimeZone44);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) 'a', chronology50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.yearOfCentury();
        mutableDateTime51.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology55 = null;
        mutableDateTime51.setChronology(chronology55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) 'a', chronology58);
        mutableDateTime59.addWeekyears((int) (byte) -1);
        int int62 = mutableDateTime59.getDayOfMonth();
        mutableDateTime59.setWeekyear((int) (short) 0);
        boolean boolean65 = mutableDateTime51.isAfter((org.joda.time.ReadableInstant) mutableDateTime59);
        long long66 = mutableDateTime59.getMillis();
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.years();
        mutableDateTime59.add(durationFieldType67, 40);
        org.joda.time.LocalDate localDate71 = localDate48.withFieldAdded(durationFieldType67, 15);
        mutableDateTime10.add(durationFieldType67, 83);
        mutableDateTime10.setMillis((long) 54383493);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime10.era();
        mutableDateTime10.setWeekyear(589);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-62166787199903L) + "'", long17 == (-62166787199903L));
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-62166787199903L) + "'", long40 == (-62166787199903L));
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 35L + "'", long47 == 35L);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-62166787199903L) + "'", long66 == (-62166787199903L));
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(property77);
    }

    @Test
    public void test25119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25119");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.plus(readablePeriod8);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) dateTime9);
        mutableDateTime2.add((-172800000L));
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) '4');
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str17 = durationFieldType16.toString();
        boolean boolean18 = localDate13.isSupported(durationFieldType16);
        java.lang.String str19 = localDate13.toString();
        org.joda.time.LocalDate localDate21 = localDate13.withWeekOfWeekyear(23);
        org.joda.time.Chronology chronology22 = localDate13.getChronology();
        org.joda.time.LocalDate.Property property23 = localDate13.dayOfWeek();
        org.joda.time.LocalDate localDate24 = property23.roundCeilingCopy();
        int int25 = localDate24.getDayOfWeek();
        java.lang.String str26 = localDate24.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int28 = localDate24.get(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime2.property(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "seconds" + "'", str17, "seconds");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2022-02-21" + "'", str19, "2022-02-21");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022-02-21" + "'", str26, "2022-02-21");
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 21 + "'", int28 == 21);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test25120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25120");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundCeilingCopy();
        org.joda.time.LocalTime localTime5 = property3.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int11 = localTime7.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localTime7.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology12.add(readablePeriod14, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField18 = chronology12.minutes();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.DurationField durationField21 = chronology12.halfdays();
        java.util.Locale locale24 = new java.util.Locale("zh_CN", "Saturday");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 54364690, chronology12, locale24);
        java.lang.String str26 = property3.getAsText(locale24);
        org.joda.time.DateTimeField dateTimeField27 = property3.getField();
        org.joda.time.LocalTime localTime29 = property3.addWrapFieldToCopy(84);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4460736516L + "'", long17 == 4460736516L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_cn_SATURDAY");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(localTime29);
    }

    @Test
    public void test25121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25121");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        mutableDateTime10.addHours(99);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime10.weekyear();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType21, 1970);
        org.joda.time.Instant instant24 = mutableDateTime10.toInstant();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a', chronology26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfEven();
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime32 = property28.set("22", locale31);
        mutableDateTime32.addYears(10);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfCentury();
        org.joda.time.DateTime dateTime38 = property37.withMinimumValue();
        org.joda.time.DateTime dateTime40 = dateTime38.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime42 = dateTime38.plusMillis(1);
        mutableDateTime32.setDate((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime32.add(readablePeriod44, (int) 'u');
        mutableDateTime32.setYear(99);
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) mutableDateTime32);
        int int50 = mutableDateTime32.getWeekyear();
        mutableDateTime32.setMillis((long) 55);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-62166787199903L) + "'", long17 == (-62166787199903L));
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 99 + "'", int50 == 99);
    }

    @Test
    public void test25122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25122");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        boolean boolean4 = localTime2.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.plus(readablePeriod5);
        java.lang.String str7 = localTime6.toString();
        org.joda.time.LocalTime localTime9 = localTime6.plusMillis(39);
        int int11 = localTime6.getValue(0);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int17 = localTime13.get(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology18, locale19);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.year();
        long long24 = dateTimeField21.set((long) (byte) 0, (int) (byte) 1);
        long long26 = dateTimeField21.remainder((long) (short) -1);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology28);
        org.joda.time.LocalTime.Property property30 = localTime29.hourOfDay();
        org.joda.time.LocalTime localTime31 = property30.withMaximumValue();
        org.joda.time.LocalTime localTime32 = property30.roundHalfCeilingCopy();
        java.util.Locale locale33 = null;
        java.lang.String str34 = property30.getAsShortText(locale33);
        org.joda.time.LocalTime localTime36 = property30.addCopy((long) 42);
        org.joda.time.LocalTime localTime38 = localTime36.minusSeconds(6001);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeField21.getAsShortText((org.joda.time.ReadablePartial) localTime36, 54392189, locale40);
        int int42 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.LocalTime.Property property43 = localTime36.hourOfDay();
        org.joda.time.LocalTime localTime44 = property43.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00:00:00.001" + "'", str7, "00:00:00.001");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-62135596800000L) + "'", long24 == (-62135596800000L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 31535999999L + "'", long26 == 31535999999L);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "54392189" + "'", str41, "54392189");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime44);
    }

    @Test
    public void test25123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25123");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded(readableDuration5, 17268551);
        org.joda.time.DateTime dateTime9 = dateTime4.withMillisOfDay(16);
        org.joda.time.DateTime dateTime11 = dateTime4.minusMillis((-26));
        org.joda.time.DateTime dateTime13 = dateTime4.plusDays(0);
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test25124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25124");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        int int9 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean13 = localTime11.isSupported(dateTimeFieldType12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.property(dateTimeFieldType12);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int20 = localTime16.get(dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = localTime16.getChronology();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology21, locale22);
        mutableDateTime8.setChronology(chronology21);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) 86399983, chronology21);
        org.joda.time.DateTimeField dateTimeField27 = chronology21.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = chronology21.year();
        org.joda.time.DurationField durationField29 = chronology21.days();
        org.joda.time.DateTimeField dateTimeField30 = chronology21.year();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test25125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25125");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (-47));
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test25126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25126");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendWeekyear(39, 5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendMillisOfDay(59);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendDayOfYear(2000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendMinuteOfHour(99);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendWeekyear((int) (short) 1, (-101));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendLiteral("2022-02-21T15:06:24.294");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendMinuteOfHour(897);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder23.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder23.appendTwoDigitYear((-101));
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
    }

    @Test
    public void test25127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25127");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMaximumValue();
        org.joda.time.LocalTime localTime5 = property3.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property3.getAsShortText(locale6);
        org.joda.time.LocalTime localTime9 = property3.addCopy((long) 42);
        org.joda.time.LocalTime localTime11 = localTime9.minusSeconds(6001);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds(101);
        org.joda.time.LocalTime localTime15 = localTime11.minusMillis(54383493);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime11.minus(readablePeriod16);
        org.joda.time.DateTime dateTime18 = localTime11.toDateTimeToday();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test25128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25128");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((-4201L));
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test25129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25129");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) '#');
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 'a', chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.yearOfCentury();
        mutableDateTime7.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology11 = null;
        mutableDateTime7.setChronology(chronology11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 'a', chronology14);
        mutableDateTime15.addWeekyears((int) (byte) -1);
        int int18 = mutableDateTime15.getDayOfMonth();
        mutableDateTime15.setWeekyear((int) (short) 0);
        boolean boolean21 = mutableDateTime7.isAfter((org.joda.time.ReadableInstant) mutableDateTime15);
        long long22 = mutableDateTime15.getMillis();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.years();
        mutableDateTime15.add(durationFieldType23, 40);
        org.joda.time.LocalDate localDate27 = localDate4.withFieldAdded(durationFieldType23, 15);
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra(4);
        org.joda.time.Interval interval30 = localDate29.toInterval();
        org.joda.time.LocalDate.Property property31 = localDate29.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-62166787199903L) + "'", long22 == (-62166787199903L));
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test25130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25130");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime1.toMutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime1.getZone();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime1.withDurationAdded(readableDuration8, 54359);
        boolean boolean11 = dateTime1.isAfterNow();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25131");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(84, 49096217, 867, (-292278994), 84);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292278994 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25132");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfMonth(991);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 991 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test25133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25133");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        int int5 = mutableDateTime2.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.Chronology chronology7 = mutableDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = chronology7.add(readablePeriod9, 48667L, 2022);
        org.joda.time.DateTimeField dateTimeField13 = chronology7.secondOfMinute();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 48667L + "'", long12 == 48667L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test25134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25134");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.plus(readablePeriod8);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) dateTime9);
        mutableDateTime2.addMinutes(292278993);
        java.lang.String str13 = mutableDateTime2.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2525-09-20T03:48:29.979Z" + "'", str13, "2525-09-20T03:48:29.979Z");
    }

    @Test
    public void test25135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25135");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.withDayOfMonth(8);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime7.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test25136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25136");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int11 = localTime7.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localTime7.getChronology();
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology12, locale13);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        long long19 = dateTimeZone16.getMillisKeepLocal(dateTimeZone17, (long) '#');
        java.lang.String str20 = dateTimeZone17.getID();
        int int22 = dateTimeZone17.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology23 = chronology12.withZone(dateTimeZone17);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone17);
        java.lang.String str25 = dateTimeZone17.getID();
        org.joda.time.DateTime dateTime26 = localTime0.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTime dateTime28 = dateTime26.plusYears((-54353560));
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.clockhourOfDay();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test25137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25137");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 'a', chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime17 = mutableDateTime15.toDateTime();
        boolean boolean18 = localDate12.equals((java.lang.Object) mutableDateTime15);
        org.joda.time.LocalDate.Property property19 = localDate12.yearOfEra();
        java.util.Date date20 = localDate12.toDate();
        org.joda.time.LocalDate.Property property21 = localDate12.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Feb 21 00:00:00 UTC 2122");
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test25138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25138");
        java.util.Locale locale3 = new java.util.Locale("15:09", "-4182-02-15T12:06:40.215", "1998-02-21T15:12:45.665Z");
        java.lang.String str4 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "15:09_-4182-02-15T12:06:40.215_1998-02-21T15:12:45.665Z");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1998-02-21T15:12:45.665Z" + "'", str4, "1998-02-21T15:12:45.665Z");
    }

    @Test
    public void test25139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25139");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
        boolean boolean4 = strSet1.remove((java.lang.Object) mutableDateTime3);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "");
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder[] builderArray14 = new java.util.Locale.Builder[] { builder5, builder12, builder13 };
        java.util.Locale.Builder[] builderArray15 = strSet1.toArray(builderArray14);
        java.util.stream.Stream<java.lang.String> strStream16 = strSet1.parallelStream();
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.lang.String str21 = locale18.getDisplayName();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 'a', chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfEven();
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime29 = property25.set("22", locale28);
        java.lang.String str30 = locale18.getDisplayScript(locale28);
        java.util.Locale locale31 = java.util.Locale.ROOT;
        java.lang.String str32 = locale28.getDisplayScript(locale31);
        java.util.Set<java.lang.String> strSet33 = locale28.getUnicodeLocaleKeys();
        boolean boolean34 = strSet1.addAll((java.util.Collection<java.lang.String>) strSet33);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean39 = localTime37.isSupported(dateTimeFieldType38);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder35.appendSignedDecimal(dateTimeFieldType38, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder35.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder35.appendWeekyear(39, 5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder47.appendMillisOfDay(59);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder47.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder50.appendWeekOfWeekyear(20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder50.appendHourOfDay(8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder54.appendTwoDigitWeekyear(107);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder56.appendHalfdayOfDayText();
        boolean boolean58 = strSet1.equals((java.lang.Object) dateTimeFormatterBuilder56);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder56.appendMonthOfYearShortText();
        dateTimeFormatterBuilder56.clear();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builderArray14);
        org.junit.Assert.assertNotNull(builderArray15);
        org.junit.Assert.assertNotNull(strStream16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English (Canada)" + "'", str21, "English (Canada)");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko");
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
    }

    @Test
    public void test25140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25140");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        int int3 = localDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean5 = localDateTime2.isSupported(dateTimeFieldType4);
        int int6 = localDateTime2.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withMillisOfDay(43);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMinutes(39982076);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekyear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test25141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25141");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekyear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology15);
        org.joda.time.LocalTime.Property property17 = localTime16.hourOfDay();
        org.joda.time.LocalTime localTime18 = property17.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime19 = property17.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime20 = property17.withMaximumValue();
        org.joda.time.LocalTime localTime21 = property17.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime23 = localTime21.plusSeconds(54383306);
        int int24 = localTime23.getMillisOfSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.lang.String str28 = dateTimeFormatter26.print((-259199980L));
        int int29 = dateTimeFormatter26.getDefaultYear();
        boolean boolean30 = dateTimeFormatter26.isPrinter();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        org.joda.time.DateTime dateTime35 = dateTime32.minusYears(0);
        org.joda.time.DateTime dateTime37 = dateTime32.withSecondOfMinute(0);
        java.lang.String str38 = dateTimeFormatter26.print((org.joda.time.ReadableInstant) dateTime37);
        java.util.Locale locale41 = new java.util.Locale("February 21, 2022", "February 21, 2022");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter26.withLocale(locale41);
        java.util.Set<java.lang.String> strSet43 = locale41.getUnicodeLocaleAttributes();
        java.lang.String str44 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localTime23, 54565, locale41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = locale41.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for FEBRUARY 21, 2022");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Dec 29, 1969" + "'", str28, "Dec 29, 1969");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2000 + "'", int29 == 2000);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Feb 21, 2022" + "'", str38, "Feb 21, 2022");
        org.junit.Assert.assertEquals(locale41.toString(), "february 21, 2022_FEBRUARY 21, 2022");
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "54565" + "'", str44, "54565");
    }
}
