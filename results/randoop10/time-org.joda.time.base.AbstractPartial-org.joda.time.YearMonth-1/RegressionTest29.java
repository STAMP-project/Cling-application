import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = yearMonth6.toInterval(dateTimeZone7);
        org.joda.time.YearMonth yearMonth10 = yearMonth6.minusMonths((int) (short) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = yearMonth10.withChronologyRetainFields(chronology11);
        int int13 = yearMonth1.compareTo((org.joda.time.ReadablePartial) yearMonth12);
        int int14 = yearMonth1.getMonthOfYear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth yearMonth17 = yearMonth1.minusMonths(8);
        org.joda.time.YearMonth yearMonth19 = yearMonth17.plusMonths(936);
        org.joda.time.YearMonth yearMonth21 = yearMonth17.plusMonths((-52));
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(yearMonth21);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate4 = property2.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        int int7 = dateTimeField5.get((long) 'u');
        long long10 = dateTimeField5.addWrapField((long) (short) -1, 1);
        int int12 = dateTimeField5.get((long) (byte) 100);
        long long14 = dateTimeField5.remainder((long) 752);
        java.util.Locale locale19 = new java.util.Locale("31 Dec 1969 18:00:00 GMT", "Property[minuteOfDay]");
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField5.set(1644572696216L, "yearofcentury", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearofcentury\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 31535999999L + "'", long10 == 31535999999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 752L + "'", long14 == 752L);
        org.junit.Assert.assertEquals(locale19.toString(), "31 dec 1969 18:00:00 gmt_PROPERTY[MINUTEOFDAY]");
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = yearMonth1.toString(dateTimeFormatter6);
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = yearMonth9.toInterval(dateTimeZone10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = yearMonth9.getFieldTypes();
        org.joda.time.YearMonth.Property property13 = yearMonth9.year();
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Interval interval19 = yearMonth17.toInterval(dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.Interval interval21 = interval19.withPeriodAfterStart(readablePeriod20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = interval21.toPeriod(periodType22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean25 = period23.isSupported(durationFieldType24);
        org.joda.time.YearMonth yearMonth27 = yearMonth15.withPeriodAdded((org.joda.time.ReadablePeriod) period23, 32770);
        org.joda.time.YearMonth yearMonth28 = yearMonth9.minus((org.joda.time.ReadablePeriod) period23);
        boolean boolean29 = yearMonth1.isAfter((org.joda.time.ReadablePartial) yearMonth28);
        org.joda.time.Chronology chronology30 = yearMonth28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.year();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.millisOfSecond();
        int int34 = dateTimeField33.getMinimumValue();
        long long36 = dateTimeField33.roundCeiling((long) 116);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01" + "'", str7, "1970-01");
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 116L + "'", long36 == 116L);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getCountry();
        java.util.Locale locale8 = locale6.stripExtensions();
        int int9 = property5.getMaximumTextLength(locale8);
        org.joda.time.YearMonth yearMonth11 = property5.setCopy(16);
        org.joda.time.YearMonth yearMonth13 = property5.addWrapFieldToCopy(22);
        org.joda.time.YearMonth yearMonth15 = property5.setCopy((int) (byte) 10);
        int int16 = property5.getMinimumValue();
        java.lang.String str17 = property5.toString();
        java.lang.String str18 = property5.getAsString();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(21600000);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 56171, dateTimeZone22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) (-31449599990L), dateTimeZone22);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        boolean boolean26 = property5.equals((java.lang.Object) property25);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-292275054) + "'", int16 == (-292275054));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Property[year]" + "'", str17, "Property[year]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970" + "'", str18, "1970");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((long) (short) 1, chronology1);
        org.joda.time.Chronology chronology3 = yearMonth2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.millisOfSecond();
        long long6 = dateTimeField4.roundHalfFloor((long) 86397);
        int int8 = dateTimeField4.get(57L);
        boolean boolean10 = dateTimeField4.isLeap(34712415L);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86397L + "'", long6 == 86397L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 57 + "'", int8 == 57);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.lang.String str6 = property5.toString();
        org.joda.time.YearMonth yearMonth7 = property5.getYearMonth();
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = yearMonth9.toInterval(dateTimeZone10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = yearMonth9.getFieldTypes();
        org.joda.time.YearMonth.Property property13 = yearMonth9.year();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = locale14.getCountry();
        int int16 = property13.getMaximumShortTextLength(locale14);
        java.lang.String str17 = property5.getAsShortText(locale14);
        org.joda.time.YearMonth yearMonth19 = property5.setCopy(6);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.withYear(16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = yearMonth21.getFieldTypes();
        org.joda.time.YearMonth yearMonth24 = yearMonth21.plusMonths(32772);
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Interval interval28 = yearMonth26.toInterval(dateTimeZone27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = yearMonth26.getFieldTypes();
        org.joda.time.YearMonth.Property property30 = yearMonth26.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = yearMonth26.toString(dateTimeFormatter31);
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.Interval interval36 = yearMonth34.toInterval(dateTimeZone35);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray37 = yearMonth34.getFieldTypes();
        org.joda.time.YearMonth.Property property38 = yearMonth34.year();
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.Interval interval44 = yearMonth42.toInterval(dateTimeZone43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.Interval interval46 = interval44.withPeriodAfterStart(readablePeriod45);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = interval46.toPeriod(periodType47);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean50 = period48.isSupported(durationFieldType49);
        org.joda.time.YearMonth yearMonth52 = yearMonth40.withPeriodAdded((org.joda.time.ReadablePeriod) period48, 32770);
        org.joda.time.YearMonth yearMonth53 = yearMonth34.minus((org.joda.time.ReadablePeriod) period48);
        boolean boolean54 = yearMonth26.isAfter((org.joda.time.ReadablePartial) yearMonth53);
        org.joda.time.Chronology chronology55 = yearMonth53.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.year();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology55.getZone();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.secondOfDay();
        org.joda.time.DurationField durationField59 = chronology55.weekyears();
        org.joda.time.YearMonth yearMonth60 = new org.joda.time.YearMonth(chronology55);
        org.joda.time.YearMonth yearMonth61 = yearMonth21.withChronologyRetainFields(chronology55);
        org.joda.time.DateTimeField dateTimeField62 = chronology55.dayOfWeek();
        long long65 = dateTimeField62.addWrapField((-57154400107844L), (-292277022));
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[year]" + "'", str6, "Property[year]");
        org.junit.Assert.assertNotNull(yearMonth7);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FR" + "'", str15, "FR");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970" + "'", str17, "1970");
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01" + "'", str32, "1970-01");
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-57153968107844L) + "'", long65 == (-57153968107844L));
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate.Property property9 = localDate2.yearOfEra();
        org.joda.time.LocalDate localDate11 = localDate2.plusYears((int) 'a');
        java.lang.Object obj12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(obj12);
        org.joda.time.LocalDate localDate15 = localDate13.plusDays(20);
        int int16 = localDate13.getDayOfWeek();
        int int17 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.LocalDate.Property property18 = localDate2.era();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate25 = localDate21.minusYears(11);
        org.joda.time.LocalDate.Property property26 = localDate21.monthOfYear();
        org.joda.time.LocalDate localDate27 = property26.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate29 = localDate27.minusDays(6);
        org.joda.time.LocalDate.Property property30 = localDate27.weekyear();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfCentury();
        org.joda.time.LocalDate localDate33 = property32.getLocalDate();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = property32.getDifference(readableInstant34);
        org.joda.time.LocalDate localDate36 = property32.withMaximumValue();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property38 = localDate37.yearOfCentury();
        org.joda.time.LocalDate localDate39 = property38.getLocalDate();
        org.joda.time.LocalDate localDate41 = localDate39.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate43 = localDate41.plusMonths(32772);
        org.joda.time.LocalDate localDate44 = localDate36.withFields((org.joda.time.ReadablePartial) localDate43);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property46 = localDate45.yearOfCentury();
        org.joda.time.LocalDate.Property property47 = localDate45.yearOfCentury();
        org.joda.time.LocalDate localDate49 = property47.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField50 = property47.getField();
        long long53 = dateTimeField50.addWrapField((long) 2, (int) (byte) 10);
        int int55 = dateTimeField50.getMaximumValue((long) (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = dateTimeField50.getType();
        boolean boolean57 = localDate43.isSupported(dateTimeFieldType56);
        org.joda.time.DurationFieldType durationFieldType58 = dateTimeFieldType56.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType59 = dateTimeFieldType56.getDurationType();
        org.joda.time.DurationFieldType durationFieldType60 = dateTimeFieldType56.getRangeDurationType();
        boolean boolean61 = localDate27.isSupported(dateTimeFieldType56);
        int int62 = localDate2.get(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 315532800002L + "'", long53 == 315532800002L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 99 + "'", int55 == 99);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 22 + "'", int62 == 22);
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime19.withMillis((long) 86397);
        org.joda.time.Chronology chronology41 = dateTime19.getChronology();
        long long45 = chronology41.add((long) 21597, (long) 'a', 86397772);
        org.joda.time.DateTimeZone dateTimeZone46 = chronology41.getZone();
        long long48 = dateTimeZone46.previousTransition((-28800000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21600000 + "'", int16 == 21600000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 11 + "'", int35 == 11);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 8380605481L + "'", long45 == 8380605481L);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-28800000L) + "'", long48 == (-28800000L));
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.lang.String str6 = property5.toString();
        org.joda.time.YearMonth yearMonth8 = property5.addToCopy((int) (byte) 10);
        java.lang.String str9 = property5.getName();
        int int10 = property5.getMinimumValueOverall();
        org.joda.time.YearMonth yearMonth12 = property5.setCopy(28800);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) 'a');
        org.joda.time.YearMonth yearMonth16 = yearMonth12.plusMonths((-292277022));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = yearMonth16.getFieldTypes();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[year]" + "'", str6, "Property[year]");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "year" + "'", str9, "year");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-292275054) + "'", int10 == (-292275054));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("2022-02-11T00:00:00.000+06:00/2022-02-11T00:00:00.000+06:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-11t00:00:00.000+06:00/2022-02-11t00:00:00.000+06:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = yearMonth6.toInterval(dateTimeZone7);
        org.joda.time.YearMonth yearMonth10 = yearMonth6.minusMonths((int) (short) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = yearMonth10.withChronologyRetainFields(chronology11);
        int int13 = yearMonth1.compareTo((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.YearMonth yearMonth15 = yearMonth12.minus(readablePeriod14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = yearMonth12.toDateTime(readableInstant16);
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Interval interval21 = yearMonth19.toInterval(dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.Interval interval23 = interval21.withPeriodAfterStart(readablePeriod22);
        org.joda.time.MutableInterval mutableInterval24 = interval23.toMutableInterval();
        boolean boolean25 = interval23.containsNow();
        org.joda.time.DateTime dateTime26 = interval23.getStart();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 20, (long) 86397);
        boolean boolean30 = interval23.isBefore((org.joda.time.ReadableInterval) interval29);
        org.joda.time.DateTime dateTime31 = interval29.getStart();
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Interval interval35 = yearMonth33.toInterval(dateTimeZone34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.Interval interval37 = interval35.withPeriodAfterStart(readablePeriod36);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = interval37.toPeriod(periodType38);
        org.joda.time.PeriodType periodType40 = period39.getPeriodType();
        java.util.Date date46 = new java.util.Date((int) (short) 0, (-1), (-292275054), (int) (byte) 10, (int) 'u');
        boolean boolean47 = period39.equals((java.lang.Object) (-292275054));
        org.joda.time.Period period48 = period39.toPeriod();
        org.joda.time.Interval interval49 = interval29.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Period period50 = period48.toPeriod();
        org.joda.time.YearMonth yearMonth51 = yearMonth12.plus((org.joda.time.ReadablePeriod) period48);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(mutableInterval24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertEquals(date46.toString(), "Mon Jun 05 11:57:00 UTC 798307");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(yearMonth51);
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((int) 'a');
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronolgy();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.LocalDate localDate18 = localDate10.plusMonths((int) (short) 1);
        java.lang.String str19 = localDate18.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTime dateTime27 = localDate24.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localDate18.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter2.withZone(dateTimeZone26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter29.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter30.withPivotYear(32);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = dateTimeFormatter30.getPrinter();
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2022-03-11" + "'", str19, "2022-03-11");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNull(dateTimePrinter33);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime dateTime14 = dateTime13.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime19 = dateTime14.withTime(9, 0, 42, 70);
        org.joda.time.DateTime dateTime20 = dateTime14.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property21 = dateTime20.era();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean25 = dateTimeZone24.isFixed();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone24);
        org.joda.time.LocalDate.Property property27 = localDate26.centuryOfEra();
        org.joda.time.Chronology chronology28 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.weekyearOfCentury();
        org.joda.time.DateTime dateTime32 = dateTime20.toDateTime(chronology28);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) 20, (long) 86397);
        org.joda.time.Period period36 = interval35.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone39);
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.DateTime dateTime44 = localDate41.toDateTimeAtMidnight(dateTimeZone43);
        java.lang.String str45 = dateTime44.toString();
        org.joda.time.DateMidnight dateMidnight46 = dateTime44.toDateMidnight();
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime44.toMutableDateTime();
        long long48 = dateTime44.getMillis();
        int int49 = dateTime44.getWeekyear();
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period36, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Duration duration51 = interval50.toDuration();
        org.joda.time.DateTime dateTime52 = dateTime32.plus((org.joda.time.ReadableDuration) duration51);
        int int53 = dateTime32.getYearOfCentury();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyear" + "'", str11, "weekyear");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01T00:00:00.000+06:00" + "'", str45, "1970-01-01T00:00:00.000+06:00");
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-21600000L) + "'", long48 == (-21600000L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1970 + "'", int49 == 1970);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 22 + "'", int53 == 22);
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth yearMonth6 = yearMonth1.withYear((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.eras();
        boolean boolean8 = yearMonth1.equals((java.lang.Object) durationFieldType7);
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = yearMonth10.toInterval(dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.Interval interval14 = interval12.withPeriodAfterStart(readablePeriod13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = interval14.toPeriod(periodType15);
        java.lang.String str17 = period16.toString();
        org.joda.time.YearMonth yearMonth19 = yearMonth1.withPeriodAdded((org.joda.time.ReadablePeriod) period16, 100);
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Interval interval23 = yearMonth21.toInterval(dateTimeZone22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.Interval interval25 = interval23.withPeriodAfterStart(readablePeriod24);
        org.joda.time.Interval interval27 = interval23.withStartMillis((long) 32772);
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.weekyears();
        org.joda.time.YearMonth yearMonth30 = yearMonth1.withChronologyRetainFields(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.weekOfWeekyear();
        org.joda.time.Chronology chronology33 = chronology28.withUTC();
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth(chronology28);
        int[] intArray35 = yearMonth34.getValues();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0S" + "'", str17, "PT0S");
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[2022, 2]");
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) (byte) 10);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean10 = property7.equals((java.lang.Object) dateTimeFieldType9);
        boolean boolean11 = calendar3.before((java.lang.Object) boolean10);
        java.util.Date date12 = calendar3.getTime();
        int int13 = calendar3.getWeeksInWeekYear();
        java.lang.String str14 = calendar3.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=32770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:32 UTC 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.util.GregorianCalendar[time=32770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str14, "java.util.GregorianCalendar[time=32770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Locale locale6 = new java.util.Locale("5 Jun 798307 11:57:00 GMT", "PT0S", "1969");
        java.util.Calendar.Builder builder7 = builder2.setLocale(locale6);
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone11);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTime dateTime16 = localDate13.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillis((long) 32772);
        org.joda.time.DateTime dateTime20 = dateTime18.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime22 = dateTime18.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.Interval interval24 = new org.joda.time.Interval(obj8, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.secondOfDay();
        org.joda.time.DurationField durationField27 = chronology23.minutes();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property29 = localDate28.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.DateTime dateTime36 = localDate30.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str39 = dateTimeFieldType38.getName();
        org.joda.time.DateTime.Property property40 = dateTime37.property(dateTimeFieldType38);
        org.joda.time.DateTime dateTime41 = property40.roundFloorCopy();
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime41.getZone();
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone43);
        org.joda.time.Chronology chronology45 = chronology23.withZone(dateTimeZone43);
        java.util.TimeZone timeZone46 = dateTimeZone43.toTimeZone();
        java.util.Calendar.Builder builder47 = builder2.setTimeZone(timeZone46);
        java.util.Locale locale51 = new java.util.Locale("", "fr", "2022-02-11");
        java.lang.String str52 = locale51.getDisplayCountry();
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone46, locale51);
        java.lang.Object obj54 = locale51.clone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals(locale6.toString(), "5 jun 798307 11:57:00 gmt_PT0S_1969");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "weekyear" + "'", str39, "weekyear");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals(locale51.toString(), "_FR_2022-02-11");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Frankreich" + "'", str52, "Frankreich");
        org.junit.Assert.assertNotNull(calendar53);
// flaky:         org.junit.Assert.assertEquals(calendar53.toString(), "java.util.GregorianCalendar[time=1644572707103,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=45,SECOND=7,MILLISECOND=103,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "_FR_2022-02-11");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "_FR_2022-02-11");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "_FR_2022-02-11");
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        java.util.Date date3 = new java.util.Date(17, (int) (byte) 100, 0);
        java.util.Date date5 = new java.util.Date((long) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone8);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTime dateTime13 = localDate10.toDateTimeAtMidnight(dateTimeZone12);
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.DateMidnight dateMidnight15 = dateTime13.toDateMidnight();
        java.util.Date date16 = dateMidnight15.toDate();
        boolean boolean17 = date5.before(date16);
        java.time.Instant instant18 = date5.toInstant();
        date5.setMinutes(2022);
        int int21 = date5.getTimezoneOffset();
        boolean boolean22 = date3.before(date5);
        date5.setHours(100);
        date5.setMonth(56170);
        date5.setYear(56369);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Apr 30 00:00:00 UTC 1925");
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 06 04:42:00 UTC 58269");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.000+06:00" + "'", str14, "1970-01-01T00:00:00.000+06:00");
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Wed Dec 31 18:00:00 UTC 1969");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(32772);
        org.joda.time.LocalDate localDate8 = localDate4.minusYears((int) (short) 10);
        org.joda.time.LocalDate.Property property9 = localDate4.weekyear();
        int int10 = localDate4.getYearOfCentury();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter13.getZone();
        java.util.Locale locale15 = dateTimeFormatter13.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withPivotYear((int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeFormatter13.getChronolgy();
        java.lang.Integer int19 = dateTimeFormatter13.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int23 = dateTimeZone21.getOffset((long) 2022);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter13.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate4.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property27 = localDate26.yearOfCentury();
        org.joda.time.LocalDate localDate28 = property27.getLocalDate();
        java.lang.String str29 = property27.getName();
        long long30 = property27.remainder();
        int int31 = property27.getMinimumValue();
        org.joda.time.LocalDate localDate33 = property27.addToCopy(12);
        org.joda.time.LocalDate localDate35 = localDate33.withYearOfEra((int) '#');
        boolean boolean36 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property38 = localDate37.yearOfCentury();
        org.joda.time.LocalDate.Property property39 = localDate37.yearOfCentury();
        org.joda.time.LocalDate localDate40 = property39.withMaximumValue();
        org.joda.time.LocalDate localDate41 = property39.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate42 = property39.withMinimumValue();
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.Interval interval47 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Interval interval49 = interval47.withChronology(chronology48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property51 = localDate50.yearOfCentury();
        org.joda.time.LocalDate localDate52 = property51.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean56 = dateTimeZone55.isFixed();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone55);
        org.joda.time.DateTime dateTime58 = localDate52.toDateTimeAtStartOfDay(dateTimeZone55);
        org.joda.time.DateTime dateTime59 = dateTime58.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property60 = dateTime59.year();
        boolean boolean61 = interval49.contains((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Period period62 = interval49.toPeriod();
        java.lang.String str63 = period62.toString();
        int[] intArray65 = chronology43.get((org.joda.time.ReadablePeriod) period62, 83635236564686000L);
        org.joda.time.MutablePeriod mutablePeriod66 = period62.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod67 = period62.toMutablePeriod();
        org.joda.time.Period period68 = period62.toPeriod();
        org.joda.time.LocalDate localDate70 = localDate35.withPeriodAdded((org.joda.time.ReadablePeriod) period68, 2011);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 17 + "'", int10 == 17);
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(chronology18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 21600000 + "'", int23 == 21600000);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "yearOfCentury" + "'", str29, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3542400000L + "'", long30 == 3542400000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PT0.011S" + "'", str63, "PT0.011S");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[0, 0, 138285774, 5, 4, 51, 26, 0]");
        org.junit.Assert.assertNotNull(mutablePeriod66);
        org.junit.Assert.assertNotNull(mutablePeriod67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(localDate70);
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        java.lang.String str14 = localDate12.toString("1969-12");
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfCentury();
        org.joda.time.LocalDate localDate19 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = dateTime25.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str28 = dateTimeFieldType27.getName();
        org.joda.time.DateTime.Property property29 = dateTime26.property(dateTimeFieldType27);
        org.joda.time.DateTime dateTime30 = property29.withMaximumValue();
        org.joda.time.LocalDate localDate31 = dateTime30.toLocalDate();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property33 = localDate32.yearOfCentury();
        org.joda.time.LocalDate localDate34 = property33.getLocalDate();
        java.lang.String str35 = property33.getName();
        long long36 = property33.remainder();
        int int37 = property33.getMinimumValue();
        org.joda.time.LocalDate localDate38 = property33.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property33.getFieldType();
        org.joda.time.LocalDate localDate40 = property33.roundHalfEvenCopy();
        java.lang.String str41 = property33.getName();
        org.joda.time.LocalDate localDate42 = property33.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean46 = dateTimeZone45.isFixed();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone45);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTime dateTime50 = localDate47.toDateTimeAtCurrentTime(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.withMillis((long) 32772);
        org.joda.time.DateTime dateTime54 = dateTime52.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime56 = dateTime54.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Interval interval62 = interval60.withChronology(chronology61);
        org.joda.time.Duration duration63 = interval60.toDuration();
        org.joda.time.DateTime dateTime64 = dateTime56.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property66 = localDate65.yearOfCentury();
        org.joda.time.LocalDate.Property property67 = localDate65.yearOfCentury();
        org.joda.time.LocalDate localDate69 = property67.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str70 = property67.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property67.getFieldType();
        org.joda.time.DurationFieldType durationFieldType72 = dateTimeFieldType71.getDurationType();
        boolean boolean73 = dateTime56.isSupported(dateTimeFieldType71);
        int int74 = localDate42.get(dateTimeFieldType71);
        boolean boolean75 = localDate31.isSupported(dateTimeFieldType71);
        org.joda.time.DurationFieldType durationFieldType76 = dateTimeFieldType71.getRangeDurationType();
        java.lang.String str77 = durationFieldType76.getName();
        java.lang.String str78 = durationFieldType76.toString();
        java.lang.String str79 = durationFieldType76.getName();
        org.joda.time.DateTime dateTime81 = dateTime16.withFieldAdded(durationFieldType76, 20);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12" + "'", str14, "1969-12");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "weekyear" + "'", str28, "weekyear");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "yearOfCentury" + "'", str35, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 3542400000L + "'", long36 == 3542400000L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "yearOfCentury" + "'", str41, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localDate69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "22" + "'", str70, "22");
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 22 + "'", int74 == 22);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(durationFieldType76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "centuries" + "'", str77, "centuries");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "centuries" + "'", str78, "centuries");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "centuries" + "'", str79, "centuries");
        org.junit.Assert.assertNotNull(dateTime81);
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.yearOfCentury();
        org.joda.time.LocalDate localDate6 = property4.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate7 = property4.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        boolean boolean9 = durationFieldType1.isSupported(chronology8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.LocalDate localDate26 = localDate14.minusYears(10);
        int int27 = localDate26.getWeekOfWeekyear();
        int[] intArray29 = chronology8.get((org.joda.time.ReadablePartial) localDate26, 118L);
        org.joda.time.DateTimeField dateTimeField30 = chronology8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField32 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField33 = chronology8.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) (short) 1);
        boolean boolean5 = dateTimeFormatter4.isOffsetParsed();
        boolean boolean6 = dateTimeFormatter4.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR" + "'", str1, "FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.DateTime dateTime14 = property12.roundHalfFloorCopy();
        int int15 = dateTime14.getWeekyear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyear" + "'", str11, "weekyear");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar.Builder builder6 = builder0.setWeekDate(42, (-1), 14);
        java.util.Calendar.Builder builder8 = builder0.setLenient(true);
        java.util.Calendar.Builder builder12 = builder0.setDate(21597772, 21597772, 69);
        java.util.Calendar.Builder builder17 = builder12.setTimeOfDay((int) (byte) 100, (int) 'u', (-113952), 0);
        java.util.Calendar.Builder builder19 = builder12.setLenient(false);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.LocalDate localDate30 = localDate22.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property31 = localDate22.dayOfMonth();
        org.joda.time.LocalDate.Property property32 = localDate22.weekyear();
        org.joda.time.LocalDate localDate34 = localDate22.minusWeeks((int) (short) 0);
        org.joda.time.Chronology chronology35 = localDate22.getChronology();
        org.joda.time.LocalDate.Property property36 = localDate22.era();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(0L);
        int int39 = property36.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDate localDate40 = dateTime38.toLocalDate();
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale42);
        java.lang.String str44 = locale41.getDisplayLanguage(locale42);
        java.util.Set<java.lang.Character> charSet45 = locale41.getExtensionKeys();
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.lang.String str47 = locale46.getCountry();
        java.lang.String str48 = locale41.getDisplayScript(locale46);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(locale46);
        java.util.Calendar calendar50 = dateTime38.toCalendar(locale46);
        java.util.Calendar.Builder builder51 = builder12.setLocale(locale46);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Chinese" + "'", str44, "Chinese");
        org.junit.Assert.assertNotNull(charSet45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "KR" + "'", str47, "KR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(calendar49);
// flaky:         org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=1644572707309,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=45,SECOND=7,MILLISECOND=309,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar50);
// flaky:         org.junit.Assert.assertEquals(calendar50.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = yearMonth2.toInterval(dateTimeZone3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Interval interval6 = interval4.withPeriodAfterStart(readablePeriod5);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = interval6.toPeriod(periodType7);
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = yearMonth10.toInterval(dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.Interval interval14 = interval12.withPeriodAfterStart(readablePeriod13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = interval14.toPeriod(periodType15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean18 = period16.isSupported(durationFieldType17);
        int int19 = period8.get(durationFieldType17);
        int int20 = period8.size();
        org.joda.time.YearMonth yearMonth22 = yearMonth0.withPeriodAdded((org.joda.time.ReadablePeriod) period8, 9);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.plusMonths((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean26 = yearMonth22.isSupported(dateTimeFieldType25);
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.Interval interval30 = yearMonth28.toInterval(dateTimeZone29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.Interval interval32 = interval30.withPeriodAfterStart(readablePeriod31);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = interval32.toPeriod(periodType33);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean36 = period34.isSupported(durationFieldType35);
        java.lang.String str37 = period34.toString();
        org.joda.time.PeriodType periodType38 = period34.getPeriodType();
        org.joda.time.YearMonth yearMonth40 = yearMonth22.withPeriodAdded((org.joda.time.ReadablePeriod) period34, 2017);
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.Interval interval44 = yearMonth42.toInterval(dateTimeZone43);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray45 = yearMonth42.getFieldTypes();
        org.joda.time.YearMonth.Property property46 = yearMonth42.year();
        java.lang.String str47 = property46.toString();
        org.joda.time.YearMonth yearMonth49 = property46.addToCopy((int) (byte) 10);
        int int50 = property46.getMinimumValue();
        java.lang.String str51 = property46.toString();
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.Interval interval55 = yearMonth53.toInterval(dateTimeZone54);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = yearMonth53.getFieldTypes();
        org.joda.time.YearMonth.Property property57 = yearMonth53.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = yearMonth53.toString(dateTimeFormatter58);
        org.joda.time.YearMonth yearMonth61 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.Interval interval63 = yearMonth61.toInterval(dateTimeZone62);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray64 = yearMonth61.getFieldTypes();
        org.joda.time.YearMonth.Property property65 = yearMonth61.year();
        org.joda.time.YearMonth yearMonth67 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth69 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.Interval interval71 = yearMonth69.toInterval(dateTimeZone70);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.Interval interval73 = interval71.withPeriodAfterStart(readablePeriod72);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = interval73.toPeriod(periodType74);
        org.joda.time.DurationFieldType durationFieldType76 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean77 = period75.isSupported(durationFieldType76);
        org.joda.time.YearMonth yearMonth79 = yearMonth67.withPeriodAdded((org.joda.time.ReadablePeriod) period75, 32770);
        org.joda.time.YearMonth yearMonth80 = yearMonth61.minus((org.joda.time.ReadablePeriod) period75);
        boolean boolean81 = yearMonth53.isAfter((org.joda.time.ReadablePartial) yearMonth80);
        int int82 = yearMonth80.getMonthOfYear();
        boolean boolean83 = property46.equals((java.lang.Object) yearMonth80);
        org.joda.time.YearMonth yearMonth85 = property46.addToCopy(28797);
        boolean boolean86 = yearMonth22.equals((java.lang.Object) 28797);
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT0S" + "'", str37, "PT0S");
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Property[year]" + "'", str47, "Property[year]");
        org.junit.Assert.assertNotNull(yearMonth49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-292275054) + "'", int50 == (-292275054));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Property[year]" + "'", str51, "Property[year]");
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970-01" + "'", str59, "1970-01");
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(durationFieldType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(yearMonth79);
        org.junit.Assert.assertNotNull(yearMonth80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(yearMonth85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = dateTime9.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime14 = dateTime13.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = dateTime13.plusDays(21600010);
        org.joda.time.DateTime.Property property17 = dateTime13.monthOfYear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyear" + "'", str11, "weekyear");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(32772);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTime dateTime14 = localDate5.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property15 = localDate5.yearOfEra();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalDate localDate17 = property15.withMinimumValue();
        org.joda.time.LocalDate.Property property18 = localDate17.year();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate3 = localDate0.plusWeeks(32770);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone6);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTime dateTime11 = localDate8.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean16 = dateTimeZone15.isFixed();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 6);
        long long22 = dateTimeZone15.getMillisKeepLocal(dateTimeZone18, (long) 10);
        org.joda.time.DateTime dateTime23 = dateTime13.withZone(dateTimeZone18);
        org.joda.time.DateTime.Property property24 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime26 = property24.addToCopy((long) 935);
        org.joda.time.DateTime dateTime27 = property24.withMaximumValue();
        org.joda.time.DateTime dateTime28 = property24.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property30 = localDate29.yearOfCentury();
        org.joda.time.LocalDate localDate31 = property30.getLocalDate();
        org.joda.time.LocalDate localDate33 = localDate31.withYearOfEra((int) 'u');
        java.lang.String str34 = localDate31.toString();
        org.joda.time.DateTime dateTime35 = localDate31.toDateTimeAtStartOfDay();
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        java.lang.String str40 = dateTimeZone38.getName(10L);
        java.util.Locale locale44 = new java.util.Locale("70", "hi!");
        java.lang.String str45 = dateTimeZone38.getName((long) '4', locale44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(12L, dateTimeZone38);
        long long49 = dateTimeZone38.convertLocalToUTC((-31445624657L), true);
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime51 = localDate31.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((java.lang.Object) dateTime28, dateTimeZone38);
        org.joda.time.DateTime dateTime53 = localDate3.toDateTimeAtMidnight(dateTimeZone38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime55 = dateTime53.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 21600000 + "'", int20 == 21600000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2022-02-11" + "'", str34, "2022-02-11");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+06:00" + "'", str40, "+06:00");
        org.junit.Assert.assertEquals(locale44.toString(), "70_HI!");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+06:00" + "'", str45, "+06:00");
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-31467224657L) + "'", long49 == (-31467224657L));
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.toLanguageTag();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.lang.String str6 = property5.getAsText();
        java.lang.String str7 = property5.getAsString();
        org.joda.time.YearMonth yearMonth9 = property5.addWrapFieldToCopy((int) (byte) 100);
        int int10 = yearMonth9.size();
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = yearMonth13.toInterval(dateTimeZone14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonth13.getFieldTypes();
        org.joda.time.YearMonth.Property property17 = yearMonth13.year();
        java.lang.String str18 = property17.toString();
        org.joda.time.YearMonth yearMonth19 = property17.getYearMonth();
        org.joda.time.YearMonth yearMonth21 = property17.setCopy(2022);
        org.joda.time.YearMonth yearMonth23 = property17.addToCopy(4);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale24.getCountry();
        java.lang.String str26 = locale24.getDisplayCountry();
        java.util.Set<java.lang.String> strSet27 = locale24.getUnicodeLocaleKeys();
        java.lang.String str28 = property17.getAsShortText(locale24);
        java.util.Calendar.Builder builder29 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder31 = builder29.setInstant((long) 32770);
        java.util.Locale locale35 = new java.util.Locale("5 Jun 798307 11:57:00 GMT", "PT0S", "1969");
        java.util.Calendar.Builder builder36 = builder31.setLocale(locale35);
        java.lang.String str37 = locale35.getScript();
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(locale35);
        int int39 = property17.getMaximumTextLength(locale35);
        java.lang.String str40 = yearMonth9.toString("+06:00", locale35);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = yearMonth9.getValue(414088);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 414088");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970" + "'", str6, "1970");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970" + "'", str7, "1970");
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Property[year]" + "'", str18, "Property[year]");
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970" + "'", str28, "1970");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals(locale35.toString(), "5 jun 798307 11:57:00 gmt_PT0S_1969");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(calendar38);
// flaky:         org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=1644572707461,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=45,SECOND=7,MILLISECOND=461,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+06:00" + "'", str40, "+06:00");
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        java.util.Locale locale5 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean13 = dateTimeZone12.isFixed();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int17 = dateTimeZone15.getOffsetFromLocal((long) 6);
        long long19 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) 10);
        org.joda.time.Interval interval20 = localDate10.toInterval(dateTimeZone12);
        org.joda.time.DateTime dateTime21 = localDate9.toDateTimeAtMidnight(dateTimeZone12);
        long long25 = dateTimeZone12.convertLocalToUTC(11L, false, 0L);
        java.lang.String str27 = dateTimeZone12.getName((long) 238);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter7.withZone(dateTimeZone12);
        java.lang.String str29 = dateTimeZone12.getID();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 21600000 + "'", int17 == 21600000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-21599989L) + "'", long25 == (-21599989L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+06:00" + "'", str27, "+06:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+06:00" + "'", str29, "+06:00");
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfDay();
        org.joda.time.DateTime.Property property11 = dateTime7.era();
        boolean boolean13 = dateTime7.isEqual(315532802228L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.lang.String str6 = property5.toString();
        java.lang.String str7 = property5.getName();
        java.lang.String str8 = property5.getName();
        org.joda.time.YearMonth yearMonth10 = property5.addWrapFieldToCopy(52);
        org.joda.time.YearMonth yearMonth12 = property5.addToCopy(20);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = yearMonth12.getFieldTypes();
        java.lang.String str14 = yearMonth12.toString();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[year]" + "'", str6, "Property[year]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "year" + "'", str7, "year");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "year" + "'", str8, "year");
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1990-01" + "'", str14, "1990-01");
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight(dateTimeZone6);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateMidnight dateMidnight9 = dateTime7.toDateMidnight();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        long long11 = dateTime7.getMillis();
        int int12 = dateTime7.getWeekyear();
        org.joda.time.DateTime.Property property13 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property13.addWrapFieldToCopy(21597772);
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        int int17 = dateTime15.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01T00:00:00.000+06:00" + "'", str8, "1970-01-01T00:00:00.000+06:00");
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-21600000L) + "'", long11 == (-21600000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight(dateTimeZone6);
        int int8 = dateTime7.getMonthOfYear();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTime dateTime11 = dateTime7.toDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.util.Calendar.Builder builder14 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder16 = builder14.setInstant((long) 32770);
        java.util.Calendar calendar17 = builder16.build();
        boolean boolean19 = calendar17.after((java.lang.Object) (byte) 10);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.LocalDate localDate24 = localDate22.withYearOfEra((int) 'u');
        boolean boolean25 = calendar17.after((java.lang.Object) localDate22);
        boolean boolean26 = dateTimeZone10.equals((java.lang.Object) boolean25);
        java.util.Locale locale31 = new java.util.Locale("hi!", "2022-02-11", "2022-02-11");
        boolean boolean32 = locale31.hasExtensions();
        java.lang.String str33 = dateTimeZone10.getName(0L, locale31);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property35 = localDate34.yearOfCentury();
        org.joda.time.LocalDate localDate36 = property35.getLocalDate();
        org.joda.time.LocalDate localDate38 = localDate36.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property40 = localDate39.yearOfCentury();
        org.joda.time.LocalDate localDate41 = property40.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean45 = dateTimeZone44.isFixed();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = localDate41.toDateTimeAtStartOfDay(dateTimeZone44);
        org.joda.time.DateTime dateTime48 = localDate38.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.DateTime.Property property49 = dateTime48.year();
        int int50 = dateTime48.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime51 = dateTime48.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property52 = dateTime48.monthOfYear();
        org.joda.time.DateTime dateTime53 = dateTime48.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = dateTime48.withZone(dateTimeZone54);
        int int56 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime48);
        java.util.Locale.Builder builder58 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder60 = builder58.removeUnicodeLocaleAttribute("eras");
        java.util.Locale locale61 = builder60.build();
        java.util.Locale locale62 = builder60.build();
        java.util.Locale locale63 = builder60.build();
        java.lang.String str64 = dateTimeZone10.getName(94987L, locale63);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=32770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals(locale31.toString(), "hi!_2022-02-11_2022-02-11");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+06:00" + "'", str33, "+06:00");
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 6 + "'", int50 == 6);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 21600000 + "'", int56 == 21600000);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+06:00" + "'", str64, "+06:00");
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar.Builder builder6 = builder0.setWeekDate(42, (-1), 14);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate9 = property8.getLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate13 = localDate11.plusMonths(32772);
        org.joda.time.LocalDate localDate15 = localDate11.minusYears((int) (short) 10);
        org.joda.time.LocalDate.Property property16 = localDate11.weekyear();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        int int18 = property16.getMaximumTextLength(locale17);
        java.util.Calendar.Builder builder19 = builder6.setLocale(locale17);
        java.util.Calendar.Builder builder21 = builder6.setLenient(true);
        java.util.Calendar.Builder builder25 = builder21.setTimeOfDay(18, 22, 292275055);
        java.util.Calendar.Builder builder29 = builder25.setWeekDate(17724494, (int) 'a', 34940889);
        java.util.Calendar.Builder builder31 = builder25.setLenient(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate6 = localDate2.minusYears(11);
        int int7 = localDate6.getYear();
        org.joda.time.LocalDate localDate9 = localDate6.plusMonths(935);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtCurrentTime();
        java.lang.Object obj11 = null;
        boolean boolean12 = dateTime10.equals(obj11);
        java.util.GregorianCalendar gregorianCalendar13 = dateTime10.toGregorianCalendar();
        java.util.Calendar.Builder builder14 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder16 = builder14.setInstant((long) 32770);
        java.util.Calendar calendar17 = builder16.build();
        boolean boolean19 = calendar17.after((java.lang.Object) (byte) 10);
        calendar17.set(1, (int) (byte) 100, 1, (-292275054), 4);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromCalendarFields(calendar17);
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeFormatter29.getZone();
        java.util.Locale locale31 = dateTimeFormatter29.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter29.withPivotYear((int) 'a');
        org.joda.time.Chronology chronology34 = dateTimeFormatter29.getChronolgy();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property36 = localDate35.yearOfCentury();
        org.joda.time.LocalDate localDate37 = property36.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean41 = dateTimeZone40.isFixed();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = localDate37.toDateTimeAtStartOfDay(dateTimeZone40);
        org.joda.time.LocalDate localDate45 = localDate37.plusMonths((int) (short) 1);
        java.lang.String str46 = localDate45.toString();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean50 = dateTimeZone49.isFixed();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone49);
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        org.joda.time.DateTime dateTime54 = localDate51.toDateTimeAtMidnight(dateTimeZone53);
        org.joda.time.DateTime dateTime55 = localDate45.toDateTimeAtStartOfDay(dateTimeZone53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter29.withZone(dateTimeZone53);
        java.util.Locale locale57 = dateTimeFormatter56.getLocale();
        boolean boolean58 = dateTimeFormatter56.isParser();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean61 = dateTimeZone60.isFixed();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int65 = dateTimeZone63.getOffsetFromLocal((long) 6);
        long long67 = dateTimeZone60.getMillisKeepLocal(dateTimeZone63, (long) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter56.withZone(dateTimeZone63);
        org.joda.time.DateTime dateTime69 = org.joda.time.DateTime.now(dateTimeZone63);
        java.util.Locale locale71 = java.util.Locale.CHINA;
        java.lang.String str72 = dateTimeZone63.getName((long) (byte) 0, locale71);
        org.joda.time.DateMidnight dateMidnight73 = localDate26.toDateMidnight(dateTimeZone63);
        java.util.TimeZone timeZone74 = dateTimeZone63.toTimeZone();
        gregorianCalendar13.setTimeZone(timeZone74);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2011 + "'", int7 == 2011);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=-1114063134927230,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=33334,MONTH=5,WEEK_OF_YEAR=23,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=159,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=4,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNull(dateTimeZone30);
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNull(chronology34);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2022-03-11" + "'", str46, "2022-03-11");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNull(locale57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 21600000 + "'", int65 == 21600000);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 10L + "'", long67 == 10L);
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+06:00" + "'", str72, "+06:00");
        org.junit.Assert.assertNotNull(dateMidnight73);
        org.junit.Assert.assertNotNull(timeZone74);
        org.junit.Assert.assertEquals(timeZone74.getDisplayName(), "GMT+06:00");
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getVariant();
        java.util.Calendar calendar11 = dateTime8.toCalendar(locale9);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillis((long) 32772);
        org.joda.time.DateTime dateTime23 = dateTime21.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Interval interval31 = interval29.withChronology(chronology30);
        org.joda.time.Duration duration32 = interval29.toDuration();
        org.joda.time.DateTime dateTime33 = dateTime25.plus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration32);
        org.joda.time.format.DateTimePrinter dateTimePrinter35 = null;
        org.joda.time.format.DateTimeParser dateTimeParser36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter35, dateTimeParser36);
        org.joda.time.Chronology chronology38 = dateTimeFormatter37.getChronology();
        boolean boolean39 = dateTimeFormatter37.isParser();
        java.util.Locale locale40 = dateTimeFormatter37.getLocale();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean44 = dateTimeZone43.isFixed();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone43);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.DateTime dateTime48 = localDate45.toDateTimeAtCurrentTime(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.withMillis((long) 32772);
        org.joda.time.DateTime dateTime52 = dateTime50.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime54 = dateTime50.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology55 = dateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.weekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter37.withChronology(chronology55);
        org.joda.time.Chronology chronology58 = dateTimeFormatter57.getChronolgy();
        java.util.Locale locale61 = new java.util.Locale("3 Apr 1918 23:38:59 GMT", "1 Jan 1970 00:00:00 GMT");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter57.withLocale(locale61);
        boolean boolean63 = interval34.equals((java.lang.Object) dateTimeFormatter62);
        boolean boolean64 = dateTimeFormatter62.isPrinter();
        java.util.Locale locale65 = dateTimeFormatter62.getLocale();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1644516000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(locale40);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertEquals(locale61.toString(), "3 apr 1918 23:38:59 gmt_1 JAN 1970 00:00:00 GMT");
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "3 apr 1918 23:38:59 gmt_1 JAN 1970 00:00:00 GMT");
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone7);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 32772);
        org.joda.time.DateTime dateTime16 = dateTime14.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime18 = dateTime14.minusSeconds((int) (short) -1);
        boolean boolean19 = localDate2.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getRangeDurationType();
        int int22 = localDate2.indexOf(dateTimeFieldType20);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfCentury();
        org.joda.time.LocalDate.Property property25 = localDate23.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property25.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate28 = property25.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTime dateTime36 = localDate33.toDateTimeAtMidnight(dateTimeZone35);
        int int37 = dateTime36.getMonthOfYear();
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = localDate28.toDateTimeAtStartOfDay(dateTimeZone39);
        java.util.Locale locale47 = new java.util.Locale("weekOfWeekyear", "1969-12", "");
        java.lang.String str48 = locale47.getCountry();
        java.util.Locale locale50 = new java.util.Locale("");
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property52 = localDate51.yearOfCentury();
        org.joda.time.LocalDate.Property property53 = localDate51.yearOfCentury();
        org.joda.time.LocalDate localDate55 = property53.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField56 = property53.getField();
        int int58 = dateTimeField56.get((long) 'u');
        java.util.Locale locale60 = java.util.Locale.TAIWAN;
        java.lang.String str61 = dateTimeField56.getAsText((long) 5, locale60);
        java.lang.String str62 = locale50.getDisplayVariant(locale60);
        java.lang.String str63 = locale60.getDisplayLanguage();
        java.lang.String str64 = locale47.getDisplayName(locale60);
        java.lang.String str65 = dateTimeZone39.getName((long) (short) 10, locale47);
        org.joda.time.DateTime dateTime66 = localDate2.toDateTimeAtMidnight(dateTimeZone39);
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property69 = localDate68.yearOfCentury();
        org.joda.time.LocalDate localDate70 = property69.getLocalDate();
        java.lang.String str71 = property69.getName();
        long long72 = property69.remainder();
        int int73 = property69.getMinimumValue();
        org.joda.time.LocalDate localDate74 = property69.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property69.getFieldType();
        java.util.Locale locale76 = java.util.Locale.FRANCE;
        java.lang.String str77 = locale76.getCountry();
        java.util.Locale locale78 = locale76.stripExtensions();
        int int79 = property69.getMaximumTextLength(locale76);
        java.lang.String str80 = locale76.getDisplayName();
        java.lang.String str81 = dateTimeZone39.getName((-1836000000L), locale76);
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(locale76);
        java.lang.String str83 = locale76.getISO3Country();
        java.lang.String str84 = locale76.getVariant();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertEquals(locale47.toString(), "weekofweekyear_1969-12");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1969-12" + "'", str48, "1969-12");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 70 + "'", int58 == 70);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "70" + "'", str61, "70");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Chinese" + "'", str63, "Chinese");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "weekofweekyear (1969-12)" + "'", str64, "weekofweekyear (1969-12)");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+06:00" + "'", str65, "+06:00");
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "yearOfCentury" + "'", str71, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 3542400000L + "'", long72 == 3542400000L);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(localDate74);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "FR" + "'", str77, "FR");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "French (France)" + "'", str80, "French (France)");
// flaky:         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "+06:00" + "'", str81, "+06:00");
        org.junit.Assert.assertNotNull(calendar82);
// flaky:         org.junit.Assert.assertEquals(calendar82.toString(), "java.util.GregorianCalendar[time=1644572707648,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=45,SECOND=7,MILLISECOND=648,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "FRA" + "'", str83, "FRA");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean4 = dateTimeZone3.isFixed();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone3);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillis((long) 32772);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime14 = dateTime10.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology15 = dateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.era();
        org.joda.time.DurationField durationField18 = chronology15.millis();
        org.joda.time.DurationField durationField19 = chronology15.millis();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = chronology15.minuteOfHour();
        boolean boolean22 = durationFieldType0.isSupported(chronology15);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.DateTime dateTime31 = localDate28.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withMillis((long) 32772);
        org.joda.time.DateTime dateTime35 = dateTime33.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Interval interval43 = interval41.withChronology(chronology42);
        org.joda.time.Duration duration44 = interval41.toDuration();
        org.joda.time.DateTime dateTime45 = dateTime37.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property47 = localDate46.yearOfCentury();
        org.joda.time.LocalDate localDate48 = property47.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean52 = dateTimeZone51.isFixed();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone51);
        org.joda.time.DateTime dateTime54 = localDate48.toDateTimeAtStartOfDay(dateTimeZone51);
        org.joda.time.DateTime dateTime55 = dateTime45.withZoneRetainFields(dateTimeZone51);
        boolean boolean56 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Instant instant57 = dateTime22.toInstant();
        long long58 = instant57.getMillis();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyear" + "'", str11, "weekyear");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(instant57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1644516000000L + "'", long58 == 1644516000000L);
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = yearMonth2.toInterval(dateTimeZone3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Interval interval6 = interval4.withPeriodAfterStart(readablePeriod5);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = interval6.toPeriod(periodType7);
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = yearMonth10.toInterval(dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.Interval interval14 = interval12.withPeriodAfterStart(readablePeriod13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = interval14.toPeriod(periodType15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean18 = period16.isSupported(durationFieldType17);
        int int19 = period8.get(durationFieldType17);
        int int20 = period8.size();
        org.joda.time.YearMonth yearMonth22 = yearMonth0.withPeriodAdded((org.joda.time.ReadablePeriod) period8, 9);
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Interval interval26 = yearMonth24.toInterval(dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.Interval interval28 = interval26.withPeriodAfterStart(readablePeriod27);
        org.joda.time.Interval interval30 = interval26.withStartMillis((long) 32772);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.minuteOfDay();
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.Interval interval36 = yearMonth34.toInterval(dateTimeZone35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.Interval interval38 = interval36.withPeriodAfterStart(readablePeriod37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = interval38.toPeriod(periodType39);
        java.lang.String str41 = period40.toString();
        java.util.Date date48 = new java.util.Date((int) (byte) 10, (int) (short) 1, (int) (byte) 10, (int) (byte) 10, 0, (int) (byte) 1);
        int int49 = date48.getDay();
        boolean boolean50 = period40.equals((java.lang.Object) date48);
        long long53 = chronology31.add((org.joda.time.ReadablePeriod) period40, 64800000L, (int) 'x');
        org.joda.time.YearMonth yearMonth54 = yearMonth22.minus((org.joda.time.ReadablePeriod) period40);
        org.joda.time.MutablePeriod mutablePeriod55 = period40.toMutablePeriod();
        org.joda.time.Period period56 = period40.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int58 = period56.getValue(2579938);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2579938");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PT0S" + "'", str41, "PT0S");
        org.junit.Assert.assertEquals(date48.toString(), "Thu Feb 10 10:00:01 UTC 1910");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 64800000L + "'", long53 == 64800000L);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertNotNull(mutablePeriod55);
        org.junit.Assert.assertNotNull(period56);
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.DateTime dateTime12 = localDate2.toDateTimeAtStartOfDay();
        int int13 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property14 = localDate2.weekyear();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTime dateTime24 = localDate21.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withMillis((long) 32772);
        org.joda.time.DateTime dateTime28 = dateTime26.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime30 = dateTime26.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(obj16, chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.secondOfDay();
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now(chronology31);
        org.joda.time.DateTimeField dateTimeField36 = chronology31.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField37 = chronology31.minuteOfHour();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfCentury();
        org.joda.time.LocalDate.Property property40 = localDate38.yearOfCentury();
        org.joda.time.LocalDate localDate42 = property40.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField43 = property40.getField();
        long long46 = dateTimeField43.addWrapField((long) 2, (int) (byte) 10);
        org.joda.time.ReadablePartial readablePartial47 = null;
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = dateTimeField43.getAsShortText(readablePartial47, 0, locale50);
        java.lang.String str52 = locale50.getLanguage();
        int int53 = dateTimeField37.getMaximumShortTextLength(locale50);
        java.lang.String str54 = property14.getAsShortText(locale50);
        java.lang.String str55 = locale50.getDisplayName();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22 + "'", int13 == 22);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 315532800002L + "'", long46 == 315532800002L);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0" + "'", str51, "0");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2022" + "'", str54, "2022");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        java.util.Calendar.Builder builder7 = builder2.setWeekDate((int) (short) 0, 32772, (-292275054));
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.lang.String str9 = locale8.getCountry();
        java.lang.String str10 = locale8.getDisplayCountry();
        java.util.Calendar.Builder builder11 = builder2.setLocale(locale8);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property13 = localDate12.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime20.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str23 = dateTimeFieldType22.getName();
        org.joda.time.DateTime.Property property24 = dateTime21.property(dateTimeFieldType22);
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.DateTimeField dateTimeField26 = property24.getField();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property28 = localDate27.yearOfCentury();
        org.joda.time.LocalDate.Property property29 = localDate27.yearOfCentury();
        org.joda.time.LocalDate localDate31 = property29.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField32 = property29.getField();
        int int34 = dateTimeField32.get((long) 'u');
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.lang.String str37 = dateTimeField32.getAsText((long) 5, locale36);
        int int38 = property24.getMaximumTextLength(locale36);
        java.util.Calendar.Builder builder39 = builder2.setLocale(locale36);
        java.util.Calendar.Builder builder40 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder42 = builder40.setInstant((long) 32770);
        java.util.Calendar calendar43 = builder42.build();
        boolean boolean45 = calendar43.after((java.lang.Object) 70);
        calendar43.set(10, 32772, (int) (byte) 1, 22, 0);
        long long52 = calendar43.getTimeInMillis();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property54 = localDate53.yearOfCentury();
        org.joda.time.LocalDate localDate55 = property54.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean59 = dateTimeZone58.isFixed();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone58);
        org.joda.time.DateTime dateTime61 = localDate55.toDateTimeAtStartOfDay(dateTimeZone58);
        org.joda.time.DateTime dateTime62 = dateTime61.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str64 = dateTimeFieldType63.getName();
        org.joda.time.DateTime.Property property65 = dateTime62.property(dateTimeFieldType63);
        org.joda.time.DateTime dateTime66 = property65.roundFloorCopy();
        org.joda.time.DateTime.Property property67 = dateTime66.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime66.getZone();
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        calendar43.setTimeZone(timeZone69);
        java.util.Locale locale71 = java.util.Locale.FRENCH;
        java.lang.String str72 = locale71.toLanguageTag();
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(timeZone69, locale71);
        java.util.Calendar.Builder builder74 = builder39.setTimeZone(timeZone69);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forTimeZone(timeZone69);
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(timeZone69);
        java.util.TimeZone timeZone77 = calendar76.getTimeZone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=32770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "weekyear" + "'", str23, "weekyear");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 70 + "'", int34 == 70);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "70" + "'", str37, "70");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(calendar43);
        org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=24332133632770,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2741,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=20,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 24332133632770L + "'", long52 == 24332133632770L);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "weekyear" + "'", str64, "weekyear");
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(timeZone69);
        org.junit.Assert.assertEquals(timeZone69.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "fr" + "'", str72, "fr");
        org.junit.Assert.assertNotNull(calendar73);
// flaky:         org.junit.Assert.assertEquals(calendar73.toString(), "java.util.GregorianCalendar[time=1644572707800,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=45,SECOND=7,MILLISECOND=800,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertNotNull(calendar76);
// flaky:         org.junit.Assert.assertEquals(calendar76.toString(), "java.util.GregorianCalendar[time=1644572707800,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=45,SECOND=7,MILLISECOND=800,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone77);
        org.junit.Assert.assertEquals(timeZone77.getDisplayName(), "GMT+06:00");
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property23 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime26 = dateTime9.minusDays(32772);
        org.joda.time.DateTime.Property property27 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime28 = property27.roundHalfEvenCopy();
        int int29 = dateTime28.getHourOfDay();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "weekyear" + "'", str22, "weekyear");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate4 = property2.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str5 = property2.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        org.joda.time.DateTimeField dateTimeField7 = property2.getField();
        org.joda.time.LocalDate localDate8 = property2.roundFloorCopy();
        org.joda.time.LocalDate localDate9 = property2.getLocalDate();
        org.joda.time.LocalDate localDate10 = property2.roundFloorCopy();
        org.joda.time.LocalDate localDate11 = property2.getLocalDate();
        int int12 = property2.get();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "22" + "'", str5, "22");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) (short) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = yearMonth8.toInterval(dateTimeZone9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = yearMonth8.getFieldTypes();
        org.joda.time.YearMonth.Property property12 = yearMonth8.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = yearMonth8.toString(dateTimeFormatter13);
        int int15 = property5.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property5.getFieldType();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970" + "'", str6, "1970");
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01" + "'", str14, "1970-01");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property23 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        int int25 = dateTime20.getHourOfDay();
        boolean boolean26 = dateTime20.isBeforeNow();
        org.joda.time.YearMonthDay yearMonthDay27 = dateTime20.toYearMonthDay();
        org.joda.time.DateTime dateTime29 = dateTime20.withYear(34530606);
        boolean boolean30 = dateTime29.isAfterNow();
        org.joda.time.DateTime dateTime32 = dateTime29.minusDays(292278994);
        org.joda.time.DateTime dateTime33 = dateTime29.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property35 = localDate34.yearOfCentury();
        org.joda.time.LocalDate localDate36 = property35.getLocalDate();
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = property35.getDifference(readableInstant37);
        org.joda.time.LocalDate localDate39 = property35.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean43 = dateTimeZone42.isFixed();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone42);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.DateTime dateTime47 = localDate44.toDateTimeAtCurrentTime(dateTimeZone46);
        boolean boolean48 = localDate39.equals((java.lang.Object) dateTime47);
        org.joda.time.DateTime dateTime50 = dateTime47.minusDays(70);
        org.joda.time.DateTime dateTime52 = dateTime47.plus((long) 57);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.Interval interval56 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Interval interval58 = interval56.withChronology(chronology57);
        boolean boolean60 = interval56.isAfter(10L);
        boolean boolean62 = interval56.isAfter(24332133632770L);
        long long63 = interval56.getStartMillis();
        org.joda.time.Duration duration64 = interval56.toDuration();
        org.joda.time.DateTime dateTime66 = dateTime47.withDurationAdded((org.joda.time.ReadableDuration) duration64, 2848);
        org.joda.time.DateTime dateTime67 = dateTime33.minus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean71 = dateTimeZone70.isFixed();
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone70);
        java.util.TimeZone timeZone73 = null;
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        org.joda.time.DateTime dateTime75 = localDate72.toDateTimeAtCurrentTime(dateTimeZone74);
        org.joda.time.DateTime dateTime77 = dateTime75.withMillis((long) 32772);
        org.joda.time.DateTime dateTime79 = dateTime77.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property80 = dateTime77.millisOfDay();
        org.joda.time.DateTime dateTime82 = property80.addToCopy((long) 69);
        int int83 = dateTime67.compareTo((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.Chronology chronology84 = dateTime82.getChronology();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "weekyear" + "'", str22, "weekyear");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(chronology84);
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth yearMonth6 = yearMonth1.withYear((int) (short) 100);
        int[] intArray7 = yearMonth1.getValues();
        org.joda.time.YearMonth.Property property8 = yearMonth1.monthOfYear();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1970, 1]");
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        java.util.Date date6 = new java.util.Date((-40176), (-3599), 0, 2741, 0, (int) (byte) 1);
        java.time.Instant instant7 = date6.toInstant();
        java.util.Date date8 = java.util.Date.from(instant7);
        java.lang.String str9 = date8.toString();
        org.junit.Assert.assertEquals(date6.toString(), "Thu May 24 05:00:01 UTC 38577");
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu May 24 05:00:01 UTC 38577");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Thu May 24 05:00:01 UTC 38577" + "'", str9, "Thu May 24 05:00:01 UTC 38577");
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        java.util.Locale locale8 = new java.util.Locale("70", "hi!");
        int int9 = property1.getMaximumShortTextLength(locale8);
        org.joda.time.LocalDate localDate10 = property1.withMaximumValue();
        org.joda.time.LocalDate localDate11 = property1.withMaximumValue();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 32772);
        int int14 = localDate13.getDayOfYear();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate17 = localDate13.withFieldAdded(durationFieldType15, 42);
        org.joda.time.LocalDate localDate19 = localDate11.withFieldAdded(durationFieldType15, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(57);
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.DateTime dateTime23 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        int int24 = localDate19.getDayOfYear();
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertEquals(locale8.toString(), "70_HI!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42 + "'", int24 == 42);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.era();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType0.getField(chronology4);
        org.joda.time.DurationField durationField8 = chronology4.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.monthOfYear();
        java.lang.String str10 = chronology4.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology4.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology4.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[UTC]" + "'", str10, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getCountry();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = dateTime13.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str16 = dateTimeFieldType15.getName();
        org.joda.time.DateTime.Property property17 = dateTime14.property(dateTimeFieldType15);
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        long long22 = dateTimeField19.add((long) (byte) 10, (-1));
        long long25 = dateTimeField19.addWrapField(0L, (int) (short) 10);
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.lang.String str28 = dateTimeField19.getAsShortText(70, locale27);
        java.lang.String str29 = dateTimeZone3.getShortName(1L, locale27);
        java.lang.String str30 = locale0.getDisplayLanguage(locale27);
        java.lang.String str31 = locale27.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR" + "'", str1, "FR");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "weekyear" + "'", str16, "weekyear");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-31449599990L) + "'", long22 == (-31449599990L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 315705600000L + "'", long25 == 315705600000L);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "70" + "'", str28, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+06:00" + "'", str29, "+06:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fran\347ais" + "'", str30, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "French" + "'", str31, "French");
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.lang.String str6 = property5.toString();
        org.joda.time.YearMonth yearMonth7 = property5.getYearMonth();
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = locale8.getScript();
        java.lang.String str10 = property5.getAsText(locale8);
        org.joda.time.YearMonth yearMonth12 = property5.setCopy(12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = yearMonth12.getFieldTypes();
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = yearMonth15.toInterval(dateTimeZone16);
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Interval interval21 = yearMonth19.toInterval(dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.Interval interval23 = interval21.withPeriodAfterStart(readablePeriod22);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = interval23.toPeriod(periodType24);
        org.joda.time.YearMonth yearMonth26 = yearMonth15.plus((org.joda.time.ReadablePeriod) period25);
        java.lang.String str27 = period25.toString();
        org.joda.time.YearMonth yearMonth28 = yearMonth12.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.ReadablePartial readablePartial29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = yearMonth12.isEqual(readablePartial29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[year]" + "'", str6, "Property[year]");
        org.junit.Assert.assertNotNull(yearMonth7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970" + "'", str10, "1970");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT0S" + "'", str27, "PT0S");
        org.junit.Assert.assertNotNull(yearMonth28);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        java.lang.String str3 = localDate1.toString();
        org.joda.time.LocalDate localDate5 = localDate1.minusYears(0);
        org.joda.time.LocalDate.Property property6 = localDate1.year();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean10 = dateTimeZone9.isFixed();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.minutes();
        boolean boolean13 = localDate11.isSupported(durationFieldType12);
        org.joda.time.LocalDate.Property property14 = localDate11.centuryOfEra();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        long long24 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime.Property property25 = dateTime23.secondOfMinute();
        org.joda.time.DateTime dateTime27 = property25.addWrapFieldToCopy((int) (short) 0);
        org.joda.time.DateTime dateTime28 = dateTime27.toDateTimeISO();
        int int29 = dateTime28.getEra();
        long long30 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime35 = dateTime28.withTime(17025, 68876, 412, 56433);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17025 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-52L) + "'", long30 == (-52L));
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = property7.getDifference(readableInstant9);
        org.joda.time.LocalDate localDate11 = property7.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtCurrentTime(dateTimeZone18);
        boolean boolean20 = localDate11.equals((java.lang.Object) dateTime19);
        java.util.Date date21 = localDate11.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getRangeDurationType();
        boolean boolean24 = localDate11.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property31 = localDate30.yearOfCentury();
        org.joda.time.LocalDate localDate32 = property31.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean36 = dateTimeZone35.isFixed();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = localDate32.toDateTimeAtStartOfDay(dateTimeZone35);
        org.joda.time.DateTime dateTime39 = localDate29.toDateTimeAtMidnight(dateTimeZone35);
        org.joda.time.LocalDate localDate41 = localDate29.minusYears(10);
        boolean boolean42 = localDate11.isAfter((org.joda.time.ReadablePartial) localDate41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate45 = localDate41.withFieldAdded(durationFieldType43, 70);
        java.lang.String str46 = durationFieldType43.toString();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property48 = localDate47.yearOfCentury();
        org.joda.time.LocalDate localDate49 = property48.getLocalDate();
        org.joda.time.ReadableInstant readableInstant50 = null;
        int int51 = property48.getDifference(readableInstant50);
        org.joda.time.LocalDate localDate52 = property48.withMaximumValue();
        org.joda.time.Chronology chronology53 = localDate52.getChronology();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate(chronology53);
        org.joda.time.Chronology chronology55 = chronology53.withUTC();
        org.joda.time.DurationField durationField56 = chronology53.seconds();
        boolean boolean57 = durationFieldType43.isSupported(chronology53);
        org.joda.time.DurationField durationField58 = chronology53.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(108, (-2740), 108, 107, 92, 117617, chronology53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 107 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Feb 11 00:00:00 UTC 2099");
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "weeks" + "'", str46, "weeks");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(durationField58);
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar.Builder builder6 = builder0.setWeekDate(42, (-1), 14);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate9 = property8.getLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate13 = localDate11.plusMonths(32772);
        org.joda.time.LocalDate localDate15 = localDate11.minusYears((int) (short) 10);
        org.joda.time.LocalDate.Property property16 = localDate11.weekyear();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        int int18 = property16.getMaximumTextLength(locale17);
        java.util.Calendar.Builder builder19 = builder6.setLocale(locale17);
        java.util.Calendar.Builder builder21 = builder6.setLenient(true);
        java.util.Calendar.Builder builder25 = builder6.setDate((int) (short) 10, 56305647, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean29 = dateTimeZone28.isFixed();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.minutes();
        boolean boolean32 = localDate30.isSupported(durationFieldType31);
        org.joda.time.LocalDate localDate34 = localDate30.minusDays(57);
        int[] intArray35 = localDate30.getValues();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder36 = builder6.setFields(intArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1970, 1, 1]");
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getVariant();
        java.util.Calendar calendar11 = dateTime8.toCalendar(locale9);
        boolean boolean12 = dateTime8.isEqualNow();
        java.lang.String str13 = dateTime8.toString();
        int int14 = dateTime8.getHourOfDay();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = property16.getDifference(readableInstant18);
        org.joda.time.LocalDate localDate20 = property16.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone23);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime28 = localDate25.toDateTimeAtCurrentTime(dateTimeZone27);
        boolean boolean29 = localDate20.equals((java.lang.Object) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate20.toDateTimeAtMidnight(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime31.toDateTime();
        int int33 = dateTime31.getYear();
        org.joda.time.LocalDate localDate34 = dateTime31.toLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str36 = dateTimeFieldType35.getName();
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfCentury();
        org.joda.time.LocalDate.Property property40 = localDate38.yearOfCentury();
        org.joda.time.LocalDate localDate42 = property40.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate43 = property40.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology44 = localDate43.getChronology();
        boolean boolean45 = durationFieldType37.isSupported(chronology44);
        boolean boolean46 = dateTimeFieldType35.isSupported(chronology44);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology50 = localDate49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.secondOfMinute();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology50);
        org.joda.time.DurationField durationField53 = durationFieldType47.getField(chronology50);
        org.joda.time.DurationField durationField54 = chronology50.millis();
        boolean boolean55 = dateTimeFieldType35.isSupported(chronology50);
        boolean boolean56 = localDate34.isSupported(dateTimeFieldType35);
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType35.getRangeDurationType();
        int int58 = dateTime8.get(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1644516000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-11T00:00:00.000+06:00" + "'", str13, "2022-02-11T00:00:00.000+06:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2099 + "'", int33 == 2099);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "weekyear" + "'", str36, "weekyear");
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(durationFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2022 + "'", int58 == 2022);
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone8);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTime dateTime13 = localDate10.toDateTimeAtCurrentTime(dateTimeZone12);
        boolean boolean14 = localDate5.equals((java.lang.Object) dateTime13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime16.toDateTime();
        int int18 = dateTime16.getYear();
        org.joda.time.DateTime.Property property19 = dateTime16.weekOfWeekyear();
        boolean boolean21 = dateTime16.isAfter((long) (-7));
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property23 = localDate22.yearOfCentury();
        org.joda.time.LocalDate localDate24 = property23.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDate24.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime30.toMutableDateTime();
        org.joda.time.Chronology chronology32 = dateTime30.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.monthOfYear();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property36 = localDate35.yearOfCentury();
        org.joda.time.LocalDate localDate37 = property36.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean41 = dateTimeZone40.isFixed();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = localDate37.toDateTimeAtStartOfDay(dateTimeZone40);
        org.joda.time.DateTime dateTime44 = dateTime43.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str46 = dateTimeFieldType45.getName();
        org.joda.time.DateTime.Property property47 = dateTime44.property(dateTimeFieldType45);
        org.joda.time.DateTime dateTime48 = property47.roundFloorCopy();
        org.joda.time.DateTime.Property property49 = dateTime48.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime48.getZone();
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        org.joda.time.Chronology chronology52 = chronology32.withZone(dateTimeZone50);
        org.joda.time.LocalDate localDate53 = org.joda.time.LocalDate.now(chronology32);
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = dateTimeField55.getType();
        org.joda.time.DateTime dateTime58 = dateTime16.withField(dateTimeFieldType56, 56192);
        org.joda.time.DateTime dateTime59 = dateTime16.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2099 + "'", int18 == 2099);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "weekyear" + "'", str46, "weekyear");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = yearMonth2.toInterval(dateTimeZone3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = yearMonth2.getFieldTypes();
        org.joda.time.YearMonth.Property property6 = yearMonth2.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = yearMonth2.toString(dateTimeFormatter7);
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = yearMonth10.toInterval(dateTimeZone11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = yearMonth10.getFieldTypes();
        org.joda.time.YearMonth.Property property14 = yearMonth10.year();
        org.joda.time.YearMonth yearMonth16 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Interval interval20 = yearMonth18.toInterval(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.Interval interval22 = interval20.withPeriodAfterStart(readablePeriod21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = interval22.toPeriod(periodType23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean26 = period24.isSupported(durationFieldType25);
        org.joda.time.YearMonth yearMonth28 = yearMonth16.withPeriodAdded((org.joda.time.ReadablePeriod) period24, 32770);
        org.joda.time.YearMonth yearMonth29 = yearMonth10.minus((org.joda.time.ReadablePeriod) period24);
        boolean boolean30 = yearMonth2.isAfter((org.joda.time.ReadablePartial) yearMonth29);
        org.joda.time.Chronology chronology31 = yearMonth29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.monthOfYear();
        org.joda.time.DurationField durationField34 = chronology31.hours();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.yearOfEra();
        org.joda.time.DateTimeField dateTimeField36 = chronology31.halfdayOfDay();
        org.joda.time.YearMonth yearMonth37 = new org.joda.time.YearMonth(536457602112L, chronology31);
        org.joda.time.YearMonth yearMonth39 = yearMonth37.plusYears(772);
        org.joda.time.YearMonth yearMonth41 = yearMonth39.minusYears(829749);
        org.joda.time.YearMonth yearMonth43 = yearMonth39.plusMonths(86399);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType45 = yearMonth43.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01" + "'", str8, "1970-01");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertNotNull(yearMonth43);
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.lang.String str6 = property5.toString();
        java.lang.String str7 = property5.getName();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = locale8.getScript();
        java.lang.String str10 = locale8.getDisplayName();
        java.util.Locale.setDefault(locale8);
        java.lang.String str12 = property5.getAsShortText(locale8);
        java.lang.Object obj13 = null;
        boolean boolean14 = property5.equals(obj13);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[year]" + "'", str6, "Property[year]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "year" + "'", str7, "year");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English (Canada)" + "'", str10, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970" + "'", str12, "1970");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("DateTimeField[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: DateTimeField[yearOfCentury]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) 34529746);
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getCountry();
        java.util.Locale locale8 = locale6.stripExtensions();
        int int9 = property5.getMaximumTextLength(locale8);
        java.lang.String str10 = property5.getAsText();
        java.lang.String str11 = property5.getAsShortText();
        org.joda.time.YearMonth yearMonth13 = property5.setCopy(0);
        org.joda.time.DateTimeField dateTimeField14 = property5.getField();
        org.joda.time.YearMonth yearMonth16 = property5.setCopy(412);
        org.joda.time.YearMonth yearMonth17 = property5.getYearMonth();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970" + "'", str10, "1970");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970" + "'", str11, "1970");
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(yearMonth17);
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        java.lang.String str1 = durationFieldType0.getName();
        java.lang.String str2 = durationFieldType0.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "days" + "'", str1, "days");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "days" + "'", str2, "days");
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        int int15 = property14.getMaximumValueOverall();
        org.joda.time.DateTime dateTime16 = property14.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime16.withMonthOfYear(13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyear" + "'", str11, "weekyear");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Locale locale6 = new java.util.Locale("5 Jun 798307 11:57:00 GMT", "PT0S", "1969");
        java.util.Calendar.Builder builder7 = builder2.setLocale(locale6);
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale9.getScript();
        java.util.Calendar.Builder builder12 = builder2.setLocale(locale9);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DateTime.Property property25 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTime dateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder30 = builder2.setTimeZone(timeZone29);
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale31.getCountry();
        java.util.Calendar.Builder builder33 = builder30.setLocale(locale31);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals(locale6.toString(), "5 jun 798307 11:57:00 gmt_PT0S_1969");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "weekyear" + "'", str24, "weekyear");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "CA" + "'", str32, "CA");
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        java.lang.String str3 = localDate1.toString();
        org.joda.time.LocalDate localDate5 = localDate1.minusYears(0);
        org.joda.time.LocalDate.Property property6 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfCentury();
        org.joda.time.LocalDate.Property property9 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property9.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str12 = property9.getAsString();
        org.joda.time.LocalDate localDate13 = property9.roundHalfCeilingCopy();
        java.lang.String str14 = property9.getAsText();
        org.joda.time.LocalDate localDate16 = property9.addWrapFieldToCopy(796407);
        java.lang.String str17 = localDate16.toString();
        int int18 = localDate5.compareTo((org.joda.time.ReadablePartial) localDate16);
        int int19 = localDate5.getDayOfYear();
        org.joda.time.LocalDate localDate21 = localDate5.plusYears(693);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.monthOfYear();
        org.joda.time.DurationField durationField27 = chronology24.days();
        org.joda.time.DateTimeField dateTimeField28 = chronology24.halfdayOfDay();
        org.joda.time.DurationField durationField29 = chronology24.days();
        boolean boolean30 = localDate21.equals((java.lang.Object) chronology24);
        org.joda.time.DateTimeField dateTimeField31 = chronology24.centuryOfEra();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22" + "'", str12, "22");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "22" + "'", str14, "22");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2029-02-11" + "'", str17, "2029-02-11");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        java.util.Locale locale5 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = dateTimeFormatter6.getLocale();
        java.util.Locale locale8 = dateTimeFormatter6.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withPivotYear(59);
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter10.getParser();
        java.lang.Appendable appendable12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.LocalDate localDate23 = localDate15.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property24 = localDate23.dayOfWeek();
        org.joda.time.LocalDate localDate26 = property24.addToCopy(10);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str30 = dateTimeZone28.getName(10L);
        java.util.Locale locale34 = new java.util.Locale("70", "hi!");
        java.lang.String str35 = dateTimeZone28.getName((long) '4', locale34);
        org.joda.time.Interval interval36 = localDate26.toInterval(dateTimeZone28);
        org.joda.time.LocalDate localDate38 = localDate26.plusDays(19);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property40 = localDate39.yearOfCentury();
        org.joda.time.LocalDate localDate41 = property40.getLocalDate();
        org.joda.time.LocalDate localDate43 = localDate41.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property45 = localDate44.yearOfCentury();
        org.joda.time.LocalDate localDate46 = property45.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean50 = dateTimeZone49.isFixed();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone49);
        org.joda.time.DateTime dateTime52 = localDate46.toDateTimeAtStartOfDay(dateTimeZone49);
        org.joda.time.DateTime dateTime53 = localDate43.toDateTimeAtMidnight(dateTimeZone49);
        org.joda.time.LocalDate localDate55 = localDate43.minusYears(10);
        org.joda.time.DateTime dateTime56 = localDate43.toDateTimeAtStartOfDay();
        int int57 = localDate38.compareTo((org.joda.time.ReadablePartial) localDate43);
        org.joda.time.Chronology chronology58 = localDate43.getChronology();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property60 = localDate59.yearOfCentury();
        org.joda.time.LocalDate localDate61 = property60.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean65 = dateTimeZone64.isFixed();
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone64);
        org.joda.time.DateTime dateTime67 = localDate61.toDateTimeAtStartOfDay(dateTimeZone64);
        org.joda.time.DateTime dateTime68 = dateTime67.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str70 = dateTimeFieldType69.getName();
        org.joda.time.DateTime.Property property71 = dateTime68.property(dateTimeFieldType69);
        org.joda.time.DateTime dateTime72 = property71.roundFloorCopy();
        org.joda.time.DateTime.Property property73 = dateTime72.year();
        org.joda.time.DateTime dateTime75 = property73.addToCopy(42);
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property77 = localDate76.yearOfCentury();
        org.joda.time.LocalDate localDate78 = property77.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean82 = dateTimeZone81.isFixed();
        org.joda.time.LocalDate localDate83 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone81);
        org.joda.time.DateTime dateTime84 = localDate78.toDateTimeAtStartOfDay(dateTimeZone81);
        org.joda.time.DateTime dateTime85 = dateTime84.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str87 = dateTimeFieldType86.getName();
        org.joda.time.DateTime.Property property88 = dateTime85.property(dateTimeFieldType86);
        boolean boolean90 = dateTime85.equals((java.lang.Object) 'u');
        boolean boolean91 = dateTime75.isBefore((org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property93 = dateTime75.property(dateTimeFieldType92);
        org.joda.time.DurationFieldType durationFieldType94 = dateTimeFieldType92.getDurationType();
        int int95 = localDate43.get(dateTimeFieldType92);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable12, (org.joda.time.ReadablePartial) localDate43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+06:00" + "'", str30, "+06:00");
        org.junit.Assert.assertEquals(locale34.toString(), "70_HI!");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+06:00" + "'", str35, "+06:00");
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "weekyear" + "'", str70, "weekyear");
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(localDate78);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTimeFieldType86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "weekyear" + "'", str87, "weekyear");
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType92);
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertNotNull(durationFieldType94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 4 + "'", int95 == 4);
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(2022);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean16 = dateTimeZone15.isFixed();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.DateTime dateTime19 = dateTime18.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property20 = dateTime19.year();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = dateTime29.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str32 = dateTimeFieldType31.getName();
        org.joda.time.DateTime.Property property33 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime36 = dateTime19.minusDays(32772);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone39);
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.DateTime dateTime44 = localDate41.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withMillis((long) 32772);
        org.joda.time.DateTime dateTime48 = dateTime46.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime50 = dateTime48.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.Interval interval54 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Interval interval56 = interval54.withChronology(chronology55);
        org.joda.time.Duration duration57 = interval54.toDuration();
        org.joda.time.DateTime dateTime58 = dateTime50.plus((org.joda.time.ReadableDuration) duration57);
        org.joda.time.DateTime dateTime60 = dateTime19.withDurationAdded((org.joda.time.ReadableDuration) duration57, (int) 'u');
        org.joda.time.DateTime dateTime62 = dateTime9.withDurationAdded((org.joda.time.ReadableDuration) duration57, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean66 = dateTimeZone65.isFixed();
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone65);
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        org.joda.time.DateTime dateTime70 = localDate67.toDateTimeAtCurrentTime(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = dateTime70.minusYears(2022);
        int int73 = dateTime72.getCenturyOfEra();
        org.joda.time.Interval interval74 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration57, (org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime dateTime76 = dateTime72.withYear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime72.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "weekyear" + "'", str32, "weekyear");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTimeZone77);
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.Interval interval5 = interval3.withPeriodAfterStart(readablePeriod4);
        org.joda.time.MutableInterval mutableInterval6 = interval5.toMutableInterval();
        boolean boolean8 = mutableInterval6.isAfter(1L);
        boolean boolean10 = mutableInterval6.isAfter((long) 57);
        org.joda.time.DateTime dateTime11 = mutableInterval6.getStart();
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays(939);
        int int14 = dateTime13.getSecondOfDay();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate.Property property12 = localDate2.weekyear();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DateTime.Property property25 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTime dateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTime.Property property27 = dateTime26.year();
        int int28 = property12.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalDate localDate30 = property12.addWrapFieldToCopy(32770);
        org.joda.time.LocalTime localTime31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTime(localTime31);
        org.joda.time.DateTime.Property property33 = dateTime32.era();
        org.joda.time.DateTime dateTime34 = property33.roundHalfFloorCopy();
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder37 = builder35.removeUnicodeLocaleAttribute("eras");
        java.util.Locale.Builder builder39 = builder37.removeUnicodeLocaleAttribute("107");
        java.util.Locale.Builder builder41 = builder37.addUnicodeLocaleAttribute("107");
        java.util.Locale locale42 = builder37.build();
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleAttributes();
        int int44 = property33.getMaximumShortTextLength(locale42);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean48 = dateTimeZone47.isFixed();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone47);
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.minutes();
        boolean boolean51 = localDate49.isSupported(durationFieldType50);
        org.joda.time.LocalDate localDate53 = localDate49.minusDays(57);
        org.joda.time.LocalDate localDate55 = localDate49.plusYears((int) (byte) 10);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property57 = localDate56.yearOfCentury();
        org.joda.time.LocalDate localDate58 = property57.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean62 = dateTimeZone61.isFixed();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone61);
        org.joda.time.DateTime dateTime64 = localDate58.toDateTimeAtStartOfDay(dateTimeZone61);
        org.joda.time.DateTime dateTime65 = dateTime64.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str67 = dateTimeFieldType66.getName();
        org.joda.time.DateTime.Property property68 = dateTime65.property(dateTimeFieldType66);
        org.joda.time.Interval interval69 = property68.toInterval();
        org.joda.time.DateTimeField dateTimeField70 = property68.getField();
        int int71 = property68.getMaximumValueOverall();
        org.joda.time.DateTime dateTime72 = property68.withMinimumValue();
        boolean boolean74 = dateTime72.isEqual((long) 292278994);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean79 = dateTimeZone78.isFixed();
        org.joda.time.LocalDate localDate80 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone78);
        java.util.TimeZone timeZone81 = null;
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forTimeZone(timeZone81);
        org.joda.time.DateTime dateTime83 = localDate80.toDateTimeAtCurrentTime(dateTimeZone82);
        org.joda.time.DateTime dateTime85 = dateTime83.withMillis((long) 32772);
        org.joda.time.DateTime dateTime87 = dateTime85.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime89 = dateTime87.withWeekyear((int) 'u');
        java.util.Locale locale90 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale90);
        java.util.Calendar calendar92 = dateTime89.toCalendar(locale90);
        java.lang.String str93 = dateTime72.toString("117", locale90);
        org.joda.time.DateTime dateTime94 = dateTime72.toDateTimeISO();
        org.joda.time.DateTime dateTime95 = dateTime94.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone96 = dateTime94.getZone();
        org.joda.time.DateTime dateTime97 = localDate49.toDateTime((org.joda.time.ReadableInstant) dateTime94);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = property33.getDifference((org.joda.time.ReadableInstant) dateTime97);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "weekyear" + "'", str24, "weekyear");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "weekyear" + "'", str67, "weekyear");
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 292278993 + "'", int71 == 292278993);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(dateTimeZone78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar92);
// flaky:         org.junit.Assert.assertEquals(calendar92.toString(), "java.util.GregorianCalendar[time=-58474483202228,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=117,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=8,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=59,SECOND=57,MILLISECOND=772,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "117" + "'", str93, "117");
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(dateTime95);
        org.junit.Assert.assertNotNull(dateTimeZone96);
        org.junit.Assert.assertNotNull(dateTime97);
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = yearMonth2.toInterval(dateTimeZone3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Interval interval6 = interval4.withPeriodAfterStart(readablePeriod5);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = interval6.toPeriod(periodType7);
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = yearMonth10.toInterval(dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.Interval interval14 = interval12.withPeriodAfterStart(readablePeriod13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = interval14.toPeriod(periodType15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean18 = period16.isSupported(durationFieldType17);
        int int19 = period8.get(durationFieldType17);
        int int20 = period8.size();
        org.joda.time.YearMonth yearMonth22 = yearMonth0.withPeriodAdded((org.joda.time.ReadablePeriod) period8, 9);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.plusMonths((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean26 = yearMonth22.isSupported(dateTimeFieldType25);
        org.joda.time.YearMonth.Property property27 = yearMonth22.year();
        org.joda.time.YearMonth yearMonth29 = property27.setCopy(30020100);
        java.lang.String str30 = property27.getAsString();
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2022" + "'", str30, "2022");
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(32772);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTime dateTime14 = localDate5.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property15 = localDate5.yearOfEra();
        int int16 = localDate5.getYearOfEra();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        java.lang.String str20 = localDate18.toString();
        boolean boolean21 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate18);
        int int22 = localDate5.size();
        org.joda.time.LocalDate localDate24 = localDate5.minusWeeks(1);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = property26.getDifference(readableInstant28);
        org.joda.time.LocalDate localDate30 = property26.withMaximumValue();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfCentury();
        org.joda.time.LocalDate localDate33 = property32.getLocalDate();
        org.joda.time.LocalDate localDate35 = localDate33.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate37 = localDate35.plusMonths(32772);
        org.joda.time.LocalDate localDate38 = localDate30.withFields((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property40 = localDate39.yearOfCentury();
        org.joda.time.LocalDate.Property property41 = localDate39.yearOfCentury();
        org.joda.time.LocalDate localDate43 = property41.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField44 = property41.getField();
        long long47 = dateTimeField44.addWrapField((long) 2, (int) (byte) 10);
        int int49 = dateTimeField44.getMaximumValue((long) (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = dateTimeField44.getType();
        boolean boolean51 = localDate37.isSupported(dateTimeFieldType50);
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType50.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType50.getDurationType();
        org.joda.time.LocalDate.Property property54 = localDate24.property(dateTimeFieldType50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate56 = property54.addToCopy(432000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 432002099 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2099 + "'", int16 == 2099);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 315532800002L + "'", long47 == 315532800002L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 99 + "'", int49 == 99);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertNotNull(property54);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate4 = property2.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localDate5.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getDurationType();
        int int9 = localDate5.get(dateTimeFieldType7);
        int int10 = localDate5.getYear();
        int int11 = localDate5.getCenturyOfEra();
        org.joda.time.LocalDate localDate13 = localDate5.plusYears((int) (byte) 0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        java.util.Date date1 = new java.util.Date((long) (-34));
        date1.setMinutes(21601987);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 27 08:07:59 UTC 2011");
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate10 = dateTime8.toLocalDate();
        org.joda.time.Interval interval11 = localDate10.toInterval();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property13 = localDate12.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.monthOfYear();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = dateTime33.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str36 = dateTimeFieldType35.getName();
        org.joda.time.DateTime.Property property37 = dateTime34.property(dateTimeFieldType35);
        org.joda.time.DateTime dateTime38 = property37.roundFloorCopy();
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime38.getZone();
        java.util.TimeZone timeZone41 = dateTimeZone40.toTimeZone();
        org.joda.time.Chronology chronology42 = chronology22.withZone(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = chronology42.seconds();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.halfdayOfDay();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(chronology42);
        org.joda.time.Interval interval47 = interval11.withChronology(chronology42);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property49 = localDate48.yearOfCentury();
        org.joda.time.LocalDate localDate50 = property49.getLocalDate();
        org.joda.time.ReadableInstant readableInstant51 = null;
        int int52 = property49.getDifference(readableInstant51);
        org.joda.time.LocalDate localDate53 = property49.withMaximumValue();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(chronology54);
        int int56 = localDate55.getYearOfEra();
        int int57 = localDate55.getYearOfCentury();
        int[] intArray58 = localDate55.getValues();
        org.joda.time.LocalDate localDate60 = localDate55.withYearOfEra(28800000);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property62 = localDate61.yearOfCentury();
        org.joda.time.LocalDate localDate63 = property62.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean67 = dateTimeZone66.isFixed();
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone66);
        org.joda.time.DateTime dateTime69 = localDate63.toDateTimeAtStartOfDay(dateTimeZone66);
        org.joda.time.DateTime dateTime70 = dateTime69.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property71 = dateTime70.year();
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property73 = localDate72.yearOfCentury();
        org.joda.time.LocalDate localDate74 = property73.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean78 = dateTimeZone77.isFixed();
        org.joda.time.LocalDate localDate79 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone77);
        org.joda.time.DateTime dateTime80 = localDate74.toDateTimeAtStartOfDay(dateTimeZone77);
        org.joda.time.DateTime dateTime81 = dateTime80.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str83 = dateTimeFieldType82.getName();
        org.joda.time.DateTime.Property property84 = dateTime81.property(dateTimeFieldType82);
        org.joda.time.Interval interval85 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime dateTime87 = dateTime70.minusDays(32772);
        org.joda.time.ReadableDuration readableDuration88 = null;
        org.joda.time.DateTime dateTime89 = dateTime87.plus(readableDuration88);
        org.joda.time.DateTimeZone dateTimeZone90 = dateTime87.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone90);
        long long93 = dateTimeZone90.nextTransition((-31474424657L));
        org.joda.time.Interval interval94 = localDate55.toInterval(dateTimeZone90);
        boolean boolean95 = interval11.isBefore((org.joda.time.ReadableInterval) interval94);
        org.joda.time.ReadableDuration readableDuration96 = null;
        org.joda.time.Interval interval97 = interval94.withDurationBeforeEnd(readableDuration96);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "weekyear" + "'", str36, "weekyear");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2022 + "'", int56 == 2022);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 22 + "'", int57 == 22);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[2022, 2, 11]");
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDate74);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTimeFieldType82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "weekyear" + "'", str83, "weekyear");
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(dateTimeZone90);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + (-31474424657L) + "'", long93 == (-31474424657L));
        org.junit.Assert.assertNotNull(interval94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(interval97);
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate4 = property2.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str5 = property2.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        org.joda.time.DateTimeField dateTimeField7 = property2.getField();
        org.joda.time.LocalDate localDate8 = property2.withMaximumValue();
        int int9 = property2.get();
        org.joda.time.LocalDate localDate10 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "22" + "'", str5, "22");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.YearMonth yearMonth2 = org.joda.time.YearMonth.now(dateTimeZone1);
        int int3 = yearMonth2.getMonthOfYear();
        org.joda.time.YearMonth yearMonth5 = yearMonth2.minusMonths((-34));
        java.lang.String str7 = yearMonth5.toString("6");
        org.joda.time.YearMonth yearMonth9 = yearMonth5.plusMonths(42);
        org.joda.time.YearMonth yearMonth11 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Interval interval13 = yearMonth11.toInterval(dateTimeZone12);
        org.joda.time.YearMonth yearMonth15 = yearMonth11.minusMonths((int) (short) 1);
        java.lang.String str16 = yearMonth15.toString();
        boolean boolean17 = yearMonth5.isBefore((org.joda.time.ReadablePartial) yearMonth15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6" + "'", str7, "6");
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1969-12" + "'", str16, "1969-12");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        int int3 = localDate2.getWeekyear();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.LocalDate.Property property5 = localDate2.monthOfYear();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate7 = property5.roundHalfCeilingCopy();
        org.joda.time.Interval interval8 = localDate7.toInterval();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property10.getLocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = localDate13.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.DateTime.Property property24 = dateTime23.year();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property27 = localDate26.yearOfCentury();
        org.joda.time.LocalDate localDate28 = property27.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = localDate28.toDateTimeAtStartOfDay(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime34.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str37 = dateTimeFieldType36.getName();
        org.joda.time.DateTime.Property property38 = dateTime35.property(dateTimeFieldType36);
        org.joda.time.DateTime dateTime39 = property38.withMaximumValue();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property41 = localDate40.yearOfCentury();
        org.joda.time.LocalDate localDate42 = property41.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean46 = dateTimeZone45.isFixed();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone45);
        org.joda.time.DateTime dateTime48 = localDate42.toDateTimeAtStartOfDay(dateTimeZone45);
        boolean boolean49 = dateTime48.isBeforeNow();
        int int50 = dateTime48.getDayOfYear();
        boolean boolean51 = dateTime39.isEqual((org.joda.time.ReadableInstant) dateTime48);
        boolean boolean52 = interval25.contains((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Period period53 = interval25.toPeriod();
        boolean boolean55 = interval25.isAfter(568339200000L);
        boolean boolean56 = interval8.overlaps((org.joda.time.ReadableInterval) interval25);
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) 20, (long) 86397);
        org.joda.time.Period period60 = interval59.toPeriod();
        org.joda.time.Period period61 = interval59.toPeriod();
        org.joda.time.Interval interval62 = interval8.gap((org.joda.time.ReadableInterval) interval59);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "weekyear" + "'", str37, "weekyear");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 42 + "'", int50 == 42);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(interval62);
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Interval interval15 = interval13.withChronology(chronology14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property17.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = localDate18.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = dateTime24.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property26 = dateTime25.year();
        boolean boolean27 = interval15.contains((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean28 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.Chronology chronology32 = dateTimeFormatter31.getChronology();
        boolean boolean33 = dateTimeFormatter31.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean37 = dateTimeZone36.isFixed();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone36);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateTime dateTime41 = localDate38.toDateTimeAtCurrentTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withMillis((long) 32772);
        org.joda.time.DateTime dateTime45 = dateTime43.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime47 = dateTime43.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology48 = dateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.era();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.weekyearOfCentury();
        org.joda.time.DurationField durationField52 = chronology48.centuries();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter31.withChronology(chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter31.withPivotYear((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = dateTime25.toString(dateTimeFormatter31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property23 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        int int25 = dateTime20.getHourOfDay();
        boolean boolean26 = dateTime20.isBeforeNow();
        org.joda.time.YearMonthDay yearMonthDay27 = dateTime20.toYearMonthDay();
        org.joda.time.DateTime dateTime29 = dateTime20.minus(1050308164619000L);
        org.joda.time.DateTime dateTime31 = dateTime29.minusSeconds(20);
        org.joda.time.DateTime.Property property32 = dateTime31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int36 = dateTimeZone34.getOffsetFromLocal((long) 6);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime31.toMutableDateTime(dateTimeZone34);
        java.lang.String str39 = dateTimeZone34.getShortName((long) 8771);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone34);
        long long42 = dateTimeZone34.previousTransition(35318625L);
        java.util.Locale locale45 = new java.util.Locale("1970-01-01T00:00:00.000+08:00/1970-01-01T00:00:00.000+08:00");
        java.lang.String str46 = dateTimeZone34.getName((-31489200000L), locale45);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "weekyear" + "'", str22, "weekyear");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 21600000 + "'", int36 == 21600000);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+06:00" + "'", str39, "+06:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 35318625L + "'", long42 == 35318625L);
        org.junit.Assert.assertEquals(locale45.toString(), "1970-01-01t00:00:00.000+08:00/1970-01-01t00:00:00.000+08:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+06:00" + "'", str46, "+06:00");
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.DateTime.Property property15 = dateTime14.year();
        int int16 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property18 = dateTime14.monthOfYear();
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime14.withZone(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfEra();
        org.joda.time.DateTime.Property property23 = dateTime21.minuteOfHour();
        org.joda.time.DateTime dateTime25 = property23.addToCopy((long) 28800000);
        org.joda.time.DateTime dateTime26 = property23.withMinimumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = yearMonth1.toString(dateTimeFormatter6);
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = yearMonth9.toInterval(dateTimeZone10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = yearMonth9.getFieldTypes();
        org.joda.time.YearMonth.Property property13 = yearMonth9.year();
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Interval interval19 = yearMonth17.toInterval(dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.Interval interval21 = interval19.withPeriodAfterStart(readablePeriod20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = interval21.toPeriod(periodType22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean25 = period23.isSupported(durationFieldType24);
        org.joda.time.YearMonth yearMonth27 = yearMonth15.withPeriodAdded((org.joda.time.ReadablePeriod) period23, 32770);
        org.joda.time.YearMonth yearMonth28 = yearMonth9.minus((org.joda.time.ReadablePeriod) period23);
        boolean boolean29 = yearMonth1.isAfter((org.joda.time.ReadablePartial) yearMonth28);
        org.joda.time.Chronology chronology30 = yearMonth28.getChronology();
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth(chronology30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.minusYears(0);
        org.joda.time.Chronology chronology34 = yearMonth31.getChronology();
        int int35 = yearMonth31.size();
        int[] intArray36 = yearMonth31.getValues();
        org.joda.time.YearMonth yearMonth38 = yearMonth31.withYear(1969);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate40 = yearMonth31.toLocalDate(822);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 822 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01" + "'", str7, "1970-01");
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[2022, 2]");
        org.junit.Assert.assertNotNull(yearMonth38);
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = yearMonth1.toString(dateTimeFormatter6);
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = yearMonth9.toInterval(dateTimeZone10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = yearMonth9.getFieldTypes();
        org.joda.time.YearMonth.Property property13 = yearMonth9.year();
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Interval interval19 = yearMonth17.toInterval(dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.Interval interval21 = interval19.withPeriodAfterStart(readablePeriod20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = interval21.toPeriod(periodType22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean25 = period23.isSupported(durationFieldType24);
        org.joda.time.YearMonth yearMonth27 = yearMonth15.withPeriodAdded((org.joda.time.ReadablePeriod) period23, 32770);
        org.joda.time.YearMonth yearMonth28 = yearMonth9.minus((org.joda.time.ReadablePeriod) period23);
        boolean boolean29 = yearMonth1.isAfter((org.joda.time.ReadablePartial) yearMonth28);
        org.joda.time.Chronology chronology30 = yearMonth28.getChronology();
        org.joda.time.Chronology chronology31 = yearMonth28.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.hourOfHalfday();
        org.joda.time.Chronology chronology34 = chronology31.withUTC();
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = yearMonth36.toInterval(dateTimeZone37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.Interval interval40 = interval38.withPeriodAfterStart(readablePeriod39);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = interval40.toPeriod(periodType41);
        java.lang.String str43 = period42.toString();
        java.util.Date date50 = new java.util.Date((int) (byte) 10, (int) (short) 1, (int) (byte) 10, (int) (byte) 10, 0, (int) (byte) 1);
        int int51 = date50.getDay();
        boolean boolean52 = period42.equals((java.lang.Object) date50);
        int[] intArray55 = chronology34.get((org.joda.time.ReadablePeriod) period42, 20L, 24332133632770L);
        org.joda.time.MutablePeriod mutablePeriod56 = period42.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod57 = period42.toMutablePeriod();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01" + "'", str7, "1970-01");
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PT0S" + "'", str43, "PT0S");
        org.junit.Assert.assertEquals(date50.toString(), "Thu Feb 10 10:00:01 UTC 1910");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[771, 0, 2, 5, 22, 0, 32, 750]");
        org.junit.Assert.assertNotNull(mutablePeriod56);
        org.junit.Assert.assertNotNull(mutablePeriod57);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronolgy();
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = yearMonth10.toInterval(dateTimeZone11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = yearMonth10.getFieldTypes();
        org.joda.time.YearMonth.Property property14 = yearMonth10.year();
        java.lang.String str15 = property14.toString();
        java.lang.String str16 = property14.getName();
        java.lang.String str17 = property14.getName();
        org.joda.time.YearMonth yearMonth19 = property14.addWrapFieldToCopy(52);
        org.joda.time.YearMonth yearMonth21 = property14.addToCopy(20);
        org.joda.time.Chronology chronology22 = yearMonth21.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter7.withChronology(chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = dateTimeFormatter23.parseLocalDateTime("\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[year]" + "'", str15, "Property[year]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "year" + "'", str16, "year");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "year" + "'", str17, "year");
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 292278994);
        java.util.Date date17 = dateTime11.toDate();
        int int18 = dateTime11.getMillisOfDay();
        org.joda.time.DateTime.Property property19 = dateTime11.yearOfCentury();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        java.lang.String str23 = property21.getName();
        long long24 = property21.remainder();
        int int25 = property21.getMinimumValue();
        org.joda.time.LocalDate localDate26 = property21.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property21.getFieldType();
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale28.getCountry();
        java.util.Locale locale30 = locale28.stripExtensions();
        int int31 = property21.getMaximumTextLength(locale28);
        org.joda.time.DateTimeField dateTimeField32 = property21.getField();
        boolean boolean33 = property19.equals((java.lang.Object) property21);
        org.joda.time.DateTime dateTime35 = property19.addToCopy(2741);
        int int36 = dateTime35.getYear();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 23:59:57 UTC 1969");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21597772 + "'", int18 == 21597772);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "yearOfCentury" + "'", str23, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3542400000L + "'", long24 == 3542400000L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FR" + "'", str29, "FR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4711 + "'", int36 == 4711);
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property23 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime26 = dateTime9.minusDays(32772);
        org.joda.time.DateTime.Property property27 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime29 = dateTime9.plusSeconds(13);
        org.joda.time.DateTime dateTime31 = dateTime29.plusDays(20);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours(86397);
        org.joda.time.DateTime dateTime34 = dateTime33.toDateTimeISO();
        org.joda.time.DateTime dateTime36 = dateTime33.withYear(201122);
        int int37 = dateTime33.getEra();
        int int38 = dateTime33.getYear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "weekyear" + "'", str22, "weekyear");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2012 + "'", int38 == 2012);
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar.Builder builder6 = builder0.setWeekDate(42, (-1), 14);
        java.util.Calendar.Builder builder10 = builder6.setDate(0, (-3599), 22);
        java.util.Calendar.Builder builder14 = builder10.setTimeOfDay(16, 5, 34530606);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay((int) (byte) 10, 292275055, (-625));
        java.util.Calendar calendar19 = builder18.build();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = dateTime28.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str31 = dateTimeFieldType30.getName();
        org.joda.time.DateTime.Property property32 = dateTime29.property(dateTimeFieldType30);
        org.joda.time.DateTime dateTime33 = property32.roundFloorCopy();
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime33.getZone();
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone36);
        java.util.Calendar.Builder builder38 = builder18.setTimeZone(timeZone36);
        java.util.Calendar.Builder builder43 = builder18.setTimeOfDay(24889, 56463, 945, 1477161);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=-54093640525000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=255,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=308,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=44,SECOND=35,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "weekyear" + "'", str31, "weekyear");
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1644572708747,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=45,SECOND=8,MILLISECOND=747,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillis((long) 32772);
        boolean boolean22 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime21.getYear();
        java.util.GregorianCalendar gregorianCalendar24 = dateTime21.toGregorianCalendar();
        java.lang.String str25 = gregorianCalendar24.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(gregorianCalendar24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.util.GregorianCalendar[time=32772,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=32,MILLISECOND=772,ZONE_OFFSET=21600000,DST_OFFSET=0]" + "'", str25, "java.util.GregorianCalendar[time=32772,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=32,MILLISECOND=772,ZONE_OFFSET=21600000,DST_OFFSET=0]");
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) 70);
        calendar3.set(10, 32772, (int) (byte) 1, 22, 0);
        long long12 = calendar3.getTimeInMillis();
        java.util.TimeZone timeZone13 = null;
        calendar3.setTimeZone(timeZone13);
        int int15 = calendar3.getMinimalDaysInFirstWeek();
        int int16 = calendar3.getMinimalDaysInFirstWeek();
        long long17 = calendar3.getTimeInMillis();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=24332133632770,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2741,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=20,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 24332133632770L + "'", long12 == 24332133632770L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 24332133632770L + "'", long17 == 24332133632770L);
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar.Builder builder6 = builder0.setWeekDate(2022, 86397772, 7);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(2000, 2, 935);
        java.util.Calendar.Builder builder14 = builder6.setTimeOfDay(11865377, 17724494, (int) (short) -1);
        java.util.Calendar.Builder builder18 = builder6.setDate((int) 'a', 2099, 2848);
        java.util.Calendar calendar19 = builder6.build();
        java.util.Calendar calendar20 = builder6.build();
        java.util.Calendar.Builder builder24 = builder6.setWeekDate(292269054, 56384, 56514);
        java.util.Calendar.Builder builder28 = builder6.setDate(69, 63399288, 375);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=-9561595561000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1667,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=13,SECOND=59,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=-9561595561000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1667,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=13,SECOND=59,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("taiwan");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.lang.String str13 = locale12.getCountry();
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getLanguage();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = java.util.Locale.TAIWAN;
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = new java.util.Locale("");
        java.lang.String str25 = locale24.getLanguage();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.lang.String str29 = locale28.getCountry();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale12, locale14, locale15, locale16, locale18, locale20, locale21, locale22, locale24, locale26, locale27, locale28, locale30 };
        java.util.ArrayList<java.util.Locale> localeList32 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList32, localeArray31);
        java.util.Locale locale34 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList32);
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strSet36);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfCentury();
        org.joda.time.LocalDate localDate40 = property39.getLocalDate();
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = property39.getDifference(readableInstant41);
        org.joda.time.LocalDate localDate43 = property39.withMaximumValue();
        java.util.Locale locale46 = new java.util.Locale("70", "hi!");
        int int47 = property39.getMaximumShortTextLength(locale46);
        java.util.Locale locale48 = java.util.Locale.FRANCE;
        java.lang.String str49 = locale48.getCountry();
        java.util.Locale locale50 = locale48.stripExtensions();
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Calendar.Builder builder52 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder54 = builder52.setInstant((long) 32770);
        java.util.Calendar calendar55 = builder52.build();
        java.util.Date date57 = new java.util.Date((long) 10);
        java.util.Calendar.Builder builder58 = builder52.setInstant(date57);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property60 = localDate59.yearOfCentury();
        org.joda.time.LocalDate.Property property61 = localDate59.yearOfCentury();
        org.joda.time.LocalDate localDate63 = property61.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate64 = property61.roundHalfCeilingCopy();
        java.util.Locale locale65 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale65);
        int int67 = property61.getMaximumShortTextLength(locale65);
        java.util.Calendar.Builder builder68 = builder58.setLocale(locale65);
        java.util.Locale locale69 = java.util.Locale.JAPAN;
        java.util.Locale locale73 = new java.util.Locale("hi!", "2022-02-11", "2022-02-11");
        java.util.Locale[] localeArray74 = new java.util.Locale[] { locale46, locale50, locale51, locale65, locale69, locale73 };
        java.util.ArrayList<java.util.Locale> localeList75 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList75, localeArray74);
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList75);
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.Locale locale79 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap80 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList81 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap82 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList83 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList81, strMap82);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap84 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList85 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList83, strMap84);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FR" + "'", str13, "FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(localeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertEquals(locale46.toString(), "70_HI!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "FR" + "'", str49, "FR");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(calendar55);
        org.junit.Assert.assertEquals(calendar55.toString(), "java.util.GregorianCalendar[time=32770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale73.toString(), "hi!_2022-02-11_2022-02-11");
        org.junit.Assert.assertNotNull(localeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNull(locale79);
        org.junit.Assert.assertNotNull(languageRangeList81);
        org.junit.Assert.assertNotNull(languageRangeList83);
        org.junit.Assert.assertNotNull(languageRangeList85);
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Locale locale6 = new java.util.Locale("5 Jun 798307 11:57:00 GMT", "PT0S", "1969");
        java.util.Calendar.Builder builder7 = builder2.setLocale(locale6);
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone11);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTime dateTime16 = localDate13.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillis((long) 32772);
        org.joda.time.DateTime dateTime20 = dateTime18.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime22 = dateTime18.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.Interval interval24 = new org.joda.time.Interval(obj8, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.secondOfDay();
        org.joda.time.DurationField durationField27 = chronology23.minutes();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property29 = localDate28.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.DateTime dateTime36 = localDate30.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str39 = dateTimeFieldType38.getName();
        org.joda.time.DateTime.Property property40 = dateTime37.property(dateTimeFieldType38);
        org.joda.time.DateTime dateTime41 = property40.roundFloorCopy();
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime41.getZone();
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone43);
        org.joda.time.Chronology chronology45 = chronology23.withZone(dateTimeZone43);
        java.util.TimeZone timeZone46 = dateTimeZone43.toTimeZone();
        java.util.Calendar.Builder builder47 = builder2.setTimeZone(timeZone46);
        java.util.Locale locale51 = new java.util.Locale("", "fr", "2022-02-11");
        java.lang.String str52 = locale51.getDisplayCountry();
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone46, locale51);
        java.lang.String str54 = locale51.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals(locale6.toString(), "5 jun 798307 11:57:00 gmt_PT0S_1969");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "weekyear" + "'", str39, "weekyear");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals(locale51.toString(), "_FR_2022-02-11");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "France" + "'", str52, "France");
        org.junit.Assert.assertNotNull(calendar53);
// flaky:         org.junit.Assert.assertEquals(calendar53.toString(), "java.util.GregorianCalendar[time=1644572708856,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=45,SECOND=8,MILLISECOND=856,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate.Property property9 = localDate2.yearOfEra();
        org.joda.time.LocalDate.Property property10 = localDate2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.minutes();
        boolean boolean17 = localDate15.isSupported(durationFieldType16);
        org.joda.time.LocalDate.Property property18 = localDate15.centuryOfEra();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean25 = dateTimeZone24.isFixed();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = localDate21.toDateTimeAtStartOfDay(dateTimeZone24);
        long long28 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.LocalDate localDate29 = property18.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(57);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtStartOfDay(dateTimeZone31);
        java.util.Calendar.Builder builder34 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder36 = builder34.setInstant((long) 32770);
        java.util.Calendar.Builder builder40 = builder34.setWeekDate(42, (-1), 14);
        java.util.Calendar.Builder builder44 = builder40.setDate((int) (byte) 0, 360240000, 86397772);
        java.util.Calendar.Builder builder49 = builder40.setTimeOfDay((int) (short) 0, 292278993, 21632772, 292278993);
        java.util.Calendar.Builder builder53 = builder49.setWeekDate(38, 375, 56305647);
        boolean boolean54 = localDate29.equals((java.lang.Object) 56305647);
        int int55 = property10.compareTo((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.DurationFieldType durationFieldType56 = null;
        boolean boolean57 = localDate29.isSupported(durationFieldType56);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.Interval interval5 = interval3.withPeriodAfterStart(readablePeriod4);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = interval5.toPeriod(periodType6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean9 = period7.isSupported(durationFieldType8);
        java.lang.String str10 = period7.toString();
        org.joda.time.PeriodType periodType11 = period7.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean13 = period7.isSupported(durationFieldType12);
        org.joda.time.Period period14 = period7.toPeriod();
        org.joda.time.PeriodType periodType15 = period7.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = period7.toMutablePeriod();
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Interval interval20 = yearMonth18.toInterval(dateTimeZone19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = yearMonth18.getFieldTypes();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.withYear((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.eras();
        boolean boolean25 = yearMonth18.equals((java.lang.Object) durationFieldType24);
        boolean boolean26 = mutablePeriod16.isSupported(durationFieldType24);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0S" + "'", str10, "PT0S");
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zho");
        double double2 = languageRange1.getWeight();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate9 = localDate7.plusMonths(32772);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate13 = localDate9.withFieldAdded(durationFieldType11, 57);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        java.lang.String str17 = localDate15.toString();
        org.joda.time.LocalDate localDate19 = localDate15.minusYears(0);
        org.joda.time.LocalDate.Property property20 = localDate19.monthOfYear();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate.Property property23 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property23.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str26 = property23.getAsString();
        org.joda.time.LocalDate localDate27 = property23.roundHalfCeilingCopy();
        java.lang.String str28 = property23.getAsText();
        org.joda.time.LocalDate localDate30 = property23.addWrapFieldToCopy(796407);
        java.lang.String str31 = localDate30.toString();
        int int32 = localDate19.compareTo((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean36 = dateTimeZone35.isFixed();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int40 = dateTimeZone38.getOffsetFromLocal((long) 6);
        long long42 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        org.joda.time.Interval interval43 = localDate33.toInterval(dateTimeZone35);
        long long45 = dateTimeZone35.convertUTCToLocal((long) 3);
        org.joda.time.DateMidnight dateMidnight46 = localDate30.toDateMidnight(dateTimeZone35);
        org.joda.time.DateTime dateTime47 = localDate9.toDateTimeAtMidnight(dateTimeZone35);
        boolean boolean48 = languageRange1.equals((java.lang.Object) dateTimeZone35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "22" + "'", str26, "22");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "22" + "'", str28, "22");
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2029-02-11" + "'", str31, "2029-02-11");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 21600000 + "'", int40 == 21600000);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 21600003L + "'", long45 == 21600003L);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) (byte) 10);
        calendar3.setTimeInMillis(21600007L);
        java.lang.String str8 = calendar3.getCalendarType();
        calendar3.setMinimalDaysInFirstWeek(56402621);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=21600007,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=56402621,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=0,SECOND=0,MILLISECOND=7,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gregory" + "'", str8, "gregory");
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property2 = localDate1.yearOfCentury();
        org.joda.time.LocalDate localDate3 = property2.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.Chronology chronology11 = dateTime9.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = dateTime22.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str25 = dateTimeFieldType24.getName();
        org.joda.time.DateTime.Property property26 = dateTime23.property(dateTimeFieldType24);
        org.joda.time.DateTime dateTime27 = property26.roundFloorCopy();
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime27.getZone();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.Chronology chronology31 = chronology11.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField32 = chronology11.seconds();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType0.getField(chronology11);
        org.joda.time.DurationField durationField34 = dateTimeField33.getDurationField();
        long long36 = dateTimeField33.roundHalfCeiling(62L);
        int int37 = dateTimeField33.getMaximumValue();
        long long40 = dateTimeField33.add(1708177939200000L, 32400000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "weekyear" + "'", str25, "weekyear");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-21600000L) + "'", long36 == (-21600000L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 366 + "'", int37 == 366);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 4507537939200000L + "'", long40 == 4507537939200000L);
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean4 = dateTimeZone3.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) 6);
        long long10 = dateTimeZone3.getMillisKeepLocal(dateTimeZone6, (long) 10);
        org.joda.time.Interval interval11 = localDate1.toInterval(dateTimeZone3);
        org.joda.time.DateTime dateTime12 = localDate0.toDateTimeAtMidnight(dateTimeZone3);
        java.lang.String str13 = dateTimeZone3.toString();
        long long15 = dateTimeZone3.nextTransition((long) 0);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("year");
        java.lang.String str19 = dateTimeZone3.getShortName((-21599064L), locale18);
        java.lang.String str20 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21600000 + "'", int8 == 21600000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+06:00" + "'", str13, "+06:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "year");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+06:00" + "'", str19, "+06:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+06:00" + "'", str20, "+06:00");
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(2830717870208000L);
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property23 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        int int25 = dateTime20.getHourOfDay();
        boolean boolean26 = dateTime20.isBeforeNow();
        org.joda.time.YearMonthDay yearMonthDay27 = dateTime20.toYearMonthDay();
        org.joda.time.DateTime dateTime29 = dateTime20.plusHours(2011);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Interval interval35 = interval33.withChronology(chronology34);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property37 = localDate36.yearOfCentury();
        org.joda.time.LocalDate localDate38 = property37.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean42 = dateTimeZone41.isFixed();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.DateTime dateTime44 = localDate38.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = dateTime44.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property46 = dateTime45.year();
        boolean boolean47 = interval35.contains((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Period period48 = interval35.toPeriod();
        org.joda.time.DateTime dateTime49 = dateTime20.minus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.DateTime dateTime51 = dateTime20.minusMillis(1980);
        java.lang.String str52 = dateTime20.toString();
        org.joda.time.DateTime.Property property53 = dateTime20.era();
        org.joda.time.DateTime dateTime54 = property53.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "weekyear" + "'", str22, "weekyear");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2022-02-11T00:00:00.000+06:00" + "'", str52, "2022-02-11T00:00:00.000+06:00");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime54);
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((long) (short) 1, chronology1);
        org.joda.time.Chronology chronology3 = yearMonth2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.weekyearOfCentury();
        int int7 = dateTimeField5.getLeapAmount(1325268000000L);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        java.util.Locale locale5 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth((long) (short) 1, chronology9);
        org.joda.time.Chronology chronology11 = yearMonth10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.millisOfSecond();
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = yearMonth14.toInterval(dateTimeZone15);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = yearMonth14.getFieldTypes();
        org.joda.time.YearMonth.Property property18 = yearMonth14.year();
        java.lang.String str19 = property18.toString();
        org.joda.time.YearMonth yearMonth21 = property18.addToCopy((int) (byte) 10);
        long long23 = chronology11.set((org.joda.time.ReadablePartial) yearMonth21, (long) (-292275054));
        org.joda.time.Chronology chronology24 = yearMonth21.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.days();
        org.joda.time.DurationField durationField26 = chronology24.minutes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology24);
        boolean boolean28 = dateTimeFormatter27.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeFormatter27.getZone();
        java.io.Writer writer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(writer30, 950205600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[year]" + "'", str19, "Property[year]");
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 317918924946L + "'", long23 == 317918924946L);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(dateTimeZone29);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property2 = localDate1.yearOfCentury();
        org.joda.time.LocalDate localDate3 = property2.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.Chronology chronology11 = dateTime9.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = dateTime22.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str25 = dateTimeFieldType24.getName();
        org.joda.time.DateTime.Property property26 = dateTime23.property(dateTimeFieldType24);
        org.joda.time.DateTime dateTime27 = property26.roundFloorCopy();
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime27.getZone();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.Chronology chronology31 = chronology11.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField32 = chronology11.seconds();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType0.getField(chronology11);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "weekyear" + "'", str25, "weekyear");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) 70);
        long long6 = calendar3.getTimeInMillis();
        java.time.Instant instant7 = calendar3.toInstant();
        java.util.Calendar.Builder builder8 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder10 = builder8.setInstant((long) 32770);
        java.util.Calendar calendar11 = builder10.build();
        boolean boolean13 = calendar11.after((java.lang.Object) 70);
        calendar11.set(10, 32772, (int) (byte) 1, 22, 0);
        long long20 = calendar11.getTimeInMillis();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = dateTime29.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str32 = dateTimeFieldType31.getName();
        org.joda.time.DateTime.Property property33 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.DateTime dateTime34 = property33.roundFloorCopy();
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime34.getZone();
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        calendar11.setTimeZone(timeZone37);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone37);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        calendar3.setTimeZone(timeZone37);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone37);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone37);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=32770,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32770L + "'", long6 == 32770L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=24332133632770,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2741,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=20,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 24332133632770L + "'", long20 == 24332133632770L);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "weekyear" + "'", str32, "weekyear");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(calendar39);
// flaky:         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=1644572709082,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=45,SECOND=9,MILLISECOND=82,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572709082,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=45,SECOND=9,MILLISECOND=82,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar45);
// flaky:         org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=1644572709082,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=45,SECOND=9,MILLISECOND=82,ZONE_OFFSET=21600000,DST_OFFSET=0]");
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight(dateTimeZone6);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateMidnight dateMidnight9 = dateTime7.toDateMidnight();
        java.util.Date date10 = dateMidnight9.toDate();
        date10.setDate((int) (short) 10);
        long long13 = date10.getTime();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date10);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        java.lang.String str23 = dateTime22.toString();
        org.joda.time.DateMidnight dateMidnight24 = dateTime22.toDateMidnight();
        java.util.Date date25 = dateMidnight24.toDate();
        date25.setDate((int) (short) 10);
        boolean boolean28 = date10.before(date25);
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.fromDateFields(date25);
        int int30 = localDate29.getWeekyear();
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours(70);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01T00:00:00.000+06:00" + "'", str8, "1970-01-01T00:00:00.000+06:00");
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 10 18:00:00 UTC 1969");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1836000000L) + "'", long13 == (-1836000000L));
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01T00:00:00.000+06:00" + "'", str23, "1970-01-01T00:00:00.000+06:00");
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 10 18:00:00 UTC 1969");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1969 + "'", int30 == 1969);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("eras");
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("117");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("java.util.GregorianCalendar[time=1644572539394,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=42,SECOND=19,MILLISECOND=394,ZONE_OFFSET=21600000,DST_OFFSET=0]", "1969-12-10T15:42:14.093+06:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.util.GregorianCalendar[time=1644572539394,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=42,SECOND=19,MILLISECOND=394,ZONE_OFFSET=21600000,DST_OFFSET=0] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property23 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime26 = dateTime9.minusDays(32772);
        org.joda.time.DateTime.Property property27 = dateTime9.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTime9.withWeekOfWeekyear((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "weekyear" + "'", str22, "weekyear");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate4 = property2.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        int int7 = dateTimeField5.get((long) 'u');
        long long10 = dateTimeField5.addWrapField((long) (short) -1, 1);
        org.joda.time.DurationField durationField11 = dateTimeField5.getDurationField();
        long long13 = dateTimeField5.remainder((-1L));
        boolean boolean14 = dateTimeField5.isSupported();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 31535999999L + "'", long10 == 31535999999L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31535999999L + "'", long13 == 31535999999L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.lang.String str6 = property5.toString();
        java.lang.String str7 = property5.getAsShortText();
        int int8 = property5.getMinimumValueOverall();
        int int9 = property5.getMaximumValue();
        int int10 = property5.getMinimumValue();
        org.joda.time.YearMonth yearMonth12 = property5.addToCopy(45);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.plusYears(56297158);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[year]" + "'", str6, "Property[year]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970" + "'", str7, "1970");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-292275054) + "'", int8 == (-292275054));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 292278993 + "'", int9 == 292278993);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-292275054) + "'", int10 == (-292275054));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(56316);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getVariant();
        java.lang.String str10 = dateTimeZone6.getName((long) (-46800000), locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(938, 13, (-52), 7, 238, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 238 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:56.316" + "'", str10, "+00:00:56.316");
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.YearMonth yearMonth5 = yearMonth1.minusMonths((int) (short) 1);
        org.joda.time.YearMonth.Property property6 = yearMonth1.year();
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        int int8 = property6.getMaximumShortTextLength(locale7);
        java.lang.String str9 = property6.getAsShortText();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale10.toLanguageTag();
        int int12 = property6.getMaximumShortTextLength(locale10);
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = yearMonth14.toInterval(dateTimeZone15);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = yearMonth14.getFieldTypes();
        org.joda.time.YearMonth.Property property18 = yearMonth14.year();
        java.lang.String str19 = property18.toString();
        org.joda.time.YearMonth yearMonth20 = property18.getYearMonth();
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Interval interval24 = yearMonth22.toInterval(dateTimeZone23);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = yearMonth22.getFieldTypes();
        org.joda.time.YearMonth.Property property26 = yearMonth22.year();
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.lang.String str28 = locale27.getCountry();
        int int29 = property26.getMaximumShortTextLength(locale27);
        java.lang.String str30 = property18.getAsShortText(locale27);
        java.lang.String str31 = locale10.getDisplayVariant(locale27);
        java.lang.String str32 = locale27.getCountry();
        java.util.Locale.Category category33 = java.util.Locale.Category.FORMAT;
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.Interval interval37 = yearMonth35.toInterval(dateTimeZone36);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray38 = yearMonth35.getFieldTypes();
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.Interval interval42 = yearMonth40.toInterval(dateTimeZone41);
        org.joda.time.YearMonth yearMonth44 = yearMonth40.minusMonths((int) (short) 1);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.YearMonth yearMonth46 = yearMonth44.withChronologyRetainFields(chronology45);
        int int47 = yearMonth35.compareTo((org.joda.time.ReadablePartial) yearMonth46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.YearMonth yearMonth49 = yearMonth46.minus(readablePeriod48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTime dateTime51 = yearMonth46.toDateTime(readableInstant50);
        org.joda.time.Chronology chronology52 = yearMonth46.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.weekyearOfCentury();
        org.joda.time.YearMonth yearMonth56 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.Interval interval58 = yearMonth56.toInterval(dateTimeZone57);
        org.joda.time.YearMonth yearMonth60 = yearMonth56.minusMonths((int) (short) 1);
        org.joda.time.YearMonth.Property property61 = yearMonth56.year();
        java.util.Locale locale62 = java.util.Locale.CANADA;
        java.lang.String str63 = locale62.getVariant();
        java.lang.String str64 = property61.getAsShortText(locale62);
        java.lang.String str65 = dateTimeField53.getAsShortText(9, locale62);
        java.util.Locale.setDefault(category33, locale62);
        java.lang.String str67 = locale27.getDisplayName(locale62);
        java.lang.String str68 = locale27.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet69 = locale27.getExtensionKeys();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970" + "'", str9, "1970");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[year]" + "'", str19, "Property[year]");
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FR" + "'", str28, "FR");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970" + "'", str30, "1970");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "FR" + "'", str32, "FR");
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.FORMAT + "'", category33.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray38);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(yearMonth49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(yearMonth60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1970" + "'", str64, "1970");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "9" + "'", str65, "9");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "French (France)" + "'", str67, "French (France)");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "French" + "'", str68, "French");
        org.junit.Assert.assertNotNull(charSet69);
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfWeek();
        org.joda.time.LocalDate localDate13 = property11.addToCopy(10);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str17 = dateTimeZone15.getName(10L);
        java.util.Locale locale21 = new java.util.Locale("70", "hi!");
        java.lang.String str22 = dateTimeZone15.getName((long) '4', locale21);
        org.joda.time.Interval interval23 = localDate13.toInterval(dateTimeZone15);
        org.joda.time.LocalDate localDate25 = localDate13.plusDays(19);
        int int26 = localDate13.getCenturyOfEra();
        org.joda.time.LocalDate.Property property27 = localDate13.dayOfYear();
        org.joda.time.LocalDate localDate29 = localDate13.withCenturyOfEra(8);
        int int30 = localDate29.getYearOfEra();
        org.joda.time.LocalDate.Property property31 = localDate29.weekyear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+06:00" + "'", str17, "+06:00");
        org.junit.Assert.assertEquals(locale21.toString(), "70_HI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+06:00" + "'", str22, "+06:00");
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 822 + "'", int30 == 822);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(32772);
        org.joda.time.LocalDate localDate8 = localDate6.withWeekyear(32769);
        org.joda.time.LocalDate localDate10 = localDate6.plusDays((int) (short) 1);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate.Property property9 = localDate2.yearOfEra();
        org.joda.time.LocalDate localDate11 = localDate2.plusYears((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtMidnight(dateTimeZone18);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.DateMidnight dateMidnight21 = dateTime19.toDateMidnight();
        org.joda.time.DateTime.Property property22 = dateTime19.weekOfWeekyear();
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = null;
        org.joda.time.format.DateTimeParser dateTimeParser24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withDefaultYear((int) (short) 1);
        boolean boolean28 = dateTimeFormatter25.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTime dateTime36 = localDate33.toDateTimeAtCurrentTime(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withMillis((long) 32772);
        org.joda.time.DateTime dateTime40 = dateTime38.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime42 = dateTime38.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology43 = dateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.weekOfWeekyear();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property46 = localDate45.yearOfCentury();
        org.joda.time.LocalDate localDate47 = property46.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean51 = dateTimeZone50.isFixed();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone50);
        org.joda.time.DateTime dateTime53 = localDate47.toDateTimeAtStartOfDay(dateTimeZone50);
        org.joda.time.DateTime dateTime54 = dateTime53.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str56 = dateTimeFieldType55.getName();
        org.joda.time.DateTime.Property property57 = dateTime54.property(dateTimeFieldType55);
        org.joda.time.Interval interval58 = property57.toInterval();
        org.joda.time.DateTimeField dateTimeField59 = property57.getField();
        long long62 = dateTimeField59.add((long) (byte) 10, (-1));
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property64 = localDate63.yearOfCentury();
        org.joda.time.LocalDate localDate65 = property64.getLocalDate();
        int int66 = localDate65.getWeekyear();
        java.lang.String str67 = localDate65.toString();
        org.joda.time.LocalTime localTime68 = null;
        org.joda.time.DateTime dateTime69 = localDate65.toDateTime(localTime68);
        java.util.Locale locale72 = new java.util.Locale("");
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property74 = localDate73.yearOfCentury();
        org.joda.time.LocalDate.Property property75 = localDate73.yearOfCentury();
        org.joda.time.LocalDate localDate77 = property75.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField78 = property75.getField();
        int int80 = dateTimeField78.get((long) 'u');
        java.util.Locale locale82 = java.util.Locale.TAIWAN;
        java.lang.String str83 = dateTimeField78.getAsText((long) 5, locale82);
        java.lang.String str84 = locale72.getDisplayVariant(locale82);
        java.lang.String str85 = locale82.getDisplayLanguage();
        java.lang.String str86 = dateTimeField59.getAsShortText((org.joda.time.ReadablePartial) localDate65, (int) (byte) 100, locale82);
        int int87 = dateTimeField44.getMaximumShortTextLength(locale82);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = dateTimeFormatter25.withLocale(locale82);
        java.util.Calendar calendar89 = dateTime19.toCalendar(locale82);
        boolean boolean90 = localDate2.equals((java.lang.Object) calendar89);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01T00:00:00.000+06:00" + "'", str20, "1970-01-01T00:00:00.000+06:00");
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "weekyear" + "'", str56, "weekyear");
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-31449599990L) + "'", long62 == (-31449599990L));
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2022 + "'", int66 == 2022);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "2022-02-11" + "'", str67, "2022-02-11");
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(localDate77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 70 + "'", int80 == 70);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "70" + "'", str83, "70");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Chinese" + "'", str85, "Chinese");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "100" + "'", str86, "100");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter88);
        org.junit.Assert.assertNotNull(calendar89);
        org.junit.Assert.assertEquals(calendar89.toString(), "java.util.GregorianCalendar[time=-21600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+06:00\",offset=21600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=21600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) 70);
        long long6 = calendar3.getTimeInMillis();
        int int7 = calendar3.getWeeksInWeekYear();
        java.util.TimeZone timeZone8 = calendar3.getTimeZone();
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.lang.String str10 = locale9.getCountry();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.util.Locale.setDefault(locale9);
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = yearMonth14.toInterval(dateTimeZone15);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = yearMonth14.getFieldTypes();
        org.joda.time.YearMonth.Property property18 = yearMonth14.year();
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = locale19.getCountry();
        java.util.Locale locale21 = locale19.stripExtensions();
        int int22 = property18.getMaximumTextLength(locale21);
        java.lang.String str23 = locale9.getDisplayName(locale21);
        java.lang.String str24 = locale9.getDisplayVariant();
        java.lang.String str25 = locale9.getISO3Language();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone8, locale9);
        calendar26.setMinimalDaysInFirstWeek(4711);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=32770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32770L + "'", long6 == 32770L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FR" + "'", str20, "FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "allemand" + "'", str23, "allemand");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "deu" + "'", str25, "deu");
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=1644572709321,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4711,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=45,SECOND=9,MILLISECOND=321,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property23 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime26 = dateTime20.withHourOfDay(15);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(13);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime26.toMutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime29.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "weekyear" + "'", str22, "weekyear");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTime dateTime15 = dateTime14.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate16 = dateTime14.toLocalDate();
        int int17 = localDate5.compareTo((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate localDate19 = localDate16.minusDays(17724494);
        org.joda.time.LocalDate.Property property20 = localDate16.era();
        int int21 = localDate16.getMonthOfYear();
        org.joda.time.LocalDate.Property property22 = localDate16.era();
        java.lang.String str23 = property22.getAsString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate6 = localDate2.minusYears(11);
        org.joda.time.LocalDate.Property property7 = localDate2.monthOfYear();
        boolean boolean8 = property7.isLeap();
        int int9 = property7.get();
        org.joda.time.LocalDate localDate10 = property7.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTime dateTime21 = localDate18.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillis((long) 32772);
        org.joda.time.DateTime dateTime25 = dateTime23.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property26 = dateTime25.year();
        long long27 = property26.remainder();
        org.joda.time.DurationField durationField28 = property26.getDurationField();
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.lang.String str30 = locale29.getCountry();
        java.util.Locale locale31 = locale29.stripExtensions();
        java.lang.String str32 = property26.getAsText(locale29);
        java.lang.String str33 = dateTimeZone11.getShortName(34522218L, locale29);
        java.lang.String str34 = locale29.getDisplayName();
        java.lang.String str35 = property7.getAsText(locale29);
        org.joda.time.LocalDate localDate37 = property7.addWrapFieldToCopy(54);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 21597772L + "'", long27 == 21597772L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FR" + "'", str30, "FR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970" + "'", str32, "1970");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+06:00" + "'", str33, "+06:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str34, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "f\351vrier" + "'", str35, "f\351vrier");
        org.junit.Assert.assertNotNull(localDate37);
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Wed Dec 10 16:00:00 UTC 1969", (double) 729129600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=7.291296E11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("31 Dec 1969 18:00:00 GMT");
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale6 = new java.util.Locale("01.01.1970 00:00:32", "kr");
        java.util.Locale.setDefault(category0, locale6);
        java.lang.String str8 = locale6.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "31 dec 1969 18:00:00 gmt");
        org.junit.Assert.assertEquals(locale6.toString(), "01.01.1970 00:00:32_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "01.01.1970 00:00:32_KR" + "'", str8, "01.01.1970 00:00:32_KR");
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = yearMonth4.toInterval(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.Interval interval8 = interval6.withPeriodAfterStart(readablePeriod7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = interval8.toPeriod(periodType9);
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = yearMonth12.toInterval(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.Interval interval16 = interval14.withPeriodAfterStart(readablePeriod15);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = interval16.toPeriod(periodType17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean20 = period18.isSupported(durationFieldType19);
        int int21 = period10.get(durationFieldType19);
        org.joda.time.YearMonth yearMonth22 = yearMonth2.minus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = yearMonth2.getFieldTypes();
        java.lang.String str25 = yearMonth2.toString("+20:00");
        org.joda.time.Interval interval26 = yearMonth2.toInterval();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+20:00" + "'", str25, "+20:00");
        org.junit.Assert.assertNotNull(interval26);
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        java.lang.String str3 = property1.getName();
        long long4 = property1.remainder();
        int int5 = property1.getMinimumValue();
        org.joda.time.LocalDate localDate6 = property1.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property1.getFieldType();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = locale8.stripExtensions();
        int int11 = property1.getMaximumTextLength(locale8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillis((long) 32772);
        org.joda.time.DateTime dateTime23 = dateTime21.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Interval interval31 = interval29.withChronology(chronology30);
        org.joda.time.Duration duration32 = interval29.toDuration();
        org.joda.time.DateTime dateTime33 = dateTime25.plus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property35 = localDate34.yearOfCentury();
        org.joda.time.LocalDate localDate36 = property35.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone39);
        org.joda.time.DateTime dateTime42 = localDate36.toDateTimeAtStartOfDay(dateTimeZone39);
        org.joda.time.DateTime dateTime43 = dateTime33.withZoneRetainFields(dateTimeZone39);
        long long44 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        long long45 = property1.remainder();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yearOfCentury" + "'", str3, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3542400000L + "'", long4 == 3542400000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FR" + "'", str9, "FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 51L + "'", long44 == 51L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 3542400000L + "'", long45 == 3542400000L);
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate.Property property12 = localDate2.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = property12.setCopy("2022-02-11T15:43:42.701+06:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T15:43:42.701+06:00\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.LocalDate localDate15 = localDate12.withDayOfMonth(4);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTime dateTime23 = localDate20.toDateTimeAtMidnight(dateTimeZone22);
        java.lang.String str24 = dateTime23.toString();
        org.joda.time.DateMidnight dateMidnight25 = dateTime23.toDateMidnight();
        org.joda.time.DateTime.Property property26 = dateTime23.weekOfWeekyear();
        boolean boolean28 = dateTime23.equals((java.lang.Object) "1970-01");
        org.joda.time.DateTime dateTime29 = localDate15.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property31 = localDate30.yearOfCentury();
        org.joda.time.LocalDate localDate32 = property31.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean36 = dateTimeZone35.isFixed();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = localDate32.toDateTimeAtStartOfDay(dateTimeZone35);
        org.joda.time.DateTime dateTime39 = dateTime38.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property40 = dateTime39.year();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property42 = localDate41.yearOfCentury();
        org.joda.time.LocalDate localDate43 = property42.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean47 = dateTimeZone46.isFixed();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = localDate43.toDateTimeAtStartOfDay(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = dateTime49.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str52 = dateTimeFieldType51.getName();
        org.joda.time.DateTime.Property property53 = dateTime50.property(dateTimeFieldType51);
        org.joda.time.Interval interval54 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime56 = dateTime50.plusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime58 = dateTime50.withMinuteOfHour(19);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property60 = localDate59.yearOfCentury();
        org.joda.time.LocalDate localDate61 = property60.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean65 = dateTimeZone64.isFixed();
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone64);
        org.joda.time.DateTime dateTime67 = localDate61.toDateTimeAtStartOfDay(dateTimeZone64);
        org.joda.time.DateTime dateTime68 = dateTime67.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str70 = dateTimeFieldType69.getName();
        org.joda.time.DateTime.Property property71 = dateTime68.property(dateTimeFieldType69);
        org.joda.time.Interval interval72 = property71.toInterval();
        org.joda.time.DateTimeField dateTimeField73 = property71.getField();
        org.joda.time.DateTime dateTime75 = property71.addToCopy(5);
        org.joda.time.DateTime dateTime77 = dateTime75.withWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.Interval interval81 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone80);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.Interval interval83 = interval81.withChronology(chronology82);
        org.joda.time.Duration duration84 = interval81.toDuration();
        org.joda.time.DateTime dateTime85 = dateTime75.minus((org.joda.time.ReadableDuration) duration84);
        org.joda.time.DateTime dateTime86 = dateTime58.plus((org.joda.time.ReadableDuration) duration84);
        int int87 = dateTime86.getCenturyOfEra();
        org.joda.time.YearMonthDay yearMonthDay88 = dateTime86.toYearMonthDay();
        boolean boolean89 = localDate15.isAfter((org.joda.time.ReadablePartial) yearMonthDay88);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01T00:00:00.000+06:00" + "'", str24, "1970-01-01T00:00:00.000+06:00");
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "weekyear" + "'", str52, "weekyear");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "weekyear" + "'", str70, "weekyear");
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(interval83);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 20 + "'", int87 == 20);
        org.junit.Assert.assertNotNull(yearMonthDay88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        java.util.Date date1 = new java.util.Date((long) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean5 = dateTimeZone4.isFixed();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone4);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTime dateTime9 = localDate6.toDateTimeAtMidnight(dateTimeZone8);
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.DateMidnight dateMidnight11 = dateTime9.toDateMidnight();
        java.util.Date date12 = dateMidnight11.toDate();
        boolean boolean13 = date1.before(date12);
        java.time.Instant instant14 = date1.toInstant();
        date1.setTime((long) ' ');
        java.util.Date date23 = new java.util.Date((int) (byte) 10, (int) (short) 1, (int) (byte) 10, (int) (byte) 10, 0, (int) (byte) 1);
        java.lang.String str24 = date23.toGMTString();
        java.util.Date date31 = new java.util.Date((int) (byte) 10, (int) (short) 1, (int) (byte) 10, (int) (byte) 10, 0, (int) (byte) 1);
        boolean boolean32 = date23.before(date31);
        boolean boolean33 = date1.after(date31);
        int int34 = date31.getMinutes();
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.fromDateFields(date31);
        int int36 = date31.getYear();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T00:00:00.000+06:00" + "'", str10, "1970-01-01T00:00:00.000+06:00");
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 18:00:00 UTC 1969");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Feb 10 10:00:01 UTC 1910");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10 Feb 1910 10:00:01 GMT" + "'", str24, "10 Feb 1910 10:00:01 GMT");
        org.junit.Assert.assertEquals(date31.toString(), "Thu Feb 10 10:00:01 UTC 1910");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.LocalDate localDate16 = localDate4.minusYears(10);
        org.joda.time.LocalDate.Property property17 = localDate16.dayOfYear();
        int int18 = property17.getMaximumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 365 + "'", int18 == 365);
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.monthOfYear();
        org.joda.time.DurationField durationField6 = chronology3.days();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 2000);
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths(32772);
        long long12 = chronology3.set((org.joda.time.ReadablePartial) localDate8, (-21599064L));
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 414088, chronology3);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 64800936L + "'", long12 == 64800936L);
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.DateTime dateTime11 = dateTime8.withDurationAdded((-1L), (int) (byte) -1);
        org.joda.time.DateTime dateTime13 = dateTime8.plusWeeks(693);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime8.getZone();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 21, (long) '#', dateTimeZone14);
        org.joda.time.YearMonth yearMonth16 = org.joda.time.YearMonth.now(dateTimeZone14);
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Interval interval20 = yearMonth18.toInterval(dateTimeZone19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = yearMonth18.getFieldTypes();
        org.joda.time.YearMonth.Property property22 = yearMonth18.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = yearMonth18.toString(dateTimeFormatter23);
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Interval interval28 = yearMonth26.toInterval(dateTimeZone27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = yearMonth26.getFieldTypes();
        org.joda.time.YearMonth.Property property30 = yearMonth26.year();
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.Interval interval36 = yearMonth34.toInterval(dateTimeZone35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.Interval interval38 = interval36.withPeriodAfterStart(readablePeriod37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = interval38.toPeriod(periodType39);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean42 = period40.isSupported(durationFieldType41);
        org.joda.time.YearMonth yearMonth44 = yearMonth32.withPeriodAdded((org.joda.time.ReadablePeriod) period40, 32770);
        org.joda.time.YearMonth yearMonth45 = yearMonth26.minus((org.joda.time.ReadablePeriod) period40);
        boolean boolean46 = yearMonth18.isAfter((org.joda.time.ReadablePartial) yearMonth45);
        org.joda.time.Chronology chronology47 = yearMonth45.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.year();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology47.getZone();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField51 = chronology47.dayOfWeek();
        org.joda.time.YearMonth yearMonth52 = yearMonth16.withChronologyRetainFields(chronology47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(693, 79, 56336, 791, (-456825), chronology47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 791 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01" + "'", str24, "1970-01");
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertNotNull(yearMonth45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(yearMonth52);
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.secondOfMinute();
        boolean boolean15 = dateTimeField14.isSupported();
        int int17 = dateTimeField14.get(9L);
        int int18 = dateTimeField14.getMinimumValue();
        long long20 = dateTimeField14.remainder(3542400000L);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int12 = dateTimeZone10.getOffset((long) 2022);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 32770, dateTimeZone10);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = dateTime22.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str25 = dateTimeFieldType24.getName();
        org.joda.time.DateTime.Property property26 = dateTime23.property(dateTimeFieldType24);
        org.joda.time.DateTime dateTime27 = property26.roundFloorCopy();
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime27.getZone();
        long long31 = dateTimeZone10.getMillisKeepLocal(dateTimeZone29, (long) 9);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int38 = dateTimeZone36.getOffsetFromLocal((long) 6);
        long long40 = dateTimeZone33.getMillisKeepLocal(dateTimeZone36, (long) 10);
        long long42 = dateTimeZone10.getMillisKeepLocal(dateTimeZone36, (long) 1970);
        java.lang.String str44 = dateTimeZone36.getShortName((long) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter6.withZone(dateTimeZone36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter6.withPivotYear(56170);
        org.joda.time.format.DateTimeParser dateTimeParser48 = dateTimeFormatter47.getParser();
        java.lang.StringBuffer stringBuffer49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter47.printTo(stringBuffer49, (-456945L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21600000 + "'", int12 == 21600000);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "weekyear" + "'", str25, "weekyear");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9L + "'", long31 == 9L);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 21600000 + "'", int38 == 21600000);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L + "'", long40 == 10L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1970L + "'", long42 == 1970L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+06:00" + "'", str44, "+06:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNull(dateTimeParser48);
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean4 = dateTimeZone3.isFixed();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone3);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillis((long) 32772);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime14 = dateTime10.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.Interval interval16 = new org.joda.time.Interval(obj0, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology15.minutes();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 20, (long) 86397);
        org.joda.time.Period period22 = interval21.toPeriod();
        int[] intArray25 = chronology15.get((org.joda.time.ReadablePeriod) period22, (long) 31800000, (-2228L));
        org.joda.time.DurationField durationField26 = chronology15.weeks();
        org.joda.time.Chronology chronology27 = chronology15.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, -8, -50, -2, -228]");
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        java.util.Locale locale1 = new java.util.Locale("");
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.yearOfCentury();
        org.joda.time.LocalDate localDate6 = property4.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        int int9 = dateTimeField7.get((long) 'u');
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.lang.String str12 = dateTimeField7.getAsText((long) 5, locale11);
        java.lang.String str13 = locale1.getDisplayVariant(locale11);
        boolean boolean14 = locale11.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 70 + "'", int9 == 70);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "70" + "'", str12, "70");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DateTime.Property property25 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTime dateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology30 = chronology10.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField31 = chronology10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean35 = dateTimeZone34.isFixed();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone34);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTime dateTime39 = localDate36.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withMillis((long) 32772);
        org.joda.time.DateTime dateTime43 = dateTime41.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property44 = dateTime41.millisOfDay();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) dateTime41);
        long long47 = chronology10.set((org.joda.time.ReadablePartial) localDate45, (long) 18);
        org.joda.time.DateTimeField dateTimeField48 = chronology10.weekyearOfCentury();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "weekyear" + "'", str24, "weekyear");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 18L + "'", long47 == 18L);
        org.junit.Assert.assertNotNull(dateTimeField48);
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        int int15 = property12.getMaximumValueOverall();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = property12.getDifference(readableInstant16);
        org.joda.time.DateTime dateTime18 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes(1970);
        int int21 = dateTime20.getSecondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property24.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean29 = dateTimeZone28.isFixed();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtStartOfDay(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        org.joda.time.Chronology chronology33 = dateTime31.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.halfdays();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.monthOfYear();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property37 = localDate36.yearOfCentury();
        org.joda.time.LocalDate localDate38 = property37.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean42 = dateTimeZone41.isFixed();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.DateTime dateTime44 = localDate38.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = dateTime44.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str47 = dateTimeFieldType46.getName();
        org.joda.time.DateTime.Property property48 = dateTime45.property(dateTimeFieldType46);
        org.joda.time.DateTime dateTime49 = property48.roundFloorCopy();
        org.joda.time.DateTime.Property property50 = dateTime49.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone51 = dateTime49.getZone();
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        org.joda.time.Chronology chronology53 = chronology33.withZone(dateTimeZone51);
        org.joda.time.DurationField durationField54 = chronology33.seconds();
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType22.getField(chronology33);
        int int57 = dateTimeField55.getLeapAmount((long) 25156829);
        int int58 = dateTime20.get(dateTimeField55);
        long long60 = dateTimeField55.roundHalfFloor(204172348875145L);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyear" + "'", str11, "weekyear");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31800 + "'", int21 == 31800);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "weekyear" + "'", str47, "weekyear");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4 + "'", int58 == 4);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 204172336800000L + "'", long60 == 204172336800000L);
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str8 = dateTimeFieldType7.getName();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property12.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate15 = property12.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        boolean boolean17 = durationFieldType9.isSupported(chronology16);
        boolean boolean18 = dateTimeFieldType7.isSupported(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean25 = dateTimeZone24.isFixed();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = localDate21.toDateTimeAtStartOfDay(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime27.toMutableDateTime();
        org.joda.time.Chronology chronology29 = dateTime27.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.centuries();
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now(chronology29);
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType7.getField(chronology29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((-18994), 4, 2579938, 360240000, 12, 106, 6, chronology29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 360240000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "weekyear" + "'", str8, "weekyear");
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = yearMonth4.toInterval(dateTimeZone5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = yearMonth4.getFieldTypes();
        org.joda.time.YearMonth.Property property8 = yearMonth4.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = yearMonth4.toString(dateTimeFormatter9);
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = yearMonth12.toInterval(dateTimeZone13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = yearMonth12.getFieldTypes();
        org.joda.time.YearMonth.Property property16 = yearMonth12.year();
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = yearMonth20.toInterval(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.Interval interval24 = interval22.withPeriodAfterStart(readablePeriod23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = interval24.toPeriod(periodType25);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean28 = period26.isSupported(durationFieldType27);
        org.joda.time.YearMonth yearMonth30 = yearMonth18.withPeriodAdded((org.joda.time.ReadablePeriod) period26, 32770);
        org.joda.time.YearMonth yearMonth31 = yearMonth12.minus((org.joda.time.ReadablePeriod) period26);
        boolean boolean32 = yearMonth4.isAfter((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.Chronology chronology33 = yearMonth31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter2.withChronology(chronology33);
        org.joda.time.DurationField durationField36 = chronology33.months();
        org.joda.time.YearMonth yearMonth38 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.Interval interval40 = yearMonth38.toInterval(dateTimeZone39);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = yearMonth38.getFieldTypes();
        org.joda.time.YearMonth.Property property42 = yearMonth38.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = yearMonth38.toString(dateTimeFormatter43);
        org.joda.time.YearMonth yearMonth46 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.Interval interval48 = yearMonth46.toInterval(dateTimeZone47);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray49 = yearMonth46.getFieldTypes();
        org.joda.time.YearMonth.Property property50 = yearMonth46.year();
        org.joda.time.YearMonth yearMonth52 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.Interval interval56 = yearMonth54.toInterval(dateTimeZone55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.Interval interval58 = interval56.withPeriodAfterStart(readablePeriod57);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = interval58.toPeriod(periodType59);
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean62 = period60.isSupported(durationFieldType61);
        org.joda.time.YearMonth yearMonth64 = yearMonth52.withPeriodAdded((org.joda.time.ReadablePeriod) period60, 32770);
        org.joda.time.YearMonth yearMonth65 = yearMonth46.minus((org.joda.time.ReadablePeriod) period60);
        boolean boolean66 = yearMonth38.isAfter((org.joda.time.ReadablePartial) yearMonth65);
        org.joda.time.Chronology chronology67 = yearMonth65.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.year();
        org.joda.time.DateTimeZone dateTimeZone69 = chronology67.getZone();
        org.joda.time.Chronology chronology70 = chronology33.withZone(dateTimeZone69);
        long long74 = chronology70.add((-31449599990L), (long) 19, (int) 'a');
        org.joda.time.DateTimeField dateTimeField75 = chronology70.dayOfWeek();
        org.joda.time.DurationField durationField76 = chronology70.weeks();
        org.joda.time.DateTimeField dateTimeField77 = chronology70.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = dateTimeField77.getType();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01" + "'", str10, "1970-01");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01" + "'", str44, "1970-01");
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(yearMonth64);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-31449598147L) + "'", long74 == (-31449598147L));
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(durationField76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(dateTimeFieldType78);
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        java.util.Date date1 = new java.util.Date((long) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean5 = dateTimeZone4.isFixed();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone4);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTime dateTime9 = localDate6.toDateTimeAtMidnight(dateTimeZone8);
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.DateMidnight dateMidnight11 = dateTime9.toDateMidnight();
        java.util.Date date12 = dateMidnight11.toDate();
        boolean boolean13 = date1.before(date12);
        date12.setMinutes((int) (short) 1);
        java.time.Instant instant16 = date12.toInstant();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T00:00:00.000+06:00" + "'", str10, "1970-01-01T00:00:00.000+06:00");
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 18:01:00 UTC 1969");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant16);
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean4 = dateTimeZone3.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) 6);
        long long10 = dateTimeZone3.getMillisKeepLocal(dateTimeZone6, (long) 10);
        org.joda.time.Interval interval11 = localDate1.toInterval(dateTimeZone3);
        org.joda.time.DateTime dateTime12 = localDate0.toDateTimeAtMidnight(dateTimeZone3);
        java.lang.String str13 = dateTimeZone3.toString();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone3);
        java.lang.String str16 = dateTimeZone3.getName((-1514786399958L));
        java.lang.String str18 = dateTimeZone3.getShortName(772L);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21600000 + "'", int8 == 21600000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+06:00" + "'", str13, "+06:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+06:00" + "'", str16, "+06:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+06:00" + "'", str18, "+06:00");
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime19.withMillis((long) 86397);
        org.joda.time.DateTime dateTime42 = dateTime40.minusYears(2011);
        org.joda.time.DateTime dateTime44 = dateTime42.plusYears(4);
        org.joda.time.DateTime.Property property45 = dateTime44.hourOfDay();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property47 = localDate46.yearOfCentury();
        org.joda.time.LocalDate localDate48 = property47.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean52 = dateTimeZone51.isFixed();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone51);
        org.joda.time.DateTime dateTime54 = localDate48.toDateTimeAtStartOfDay(dateTimeZone51);
        org.joda.time.DateTime dateTime55 = dateTime54.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property56 = dateTime55.year();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property58 = localDate57.yearOfCentury();
        org.joda.time.LocalDate localDate59 = property58.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean63 = dateTimeZone62.isFixed();
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone62);
        org.joda.time.DateTime dateTime65 = localDate59.toDateTimeAtStartOfDay(dateTimeZone62);
        org.joda.time.DateTime dateTime66 = dateTime65.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str68 = dateTimeFieldType67.getName();
        org.joda.time.DateTime.Property property69 = dateTime66.property(dateTimeFieldType67);
        org.joda.time.Interval interval70 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime72 = dateTime66.plusWeeks(98);
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property74 = localDate73.yearOfCentury();
        org.joda.time.LocalDate localDate75 = property74.getLocalDate();
        java.lang.String str76 = property74.getName();
        long long77 = property74.remainder();
        int int78 = property74.getMinimumValue();
        org.joda.time.LocalDate localDate79 = property74.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = property74.getFieldType();
        java.util.Locale locale81 = java.util.Locale.FRANCE;
        java.lang.String str82 = locale81.getCountry();
        java.util.Locale locale83 = locale81.stripExtensions();
        int int84 = property74.getMaximumTextLength(locale81);
        org.joda.time.DateTimeField dateTimeField85 = property74.getField();
        int int86 = dateTimeField85.getMinimumValue();
        boolean boolean88 = dateTimeField85.isLeap((-58790469600000L));
        int int89 = dateTime72.get(dateTimeField85);
        int int90 = property45.compareTo((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime dateTime92 = property45.addToCopy((long) 50627);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21600000 + "'", int16 == 21600000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 11 + "'", int35 == 11);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "weekyear" + "'", str68, "weekyear");
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "yearOfCentury" + "'", str76, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 3542400000L + "'", long77 == 3542400000L);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(localDate79);
        org.junit.Assert.assertNotNull(dateTimeFieldType80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "FR" + "'", str82, "FR");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2 + "'", int84 == 2);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 23 + "'", int89 == 23);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertNotNull(dateTime92);
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean7 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology8 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getScript();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear(56156);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTime dateTime21 = localDate18.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int30 = dateTimeZone28.getOffsetFromLocal((long) 6);
        long long32 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) 10);
        org.joda.time.DateTime dateTime33 = dateTime23.withZone(dateTimeZone28);
        org.joda.time.DateTime.Property property34 = dateTime33.weekOfWeekyear();
        org.joda.time.DateTime dateTime36 = dateTime33.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime38 = dateTime33.plusMillis(6);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property40 = localDate39.yearOfCentury();
        org.joda.time.LocalDate localDate41 = property40.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean45 = dateTimeZone44.isFixed();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = localDate41.toDateTimeAtStartOfDay(dateTimeZone44);
        boolean boolean48 = dateTime47.isBeforeNow();
        int int49 = dateTime47.getDayOfMonth();
        org.joda.time.DateTime dateTime51 = dateTime47.minusYears(48);
        int int52 = dateTime33.compareTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime54 = dateTime33.withMillis((long) 86397);
        org.joda.time.DateTime dateTime56 = dateTime33.withYear(1980);
        org.joda.time.DateTime dateTime58 = dateTime56.minusWeeks(2922789);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = dateTimeFormatter11.print((org.joda.time.ReadableInstant) dateTime56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21600000 + "'", int30 == 21600000);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 11 + "'", int49 == 11);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight(dateTimeZone6);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateMidnight dateMidnight9 = dateTime7.toDateMidnight();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        int int11 = dateTime7.getMinuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime7.plusWeeks((-292275054));
        org.joda.time.DateTime dateTime14 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = dateTime14.minusMonths(56182);
        org.joda.time.DateTime dateTime18 = dateTime14.plus(11L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01T00:00:00.000+06:00" + "'", str8, "1970-01-01T00:00:00.000+06:00");
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone8);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTime dateTime13 = localDate10.toDateTimeAtCurrentTime(dateTimeZone12);
        boolean boolean14 = localDate5.equals((java.lang.Object) dateTime13);
        java.util.Date date15 = localDate5.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getRangeDurationType();
        boolean boolean18 = localDate5.isSupported(dateTimeFieldType16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = localDate23.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.LocalDate localDate35 = localDate23.minusYears(10);
        boolean boolean36 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate39 = localDate35.withFieldAdded(durationFieldType37, 70);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property41 = localDate40.yearOfCentury();
        org.joda.time.LocalDate localDate42 = property41.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean46 = dateTimeZone45.isFixed();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone45);
        org.joda.time.DateTime dateTime48 = localDate42.toDateTimeAtStartOfDay(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime48.toMutableDateTime();
        org.joda.time.Chronology chronology50 = dateTime48.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.halfdays();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.monthOfYear();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property54 = localDate53.yearOfCentury();
        org.joda.time.LocalDate localDate55 = property54.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean59 = dateTimeZone58.isFixed();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone58);
        org.joda.time.DateTime dateTime61 = localDate55.toDateTimeAtStartOfDay(dateTimeZone58);
        org.joda.time.DateTime dateTime62 = dateTime61.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str64 = dateTimeFieldType63.getName();
        org.joda.time.DateTime.Property property65 = dateTime62.property(dateTimeFieldType63);
        org.joda.time.DateTime dateTime66 = property65.roundFloorCopy();
        org.joda.time.DateTime.Property property67 = dateTime66.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime66.getZone();
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        org.joda.time.Chronology chronology70 = chronology50.withZone(dateTimeZone68);
        org.joda.time.DateTimeField dateTimeField71 = chronology70.clockhourOfHalfday();
        org.joda.time.DurationField durationField72 = chronology70.seconds();
        boolean boolean73 = durationFieldType37.isSupported(chronology70);
        org.joda.time.DateTimeField dateTimeField74 = chronology70.year();
        org.joda.time.DateTimeField dateTimeField75 = chronology70.dayOfMonth();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate(0L);
        int int78 = dateTimeField75.getMaximumValue((org.joda.time.ReadablePartial) localDate77);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Feb 11 00:00:00 UTC 2099");
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "weekyear" + "'", str64, "weekyear");
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(timeZone69);
        org.junit.Assert.assertEquals(timeZone69.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 31 + "'", int78 == 31);
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 33353);
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property2 = localDate1.yearOfCentury();
        org.joda.time.LocalDate localDate3 = property2.getLocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) 'u');
        org.joda.time.LocalDate.Property property6 = localDate3.era();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtMidnight(dateTimeZone20);
        long long26 = dateTimeZone8.getMillisKeepLocal(dateTimeZone20, (long) 9);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone8.isLocalDateTimeGap(localDateTime28);
        org.joda.time.DateTime dateTime30 = localDate3.toDateTimeAtStartOfDay(dateTimeZone8);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(315532800002L, dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType33 = localDate31.getFieldType((-11865376));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -11865376");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9L + "'", long26 == 9L);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        org.joda.time.LocalDate localDate15 = dateTime13.toLocalDate();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property17.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = localDate18.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.LocalDate localDate26 = localDate18.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property27 = localDate18.dayOfMonth();
        org.joda.time.DateTime dateTime28 = localDate18.toDateTimeAtStartOfDay();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDate18.toDateTime(readableInstant29);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfCentury();
        org.joda.time.LocalDate localDate33 = property32.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean37 = dateTimeZone36.isFixed();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone36);
        org.joda.time.DateTime dateTime39 = localDate33.toDateTimeAtStartOfDay(dateTimeZone36);
        org.joda.time.DateTime dateTime40 = dateTime39.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property41 = dateTime40.year();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property43 = localDate42.yearOfCentury();
        org.joda.time.LocalDate localDate44 = property43.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean48 = dateTimeZone47.isFixed();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = localDate44.toDateTimeAtStartOfDay(dateTimeZone47);
        org.joda.time.DateTime dateTime51 = dateTime50.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str53 = dateTimeFieldType52.getName();
        org.joda.time.DateTime.Property property54 = dateTime51.property(dateTimeFieldType52);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime51);
        int int56 = dateTime51.getHourOfDay();
        boolean boolean57 = dateTime51.isBeforeNow();
        org.joda.time.YearMonthDay yearMonthDay58 = dateTime51.toYearMonthDay();
        org.joda.time.DateTime dateTime60 = dateTime51.plusHours(2011);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone63);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Interval interval66 = interval64.withChronology(chronology65);
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property68 = localDate67.yearOfCentury();
        org.joda.time.LocalDate localDate69 = property68.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean73 = dateTimeZone72.isFixed();
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone72);
        org.joda.time.DateTime dateTime75 = localDate69.toDateTimeAtStartOfDay(dateTimeZone72);
        org.joda.time.DateTime dateTime76 = dateTime75.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property77 = dateTime76.year();
        boolean boolean78 = interval66.contains((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Period period79 = interval66.toPeriod();
        org.joda.time.DateTime dateTime80 = dateTime51.minus((org.joda.time.ReadablePeriod) period79);
        org.joda.time.DateTime dateTime81 = dateTime30.minus((org.joda.time.ReadablePeriod) period79);
        org.joda.time.DateTime dateTime82 = dateTime13.plus((org.joda.time.ReadablePeriod) period79);
        org.joda.time.DateTime dateTime85 = dateTime82.withDurationAdded((long) 56156, 56156);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval86 = new org.joda.time.Interval((java.lang.Object) 56156);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyear" + "'", str11, "weekyear");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "weekyear" + "'", str53, "weekyear");
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(yearMonthDay58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDate69);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime85);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight(dateTimeZone6);
        int int8 = dateTime7.getMonthOfYear();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTime dateTime11 = dateTime7.toDateTime(dateTimeZone10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property13 = localDate12.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtStartOfDay(dateTimeZone17);
        boolean boolean21 = dateTime20.isBeforeNow();
        int int22 = dateTime20.getDayOfYear();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property24 = dateTime11.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone27);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTime dateTime32 = localDate29.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withMillis((long) 32772);
        org.joda.time.DateTime dateTime36 = dateTime34.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime38 = dateTime34.withSecondOfMinute((int) (short) 10);
        long long39 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime40 = property24.getDateTime();
        int int41 = dateTime40.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 42 + "'", int22 == 42);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-360L) + "'", long39 == (-360L));
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.lang.String str6 = property5.toString();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth11 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Interval interval13 = yearMonth11.toInterval(dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.Interval interval15 = interval13.withPeriodAfterStart(readablePeriod14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = interval15.toPeriod(periodType16);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean19 = period17.isSupported(durationFieldType18);
        org.joda.time.YearMonth yearMonth21 = yearMonth9.withPeriodAdded((org.joda.time.ReadablePeriod) period17, 32770);
        org.joda.time.YearMonth.Property property22 = yearMonth9.monthOfYear();
        org.joda.time.YearMonth yearMonth24 = yearMonth9.plusYears(0);
        int int25 = property5.compareTo((org.joda.time.ReadablePartial) yearMonth24);
        org.joda.time.DateTimeField dateTimeField26 = property5.getField();
        int int27 = property5.getMaximumValueOverall();
        org.joda.time.YearMonth yearMonth29 = property5.addToCopy(56703);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[year]" + "'", str6, "Property[year]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 292278993 + "'", int27 == 292278993);
        org.junit.Assert.assertNotNull(yearMonth29);
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) (byte) 10);
        java.util.Date date6 = calendar3.getTime();
        java.util.Date date12 = new java.util.Date((int) (short) 0, (-1), (-292275054), (int) (byte) 10, (int) 'u');
        int int13 = date12.getSeconds();
        boolean boolean14 = date6.after(date12);
        int int15 = date12.getMonth();
        date12.setDate(479);
        java.util.Date date21 = new java.util.Date((-34), 0, 42);
        date21.setHours(316);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = date12.after(date21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: sun.util.calendar.JulianCalendar$Date cannot be cast to sun.util.calendar.Gregorian$Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=32770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:32 UTC 1970");
        org.junit.Assert.assertEquals(date12.toString(), "Sat Sep 22 11:57:00 UTC 798306");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Feb 24 04:00:00 UTC 1866");
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime11.centuryOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.minusYears(2000);
        org.joda.time.DateTime dateTime15 = dateTime11.toDateTimeISO();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean5 = dateTimeZone4.isFixed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int9 = dateTimeZone7.getOffsetFromLocal((long) 6);
        long long11 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) 10);
        org.joda.time.Interval interval12 = localDate2.toInterval(dateTimeZone4);
        org.joda.time.DateTime dateTime13 = localDate1.toDateTimeAtMidnight(dateTimeZone4);
        java.lang.String str14 = dateTimeZone4.toString();
        long long16 = dateTimeZone4.nextTransition((long) 0);
        boolean boolean18 = dateTimeZone4.isStandardOffset(31535997772L);
        long long21 = dateTimeZone4.convertLocalToUTC((long) 22, true);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean25 = dateTimeZone24.isFixed();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone24);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTime dateTime29 = localDate26.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusYears(2022);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property33 = localDate32.yearOfCentury();
        org.joda.time.LocalDate localDate34 = property33.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean38 = dateTimeZone37.isFixed();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = localDate34.toDateTimeAtStartOfDay(dateTimeZone37);
        org.joda.time.DateTime dateTime41 = dateTime40.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property42 = dateTime41.year();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfCentury();
        org.joda.time.LocalDate localDate45 = property44.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean49 = dateTimeZone48.isFixed();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = localDate45.toDateTimeAtStartOfDay(dateTimeZone48);
        org.joda.time.DateTime dateTime52 = dateTime51.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str54 = dateTimeFieldType53.getName();
        org.joda.time.DateTime.Property property55 = dateTime52.property(dateTimeFieldType53);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime dateTime58 = dateTime41.minusDays(32772);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean62 = dateTimeZone61.isFixed();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone61);
        java.util.TimeZone timeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.DateTime dateTime66 = localDate63.toDateTimeAtCurrentTime(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.withMillis((long) 32772);
        org.joda.time.DateTime dateTime70 = dateTime68.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime72 = dateTime70.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.Interval interval76 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone75);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.Interval interval78 = interval76.withChronology(chronology77);
        org.joda.time.Duration duration79 = interval76.toDuration();
        org.joda.time.DateTime dateTime80 = dateTime72.plus((org.joda.time.ReadableDuration) duration79);
        org.joda.time.DateTime dateTime82 = dateTime41.withDurationAdded((org.joda.time.ReadableDuration) duration79, (int) 'u');
        org.joda.time.DateTime dateTime84 = dateTime31.withDurationAdded((org.joda.time.ReadableDuration) duration79, (int) '4');
        int int85 = dateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((long) 20, dateTimeZone4);
        boolean boolean87 = dateTime86.isAfterNow();
        org.joda.time.DateTime dateTime89 = dateTime86.plusMinutes(0);
        org.joda.time.DateTime dateTime92 = dateTime86.withDurationAdded(13162780800000L, 56675);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21600000 + "'", int9 == 21600000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+06:00" + "'", str14, "+06:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-21599978L) + "'", long21 == (-21599978L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "weekyear" + "'", str54, "weekyear");
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 21600000 + "'", int85 == 21600000);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(dateTime92);
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 292278994);
        java.util.Date date17 = dateTime11.toDate();
        int int18 = dateTime11.getMillisOfDay();
        org.joda.time.DateTime.Property property19 = dateTime11.yearOfCentury();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        java.lang.String str23 = property21.getName();
        long long24 = property21.remainder();
        int int25 = property21.getMinimumValue();
        org.joda.time.LocalDate localDate26 = property21.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property21.getFieldType();
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale28.getCountry();
        java.util.Locale locale30 = locale28.stripExtensions();
        int int31 = property21.getMaximumTextLength(locale28);
        org.joda.time.DateTimeField dateTimeField32 = property21.getField();
        boolean boolean33 = property19.equals((java.lang.Object) property21);
        org.joda.time.DateTime dateTime34 = property19.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 23:59:57 UTC 1969");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21597772 + "'", int18 == 21597772);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "yearOfCentury" + "'", str23, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3542400000L + "'", long24 == 3542400000L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FR" + "'", str29, "FR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate4 = property2.addToCopy(56182);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone7);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 32772);
        org.joda.time.DateTime.Property property15 = dateTime12.secondOfDay();
        org.joda.time.DateTime dateTime17 = dateTime12.plusYears(1970);
        long long18 = dateTime12.getMillis();
        org.joda.time.DateTime dateTime20 = dateTime12.plusMinutes(99);
        boolean boolean21 = localDate4.equals((java.lang.Object) dateTime12);
        java.util.Date date22 = localDate4.toDate();
        date22.setTime((long) 309);
        int int25 = date22.getDate();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35110079L + "'", long18 == 35110079L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(32772);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate12);
        int int14 = localDate5.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate5.withDayOfMonth(1964);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1964 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.plusYears(1970);
        long long13 = dateTime7.getMillis();
        org.joda.time.DateTime dateTime15 = dateTime7.plusMinutes(99);
        org.joda.time.DateTime.Property property16 = dateTime7.era();
        org.joda.time.DateTime dateTime18 = dateTime7.withDayOfYear((int) 'x');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35110105L + "'", long13 == 35110105L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder0.build();
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        java.lang.String str9 = property7.getName();
        long long10 = property7.remainder();
        int int11 = property7.getMinimumValue();
        org.joda.time.LocalDate localDate13 = property7.addToCopy(12);
        org.joda.time.LocalDate localDate14 = property7.roundHalfEvenCopy();
        boolean boolean15 = calendar3.after((java.lang.Object) property7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=32770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "yearOfCentury" + "'", str9, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3542400000L + "'", long10 == 3542400000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DateTime.Property property25 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTime dateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology30 = chronology10.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfHalfday();
        org.joda.time.DurationField durationField32 = chronology30.seconds();
        org.joda.time.DurationField durationField33 = chronology30.halfdays();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology30.getZone();
        org.joda.time.DateTimeField dateTimeField35 = chronology30.dayOfWeek();
        long long38 = dateTimeField35.getDifferenceAsLong(0L, (long) 17);
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("ko_KR");
        java.lang.String str42 = dateTimeField35.getAsShortText(25939872000100L, locale41);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "weekyear" + "'", str24, "weekyear");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+06:00");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Thu" + "'", str42, "Thu");
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffset((long) 2022);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 32770, dateTimeZone14);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfCentury();
        org.joda.time.LocalDate localDate20 = property19.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = localDate20.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.DateTime dateTime27 = dateTime26.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str29 = dateTimeFieldType28.getName();
        org.joda.time.DateTime.Property property30 = dateTime27.property(dateTimeFieldType28);
        org.joda.time.DateTime dateTime31 = property30.roundFloorCopy();
        org.joda.time.DateTime.Property property32 = dateTime31.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime31.getZone();
        long long35 = dateTimeZone14.getMillisKeepLocal(dateTimeZone33, (long) 9);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean38 = dateTimeZone37.isFixed();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int42 = dateTimeZone40.getOffsetFromLocal((long) 6);
        long long44 = dateTimeZone37.getMillisKeepLocal(dateTimeZone40, (long) 10);
        long long46 = dateTimeZone14.getMillisKeepLocal(dateTimeZone40, (long) 1970);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter9.withZone(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int52 = dateTimeZone50.getOffset((long) 2022);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 32770, dateTimeZone50);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property55 = localDate54.yearOfCentury();
        org.joda.time.LocalDate localDate56 = property55.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean60 = dateTimeZone59.isFixed();
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone59);
        org.joda.time.DateTime dateTime62 = localDate56.toDateTimeAtStartOfDay(dateTimeZone59);
        org.joda.time.DateTime dateTime63 = dateTime62.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str65 = dateTimeFieldType64.getName();
        org.joda.time.DateTime.Property property66 = dateTime63.property(dateTimeFieldType64);
        org.joda.time.DateTime dateTime67 = property66.roundFloorCopy();
        org.joda.time.DateTime.Property property68 = dateTime67.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone69 = dateTime67.getZone();
        long long71 = dateTimeZone50.getMillisKeepLocal(dateTimeZone69, (long) 9);
        long long74 = dateTimeZone50.convertLocalToUTC(146817598379000L, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter47.withZone(dateTimeZone50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(56170, 0, 1964, 56626, 64, (-52), 34334, dateTimeZone50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56626 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21600000 + "'", int16 == 21600000);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "weekyear" + "'", str29, "weekyear");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9L + "'", long35 == 9L);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 21600000 + "'", int42 == 21600000);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1970L + "'", long46 == 1970L);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 21600000 + "'", int52 == 21600000);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "weekyear" + "'", str65, "weekyear");
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 9L + "'", long71 == 9L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 146817576779000L + "'", long74 == 146817576779000L);
        org.junit.Assert.assertNotNull(dateTimeFormatter75);
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 41656012, dateTimeZone1);
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone8);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTime dateTime13 = localDate10.toDateTimeAtCurrentTime(dateTimeZone12);
        boolean boolean14 = localDate5.equals((java.lang.Object) dateTime13);
        java.util.Date date15 = localDate5.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getRangeDurationType();
        boolean boolean18 = localDate5.isSupported(dateTimeFieldType16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = localDate23.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.LocalDate localDate35 = localDate23.minusYears(10);
        boolean boolean36 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate39 = localDate35.withFieldAdded(durationFieldType37, 70);
        org.joda.time.DateTimeField[] dateTimeFieldArray40 = localDate35.getFields();
        java.lang.String str42 = localDate35.toString("+08:00");
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfCentury();
        org.joda.time.LocalDate.Property property45 = localDate43.yearOfCentury();
        org.joda.time.LocalDate localDate47 = property45.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str48 = property45.getAsString();
        int int49 = property45.getMaximumValue();
        org.joda.time.LocalDate localDate50 = property45.roundCeilingCopy();
        org.joda.time.LocalDate localDate51 = property45.roundFloorCopy();
        org.joda.time.LocalDate localDate53 = property45.addWrapFieldToCopy(21600000);
        org.joda.time.LocalDate localDate54 = localDate35.withFields((org.joda.time.ReadablePartial) localDate53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate56 = localDate53.withDayOfMonth(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Feb 11 00:00:00 UTC 2099");
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTimeFieldArray40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+08:00" + "'", str42, "+08:00");
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "22" + "'", str48, "22");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 99 + "'", int49 == 99);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate54);
    }
}
