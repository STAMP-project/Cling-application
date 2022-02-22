import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay(9223372036854775807L);
        org.junit.Assert.assertNotNull(timeOfDay1);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.secondOfMinute();
        org.joda.time.Interval interval4 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime2);
        boolean boolean5 = interval4.isAfterNow();
        org.joda.time.Period period6 = interval4.toPeriod();
        org.joda.time.DateTime dateTime7 = interval4.getEnd();
        java.util.Date date13 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        int int15 = localDate14.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime19 = localDate14.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay20.withYear(1899);
        org.joda.time.Interval interval23 = yearMonthDay20.toInterval();
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay20.withDayOfMonth(12);
        org.joda.time.Interval interval26 = yearMonthDay25.toInterval();
        java.util.Date date35 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.fromDateFields(date35);
        int int37 = localDate36.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime41 = localDate36.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone38);
        org.joda.time.Interval interval43 = dateMidnight42.toInterval();
        boolean boolean44 = interval26.isAfter((org.joda.time.ReadableInterval) interval43);
        org.joda.time.Period period45 = interval43.toPeriod();
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Interval interval47 = interval4.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Period period49 = period45.plusHours(26594);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1899 + "'", int15 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(interval26);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1899 + "'", int37 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(period49);
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withYear(1899);
        org.joda.time.Interval interval15 = yearMonthDay12.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonthDay12.getFieldTypes();
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay12.year();
        org.joda.time.YearMonthDay yearMonthDay18 = property17.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay20 = property17.addToCopy(3);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay20.plusMonths(444);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(yearMonthDay22);
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfSecond();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime4 = property2.withMaximumValue();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis(33);
        boolean boolean7 = dateTime6.isBeforeNow();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusMillis(6);
        org.joda.time.DateTime dateTime8 = timeOfDay4.toDateTimeToday();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str10 = dateTimeFieldType9.toString();
        int int11 = dateTime8.get(dateTimeFieldType9);
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) (-26163695), (-16));
        org.joda.time.DateTime.Property property15 = dateTime8.dayOfMonth();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = timeOfDay5.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minus((long) (short) 0);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(1);
        java.lang.String str14 = period13.toString();
        org.joda.time.Period period15 = period11.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period17 = period11.normalizedStandard(periodType16);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime9, periodType16);
        int int19 = mutablePeriod18.getMonths();
        mutablePeriod18.add((long) 1);
        org.joda.time.MutablePeriod mutablePeriod22 = mutablePeriod18.copy();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period25 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period27 = org.joda.time.Period.minutes(1);
        java.lang.String str28 = period27.toString();
        org.joda.time.Period period29 = period25.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period31 = period29.plusMillis(100);
        org.joda.time.LocalTime localTime32 = localTime23.minus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Period period33 = period29.toPeriod();
        org.joda.time.Period period34 = period29.toPeriod();
        int int35 = period34.getMinutes();
        int int36 = period34.getMonths();
        org.joda.time.Duration duration37 = period34.toStandardDuration();
        mutablePeriod22.setPeriod((org.joda.time.ReadableDuration) duration37);
        mutablePeriod22.add(116L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT1M" + "'", str14, "PT1M");
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PT1M" + "'", str28, "PT1M");
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(duration37);
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        int int11 = dateTimeField9.getLeapAmount((long) '#');
        java.lang.String str13 = dateTimeField9.getAsShortText((long) 1);
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = dateTimeField9.getAsShortText((long) (-1), locale15);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str19 = locale15.getDisplayVariant(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = locale15.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight13 = yearMonthDay12.toDateMidnight();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod();
        mutablePeriod14.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod14.setPeriod((long) 15, chronology18);
        mutablePeriod14.setMinutes(1970);
        mutablePeriod14.addDays((int) ' ');
        int int24 = mutablePeriod14.size();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight13.plus((org.joda.time.ReadablePeriod) mutablePeriod14);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNotNull(dateMidnight25);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getDurationType();
        org.joda.time.DateTime dateTime13 = dateTime9.withField(dateTimeFieldType10, 16);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.hours();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay((long) 38, chronology17);
        boolean boolean20 = dateTimeFieldType10.isSupported(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.seconds();
        java.lang.String str22 = chronology17.toString();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.year();
        long long26 = dateTimeField23.add(1645404771984L, 445);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ISOChronology[UTC]" + "'", str22, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 15688255971984L + "'", long26 == 15688255971984L);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        org.joda.time.Period period17 = period14.negated();
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        boolean boolean26 = period17.equals((java.lang.Object) period25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period28 = period17.withFields((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.LocalDate localDate29 = localDate8.plus((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.Period period31 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period33 = org.joda.time.Period.minutes(1);
        java.lang.String str34 = period33.toString();
        org.joda.time.Period period35 = period31.withFields((org.joda.time.ReadablePeriod) period33);
        int int36 = period31.getMinutes();
        org.joda.time.Period period37 = period31.toPeriod();
        org.joda.time.LocalDate localDate38 = localDate29.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.LocalDate localDate40 = localDate29.withYearOfEra(99);
        java.util.Date date41 = localDate40.toDate();
        date41.setSeconds((int) (byte) 10);
        int int44 = date41.getDay();
        java.time.Instant instant45 = date41.toInstant();
        date41.setSeconds(81);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT1M" + "'", str13, "PT1M");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT1M" + "'", str22, "PT1M");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT1M" + "'", str34, "PT1M");
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Sun Mar 10 00:01:21 GMT+00:00 99");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(instant45);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        long long6 = java.util.Date.UTC(3172000, (-26163695), 27, 26426361, 173, 1975);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 31387707663955000L + "'", long6 == 31387707663955000L);
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withDefaultYear(26227847);
        java.util.Locale locale4 = dateTimeFormatter0.getLocale();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight.Property property30 = dateMidnight15.monthOfYear();
        org.joda.time.DateMidnight dateMidnight31 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField32 = property30.getField();
        org.joda.time.DateMidnight dateMidnight33 = property30.withMaximumValue();
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1899 + "'", int10 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT1M" + "'", str22, "PT1M");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateMidnight33);
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        boolean boolean7 = timeZone3.hasSameRules(timeZone6);
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone6, locale8);
        java.util.Calendar.Builder builder10 = builder0.setTimeZone(timeZone6);
        java.util.Calendar.Builder builder15 = builder0.setTimeOfDay(0, (int) ' ', 12, 11);
        java.util.Calendar.Builder builder20 = builder0.setTimeOfDay(0, 99, 17, 59);
        java.util.Calendar.Builder builder24 = builder0.setDate(13, 1439, 980);
        java.util.Calendar calendar25 = builder24.build();
        java.util.TimeZone timeZone26 = calendar25.getTimeZone();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.fromCalendarFields(calendar25);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645514748747,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=48,MILLISECOND=763,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(calendar25);
        org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=-57888253242957,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=135,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=1,DAY_OF_MONTH=7,DAY_OF_YEAR=219,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=39,SECOND=17,MILLISECOND=59,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusMillis((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra(438);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMillisOfSecond(24);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour(0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 10, chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 10, chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime21.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod26, 15);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getDurationType();
        int int31 = localDateTime28.get(dateTimeFieldType29);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.plusSeconds(12);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withDayOfYear((int) (short) 100);
        org.joda.time.Chronology chronology36 = localDateTime33.getChronology();
        org.joda.time.LocalDateTime.Property property37 = localDateTime33.hourOfDay();
        int int38 = property37.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        int int40 = localDateTime8.get(dateTimeFieldType39);
        int int41 = localDateTime8.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 23 + "'", int38 == 23);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 53 + "'", int41 == 53);
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(6, 11, 5, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks((-60));
        org.joda.time.DateTimeZone dateTimeZone8 = dateTime7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((-1L), (long) 17, chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyear();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(26567, 10, 55, 26497427, 42751, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26497427 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.roundHalfCeilingCopy();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 52, dateTimeZone2);
        java.lang.String str5 = dateTimeZone2.getShortName((long) 50250);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime10.add(readableDuration11, 0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.dayOfWeek();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.yearOfEra();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 5, chronology19);
        org.joda.time.Chronology chronology21 = chronology19.withUTC();
        mutableDateTime10.setChronology(chronology19);
        mutableDateTime10.setDate(1371555988124L);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime10.yearOfCentury();
        java.util.Locale locale26 = java.util.Locale.US;
        int int27 = property25.getMaximumShortTextLength(locale26);
        java.util.Locale.setDefault(locale26);
        java.lang.String str29 = dateTimeZone2.getShortName(315569520000L, locale26);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.016" + "'", str5, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.016" + "'", str29, "+00:00:00.016");
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.hours();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.era();
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(18, 13, chronology4);
        org.joda.time.DateTimeField dateTimeField9 = chronology4.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone10);
        java.lang.String str14 = dateTimeZone10.toString();
        org.joda.time.Chronology chronology15 = chronology4.withZone(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(chronology15);
        org.joda.time.DurationField durationField17 = chronology15.millis();
        long long19 = durationField17.getMillis(26419302);
        long long21 = durationField17.getValueAsLong(0L);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 26419302L + "'", long19 == 26419302L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.secondOfMinute();
        org.joda.time.Interval interval4 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime2);
        boolean boolean5 = interval4.isAfterNow();
        org.joda.time.Period period6 = interval4.toPeriod();
        org.joda.time.DateTime dateTime7 = interval4.getEnd();
        org.joda.time.MutableInterval mutableInterval8 = interval4.toMutableInterval();
        java.util.Date date14 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromDateFields(date14);
        org.joda.time.LocalDate.Property property16 = localDate15.weekOfWeekyear();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeField dateTimeField18 = property16.getField();
        org.joda.time.LocalDate localDate19 = property16.withMaximumValue();
        int int20 = localDate19.size();
        java.util.Date date26 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.fromDateFields(date26);
        int int28 = localDate27.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime32 = localDate27.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay33.withYear(1899);
        org.joda.time.Interval interval36 = yearMonthDay33.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray37 = yearMonthDay33.getFieldTypes();
        org.joda.time.YearMonthDay.Property property38 = yearMonthDay33.year();
        org.joda.time.YearMonthDay yearMonthDay39 = property38.withMaximumValue();
        java.util.Date date45 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.fromDateFields(date45);
        int int47 = localDate46.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        int int50 = dateTimeZone48.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime51 = localDate46.toDateTimeAtCurrentTime(dateTimeZone48);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay(dateTimeZone48);
        org.joda.time.Interval interval53 = yearMonthDay39.toInterval(dateTimeZone48);
        org.joda.time.DateTime dateTime54 = localDate19.toDateTimeAtMidnight(dateTimeZone48);
        org.joda.time.DateTime dateTime56 = dateTime54.minusYears(32);
        org.joda.time.DateTime.Property property57 = dateTime54.minuteOfHour();
        org.joda.time.DateTime dateTime59 = dateTime54.plusYears(79);
        org.joda.time.Interval interval60 = interval4.withStart((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableInterval8);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1899 + "'", int28 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(yearMonthDay39);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1899 + "'", int47 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-4));
        org.joda.time.Period period3 = period1.plusMonths(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        boolean boolean1 = dateTimeFormatter0.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(221);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.hours();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.era();
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(18, 13, chronology4);
        org.joda.time.DateTimeField dateTimeField9 = chronology4.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone10);
        java.lang.String str14 = dateTimeZone10.toString();
        org.joda.time.Chronology chronology15 = chronology4.withZone(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = timeOfDay21.getFields();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTimeToday(dateTimeZone23);
        org.joda.time.DateTime.Property property25 = dateTime24.monthOfYear();
        org.joda.time.DateTime dateTime27 = dateTime24.minusMillis((int) (byte) -1);
        boolean boolean29 = dateTime24.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType30.getDurationType();
        boolean boolean32 = dateTime24.isSupported(dateTimeFieldType30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTime dateTime35 = dateTime34.toDateTime();
        boolean boolean36 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateTime35);
        int int37 = dateTime24.getYearOfEra();
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period40 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period42 = org.joda.time.Period.minutes(1);
        java.lang.String str43 = period42.toString();
        org.joda.time.Period period44 = period40.withFields((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period46 = period44.plusMillis(100);
        org.joda.time.LocalTime localTime47 = localTime38.minus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Period period49 = period44.plusHours((int) 'a');
        org.joda.time.DateTime dateTime51 = dateTime24.withPeriodAdded((org.joda.time.ReadablePeriod) period49, 5);
        org.joda.time.DateTime dateTime53 = dateTime51.plusMinutes(32770);
        boolean boolean54 = dateMidnight16.isEqual((org.joda.time.ReadableInstant) dateTime51);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PT1M" + "'", str43, "PT1M");
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime3 = property2.roundHalfEvenCopy();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = timeOfDay12.getFields();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTimeToday(dateTimeZone14);
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        java.lang.String str20 = period19.toString();
        org.joda.time.Period period21 = period17.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period23 = period17.normalizedStandard(periodType22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateTime15, periodType22);
        org.joda.time.PeriodType periodType25 = periodType22.withMillisRemoved();
        org.joda.time.Period period26 = interval6.toPeriod(periodType25);
        boolean boolean27 = interval6.isAfterNow();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = timeOfDay32.toDateTimeToday(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime38 = dateTime34.plusDays((int) (byte) -1);
        java.util.Date date39 = dateTime38.toDate();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime38, readableDuration40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime45.add(readableDuration46, 0);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime45.dayOfWeek();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType51.getDurationType();
        mutableDateTime45.set(dateTimeFieldType51, (int) ' ');
        boolean boolean55 = interval41.isAfter((org.joda.time.ReadableInstant) mutableDateTime45);
        java.lang.Object obj56 = null;
        boolean boolean57 = interval41.equals(obj56);
        org.joda.time.Duration duration58 = interval41.toDuration();
        org.joda.time.Interval interval59 = interval6.withDurationAfterStart((org.joda.time.ReadableDuration) duration58);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(17, 26165226, 3, 26190505);
        mutablePeriod64.setValue(4, 0);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.TimeOfDay timeOfDay73 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray74 = timeOfDay73.getFields();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = timeOfDay73.toDateTimeToday(dateTimeZone75);
        org.joda.time.DateTime.Property property77 = dateTime76.monthOfYear();
        org.joda.time.DateTime dateTime79 = dateTime76.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateTime dateTime81 = dateTime79.toDateTime(chronology80);
        int int82 = dateTime79.getMillisOfDay();
        org.joda.time.Interval interval83 = new org.joda.time.Interval(readablePeriod68, (org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.Duration duration84 = interval83.toDuration();
        org.joda.time.Period period85 = duration84.toPeriod();
        mutablePeriod64.setPeriod((org.joda.time.ReadableDuration) duration84);
        int int87 = duration58.compareTo((org.joda.time.ReadableDuration) duration84);
        org.joda.time.Interval interval88 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableDuration) duration58);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT1M" + "'", str20, "PT1M");
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(dateTimeFieldArray74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3172001 + "'", int82 == 3172001);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusMillis((int) (short) 0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusDays(26383497);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        boolean boolean6 = timeZone2.hasSameRules(timeZone5);
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5, locale7);
        boolean boolean9 = calendar8.isWeekDateSupported();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        long long11 = calendar8.getTimeInMillis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645514748992,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=49,MILLISECOND=8,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1645514748992L + "'", long11 == 1645514748992L);
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = timeOfDay6.toDateTimeToday(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withCenturyOfEra(10);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.Chronology chronology12 = dateTime10.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(15, 5, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        java.lang.String str15 = dateTimeField14.getName();
        int int17 = dateTimeField14.get((long) 79);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "clockhourOfDay" + "'", str15, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 24 + "'", int17 == 24);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.Period period18 = new org.joda.time.Period(7, (int) (byte) 10, 5, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.withPeriodAdded((org.joda.time.ReadablePeriod) period18, 1970);
        org.joda.time.Period period22 = period18.plusMinutes((-3172001));
        int int23 = period22.getMillis();
        org.joda.time.Period period24 = period22.toPeriod();
        int int25 = period22.getYears();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
        boolean boolean13 = interval2.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfCentury(16);
        boolean boolean24 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = timeOfDay29.toDateTimeToday(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime35 = dateTime31.plusDays((int) (byte) -1);
        java.util.Date date36 = dateTime35.toDate();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, readableDuration37);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime45.add(readableDuration46, 0);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime45.dayOfWeek();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime51 = property50.roundHalfEven();
        boolean boolean52 = interval41.isBefore((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray58 = timeOfDay57.getFields();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTimeToday(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.withYearOfCentury(16);
        boolean boolean63 = interval41.isAfter((org.joda.time.ReadableInstant) dateTime62);
        boolean boolean64 = interval38.abuts((org.joda.time.ReadableInterval) interval41);
        org.joda.time.Interval interval65 = interval2.overlap((org.joda.time.ReadableInterval) interval38);
        org.joda.time.Duration duration66 = interval2.toDuration();
        org.joda.time.MutableInterval mutableInterval67 = interval2.toMutableInterval();
        org.joda.time.Interval interval68 = interval2.toInterval();
        org.joda.time.MutableInterval mutableInterval69 = interval2.toMutableInterval();
        org.joda.time.DateTime dateTime70 = interval2.getEnd();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldArray58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(interval65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(mutableInterval67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(mutableInterval69);
        org.junit.Assert.assertNotNull(dateTime70);
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.hours();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.year();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology4);
        org.joda.time.Period period9 = new org.joda.time.Period(561540000L, (long) 15, chronology4);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology4);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        java.lang.String str15 = period14.toString();
        org.joda.time.Period period16 = period12.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period18 = period16.plusMillis(100);
        org.joda.time.Period period20 = period18.minusWeeks(81);
        int[] intArray23 = chronology4.get((org.joda.time.ReadablePeriod) period20, (long) 26264290, (long) (-3172001));
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusSeconds(3);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        java.lang.String str35 = period34.toString();
        org.joda.time.Period period36 = period32.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period38 = period36.plusMillis(100);
        org.joda.time.Period period39 = period36.negated();
        int int40 = period36.getDays();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay30.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay30.plusSeconds(0);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology48 = localTime47.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.hours();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.year();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology48);
        org.joda.time.Period period53 = new org.joda.time.Period(561540000L, (long) 15, chronology48);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(chronology48);
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period58 = org.joda.time.Period.minutes(1);
        java.lang.String str59 = period58.toString();
        org.joda.time.Period period60 = period56.withFields((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Period period62 = period60.plusMillis(100);
        org.joda.time.Period period64 = period62.minusWeeks(81);
        int[] intArray67 = chronology48.get((org.joda.time.ReadablePeriod) period64, (long) 26264290, (long) (-3172001));
        chronology4.validate((org.joda.time.ReadablePartial) timeOfDay43, intArray67);
        org.joda.time.LocalTime localTime69 = org.joda.time.LocalTime.now(chronology4);
        org.joda.time.LocalTime.Property property70 = localTime69.millisOfSecond();
        org.joda.time.LocalTime localTime71 = property70.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT1M" + "'", str15, "PT1M");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 0, 0, -8, -10, -36, -291]");
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT1M" + "'", str35, "PT1M");
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PT1M" + "'", str59, "PT1M");
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[0, 0, 0, 0, -8, -10, -36, -291]");
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localTime71);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withDurationAdded(readableDuration11, (int) (byte) 10);
        int int14 = localDateTime4.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property15 = localDateTime4.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy(1645514340813L);
        org.joda.time.LocalDateTime localDateTime19 = property15.addWrapFieldToCopy(0);
        int int20 = localDateTime19.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        boolean boolean7 = timeZone3.hasSameRules(timeZone6);
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone6, locale8);
        int int11 = timeZone6.getOffset((long) 5);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone6);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromCalendarFields(calendar12);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period20.plusMillis(100);
        org.joda.time.Period period23 = period20.negated();
        org.joda.time.Period period25 = period23.withMillis(1899);
        org.joda.time.Period period27 = period25.withHours(32);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = timeOfDay37.toDateTimeToday(dateTimeZone38);
        mutableDateTime32.setZoneRetainFields(dateTimeZone38);
        mutableDateTime32.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        mutableDateTime32.setZone(dateTimeZone43);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology51 = localTime50.getChronology();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((-1L), (long) 17, chronology51);
        mutableDateTime32.setChronology(chronology51);
        java.lang.String str54 = chronology51.toString();
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime61 = timeOfDay59.toDateTimeToday(dateTimeZone60);
        org.joda.time.Chronology chronology62 = chronology51.withZone(dateTimeZone60);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(chronology62);
        org.joda.time.Period period64 = new org.joda.time.Period((long) 53, chronology62);
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology68 = localTime67.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.hours();
        org.joda.time.TimeOfDay timeOfDay70 = new org.joda.time.TimeOfDay((long) 38, chronology68);
        org.joda.time.DurationField durationField71 = chronology68.days();
        org.joda.time.DurationFieldType durationFieldType72 = durationField71.getType();
        int int73 = period64.get(durationFieldType72);
        org.joda.time.Period period75 = period27.withFieldAdded(durationFieldType72, 15);
        int[] intArray78 = chronology14.get((org.joda.time.ReadablePeriod) period75, 26164018L, (long) 41);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod(1937L, chronology14);
        org.joda.time.DurationField durationField80 = chronology14.days();
        org.joda.time.DateTimeField dateTimeField81 = chronology14.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645514749124,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=49,MILLISECOND=140,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645514749125,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=49,MILLISECOND=141,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT1M" + "'", str19, "PT1M");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ISOChronology[UTC]" + "'", str54, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[0, 0, 0, 0, -7, -16, -3, -977]");
        org.junit.Assert.assertNotNull(durationField80);
        org.junit.Assert.assertNotNull(dateTimeField81);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.plus(0L);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight31.plusDays((-1));
        org.joda.time.DateMidnight.Property property35 = dateMidnight34.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.plus((long) 'a');
        org.joda.time.Period period42 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        java.lang.String str45 = period44.toString();
        org.joda.time.Period period46 = period42.withFields((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Period period48 = period46.plusMillis(100);
        org.joda.time.Period period49 = period46.negated();
        org.joda.time.Period period51 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period53 = org.joda.time.Period.minutes(1);
        java.lang.String str54 = period53.toString();
        org.joda.time.Period period55 = period51.withFields((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Period period57 = period55.plusMillis(100);
        boolean boolean58 = period49.equals((java.lang.Object) period57);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period60 = period49.withFields((org.joda.time.ReadablePeriod) mutablePeriod59);
        mutablePeriod59.clear();
        org.joda.time.DateTime dateTime62 = dateTime40.minus((org.joda.time.ReadablePeriod) mutablePeriod59);
        org.joda.time.YearMonthDay yearMonthDay63 = dateTime40.toYearMonthDay();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight34, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight34.withYearOfEra(49);
        int int67 = dateMidnight34.getMillisOfSecond();
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1899 + "'", int10 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT1M" + "'", str22, "PT1M");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PT1M" + "'", str45, "PT1M");
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PT1M" + "'", str54, "PT1M");
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(yearMonthDay63);
        org.junit.Assert.assertNotNull(dateMidnight66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        org.joda.time.Period period1 = org.joda.time.Period.days(26321253);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        boolean boolean12 = dateTime7.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        boolean boolean15 = dateTime7.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTime();
        boolean boolean19 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime7.getYearOfEra();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(1);
        java.lang.String str26 = period25.toString();
        org.joda.time.Period period27 = period23.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period27.plusMillis(100);
        org.joda.time.LocalTime localTime30 = localTime21.minus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period32 = period27.plusHours((int) 'a');
        org.joda.time.DateTime dateTime34 = dateTime7.withPeriodAdded((org.joda.time.ReadablePeriod) period32, 5);
        org.joda.time.Period period36 = period32.plusDays(0);
        org.joda.time.PeriodType periodType37 = period32.getPeriodType();
        int int38 = period32.getWeeks();
        org.joda.time.Days days39 = period32.toStandardDays();
        org.joda.time.Duration duration40 = period32.toStandardDuration();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray50 = timeOfDay49.getFields();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTimeToday(dateTimeZone51);
        org.joda.time.Period period54 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        java.lang.String str57 = period56.toString();
        org.joda.time.Period period58 = period54.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period60 = period54.normalizedStandard(periodType59);
        org.joda.time.Period period61 = new org.joda.time.Period(readableDuration44, (org.joda.time.ReadableInstant) dateTime52, periodType59);
        org.joda.time.PeriodType periodType62 = periodType59.withMillisRemoved();
        org.joda.time.Period period63 = interval43.toPeriod(periodType62);
        boolean boolean64 = interval43.isAfterNow();
        org.joda.time.DateTime dateTime65 = interval43.getStart();
        org.joda.time.DateTime.Property property66 = dateTime65.secondOfDay();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration40, (org.joda.time.ReadableInstant) dateTime65);
        int int68 = mutablePeriod67.getMonths();
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT1M" + "'", str26, "PT1M");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(dateTimeFieldArray50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PT1M" + "'", str57, "PT1M");
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 10, chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod15, 15);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.secondOfMinute();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.monthOfYear();
        int int20 = localDateTime17.getWeekyear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        int int5 = localDateTime4.size();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfYear();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime localTime11 = localTime0.minusHours((-1));
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusSeconds(3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.lang.String str21 = timeOfDay17.toString(dateTimeFormatter20);
        int int22 = property12.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = property12.setCopy(26165236);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26165236 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "00" + "'", str21, "00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.Interval interval16 = dateMidnight15.toInterval();
        boolean boolean17 = interval16.isAfterNow();
        boolean boolean18 = interval16.containsNow();
        org.joda.time.Chronology chronology19 = interval16.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        boolean boolean22 = dateTimeField20.isLeap((long) 42482300);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1899 + "'", int10 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.Period period8 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology6);
        org.joda.time.Period period9 = new org.joda.time.Period((long) 3, chronology6);
        org.joda.time.DurationField durationField10 = chronology6.eras();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) 9, chronology6);
        org.joda.time.DateTime dateTime12 = localTime11.toDateTimeToday();
        int int13 = dateTime12.getSecondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime12.withDayOfWeek(170);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 170 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        mutableDateTime3.addDays(1899);
        boolean boolean9 = mutableDateTime3.isBeforeNow();
        int int10 = mutableDateTime3.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.era();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 10, chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMinuteOfHour(0);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 10, chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property25.setCopy("54");
        org.joda.time.LocalDateTime localDateTime28 = property25.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime29 = property25.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime30 = property25.getLocalDateTime();
        boolean boolean31 = mutableDateTime3.equals((java.lang.Object) property25);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime10 = dateTime6.plusDays((int) (byte) -1);
        java.util.Date date11 = dateTime10.toDate();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, readableDuration12);
        org.joda.time.Period period14 = interval13.toPeriod();
        org.joda.time.Period period16 = period14.plusMinutes((int) (short) -1);
        org.joda.time.Period period18 = period14.plusDays(0);
        org.joda.time.Period period20 = period14.minusWeeks((int) 'x');
        org.joda.time.Period period22 = period14.minusSeconds(0);
        org.joda.time.Period period24 = period14.plusWeeks(265);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = timeOfDay8.getFields();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTimeToday(dateTimeZone10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        java.lang.String str16 = period15.toString();
        org.joda.time.Period period17 = period13.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period19 = period13.normalizedStandard(periodType18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration3, (org.joda.time.ReadableInstant) dateTime11, periodType18);
        org.joda.time.PeriodType periodType21 = periodType18.withMillisRemoved();
        org.joda.time.Period period22 = interval2.toPeriod(periodType21);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = timeOfDay27.getFields();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfCentury(16);
        org.joda.time.DateTime dateTime34 = dateTime30.plusYears((-1));
        boolean boolean35 = interval2.contains((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray42 = timeOfDay41.getFields();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTimeToday(dateTimeZone43);
        org.joda.time.DateTime.Property property45 = dateTime44.monthOfYear();
        org.joda.time.DateTime dateTime47 = dateTime44.minusMillis((int) (byte) -1);
        boolean boolean49 = dateTime44.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType51 = dateTimeFieldType50.getDurationType();
        boolean boolean52 = dateTime44.isSupported(dateTimeFieldType50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTime dateTime55 = dateTime54.toDateTime();
        boolean boolean56 = dateTime44.isAfter((org.joda.time.ReadableInstant) dateTime55);
        int int57 = dateTime44.getYearOfEra();
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period60 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period62 = org.joda.time.Period.minutes(1);
        java.lang.String str63 = period62.toString();
        org.joda.time.Period period64 = period60.withFields((org.joda.time.ReadablePeriod) period62);
        org.joda.time.Period period66 = period64.plusMillis(100);
        org.joda.time.LocalTime localTime67 = localTime58.minus((org.joda.time.ReadablePeriod) period64);
        org.joda.time.Period period69 = period64.plusHours((int) 'a');
        org.joda.time.DateTime dateTime71 = dateTime44.withPeriodAdded((org.joda.time.ReadablePeriod) period69, 5);
        org.joda.time.Period period73 = period69.plusDays(0);
        org.joda.time.PeriodType periodType74 = period69.getPeriodType();
        org.joda.time.PeriodType periodType75 = periodType74.withSecondsRemoved();
        org.joda.time.Period period76 = new org.joda.time.Period(159L, periodType74);
        org.joda.time.PeriodType periodType77 = periodType74.withYearsRemoved();
        org.joda.time.Period period78 = interval2.toPeriod(periodType74);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT1M" + "'", str16, "PT1M");
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2022 + "'", int57 == 2022);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PT1M" + "'", str63, "PT1M");
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertNotNull(period78);
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(2000L);
        org.joda.time.LocalTime localTime3 = localTime1.minusMillis(26571858);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int6 = date5.getSeconds();
        date5.setTime((long) 55);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromDateFields(date5);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusSeconds(26196);
        org.joda.time.LocalDateTime.Property property13 = localDateTime9.yearOfCentury();
        org.joda.time.LocalDateTime.Property property14 = localDateTime9.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.plusMillis(15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime9.centuryOfEra();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withYear(1899);
        org.joda.time.Interval interval15 = yearMonthDay12.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonthDay12.getFieldTypes();
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay12.year();
        org.joda.time.YearMonthDay yearMonthDay19 = property17.addToCopy((int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.plusYears(4);
        java.util.Date date27 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.fromDateFields(date27);
        int int29 = localDate28.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        int int32 = dateTimeZone30.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime33 = localDate28.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        boolean boolean35 = dateTimeFormatter34.isParser();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) (-1), dateTimeZone38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter34.withZone(dateTimeZone38);
        long long43 = dateTimeZone30.getMillisKeepLocal(dateTimeZone38, 0L);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((java.lang.Object) 0L);
        org.joda.time.LocalDate.Property property45 = localDate44.centuryOfEra();
        org.joda.time.Period period47 = org.joda.time.Period.millis(1439);
        int int48 = period47.size();
        java.util.Date date57 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate58 = org.joda.time.LocalDate.fromDateFields(date57);
        int int59 = localDate58.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        int int62 = dateTimeZone60.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime63 = localDate58.toDateTimeAtCurrentTime(dateTimeZone60);
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone60);
        org.joda.time.Interval interval65 = dateMidnight64.toInterval();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(chronology66);
        org.joda.time.DateTime dateTime68 = dateTime67.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str71 = dateTimeZone70.getID();
        java.util.Locale locale73 = java.util.Locale.KOREAN;
        java.util.Locale locale75 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str76 = locale73.getDisplayVariant(locale75);
        java.lang.String str77 = dateTimeZone70.getName((long) 5, locale73);
        org.joda.time.DateTime dateTime78 = dateTime68.withZoneRetainFields(dateTimeZone70);
        boolean boolean79 = dateMidnight64.isEqual((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight64.withYear((-11));
        org.joda.time.DurationFieldType durationFieldType82 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight81.withFieldAdded(durationFieldType82, 0);
        org.joda.time.Period period86 = period47.withFieldAdded(durationFieldType82, 24);
        org.joda.time.LocalDate localDate87 = localDate44.plus((org.joda.time.ReadablePeriod) period86);
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = localDate87.getFieldType(0);
        org.joda.time.YearMonthDay.Property property90 = yearMonthDay21.property(dateTimeFieldType89);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1899 + "'", int29 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-16L) + "'", long43 == (-16L));
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1899 + "'", int59 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "+00:00:00.016" + "'", str71, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ko");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "+00:00:00.016" + "'", str77, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(dateMidnight81);
        org.junit.Assert.assertNotNull(durationFieldType82);
        org.junit.Assert.assertNotNull(dateMidnight84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(localDate87);
        org.junit.Assert.assertNotNull(dateTimeFieldType89);
        org.junit.Assert.assertNotNull(property90);
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate6.plusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate12 = localDate6.minusMonths(0);
        org.joda.time.LocalDate localDate14 = localDate12.withDayOfMonth((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.LocalDate localDate18 = localDate12.withFieldAdded(durationFieldType16, 16);
        org.joda.time.LocalDate localDate20 = localDate18.withDayOfYear(210);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("T07:18:51.433", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=t07:18:51.433");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfCentury();
        int int11 = property10.getMinimumValue();
        org.joda.time.DateTime dateTime12 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray20 = timeOfDay19.getFields();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime.Property property23 = dateTime22.monthOfYear();
        org.joda.time.DateTime dateTime25 = dateTime22.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime(chronology26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = timeOfDay37.toDateTimeToday(dateTimeZone38);
        mutableDateTime32.setZoneRetainFields(dateTimeZone38);
        mutableDateTime32.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        mutableDateTime32.setZone(dateTimeZone43);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology51 = localTime50.getChronology();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((-1L), (long) 17, chronology51);
        mutableDateTime32.setChronology(chronology51);
        java.lang.String str54 = chronology51.toString();
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime61 = timeOfDay59.toDateTimeToday(dateTimeZone60);
        org.joda.time.Chronology chronology62 = chronology51.withZone(dateTimeZone60);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(chronology62);
        org.joda.time.Period period64 = new org.joda.time.Period((long) 53, chronology62);
        org.joda.time.DateTime dateTime65 = dateTime27.toDateTime(chronology62);
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime((long) (short) 10, chronology62);
        org.joda.time.DateTime dateTime67 = dateTime12.toDateTime(chronology62);
        org.joda.time.DateTime dateTime69 = dateTime67.minus((-1585736870400000L));
        org.joda.time.DateTime dateTime72 = dateTime67.withDurationAdded((long) 100, (-71951));
        org.joda.time.DateTime.Property property73 = dateTime67.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ISOChronology[UTC]" + "'", str54, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(property73);
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.secondOfMinute();
        org.joda.time.Interval interval4 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.time();
        org.joda.time.Period period6 = interval4.toPeriod(periodType5);
        org.joda.time.Duration duration7 = interval4.toDuration();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 10, chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour(0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 10, chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 10, chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod23, 15);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getDurationType();
        int int28 = localDateTime25.get(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.plusSeconds(12);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withDayOfYear((int) (short) 100);
        org.joda.time.Chronology chronology33 = localDateTime30.getChronology();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 10);
        int int36 = dateTime35.getYearOfEra();
        int int37 = dateTime35.getSecondOfDay();
        org.joda.time.DateTime dateTime39 = dateTime35.plusSeconds(48);
        org.joda.time.DateTime.Property property40 = dateTime39.monthOfYear();
        org.joda.time.DateTime dateTime41 = localDateTime30.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType43 = periodType42.withMonthsRemoved();
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) dateTime41, periodType42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period46 = period44.plusHours(26428);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
        int int1 = dateTimeFormatter0.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 31);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2000 + "'", int1 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((java.lang.Object) mutableDateTime3);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.plusMonths(7);
        int[] intArray12 = yearMonthDay9.getValues();
        java.util.Date date18 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.fromDateFields(date18);
        org.joda.time.LocalDate.Property property20 = localDate19.weekOfWeekyear();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(1);
        java.lang.String str26 = period25.toString();
        org.joda.time.Period period27 = period23.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period27.plusMillis(100);
        org.joda.time.Period period30 = period27.negated();
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        java.lang.String str35 = period34.toString();
        org.joda.time.Period period36 = period32.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period38 = period36.plusMillis(100);
        boolean boolean39 = period30.equals((java.lang.Object) period38);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period41 = period30.withFields((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.LocalDate localDate42 = localDate21.plus((org.joda.time.ReadablePeriod) mutablePeriod40);
        mutablePeriod40.addMillis(0);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod();
        mutablePeriod45.addWeeks((int) (byte) 100);
        mutablePeriod40.add((org.joda.time.ReadablePeriod) mutablePeriod45);
        mutablePeriod40.setValue(4, 24);
        org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.LocalDate localDate53 = yearMonthDay9.toLocalDate();
        int int54 = localDate53.getDayOfYear();
        int int55 = localDate53.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2022, 2, 22]");
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT1M" + "'", str26, "PT1M");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT1M" + "'", str35, "PT1M");
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(yearMonthDay52);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 53 + "'", int54 == 53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 53 + "'", int55 == 53);
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period7 = period1.normalizedStandard(periodType6);
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = timeOfDay16.getFields();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTimeToday(dateTimeZone18);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = period21.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period27 = period21.normalizedStandard(periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration11, (org.joda.time.ReadableInstant) dateTime19, periodType26);
        org.joda.time.PeriodType periodType29 = periodType26.withMillisRemoved();
        org.joda.time.Period period30 = interval10.toPeriod(periodType29);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        boolean boolean38 = interval10.contains((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period7, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology44 = localTime43.getChronology();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((-1L), (long) 17, chronology44);
        long long46 = interval45.getStartMillis();
        org.joda.time.Duration duration47 = interval45.toDuration();
        org.joda.time.DateTime dateTime48 = interval45.getStart();
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology53 = localTime52.getChronology();
        org.joda.time.Interval interval54 = new org.joda.time.Interval((-1L), (long) 17, chronology53);
        long long55 = interval54.getStartMillis();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.secondOfMinute();
        org.joda.time.Interval interval60 = new org.joda.time.Interval(readableDuration56, (org.joda.time.ReadableInstant) dateTime58);
        boolean boolean61 = interval54.contains((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Interval interval62 = interval45.overlap((org.joda.time.ReadableInterval) interval54);
        boolean boolean63 = interval39.contains((org.joda.time.ReadableInterval) interval54);
        org.joda.time.MutableInterval mutableInterval64 = interval39.toMutableInterval();
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology69 = localTime68.getChronology();
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 5, chronology69);
        org.joda.time.Chronology chronology71 = chronology69.withUTC();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology71.getZone();
        java.util.TimeZone timeZone73 = dateTimeZone72.toTimeZone();
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone72);
        org.joda.time.DateTime dateTime76 = dateTime74.plusWeeks(3171);
        int int77 = dateTime74.getYearOfCentury();
        org.joda.time.DateTime dateTime78 = dateTime74.toDateTimeISO();
        boolean boolean79 = interval39.equals((java.lang.Object) dateTime74);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT1M" + "'", str24, "PT1M");
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(mutableInterval64);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertNotNull(timeZone73);
        org.junit.Assert.assertEquals(timeZone73.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 70 + "'", int77 == 70);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate6.plusWeeks((int) (short) 0);
        int int11 = localDate6.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = localDate6.toDateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.monthOfYear();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight16.withMillis((long) 3);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight16.plusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight16.minusYears((int) (short) -1);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.dayOfWeek();
        boolean boolean26 = dateMidnight23.isEqual(25200005L);
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 1);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight23.minus((org.joda.time.ReadablePeriod) period28);
        java.util.Date date30 = dateMidnight23.toDate();
        org.joda.time.DateMidnight.Property property31 = dateMidnight23.dayOfMonth();
        org.joda.time.DateMidnight.Property property32 = dateMidnight23.dayOfMonth();
        int int33 = dateMidnight23.getWeekyear();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.016" + "'", str14, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Sat Mar 10 00:00:00 GMT+00:00 1900");
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1900 + "'", int33 == 1900);
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        java.lang.String str10 = period9.toString();
        org.joda.time.Period period11 = period7.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.plusMillis(100);
        org.joda.time.Period period15 = period11.minusMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period15, 15);
        org.joda.time.DateTime dateTime19 = dateTime17.withDayOfMonth(17);
        org.joda.time.DateTime.Property property20 = dateTime17.yearOfCentury();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 10, chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMinuteOfHour(0);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 10, chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 10, chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod36, 15);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime31.plusMonths(12);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 10, chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.plusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = localDateTime47.getFieldType(0);
        org.joda.time.LocalDateTime.Property property50 = localDateTime40.property(dateTimeFieldType49);
        boolean boolean51 = dateTime17.isSupported(dateTimeFieldType49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType49.getField(chronology52);
        long long55 = dateTimeField53.roundCeiling((long) 8690);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT1M" + "'", str10, "PT1M");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 31536000000L + "'", long55 == 31536000000L);
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        boolean boolean7 = timeZone3.hasSameRules(timeZone6);
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone6, locale8);
        java.util.Calendar.Builder builder10 = builder0.setTimeZone(timeZone6);
        java.util.Calendar.Builder builder15 = builder0.setTimeOfDay(0, (int) ' ', 12, 11);
        java.util.Calendar.Builder builder20 = builder0.setTimeOfDay(0, 99, 17, 59);
        java.util.Calendar.Builder builder24 = builder0.setDate((int) (byte) 10, 0, 2);
        java.util.Calendar.Builder builder25 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder28 = builder25.set(2, 32772);
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str32 = locale29.getDisplayVariant(locale31);
        java.util.Calendar.Builder builder33 = builder25.setLocale(locale31);
        java.util.Calendar.Builder builder35 = builder33.setLenient(false);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray42 = timeOfDay41.getFields();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTimeToday(dateTimeZone43);
        org.joda.time.DateTime.Property property45 = dateTime44.monthOfYear();
        org.joda.time.DateTime dateTime47 = dateTime44.minusMillis((int) (byte) -1);
        boolean boolean49 = dateTime44.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType51 = dateTimeFieldType50.getDurationType();
        boolean boolean52 = dateTime44.isSupported(dateTimeFieldType50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTime dateTime55 = dateTime54.toDateTime();
        boolean boolean56 = dateTime44.isAfter((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableDuration36, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.MutablePeriod mutablePeriod58 = period57.toMutablePeriod();
        int[] intArray59 = mutablePeriod58.getValues();
        java.util.Calendar.Builder builder60 = builder33.setFields(intArray59);
        java.util.Calendar.Builder builder61 = builder24.setFields(intArray59);
        java.util.Calendar.Builder builder65 = builder61.setWeekDate((-8), 462, 32772);
        java.util.Calendar.Builder builder69 = builder61.setWeekDate(998, 69, 992);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645514749541,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=49,MILLISECOND=557,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(dateTimeFieldArray42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(mutablePeriod58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder69);
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 52);
        org.joda.time.DateTimeZone dateTimeZone2 = dateTime1.getZone();
        java.lang.String str4 = dateTimeZone2.getNameKey((long) (-292275054));
        long long6 = dateTimeZone2.previousTransition((long) 38090);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(dateTimeZone2);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        long long13 = dateTimeZone10.convertUTCToLocal(2260543248000000L);
        java.lang.String str14 = dateTimeZone10.getID();
        org.joda.time.DateTime dateTime15 = dateTime8.toDateTime(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 38090L + "'", long6 == 38090L);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2260543248000010L + "'", long13 == 2260543248000010L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        mutableDateTime3.setYear((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod();
        mutablePeriod9.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod9.setPeriod((long) 15, chronology13);
        mutablePeriod9.setMinutes(1970);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 5, chronology22);
        org.joda.time.Chronology chronology24 = chronology22.withUTC();
        mutablePeriod9.setPeriod((long) 0, (long) 1, chronology24);
        mutableDateTime3.setChronology(chronology24);
        boolean boolean27 = mutableDateTime3.isBeforeNow();
        mutableDateTime3.setDate(292317582L);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime3.year();
        java.lang.String str31 = mutableDateTime3.toString();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period35 = org.joda.time.Period.minutes(1);
        java.lang.String str36 = period35.toString();
        org.joda.time.LocalTime localTime37 = localTime33.plus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.LocalTime.Property property38 = localTime33.minuteOfHour();
        org.joda.time.LocalTime localTime39 = property38.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.roundCeilingCopy();
        org.joda.time.LocalTime localTime43 = property40.addCopy(0);
        org.joda.time.LocalTime localTime44 = property40.withMinimumValue();
        org.joda.time.LocalTime localTime46 = localTime44.minusSeconds(18);
        org.joda.time.LocalTime.Property property47 = localTime44.millisOfDay();
        org.joda.time.LocalTime localTime48 = property47.roundFloorCopy();
        org.joda.time.LocalTime localTime50 = localTime48.minusMillis(26164018);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology55 = localTime54.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(chronology55);
        org.joda.time.Period period57 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology55);
        org.joda.time.Period period59 = period57.minusHours(53);
        org.joda.time.Period period60 = period57.negated();
        int int61 = period57.getMonths();
        org.joda.time.LocalTime localTime63 = localTime50.withPeriodAdded((org.joda.time.ReadablePeriod) period57, 3172000);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period57, 180);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-04T07:25:49.572Z" + "'", str31, "1970-01-04T07:25:49.572Z");
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT1M" + "'", str36, "PT1M");
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-9) + "'", int61 == (-9));
        org.junit.Assert.assertNotNull(localTime63);
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.LocalTime localTime5 = localTime1.plus((org.joda.time.ReadablePeriod) period3);
        org.joda.time.LocalTime.Property property6 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property8.addCopy((long) (-11));
        org.joda.time.DateTimeField dateTimeField11 = property8.getField();
        org.joda.time.LocalTime localTime12 = property8.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField13 = property8.getField();
        long long15 = dateTimeField13.roundHalfCeiling((long) (-59));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = period8.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period12.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.months();
        int int16 = period14.get(durationFieldType15);
        mutableDateTime3.add(durationFieldType15, 7);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        mutableDateTime20.setZoneRetainFields(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = timeOfDay27.getFields();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTime.Property property31 = dateTime30.monthOfYear();
        org.joda.time.DateTime dateTime33 = dateTime30.minusMillis((int) (byte) -1);
        boolean boolean35 = dateTime30.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType36.getDurationType();
        boolean boolean38 = dateTime30.isSupported(dateTimeFieldType36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTime dateTime41 = dateTime40.toDateTime();
        boolean boolean42 = dateTime30.isAfter((org.joda.time.ReadableInstant) dateTime41);
        int int43 = dateTime30.getYearOfEra();
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period46 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period48 = org.joda.time.Period.minutes(1);
        java.lang.String str49 = period48.toString();
        org.joda.time.Period period50 = period46.withFields((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Period period52 = period50.plusMillis(100);
        org.joda.time.LocalTime localTime53 = localTime44.minus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Period period55 = period50.plusHours((int) 'a');
        org.joda.time.DateTime dateTime57 = dateTime30.withPeriodAdded((org.joda.time.ReadablePeriod) period55, 5);
        org.joda.time.Period period59 = period55.plusDays(0);
        org.joda.time.PeriodType periodType60 = period55.getPeriodType();
        int int61 = period55.getWeeks();
        org.joda.time.Days days62 = period55.toStandardDays();
        org.joda.time.Duration duration63 = period55.toStandardDuration();
        org.joda.time.Interval interval66 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.TimeOfDay timeOfDay72 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray73 = timeOfDay72.getFields();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.DateTime dateTime75 = timeOfDay72.toDateTimeToday(dateTimeZone74);
        org.joda.time.Period period77 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period79 = org.joda.time.Period.minutes(1);
        java.lang.String str80 = period79.toString();
        org.joda.time.Period period81 = period77.withFields((org.joda.time.ReadablePeriod) period79);
        org.joda.time.PeriodType periodType82 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period83 = period77.normalizedStandard(periodType82);
        org.joda.time.Period period84 = new org.joda.time.Period(readableDuration67, (org.joda.time.ReadableInstant) dateTime75, periodType82);
        org.joda.time.PeriodType periodType85 = periodType82.withMillisRemoved();
        org.joda.time.Period period86 = interval66.toPeriod(periodType85);
        boolean boolean87 = interval66.isAfterNow();
        org.joda.time.DateTime dateTime88 = interval66.getStart();
        org.joda.time.DateTime.Property property89 = dateTime88.secondOfDay();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration63, (org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.DateTime dateTime92 = dateTime88.plusMinutes(84);
        mutableDateTime20.setMillis((org.joda.time.ReadableInstant) dateTime88);
        int int94 = mutableDateTime20.getSecondOfMinute();
        long long95 = mutableDateTime20.getMillis();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT1M" + "'", str11, "PT1M");
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2022 + "'", int43 == 2022);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PT1M" + "'", str49, "PT1M");
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(days62);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(dateTimeFieldArray73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "PT1M" + "'", str80, "PT1M");
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 59 + "'", int94 == 59);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + (-1L) + "'", long95 == (-1L));
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.setRegion("126");
        java.util.Locale.Builder builder7 = builder0.setExtension('a', "802");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = builder7.build();
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder11 = builder7.clear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(7);
        org.joda.time.DateTime.Property property16 = dateTime13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.hours();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.era();
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.weekOfWeekyear();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.hours();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfDay();
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str33 = locale30.getDisplayVariant(locale32);
        java.util.Locale locale34 = locale32.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str37 = dateTimeZone36.getID();
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str42 = locale39.getDisplayVariant(locale41);
        java.lang.String str43 = dateTimeZone36.getName((long) 5, locale39);
        java.util.Locale locale44 = java.util.Locale.KOREAN;
        java.lang.String str45 = locale39.getDisplayScript(locale44);
        java.lang.String str46 = locale34.getDisplayName(locale39);
        int int47 = dateTimeField29.getMaximumShortTextLength(locale39);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str51 = dateTimeZone50.getID();
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str56 = locale53.getDisplayVariant(locale55);
        java.lang.String str57 = dateTimeZone50.getName((long) 5, locale53);
        java.lang.String str58 = locale53.getVariant();
        java.lang.String str59 = dateTimeField29.getAsText(30844800000L, locale53);
        java.lang.String str60 = property24.getAsText(locale53);
        java.lang.String str61 = locale53.getISO3Country();
        int int62 = property16.getMaximumShortTextLength(locale53);
        java.util.Locale.Builder builder63 = builder7.setLocale(locale53);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder66 = builder63.setExtension('4', "Property[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "_126");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.016" + "'", str37, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.016" + "'", str43, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.016" + "'", str51, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.016" + "'", str57, "+00:00:00.016");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0" + "'", str59, "0");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "8" + "'", str60, "8");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 7 + "'", int62 == 7);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        java.lang.String str7 = mutableDateTime3.toString();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime3.copy();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add((long) 11);
        org.joda.time.MutableDateTime mutableDateTime12 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.minuteOfDay();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime21.minusMillis((int) (byte) -1);
        boolean boolean26 = dateTime21.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getDurationType();
        boolean boolean29 = dateTime21.isSupported(dateTimeFieldType27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime dateTime32 = dateTime31.toDateTime();
        boolean boolean33 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime32);
        int int34 = dateTime21.getYearOfEra();
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period39 = org.joda.time.Period.minutes(1);
        java.lang.String str40 = period39.toString();
        org.joda.time.Period period41 = period37.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period43 = period41.plusMillis(100);
        org.joda.time.LocalTime localTime44 = localTime35.minus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Period period46 = period41.plusHours((int) 'a');
        org.joda.time.DateTime dateTime48 = dateTime21.withPeriodAdded((org.joda.time.ReadablePeriod) period46, 5);
        org.joda.time.Period period50 = period46.plusDays(0);
        org.joda.time.PeriodType periodType51 = period46.getPeriodType();
        int int52 = period46.getWeeks();
        org.joda.time.Days days53 = period46.toStandardDays();
        org.joda.time.Duration duration54 = period46.toStandardDuration();
        org.joda.time.Interval interval57 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray64 = timeOfDay63.getFields();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = timeOfDay63.toDateTimeToday(dateTimeZone65);
        org.joda.time.Period period68 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period70 = org.joda.time.Period.minutes(1);
        java.lang.String str71 = period70.toString();
        org.joda.time.Period period72 = period68.withFields((org.joda.time.ReadablePeriod) period70);
        org.joda.time.PeriodType periodType73 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period74 = period68.normalizedStandard(periodType73);
        org.joda.time.Period period75 = new org.joda.time.Period(readableDuration58, (org.joda.time.ReadableInstant) dateTime66, periodType73);
        org.joda.time.PeriodType periodType76 = periodType73.withMillisRemoved();
        org.joda.time.Period period77 = interval57.toPeriod(periodType76);
        boolean boolean78 = interval57.isAfterNow();
        org.joda.time.DateTime dateTime79 = interval57.getStart();
        org.joda.time.DateTime.Property property80 = dateTime79.secondOfDay();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration54, (org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.DateMidnight dateMidnight83 = org.joda.time.DateMidnight.parse("6");
        org.joda.time.PeriodType periodType84 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType85 = periodType84.withDaysRemoved();
        org.joda.time.PeriodType periodType86 = periodType85.withYearsRemoved();
        org.joda.time.Period period87 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration54, (org.joda.time.ReadableInstant) dateMidnight83, periodType86);
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.getDefault();
        int int90 = dateTimeZone88.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime91 = new org.joda.time.MutableDateTime(dateTimeZone88);
        org.joda.time.Period period92 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration54, (org.joda.time.ReadableInstant) mutableDateTime91);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration54);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-22T07:25:49.657Z" + "'", str7, "2022-02-22T07:25:49.657Z");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2022 + "'", int34 == 2022);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT1M" + "'", str40, "PT1M");
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(dateTimeFieldArray64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PT1M" + "'", str71, "PT1M");
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(dateMidnight83);
        org.junit.Assert.assertNotNull(periodType84);
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertNotNull(periodType86);
        org.junit.Assert.assertNotNull(dateTimeZone88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.LocalTime localTime5 = localTime1.plus((org.joda.time.ReadablePeriod) period3);
        org.joda.time.LocalTime.Property property6 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime9 = localTime7.plusMillis(15);
        int int10 = localTime9.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str12 = dateTimeFieldType11.toString();
        boolean boolean13 = localTime9.isSupported(dateTimeFieldType11);
        org.joda.time.LocalTime localTime15 = localTime9.plusSeconds(42583);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "monthOfYear" + "'", str12, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (-59), 16011223456695943L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = timeOfDay15.toDateTimeToday(dateTimeZone16);
        mutableDateTime10.setZoneRetainFields(dateTimeZone16);
        mutableDateTime10.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        mutableDateTime10.setZone(dateTimeZone21);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((-1L), (long) 17, chronology29);
        mutableDateTime10.setChronology(chronology29);
        java.lang.String str32 = chronology29.toString();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = timeOfDay37.toDateTimeToday(dateTimeZone38);
        org.joda.time.Chronology chronology40 = chronology29.withZone(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(chronology40);
        org.joda.time.Period period42 = new org.joda.time.Period((long) 53, chronology40);
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0, chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.centuryOfEra();
        mutablePeriod2.setPeriod(1645514244041L, 1645514484816L, chronology40);
        // The following exception was thrown during execution in test generation
        try {
            long long50 = chronology40.getDateTimeMillis(447, 26473591, 26485912, 261925);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26473591 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ISOChronology[UTC]" + "'", str32, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(26419302, 26487847, 20, 447, 42773, 726, (-2661130), 26590897);
        java.util.Date date14 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromDateFields(date14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.plusWeeks((int) (short) 0);
        int int20 = localDate15.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight25 = localDate15.toDateMidnight(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        long long32 = dateTimeZone27.nextTransition((long) 0);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone27);
        long long35 = dateTimeZone27.convertUTCToLocal((long) (short) 0);
        org.joda.time.DateTime dateTime36 = localDate15.toDateTimeAtStartOfDay(dateTimeZone27);
        int int37 = localDate15.getEra();
        org.joda.time.LocalDate localDate39 = localDate15.minusYears(3172);
        org.joda.time.Interval interval40 = localDate39.toInterval();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 1899, dateTimeZone42);
        org.joda.time.LocalDate.Property property46 = localDate45.centuryOfEra();
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime48 = localDate45.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property49 = localDate45.yearOfEra();
        int int50 = localDate45.getMonthOfYear();
        java.util.Date date56 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.fromDateFields(date56);
        org.joda.time.LocalDate.Property property58 = localDate57.weekOfWeekyear();
        org.joda.time.LocalDate localDate59 = property58.getLocalDate();
        org.joda.time.LocalDate localDate60 = property58.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate62 = property58.setCopy(1);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str65 = dateTimeZone64.getID();
        org.joda.time.DateMidnight dateMidnight66 = localDate62.toDateMidnight(dateTimeZone64);
        org.joda.time.LocalDate localDate67 = org.joda.time.LocalDate.now(dateTimeZone64);
        org.joda.time.YearMonthDay yearMonthDay68 = new org.joda.time.YearMonthDay(dateTimeZone64);
        int int70 = dateTimeZone64.getOffset((long) 256);
        org.joda.time.Interval interval71 = localDate45.toInterval(dateTimeZone64);
        org.joda.time.Interval interval72 = interval40.overlap((org.joda.time.ReadableInterval) interval71);
        mutablePeriod8.add((org.joda.time.ReadableInterval) interval72);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.016" + "'", str23, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+00:00:00.016" + "'", str65, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight66);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 16 + "'", int70 == 16);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNull(interval72);
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-22T07:17:07.407Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-22T07:17:07.407Z\" is malformed at \"Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        org.joda.time.Period period17 = period14.negated();
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        boolean boolean26 = period17.equals((java.lang.Object) period25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period28 = period17.withFields((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.LocalDate localDate29 = localDate8.plus((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.LocalDate localDate31 = localDate29.withDayOfMonth(5);
        org.joda.time.LocalDate.Property property32 = localDate29.weekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        int int35 = dateTimeZone33.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.ReadableDuration readableDuration37 = null;
        mutableDateTime36.add(readableDuration37, 0);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime36.dayOfWeek();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay((java.lang.Object) mutableDateTime36);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay42.plusMonths(7);
        int[] intArray45 = yearMonthDay42.getValues();
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.dayOfMonth();
        int int47 = property46.get();
        org.joda.time.YearMonthDay yearMonthDay49 = property46.addWrapFieldToCopy(26286964);
        boolean boolean50 = localDate29.equals((java.lang.Object) yearMonthDay49);
        org.joda.time.DateTime dateTime51 = localDate29.toDateTimeAtCurrentTime();
        int[] intArray52 = localDate29.getValues();
        org.joda.time.DateTime dateTime53 = localDate29.toDateTimeAtStartOfDay();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT1M" + "'", str13, "PT1M");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT1M" + "'", str22, "PT1M");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(yearMonthDay44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 22 + "'", int47 == 22);
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1899, 3, 10]");
        org.junit.Assert.assertNotNull(dateTime53);
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime15.add(readableDuration16, 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.dayOfWeek();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.minuteOfDay();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = timeOfDay25.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime31 = dateTime27.plusDays((int) (byte) -1);
        java.util.Date date32 = dateTime31.toDate();
        org.joda.time.DateTime.Property property33 = dateTime31.dayOfMonth();
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) dateTime31);
        int int35 = dateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime39.add(readableDuration40, 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.dayOfWeek();
        mutableDateTime39.addSeconds(69);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime39.weekOfWeekyear();
        java.util.Locale locale47 = java.util.Locale.CHINA;
        int int48 = property46.getMaximumShortTextLength(locale47);
        java.util.Calendar calendar49 = mutableDateTime15.toCalendar(locale47);
        int int51 = calendar49.getMaximum(13);
        java.util.Date date59 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate60 = org.joda.time.LocalDate.fromDateFields(date59);
        int int61 = localDate60.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        int int64 = dateTimeZone62.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime65 = localDate60.toDateTimeAtCurrentTime(dateTimeZone62);
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.YearMonthDay yearMonthDay68 = yearMonthDay66.withYear(1899);
        org.joda.time.Interval interval69 = yearMonthDay66.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray70 = yearMonthDay66.getFieldTypes();
        org.joda.time.YearMonthDay.Property property71 = yearMonthDay66.year();
        org.joda.time.YearMonthDay yearMonthDay72 = property71.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay73 = property71.withMinimumValue();
        java.util.Date date79 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate80 = org.joda.time.LocalDate.fromDateFields(date79);
        org.joda.time.LocalDate.Property property81 = localDate80.weekOfWeekyear();
        org.joda.time.LocalDate localDate82 = property81.getLocalDate();
        org.joda.time.DateTimeField dateTimeField83 = property81.getField();
        int int85 = dateTimeField83.getLeapAmount((long) '#');
        java.lang.String str87 = dateTimeField83.getAsShortText((long) 1);
        java.util.Locale locale89 = java.util.Locale.ENGLISH;
        java.lang.String str90 = dateTimeField83.getAsShortText((long) (-1), locale89);
        java.util.Locale locale92 = java.util.Locale.ENGLISH;
        java.lang.String str93 = dateTimeField83.getAsShortText(3172001, locale92);
        java.lang.String str94 = locale92.getDisplayVariant();
        java.lang.String str95 = property71.getAsText(locale92);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str96 = calendar49.getDisplayName(56035, 26404120, locale92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(calendar49);
// flaky:         org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=1645404772000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=52,SECOND=52,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 59 + "'", int51 == 59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1899 + "'", int61 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(yearMonthDay68);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(yearMonthDay72);
        org.junit.Assert.assertNotNull(yearMonthDay73);
// flaky:         org.junit.Assert.assertEquals(date79.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(localDate82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "1" + "'", str87, "1");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "1" + "'", str90, "1");
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "en");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "3172001" + "'", str93, "3172001");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "2022" + "'", str95, "2022");
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withDurationAdded(readableDuration11, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withMillisOfDay((int) ' ');
        org.joda.time.LocalDateTime.Property property16 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property16.addWrapFieldToCopy(26164018);
        org.joda.time.LocalDateTime localDateTime20 = property16.addWrapFieldToCopy(26196);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusDays(766);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withYearOfEra(16);
        boolean boolean19 = dateMidnight17.isEqual(82036800000L);
        boolean boolean20 = dateMidnight17.isAfterNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight17.withFieldAdded(durationFieldType22, 48);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.withMillis(0L);
        org.joda.time.DateTimeZone dateTimeZone27 = dateMidnight26.getZone();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight26.withYear(438);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight26.withMillis((long) 81);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.withYear((-26219842));
        java.util.Date date39 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.fromDateFields(date39);
        int int41 = localDate40.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime45 = localDate40.toDateTimeAtCurrentTime(dateTimeZone42);
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay(dateTimeZone42);
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay46.withYear(1899);
        org.joda.time.Interval interval49 = yearMonthDay46.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray50 = yearMonthDay46.getFieldTypes();
        org.joda.time.YearMonthDay.Property property51 = yearMonthDay46.year();
        org.joda.time.YearMonthDay yearMonthDay52 = property51.withMaximumValue();
        java.lang.String str53 = property51.getAsString();
        org.joda.time.YearMonthDay yearMonthDay54 = property51.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay55 = property51.getYearMonthDay();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight31.withFields((org.joda.time.ReadablePartial) yearMonthDay55);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod();
        mutablePeriod57.addWeeks((int) (byte) 100);
        org.joda.time.Period period61 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period63 = org.joda.time.Period.minutes(1);
        java.lang.String str64 = period63.toString();
        org.joda.time.Period period65 = period61.withFields((org.joda.time.ReadablePeriod) period63);
        org.joda.time.Period period67 = period65.plusMillis(100);
        org.joda.time.Period period68 = period65.negated();
        org.joda.time.Period period70 = period68.withMillis(1899);
        org.joda.time.Minutes minutes71 = period70.toStandardMinutes();
        mutablePeriod57.setPeriod((org.joda.time.ReadablePeriod) period70);
        int int73 = mutablePeriod57.getMinutes();
        java.util.Date date79 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate80 = org.joda.time.LocalDate.fromDateFields(date79);
        int int81 = localDate80.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.getDefault();
        int int84 = dateTimeZone82.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime85 = localDate80.toDateTimeAtCurrentTime(dateTimeZone82);
        org.joda.time.YearMonthDay yearMonthDay86 = new org.joda.time.YearMonthDay(dateTimeZone82);
        org.joda.time.YearMonthDay yearMonthDay88 = yearMonthDay86.withYear(1899);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((long) 10, chronology90);
        org.joda.time.YearMonthDay yearMonthDay92 = yearMonthDay88.plus((org.joda.time.ReadablePeriod) mutablePeriod91);
        java.lang.Object obj93 = mutablePeriod91.clone();
        mutablePeriod57.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod91);
        mutablePeriod57.setSeconds(86340000);
        int int97 = mutablePeriod57.getWeeks();
        int int98 = mutablePeriod57.getHours();
        org.joda.time.YearMonthDay yearMonthDay99 = yearMonthDay55.plus((org.joda.time.ReadablePeriod) mutablePeriod57);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1899 + "'", int10 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateMidnight33);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1899 + "'", int41 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(yearMonthDay48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(yearMonthDay52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "2022" + "'", str53, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertNotNull(yearMonthDay55);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "PT1M" + "'", str64, "PT1M");
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
// flaky:         org.junit.Assert.assertEquals(date79.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1899 + "'", int81 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(yearMonthDay88);
        org.junit.Assert.assertNotNull(yearMonthDay92);
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertEquals(obj93.toString(), "PT0.010S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj93), "PT0.010S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj93), "PT0.010S");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay99);
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((-2026), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2026 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime.Property property1 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime2 = property1.getLocalTime();
        int int3 = localTime2.size();
        org.joda.time.LocalTime.Property property4 = localTime2.millisOfDay();
        org.joda.time.Period period6 = org.joda.time.Period.years(59);
        org.joda.time.Period period8 = period6.withWeeks((int) (byte) 100);
        org.joda.time.Period period10 = period8.withWeeks(19);
        org.joda.time.LocalTime localTime11 = localTime2.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.LocalTime localTime13 = localTime11.minusHours((-8));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField15 = localTime13.getField((-2073));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -2073");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod(readableDuration7, chronology8);
        mutablePeriod6.setSeconds(0);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        mutableDateTime30.setZoneRetainFields(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime30, readableDuration39);
        boolean boolean41 = dateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj42 = mutableDateTime30.clone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, 0);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.dayOfWeek();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.millisOfDay();
        int int54 = mutableDateTime52.getYearOfEra();
        mutablePeriod6.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime52);
        boolean boolean57 = mutableDateTime30.isBefore((long) 1970);
        java.util.Date date63 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        date63.setMinutes(54);
        org.joda.time.TimeOfDay timeOfDay66 = org.joda.time.TimeOfDay.fromDateFields(date63);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = timeOfDay66.getFieldType(2);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime30.property(dateTimeFieldType68);
        org.joda.time.MutableDateTime mutableDateTime71 = property69.set(6);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod();
        mutablePeriod73.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology77 = null;
        mutablePeriod73.setPeriod((long) 15, chronology77);
        mutablePeriod73.setMinutes(1970);
        org.joda.time.LocalTime localTime85 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology86 = localTime85.getChronology();
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime((long) 5, chronology86);
        org.joda.time.Chronology chronology88 = chronology86.withUTC();
        mutablePeriod73.setPeriod((long) 0, (long) 1, chronology88);
        org.joda.time.LocalTime localTime90 = org.joda.time.LocalTime.now(chronology88);
        org.joda.time.LocalTime localTime91 = org.joda.time.LocalTime.fromMillisOfDay((-1698474537000L), chronology88);
        long long95 = chronology88.add(1072915226377L, (long) 278, 64088019);
        mutableDateTime71.setChronology(chronology88);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(obj42);
// flaky:         org.junit.Assert.assertEquals(obj42.toString(), "2022-02-22T07:25:49.945Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "2022-02-22T07:25:49.945Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "2022-02-22T07:25:49.945Z");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2022 + "'", int54 == 2022);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Fri Mar 10 01:54:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(localTime90);
        org.junit.Assert.assertNotNull(localTime91);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 1090731695659L + "'", long95 == 1090731695659L);
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum((int) (short) 0);
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        date8.setMinutes(54);
        calendar0.setTime(date8);
        date8.setSeconds(42);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date8);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) '4', chronology18);
        org.joda.time.TimeOfDay.Property property20 = timeOfDay19.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay21 = property20.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minusMinutes(3172001);
        boolean boolean24 = localTime15.isBefore((org.joda.time.ReadablePartial) timeOfDay23);
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay23.minusHours(0);
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.plusHours(1975);
        int int29 = timeOfDay26.size();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = localDate14.compareTo((org.joda.time.ReadablePartial) timeOfDay26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-2234642760016,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=19,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1899,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=69,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=54,SECOND=0,MILLISECOND=0,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 10 01:54:42 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withYear(1899);
        java.util.Date date23 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        int int25 = localDate24.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime29 = localDate24.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period36 = org.joda.time.Period.minutes(1);
        java.lang.String str37 = period36.toString();
        org.joda.time.Period period38 = period34.withFields((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period40 = period38.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.months();
        int int42 = period40.get(durationFieldType41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight30.withPeriodAdded((org.joda.time.ReadablePeriod) period40, 0);
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay12.plus((org.joda.time.ReadablePeriod) period40);
        int int46 = yearMonthDay45.getYear();
        org.joda.time.YearMonthDay.Property property47 = yearMonthDay45.dayOfMonth();
        org.joda.time.YearMonthDay.Property property48 = yearMonthDay45.year();
        org.joda.time.YearMonthDay yearMonthDay49 = property48.withMaximumValue();
        int int50 = property48.get();
        org.joda.time.YearMonthDay yearMonthDay51 = property48.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay53 = property48.setCopy(438);
        org.joda.time.YearMonthDay yearMonthDay54 = property48.getYearMonthDay();
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period58 = org.joda.time.Period.minutes(1);
        java.lang.String str59 = period58.toString();
        org.joda.time.Period period60 = period56.withFields((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Period period62 = period60.plusMillis(100);
        org.joda.time.Period period64 = period60.minusMillis((int) (byte) 1);
        org.joda.time.Period period66 = period64.plusMinutes(99);
        org.joda.time.Period period68 = period64.plusHours((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray69 = period64.getFieldTypes();
        org.joda.time.Period period71 = period64.plusSeconds(108);
        org.joda.time.YearMonthDay yearMonthDay72 = yearMonthDay54.plus((org.joda.time.ReadablePeriod) period71);
        org.joda.time.YearMonthDay yearMonthDay74 = yearMonthDay54.minusMonths(26366559);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1899 + "'", int25 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT1M" + "'", str37, "PT1M");
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2022 + "'", int46 == 2022);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2022 + "'", int50 == 2022);
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PT1M" + "'", str59, "PT1M");
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(durationFieldTypeArray69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(yearMonthDay72);
        org.junit.Assert.assertNotNull(yearMonthDay74);
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate9 = property7.roundHalfEvenCopy();
        int int10 = localDate9.getYearOfCentury();
        org.joda.time.LocalDate.Property property11 = localDate9.dayOfMonth();
        org.joda.time.LocalDate localDate13 = property11.addWrapFieldToCopy(8);
        org.joda.time.LocalDate localDate14 = property11.getLocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfYear();
        org.joda.time.LocalDate localDate17 = localDate14.withCenturyOfEra(221);
        org.joda.time.LocalDate localDate19 = localDate17.minusYears(0);
        org.joda.time.LocalDate localDate21 = localDate17.minusYears(437);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) '4', (-1), (int) (short) 100, (-1));
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((-1L), (long) 17, chronology13);
        mutablePeriod7.add((long) 26163694, chronology13);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 99, 4233600010L, periodType2, chronology13);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeField dateTimeField18 = chronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.centuryOfEra();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 10, chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.plusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = localDateTime26.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withCenturyOfEra((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plus((long) 'a');
        org.joda.time.Period period38 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(1);
        java.lang.String str41 = period40.toString();
        org.joda.time.Period period42 = period38.withFields((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Period period44 = period42.plusMillis(100);
        org.joda.time.Period period45 = period42.negated();
        org.joda.time.Period period47 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(1);
        java.lang.String str50 = period49.toString();
        org.joda.time.Period period51 = period47.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Period period53 = period51.plusMillis(100);
        boolean boolean54 = period45.equals((java.lang.Object) period53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period56 = period45.withFields((org.joda.time.ReadablePeriod) mutablePeriod55);
        mutablePeriod55.clear();
        org.joda.time.DateTime dateTime58 = dateTime36.minus((org.joda.time.ReadablePeriod) mutablePeriod55);
        org.joda.time.YearMonthDay yearMonthDay59 = dateTime36.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay61 = yearMonthDay59.minusMonths((-8));
        org.joda.time.DateMidnight dateMidnight62 = yearMonthDay61.toDateMidnight();
        int[] intArray63 = yearMonthDay61.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray65 = dateTimeField19.addWrapField((org.joda.time.ReadablePartial) localDateTime30, 1975, intArray63, 72000016);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1975");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PT1M" + "'", str41, "PT1M");
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT1M" + "'", str50, "PT1M");
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(yearMonthDay59);
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertNotNull(dateMidnight62);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[2022, 10, 22]");
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = dateTimeFormatter0.getPrinter();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra(10);
        boolean boolean14 = dateTime13.isEqualNow();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(15, 5, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 11, chronology15);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.toMutableDateTime();
        int int22 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime19, "2022", 26219841);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime24 = dateTimeFormatter0.parseMutableDateTime("P391Y-57D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P391Y-57D\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimePrinter1);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-26219842) + "'", int22 == (-26219842));
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDateTime6.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withCenturyOfEra((int) (short) 0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusMillis(26188858);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMonths(1162);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime10 = dateTime6.plusDays((int) (byte) -1);
        java.util.Date date11 = dateTime10.toDate();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, readableDuration12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18, 0);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        mutableDateTime17.set(dateTimeFieldType23, (int) ' ');
        boolean boolean27 = interval13.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean29 = interval13.contains((long) 17);
        org.joda.time.DateTime dateTime30 = interval13.getEnd();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((-1L), (long) 17, chronology35);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = timeOfDay41.toDateTimeToday(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime47 = dateTime43.plusDays((int) (byte) -1);
        java.util.Date date48 = dateTime47.toDate();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime47, readableDuration49);
        org.joda.time.Period period51 = interval50.toPeriod();
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = timeOfDay56.toDateTimeToday(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime62 = dateTime58.plusDays((int) (byte) -1);
        java.util.Date date63 = dateTime62.toDate();
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.Interval interval65 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime62, readableDuration64);
        org.joda.time.Interval interval68 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        int int71 = dateTimeZone69.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(dateTimeZone69);
        org.joda.time.ReadableDuration readableDuration73 = null;
        mutableDateTime72.add(readableDuration73, 0);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime72.dayOfWeek();
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime72.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime78 = property77.roundHalfEven();
        boolean boolean79 = interval68.isBefore((org.joda.time.ReadableInstant) mutableDateTime78);
        org.joda.time.TimeOfDay timeOfDay84 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray85 = timeOfDay84.getFields();
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.DateTime dateTime87 = timeOfDay84.toDateTimeToday(dateTimeZone86);
        org.joda.time.DateTime dateTime89 = dateTime87.withYearOfCentury(16);
        boolean boolean90 = interval68.isAfter((org.joda.time.ReadableInstant) dateTime89);
        boolean boolean91 = interval65.abuts((org.joda.time.ReadableInterval) interval68);
        org.joda.time.Duration duration92 = interval68.toDuration();
        org.joda.time.Interval interval93 = interval50.withDurationAfterStart((org.joda.time.ReadableDuration) duration92);
        org.joda.time.Interval interval94 = interval36.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration92);
        org.joda.time.Duration duration95 = interval36.toDuration();
        org.joda.time.Chronology chronology96 = interval36.getChronology();
        boolean boolean97 = interval13.contains((org.joda.time.ReadableInterval) interval36);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(date63);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(mutableDateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldArray85);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(duration92);
        org.junit.Assert.assertNotNull(interval93);
        org.junit.Assert.assertNotNull(interval94);
        org.junit.Assert.assertNotNull(duration95);
        org.junit.Assert.assertNotNull(chronology96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.Period period7 = new org.joda.time.Period((long) 25, (long) (-1), periodType2, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfDay();
        java.lang.String str10 = dateTimeField8.getAsShortText(1645514167310L);
        boolean boolean11 = dateTimeField8.isLenient();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "26167310" + "'", str10, "26167310");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        int int8 = localDate7.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime12 = localDate7.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay13.withYear(1899);
        org.joda.time.Interval interval16 = yearMonthDay13.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = yearMonthDay13.getFieldTypes();
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay13.year();
        org.joda.time.YearMonthDay yearMonthDay19 = property18.getYearMonthDay();
        java.util.Date date25 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromDateFields(date25);
        org.joda.time.LocalDate.Property property27 = localDate26.weekOfWeekyear();
        org.joda.time.LocalDate localDate28 = property27.getLocalDate();
        org.joda.time.DateTimeField dateTimeField29 = property27.getField();
        int int31 = dateTimeField29.getLeapAmount((long) '#');
        java.lang.String str33 = dateTimeField29.getAsShortText((long) 1);
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.lang.String str36 = dateTimeField29.getAsShortText((long) (-1), locale35);
        java.lang.String str37 = locale35.getScript();
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str41 = locale38.getDisplayVariant(locale40);
        java.util.Locale locale42 = locale40.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str45 = dateTimeZone44.getID();
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str50 = locale47.getDisplayVariant(locale49);
        java.lang.String str51 = dateTimeZone44.getName((long) 5, locale47);
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.lang.String str53 = locale47.getDisplayScript(locale52);
        java.lang.String str54 = locale42.getDisplayName(locale47);
        java.lang.String str55 = locale35.getDisplayName(locale42);
        int int56 = property18.getMaximumTextLength(locale42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter0.withLocale(locale42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime59 = dateTimeFormatter0.parseDateTime("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zho\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1899 + "'", int8 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonthDay19);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1" + "'", str36, "1");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.016" + "'", str45, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.016" + "'", str51, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "English" + "'", str55, "English");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusSeconds(3);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = period8.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period12.plusMillis(100);
        org.joda.time.Period period15 = period12.negated();
        int int16 = period12.getDays();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay6.minus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay6.withMillisOfSecond(52);
        java.lang.String str20 = timeOfDay6.toString();
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT1M" + "'", str11, "PT1M");
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "T00:52:49.000" + "'", str20, "T00:52:49.000");
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setLenient(false);
        long long3 = calendar0.getTimeInMillis();
        java.util.Locale locale6 = new java.util.Locale("Feb", "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.017Z");
        boolean boolean7 = calendar0.after((java.lang.Object) locale6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate10 = localDate8.plusMonths((int) 'x');
        org.joda.time.LocalDate.Property property11 = localDate10.weekOfWeekyear();
        org.joda.time.LocalDate localDate13 = localDate10.minusDays(0);
        java.util.Date date19 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate20.plusWeeks((int) (short) 0);
        int int25 = localDate20.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str28 = dateTimeZone27.getID();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = localDate20.toDateMidnight(dateTimeZone27);
        org.joda.time.LocalDate.Property property31 = localDate20.year();
        org.joda.time.LocalDate localDate32 = property31.withMinimumValue();
        org.joda.time.LocalDate localDate34 = localDate32.withWeekyear(64088019);
        int int35 = localDate13.compareTo((org.joda.time.ReadablePartial) localDate34);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645514750194,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=19,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=50,MILLISECOND=210,ZONE_OFFSET=16,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514750194L + "'", long3 == 1645514750194L);
        org.junit.Assert.assertEquals(locale6.toString(), "feb_1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.017Z");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.016" + "'", str28, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test16086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16086");
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime13.add(readableDuration14, 0);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.dayOfWeek();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfEven();
        boolean boolean20 = interval9.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        int int21 = mutableDateTime19.getHourOfDay();
        java.util.Date date30 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.fromDateFields(date30);
        int int32 = localDate31.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        int int35 = dateTimeZone33.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime36 = localDate31.toDateTimeAtCurrentTime(dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period41 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period43 = org.joda.time.Period.minutes(1);
        java.lang.String str44 = period43.toString();
        org.joda.time.Period period45 = period41.withFields((org.joda.time.ReadablePeriod) period43);
        org.joda.time.Period period47 = period45.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.months();
        int int49 = period47.get(durationFieldType48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight37.withPeriodAdded((org.joda.time.ReadablePeriod) period47, 0);
        org.joda.time.DateMidnight.Property property52 = dateMidnight37.monthOfYear();
        org.joda.time.DateMidnight dateMidnight53 = property52.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight55 = property52.addToCopy((int) (byte) 10);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateMidnight.Property property58 = dateMidnight57.weekyear();
        org.joda.time.DateMidnight dateMidnight60 = property58.setCopy(1899);
        boolean boolean61 = mutableDateTime19.isBefore((org.joda.time.ReadableInstant) dateMidnight60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight60.minusYears(20);
        org.joda.time.DateMidnight.Property property64 = dateMidnight60.dayOfYear();
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight60.minusMonths(506);
        org.joda.time.DateTimeZone dateTimeZone67 = dateMidnight66.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(5603523, 26283, 19010, 629, 208, 168, 26726126, dateTimeZone67);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 629 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1899 + "'", int32 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT1M" + "'", str44, "PT1M");
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateMidnight51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateMidnight60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateMidnight66);
        org.junit.Assert.assertNotNull(dateTimeZone67);
    }

    @Test
    public void test16087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16087");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        boolean boolean12 = dateTime7.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        boolean boolean15 = dateTime7.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTime();
        boolean boolean19 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime22 = dateTime7.minus((long) (byte) 0);
        org.joda.time.DateTime dateTime24 = dateTime7.plusMinutes(38);
        int int25 = dateTime24.getDayOfYear();
        org.joda.time.DateTime dateTime27 = dateTime24.plus(1456102372001L);
        int int28 = dateTime27.getYearOfEra();
        org.joda.time.DateTime dateTime30 = dateTime27.withWeekOfWeekyear(15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 53 + "'", int25 == 53);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2068 + "'", int28 == 2068);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test16088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16088");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime();
        int int10 = dateTime9.getYearOfCentury();
        org.joda.time.DateTime.Property property11 = dateTime9.dayOfYear();
        org.joda.time.DateTime dateTime12 = dateTime9.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test16089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16089");
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.Period period9 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology7);
        org.joda.time.Period period10 = new org.joda.time.Period((long) 3, chronology7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (-1), (long) 8, chronology7);
        mutablePeriod11.setPeriod(26277709, 26530382, (int) 'a', (-29), (-369), 18, 42665, 0);
        mutablePeriod11.add((-691200000L));
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test16090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16090");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
        boolean boolean13 = interval2.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        int int14 = mutableDateTime12.getHourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.dayOfWeek();
        boolean boolean16 = mutableDateTime12.isAfterNow();
        mutableDateTime12.addHours(221);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16091");
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withCenturyOfEra(10);
        boolean boolean13 = dateTime12.isEqualNow();
        org.joda.time.Chronology chronology14 = dateTime12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(15, 5, chronology14);
        org.joda.time.DurationField durationField16 = chronology14.years();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 25, (-11L), chronology14);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology14);
        boolean boolean19 = dateTime18.isBeforeNow();
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16092");
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = timeOfDay7.toDateTimeToday(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra(10);
        boolean boolean12 = dateTime11.isEqualNow();
        org.joda.time.Chronology chronology13 = dateTime11.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(15, 5, chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(1L, chronology13);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.joda.time.TimeOfDay timeOfDay19 = property17.withMinimumValue();
        int int20 = property17.getMaximumValue();
        org.joda.time.TimeOfDay timeOfDay21 = property17.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.plusMinutes(936);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay21.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay26 = property24.setCopy("yearOfEra");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfEra\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 23 + "'", int20 == 23);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test16093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16093");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime3, readableDuration12);
        mutableDateTime3.setTime(10, 2, 0, 55);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.weekOfWeekyear();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        java.lang.String str24 = period23.toString();
        org.joda.time.LocalTime localTime25 = localTime21.plus((org.joda.time.ReadablePeriod) period23);
        boolean boolean26 = mutableDateTime3.equals((java.lang.Object) localTime25);
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = timeOfDay31.toDateTimeToday(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime37 = dateTime33.plusDays((int) (byte) -1);
        java.util.Date date38 = dateTime37.toDate();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime37, readableDuration39);
        int int41 = dateTime37.getMillisOfDay();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime37.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT1M" + "'", str24, "PT1M");
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3172000 + "'", int41 == 3172000);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property44);
    }

    @Test
    public void test16094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16094");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 12);
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay3 = property2.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay5 = property2.addToCopy(13);
        org.joda.time.TimeOfDay timeOfDay7 = property2.addToCopy((-2));
        org.joda.time.TimeOfDay timeOfDay9 = property2.addToCopy(441);
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str13 = locale10.getDisplayVariant(locale12);
        java.util.Locale locale14 = locale12.stripExtensions();
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale14.getISO3Country();
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str20 = locale17.getDisplayVariant(locale19);
        java.lang.String str21 = locale14.getDisplayName(locale19);
        java.util.Set<java.lang.Character> charSet22 = locale14.getExtensionKeys();
        java.lang.String str23 = property2.getAsShortText(locale14);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTime dateTime27 = dateTime26.toDateTime();
        org.joda.time.DateTime.Property property28 = dateTime27.centuryOfEra();
        org.joda.time.DateTime dateTime30 = property28.addToCopy((long) 58);
        java.util.Calendar.Builder builder31 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder34 = builder31.set(2, 32772);
        java.util.Calendar.Builder builder37 = builder31.set(3, (int) (short) 0);
        java.util.Calendar.Builder builder41 = builder31.setWeekDate(3172000, 2598, (int) '#');
        java.util.Calendar.Builder builder43 = builder31.setLenient(true);
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Calendar.Builder builder45 = builder43.setLocale(locale44);
        java.util.Calendar calendar46 = dateTime30.toCalendar(locale44);
        java.lang.String str47 = locale44.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay48 = property2.setCopy("114826Z", locale44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"114826Z\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(calendar46);
// flaky:         org.junit.Assert.assertEquals(calendar46.toString(), "java.util.GregorianCalendar[time=184675793150310,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7822,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=50,MILLISECOND=310,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "CN" + "'", str47, "CN");
    }

    @Test
    public void test16095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16095");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 1899, dateTimeZone2);
        long long7 = dateTimeZone2.nextTransition((long) 0);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(10L, dateTimeZone2);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone2);
        int int10 = yearMonthDay9.getDayOfMonth();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = yearMonthDay9.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
    }

    @Test
    public void test16096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16096");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        int int14 = dateTime11.getMillisOfDay();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readablePeriod0, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Duration duration16 = interval15.toDuration();
        long long17 = duration16.getMillis();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 5, chronology22);
        org.joda.time.Chronology chronology24 = chronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((-259200000L), chronology24);
        java.util.GregorianCalendar gregorianCalendar27 = dateMidnight26.toGregorianCalendar();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = timeOfDay37.toDateTimeToday(dateTimeZone38);
        mutableDateTime32.setZoneRetainFields(dateTimeZone38);
        mutableDateTime32.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        mutableDateTime32.setZone(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime32.add(readableDuration47);
        mutableDateTime32.setMillisOfDay(3);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) mutableDateTime32);
        mutableDateTime32.setMillis(3116879999984L);
        org.joda.time.Period period55 = org.joda.time.Period.years(59);
        org.joda.time.Period period57 = period55.withWeeks((int) (byte) 100);
        org.joda.time.Period period59 = period57.plusMonths(8);
        mutableDateTime32.add((org.joda.time.ReadablePeriod) period57, 437);
        mutableDateTime32.addWeeks(443);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3172001 + "'", int14 == 3172001);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
    }

    @Test
    public void test16097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16097");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withYear(1899);
        org.joda.time.Interval interval15 = yearMonthDay12.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonthDay12.getFieldTypes();
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay12.year();
        org.joda.time.YearMonthDay yearMonthDay18 = property17.getYearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) property17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.YearMonthDay$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonthDay18);
    }

    @Test
    public void test16098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16098");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone4);
        boolean boolean9 = dateTimeZone4.isStandardOffset((long) 10);
        long long13 = dateTimeZone4.convertLocalToUTC((long) 38, true, 1645514205352L);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plus((long) '4');
        org.joda.time.DateTime dateTime25 = dateTime23.plusSeconds(3172001);
        boolean boolean26 = dateTimeZone4.equals((java.lang.Object) dateTime23);
        org.joda.time.Chronology chronology27 = dateTime23.getChronology();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.now(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.dayOfYear();
        org.joda.time.DurationField durationField30 = chronology27.seconds();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(chronology27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, 26686090, 26380612, 94, chronology27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26686090 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 38L + "'", long13 == 38L);
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
    }

    @Test
    public void test16099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 10, chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod15, 15);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.plusYears(32772);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(10590);
        org.joda.time.Chronology chronology22 = localDateTime19.getChronology();
        int int23 = localDateTime19.getEra();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test16100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16100");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) ' ');
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusMonths(2022);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((-1L), (long) 17, chronology8);
        long long10 = interval9.getStartMillis();
        org.joda.time.Duration duration11 = interval9.toDuration();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight1.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight1.minus((long) 32769);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((-8), 5603523, 38090, 25);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 12);
        org.joda.time.format.PeriodFormatter periodFormatter23 = null;
        java.lang.String str24 = mutablePeriod22.toString(periodFormatter23);
        org.joda.time.DurationFieldType[] durationFieldTypeArray25 = mutablePeriod22.getFieldTypes();
        mutablePeriod22.addMinutes(2);
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight14.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod22, (int) (short) 1);
        int int31 = dateMidnight30.getMillisOfSecond();
        org.joda.time.DateMidnight.Property property32 = dateMidnight30.era();
        org.joda.time.DateMidnight dateMidnight33 = property32.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight34 = property32.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight35 = property32.withMaximumValue();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.088S" + "'", str24, "PT0.088S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray25);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(dateMidnight35);
    }

    @Test
    public void test16101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16101");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.plusMinutes(53);
        org.joda.time.DateTime dateTime15 = dateTime11.withYearOfCentury(2);
        org.joda.time.DateTime dateTime17 = dateTime11.minusHours((-82));
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test16102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16102");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        int int6 = localDate4.getValue((int) (byte) 0);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate9 = localDate4.withDayOfMonth(24);
        org.joda.time.LocalDate.Property property10 = localDate4.dayOfWeek();
        java.util.Date date16 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromDateFields(date16);
        int int18 = localDate17.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime22 = localDate17.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay23.withYear(1899);
        org.joda.time.Interval interval26 = yearMonthDay23.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = yearMonthDay23.getFieldTypes();
        org.joda.time.YearMonthDay.Property property28 = yearMonthDay23.year();
        org.joda.time.YearMonthDay yearMonthDay29 = property28.getYearMonthDay();
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str34 = locale31.getDisplayVariant(locale33);
        org.joda.time.YearMonthDay yearMonthDay35 = property28.setCopy("6", locale33);
        java.lang.String str36 = property28.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property28.getFieldType();
        boolean boolean38 = localDate4.isSupported(dateTimeFieldType37);
        int int39 = localDate4.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1899 + "'", int18 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2022" + "'", str36, "2022");
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test16103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16103");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 1961);
    }

    @Test
    public void test16104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16104");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.util.Locale locale5 = locale3.stripExtensions();
        java.lang.String str8 = nameProvider0.getShortName(locale3, "20220222T071654.324Z", "1970-01-01T00:00:00.010");
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str12 = locale9.getDisplayVariant(locale11);
        java.util.Locale locale13 = locale11.stripExtensions();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = timeOfDay18.toDateTimeToday(dateTimeZone19);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay18.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay22 = property21.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay24 = property21.addToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str27 = dateTimeZone26.getID();
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str32 = locale29.getDisplayVariant(locale31);
        java.lang.String str33 = dateTimeZone26.getName((long) 5, locale29);
        java.lang.String str34 = property21.getAsText(locale29);
        java.lang.String str35 = locale11.getDisplayScript(locale29);
        java.util.Set<java.lang.Character> charSet36 = locale29.getExtensionKeys();
        java.lang.String str39 = nameProvider0.getName(locale29, "Fri Mar 10 01:35:00 UTC 1899", "26");
        java.lang.String str40 = locale29.getDisplayCountry();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.016" + "'", str27, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.016" + "'", str33, "+00:00:00.016");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "52" + "'", str34, "52");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test16105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16105");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.millisOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 10, chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod13.setPeriod(readableDuration14, chronology15);
        mutablePeriod13.setSeconds(0);
        int int19 = mutablePeriod13.getMillis();
        int int20 = mutablePeriod13.getYears();
        mutableDateTime9.add((org.joda.time.ReadablePeriod) mutablePeriod13);
        int int22 = mutableDateTime9.getYearOfEra();
        mutableDateTime9.addHours(1899);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime9.minuteOfDay();
        mutableDateTime9.setWeekyear(0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test16106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16106");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.010");
        mutableDateTime1.addMillis(39);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test16107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16107");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime localTime11 = localTime0.minusHours((-1));
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime.Property property13 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime15 = property13.addWrapFieldToCopy(17);
        org.joda.time.LocalTime localTime16 = property13.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test16108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16108");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology4);
        org.joda.time.Period period6 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology4);
        org.joda.time.DurationField durationField7 = chronology4.halfdays();
        org.joda.time.DurationField durationField8 = chronology4.days();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology4.getZone();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(dateTimeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        long long13 = dateTimeZone9.previousTransition((long) 1894);
        boolean boolean14 = dateTimeZone9.isFixed();
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1894L + "'", long13 == 1894L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16109");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusSeconds(3);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = period8.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period12.plusMillis(100);
        org.joda.time.Period period15 = period12.negated();
        int int16 = period12.getDays();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay6.minus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay6.withMillisOfSecond(52);
        int int20 = timeOfDay6.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay6.plusSeconds(11951684);
        int int23 = timeOfDay6.getSecondOfMinute();
        org.joda.time.TimeOfDay.Property property24 = timeOfDay6.millisOfSecond();
        int int25 = property24.getMinimumValueOverall();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology30 = localTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 5, chronology30);
        org.joda.time.Chronology chronology32 = chronology30.withUTC();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology32.getZone();
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone33);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology39 = localTime38.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.hours();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.secondOfDay();
        java.util.Locale locale42 = java.util.Locale.KOREAN;
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str45 = locale42.getDisplayVariant(locale44);
        java.util.Locale locale46 = locale44.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str49 = dateTimeZone48.getID();
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str54 = locale51.getDisplayVariant(locale53);
        java.lang.String str55 = dateTimeZone48.getName((long) 5, locale51);
        java.util.Locale locale56 = java.util.Locale.KOREAN;
        java.lang.String str57 = locale51.getDisplayScript(locale56);
        java.lang.String str58 = locale46.getDisplayName(locale51);
        int int59 = dateTimeField41.getMaximumShortTextLength(locale51);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str63 = dateTimeZone62.getID();
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str68 = locale65.getDisplayVariant(locale67);
        java.lang.String str69 = dateTimeZone62.getName((long) 5, locale65);
        java.lang.String str70 = locale65.getVariant();
        java.lang.String str71 = dateTimeField41.getAsText(30844800000L, locale65);
        java.lang.String str72 = dateTimeZone33.getShortName(0L, locale65);
        int int73 = property24.getMaximumShortTextLength(locale65);
        int int74 = property24.get();
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT1M" + "'", str11, "PT1M");
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 49 + "'", int23 == 49);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.016" + "'", str49, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.016" + "'", str55, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5 + "'", int59 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+00:00:00.016" + "'", str63, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+00:00:00.016" + "'", str69, "+00:00:00.016");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "0" + "'", str71, "0");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+00:00" + "'", str72, "+00:00");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 3 + "'", int73 == 3);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test16110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16110");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusMillis((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusYears(52);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.monthOfYear();
        int int15 = localDateTime13.getYearOfEra();
        int int16 = localDateTime13.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
    }

    @Test
    public void test16111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16111");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        int int11 = dateTimeField9.getLeapAmount((long) '#');
        java.lang.String str13 = dateTimeField9.getAsShortText((long) 1);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay((long) 1899);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period20 = org.joda.time.Period.minutes(1);
        java.lang.String str21 = period20.toString();
        org.joda.time.Period period22 = period18.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period24 = period22.plusMillis(100);
        org.joda.time.LocalTime localTime25 = localTime16.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period27 = period22.plusHours((int) 'a');
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay15.plus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.Period period31 = org.joda.time.Period.ZERO;
        org.joda.time.Period period33 = period31.plusDays((int) 'x');
        int[] intArray34 = period31.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = dateTimeField9.set((org.joda.time.ReadablePartial) timeOfDay28, 33660116, intArray34, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT1M" + "'", str21, "PT1M");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test16112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16112");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((-1L), (long) 17, chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.yearOfCentury();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        java.lang.String str15 = period14.toString();
        org.joda.time.Period period16 = period12.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period18 = period16.plusMillis(100);
        org.joda.time.Period period19 = period16.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        boolean boolean22 = period16.isSupported(durationFieldType21);
        org.joda.time.Period period24 = period16.minusYears(0);
        org.joda.time.Period period26 = period24.plusMonths(15);
        org.joda.time.Period period28 = period24.withMinutes(48);
        org.joda.time.DateTime dateTime30 = dateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) period24, 26196);
        org.joda.time.DateTime dateTime31 = dateTime30.toDateTimeISO();
        org.joda.time.DateTime dateTime32 = dateTime30.withEarlierOffsetAtOverlap();
        int int33 = dateTime32.getEra();
        org.joda.time.Period period35 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        java.lang.String str38 = period37.toString();
        org.joda.time.Period period39 = period35.withFields((org.joda.time.ReadablePeriod) period37);
        int int40 = period35.getMinutes();
        org.joda.time.Period period41 = period35.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod42 = period41.toMutablePeriod();
        org.joda.time.Period period43 = period41.toPeriod();
        org.joda.time.Period period45 = period41.multipliedBy((int) (short) 10);
        org.joda.time.DateTime dateTime47 = dateTime32.withPeriodAdded((org.joda.time.ReadablePeriod) period45, 22832);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableInstant) dateTime47);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT1M" + "'", str15, "PT1M");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT1M" + "'", str38, "PT1M");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(mutablePeriod42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(dateTime47);
    }

    @Test
    public void test16113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16113");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale[] localeArray7 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList8);
        boolean boolean11 = strSet3.removeAll((java.util.Collection<java.util.Locale>) localeList10);
        strSet3.clear();
        boolean boolean13 = strSet3.isEmpty();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18, 0);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((java.lang.Object) mutableDateTime17);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay23.plusMonths(7);
        boolean boolean26 = strSet3.equals((java.lang.Object) yearMonthDay23);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Interval interval29 = yearMonthDay23.toInterval(dateTimeZone28);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period36 = org.joda.time.Period.minutes(1);
        java.lang.String str37 = period36.toString();
        org.joda.time.Period period38 = period34.withFields((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period40 = period38.plusMillis(100);
        org.joda.time.Period period41 = period38.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getDurationType();
        boolean boolean44 = period38.isSupported(durationFieldType43);
        boolean boolean45 = periodType32.isSupported(durationFieldType43);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 59, (long) 9, periodType32);
        org.joda.time.PeriodType periodType47 = periodType32.withSecondsRemoved();
        org.joda.time.PeriodType periodType48 = periodType47.withDaysRemoved();
        org.joda.time.PeriodType periodType49 = periodType48.withHoursRemoved();
        org.joda.time.PeriodType periodType50 = periodType48.withHoursRemoved();
        org.joda.time.Period period51 = interval29.toPeriod(periodType48);
        org.joda.time.PeriodType periodType52 = periodType48.withMinutesRemoved();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT1M" + "'", str37, "PT1M");
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
    }

    @Test
    public void test16114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16114");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period7 = period5.plusMillis(100);
        org.joda.time.Period period9 = period5.minusMillis((int) (byte) 1);
        org.joda.time.Period period11 = period9.plusMinutes(99);
        org.joda.time.Period period13 = period9.plusHours((int) 'a');
        int int14 = period13.size();
        org.joda.time.format.PeriodFormatter periodFormatter15 = null;
        java.lang.String str16 = period13.toString(periodFormatter15);
        org.joda.time.Period period18 = period13.minusMillis(26304835);
        org.joda.time.Period period20 = period18.withMinutes((-26165227));
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period24 = org.joda.time.Period.minutes(1);
        java.lang.String str25 = period24.toString();
        org.joda.time.LocalTime localTime26 = localTime22.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        java.lang.String str31 = period30.toString();
        org.joda.time.Period period32 = period28.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period32.plusMillis(100);
        org.joda.time.Period period35 = period32.negated();
        org.joda.time.Period period37 = period32.plusYears(55);
        org.joda.time.format.PeriodFormatter periodFormatter38 = null;
        java.lang.String str39 = period37.toString(periodFormatter38);
        org.joda.time.Period period41 = period37.withMillis(14);
        org.joda.time.LocalTime localTime42 = localTime22.minus((org.joda.time.ReadablePeriod) period41);
        java.lang.Object obj45 = null;
        org.joda.time.Period period47 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(1);
        java.lang.String str50 = period49.toString();
        org.joda.time.Period period51 = period47.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period53 = period47.normalizedStandard(periodType52);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(periodType52);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(obj45, periodType52);
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology58 = localTime57.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.hours();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.secondOfDay();
        org.joda.time.DurationField durationField61 = chronology58.months();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(10L, 11419200000000L, periodType52, chronology58);
        org.joda.time.Period period63 = period41.normalizedStandard(periodType52);
        org.joda.time.Period period64 = period18.normalizedStandard(periodType52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT97H1M0.001S" + "'", str16, "PT97H1M0.001S");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT1M" + "'", str25, "PT1M");
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT1M" + "'", str31, "PT1M");
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "P55YT1M" + "'", str39, "P55YT1M");
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT1M" + "'", str50, "PT1M");
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period64);
    }

    @Test
    public void test16115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16115");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = timeOfDay8.getFields();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTimeToday(dateTimeZone10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        java.lang.String str16 = period15.toString();
        org.joda.time.Period period17 = period13.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period19 = period13.normalizedStandard(periodType18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration3, (org.joda.time.ReadableInstant) dateTime11, periodType18);
        org.joda.time.PeriodType periodType21 = periodType18.withMillisRemoved();
        org.joda.time.Period period22 = interval2.toPeriod(periodType21);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = timeOfDay27.getFields();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfCentury(16);
        org.joda.time.DateTime dateTime34 = dateTime30.plusYears((-1));
        boolean boolean35 = interval2.contains((org.joda.time.ReadableInstant) dateTime30);
        boolean boolean36 = interval2.isBeforeNow();
        java.lang.String str37 = interval2.toString();
        org.joda.time.DateTime dateTime38 = interval2.getStart();
        org.joda.time.DateTime dateTime40 = dateTime38.withYear(29);
        org.joda.time.DateTime.Property property41 = dateTime40.millisOfSecond();
        org.joda.time.DateTime dateTime42 = property41.withMaximumValue();
        org.joda.time.DateTime.Property property43 = dateTime42.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField44 = property43.getField();
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT1M" + "'", str16, "PT1M");
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.097Z" + "'", str37, "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.097Z");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test16116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16116");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = timeOfDay10.toDateTimeToday(dateTimeZone11);
        mutableDateTime5.setZoneRetainFields(dateTimeZone11);
        mutableDateTime5.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        mutableDateTime5.setZone(dateTimeZone16);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((-1L), (long) 17, chronology24);
        mutableDateTime5.setChronology(chronology24);
        java.lang.String str27 = chronology24.toString();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.Period period29 = new org.joda.time.Period(8380800000L, chronology24);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(38090L, chronology24);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = timeOfDay36.toDateTimeToday(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minus((long) (short) 0);
        org.joda.time.Period period42 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        java.lang.String str45 = period44.toString();
        org.joda.time.Period period46 = period42.withFields((org.joda.time.ReadablePeriod) period44);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period48 = period42.normalizedStandard(periodType47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(readableDuration31, (org.joda.time.ReadableInstant) dateTime40, periodType47);
        int int50 = mutablePeriod49.getMonths();
        mutablePeriod49.add((long) 1);
        org.joda.time.MutablePeriod mutablePeriod53 = mutablePeriod49.copy();
        mutablePeriod49.setYears((-3172001));
        mutableDateTime30.add((org.joda.time.ReadablePeriod) mutablePeriod49);
        int int57 = mutablePeriod49.getWeeks();
        mutablePeriod49.addYears(5603523);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ISOChronology[UTC]" + "'", str27, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PT1M" + "'", str45, "PT1M");
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test16117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16117");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        mutableDateTime3.addDays(1899);
        mutableDateTime3.addDays(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.getMutableDateTime();
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(instant14);
    }

    @Test
    public void test16118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16118");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.secondOfMinute();
        org.joda.time.Interval interval4 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime2);
        boolean boolean5 = interval4.isAfterNow();
        boolean boolean7 = interval4.isAfter((long) 19);
        long long8 = interval4.toDurationMillis();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = timeOfDay13.getFields();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plus((long) '4');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, readableInstant19);
        java.lang.String str21 = interval20.toString();
        boolean boolean22 = interval4.abuts((org.joda.time.ReadableInterval) interval20);
        long long23 = interval20.toDurationMillis();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022-02-22T00:52:52.000Z/2022-02-22T07:25:50.643Z" + "'", str21, "2022-02-22T00:52:52.000Z/2022-02-22T07:25:50.643Z");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 23578643L + "'", long23 == 23578643L);
    }

    @Test
    public void test16119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16119");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.LocalTime localTime5 = localTime1.plus((org.joda.time.ReadablePeriod) period3);
        org.joda.time.LocalTime.Property property6 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(1);
        java.lang.String str14 = period13.toString();
        org.joda.time.Period period15 = period11.withFields((org.joda.time.ReadablePeriod) period13);
        int int16 = period11.getMinutes();
        org.joda.time.Period period17 = period11.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.joda.time.LocalTime localTime20 = localTime9.withPeriodAdded((org.joda.time.ReadablePeriod) period17, 26188858);
        org.joda.time.LocalTime localTime22 = localTime9.withMillisOfDay(26164018);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) ' ');
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusMonths(2022);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.withYearOfCentury(0);
        org.joda.time.DateTime dateTime29 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.LocalTime localTime31 = localTime22.plusMinutes(994);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) '4', chronology34);
        org.joda.time.TimeOfDay.Property property36 = timeOfDay35.secondOfMinute();
        int int37 = property36.getMaximumValue();
        org.joda.time.TimeOfDay timeOfDay39 = property36.addToCopy(38);
        org.joda.time.LocalTime localTime40 = localTime22.withFields((org.joda.time.ReadablePartial) timeOfDay39);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        java.lang.String str45 = period44.toString();
        org.joda.time.LocalTime localTime46 = localTime42.plus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.LocalTime.Property property47 = localTime42.minuteOfHour();
        org.joda.time.LocalTime localTime48 = property47.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime50 = localTime48.plusMillis(15);
        int int51 = localTime50.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str53 = dateTimeFieldType52.toString();
        boolean boolean54 = localTime50.isSupported(dateTimeFieldType52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay56 = timeOfDay39.withField(dateTimeFieldType52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT1M" + "'", str14, "PT1M");
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 59 + "'", int37 == 59);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PT1M" + "'", str45, "PT1M");
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 15 + "'", int51 == 15);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "monthOfYear" + "'", str53, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test16120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16120");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = timeOfDay9.getFields();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTimeToday(dateTimeZone11);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = period14.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period20 = period14.normalizedStandard(periodType19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration4, (org.joda.time.ReadableInstant) dateTime12, periodType19);
        org.joda.time.PeriodType periodType22 = periodType19.withMillisRemoved();
        org.joda.time.Period period23 = interval3.toPeriod(periodType22);
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray29 = timeOfDay28.getFields();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTimeToday(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withYearOfCentury(16);
        org.joda.time.DateTime dateTime35 = dateTime31.plusYears((-1));
        boolean boolean36 = interval3.contains((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime31.getZone();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) 31, dateTimeZone37);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray44 = timeOfDay43.getFields();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTimeToday(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.plus((long) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType49.getDurationType();
        org.joda.time.DateTime dateTime52 = dateTime48.withField(dateTimeFieldType49, 16);
        org.joda.time.LocalTime.Property property53 = localTime38.property(dateTimeFieldType49);
        org.joda.time.LocalTime localTime54 = property53.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime55 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period57 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period59 = org.joda.time.Period.minutes(1);
        java.lang.String str60 = period59.toString();
        org.joda.time.Period period61 = period57.withFields((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Period period63 = period61.plusMillis(100);
        org.joda.time.LocalTime localTime64 = localTime55.minus((org.joda.time.ReadablePeriod) period61);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        int int67 = dateTimeZone65.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(dateTimeZone65);
        org.joda.time.ReadableDuration readableDuration69 = null;
        mutableDateTime68.add(readableDuration69, 0);
        org.joda.time.Period period73 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period75 = org.joda.time.Period.minutes(1);
        java.lang.String str76 = period75.toString();
        org.joda.time.Period period77 = period73.withFields((org.joda.time.ReadablePeriod) period75);
        org.joda.time.Period period79 = period77.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType80 = org.joda.time.DurationFieldType.months();
        int int81 = period79.get(durationFieldType80);
        mutableDateTime68.add(durationFieldType80, 7);
        boolean boolean84 = period61.isSupported(durationFieldType80);
        org.joda.time.Period period86 = period61.plusWeeks(11);
        org.joda.time.LocalTime localTime88 = localTime54.withPeriodAdded((org.joda.time.ReadablePeriod) period86, 5026);
        org.junit.Assert.assertNotNull(dateTimeFieldArray10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT1M" + "'", str17, "PT1M");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(dateTimeFieldArray29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeFieldArray44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT1M" + "'", str60, "PT1M");
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "PT1M" + "'", str76, "PT1M");
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(durationFieldType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(localTime88);
    }

    @Test
    public void test16121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16121");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.LocalTime localTime5 = localTime1.plus((org.joda.time.ReadablePeriod) period3);
        org.joda.time.LocalTime.Property property6 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str13 = localTime7.toString("\uc911\uad6d", locale11);
        java.lang.String str14 = locale11.getDisplayScript();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\uc911\uad6d" + "'", str13, "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16122");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period7 = period5.plusMillis(100);
        org.joda.time.Period period8 = period5.negated();
        org.joda.time.Period period10 = period8.withMillis(1899);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        int int12 = period10.getMillis();
        org.joda.time.Period period14 = period10.plusMonths(100);
        org.joda.time.Period period16 = period10.withMonths(32772);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.LocalTime localTime26 = localTime17.minus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.LocalTime localTime28 = localTime17.minusHours((-1));
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.halfdays();
        java.lang.String str30 = durationFieldType29.toString();
        boolean boolean31 = localTime17.isSupported(durationFieldType29);
        int int32 = period16.indexOf(durationFieldType29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours33 = period16.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1899 + "'", int12 == 1899);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT1M" + "'", str22, "PT1M");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "halfdays" + "'", str30, "halfdays");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test16123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16123");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        java.lang.String str10 = property9.getAsText();
        java.lang.String str11 = property9.toString();
        org.joda.time.DateTime dateTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime16.add(readableDuration17, 0);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.yearOfEra();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 5, chronology25);
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        mutableDateTime16.setChronology(chronology25);
        org.joda.time.DurationField durationField29 = chronology25.years();
        org.joda.time.DateTimeField dateTimeField30 = chronology25.dayOfMonth();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) dateTime12, chronology25);
        org.joda.time.TimeOfDay timeOfDay32 = org.joda.time.TimeOfDay.fromMillisOfDay(1645514282694L, chronology25);
        org.joda.time.DurationField durationField33 = chronology25.seconds();
        org.joda.time.DurationField durationField34 = chronology25.days();
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "February" + "'", str10, "February");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[monthOfYear]" + "'", str11, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
    }

    @Test
    public void test16124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16124");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight.Property property30 = dateMidnight15.monthOfYear();
        org.joda.time.DateMidnight dateMidnight32 = property30.addToCopy(15);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withYearOfCentury(55);
        int int35 = dateMidnight32.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight32.minus(readablePeriod36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plusDays((-2));
        org.joda.time.DateTime dateTime40 = dateMidnight37.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight37.withMonthOfYear(2);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.plusMonths(29);
        org.joda.time.DateMidnight.Property property45 = dateMidnight44.monthOfYear();
        boolean boolean46 = property45.isLeap();
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1899 + "'", int10 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT1M" + "'", str22, "PT1M");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test16125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16125");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        org.joda.time.DateTime dateTime12 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance();
        int int16 = calendar14.getMaximum((int) (short) 0);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromCalendarFields(calendar14);
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfSecond();
        org.joda.time.DateTime dateTime19 = dateTime12.withFields((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.LocalTime localTime21 = localTime17.withFields(readablePartial20);
        org.joda.time.LocalTime localTime23 = localTime17.withMillisOfDay(15);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(17107200000L);
        int int26 = mutablePeriod25.getMonths();
        org.joda.time.LocalTime localTime27 = localTime23.plus((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.LocalTime localTime29 = localTime27.withHourOfDay(5);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645514750793,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=19,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=50,MILLISECOND=809,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
    }

    @Test
    public void test16126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16126");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(0L);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours((-60));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        java.lang.String str6 = dateTime2.toString(dateTimeFormatter5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.parse("T04:15:32.000", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"T04:15:32.000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-001" + "'", str6, "1970-001");
    }

    @Test
    public void test16127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16127");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate9 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate11 = property7.setCopy(1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfCentury(0);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        int int20 = localDate18.getDayOfWeek();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.016" + "'", str14, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test16128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16128");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = timeOfDay5.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minus((long) (short) 0);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(1);
        java.lang.String str14 = period13.toString();
        org.joda.time.Period period15 = period11.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period17 = period11.normalizedStandard(periodType16);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime9, periodType16);
        org.joda.time.DateTime dateTime19 = dateTime9.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfHour();
        org.joda.time.DateTime.Property property21 = dateTime19.dayOfMonth();
        org.joda.time.DateTime dateTime22 = property21.withMinimumValue();
        org.joda.time.DateTime dateTime24 = property21.addToCopy((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT1M" + "'", str14, "PT1M");
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test16129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16129");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withDurationAdded(readableDuration11, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withMillisOfDay((int) ' ');
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusMonths(26);
        org.joda.time.LocalDateTime.Property property21 = localDateTime15.weekyear();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test16130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16130");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
        boolean boolean13 = interval2.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        int int14 = mutableDateTime12.getHourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundHalfEven();
        java.lang.String str18 = mutableDateTime17.toString();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutableDateTime25.add(readableDuration26, 0);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime25.dayOfWeek();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfEven();
        boolean boolean32 = interval21.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        int int33 = mutableDateTime31.getHourOfDay();
        java.util.Date date42 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.fromDateFields(date42);
        int int44 = localDate43.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        int int47 = dateTimeZone45.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime48 = localDate43.toDateTimeAtCurrentTime(dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period53 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period55 = org.joda.time.Period.minutes(1);
        java.lang.String str56 = period55.toString();
        org.joda.time.Period period57 = period53.withFields((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Period period59 = period57.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.months();
        int int61 = period59.get(durationFieldType60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight49.withPeriodAdded((org.joda.time.ReadablePeriod) period59, 0);
        org.joda.time.DateMidnight.Property property64 = dateMidnight49.monthOfYear();
        org.joda.time.DateMidnight dateMidnight65 = property64.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight67 = property64.addToCopy((int) (byte) 10);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateMidnight.Property property70 = dateMidnight69.weekyear();
        org.joda.time.DateMidnight dateMidnight72 = property70.setCopy(1899);
        boolean boolean73 = mutableDateTime31.isBefore((org.joda.time.ReadableInstant) dateMidnight72);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology74);
        org.joda.time.DateTime dateTime77 = dateTime75.withHourOfDay(3);
        org.joda.time.DateTime dateTime79 = dateTime75.withSecondOfMinute(16);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime31, (org.joda.time.ReadableInstant) dateTime75);
        int int81 = dateTime75.getSecondOfMinute();
        org.joda.time.DateTime dateTime83 = dateTime75.minusWeeks(0);
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) dateTime83);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022-02-22T00:00:00.000Z" + "'", str18, "2022-02-22T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1899 + "'", int44 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateMidnight51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT1M" + "'", str56, "PT1M");
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertNotNull(dateMidnight67);
        org.junit.Assert.assertNotNull(dateMidnight69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(dateMidnight72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime79);
// flaky:         org.junit.Assert.assertTrue("'" + int81 + "' != '" + 50 + "'", int81 == 50);
        org.junit.Assert.assertNotNull(dateTime83);
    }

    @Test
    public void test16131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16131");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale[] localeArray7 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList8);
        boolean boolean11 = strSet3.removeAll((java.util.Collection<java.util.Locale>) localeList10);
        java.util.Iterator<java.util.Locale> localeItor12 = localeList10.iterator();
        java.util.Iterator<java.util.Locale> localeItor13 = localeList10.iterator();
        java.util.Iterator<java.util.Locale> localeItor14 = localeList10.iterator();
        localeList10.clear();
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] {};
        java.lang.Cloneable[] cloneableArray17 = new java.lang.Cloneable[] {};
        java.lang.Cloneable[][] cloneableArray18 = new java.lang.Cloneable[][] { cloneableArray16, cloneableArray17 };
        java.lang.Cloneable[][] cloneableArray19 = localeList10.toArray(cloneableArray18);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period22 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period24 = org.joda.time.Period.minutes(1);
        java.lang.String str25 = period24.toString();
        org.joda.time.Period period26 = period22.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period28 = period26.plusMillis(100);
        org.joda.time.LocalTime localTime29 = localTime20.minus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.LocalTime localTime31 = localTime20.minusHours((-1));
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.LocalTime.Property property33 = localTime31.millisOfDay();
        org.joda.time.LocalTime localTime34 = property33.roundCeilingCopy();
        boolean boolean35 = localeList10.remove((java.lang.Object) property33);
        org.joda.time.LocalTime localTime37 = property33.setCopy("40");
        org.joda.time.LocalTime localTime38 = property33.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localeItor12);
        org.junit.Assert.assertNotNull(localeItor13);
        org.junit.Assert.assertNotNull(localeItor14);
        org.junit.Assert.assertNotNull(cloneableArray16);
        org.junit.Assert.assertNotNull(cloneableArray17);
        org.junit.Assert.assertNotNull(cloneableArray18);
        org.junit.Assert.assertNotNull(cloneableArray19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT1M" + "'", str25, "PT1M");
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
    }

    @Test
    public void test16132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16132");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        java.lang.String str7 = mutableDateTime3.toString();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime3.copy();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add((long) 11);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray18 = timeOfDay17.getFields();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTime.Property property21 = dateTime20.monthOfYear();
        org.joda.time.DateTime dateTime23 = dateTime20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.toDateTime(chronology24);
        int int26 = dateTime23.getMillisOfDay();
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readablePeriod12, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Duration duration28 = interval27.toDuration();
        long long29 = duration28.getMillis();
        org.joda.time.Duration duration30 = duration28.toDuration();
        org.joda.time.Duration duration31 = duration28.toDuration();
        org.joda.time.Duration duration32 = duration28.toDuration();
        org.joda.time.Duration duration33 = duration28.toDuration();
        mutableDateTime11.add((org.joda.time.ReadableDuration) duration33, 3);
        mutableDateTime11.addHours(72171);
        mutableDateTime11.setMillis((long) 26610058);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-22T07:25:50.906Z" + "'", str7, "2022-02-22T07:25:50.906Z");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldArray18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3172001 + "'", int26 == 3172001);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration33);
    }

    @Test
    public void test16133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16133");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod(readableDuration7, chronology8);
        mutablePeriod6.setSeconds(0);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        mutableDateTime30.setZoneRetainFields(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime30, readableDuration39);
        boolean boolean41 = dateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj42 = mutableDateTime30.clone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, 0);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.dayOfWeek();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.millisOfDay();
        int int54 = mutableDateTime52.getYearOfEra();
        mutablePeriod6.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime52);
        boolean boolean57 = mutableDateTime30.isBefore((long) 1970);
        java.util.Date date63 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        date63.setMinutes(54);
        org.joda.time.TimeOfDay timeOfDay66 = org.joda.time.TimeOfDay.fromDateFields(date63);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = timeOfDay66.getFieldType(2);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime30.property(dateTimeFieldType68);
        org.joda.time.MutableDateTime mutableDateTime71 = property69.set(6);
        java.lang.String str72 = mutableDateTime71.toString();
        java.lang.String str73 = mutableDateTime71.toString();
        mutableDateTime71.addMillis(26541455);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(obj42);
// flaky:         org.junit.Assert.assertEquals(obj42.toString(), "2022-02-22T07:25:50.920Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "2022-02-22T07:25:50.920Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "2022-02-22T07:25:50.920Z");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2022 + "'", int54 == 2022);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Fri Mar 10 01:54:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(mutableDateTime71);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2022-02-22T07:25:06.920Z" + "'", str72, "2022-02-22T07:25:06.920Z");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "2022-02-22T07:25:06.920Z" + "'", str73, "2022-02-22T07:25:06.920Z");
    }

    @Test
    public void test16134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16134");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withYear(1899);
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay12.plusDays(55);
        org.joda.time.DateMidnight dateMidnight17 = yearMonthDay16.toDateMidnight();
        org.joda.time.MutableDateTime mutableDateTime18 = dateMidnight17.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.secondOfDay();
        java.util.Date date28 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.fromDateFields(date28);
        int int30 = localDate29.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate29.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone31);
        org.joda.time.Interval interval36 = dateMidnight35.toInterval();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        org.joda.time.DateTime dateTime39 = dateTime38.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str42 = dateTimeZone41.getID();
        java.util.Locale locale44 = java.util.Locale.KOREAN;
        java.util.Locale locale46 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str47 = locale44.getDisplayVariant(locale46);
        java.lang.String str48 = dateTimeZone41.getName((long) 5, locale44);
        org.joda.time.DateTime dateTime49 = dateTime39.withZoneRetainFields(dateTimeZone41);
        boolean boolean50 = dateMidnight35.isEqual((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime52 = dateTime39.withMillis((long) 2);
        org.joda.time.DateMidnight dateMidnight53 = dateTime52.toDateMidnight();
        org.joda.time.DateTime dateTime55 = dateTime52.withWeekyear(0);
        org.joda.time.Chronology chronology56 = dateTime52.getChronology();
        mutableDateTime18.setMillis((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime.Property property58 = dateTime52.monthOfYear();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1899 + "'", int30 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.016" + "'", str42, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.016" + "'", str48, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(property58);
    }

    @Test
    public void test16135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16135");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusSeconds(3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.lang.String str8 = timeOfDay4.toString(dateTimeFormatter7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        java.lang.String str10 = timeOfDay4.toString(dateTimeFormatter9);
        boolean boolean11 = dateTimeFormatter9.isOffsetParsed();
        int int12 = dateTimeFormatter9.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withDefaultYear(3172001);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00" + "'", str8, "00");
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT005252" + "'", str10, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT005252");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test16136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16136");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withYear(1899);
        org.joda.time.Interval interval15 = yearMonthDay12.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonthDay12.getFieldTypes();
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay12.year();
        org.joda.time.YearMonthDay yearMonthDay19 = property17.addToCopy((int) (short) -1);
        int int20 = property17.getMaximumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay21 = property17.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay22 = property17.withMaximumValue();
        java.lang.String str23 = property17.toString();
        org.joda.time.YearMonthDay yearMonthDay24 = property17.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay26 = property17.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTimeAtCurrentTime(dateTimeZone27);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292278993 + "'", int20 == 292278993);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Property[year]" + "'", str23, "Property[year]");
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test16137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16137");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime3, readableDuration12);
        mutableDateTime3.setTime(10, 2, 0, 55);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.weekOfWeekyear();
        int int20 = property19.getMinimumValueOverall();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        int int22 = property19.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 53 + "'", int22 == 53);
    }

    @Test
    public void test16138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16138");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.util.Locale locale5 = locale3.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str8 = dateTimeZone7.getID();
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str13 = locale10.getDisplayVariant(locale12);
        java.lang.String str14 = dateTimeZone7.getName((long) 5, locale10);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.lang.String str16 = locale10.getDisplayScript(locale15);
        java.lang.String str17 = locale5.getDisplayName(locale10);
        java.lang.String str18 = locale10.getISO3Language();
        java.util.Locale.Builder builder19 = builder0.setLocale(locale10);
        java.util.Locale locale20 = builder0.build();
        java.util.Date date26 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.fromDateFields(date26);
        org.joda.time.LocalDate.Property property28 = localDate27.weekOfWeekyear();
        org.joda.time.LocalDate localDate29 = property28.getLocalDate();
        org.joda.time.DateTimeField dateTimeField30 = property28.getField();
        long long33 = dateTimeField30.set((long) 15, 12);
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = dateTimeField30.getAsText((long) 1970, locale36);
        java.lang.String str39 = locale36.getCountry();
        java.util.Locale.Builder builder40 = builder0.setLocale(locale36);
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime.Property property42 = localTime41.hourOfDay();
        org.joda.time.LocalTime localTime43 = property42.getLocalTime();
        org.joda.time.LocalTime localTime44 = property42.roundCeilingCopy();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology48 = localTime47.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) 5, chronology48);
        org.joda.time.Chronology chronology50 = chronology48.withUTC();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 10, chronology52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Chronology chronology55 = null;
        mutablePeriod53.setPeriod(readableDuration54, chronology55);
        long long59 = chronology50.add((org.joda.time.ReadablePeriod) mutablePeriod53, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField60 = chronology50.era();
        java.util.Locale locale62 = new java.util.Locale("hi!");
        int int63 = dateTimeField60.getMaximumShortTextLength(locale62);
        java.lang.String str64 = locale62.getVariant();
        java.lang.String str65 = locale62.getDisplayCountry();
        int int66 = property42.getMaximumTextLength(locale62);
        boolean boolean67 = locale62.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder68 = builder0.setLocale(locale62);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.016" + "'", str8, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.016" + "'", str14, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "kor" + "'", str18, "kor");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 6652800015L + "'", long33 == 6652800015L);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 32772L + "'", long59 == 32772L);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test16139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16139");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod0.setPeriod((long) 15, chronology4);
        org.joda.time.PeriodType periodType6 = mutablePeriod0.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withMillisRemoved();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = timeOfDay12.toDateTimeToday(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withCenturyOfEra(10);
        boolean boolean17 = dateTime16.isEqualNow();
        org.joda.time.Chronology chronology18 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology18);
        boolean boolean22 = periodType7.equals((java.lang.Object) dateMidnight21);
        org.joda.time.PeriodType periodType23 = periodType7.withWeeksRemoved();
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test16140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16140");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime localTime11 = localTime0.withMillisOfSecond(32);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = timeOfDay20.toDateTimeToday(dateTimeZone21);
        mutableDateTime15.setZoneRetainFields(dateTimeZone21);
        mutableDateTime15.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        mutableDateTime15.setZone(dateTimeZone26);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((-1L), (long) 17, chronology34);
        mutableDateTime15.setChronology(chronology34);
        org.joda.time.DurationField durationField37 = chronology34.halfdays();
        org.joda.time.DurationFieldType durationFieldType38 = durationField37.getType();
        boolean boolean39 = localTime0.isSupported(durationFieldType38);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology44 = localTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(chronology44);
        org.joda.time.Period period46 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology44);
        boolean boolean47 = durationFieldType38.isSupported(chronology44);
        org.joda.time.DateTimeZone dateTimeZone48 = chronology44.getZone();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTimeZone48);
    }

    @Test
    public void test16141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16141");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.weekyear();
        org.joda.time.LocalDateTime localDateTime15 = property14.withMaximumValue();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfMonth();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.joda.time.LocalDateTime localDateTime19 = property17.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.year();
        org.joda.time.LocalDateTime localDateTime21 = property20.withMinimumValue();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test16142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16142");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.Period period7 = new org.joda.time.Period((long) 25, (long) (-1), periodType2, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfDay();
        java.lang.String str10 = dateTimeField8.getAsShortText(1645514167310L);
        int int12 = dateTimeField8.get(828518023872000000L);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = timeOfDay17.toDateTimeToday(dateTimeZone18);
        org.joda.time.TimeOfDay.Property property20 = timeOfDay17.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay21 = property20.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay23 = property20.addToCopy(0);
        int int24 = property20.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay26 = property20.addToCopy((int) ' ');
        java.lang.String str27 = property20.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay29 = property20.addToCopy((-4));
        int int30 = timeOfDay29.getHourOfDay();
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str35 = locale32.getDisplayVariant(locale34);
        java.util.Locale locale36 = locale34.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str39 = dateTimeZone38.getID();
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str44 = locale41.getDisplayVariant(locale43);
        java.lang.String str45 = dateTimeZone38.getName((long) 5, locale41);
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.lang.String str47 = locale41.getDisplayScript(locale46);
        java.lang.String str48 = locale36.getDisplayName(locale41);
        java.lang.String str49 = locale41.getDisplayName();
        java.lang.String str50 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) timeOfDay29, 12176, locale41);
        java.lang.String str51 = locale41.getVariant();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "26167310" + "'", str10, "26167310");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "52" + "'", str27, "52");
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.016" + "'", str39, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.016" + "'", str45, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Korean" + "'", str49, "Korean");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "12176" + "'", str50, "12176");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test16143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16143");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        java.util.Date date15 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.fromDateFields(date15);
        int int17 = localDate16.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime21 = localDate16.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        java.lang.String str29 = period28.toString();
        org.joda.time.Period period30 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period30.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.months();
        int int34 = period32.get(durationFieldType33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight22.withPeriodAdded((org.joda.time.ReadablePeriod) period32, 0);
        org.joda.time.DateMidnight.Property property37 = dateMidnight22.monthOfYear();
        org.joda.time.DateMidnight dateMidnight38 = property37.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate39 = dateMidnight38.toLocalDate();
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) dateMidnight38);
        java.util.Date date46 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.fromDateFields(date46);
        int int48 = localDate47.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        int int51 = dateTimeZone49.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime52 = localDate47.toDateTimeAtCurrentTime(dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        boolean boolean54 = dateTimeFormatter53.isParser();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone58 = dateTimeZone57.toTimeZone();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) (-1), dateTimeZone57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter53.withZone(dateTimeZone57);
        long long62 = dateTimeZone49.getMillisKeepLocal(dateTimeZone57, 0L);
        org.joda.time.DateTime dateTime63 = org.joda.time.DateTime.now(dateTimeZone57);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight38.withZoneRetainFields(dateTimeZone57);
        org.joda.time.DateMidnight dateMidnight65 = org.joda.time.DateMidnight.now(dateTimeZone57);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusYears(26277709);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1899 + "'", int17 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT1M" + "'", str29, "PT1M");
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(localDate39);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1899 + "'", int48 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-16L) + "'", long62 == (-16L));
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertNotNull(dateMidnight67);
    }

    @Test
    public void test16144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16144");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withDurationAdded(readableDuration11, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withMillisOfDay((int) ' ');
        org.joda.time.LocalDateTime.Property property16 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property16.addWrapFieldToCopy(26164018);
        org.joda.time.LocalDateTime localDateTime19 = property16.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField21 = localDateTime19.getField((-369));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -369");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test16145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16145");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay4.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay9 = property7.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = timeOfDay14.getFields();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime17.monthOfYear();
        org.joda.time.DateTime dateTime20 = dateTime17.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minusMillis((int) 'a');
        int int25 = dateTime24.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime27 = dateTime24.withYear(55);
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.plusSeconds(26164018);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = timeOfDay28.getFieldType(1);
        org.joda.time.DateTime dateTime34 = dateTime24.withField(dateTimeFieldType32, 53);
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType32.getRangeDurationType();
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay9.withFieldAdded(durationFieldType35, (int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay9.minusHours((-3170102));
        org.joda.time.TimeOfDay.Property property40 = timeOfDay9.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test16146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16146");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime.Property property10 = localTime0.secondOfMinute();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test16147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16147");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTTimeNoMillis();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime5.add(readableDuration6, 0);
        mutableDateTime5.setYear((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod();
        mutablePeriod11.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 15, chronology15);
        mutablePeriod11.setMinutes(1970);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 5, chronology24);
        org.joda.time.Chronology chronology26 = chronology24.withUTC();
        mutablePeriod11.setPeriod((long) 0, (long) 1, chronology26);
        mutableDateTime5.setChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField29 = chronology26.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter0.withChronology(chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter30.withOffsetParsed();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.hours();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter30.withChronology(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test16148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16148");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(2, 32772);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.util.Calendar.Builder builder8 = builder0.setLocale(locale6);
        java.util.Calendar.Builder builder10 = builder8.setLenient(false);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = timeOfDay16.getFields();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTime.Property property20 = dateTime19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime19.minusMillis((int) (byte) -1);
        boolean boolean24 = dateTime19.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getDurationType();
        boolean boolean27 = dateTime19.isSupported(dateTimeFieldType25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        org.joda.time.DateTime dateTime30 = dateTime29.toDateTime();
        boolean boolean31 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableDuration11, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        int[] intArray34 = mutablePeriod33.getValues();
        java.util.Calendar.Builder builder35 = builder8.setFields(intArray34);
        java.util.Calendar.Builder builder40 = builder8.setTimeOfDay(48, 26325, 26362145, 42541);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology44 = localTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) 5, chronology44);
        org.joda.time.Chronology chronology46 = chronology44.withUTC();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology46.getZone();
        java.util.TimeZone timeZone48 = dateTimeZone47.toTimeZone();
        int int49 = timeZone48.getRawOffset();
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.lang.String str52 = locale50.getDisplayVariant(locale51);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone48, locale50);
        java.util.Calendar.Builder builder54 = builder8.setTimeZone(timeZone48);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder57 = builder8.set(26361522, 86399999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(calendar53);
// flaky:         org.junit.Assert.assertEquals(calendar53.toString(), "java.util.GregorianCalendar[time=1645514751212,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=51,MILLISECOND=212,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test16149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16149");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.TimeOfDay.Property property4 = timeOfDay3.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = property4.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMinutes(3172001);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.plusSeconds(16);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay7.plusHours(107);
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withHourOfDay(11);
        org.joda.time.LocalTime localTime14 = timeOfDay11.toLocalTime();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test16150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16150");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfWeek();
        org.joda.time.Chronology chronology8 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.year();
        long long12 = dateTimeField9.add(1645514244041L, (long) 2022);
        long long14 = dateTimeField9.roundFloor((long) 42734);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 65453642244041L + "'", long12 == 65453642244041L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test16151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16151");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(26244041);
        org.joda.time.LocalDateTime localDateTime14 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = property11.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        long long18 = dateTimeField16.roundHalfEven(11414102400000L);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 11414131200000L + "'", long18 == 11414131200000L);
    }

    @Test
    public void test16152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16152");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusDays(29);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime6.getFields();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withSecondOfMinute(26);
        int int14 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property15 = localDateTime6.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test16153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16153");
        java.util.Date date10 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.fromDateFields(date10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekOfWeekyear();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        org.joda.time.LocalDate localDate15 = property12.withMaximumValue();
        int int16 = localDate15.size();
        int int17 = localDate15.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 1899, dateTimeZone19);
        int int24 = dateTimeZone19.getOffset((-68803869717836306L));
        java.lang.String str26 = dateTimeZone19.getName((long) 47);
        org.joda.time.Interval interval27 = localDate15.toInterval(dateTimeZone19);
        java.util.TimeZone timeZone28 = dateTimeZone19.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(52, 726, 2922789, 6, 26580, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26580 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 18 + "'", int17 == 18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test16154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16154");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.date();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) dateTime2);
        int int5 = dateTimeFormatter0.getDefaultYear();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(7, (-9), 26165226, 53, 14, 2022, 2, 48);
        int int15 = mutablePeriod14.getYears();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = timeOfDay21.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime27 = dateTime23.plusDays((int) (byte) -1);
        java.util.Date date28 = dateTime27.toDate();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime27, readableDuration29);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        int int36 = dateTimeZone34.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime37.add(readableDuration38, 0);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.dayOfWeek();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.roundHalfEven();
        boolean boolean44 = interval33.isBefore((org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray50 = timeOfDay49.getFields();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTimeToday(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withYearOfCentury(16);
        boolean boolean55 = interval33.isAfter((org.joda.time.ReadableInstant) dateTime54);
        boolean boolean56 = interval30.abuts((org.joda.time.ReadableInterval) interval33);
        org.joda.time.Duration duration57 = interval33.toDuration();
        org.joda.time.DateTime dateTime58 = interval33.getEnd();
        org.joda.time.Chronology chronology59 = interval33.getChronology();
        mutablePeriod14.add((long) (-11), chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.yearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter0.withChronology(chronology59);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-22" + "'", str4, "2022-02-22");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldArray50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
    }

    @Test
    public void test16155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16155");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 5, chronology4);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 3172001, chronology4);
        org.joda.time.DurationField durationField7 = chronology4.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology4.weekyearOfCentury();
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test16156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16156");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime dateTime11 = dateTime9.plusSeconds(3172001);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod();
        mutablePeriod12.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 15, chronology16);
        mutablePeriod12.setMinutes(1970);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 5, chronology25);
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        mutablePeriod12.setPeriod((long) 0, (long) 1, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.hourOfDay();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DateTime dateTime31 = dateTime11.withChronology(chronology27);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearDay();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.DateTime dateTime35 = dateTime31.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, 4);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime35.toMutableDateTime();
        org.joda.time.DateTime dateTime38 = dateTime35.minusYears(28239);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test16157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16157");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        java.lang.String str2 = period1.toString();
        org.joda.time.Period period4 = period1.plusWeeks(17);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(chronology9);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology9);
        org.joda.time.Period period13 = period11.minusHours(53);
        org.joda.time.Period period15 = period11.withWeeks((int) '#');
        org.joda.time.Period period16 = period1.withFields((org.joda.time.ReadablePeriod) period11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds17 = period11.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT1M" + "'", str2, "PT1M");
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test16158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16158");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay4.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay10 = property7.addToCopy(0);
        int int11 = property7.getMinimumValueOverall();
        int int12 = property7.get();
        org.joda.time.TimeOfDay timeOfDay14 = property7.addNoWrapToCopy((int) 'x');
        org.joda.time.TimeOfDay timeOfDay16 = property7.addWrapFieldToCopy(462);
        org.joda.time.TimeOfDay timeOfDay18 = property7.addToCopy(19);
        int int19 = property7.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test16159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16159");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.secondOfMinute();
        int int7 = localDateTime2.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusSeconds(869);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.plusMinutes(19045);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test16160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16160");
        java.util.Date date15 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.fromDateFields(date15);
        int int17 = localDate16.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime21 = localDate16.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone25);
        long long33 = dateTimeZone25.adjustOffset((long) 109, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((int) (byte) -1, 328, 256, 71950, 36, 685, 26538981, dateTimeZone25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 71950 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1899 + "'", int17 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 109L + "'", long33 == 109L);
    }

    @Test
    public void test16161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16161");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = timeOfDay9.getFields();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTimeToday(dateTimeZone11);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = period14.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period20 = period14.normalizedStandard(periodType19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration4, (org.joda.time.ReadableInstant) dateTime12, periodType19);
        org.joda.time.PeriodType periodType22 = periodType19.withMillisRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        boolean boolean25 = periodType22.isSupported(durationFieldType24);
        boolean boolean26 = strSet3.remove((java.lang.Object) boolean25);
        java.lang.Object[] objArray27 = strSet3.toArray();
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.util.Set<java.lang.String> strSet31 = locale28.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale[] localeArray35 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList36);
        boolean boolean39 = strSet31.removeAll((java.util.Collection<java.util.Locale>) localeList38);
        boolean boolean40 = strSet3.retainAll((java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Locale[] localeArray44 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList45 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList45, localeArray44);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.stream.Stream<java.util.Locale> localeStream48 = localeList47.stream();
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str52 = locale49.getDisplayVariant(locale51);
        java.util.Locale locale53 = locale51.stripExtensions();
        boolean boolean54 = localeList47.add(locale53);
        localeList47.clear();
        java.util.Locale locale56 = java.util.Locale.KOREAN;
        java.util.Locale locale57 = java.util.Locale.KOREAN;
        java.lang.String str58 = locale56.getDisplayVariant(locale57);
        java.util.Set<java.lang.String> strSet59 = locale56.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Locale[] localeArray63 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList64 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList64, localeArray63);
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.util.Locale>) localeList64);
        boolean boolean67 = strSet59.removeAll((java.util.Collection<java.util.Locale>) localeList66);
        java.util.Spliterator<java.util.Locale> localeSpliterator68 = localeList66.spliterator();
        boolean boolean69 = localeList47.removeAll((java.util.Collection<java.util.Locale>) localeList66);
        boolean boolean70 = localeList38.retainAll((java.util.Collection<java.util.Locale>) localeList66);
        java.lang.Object[] objArray71 = localeList66.toArray();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT1M" + "'", str17, "PT1M");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNotNull(localeStream48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(localeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(localeSpliterator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
    }

    @Test
    public void test16162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16162");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.weekyear();
        org.joda.time.LocalDateTime localDateTime15 = property14.withMaximumValue();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfMonth();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.secondOfMinute();
        int int19 = localDateTime15.size();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test16163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16163");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setLenient(false);
        long long3 = calendar0.getTimeInMillis();
        java.util.Locale locale6 = new java.util.Locale("Feb", "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.017Z");
        boolean boolean7 = calendar0.after((java.lang.Object) locale6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate10 = localDate8.plusMonths((int) 'x');
        int int11 = localDate8.getCenturyOfEra();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645514751413,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=19,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=51,MILLISECOND=429,ZONE_OFFSET=16,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514751413L + "'", long3 == 1645514751413L);
        org.junit.Assert.assertEquals(locale6.toString(), "feb_1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.017Z");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test16164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16164");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        int int11 = dateTimeField9.getLeapAmount((long) '#');
        java.lang.String str13 = dateTimeField9.getAsShortText((long) 1);
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = dateTimeField9.getAsShortText((long) (-1), locale15);
        java.lang.String str17 = locale15.getScript();
        java.lang.String str18 = locale15.getVariant();
        java.util.Calendar.Builder builder19 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder22 = builder19.set(2, 32772);
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str26 = locale23.getDisplayVariant(locale25);
        java.util.Calendar.Builder builder27 = builder19.setLocale(locale25);
        java.lang.String str28 = locale15.getDisplayCountry(locale25);
        java.lang.String str29 = locale15.getDisplayLanguage();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "English" + "'", str29, "English");
    }

    @Test
    public void test16165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16165");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        int int6 = dateTime3.getHourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.minus((long) 9);
        java.util.Date date17 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.fromDateFields(date17);
        int int19 = localDate18.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime23 = localDate18.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        java.lang.String str31 = period30.toString();
        org.joda.time.Period period32 = period28.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period32.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.months();
        int int36 = period34.get(durationFieldType35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight24.withPeriodAdded((org.joda.time.ReadablePeriod) period34, 0);
        boolean boolean39 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateMidnight.Property property40 = dateMidnight24.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str43 = dateTimeZone42.getID();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime46 = dateTime44.plusSeconds(17);
        org.joda.time.DateTime dateTime48 = dateTime44.withDayOfMonth(2);
        org.joda.time.DateTime dateTime50 = dateTime48.withMillisOfSecond(29);
        org.joda.time.DateTime dateTime52 = dateTime48.withMillisOfSecond(12);
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight24, (org.joda.time.ReadableInstant) dateTime48);
        int int54 = dateTime48.getMinuteOfDay();
        org.joda.time.DateTime.Property property55 = dateTime48.dayOfWeek();
        org.joda.time.DateTime dateTime57 = property55.addToCopy((-292275));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNotNull(dateTime8);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1899 + "'", int19 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT1M" + "'", str31, "PT1M");
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.016" + "'", str43, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 445 + "'", int54 == 445);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime57);
    }

    @Test
    public void test16166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16166");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) 1645514486848L);
        java.lang.String str2 = localTime1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:21:26.848" + "'", str2, "07:21:26.848");
    }

    @Test
    public void test16167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16167");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.LocalTime localTime5 = localTime1.plus((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 10, chronology7);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((long) 0, chronology10);
        org.joda.time.LocalTime localTime13 = localTime5.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod8, 55);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        java.lang.String str18 = period17.toString();
        org.joda.time.Period period19 = period15.withFields((org.joda.time.ReadablePeriod) period17);
        int int20 = period15.getMinutes();
        int int21 = period15.size();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = timeOfDay27.getFields();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTimeToday(dateTimeZone29);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        java.lang.String str35 = period34.toString();
        org.joda.time.Period period36 = period32.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period38 = period32.normalizedStandard(periodType37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableDuration22, (org.joda.time.ReadableInstant) dateTime30, periodType37);
        org.joda.time.PeriodType periodType40 = periodType37.withMillisRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType41.getDurationType();
        boolean boolean43 = periodType40.isSupported(durationFieldType42);
        int int44 = period15.get(durationFieldType42);
        org.joda.time.LocalTime localTime46 = localTime13.withFieldAdded(durationFieldType42, 2000);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology51 = localTime50.getChronology();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((-1L), (long) 17, chronology51);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period54 = interval52.toPeriod(periodType53);
        org.joda.time.Period period55 = period54.toPeriod();
        org.joda.time.LocalTime localTime57 = localTime13.withPeriodAdded((org.joda.time.ReadablePeriod) period55, 2922789);
        org.joda.time.LocalTime localTime59 = localTime57.minusMinutes(40);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = localTime57.getValue(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 31");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT1M" + "'", str18, "PT1M");
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT1M" + "'", str35, "PT1M");
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime59);
    }

    @Test
    public void test16168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16168");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withWeeksRemoved();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 10, chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 10, chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod21, 15);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.plusYears(32772);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusHours(10590);
        org.joda.time.Chronology chronology28 = localDateTime25.getChronology();
        org.joda.time.Period period29 = new org.joda.time.Period((long) (-9), (long) 26244041, periodType5, chronology28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType5);
        org.joda.time.PeriodType periodType31 = periodType5.withMinutesRemoved();
        java.lang.String str32 = periodType31.toString();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PeriodType[Months]" + "'", str32, "PeriodType[Months]");
    }

    @Test
    public void test16169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16169");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate6.plusWeeks((int) (short) 0);
        int int11 = localDate6.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = localDate6.toDateMidnight(dateTimeZone13);
        org.joda.time.LocalDate localDate18 = localDate6.withWeekOfWeekyear(10);
        org.joda.time.LocalDate localDate20 = localDate6.plusWeeks(26215220);
        int int21 = localDate20.getYearOfEra();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.016" + "'", str14, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 504323 + "'", int21 == 504323);
    }

    @Test
    public void test16170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16170");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(30844800000L, (long) 11, periodType3);
        org.joda.time.PeriodType periodType5 = periodType3.withHoursRemoved();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = timeOfDay10.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withCenturyOfEra(10);
        boolean boolean15 = dateTime14.isEqualNow();
        org.joda.time.Chronology chronology16 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.minuteOfHour();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(obj0, periodType3, chronology16);
        int int22 = mutablePeriod21.getMillis();
        mutablePeriod21.setYears(328);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod21.setValue(26473065, 26296827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26473065");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test16171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16171");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        long long11 = dateTimeField9.roundHalfFloor((long) 28);
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.util.Date date19 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date19);
        org.joda.time.LocalDate.Property property21 = localDate20.weekOfWeekyear();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeField dateTimeField23 = property21.getField();
        int int25 = dateTimeField23.getLeapAmount((long) '#');
        java.lang.String str27 = dateTimeField23.getAsShortText((long) 1);
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = dateTimeField23.getAsShortText((long) (-1), locale29);
        java.lang.String str31 = locale13.getDisplayScript(locale29);
        java.lang.String str32 = dateTimeField9.getAsText((-2234642760016L), locale29);
        java.lang.String str33 = locale29.getDisplayVariant();
        java.util.Locale.setDefault(locale29);
        java.lang.String str35 = locale29.getLanguage();
        java.lang.String str36 = locale29.getISO3Country();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-259200000L) + "'", long11 == (-259200000L));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1" + "'", str27, "1");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10" + "'", str32, "10");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "en" + "'", str35, "en");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test16172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16172");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime localTime11 = localTime0.minusHours((-1));
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Period period15 = new org.joda.time.Period((long) 22, 0L);
        org.joda.time.LocalTime localTime16 = localTime11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.LocalTime.Property property17 = localTime16.millisOfSecond();
        org.joda.time.LocalTime localTime18 = property17.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test16173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16173");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight.Property property30 = dateMidnight15.monthOfYear();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight15.withMillis(0L);
        int int33 = dateMidnight32.getHourOfDay();
        java.util.Date date42 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.fromDateFields(date42);
        int int44 = localDate43.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        int int47 = dateTimeZone45.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime48 = localDate43.toDateTimeAtCurrentTime(dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period53 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period55 = org.joda.time.Period.minutes(1);
        java.lang.String str56 = period55.toString();
        org.joda.time.Period period57 = period53.withFields((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Period period59 = period57.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.months();
        int int61 = period59.get(durationFieldType60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight49.withPeriodAdded((org.joda.time.ReadablePeriod) period59, 0);
        org.joda.time.DateMidnight.Property property64 = dateMidnight49.monthOfYear();
        org.joda.time.DateMidnight dateMidnight66 = property64.addToCopy(15);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight66.withYearOfCentury(55);
        int int69 = dateMidnight66.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight66.minus(readablePeriod70);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight71.plusDays((-2));
        org.joda.time.DateTime dateTime74 = dateMidnight71.toDateTimeISO();
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.time();
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight32, (org.joda.time.ReadableInstant) dateTime74, periodType75);
        org.joda.time.DateTime.Property property77 = dateTime74.yearOfEra();
        java.util.GregorianCalendar gregorianCalendar78 = dateTime74.toGregorianCalendar();
        java.util.Date date85 = new java.util.Date(13, 3, 26377, 41, 86340000, 1970);
        date85.setTime(26188858L);
        gregorianCalendar78.setTime(date85);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1899 + "'", int10 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT1M" + "'", str22, "PT1M");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1899 + "'", int44 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateMidnight51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT1M" + "'", str56, "PT1M");
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateMidnight66);
        org.junit.Assert.assertNotNull(dateMidnight68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNotNull(dateMidnight71);
        org.junit.Assert.assertNotNull(dateMidnight73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(gregorianCalendar78);
// flaky:         org.junit.Assert.assertEquals(date85.toString(), "Thu Jan 01 07:16:28 GMT+00:00 1970");
    }

    @Test
    public void test16174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16174");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withYear(1899);
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTimeAtCurrentTime();
        int int16 = yearMonthDay12.getDayOfMonth();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = yearMonthDay12.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay12.plusMonths(31);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 5, chronology24);
        org.joda.time.Chronology chronology26 = chronology24.withUTC();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology26.getZone();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay((long) 11, chronology26);
        org.joda.time.DateTimeField dateTimeField29 = chronology26.secondOfDay();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now(chronology26);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        java.lang.String str35 = period34.toString();
        org.joda.time.LocalTime localTime36 = localTime32.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 10, chronology38);
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod39.setPeriod((long) 0, chronology41);
        org.joda.time.LocalTime localTime44 = localTime36.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod39, 55);
        org.joda.time.LocalTime.Property property45 = localTime36.minuteOfHour();
        org.joda.time.LocalTime localTime46 = property45.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime48 = localTime46.minusSeconds(18);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.LocalTime.Property property50 = localTime46.property(dateTimeFieldType49);
        boolean boolean51 = localTime30.isSupported(dateTimeFieldType49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay19.withField(dateTimeFieldType49, 2200294);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdayOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT1M" + "'", str35, "PT1M");
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test16175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16175");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = timeOfDay15.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withCenturyOfEra(10);
        boolean boolean20 = dateTime19.isEqualNow();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(15, 5, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(1L, chronology21);
        boolean boolean25 = dateTimeFieldType7.isSupported(chronology21);
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.fromMillisOfDay(97L, chronology21);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((-16L), 1645514341697L, chronology21);
        org.joda.time.Period period28 = new org.joda.time.Period(6403347934000L, chronology21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(625, 555, 33660116, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 555 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeOfDay26);
    }

    @Test
    public void test16176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16176");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 10);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 10, chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 10, chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 10, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod17, 15);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        int int22 = localDateTime19.get(dateTimeFieldType20);
        org.joda.time.DateTime dateTime23 = dateTime1.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DateTime.Property property25 = dateTime23.property(dateTimeFieldType24);
        org.joda.time.DateTime.Property property26 = dateTime23.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = dateTime23.withMonthOfYear(26541455);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26541455 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test16177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16177");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.Period period7 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology5);
        org.joda.time.DurationField durationField8 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.halfdayOfDay();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1645514272803L, chronology5);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.weekyear();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test16178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16178");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 5, chronology4);
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 2022, chronology6);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.plusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = timeOfDay14.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime20 = dateTime16.plusDays((int) (byte) -1);
        java.util.Date date21 = dateTime20.toDate();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime20, readableDuration22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime27.add(readableDuration28, 0);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime27.dayOfWeek();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType33.getDurationType();
        mutableDateTime27.set(dateTimeFieldType33, (int) ' ');
        boolean boolean37 = interval23.isAfter((org.joda.time.ReadableInstant) mutableDateTime27);
        java.lang.Object obj38 = null;
        boolean boolean39 = interval23.equals(obj38);
        org.joda.time.Duration duration40 = interval23.toDuration();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        int int46 = dateTimeZone44.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone44);
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime47.add(readableDuration48, 0);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime47.dayOfWeek();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime47.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime53 = property52.roundHalfEven();
        boolean boolean54 = interval43.isBefore((org.joda.time.ReadableInstant) mutableDateTime53);
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray60 = timeOfDay59.getFields();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = timeOfDay59.toDateTimeToday(dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime62.withYearOfCentury(16);
        boolean boolean65 = interval43.isAfter((org.joda.time.ReadableInstant) dateTime64);
        long long66 = interval43.getStartMillis();
        boolean boolean67 = interval23.overlaps((org.joda.time.ReadableInterval) interval43);
        org.joda.time.Period period69 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period71 = org.joda.time.Period.minutes(1);
        java.lang.String str72 = period71.toString();
        org.joda.time.Period period73 = period69.withFields((org.joda.time.ReadablePeriod) period71);
        org.joda.time.Period period75 = period73.plusMillis(100);
        org.joda.time.Period period76 = period73.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType78 = dateTimeFieldType77.getDurationType();
        boolean boolean79 = period73.isSupported(durationFieldType78);
        org.joda.time.Period period81 = period73.minusYears(0);
        org.joda.time.Period period83 = period81.plusMonths(15);
        org.joda.time.Interval interval84 = interval43.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period83);
        org.joda.time.Period period86 = period83.withWeeks((-3172001));
        org.joda.time.TimeOfDay timeOfDay88 = timeOfDay7.withPeriodAdded((org.joda.time.ReadablePeriod) period83, 3172);
        java.lang.String str89 = timeOfDay88.toString();
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldArray60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PT1M" + "'", str72, "PT1M");
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(timeOfDay88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "T04:52:02.022" + "'", str89, "T04:52:02.022");
    }

    @Test
    public void test16179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16179");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = period8.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period12.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.months();
        int int16 = period14.get(durationFieldType15);
        mutableDateTime3.add(durationFieldType15, 7);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.dayOfYear();
        boolean boolean20 = mutableDateTime3.isEqualNow();
        int int21 = mutableDateTime3.getWeekOfWeekyear();
        mutableDateTime3.addHours(6);
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = timeOfDay28.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime34 = dateTime30.plusDays((int) (byte) -1);
        java.util.Date date35 = dateTime34.toDate();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, readableDuration36);
        org.joda.time.Period period38 = interval37.toPeriod();
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = timeOfDay43.toDateTimeToday(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime49 = dateTime45.plusDays((int) (byte) -1);
        java.util.Date date50 = dateTime49.toDate();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime49, readableDuration51);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        int int58 = dateTimeZone56.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(dateTimeZone56);
        org.joda.time.ReadableDuration readableDuration60 = null;
        mutableDateTime59.add(readableDuration60, 0);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime59.dayOfWeek();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime59.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime65 = property64.roundHalfEven();
        boolean boolean66 = interval55.isBefore((org.joda.time.ReadableInstant) mutableDateTime65);
        org.joda.time.TimeOfDay timeOfDay71 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray72 = timeOfDay71.getFields();
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = timeOfDay71.toDateTimeToday(dateTimeZone73);
        org.joda.time.DateTime dateTime76 = dateTime74.withYearOfCentury(16);
        boolean boolean77 = interval55.isAfter((org.joda.time.ReadableInstant) dateTime76);
        boolean boolean78 = interval52.abuts((org.joda.time.ReadableInterval) interval55);
        org.joda.time.Duration duration79 = interval55.toDuration();
        org.joda.time.Interval interval80 = interval37.withDurationAfterStart((org.joda.time.ReadableDuration) duration79);
        org.joda.time.PeriodType periodType81 = null;
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableDuration) duration79, periodType81);
        mutableDateTime3.addMinutes(26380750);
        org.joda.time.Instant instant85 = mutableDateTime3.toInstant();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT1M" + "'", str11, "PT1M");
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38 + "'", int21 == 38);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldArray72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(instant85);
    }

    @Test
    public void test16180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16180");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight.Property property30 = dateMidnight15.monthOfYear();
        org.joda.time.DateMidnight dateMidnight32 = property30.addToCopy(15);
        org.joda.time.DateMidnight dateMidnight33 = property30.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight34 = property30.roundHalfFloorCopy();
        java.util.GregorianCalendar gregorianCalendar35 = dateMidnight34.toGregorianCalendar();
        java.lang.Object obj36 = gregorianCalendar35.clone();
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1899 + "'", int10 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT1M" + "'", str22, "PT1M");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(gregorianCalendar35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "java.util.GregorianCalendar[time=-62135596800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=3,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "java.util.GregorianCalendar[time=-62135596800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=3,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "java.util.GregorianCalendar[time=-62135596800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=3,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test16181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16181");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("59");
        int int2 = mutableDateTime1.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        mutableDateTime6.setYear((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod();
        mutablePeriod12.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 15, chronology16);
        mutablePeriod12.setMinutes(1970);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 5, chronology25);
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        mutablePeriod12.setPeriod((long) 0, (long) 1, chronology27);
        mutableDateTime6.setChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.millisOfSecond();
        mutableDateTime1.setChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField32 = chronology27.hourOfHalfday();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test16182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16182");
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = timeOfDay7.toDateTimeToday(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra(10);
        boolean boolean12 = dateTime11.isEqualNow();
        org.joda.time.Chronology chronology13 = dateTime11.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(15, 5, chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(1L, chronology13);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(chronology13);
        org.joda.time.DateTimeField dateTimeField18 = chronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.era();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dateTimeField19.getDifference(1645514582033L, (long) 904);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test16183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16183");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        int int13 = dateTime10.getMillisOfDay();
        org.joda.time.DateTime.Property property14 = dateTime10.monthOfYear();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((-1L), (long) 17, chronology19);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period22 = interval20.toPeriod(periodType21);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) '4', (-1), (int) (short) 100, (-1));
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), (long) 17, chronology33);
        mutablePeriod27.add((long) 26163694, chronology33);
        org.joda.time.Interval interval36 = interval20.withPeriodAfterStart((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime47 = timeOfDay45.toDateTimeToday(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.withCenturyOfEra(10);
        boolean boolean50 = dateTime49.isEqualNow();
        org.joda.time.Chronology chronology51 = dateTime49.getChronology();
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(15, 5, chronology51);
        org.joda.time.DurationField durationField53 = chronology51.years();
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((long) 26164018, chronology51);
        mutablePeriod27.add((long) (short) -1, chronology51);
        org.joda.time.DateTime dateTime56 = dateTime10.plus((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.DateTime.Property property57 = dateTime56.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3172001 + "'", int13 == 3172001);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
    }

    @Test
    public void test16184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16184");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("960");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"960\" is malformed at \"0\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16185");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfCentury(55);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = org.joda.time.format.ISODateTimeFormat.yearMonthDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 26164018);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        java.lang.String str8 = localDateTime2.toString(dateTimeFormatter6);
        org.joda.time.DateTimeField dateTimeField10 = localDateTime2.getField(2);
        int int12 = dateTimeField10.get((long) (-111));
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2055-02-22" + "'", str8, "2055-02-22");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
    }

    @Test
    public void test16186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16186");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        java.lang.String str10 = period9.toString();
        org.joda.time.Period period11 = period7.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.plusMillis(100);
        org.joda.time.Period period14 = period11.negated();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period20.plusMillis(100);
        boolean boolean23 = period14.equals((java.lang.Object) period22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period25 = period14.withFields((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay4.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.TimeOfDay.Property property27 = timeOfDay4.secondOfMinute();
        int int28 = property27.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay29 = property27.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay31 = property27.addWrapFieldToCopy(7);
        org.joda.time.TimeOfDay timeOfDay33 = property27.addNoWrapToCopy(19);
        org.joda.time.TimeOfDay.Property property34 = timeOfDay33.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay33.plusMillis(26362145);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay33.minusHours((-1));
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT1M" + "'", str10, "PT1M");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT1M" + "'", str19, "PT1M");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
    }

    @Test
    public void test16187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16187");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.getMutableDateTime();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = timeOfDay16.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime22 = dateTime18.plusDays((int) (byte) -1);
        org.joda.time.DateTime dateTime24 = dateTime22.withYear(2);
        org.joda.time.DateTime dateTime26 = dateTime24.minusYears(26164018);
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime.Property property28 = dateTime24.dayOfWeek();
        org.joda.time.DateTime dateTime29 = property28.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test16188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16188");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withYear(1899);
        org.joda.time.Interval interval15 = yearMonthDay12.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonthDay12.getFieldTypes();
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay12.year();
        org.joda.time.YearMonthDay yearMonthDay18 = property17.getYearMonthDay();
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str23 = locale20.getDisplayVariant(locale22);
        org.joda.time.YearMonthDay yearMonthDay24 = property17.setCopy("6", locale22);
        int int25 = property17.get();
        org.joda.time.DateTimeField dateTimeField26 = property17.getField();
        long long29 = dateTimeField26.getDifferenceAsLong(26374209L, 26165236L);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test16189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16189");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale4 = locale2.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str7 = dateTimeZone6.getID();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str12 = locale9.getDisplayVariant(locale11);
        java.lang.String str13 = dateTimeZone6.getName((long) 5, locale9);
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale9.getDisplayScript(locale14);
        java.lang.String str16 = locale4.getDisplayName(locale9);
        java.lang.String str17 = locale9.getDisplayName();
        java.util.Set<java.lang.String> strSet18 = locale9.getUnicodeLocaleKeys();
        java.util.Locale locale19 = locale9.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.016" + "'", str7, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.016" + "'", str13, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Korean" + "'", str17, "Korean");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
    }

    @Test
    public void test16190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16190");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum((int) (short) 0);
        int int4 = calendar0.getLeastMaximum(8);
        calendar0.setTimeInMillis(43200000L);
        java.util.Date date12 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.fromDateFields(date12);
        org.joda.time.LocalDate.Property property14 = localDate13.weekOfWeekyear();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        java.lang.String str20 = period19.toString();
        org.joda.time.Period period21 = period17.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period23 = period21.plusMillis(100);
        org.joda.time.Period period24 = period21.negated();
        org.joda.time.Period period26 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        java.lang.String str29 = period28.toString();
        org.joda.time.Period period30 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period30.plusMillis(100);
        boolean boolean33 = period24.equals((java.lang.Object) period32);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period35 = period24.withFields((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.LocalDate localDate36 = localDate15.plus((org.joda.time.ReadablePeriod) mutablePeriod34);
        mutablePeriod34.addMillis(0);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod();
        mutablePeriod39.addWeeks((int) (byte) 100);
        mutablePeriod34.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.millis();
        int int44 = mutablePeriod39.get(durationFieldType43);
        boolean boolean45 = calendar0.equals((java.lang.Object) int44);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=43200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=19,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=16,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT1M" + "'", str20, "PT1M");
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT1M" + "'", str29, "PT1M");
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test16191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16191");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(86340000, 1, (-1), 52, 18, (int) '#', 1970, 17);
        org.joda.time.PeriodType periodType9 = mutablePeriod8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withMillisRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withMinutesRemoved();
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test16192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16192");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withYear(1899);
        org.joda.time.Interval interval15 = yearMonthDay12.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonthDay12.getFieldTypes();
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay12.year();
        org.joda.time.YearMonthDay yearMonthDay19 = property17.addToCopy((int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay20 = property17.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay22 = property17.setCopy("3172001");
        org.joda.time.YearMonthDay yearMonthDay24 = property17.addToCopy(26277709);
        org.joda.time.YearMonthDay yearMonthDay25 = property17.withMinimumValue();
        int int26 = property17.getMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay28 = property17.setCopy((-73));
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 292278993 + "'", int26 == 292278993);
        org.junit.Assert.assertNotNull(yearMonthDay28);
    }

    @Test
    public void test16193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16193");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((-1L), (long) 17, chronology4);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period7 = interval5.toPeriod(periodType6);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = period7.plusWeeks((-830));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0.018S" + "'", str9, "PT0.018S");
    }

    @Test
    public void test16194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16194");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.withMaximumValue();
        int int9 = localDate8.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = timeOfDay18.toDateTimeToday(dateTimeZone19);
        mutableDateTime13.setZoneRetainFields(dateTimeZone19);
        mutableDateTime13.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        mutableDateTime13.setZone(dateTimeZone24);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((-1L), (long) 17, chronology32);
        mutableDateTime13.setChronology(chronology32);
        java.lang.String str35 = chronology32.toString();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = timeOfDay40.toDateTimeToday(dateTimeZone41);
        org.joda.time.Chronology chronology43 = chronology32.withZone(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.property(dateTimeFieldType45);
        java.lang.String str47 = dateTimeFieldType45.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate49 = localDate8.withField(dateTimeFieldType45, 130);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 130 for weekyearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ISOChronology[UTC]" + "'", str35, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "weekyearOfCentury" + "'", str47, "weekyearOfCentury");
    }

    @Test
    public void test16195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16195");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        mutableDateTime4.setZoneRetainFields(dateTimeZone10);
        mutableDateTime4.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        mutableDateTime4.setZone(dateTimeZone15);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((-1L), (long) 17, chronology23);
        mutableDateTime4.setChronology(chronology23);
        java.lang.String str26 = chronology23.toString();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = timeOfDay31.toDateTimeToday(dateTimeZone32);
        org.joda.time.Chronology chronology34 = chronology23.withZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology34);
        org.joda.time.Period period36 = new org.joda.time.Period((long) 53, chronology34);
        org.joda.time.DateTimeField dateTimeField37 = chronology34.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField39 = chronology34.dayOfMonth();
        int int42 = dateTimeField39.getDifference((long) 2038, 1645514467806L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ISOChronology[UTC]" + "'", str26, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-19045) + "'", int42 == (-19045));
    }

    @Test
    public void test16196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16196");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("26215220");
        int int2 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        mutableDateTime6.set(dateTimeFieldType12, (int) ' ');
        boolean boolean16 = mutableDateTime1.isSupported(dateTimeFieldType12);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.millisOfSecond();
        int int18 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone19);
        boolean boolean24 = dateTimeZone19.isStandardOffset((long) 10);
        long long28 = dateTimeZone19.convertLocalToUTC((long) 38, true, 1645514205352L);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray34 = timeOfDay33.getFields();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTimeToday(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plus((long) '4');
        org.joda.time.DateTime dateTime40 = dateTime38.plusSeconds(3172001);
        boolean boolean41 = dateTimeZone19.equals((java.lang.Object) dateTime38);
        int int43 = dateTimeZone19.getStandardOffset(2629746000L);
        org.joda.time.DateMidnight dateMidnight44 = org.joda.time.DateMidnight.now(dateTimeZone19);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone19);
        java.lang.String str47 = dateTimeZone19.getShortName(100162491494426217L);
        mutableDateTime1.setZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis((-49));
        long long52 = dateTimeZone19.getMillisKeepLocal(dateTimeZone50, (long) (-439));
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 262152 + "'", int18 == 262152);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 38L + "'", long28 == 38L);
        org.junit.Assert.assertNotNull(dateTimeFieldArray34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-390L) + "'", long52 == (-390L));
    }

    @Test
    public void test16197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16197");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int6 = date5.getSeconds();
        date5.setHours((int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromDateFields(date5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromDateFields(date5);
// flaky:             org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -16 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay9);
    }

    @Test
    public void test16198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16198");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 10, chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMinuteOfHour(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 10, chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withFields((org.joda.time.ReadablePartial) localDateTime10);
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMonths((int) 'a');
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours(17);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withWeekyear(936);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.minusSeconds(458);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.plusSeconds(93);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1961 + "'", int17 == 1961);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test16199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16199");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = timeOfDay21.toDateTimeToday(dateTimeZone22);
        mutableDateTime16.setZoneRetainFields(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime16, readableDuration25);
        boolean boolean27 = dateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        java.lang.Object obj28 = mutableDateTime16.clone();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.halfdays();
        mutableDateTime16.add(durationFieldType29, 18);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone32);
        mutableDateTime16.setZoneRetainFields(dateTimeZone32);
        java.lang.String str38 = dateTimeZone32.getShortName(383307838941000L);
        boolean boolean39 = dateTimeZone32.isFixed();
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.now(dateTimeZone32);
        int int42 = dateTimeZone32.getOffset((long) 904);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
// flaky:         org.junit.Assert.assertEquals(obj28.toString(), "2022-02-22T07:25:52.025Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "2022-02-22T07:25:52.025Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "2022-02-22T07:25:52.025Z");
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test16200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16200");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((-1L), (long) 17, chronology4);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period7 = interval5.toPeriod(periodType6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.secondOfMinute();
        java.lang.String str11 = property10.getAsString();
        java.lang.String str12 = property10.getAsShortText();
        org.joda.time.DateTime dateTime13 = property10.roundFloorCopy();
        java.lang.String str14 = property10.getAsString();
        org.joda.time.Interval interval15 = property10.toInterval();
        boolean boolean16 = interval5.isAfter((org.joda.time.ReadableInterval) interval15);
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.halfdayOfDay();
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "52" + "'", str11, "52");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "52" + "'", str12, "52");
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52" + "'", str14, "52");
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test16201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16201");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 10, chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 10, chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 10, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod17, 15);
        org.joda.time.LocalDateTime.Property property20 = localDateTime12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str24 = dateTimeZone23.getID();
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str29 = locale26.getDisplayVariant(locale28);
        java.lang.String str30 = dateTimeZone23.getName((long) 5, locale26);
        org.joda.time.LocalDateTime localDateTime31 = property20.setCopy("18", locale26);
        java.util.Set<java.lang.Character> charSet32 = locale26.getExtensionKeys();
        java.util.Locale.Builder builder33 = builder0.setLocale(locale26);
        java.util.Locale.Builder builder34 = builder33.clear();
        java.util.Locale locale35 = builder33.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder38 = builder33.setExtension('#', "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.016" + "'", str24, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.016" + "'", str30, "+00:00:00.016");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(charSet32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
    }

    @Test
    public void test16202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16202");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.time();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime4.add(readableDuration5, 0);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 5, chronology13);
        org.joda.time.Chronology chronology15 = chronology13.withUTC();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone16);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) 86340000, dateTimeZone16);
        mutableDateTime4.setZone(dateTimeZone16);
        java.lang.String str21 = dateTimeZone16.getID();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter0.withZone(dateTimeZone16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter0.withDefaultYear(26296827);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withDefaultYear(5452);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test16203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16203");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusMillis((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusSeconds(99);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusYears(19);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.plusMinutes(18);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfEra(2022);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.withHourOfDay(3);
        int int24 = dateTime23.getSecondOfMinute();
        int int25 = dateTime23.getMinuteOfHour();
        org.joda.time.DateTime.Property property26 = dateTime23.centuryOfEra();
        org.joda.time.DateTime.Property property27 = dateTime23.hourOfDay();
        org.joda.time.DateTime dateTime28 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 25 + "'", int25 == 25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test16204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16204");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 10, chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod15, 15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        int int20 = localDateTime17.get(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusSeconds(12);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusMillis((int) (short) 0);
        int int25 = localDateTime22.getWeekyear();
        org.joda.time.LocalDateTime.Property property26 = localDateTime22.year();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundHalfCeilingCopy();
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 10, chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withMinuteOfHour(0);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 10, chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.withFields((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 10, chronology45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime41.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod46, 15);
        org.joda.time.LocalDateTime.Property property49 = localDateTime41.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str53 = dateTimeZone52.getID();
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str58 = locale55.getDisplayVariant(locale57);
        java.lang.String str59 = dateTimeZone52.getName((long) 5, locale55);
        org.joda.time.LocalDateTime localDateTime60 = property49.setCopy("18", locale55);
        java.util.Set<java.lang.Character> charSet61 = locale55.getExtensionKeys();
        java.util.Locale.Builder builder62 = builder29.setLocale(locale55);
        java.util.Locale locale63 = java.util.Locale.TAIWAN;
        java.lang.String str65 = locale63.getExtension('u');
        java.util.Locale.Builder builder66 = builder29.setLocale(locale63);
        org.joda.time.LocalDateTime localDateTime67 = property26.setCopy("53", locale63);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.withMillisOfDay(26190505);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00:00.016" + "'", str53, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00:00.016" + "'", str59, "+00:00:00.016");
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(charSet61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
    }

    @Test
    public void test16205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16205");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        boolean boolean10 = timeZone6.hasSameRules(timeZone9);
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9, locale11);
        org.joda.time.DateTime dateTime13 = property2.setCopy("6", locale11);
        org.joda.time.DateTime dateTime14 = property2.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField15 = property2.getField();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 10, chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = property21.setCopy(29);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withField(dateTimeFieldType24, 5);
        org.joda.time.LocalDateTime.Property property27 = localDateTime23.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime29 = property27.addWrapFieldToCopy(41);
        org.joda.time.LocalDateTime localDateTime31 = property27.addToCopy((long) (-19354500));
        int int32 = dateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withWeekyear((-39));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645514752129,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=25,SECOND=52,MILLISECOND=145,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test16206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16206");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime10 = dateTime6.plusDays((int) (byte) -1);
        java.util.Date date11 = dateTime10.toDate();
        org.joda.time.DateTime.Property property12 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime14 = property12.roundHalfFloorCopy();
        int int15 = property12.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 21 00:52:52 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
    }

    @Test
    public void test16207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16207");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) 365);
        org.joda.time.YearMonthDay yearMonthDay2 = dateMidnight1.toYearMonthDay();
        org.junit.Assert.assertNotNull(yearMonthDay2);
    }

    @Test
    public void test16208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16208");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTime();
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("59");
        int int5 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime2, "PT0S", 3);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.ISODateTimeFormat.basicDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withOffsetParsed();
        java.util.Locale locale13 = dateTimeFormatter7.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter7.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = null;
        int int20 = dateTimeParser15.parseInto(dateTimeParserBucket17, "217", 53);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-4) + "'", int5 == (-4));
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeParser15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-54) + "'", int20 == (-54));
    }

    @Test
    public void test16209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16209");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period14 = new org.joda.time.Period(100, 3172001, (int) '4', (int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 12);
        int int18 = mutablePeriod17.getHours();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = timeOfDay23.getFields();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTimeToday(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfCentury(16);
        org.joda.time.DateTime dateTime30 = dateTime28.plusHours(214);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod();
        mutablePeriod31.addWeeks((int) (byte) 100);
        org.joda.time.Period period35 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        java.lang.String str38 = period37.toString();
        org.joda.time.Period period39 = period35.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period41 = period39.plusMillis(100);
        org.joda.time.Period period42 = period39.negated();
        org.joda.time.Period period44 = period42.withMillis(1899);
        org.joda.time.Minutes minutes45 = period44.toStandardMinutes();
        mutablePeriod31.setPeriod((org.joda.time.ReadablePeriod) period44);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray52 = timeOfDay51.getFields();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTimeToday(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.plus((long) '4');
        org.joda.time.DateTime dateTime58 = dateTime56.plusSeconds(3172001);
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray64 = timeOfDay63.getFields();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = timeOfDay63.toDateTimeToday(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.plus((long) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType70 = dateTimeFieldType69.getDurationType();
        org.joda.time.DateTime dateTime72 = dateTime68.withField(dateTimeFieldType69, 16);
        boolean boolean73 = dateTime58.isSupported(dateTimeFieldType69);
        org.joda.time.DurationFieldType durationFieldType74 = dateTimeFieldType69.getDurationType();
        mutablePeriod31.add(durationFieldType74, (-4));
        org.joda.time.DateTime dateTime78 = dateTime28.withFieldAdded(durationFieldType74, 3172000);
        int int79 = mutablePeriod17.indexOf(durationFieldType74);
        org.joda.time.Period period81 = period14.withFieldAdded(durationFieldType74, 26196);
        org.joda.time.Period period83 = period6.withFieldAdded(durationFieldType74, 1899);
        org.joda.time.Period period84 = period83.negated();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldArray24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT1M" + "'", str38, "PT1M");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertNotNull(dateTimeFieldArray52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeFieldArray64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 5 + "'", int79 == 5);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period84);
    }
}
