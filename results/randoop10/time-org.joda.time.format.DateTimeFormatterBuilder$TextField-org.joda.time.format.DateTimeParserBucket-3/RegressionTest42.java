import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest42 {

    public static boolean debug = false;

    @Test
    public void test21001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21001");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.months();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfDay();
        long long6 = dateTimeField4.roundHalfFloor(26446506L);
        long long8 = dateTimeField4.roundHalfFloor((long) 69259);
        int int10 = dateTimeField4.getMinimumValue(1645456491805L);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200000L + "'", long6 == 25200000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test21002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21002");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = dateTime5.withZone(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plus(readableDuration16);
        org.joda.time.DateTime dateTime18 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusMonths((-1834413003));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType22 = localDateTime15.getFieldType(2514);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2514");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test21003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21003");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.DurationField durationField7 = property6.getDurationField();
        boolean boolean8 = durationField7.isPrecise();
        boolean boolean9 = durationField7.isPrecise();
        long long12 = durationField7.getMillis(54439, (long) (byte) 10);
        long long15 = durationField7.getDifferenceAsLong((long) 69043, 1645455978838L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3266340000L + "'", long12 == 3266340000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-27424265L) + "'", long15 == (-27424265L));
    }

    @Test
    public void test21004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21004");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime9.plusMinutes(977);
        long long16 = dateTime9.getMillis();
        org.joda.time.Chronology chronology17 = dateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.year();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1586790968598L + "'", long16 == 1586790968598L);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test21005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21005");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours((int) (byte) 0);
        boolean boolean6 = dateTime4.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) 'a');
        boolean boolean11 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime();
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.months();
        org.joda.time.Chronology chronology15 = chronology13.withUTC();
        org.joda.time.DurationField durationField16 = chronology15.minutes();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.yearOfEra();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) 1669974350889600000L, chronology15);
        org.joda.time.DurationField durationField20 = chronology15.weeks();
        long long22 = durationField20.getMillis(54373L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32884790400000L + "'", long22 == 32884790400000L);
    }

    @Test
    public void test21006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21006");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = property3.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekyear((-1));
        org.joda.time.DateTime dateTime12 = dateTime10.plusMonths(10);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        int int14 = dateTime12.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = dateTime12.withZone(dateTimeZone16);
        org.joda.time.DateTime.Property property19 = dateTime12.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int21 = dateTime12.get(dateTimeFieldType20);
        boolean boolean22 = localDateTime6.isSupported(dateTimeFieldType20);
        java.lang.String str23 = dateTimeFieldType20.getName();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType20.getDurationType();
        java.lang.String str25 = durationFieldType24.toString();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "minuteOfHour" + "'", str23, "minuteOfHour");
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "minutes" + "'", str25, "minutes");
    }

    @Test
    public void test21007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21007");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(213);
        long long4 = dateTimeZone1.adjustOffset((-1645487999148L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1645487999148L) + "'", long4 == (-1645487999148L));
    }

    @Test
    public void test21008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21008");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy((int) (short) -1);
        int int6 = localDateTime5.getEra();
        int int7 = localDateTime5.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.weekyear();
        int int9 = localDateTime5.size();
        java.lang.Object obj12 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.era();
        boolean boolean19 = localDateTime17.isSupported(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.secondOfMinute();
        boolean boolean25 = dateTimeFieldType18.isSupported(chronology22);
        org.joda.time.DateTimeField dateTimeField26 = chronology22.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(obj12, chronology22);
        org.joda.time.DurationField durationField28 = chronology22.minutes();
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(196545600000L, chronology22, locale29, (java.lang.Integer) 194, 289);
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        boolean boolean34 = locale33.hasExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 647, chronology22, locale33);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.era();
        boolean boolean42 = localDateTime40.isSupported(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.secondOfMinute();
        boolean boolean48 = dateTimeFieldType41.isSupported(chronology45);
        org.joda.time.DateTimeField dateTimeField49 = chronology45.clockhourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = dateTimeField49.getType();
        java.lang.String str51 = dateTimeFieldType50.getName();
        dateTimeParserBucket35.saveField(dateTimeFieldType50, 569);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant55 = null;
        int int56 = dateTimeZone54.getOffset(readableInstant55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.LocalDateTime.Property property61 = localDateTime59.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = property61.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.era();
        boolean boolean64 = localDateTime62.isSupported(dateTimeFieldType63);
        java.util.Date date65 = localDateTime62.toDate();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime62.plusSeconds(4);
        org.joda.time.LocalDateTime.Property property68 = localDateTime62.yearOfEra();
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime62.withDurationAdded(readableDuration69, 784);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime62.withYear(54625758);
        org.joda.time.DateTimeField[] dateTimeFieldArray74 = localDateTime62.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType76 = dateTimeFieldType75.getRangeDurationType();
        boolean boolean77 = localDateTime62.isSupported(dateTimeFieldType75);
        int int78 = dateTime57.get(dateTimeFieldType75);
        dateTimeParserBucket35.saveField(dateTimeFieldType75, 768);
        int int81 = localDateTime5.get(dateTimeFieldType75);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "clockhourOfDay" + "'", str51, "clockhourOfDay");
        org.junit.Assert.assertNotNull(dateTimeZone54);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:00:01 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(dateTimeFieldArray74);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertNotNull(durationFieldType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 16 + "'", int78 == 16);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test21009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21009");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("54628033");
        java.util.TimeZone.setDefault(timeZone1);
        boolean boolean3 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Ora media di Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test21010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(54614532, 54588, 54921, 54602265, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54602265 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21011");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = dateTime5.withZone(dateTimeZone9);
        org.joda.time.DateTime.Property property12 = dateTime5.yearOfEra();
        org.joda.time.DateTime.Property property13 = dateTime5.year();
        org.joda.time.DateTime dateTime15 = dateTime5.plusMonths(60588345);
        org.joda.time.DateTime dateTime17 = dateTime5.plusYears(0);
        int int18 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime17.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekyear((-1));
        org.joda.time.DateTime dateTime25 = dateTime21.plusHours((int) (byte) 100);
        boolean boolean27 = dateTime25.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime25.toMutableDateTime(dateTimeZone28);
        int int30 = dateTime25.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime25.minus(readableDuration31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMonths(60590228);
        org.joda.time.DateTime dateTime36 = dateTime32.withYearOfEra(52);
        org.joda.time.DateTime dateTime38 = dateTime36.plusDays(2000);
        boolean boolean39 = dateTimeZone19.equals((java.lang.Object) dateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25 + "'", int30 == 25);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test21012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21012");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours((int) (byte) 0);
        boolean boolean14 = dateTime12.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime12.toMutableDateTime(dateTimeZone15);
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.lang.String str20 = dateTimeZone15.getName((long) (byte) 1, locale19);
        java.lang.String str21 = locale19.getScript();
        java.lang.String str22 = locale8.getDisplayScript(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 54596, chronology5, locale19, (java.lang.Integer) 212, (-948));
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket25.getZone();
        java.lang.String str27 = dateTimeZone26.toString();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone26);
        int int29 = dateTime28.getHourOfDay();
        org.joda.time.DateTime dateTime31 = dateTime28.withWeekyear(106);
        org.joda.time.DateTime dateTime32 = dateTime28.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.052" + "'", str20, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.052" + "'", str27, "+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test21013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21013");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfDay();
        org.joda.time.DurationField durationField15 = chronology12.millis();
        org.joda.time.DurationField durationField16 = chronology12.years();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology12);
        int int18 = localDateTime17.getCenturyOfEra();
        org.joda.time.Chronology chronology19 = localDateTime17.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test21014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21014");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket5.saveField(dateTimeField6, (int) (short) 0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale11, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket14.saveField(dateTimeField15, (int) (short) 0);
        java.lang.Integer int18 = dateTimeParserBucket14.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket14.setZone(dateTimeZone19);
        dateTimeParserBucket5.setZone(dateTimeZone19);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.millisOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.monthOfYear();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology31);
        java.lang.String str33 = chronology31.toString();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        org.joda.time.Chronology chronology37 = chronology31.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField38 = chronology31.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = chronology31.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(35999999L, chronology31);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.LocalDateTime.Property property44 = localDateTime42.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = property44.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime47 = property44.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property50 = localDateTime47.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime51 = property50.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int53 = localDateTime51.indexOf(dateTimeFieldType52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.yearOfCentury();
        boolean boolean55 = localDateTime40.equals((java.lang.Object) property54);
        org.joda.time.LocalDateTime localDateTime56 = property54.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.LocalDateTime.Property property61 = localDateTime59.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = property61.roundHalfEvenCopy();
        int int63 = localDateTime62.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology66 = localDateTime65.getChronology();
        org.joda.time.LocalDateTime localDateTime67 = org.joda.time.LocalDateTime.now(chronology66);
        org.joda.time.DateTimeField dateTimeField68 = chronology66.secondOfMinute();
        org.joda.time.DurationField durationField69 = dateTimeField68.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) 0);
        int[] intArray76 = localDateTime75.getValues();
        int int77 = dateTimeField68.getMaximumValue((org.joda.time.ReadablePartial) localDateTime71, intArray76);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime71.minusSeconds((int) 'u');
        org.joda.time.LocalDateTime localDateTime80 = localDateTime62.withFields((org.joda.time.ReadablePartial) localDateTime71);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime62.withMillisOfDay(2);
        org.joda.time.LocalDateTime.Property property83 = localDateTime82.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime85 = property83.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.minusMinutes(54421);
        int[] intArray88 = localDateTime87.getValues();
        int[] intArray90 = dateTimeField27.add((org.joda.time.ReadablePartial) localDateTime56, 54503294, intArray88, 62096661);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ISOChronology[UTC]" + "'", str33, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNull(durationField69);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(intArray76);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[1970, 1, 1, 52]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 59 + "'", int77 == 59);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(localDateTime85);
        org.junit.Assert.assertNotNull(localDateTime87);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1969, 11, 24, 17940002]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[5176691, 8, 24, 17940002]");
    }

    @Test
    public void test21015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21015");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology8);
        java.lang.String str10 = chronology8.toString();
        org.joda.time.DurationField durationField11 = chronology8.hours();
        int int12 = durationField5.compareTo(durationField11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology15);
        java.lang.String str17 = chronology15.toString();
        org.joda.time.DurationField durationField18 = chronology15.hours();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology21);
        java.lang.String str23 = chronology21.toString();
        org.joda.time.DurationField durationField24 = chronology21.hours();
        int int25 = durationField18.compareTo(durationField24);
        int int26 = durationField5.compareTo(durationField24);
        int int29 = durationField24.getDifference(10L, (long) 104);
        boolean boolean30 = durationField24.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) durationField24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[UTC]" + "'", str10, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[UTC]" + "'", str17, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ISOChronology[UTC]" + "'", str23, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test21016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21016");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.weekyear();
        boolean boolean19 = dateTime13.equals((java.lang.Object) localDateTime15);
        org.joda.time.DateTime dateTime21 = dateTime13.minusMonths(54616882);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfSecond();
        org.joda.time.DateTime dateTime24 = dateTime21.plusDays(54648495);
        org.joda.time.DateTime dateTime26 = dateTime24.minus(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test21017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21017");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(chronology4);
        java.lang.String str6 = chronology4.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.Chronology chronology10 = chronology4.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField11 = chronology4.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology4.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(35999999L, chronology4);
        boolean boolean14 = durationFieldType0.isSupported(chronology4);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = durationFieldType0.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.year();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.era();
        org.joda.time.DurationField durationField23 = chronology17.weeks();
        org.joda.time.Chronology chronology24 = chronology17.withUTC();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[UTC]" + "'", str6, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test21018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21018");
        java.util.Locale locale1 = new java.util.Locale("1970-01-01T02:00:00.052+00:00:00.052");
        org.junit.Assert.assertEquals(locale1.toString(), "1970-01-01t02:00:00.052+00:00:00.052");
    }

    @Test
    public void test21019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21019");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minus(readablePeriod4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekyear(429);
        int int8 = localDateTime7.getDayOfWeek();
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime7.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withCenturyOfEra(61252384);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 61252384 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
    }

    @Test
    public void test21020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21020");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.weekyear();
        boolean boolean19 = dateTime13.equals((java.lang.Object) localDateTime15);
        org.joda.time.DateTime dateTime21 = dateTime13.minusMonths(54616882);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime26 = property23.addToCopy((long) (-4549387));
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, 54823755);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test21021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21021");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.millisOfSecond();
        org.joda.time.DurationField durationField16 = chronology12.seconds();
        org.joda.time.DurationField durationField17 = chronology12.centuries();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.millisOfSecond();
        org.joda.time.DurationField durationField19 = chronology12.years();
        org.joda.time.Chronology chronology20 = chronology12.withUTC();
        org.joda.time.DurationField durationField21 = chronology20.months();
        boolean boolean22 = durationFieldType9.isSupported(chronology20);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(62135596800972L, chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = chronology20.clockhourOfHalfday();
        org.joda.time.DateTime dateTime26 = dateTime1.withChronology(chronology20);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = chronology20.getDateTimeMillis(69242727, 1565, 2025, 54498732, 54459348, 433, 910);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54498732 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-21T15:16:08.858+00:00:00.052" + "'", str7, "2022-02-21T15:16:08.858+00:00:00.052");
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test21022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21022");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property19 = dateTime16.centuryOfEra();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = property19.getAsText(locale20);
        java.lang.String str23 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime13, (-1), locale20);
        boolean boolean24 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusDays(212);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusHours((int) ' ');
        boolean boolean34 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime13.plus(readablePeriod35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusSeconds(54612102);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "20" + "'", str22, "20");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
    }

    @Test
    public void test21023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21023");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.dayOfWeek();
        org.joda.time.DurationField durationField15 = chronology12.months();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.minuteOfHour();
        org.joda.time.DurationField durationField17 = dateTimeField16.getRangeDurationField();
        org.joda.time.DurationField durationField18 = dateTimeField16.getLeapDurationField();
        long long20 = dateTimeField16.roundHalfFloor((long) 54469723);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[+00:00:00.052]" + "'", str13, "ISOChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNull(durationField18);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 54479948L + "'", long20 == 54479948L);
    }

    @Test
    public void test21024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21024");
        java.io.IOException iOException2 = new java.io.IOException("2022-02-21T15:06:47.170+00:00:00.052");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("2021-06-21T15:10:29.761+00:00:00.052", (java.lang.Throwable) iOException3);
    }

    @Test
    public void test21025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21025");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(212);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime localDateTime11 = property9.addWrapFieldToCopy(576);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusHours(54);
        int int14 = localDateTime13.getYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withDayOfMonth(10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusSeconds(261);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMillisOfDay(54651287);
        int int21 = localDateTime20.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2554 + "'", int14 == 2554);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
    }

    @Test
    public void test21026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21026");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("58665600", (double) 1645455979944L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.645455979944E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21027");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField5 = chronology2.millis();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusSeconds((int) ' ');
        long long11 = chronology2.set((org.joda.time.ReadablePartial) localDateTime9, (long) 99);
        org.joda.time.DateTimeField dateTimeField12 = chronology2.clockhourOfDay();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusHours((int) (byte) 0);
        boolean boolean20 = dateTime18.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime18.toMutableDateTime(dateTimeZone21);
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.lang.String str26 = dateTimeZone21.getName((long) (byte) 1, locale25);
        java.lang.String str27 = locale25.getScript();
        java.lang.String str28 = locale14.getDisplayScript(locale25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar33 = dateTime32.toGregorianCalendar();
        int int34 = dateTime32.getMillisOfSecond();
        org.joda.time.DateTime.Property property35 = dateTime32.minuteOfHour();
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property41 = dateTime38.centuryOfEra();
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.lang.String str43 = locale42.getLanguage();
        java.lang.String str44 = property41.getAsText(locale42);
        java.lang.String str45 = locale36.getDisplayName(locale42);
        int int46 = property35.getMaximumTextLength(locale42);
        java.util.Set<java.lang.String> strSet47 = locale42.getUnicodeLocaleAttributes();
        java.lang.String str48 = locale14.getDisplayLanguage(locale42);
        java.lang.String str49 = dateTimeField12.getAsText(0L, locale42);
        java.lang.String str50 = locale42.getDisplayName();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-31948L) + "'", long11 == (-31948L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.052" + "'", str26, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(gregorianCalendar33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 911 + "'", int34 == 911);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "it" + "'", str43, "it");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "20" + "'", str44, "20");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "coreano" + "'", str45, "coreano");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "coreano" + "'", str48, "coreano");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "24" + "'", str49, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "italiano" + "'", str50, "italiano");
    }

    @Test
    public void test21028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21028");
        java.io.IOException iOException1 = new java.io.IOException("54391");
        java.io.IOException iOException4 = new java.io.IOException("15");
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) iOException4);
        java.io.IOException iOException10 = new java.io.IOException("13");
        java.io.IOException iOException11 = new java.io.IOException("2022-02-21T15:06:36.478+00:00:00.052", (java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray12 = iOException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = iOException10.getSuppressed();
        iOException4.addSuppressed((java.lang.Throwable) iOException10);
        iOException1.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException10.addSuppressed(throwable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test21029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21029");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        boolean boolean1 = locale0.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime3.centuryOfEra();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale7.getLanguage();
        java.lang.String str9 = property6.getAsText(locale7);
        java.lang.String str10 = locale0.getDisplayLanguage(locale7);
        java.util.Locale locale11 = locale7.stripExtensions();
        java.lang.String str12 = locale7.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it" + "'", str8, "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20" + "'", str9, "20");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cinese" + "'", str10, "cinese");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "it" + "'", str12, "it");
    }

    @Test
    public void test21030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21030");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMaximumValue();
        int int10 = localDateTime9.getEra();
        java.lang.String str11 = localDateTime9.toString();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear(73);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.millisOfSecond();
        org.joda.time.DurationField durationField22 = chronology18.seconds();
        org.joda.time.DurationField durationField23 = chronology18.centuries();
        org.joda.time.DurationField durationField24 = chronology18.minutes();
        org.joda.time.DurationField durationField25 = chronology18.hours();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology18.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minus(readablePeriod32);
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology35, locale36, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField40 = null;
        dateTimeParserBucket39.saveField(dateTimeField40, (int) (short) 0);
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology44, locale45, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField49 = null;
        dateTimeParserBucket48.saveField(dateTimeField49, (int) (short) 0);
        java.lang.Integer int52 = dateTimeParserBucket48.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket48.setZone(dateTimeZone53);
        dateTimeParserBucket39.setZone(dateTimeZone53);
        dateTimeParserBucket39.setPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket39.getChronology();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology61 = localDateTime60.getChronology();
        org.joda.time.LocalDateTime.Property property62 = localDateTime60.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime63 = property62.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.withDayOfYear((int) (short) 100);
        int[] intArray67 = chronology58.get((org.joda.time.ReadablePartial) localDateTime63, (long) 'x');
        int int68 = dateTimeField27.getMinimumValue((org.joda.time.ReadablePartial) localDateTime31, intArray67);
        chronology2.validate((org.joda.time.ReadablePartial) localDateTime13, intArray67);
        org.joda.time.DurationField durationField70 = chronology2.hours();
        org.joda.time.DateTimeField dateTimeField71 = chronology2.minuteOfDay();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.999" + "'", str11, "1970-01-01T00:00:00.999");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNull(int52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1970, 1, 1, 120]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
    }

    @Test
    public void test21031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21031");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        boolean boolean7 = dateTime5.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime5.toMutableDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.era();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.plusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property22 = localDateTime16.property(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar27 = dateTime26.toGregorianCalendar();
        org.joda.time.DateTime dateTime29 = dateTime26.withWeekyear((int) 'x');
        int int30 = property22.compareTo((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean31 = dateTime5.equals((java.lang.Object) int30);
        java.lang.String str32 = dateTime5.toString();
        org.joda.time.DateTime.Property property33 = dateTime5.minuteOfHour();
        org.joda.time.DateTime dateTime35 = property33.addToCopy(1645456102631L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2022-02-25T19:16:08.961+00:00:00.052" + "'", str32, "2022-02-25T19:16:08.961+00:00:00.052");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test21032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21032");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.millisOfSecond();
        org.joda.time.DurationField durationField9 = chronology2.years();
        org.joda.time.Chronology chronology10 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology2.getZone();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test21033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21033");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds(26);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.DateTime dateTime8 = property6.addToCopy((long) 43);
        org.joda.time.DateTime dateTime10 = property6.addToCopy((long) 275);
        org.joda.time.DateTime.Property property11 = dateTime10.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test21034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21034");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(212);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime localDateTime11 = property9.addWrapFieldToCopy(576);
        boolean boolean12 = property9.isLeap();
        org.joda.time.LocalDateTime localDateTime13 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMinutes(54616882);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.secondOfMinute();
        org.joda.time.DurationField durationField23 = chronology20.millis();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusSeconds((int) ' ');
        long long29 = chronology20.set((org.joda.time.ReadablePartial) localDateTime27, (long) 99);
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale30.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 212, chronology20, locale30, (java.lang.Integer) (-1), (-948));
        org.joda.time.DateTimeField dateTimeField35 = chronology20.minuteOfHour();
        org.joda.time.DurationField durationField36 = chronology20.years();
        org.joda.time.DateTimeField dateTimeField37 = chronology20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime16, chronology20);
        org.joda.time.DateTimeField dateTimeField39 = chronology20.hourOfDay();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTimeField dateTimeField41 = chronology20.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(localDateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-31948L) + "'", long29 == (-31948L));
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField41);
    }

    @Test
    public void test21035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21035");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusSeconds(52);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusHours(28);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMillis(405);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.era();
        boolean boolean19 = localDateTime17.isSupported(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.secondOfMinute();
        boolean boolean25 = dateTimeFieldType18.isSupported(chronology22);
        boolean boolean26 = localDateTime12.isSupported(dateTimeFieldType18);
        int int27 = localDateTime5.get(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekyear((-1));
        org.joda.time.DateTime dateTime34 = dateTime32.plusMonths(10);
        org.joda.time.DateTime.Property property35 = dateTime34.minuteOfDay();
        int int36 = dateTime34.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        org.joda.time.DateTime dateTime40 = dateTime34.withZone(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(0L, dateTimeZone38);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime43 = localDateTime5.toDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime45 = dateTime43.minusMillis(252);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
    }

    @Test
    public void test21036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21036");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        boolean boolean7 = dateTime5.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime5.toMutableDateTime(dateTimeZone8);
        int int10 = dateTime5.getDayOfMonth();
        int int11 = dateTime5.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime5.plus(readablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.withYearOfCentury(54843);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54843 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test21037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21037");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.LocalDateTime localDateTime12 = dateTime10.toLocalDateTime();
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        int int14 = dateTime10.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone15.getOffset(readableInstant16);
        int int19 = dateTimeZone15.getStandardOffset((long) 15);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone15);
        java.lang.String str21 = dateTimeZone15.getID();
        int int23 = dateTimeZone15.getOffset(32472144000035L);
        org.joda.time.DateTime dateTime24 = dateTime10.withZoneRetainFields(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2035 + "'", int14 == 2035);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.052" + "'", str21, "+00:00:00.052");
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test21038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21038");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property24 = dateTime21.centuryOfEra();
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str26 = locale25.getLanguage();
        java.lang.String str27 = property24.getAsText(locale25);
        java.lang.String str28 = dateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime18, (-1), locale25);
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale30.getLanguage();
        java.lang.String str32 = dateTimeField14.getAsShortText((int) (byte) 10, locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 9999, chronology8, locale30, (java.lang.Integer) 54616882);
        java.util.Locale.setDefault(locale30);
        int int36 = dateTimeField4.getMaximumTextLength(locale30);
        java.util.Locale locale37 = java.util.Locale.JAPANESE;
        java.lang.String str38 = locale30.getDisplayCountry(locale37);
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale30.getDisplayCountry(locale39);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "it" + "'", str26, "it");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "20" + "'", str27, "20");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1" + "'", str28, "-1");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "it" + "'", str31, "it");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10" + "'", str32, "10");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test21039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21039");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.lang.String str1 = dateTimeFieldType0.getName();
        java.lang.String str2 = dateTimeFieldType0.getName();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours((int) (byte) 0);
        boolean boolean8 = dateTime6.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusWeeks((int) 'a');
        boolean boolean13 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime();
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = property19.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withDayOfYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 0);
        int[] intArray27 = localDateTime26.getValues();
        chronology15.validate((org.joda.time.ReadablePartial) localDateTime24, intArray27);
        org.joda.time.DurationField durationField29 = chronology15.years();
        org.joda.time.DurationField durationField30 = chronology15.minutes();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType0.getField(chronology15);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "weekyearOfCentury" + "'", str1, "weekyearOfCentury");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "weekyearOfCentury" + "'", str2, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(intArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1970, 1, 1, 52]");
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test21040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21040");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        boolean boolean7 = dateTime5.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime5.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours((int) (byte) 0);
        boolean boolean15 = dateTime13.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks((int) 'a');
        boolean boolean20 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime19.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime25 = dateTime19.plusMinutes(977);
        boolean boolean26 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime19.withDurationAdded(readableDuration27, 54625758);
        int int30 = dateTime19.getMinuteOfDay();
        org.joda.time.DateTime.Property property31 = dateTime19.hourOfDay();
        org.joda.time.DateTime dateTime32 = property31.roundFloorCopy();
        org.joda.time.DateTime.Property property33 = dateTime32.hourOfDay();
        org.joda.time.DateTime dateTime35 = dateTime32.withYear(392);
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology37, locale38, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField42 = null;
        dateTimeParserBucket41.saveField(dateTimeField42, (int) (short) 0);
        java.lang.Integer int45 = dateTimeParserBucket41.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket41.setZone(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.withWeekyear((-1));
        org.joda.time.DateTime dateTime53 = dateTime49.plusHours((int) (byte) 100);
        boolean boolean55 = dateTime53.isBefore((long) ' ');
        int int56 = dateTimeZone46.getOffset((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime58 = dateTime53.minusYears((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime58.getZone();
        long long62 = dateTimeZone59.convertLocalToUTC(239L, true);
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now(dateTimeZone59);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone59);
        org.joda.time.DateTime dateTime65 = dateTime32.withZone(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 916 + "'", int30 == 916);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
// flaky:         org.junit.Assert.assertTrue("'" + long62 + "' != '" + 187L + "'", long62 == 187L);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
    }

    @Test
    public void test21041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21041");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("-0001-02-22T15:11:23.871+00:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-0001-02-22t15:11:23.871+00:00:00.052");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21042");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology3.seconds();
        org.joda.time.DurationField durationField8 = chronology3.centuries();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.millisOfSecond();
        org.joda.time.DurationField durationField10 = chronology3.years();
        org.joda.time.Chronology chronology11 = chronology3.withUTC();
        org.joda.time.DurationField durationField12 = chronology11.months();
        boolean boolean13 = durationFieldType0.isSupported(chronology11);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.secondOfMinute();
        int int15 = dateTimeField14.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.millisOfSecond();
        org.joda.time.DurationField durationField23 = chronology19.seconds();
        org.joda.time.DurationField durationField24 = chronology19.centuries();
        org.joda.time.DurationField durationField25 = chronology19.minutes();
        org.joda.time.DateTimeField dateTimeField26 = chronology19.monthOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology19.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = property31.addToCopy((long) 3);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now(chronology42);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property49 = dateTime46.centuryOfEra();
        java.util.Locale locale50 = java.util.Locale.ITALIAN;
        java.lang.String str51 = locale50.getLanguage();
        java.lang.String str52 = property49.getAsText(locale50);
        java.lang.String str53 = dateTimeField39.getAsText((org.joda.time.ReadablePartial) localDateTime43, (-1), locale50);
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        java.lang.String str56 = locale55.getLanguage();
        java.lang.String str57 = dateTimeField39.getAsShortText((int) (byte) 10, locale55);
        java.lang.String str58 = dateTimeField27.getAsShortText((org.joda.time.ReadablePartial) localDateTime33, 713, locale55);
        java.util.Locale.Category category59 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale60 = java.util.Locale.getDefault(category59);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime62.plusHours((int) (byte) 0);
        boolean boolean66 = dateTime64.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime69 = dateTime64.toMutableDateTime(dateTimeZone67);
        java.util.Locale locale71 = java.util.Locale.KOREAN;
        java.lang.String str72 = dateTimeZone67.getName((long) (byte) 1, locale71);
        java.lang.String str73 = locale71.getScript();
        java.lang.String str74 = locale60.getDisplayScript(locale71);
        java.lang.String str75 = locale71.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet76 = locale71.getExtensionKeys();
        java.util.Locale locale77 = java.util.Locale.ITALIAN;
        java.lang.String str78 = locale77.getLanguage();
        java.lang.String str79 = locale71.getDisplayScript(locale77);
        java.lang.String str80 = locale55.getDisplayLanguage(locale71);
        java.lang.String str81 = locale55.getLanguage();
        java.lang.String str82 = dateTimeField14.getAsText(25, locale55);
        boolean boolean83 = locale55.hasExtensions();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "it" + "'", str51, "it");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "20" + "'", str52, "20");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1" + "'", str53, "-1");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "it" + "'", str56, "it");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "10" + "'", str57, "10");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "713" + "'", str58, "713");
        org.junit.Assert.assertTrue("'" + category59 + "' != '" + java.util.Locale.Category.FORMAT + "'", category59.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(timeZone68);
// flaky:         org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime69);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+00:00:00.052" + "'", str72, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(charSet76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "it");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "it" + "'", str78, "it");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str80, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "it" + "'", str81, "it");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "25" + "'", str82, "25");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test21043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21043");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime5 = property3.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = property3.getLocalDateTime();
        java.util.Locale locale9 = new java.util.Locale("2022-02-21T15:06:28.271+00:00:00.052", "2022-05-29T15:06:28.816");
        java.lang.String str10 = property3.getAsShortText(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property3.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals(locale9.toString(), "2022-02-21t15:06:28.271+00:00:00.052_2022-05-29T15:06:28.816");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52" + "'", str10, "52");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test21044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21044");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        java.util.Date date4 = dateTime1.toDate();
        org.joda.time.DateTime.Property property5 = dateTime1.dayOfMonth();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime1.plus(1645455977932L);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        boolean boolean21 = localDateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.secondOfMinute();
        boolean boolean27 = dateTimeFieldType20.isSupported(chronology24);
        boolean boolean28 = localDateTime14.isSupported(dateTimeFieldType20);
        boolean boolean29 = dateTime9.isSupported(dateTimeFieldType20);
        org.joda.time.DateTime.Property property30 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime31 = property30.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes(938);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(72000052L, dateTimeZone35);
        org.joda.time.DateTime.Property property38 = dateTime37.era();
        org.joda.time.DateTime.Property property39 = dateTime37.secondOfMinute();
        org.joda.time.DateTime dateTime40 = property39.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property41 = dateTime40.weekOfWeekyear();
        org.joda.time.DateTime dateTime42 = property41.withMinimumValue();
        int int43 = dateTime42.getYearOfEra();
        boolean boolean44 = dateTime31.equals((java.lang.Object) dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 15:16:09 GMT 2022");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1970 + "'", int43 == 1970);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test21045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21045");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.minus(readablePeriod8);
        boolean boolean11 = dateTime5.isEqual((long) 0);
        org.joda.time.DateTime dateTime12 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(chronology26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property33 = dateTime30.centuryOfEra();
        java.util.Locale locale34 = java.util.Locale.ITALIAN;
        java.lang.String str35 = locale34.getLanguage();
        java.lang.String str36 = property33.getAsText(locale34);
        java.lang.String str37 = dateTimeField23.getAsText((org.joda.time.ReadablePartial) localDateTime27, (-1), locale34);
        java.util.Locale locale39 = java.util.Locale.ITALIAN;
        java.lang.String str40 = locale39.getLanguage();
        java.lang.String str41 = dateTimeField23.getAsShortText((int) (byte) 10, locale39);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 9999, chronology17, locale39, (java.lang.Integer) 54616882);
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology45, locale46, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField50 = null;
        dateTimeParserBucket49.saveField(dateTimeField50, (int) (short) 0);
        java.lang.Integer int53 = dateTimeParserBucket49.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket49.setZone(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.withWeekyear((-1));
        org.joda.time.DateTime dateTime61 = dateTime57.plusHours((int) (byte) 100);
        boolean boolean63 = dateTime61.isBefore((long) ' ');
        int int64 = dateTimeZone54.getOffset((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.LocalDateTime localDateTime65 = null;
        boolean boolean66 = dateTimeZone54.isLocalDateTimeGap(localDateTime65);
        java.lang.String str68 = dateTimeZone54.getNameKey((long) '4');
        org.joda.time.Chronology chronology69 = chronology17.withZone(dateTimeZone54);
        org.joda.time.DurationField durationField70 = chronology69.millis();
        org.joda.time.DateTimeField dateTimeField71 = chronology69.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime72 = org.joda.time.LocalDateTime.now(chronology69);
        org.joda.time.DateTimeField dateTimeField73 = chronology69.yearOfEra();
        boolean boolean74 = dateTime12.equals((java.lang.Object) chronology69);
        org.joda.time.DateTime dateTime76 = dateTime12.plusWeeks(60674664);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "it" + "'", str35, "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "20" + "'", str36, "20");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-1" + "'", str37, "-1");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "it" + "'", str40, "it");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "10" + "'", str41, "10");
        org.junit.Assert.assertNull(int53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 52 + "'", int64 == 52);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(dateTime76);
    }

    @Test
    public void test21046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21046");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.minusDays(0);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear((-1));
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths(10);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        int int16 = dateTime14.getYearOfEra();
        boolean boolean17 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Chronology chronology18 = dateTime14.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.millis();
        long long22 = durationField19.getMillis(0, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test21047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21047");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMillisOfSecond(211);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withYear(782);
        int int13 = localDateTime12.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours((int) (byte) 0);
        boolean boolean19 = dateTime17.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int) 'a');
        boolean boolean24 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = dateTime23.toDateTime();
        org.joda.time.DateTime dateTime27 = dateTime23.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.weekyear();
        boolean boolean33 = dateTime27.equals((java.lang.Object) localDateTime29);
        int int34 = localDateTime29.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property35 = localDateTime29.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime29.withCenturyOfEra(54388);
        int int38 = localDateTime29.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime29.withWeekyear(194);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime29.minus(readablePeriod41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime29.withCenturyOfEra(202);
        boolean boolean45 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTime dateTime46 = localDateTime29.toDateTime();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime49 = dateTime46.withDurationAdded(readableDuration47, 54931118);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 82 + "'", int13 == 82);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 70 + "'", int34 == 70);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 19 + "'", int38 == 19);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test21048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21048");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder9 = builder4.setExtension('u', "33");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder9.build();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyearOfCentury();
        int int18 = dateTimeField16.getLeapAmount(1L);
        long long20 = dateTimeField16.roundHalfCeiling((long) (byte) -1);
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.clockhourOfDay();
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale29.getVariant();
        java.lang.String str31 = dateTimeField27.getAsText((-1), locale29);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusSeconds(52);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime39.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime43 = dateTime41.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime46 = dateTime43.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean47 = dateTime46.isEqualNow();
        org.joda.time.DateTime.Property property48 = dateTime46.secondOfMinute();
        org.joda.time.DateTime dateTime50 = property48.addToCopy(0L);
        org.joda.time.DateTimeField dateTimeField51 = property48.getField();
        java.util.Locale locale53 = java.util.Locale.ITALIAN;
        java.lang.String str54 = locale53.getLanguage();
        java.lang.String str55 = locale53.getScript();
        java.lang.String str56 = dateTimeField51.getAsText(15, locale53);
        java.lang.String str57 = dateTimeField27.getAsShortText((org.joda.time.ReadablePartial) localDateTime33, locale53);
        java.util.Locale.setDefault(category22, locale53);
        java.lang.String str59 = dateTimeField16.getAsText(54430659, locale53);
        java.lang.String str60 = locale53.getDisplayCountry();
        java.util.Locale.Builder builder61 = builder9.setLocale(locale53);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder63 = builder9.setRegion("ja-JP");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ja-JP [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "it");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "it" + "'", str54, "it");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "15" + "'", str56, "15");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "24" + "'", str57, "24");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "54430659" + "'", str59, "54430659");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test21049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21049");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean8 = dateTimeZone7.isFixed();
        java.lang.String str10 = dateTimeZone7.getShortName(1645455975652L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        long long15 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 718);
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale17.getDisplayScript();
        java.lang.String str19 = dateTimeZone7.getShortName((long) 948, locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((-3155673599531L), chronology3, locale17, (java.lang.Integer) 106, 1970);
        org.joda.time.DateTimeField dateTimeField23 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology3.clockhourOfDay();
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.052" + "'", str10, "+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 718L + "'", long15 == 718L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.052" + "'", str19, "+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test21050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21050");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        java.lang.String str4 = dateTime1.toString();
        long long5 = dateTime1.getMillis();
        org.joda.time.DateTime dateTime7 = dateTime1.plus((long) 9999);
        org.joda.time.DateTime dateTime9 = dateTime1.withDayOfYear(15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-21T15:16:09.288+00:00:00.052" + "'", str4, "2022-02-21T15:16:09.288+00:00:00.052");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645456569236L + "'", long5 == 1645456569236L);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test21051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21051");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours((int) (byte) 0);
        java.util.Date date8 = dateTime5.toDate();
        org.joda.time.DateTime.Property property9 = dateTime5.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        boolean boolean11 = localDateTime3.isSupported(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.plus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(chronology27);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property34 = dateTime31.centuryOfEra();
        java.util.Locale locale35 = java.util.Locale.ITALIAN;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = property34.getAsText(locale35);
        java.lang.String str38 = dateTimeField24.getAsText((org.joda.time.ReadablePartial) localDateTime28, (-1), locale35);
        java.util.Locale locale40 = java.util.Locale.ITALIAN;
        java.lang.String str41 = locale40.getLanguage();
        java.lang.String str42 = dateTimeField24.getAsShortText((int) (byte) 10, locale40);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 9999, chronology18, locale40, (java.lang.Integer) 54616882);
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology46, locale47, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField51 = null;
        dateTimeParserBucket50.saveField(dateTimeField51, (int) (short) 0);
        java.lang.Integer int54 = dateTimeParserBucket50.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket50.setZone(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.withWeekyear((-1));
        org.joda.time.DateTime dateTime62 = dateTime58.plusHours((int) (byte) 100);
        boolean boolean64 = dateTime62.isBefore((long) ' ');
        int int65 = dateTimeZone55.getOffset((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.LocalDateTime localDateTime66 = null;
        boolean boolean67 = dateTimeZone55.isLocalDateTimeGap(localDateTime66);
        java.lang.String str69 = dateTimeZone55.getNameKey((long) '4');
        org.joda.time.Chronology chronology70 = chronology18.withZone(dateTimeZone55);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime(72000053L, dateTimeZone55);
        org.joda.time.DateTime dateTime73 = dateTime71.plusMillis(697);
        org.joda.time.DateTime dateTime74 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime76 = dateTime74.withHourOfDay(955);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 955 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Feb 21 15:16:09 GMT 2022");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "it" + "'", str36, "it");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "20" + "'", str37, "20");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1" + "'", str38, "-1");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "it" + "'", str41, "it");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "10" + "'", str42, "10");
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 52 + "'", int65 == 52);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
// flaky:         org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
    }

    @Test
    public void test21052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.TimeZone.setDefault(timeZone2);
        int int5 = timeZone2.getOffset((long) 887);
        boolean boolean6 = timeZone2.observesDaylightTime();
        boolean boolean7 = timeZone2.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.052' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test21053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21053");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getID();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.getScript();
        java.lang.String str13 = locale11.toLanguageTag();
        java.util.Set<java.lang.String> strSet14 = locale11.getUnicodeLocaleKeys();
        java.lang.String str15 = dateTimeZone6.getShortName((long) 60639663, locale11);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.weeks();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(1645456232168L, chronology17);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime27 = property24.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withWeekyear((int) (short) 10);
        int int30 = localDateTime29.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.plusDays(31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime39 = dateTime37.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime41 = dateTime37.withYear(2922789);
        org.joda.time.DateTime dateTime43 = dateTime41.withMillisOfSecond(784);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = dateTime43.toString(dateTimeFormatter44);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology48 = localDateTime47.getChronology();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime52 = property49.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusHours(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int56 = localDateTime52.indexOf(dateTimeFieldType55);
        int int57 = dateTime43.get(dateTimeFieldType55);
        java.lang.String str58 = dateTimeFieldType55.toString();
        int int59 = localDateTime32.get(dateTimeFieldType55);
        boolean boolean60 = localDateTime20.isSupported(dateTimeFieldType55);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.LocalDateTime localDateTime63 = localDateTime20.withDurationAdded(readableDuration61, 54611604);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.052" + "'", str9, "+00:00:00.052");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "it" + "'", str13, "it");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.052" + "'", str15, "+00:00:00.052");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2922789-04-13T15:16:09.784+00:00:00.052" + "'", str45, "2922789-04-13T15:16:09.784+00:00:00.052");
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 15 + "'", int57 == 15);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hourOfDay" + "'", str58, "hourOfDay");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(localDateTime63);
    }

    @Test
    public void test21054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21054");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.minusMinutes(26);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.withFieldAdded(durationFieldType18, 70);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology24);
        java.lang.String str26 = chronology24.toString();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology30 = chronology24.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField31 = chronology24.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = chronology24.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(35999999L, chronology24);
        org.joda.time.DurationField durationField34 = chronology24.minutes();
        boolean boolean35 = durationFieldType18.isSupported(chronology24);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(chronology39);
        java.lang.String str41 = chronology39.toString();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone44 = dateTimeZone43.toTimeZone();
        org.joda.time.Chronology chronology45 = chronology39.withZone(dateTimeZone43);
        org.joda.time.DurationField durationField46 = chronology39.seconds();
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology39, locale47, (java.lang.Integer) 25, 2922789);
        org.joda.time.DurationField durationField51 = durationFieldType18.getField(chronology39);
        org.joda.time.Chronology chronology52 = chronology39.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(0, 54653959, 54874766, 459, 54860, 54785, chronology39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 459 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ISOChronology[UTC]" + "'", str26, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ISOChronology[UTC]" + "'", str41, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(chronology52);
    }

    @Test
    public void test21055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21055");
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(381, 54579572, 0, (-1824346623), 37, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1824346623 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21056");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(212);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(72000052L, dateTimeZone12);
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        org.joda.time.DateTime.Property property16 = dateTime14.secondOfMinute();
        org.joda.time.DateTime dateTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property18 = dateTime17.weekOfWeekyear();
        int int19 = dateTime17.getMillisOfSecond();
        boolean boolean20 = localDateTime8.equals((java.lang.Object) int19);
        java.util.Date date21 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime8.withWeekyear(54702686);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusMillis(483);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Mon May 01 03:32:01 GMT+00:00 1978");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test21057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21057");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DurationField durationField15 = chronology12.months();
        org.joda.time.DurationField durationField16 = chronology12.minutes();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = property20.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.era();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusYears(100);
        int[] intArray28 = localDateTime23.getValues();
        long long30 = chronology12.set((org.joda.time.ReadablePartial) localDateTime23, (long) 54658957);
        org.joda.time.DateTime dateTime31 = localDateTime23.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusHours((int) (byte) 0);
        boolean boolean37 = dateTime35.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusWeeks((int) 'a');
        boolean boolean42 = dateTime35.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = dateTime41.toDateTime();
        org.joda.time.DateTime dateTime45 = dateTime41.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime47 = dateTime41.plusMinutes(977);
        long long48 = dateTime41.getMillis();
        org.joda.time.Chronology chronology49 = dateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.millisOfSecond();
        org.joda.time.DurationField durationField51 = chronology49.seconds();
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime31.toMutableDateTime(chronology49);
        org.joda.time.DateTimeField dateTimeField53 = chronology49.secondOfDay();
        java.lang.String str55 = dateTimeField53.getAsShortText((long) 54789);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[+00:00:00.052]" + "'", str13, "ISOChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[120, 1, 1, 999]");
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-58380393599053L) + "'", long30 == (-58380393599053L));
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1586790969332L + "'", long48 == 1586790969332L);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "54" + "'", str55, "54");
    }

    @Test
    public void test21058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21058");
        java.io.IOException iOException1 = new java.io.IOException("505");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: 505" + "'", str2, "java.io.IOException: 505");
    }

    @Test
    public void test21059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21059");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        boolean boolean7 = dateTime5.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime5.toMutableDateTime(dateTimeZone8);
        org.joda.time.TimeOfDay timeOfDay10 = dateTime5.toTimeOfDay();
        org.joda.time.DateTime dateTime13 = dateTime5.withDurationAdded((long) '4', 54616882);
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        org.joda.time.DateTime dateTime16 = dateTime13.withYearOfEra(56);
        org.joda.time.DateTime dateTime17 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology22 = dateTime19.getChronology();
        boolean boolean23 = dateTime19.isBeforeNow();
        int int24 = dateTime17.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test21060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21060");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        int int5 = localDateTime4.getEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusHours(54637049);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes(948);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusMillis(52);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.year();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test21061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21061");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfDay();
        org.joda.time.DateTime.Property property9 = dateTime7.era();
        int int10 = dateTime7.getWeekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.plus(readableDuration11);
        org.joda.time.DateTime.Property property13 = dateTime7.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property13.getFieldType();
        org.joda.time.DateTime dateTime15 = property13.roundCeilingCopy();
        int int16 = property13.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test21062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21062");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime.Property property11 = dateTime3.secondOfDay();
        org.joda.time.DateTime dateTime12 = property11.withMaximumValue();
        org.joda.time.DateTime dateTime13 = property11.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime15 = property11.addToCopy((long) 54634221);
        org.joda.time.DateTime dateTime16 = property11.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property11.getFieldType();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test21063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21063");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.minusHours(15);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime5.toDateTime(dateTimeZone16);
        int int20 = dateTime19.getMinuteOfHour();
        int int21 = dateTime19.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test21064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21064");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology17 = dateTime14.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) dateTime11, chronology17);
        int int20 = dateTime11.getMinuteOfHour();
        boolean boolean22 = dateTime11.isEqual((-61851081599972L));
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(chronology36);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property43 = dateTime40.centuryOfEra();
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.lang.String str45 = locale44.getLanguage();
        java.lang.String str46 = property43.getAsText(locale44);
        java.lang.String str47 = dateTimeField33.getAsText((org.joda.time.ReadablePartial) localDateTime37, (-1), locale44);
        java.util.Locale locale49 = java.util.Locale.ITALIAN;
        java.lang.String str50 = locale49.getLanguage();
        java.lang.String str51 = dateTimeField33.getAsShortText((int) (byte) 10, locale49);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) 9999, chronology27, locale49, (java.lang.Integer) 54616882);
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale56 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology55, locale56, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField60 = null;
        dateTimeParserBucket59.saveField(dateTimeField60, (int) (short) 0);
        java.lang.Integer int63 = dateTimeParserBucket59.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket59.setZone(dateTimeZone64);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime67 = org.joda.time.DateTime.now(dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime67.withWeekyear((-1));
        org.joda.time.DateTime dateTime71 = dateTime67.plusHours((int) (byte) 100);
        boolean boolean73 = dateTime71.isBefore((long) ' ');
        int int74 = dateTimeZone64.getOffset((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.LocalDateTime localDateTime75 = null;
        boolean boolean76 = dateTimeZone64.isLocalDateTimeGap(localDateTime75);
        java.lang.String str78 = dateTimeZone64.getNameKey((long) '4');
        org.joda.time.Chronology chronology79 = chronology27.withZone(dateTimeZone64);
        org.joda.time.DateTimeField dateTimeField80 = chronology79.era();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(1645456023970L, chronology79);
        org.joda.time.DateTime dateTime82 = dateTime11.withChronology(chronology79);
        org.joda.time.DateTime.Property property83 = dateTime82.yearOfEra();
        boolean boolean84 = dateTime82.isBeforeNow();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "it" + "'", str45, "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "20" + "'", str46, "20");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1" + "'", str47, "-1");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "it" + "'", str50, "it");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10" + "'", str51, "10");
        org.junit.Assert.assertNull(int63);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 52 + "'", int74 == 52);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
// flaky:         org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test21065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21065");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((-62168028330800L));
    }

    @Test
    public void test21066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21066");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        java.util.Date date4 = dateTime1.toDate();
        org.joda.time.DateTime.Property property5 = dateTime1.dayOfMonth();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfMonth();
        java.lang.String str7 = property6.getAsString();
        org.joda.time.DateTime dateTime9 = property6.addToCopy((long) 15);
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfDay();
        org.joda.time.DateTime dateTime11 = property10.getDateTime();
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = dateTime11.toString(dateTimeFormatter13);
        org.joda.time.DateTime dateTime16 = dateTime11.minusDays(11);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusHours((int) (byte) 0);
        boolean boolean23 = dateTime21.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusWeeks((int) 'a');
        boolean boolean28 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime29 = dateTime27.toDateTime();
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology35 = dateTime32.getChronology();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) dateTime29, chronology35);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        long long41 = chronology35.add(readablePeriod38, (long) 1, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField42 = chronology35.era();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(213L, chronology35);
        org.joda.time.DateTimeField dateTimeField44 = chronology35.millisOfDay();
        int int45 = dateTime16.get(dateTimeField44);
        java.lang.Object obj46 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology49 = localDateTime48.getChronology();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(chronology49);
        java.lang.String str51 = chronology49.toString();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.weekOfWeekyear();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(obj46, chronology49);
        org.joda.time.DateTimeField dateTimeField54 = chronology49.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology49.getZone();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology49.getZone();
        org.joda.time.DateTimeField dateTimeField57 = chronology49.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((java.lang.Object) int45, chronology49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 15:16:09 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "21" + "'", str7, "21");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-03-08T15:16:09.543+00:00:00.052" + "'", str14, "2022-03-08T15:16:09.543+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 54969543 + "'", int45 == 54969543);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ISOChronology[UTC]" + "'", str51, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeField57);
    }

    @Test
    public void test21067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21067");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.withMillisOfDay(0);
        int int6 = dateTime5.getCenturyOfEra();
        org.joda.time.DateTime.Property property7 = dateTime5.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime13 = dateTime9.plusSeconds(26);
        long long14 = dateTime9.getMillis();
        org.joda.time.DateTime dateTime16 = dateTime9.minus((long) 13);
        int int17 = property7.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DurationField durationField18 = property7.getDurationField();
        java.lang.String str19 = durationField18.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = durationField18.getMillis((long) 54656931);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 54656931 * 3155695200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645456569507L + "'", long14 == 1645456569507L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "centuries" + "'", str19, "centuries");
    }

    @Test
    public void test21068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21068");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.weekyear();
        boolean boolean19 = dateTime13.equals((java.lang.Object) localDateTime15);
        int int20 = localDateTime15.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property21 = localDateTime15.weekOfWeekyear();
        java.lang.String str22 = property21.getAsText();
        org.joda.time.LocalDateTime localDateTime23 = property21.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks(25);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekyear((-1));
        org.joda.time.DateTime dateTime35 = dateTime31.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.plus(readableDuration36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusMonths((int) '#');
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.plusHours((int) (byte) 0);
        boolean boolean45 = dateTime43.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone47 = dateTimeZone46.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime43.toMutableDateTime(dateTimeZone46);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.era();
        int int50 = mutableDateTime48.get(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.secondOfMinute();
        org.joda.time.DurationField durationField56 = chronology53.millis();
        boolean boolean57 = dateTimeFieldType49.isSupported(chronology53);
        boolean boolean58 = dateTime39.isSupported(dateTimeFieldType49);
        org.joda.time.LocalDateTime.Property property59 = localDateTime27.property(dateTimeFieldType49);
        int int60 = localDateTime23.get(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime23.withWeekyear(54418174);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime23.minusMillis(57703690);
        int int65 = localDateTime23.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            int int67 = localDateTime23.getValue(862);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 862");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 70 + "'", int20 == 70);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 52 + "'", int65 == 52);
    }

    @Test
    public void test21069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21069");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((long) 3);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDurationAdded(readableDuration7, 54422487);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra(936);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withSecondOfMinute(54710);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54710 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test21070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21070");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket5.saveField(dateTimeField6, (int) (short) 0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale11, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket14.saveField(dateTimeField15, (int) (short) 0);
        java.lang.Integer int18 = dateTimeParserBucket14.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket14.setZone(dateTimeZone19);
        dateTimeParserBucket5.setZone(dateTimeZone19);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 459);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekyear((-1));
        org.joda.time.DateTime dateTime29 = dateTime25.plusHours((int) (byte) 100);
        int int30 = dateTime25.getDayOfYear();
        int int31 = dateTime25.getDayOfWeek();
        org.joda.time.DateTime dateTime33 = dateTime25.plus((long) 21);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.weekyear();
        org.joda.time.DurationField durationField36 = chronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = chronology34.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField40 = chronology34.monthOfYear();
        dateTimeParserBucket5.saveField(dateTimeField40, 59);
        long long45 = dateTimeField40.getDifferenceAsLong(12720264L, 1645456458975L);
        int int48 = dateTimeField40.getDifference(1586790939690L, (long) 56);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-625L) + "'", long45 == (-625L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 603 + "'", int48 == 603);
    }

    @Test
    public void test21071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21071");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateMidnight dateMidnight4 = dateTime1.toDateMidnight();
        org.joda.time.LocalDate localDate5 = dateTime1.toLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        int int7 = dateTime1.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale10, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket13.saveField(dateTimeField14, (int) (short) 0);
        java.lang.Integer int17 = dateTimeParserBucket13.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket13.setZone(dateTimeZone18);
        int int21 = dateTimeZone18.getStandardOffset((long) 1969);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long25 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (long) 99);
        org.joda.time.DateTime dateTime26 = dateTime1.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime.Property property27 = dateTime26.yearOfCentury();
        org.joda.time.DateTime dateTime29 = property27.addToCopy(8904L);
        org.joda.time.DateTime.Property property30 = dateTime29.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.withDurationAdded(readableDuration31, 27003273);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 150L + "'", long25 == 150L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test21072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21072");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(2922789);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours((int) (byte) 0);
        java.util.Date date12 = dateTime9.toDate();
        org.joda.time.DateTime.Property property13 = dateTime9.dayOfMonth();
        org.joda.time.DateTime.Property property14 = dateTime9.dayOfMonth();
        java.lang.String str15 = property14.getAsString();
        org.joda.time.DateTime dateTime17 = property14.addToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime18 = dateTime17.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTime dateTime22 = dateTime17.withSecondOfMinute(25);
        boolean boolean23 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = property27.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.era();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.plusYears(100);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plus(readablePeriod35);
        int int37 = localDateTime36.getHourOfDay();
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime();
        int int39 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Chronology chronology40 = dateTime38.getChronology();
        org.joda.time.DateTime.Property property41 = dateTime38.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Feb 21 15:16:09 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "21" + "'", str15, "21");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test21073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21073");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        long long8 = durationField5.getDifferenceAsLong((long) 948, (long) 519);
        long long11 = durationField5.getValueAsLong((-31948L), (-31948L));
        long long14 = durationField5.add((-1L), (int) (short) 0);
        long long17 = durationField5.subtract(770L, 1645456021841L);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-5923641678627599230L) + "'", long17 == (-5923641678627599230L));
    }

    @Test
    public void test21074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21074");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        boolean boolean12 = dateTimeFieldType5.isSupported(chronology9);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.weeks();
        boolean boolean15 = localDateTime13.isSupported(durationFieldType14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfYear();
        org.joda.time.DateTime dateTime22 = dateTime19.minus((long) 671);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology24, locale25, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField29 = null;
        dateTimeParserBucket28.saveField(dateTimeField29, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale34 = java.util.Locale.ROOT;
        dateTimeParserBucket28.saveField(dateTimeFieldType32, "it", locale34);
        int int36 = dateTime19.get(dateTimeFieldType32);
        int int37 = localDateTime13.get(dateTimeFieldType32);
        org.joda.time.DateTimeField[] dateTimeFieldArray38 = localDateTime13.getFields();
        org.joda.time.LocalDateTime.Property property39 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime40 = property39.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime41 = property39.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusYears(54417);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.minus(readableDuration44);
        int int46 = localDateTime41.size();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
    }

    @Test
    public void test21075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours((int) (byte) 0);
        boolean boolean6 = dateTime4.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) 'a');
        boolean boolean11 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime();
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        java.lang.String str14 = chronology13.toString();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 15, chronology13);
        int[] intArray17 = localDateTime16.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDateTime16.getFieldType(54621);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54621");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[+00:00:00.052]" + "'", str14, "ISOChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(intArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1970, 1, 1, 67]");
    }

    @Test
    public void test21076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21076");
        java.io.IOException iOException4 = new java.io.IOException("dopo Cristo");
        java.io.IOException iOException5 = new java.io.IOException("426", (java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("minuteOfHour", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test21077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21077");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.yearOfCentury();
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test21078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21078");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        org.joda.time.DateTime dateTime14 = property12.setCopy("54664");
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test21079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21079");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(347);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours((int) (byte) 0);
        boolean boolean8 = dateTime6.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusWeeks((int) 'a');
        boolean boolean13 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime12.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.weekyear();
        boolean boolean22 = dateTime16.equals((java.lang.Object) localDateTime18);
        org.joda.time.DateTime dateTime24 = dateTime16.minusMonths(54616882);
        org.joda.time.LocalDateTime localDateTime25 = dateTime24.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfMonth();
        int int27 = localDateTime25.getDayOfMonth();
        int int28 = localDateTime25.getYear();
        boolean boolean29 = dateTimeZone1.isLocalDateTimeGap(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13 + "'", int27 == 13);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-4549387) + "'", int28 == (-4549387));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test21080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21080");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int3 = timeZone1.getOffset((long) 59);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int6 = timeZone1.getOffset((long) 2022);
        java.time.ZoneId zoneId7 = timeZone1.toZoneId();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone(zoneId7);
        int int10 = timeZone8.getOffset(3061065600618L);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Ora media di Greenwich");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Ora media di Greenwich");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test21081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21081");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar4 = dateTime3.toGregorianCalendar();
        int int5 = dateTime3.getMillisOfSecond();
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfHour();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 748 + "'", int5 == 748);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test21082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21082");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.LocalDateTime localDateTime12 = dateTime10.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.minus(readablePeriod13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(54623847);
        long long17 = dateTime14.getMillis();
        org.joda.time.Chronology chronology18 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.millisOfDay();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = property23.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withMillisOfSecond((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusSeconds(54709);
        int int33 = dateTimeField19.getMaximumValue((org.joda.time.ReadablePartial) localDateTime30);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2056893571907L + "'", long17 == 2056893571907L);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 86399999 + "'", int33 == 86399999);
    }

    @Test
    public void test21083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21083");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology3.seconds();
        org.joda.time.DurationField durationField8 = chronology3.centuries();
        org.joda.time.DurationField durationField9 = chronology3.minutes();
        org.joda.time.DurationField durationField10 = chronology3.hours();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(160L, chronology3);
        org.joda.time.DateTimeField dateTimeField12 = chronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology3.clockhourOfDay();
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test21084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21084");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plus(12L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusHours((int) (byte) 0);
        boolean boolean11 = dateTime9.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((int) 'a');
        boolean boolean16 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime15.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.weekyear();
        boolean boolean25 = dateTime19.equals((java.lang.Object) localDateTime21);
        org.joda.time.DateTime dateTime27 = dateTime19.minusMonths(54616882);
        org.joda.time.DateTime.Property property28 = dateTime27.millisOfSecond();
        boolean boolean29 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded(readableDuration30, 54848886);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        java.lang.String str35 = dateTimeZone33.getName(1645542375651L);
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime38 = dateTime36.withMillisOfSecond(801);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = dateTime38.withMonthOfYear(175);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 175 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.052" + "'", str35, "+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test21085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21085");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        boolean boolean12 = dateTimeFieldType5.isSupported(chronology9);
        org.joda.time.DurationField durationField13 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.dayOfYear();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getScript();
        java.lang.String str17 = locale15.toLanguageTag();
        java.util.Set<java.lang.String> strSet18 = locale15.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusHours((int) (byte) 0);
        boolean boolean24 = dateTime22.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime22.toMutableDateTime(dateTimeZone25);
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.lang.String str30 = dateTimeZone25.getName((long) (byte) 1, locale29);
        java.lang.String str31 = locale29.getScript();
        java.lang.String str32 = locale15.getDisplayVariant(locale29);
        int int33 = dateTimeField14.getMaximumTextLength(locale29);
        int int34 = dateTimeField14.getMaximumValue();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "it" + "'", str17, "it");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.052" + "'", str30, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 366 + "'", int34 == 366);
    }

    @Test
    public void test21086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21086");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTime.Property property8 = dateTime5.secondOfDay();
        int int9 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime10 = property8.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime12 = property8.setCopy(647);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusHours((int) (byte) 0);
        boolean boolean18 = dateTime16.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusWeeks((int) 'a');
        boolean boolean23 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime22.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.weekyear();
        boolean boolean32 = dateTime26.equals((java.lang.Object) localDateTime28);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime26.getZone();
        org.joda.time.DateTime.Property property34 = dateTime26.secondOfDay();
        boolean boolean35 = dateTime12.isAfter((org.joda.time.ReadableInstant) dateTime26);
        boolean boolean36 = dateTime26.isBeforeNow();
        org.joda.time.DateTime.Property property37 = dateTime26.millisOfDay();
        org.joda.time.DateTime.Property property38 = dateTime26.dayOfMonth();
        int int39 = dateTime26.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 86399 + "'", int9 == 86399);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
    }

    @Test
    public void test21087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21087");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withDurationAdded(readableDuration10, 54477);
        org.joda.time.DateTime dateTime13 = dateTime12.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime12.withCenturyOfEra(435);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 999 + "'", int17 == 999);
    }

    @Test
    public void test21088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21088");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar4 = dateTime3.toGregorianCalendar();
        int int5 = dateTime3.getMillisOfSecond();
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfHour();
        int int7 = dateTime3.getYearOfCentury();
        org.joda.time.TimeOfDay timeOfDay8 = dateTime3.toTimeOfDay();
        int int9 = dateTime3.getCenturyOfEra();
        org.joda.time.DateTime dateTime11 = dateTime3.minus(62135596800972L);
        org.joda.time.DateTime dateTime12 = dateTime3.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 872 + "'", int5 == 872);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test21089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21089");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        int int6 = dateTime5.getMillisOfDay();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology8, locale9, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket12.saveField(dateTimeField13, (int) (short) 0);
        java.lang.Integer int16 = dateTimeParserBucket12.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket12.setZone(dateTimeZone17);
        int int20 = dateTimeZone17.getStandardOffset((long) 1969);
        org.joda.time.DateTime dateTime21 = dateTime5.toDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekyear((-1));
        org.joda.time.DateTime dateTime27 = dateTime23.withMillisOfDay(0);
        org.joda.time.LocalDate localDate28 = dateTime27.toLocalDate();
        org.joda.time.DateTime.Property property29 = dateTime27.minuteOfHour();
        org.joda.time.DateTime.Property property30 = dateTime27.monthOfYear();
        int int31 = dateTime27.getDayOfYear();
        boolean boolean32 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime27);
        int int33 = dateTime27.getYear();
        org.joda.time.Chronology chronology34 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.minuteOfHour();
        org.joda.time.DurationField durationField36 = chronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.hourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54609884 + "'", int6 == 54609884);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test21090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21090");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        java.util.Date date7 = null; // flaky: localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusSeconds(4);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withFieldAdded(durationFieldType10, 213);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.year();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.era();
        boolean boolean20 = localDateTime18.isSupported(dateTimeFieldType19);
        java.util.Date date21 = null; // flaky: localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plusSeconds(4);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.plusYears(536);
        int int26 = localDateTime18.getWeekOfWeekyear();
        int int27 = property13.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime28 = property13.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        java.util.GregorianCalendar gregorianCalendar31 = dateTime30.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar31);
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology34, locale35, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology40, locale41, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField45 = null;
        dateTimeParserBucket44.saveField(dateTimeField45, (int) (short) 0);
        java.lang.Integer int48 = dateTimeParserBucket44.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket44.setZone(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withWeekyear((-1));
        org.joda.time.DateTime dateTime56 = dateTime52.plusHours((int) (byte) 100);
        boolean boolean58 = dateTime56.isBefore((long) ' ');
        int int59 = dateTimeZone49.getOffset((org.joda.time.ReadableInstant) dateTime56);
        dateTimeParserBucket38.setZone(dateTimeZone49);
        long long61 = dateTimeParserBucket38.computeMillis();
        int int62 = dateTimeParserBucket38.getOffset();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = dateTime64.withWeekyear((-1));
        org.joda.time.DateTime dateTime68 = dateTime64.withMillisOfDay(0);
        int int69 = dateTime68.getCenturyOfEra();
        org.joda.time.DateTime.Property property70 = dateTime68.dayOfYear();
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology73 = localDateTime72.getChronology();
        org.joda.time.LocalDateTime.Property property74 = localDateTime72.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime75 = property74.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.era();
        boolean boolean77 = localDateTime75.isSupported(dateTimeFieldType76);
        java.lang.String str78 = dateTimeFieldType76.toString();
        int int79 = dateTime68.get(dateTimeFieldType76);
        org.joda.time.Chronology chronology82 = null;
        java.util.Locale locale83 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket86 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology82, locale83, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField87 = null;
        dateTimeParserBucket86.saveField(dateTimeField87, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale92 = java.util.Locale.ROOT;
        dateTimeParserBucket86.saveField(dateTimeFieldType90, "it", locale92);
        dateTimeParserBucket38.saveField(dateTimeFieldType76, "English", locale92);
        int int95 = localDateTime32.get(dateTimeFieldType76);
        int int96 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTime dateTime97 = localDateTime28.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime99 = localDateTime28.minusYears(391);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275445 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:01 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky:         org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(gregorianCalendar31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 52 + "'", int59 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-52L) + "'", long61 == (-52L));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 20 + "'", int69 == 20);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "era" + "'", str78, "era");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType90);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertNotNull(dateTime97);
    }

    @Test
    public void test21091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21091");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime.Property property11 = dateTime3.secondOfDay();
        org.joda.time.DateTime dateTime12 = property11.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekyear((-1));
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours(15);
        java.lang.String str19 = dateTime18.toString();
        long long20 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime22 = property11.addToCopy(74L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusHours((int) (byte) 0);
        boolean boolean28 = dateTime26.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks((int) 'a');
        boolean boolean33 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime34 = dateTime32.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(72000052L, dateTimeZone36);
        org.joda.time.DateTime.Property property39 = dateTime38.era();
        int int40 = dateTime34.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime42 = dateTime34.minusMinutes(70);
        int int43 = property11.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime44 = property11.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusWeeks((int) 'a');
        int int49 = dateTime48.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime dateTime52 = dateTime48.withField(dateTimeFieldType50, 2);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        org.joda.time.LocalDateTime.Property property56 = localDateTime54.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime57 = property56.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime62 = property60.addWrapFieldToCopy((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property60.getFieldType();
        org.joda.time.DateTime.Property property64 = dateTime48.property(dateTimeFieldType63);
        org.joda.time.DurationFieldType durationFieldType65 = dateTimeFieldType63.getDurationType();
        java.lang.String str66 = durationFieldType65.getName();
        org.joda.time.DateTime dateTime68 = dateTime44.withFieldAdded(durationFieldType65, 7);
        org.joda.time.DateTime dateTime70 = dateTime68.minusSeconds((int) (short) 100);
        int int71 = dateTime70.getYearOfEra();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = dateTime70.toMutableDateTime(chronology72);
        int int74 = mutableDateTime73.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-0001-02-22T00:16:09.925+00:00:00.052" + "'", str19, "-0001-02-22T00:16:09.925+00:00:00.052");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 63839718000L + "'", long20 == 63839718000L);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 925 + "'", int49 == 925);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "centuries" + "'", str66, "centuries");
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2722 + "'", int71 == 2722);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 22 + "'", int74 == 22);
    }

    @Test
    public void test21092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21092");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(35999999948L);
    }

    @Test
    public void test21093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21093");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours((int) (byte) 0);
        boolean boolean9 = dateTime7.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime7.toMutableDateTime(dateTimeZone10);
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = dateTimeZone10.getName((long) (byte) 1, locale14);
        java.lang.String str16 = locale14.getScript();
        java.lang.String str17 = locale0.getDisplayVariant(locale14);
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleKeys();
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale18.getDisplayLanguage(locale21);
        java.lang.String str23 = locale18.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.052" + "'", str15, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean" + "'", str19, "Korean");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test21094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21094");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        boolean boolean7 = dateTime5.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime5.toMutableDateTime(dateTimeZone8);
        int int10 = dateTime5.getDayOfMonth();
        int int11 = dateTime5.getDayOfWeek();
        org.joda.time.TimeOfDay timeOfDay12 = dateTime5.toTimeOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekyear((-1));
        org.joda.time.DateTime dateTime20 = dateTime18.plusMonths(10);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        int int22 = dateTime20.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTime dateTime26 = dateTime20.withZone(dateTimeZone24);
        long long29 = dateTimeZone24.adjustOffset((long) 86399, true);
        long long32 = dateTimeZone24.convertLocalToUTC(196545600000L, false);
        org.joda.time.DateTime dateTime33 = dateTime14.withZone(dateTimeZone24);
        org.joda.time.DateTime.Property property34 = dateTime33.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours(213);
        boolean boolean38 = dateTimeZone36.isStandardOffset((long) 99);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone36);
        long long40 = property34.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        java.util.Date date41 = dateTime39.toDate();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 86399L + "'", long29 == 86399L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 196545599948L + "'", long32 == 196545599948L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Mon Feb 21 15:16:09 GMT+00:00 2022");
    }

    @Test
    public void test21095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21095");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.millisOfSecond();
        org.joda.time.DurationField durationField9 = chronology2.years();
        org.joda.time.Chronology chronology10 = chronology2.withUTC();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekyear((-1));
        org.joda.time.DateTime dateTime17 = dateTime15.plusMonths(10);
        org.joda.time.DateTime.Property property18 = dateTime17.minuteOfDay();
        int int19 = dateTime17.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime23 = dateTime17.withZone(dateTimeZone21);
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str26 = dateTimeZone21.getName((long) 26, locale25);
        long long29 = dateTimeZone21.adjustOffset((long) 657, false);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours((int) (byte) 0);
        boolean boolean35 = dateTime33.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime33.toMutableDateTime(dateTimeZone36);
        long long40 = dateTimeZone21.getMillisKeepLocal(dateTimeZone36, 657L);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.Chronology chronology42 = chronology2.withZone(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone43 = chronology42.getZone();
        java.util.Locale locale45 = java.util.Locale.CHINESE;
        java.lang.String str46 = locale45.getDisplayScript();
        java.lang.String str47 = locale45.getDisplayLanguage();
        java.lang.String str48 = dateTimeZone43.getName(4800697605603L, locale45);
        java.lang.String str50 = dateTimeZone43.getNameKey(1647904134017L);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.052" + "'", str26, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 657L + "'", long29 == 657L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(timeZone37);
// flaky:         org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime38);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 657L + "'", long40 == 657L);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "cinese" + "'", str47, "cinese");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.052" + "'", str48, "+00:00:00.052");
// flaky:         org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test21096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21096");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("italiano");
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("54633");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setLanguageTag("2022-02-21T15:07:52.770+00:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test21097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.TimeZone.setDefault(timeZone2);
        boolean boolean4 = timeZone2.observesDaylightTime();
        timeZone2.setRawOffset(320);
        java.lang.String str9 = timeZone2.getDisplayName(true, 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT+00:00" + "'", str9, "GMT+00:00");
    }

    @Test
    public void test21098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21098");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("");
        java.util.Set<java.lang.String> strSet3 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone5 = provider0.getZone("2022-02-21T15:10:44.036+00:00:00.052");
        org.joda.time.DateTimeZone dateTimeZone7 = provider0.getZone("689");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(dateTimeZone7);
    }

    @Test
    public void test21099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21099");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology3.seconds();
        org.joda.time.DurationField durationField8 = chronology3.centuries();
        org.joda.time.DurationField durationField9 = chronology3.minutes();
        org.joda.time.DurationField durationField10 = chronology3.hours();
        org.joda.time.DateTimeField dateTimeField11 = chronology3.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology15);
        java.lang.String str17 = chronology15.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.Chronology chronology21 = chronology15.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField22 = chronology15.seconds();
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology15, locale23, (java.lang.Integer) 25, 2922789);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime33 = property30.addWrapFieldToCopy(28);
        org.joda.time.DateTimeField dateTimeField34 = property30.getField();
        java.lang.String str36 = dateTimeField34.getAsShortText((long) (short) 10);
        dateTimeParserBucket26.saveField(dateTimeField34, (int) '#');
        long long39 = dateTimeParserBucket26.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeParserBucket26.getZone();
        org.joda.time.Chronology chronology41 = chronology3.withZone(dateTimeZone40);
        org.joda.time.DurationField durationField42 = chronology3.centuries();
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("54645645");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((-59011459199001L), chronology3, locale44);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[UTC]" + "'", str17, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "10" + "'", str36, "10");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 35L + "'", long39 == 35L);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
    }

    @Test
    public void test21100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21100");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        int int5 = localDateTime4.getEra();
        java.lang.String str6 = localDateTime4.toString();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.era();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusYears(100);
        int[] intArray19 = localDateTime14.getValues();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.withMillisOfDay(800);
        boolean boolean22 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime14);
        int int23 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime14.minusMinutes(820);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.999" + "'", str6, "1970-01-01T00:00:00.999");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[120, 1, 1, 999]");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 120 + "'", int23 == 120);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test21101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21101");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusSeconds((int) ' ');
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.dayOfYear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test21102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21102");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UTC");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        java.lang.String str7 = languageRange1.getRange();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfSecond();
        org.joda.time.DurationField durationField14 = chronology10.seconds();
        org.joda.time.DurationField durationField15 = chronology10.centuries();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.millisOfSecond();
        org.joda.time.DurationField durationField17 = chronology10.years();
        org.joda.time.Chronology chronology18 = chronology10.withUTC();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology10);
        int int20 = localDateTime19.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime27 = property24.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusHours(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int31 = localDateTime27.indexOf(dateTimeFieldType30);
        int int32 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime.Property property33 = localDateTime27.monthOfYear();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime36 = property33.addToCopy(963);
        int int37 = property33.getMaximumValue();
        boolean boolean38 = languageRange1.equals((java.lang.Object) property33);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "utc" + "'", str3, "utc");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "utc" + "'", str5, "utc");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "utc" + "'", str6, "utc");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "utc" + "'", str7, "utc");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(chronology18);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 12 + "'", int37 == 12);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test21103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(72000052L, dateTimeZone1);
        org.joda.time.DateTime.Property property4 = dateTime3.era();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy(894);
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        java.lang.String str8 = property4.getAsString();
        int int9 = property4.getMaximumValueOverall();
        org.joda.time.DateTime dateTime11 = property4.addWrapFieldToCopy((int) '4');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test21104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21104");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.minusDays(0);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear((-1));
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths(10);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        int int16 = dateTime14.getYearOfEra();
        boolean boolean17 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Chronology chronology18 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekyear();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology23, locale24, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField28 = null;
        dateTimeParserBucket27.saveField(dateTimeField28, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale33 = java.util.Locale.ROOT;
        dateTimeParserBucket27.saveField(dateTimeFieldType31, "it", locale33);
        java.lang.String str35 = locale33.getISO3Country();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusHours((int) (byte) 0);
        java.util.Date date40 = dateTime37.toDate();
        org.joda.time.DateTime.Property property41 = dateTime37.dayOfMonth();
        org.joda.time.DateTime.Property property42 = dateTime37.dayOfMonth();
        java.util.Locale locale43 = java.util.Locale.ITALIAN;
        java.lang.String str44 = locale43.getLanguage();
        java.lang.String str45 = property42.getAsText(locale43);
        java.lang.String str46 = locale33.getDisplayScript(locale43);
        java.lang.String str47 = locale33.getVariant();
        java.util.Locale locale48 = java.util.Locale.ITALIAN;
        java.lang.String str49 = locale48.getLanguage();
        java.lang.String str50 = locale48.toLanguageTag();
        java.lang.String str51 = locale33.getDisplayScript(locale48);
        java.lang.String str52 = locale48.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = localDateTime20.toString("-0001-02-22T15:10:45.656+00:00:00.052", locale48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Mon Feb 21 15:16:10 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "it" + "'", str44, "it");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "21" + "'", str45, "21");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "it");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "it" + "'", str49, "it");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "it" + "'", str50, "it");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "italiano" + "'", str52, "italiano");
    }

    @Test
    public void test21105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21105");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2020-04-13T15:11:20.651+00:00:00.052", (double) 54494992);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.4494992E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21106");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfMinute();
        org.joda.time.DateTime dateTime14 = property12.addToCopy(0L);
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        org.joda.time.DateTime dateTime16 = property12.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime27 = dateTime24.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean28 = dateTime27.isEqualNow();
        org.joda.time.LocalDateTime localDateTime29 = dateTime27.toLocalDateTime();
        int int30 = dateTime27.getMonthOfYear();
        int int31 = dateTime27.getSecondOfDay();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(chronology34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime39 = dateTime37.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime42 = dateTime39.withDurationAdded((long) 2022, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime27.toMutableDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime16.toDateTime(dateTimeZone43);
        int int48 = dateTimeZone43.getStandardOffset(1645456342887L);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 55172 + "'", int31 == 55172);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test21107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21107");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        boolean boolean7 = dateTime5.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime5.toMutableDateTime(dateTimeZone8);
        org.joda.time.TimeOfDay timeOfDay10 = dateTime5.toTimeOfDay();
        org.joda.time.DateTime dateTime12 = dateTime5.minusDays(0);
        org.joda.time.DateTime.Property property13 = dateTime5.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((-1));
        org.joda.time.DateTime dateTime19 = dateTime15.plusHours((int) (byte) 100);
        int int20 = dateTime15.getDayOfYear();
        int int21 = dateTime15.getDayOfWeek();
        org.joda.time.DateTime dateTime23 = dateTime15.plus((long) 21);
        org.joda.time.Chronology chronology24 = dateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.weekyear();
        org.joda.time.DurationField durationField26 = chronology24.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField28 = chronology24.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = chronology24.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime5.toMutableDateTime(chronology24);
        org.joda.time.DateTimeField dateTimeField31 = chronology24.clockhourOfDay();
        long long34 = dateTimeField31.getDifferenceAsLong((long) 11, (long) 70);
        java.lang.String str36 = dateTimeField31.getAsShortText(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "24" + "'", str36, "24");
    }

    @Test
    public void test21108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21108");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(2922789);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfSecond(784);
        int int10 = dateTime9.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekyear((-1));
        org.joda.time.DateTime dateTime16 = dateTime12.withDayOfYear(15);
        org.joda.time.Chronology chronology17 = dateTime12.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime9.withChronology(chronology17);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded(54612609L, 623);
        int int22 = dateTime18.getSecondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 54970 + "'", int22 == 54970);
    }

    @Test
    public void test21109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21109");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        int int6 = dateTime5.getMillisOfDay();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology8, locale9, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket12.saveField(dateTimeField13, (int) (short) 0);
        java.lang.Integer int16 = dateTimeParserBucket12.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket12.setZone(dateTimeZone17);
        int int20 = dateTimeZone17.getStandardOffset((long) 1969);
        org.joda.time.DateTime dateTime21 = dateTime5.toDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekyear((-1));
        org.joda.time.DateTime dateTime27 = dateTime25.plusMonths(10);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfDay();
        int int29 = dateTime27.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = dateTime27.withZone(dateTimeZone31);
        java.util.Locale locale35 = java.util.Locale.ITALIAN;
        java.lang.String str36 = dateTimeZone31.getName((long) 26, locale35);
        boolean boolean37 = dateTime21.equals((java.lang.Object) dateTimeZone31);
        int int38 = dateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime39 = dateTime21.toDateTimeISO();
        org.joda.time.DateTime dateTime41 = dateTime39.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime43 = dateTime41.withMillisOfDay(193);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.LocalDateTime.Property property47 = localDateTime45.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundHalfEvenCopy();
        java.lang.String str49 = property47.getAsText();
        org.joda.time.LocalDateTime localDateTime50 = property47.roundCeilingCopy();
        int int51 = localDateTime50.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology54 = localDateTime53.getChronology();
        int int55 = localDateTime53.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType56.getRangeDurationType();
        int int58 = localDateTime53.get(dateTimeFieldType56);
        boolean boolean59 = localDateTime50.isSupported(dateTimeFieldType56);
        boolean boolean60 = dateTime41.isSupported(dateTimeFieldType56);
        org.joda.time.DateTime dateTime62 = dateTime41.withYearOfEra(54653137);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54610225 + "'", int6 == 54610225);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.052" + "'", str36, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "52" + "'", str49, "52");
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(dateTime62);
    }

    @Test
    public void test21110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21110");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.millisOfSecond();
        org.joda.time.DurationField durationField9 = chronology2.years();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology2.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.millisOfSecond();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test21111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21111");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusSeconds(52);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond(671);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(839);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test21112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21112");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours((int) (byte) 0);
        boolean boolean13 = dateTime11.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int) 'a');
        boolean boolean18 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime17.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.weekyear();
        boolean boolean27 = dateTime21.equals((java.lang.Object) localDateTime23);
        int[] intArray29 = chronology7.get((org.joda.time.ReadablePartial) localDateTime23, (long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime23.minusMinutes(54410);
        int int32 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime39 = property36.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime43 = property42.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int45 = localDateTime43.indexOf(dateTimeFieldType44);
        boolean boolean46 = localDateTime23.isSupported(dateTimeFieldType44);
        org.joda.time.LocalDateTime.Property property47 = localDateTime23.millisOfDay();
        org.joda.time.DurationField durationField48 = property47.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField49 = property47.getField();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
    }

    @Test
    public void test21113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21113");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UTC");
        double double2 = languageRange1.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] { languageRange1 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Set<java.lang.String> strSet6 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.Locale.FilteringMode filteringMode17 = null;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList15, filteringMode17);
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.Locale.FilteringMode filteringMode27 = null;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList25, filteringMode27);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList25, filteringMode29);
        boolean boolean31 = strSet6.removeAll((java.util.Collection<java.lang.String>) strList25);
        java.util.stream.Stream<java.lang.String> strStream32 = strSet6.stream();
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap34);
        java.util.Set<java.lang.String> strSet36 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray37 = strSet36.toArray();
        boolean boolean39 = strSet36.add("-0001-02-22T15:06:24.159+00:00:00.052");
        boolean boolean41 = strSet36.add("-0001-02-22T15:06:24.159+00:00:00.052");
        strSet36.clear();
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags(languageRangeList35, (java.util.Collection<java.lang.String>) strSet36);
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.lang.String str45 = locale44.getScript();
        java.util.Locale locale46 = java.util.Locale.ENGLISH;
        java.lang.String str47 = locale46.getVariant();
        java.lang.String str48 = locale44.getDisplayName(locale46);
        java.util.Set<java.lang.String> strSet49 = locale46.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags(languageRangeList35, (java.util.Collection<java.lang.String>) strSet49, filteringMode50);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology54 = localDateTime53.getChronology();
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.millisOfSecond();
        org.joda.time.DurationField durationField58 = chronology54.seconds();
        org.joda.time.DurationField durationField59 = chronology54.centuries();
        org.joda.time.DurationField durationField60 = chronology54.minutes();
        org.joda.time.DurationField durationField61 = chronology54.hours();
        org.joda.time.DateTimeField dateTimeField62 = chronology54.weekyear();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(dateTimeZone64);
        org.joda.time.DateTime dateTime67 = dateTime65.withWeekyear((-1));
        org.joda.time.DateTime dateTime69 = dateTime67.plusMonths(10);
        org.joda.time.DateTime.Property property70 = dateTime69.minuteOfDay();
        int int71 = dateTime69.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone74 = dateTimeZone73.toTimeZone();
        org.joda.time.DateTime dateTime75 = dateTime69.withZone(dateTimeZone73);
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(0L, dateTimeZone73);
        java.util.Locale locale77 = java.util.Locale.ITALIAN;
        java.lang.String str78 = locale77.getScript();
        java.lang.String str79 = locale77.toLanguageTag();
        java.lang.String str80 = dateTimeField62.getAsText((org.joda.time.ReadablePartial) localDateTime76, locale77);
        long long82 = dateTimeField62.roundFloor((long) 54634221);
        boolean boolean83 = strSet49.contains((java.lang.Object) dateTimeField62);
        java.util.Date[] dateArray84 = new java.util.Date[] {};
        java.util.Date[] dateArray85 = new java.util.Date[] {};
        java.util.Date[] dateArray86 = new java.util.Date[] {};
        java.util.Date[][] dateArray87 = new java.util.Date[][] { dateArray84, dateArray85, dateArray86 };
        java.util.Date[][] dateArray88 = strSet49.toArray(dateArray87);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strStream32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(objArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Italian" + "'", str48, "Italian");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode50.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(timeZone74);
        org.junit.Assert.assertEquals(timeZone74.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "it");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "it" + "'", str79, "it");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "1970" + "'", str80, "1970");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-259200000L) + "'", long82 == (-259200000L));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(dateArray84);
        org.junit.Assert.assertNotNull(dateArray85);
        org.junit.Assert.assertNotNull(dateArray86);
        org.junit.Assert.assertNotNull(dateArray87);
        org.junit.Assert.assertNotNull(dateArray88);
    }

    @Test
    public void test21114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21114");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(212);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMinutes(212);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(99);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusYears(782);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekyear((-1));
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths(10);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        int int20 = dateTime18.getYearOfEra();
        org.joda.time.DateTime.Property property21 = dateTime18.secondOfMinute();
        int int22 = dateTime18.getMillisOfDay();
        org.joda.time.Chronology chronology23 = dateTime18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours((int) (byte) 0);
        boolean boolean29 = dateTime27.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusWeeks((int) 'a');
        boolean boolean34 = dateTime27.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime35 = dateTime33.toDateTime();
        org.joda.time.DateTime dateTime37 = dateTime33.minusMillis((int) (byte) 10);
        boolean boolean39 = dateTime37.isAfter(7279200000L);
        org.joda.time.DateTime dateTime41 = dateTime37.minusMonths(887);
        int int42 = dateTime41.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.LocalDateTime.Property property46 = localDateTime44.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = property46.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.era();
        boolean boolean49 = localDateTime47.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology52 = localDateTime51.getChronology();
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.secondOfMinute();
        boolean boolean55 = dateTimeFieldType48.isSupported(chronology52);
        int int56 = dateTime41.get(dateTimeFieldType48);
        java.lang.String str57 = dateTimeFieldType48.toString();
        org.joda.time.DurationFieldType durationFieldType58 = dateTimeFieldType48.getRangeDurationType();
        boolean boolean59 = dateTime18.isSupported(dateTimeFieldType48);
        int int60 = localDateTime8.indexOf(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 54970381 + "'", int22 == 54970381);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1946 + "'", int42 == 1946);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "era" + "'", str57, "era");
        org.junit.Assert.assertNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test21115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21115");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours((int) (byte) 0);
        boolean boolean13 = dateTime11.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int) 'a');
        boolean boolean18 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime17.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.weekyear();
        boolean boolean27 = dateTime21.equals((java.lang.Object) localDateTime23);
        int[] intArray29 = chronology7.get((org.joda.time.ReadablePartial) localDateTime23, (long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime34 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property35 = dateTime33.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime36 = dateTime33.toLocalDateTime();
        org.joda.time.DateTime.Property property37 = dateTime33.weekyear();
        org.joda.time.DateTime dateTime39 = property37.setCopy(60588345);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar44 = dateTime43.toGregorianCalendar();
        org.joda.time.DateTime.Property property45 = dateTime43.millisOfSecond();
        org.joda.time.DateTime dateTime46 = property45.getDateTime();
        org.joda.time.DateTime dateTime48 = dateTime46.minusMonths(54481);
        boolean boolean49 = dateTime39.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime51 = dateTime39.plus(readableDuration50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime53 = dateTime39.withEra(662);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 662 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1970, 1, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(gregorianCalendar44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test21116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21116");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds(26);
        long long6 = dateTime1.getMillis();
        org.joda.time.DateTime.Property property7 = dateTime1.year();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone9 = null;
        boolean boolean10 = timeZone8.hasSameRules(timeZone9);
        boolean boolean11 = property7.equals((java.lang.Object) timeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645456570379L + "'", long6 == 1645456570379L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test21117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21117");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.era();
        int int10 = mutableDateTime8.get(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfMinute();
        org.joda.time.DurationField durationField16 = chronology13.millis();
        boolean boolean17 = dateTimeFieldType9.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField18 = chronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology13.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = dateTimeField20.set(54373L, 762);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 762 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test21118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21118");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.dayOfMonth();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology2.getZone();
        org.joda.time.Chronology chronology8 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = chronology2.halfdayOfDay();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test21119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21119");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        java.util.Date date4 = dateTime1.toDate();
        org.joda.time.DateTime.Property property5 = dateTime1.dayOfMonth();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfMonth();
        java.lang.String str7 = property6.getAsString();
        org.joda.time.DateTime dateTime9 = property6.addToCopy((long) 15);
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfDay();
        org.joda.time.DateTime dateTime11 = property10.getDateTime();
        java.lang.String str12 = property10.toString();
        java.lang.String str13 = property10.getAsShortText();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 15:16:10 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "21" + "'", str7, "21");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfDay]" + "'", str12, "Property[millisOfDay]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "54970460" + "'", str13, "54970460");
    }

    @Test
    public void test21120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21120");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        java.util.Date date4 = dateTime1.toDate();
        org.joda.time.DateTime.Property property5 = dateTime1.dayOfMonth();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfMonth();
        java.lang.String str7 = property6.getAsString();
        org.joda.time.DateTime dateTime8 = property6.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours((int) (byte) 0);
        java.util.Date date13 = dateTime10.toDate();
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfMonth();
        org.joda.time.DateTime.Property property15 = dateTime10.dayOfMonth();
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale16.getLanguage();
        java.lang.String str18 = property15.getAsText(locale16);
        int int19 = property6.getMaximumTextLength(locale16);
        org.joda.time.DateTime dateTime20 = property6.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property21 = dateTime20.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.millisOfSecond();
        org.joda.time.DurationField durationField29 = chronology25.seconds();
        org.joda.time.DurationField durationField30 = chronology25.centuries();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.millisOfSecond();
        org.joda.time.DurationField durationField32 = chronology25.years();
        org.joda.time.Chronology chronology33 = chronology25.withUTC();
        org.joda.time.DurationField durationField34 = chronology33.months();
        boolean boolean35 = durationFieldType22.isSupported(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.secondOfMinute();
        int int38 = dateTimeField36.get((long) 941);
        int int39 = dateTime20.get(dateTimeField36);
        int int40 = dateTimeField36.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 15:16:10 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "21" + "'", str7, "21");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Feb 21 15:16:10 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "it" + "'", str17, "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "21" + "'", str18, "21");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 59 + "'", int39 == 59);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 59 + "'", int40 == 59);
    }

    @Test
    public void test21121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21121");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        org.joda.time.DurationField durationField8 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours((int) (byte) 0);
        boolean boolean15 = dateTime13.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks((int) 'a');
        boolean boolean20 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime19.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.weekyear();
        boolean boolean29 = dateTime23.equals((java.lang.Object) localDateTime25);
        org.joda.time.DateTime dateTime31 = dateTime23.minusMonths(54616882);
        org.joda.time.LocalDateTime localDateTime32 = dateTime31.toLocalDateTime();
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        int[] intArray35 = chronology2.get((org.joda.time.ReadablePartial) localDateTime32, 0L);
        org.joda.time.DateTimeField dateTimeField36 = chronology2.hourOfDay();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1970, 1, 1, 0]");
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test21122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21122");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minusMinutes(26);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime6.withFieldAdded(durationFieldType12, 70);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusHours((int) (byte) 0);
        boolean boolean20 = dateTime18.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusWeeks((int) 'a');
        boolean boolean25 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime();
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology32 = dateTime29.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) dateTime26, chronology32);
        java.util.Date date35 = dateTime26.toDate();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.fromDateFields(date35);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.fromDateFields(date35);
        int int38 = localDateTime37.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime6.plusSeconds(332);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime6.plusHours(68837);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        int int45 = localDateTime43.getYearOfEra();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Mon Apr 13 15:16:10 GMT+00:00 2020");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1977 + "'", int45 == 1977);
    }

    @Test
    public void test21123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekyear((-1));
        org.joda.time.DateMidnight dateMidnight5 = dateTime2.toDateMidnight();
        int int6 = dateTime2.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = dateTime2.toString(dateTimeFormatter7);
        org.joda.time.DateTime dateTime9 = dateTime2.toDateTimeISO();
        org.joda.time.Chronology chronology10 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale14, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField18 = null;
        dateTimeParserBucket17.saveField(dateTimeField18, (int) (short) 0);
        dateTimeParserBucket17.setOffset((java.lang.Integer) (-1));
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.secondOfMinute();
        java.lang.String str29 = dateTimeField27.getAsShortText((-31948L));
        dateTimeParserBucket17.saveField(dateTimeField27, 2);
        java.util.Locale locale32 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(1645456006964L, chronology10, locale32, (java.lang.Integer) 94, 54466);
        org.joda.time.DateTimeField dateTimeField36 = chronology10.weekyear();
        org.joda.time.DurationField durationField37 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField38 = chronology10.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        long long42 = chronology10.add(readablePeriod39, 54634662L, 848);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray45 = chronology10.get(readablePeriod43, 219L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateMidnight5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54970 + "'", int6 == 54970);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022-02-21T15:16:10.544+00:00:00.052" + "'", str8, "2022-02-21T15:16:10.544+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "28" + "'", str29, "28");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 54634662L + "'", long42 == 54634662L);
    }

    @Test
    public void test21124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21124");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMonths((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readableDuration5);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology8, locale9, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket12.saveField(dateTimeField13, (int) (short) 0);
        java.lang.Integer int16 = dateTimeParserBucket12.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        long long20 = dateTimeZone17.convertLocalToUTC(0L, false);
        dateTimeParserBucket12.setZone(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = property25.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withYearOfEra((int) 'x');
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours((int) (byte) 0);
        boolean boolean35 = dateTime33.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime33.toMutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.era();
        int int40 = mutableDateTime38.get(dateTimeFieldType39);
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType39.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType39.getDurationType();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime28.withField(dateTimeFieldType39, 0);
        java.util.Locale locale46 = java.util.Locale.ITALY;
        dateTimeParserBucket12.saveField(dateTimeFieldType39, "5", locale46);
        boolean boolean48 = localDateTime6.isSupported(dateTimeFieldType39);
        java.lang.String str49 = dateTimeFieldType39.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-52L) + "'", long20 == (-52L));
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(timeZone37);
// flaky:         org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(durationFieldType41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "era" + "'", str49, "era");
    }

    @Test
    public void test21125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21125");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.minusDays(0);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear((-1));
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths(10);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        int int16 = dateTime14.getYearOfEra();
        boolean boolean17 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Chronology chronology18 = dateTime14.getChronology();
        org.joda.time.TimeOfDay timeOfDay19 = dateTime14.toTimeOfDay();
        org.joda.time.DateTime dateTime20 = dateTime14.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime21 = dateTime20.withEarlierOffsetAtOverlap();
        org.joda.time.DateMidnight dateMidnight22 = dateTime21.toDateMidnight();
        org.joda.time.Chronology chronology23 = dateTime21.getChronology();
        org.joda.time.DateTime.Property property24 = dateTime21.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test21126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21126");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYear((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withFieldAdded(durationFieldType8, 440);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfMinute();
        org.joda.time.DurationField durationField16 = chronology13.millis();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusSeconds((int) ' ');
        long long22 = chronology13.set((org.joda.time.ReadablePartial) localDateTime20, (long) 99);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withYearOfEra(21);
        int int25 = localDateTime24.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime32 = property29.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusMinutes(20);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.plus(readableDuration37);
        java.lang.String str39 = localDateTime34.toString();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.millisOfSecond();
        int int44 = property43.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime45 = property43.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plus(readableDuration46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.yearOfEra();
        org.joda.time.LocalDateTime localDateTime49 = property48.roundHalfFloorCopy();
        int int50 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusDays(212);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone58);
        org.joda.time.DateTime dateTime61 = dateTime59.plusHours((int) (byte) 0);
        java.util.Date date62 = dateTime59.toDate();
        org.joda.time.DateTime.Property property63 = dateTime59.dayOfMonth();
        org.joda.time.DateTime.Property property64 = dateTime59.dayOfMonth();
        org.joda.time.DateTime dateTime65 = dateTime59.withEarlierOffsetAtOverlap();
        int int66 = dateTime59.getYear();
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology69 = localDateTime68.getChronology();
        org.joda.time.LocalDateTime.Property property70 = localDateTime68.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime71 = property70.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.era();
        boolean boolean73 = localDateTime71.isSupported(dateTimeFieldType72);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology76 = localDateTime75.getChronology();
        org.joda.time.LocalDateTime localDateTime77 = org.joda.time.LocalDateTime.now(chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.secondOfMinute();
        boolean boolean79 = dateTimeFieldType72.isSupported(chronology76);
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(chronology76);
        org.joda.time.DurationFieldType durationFieldType81 = org.joda.time.DurationFieldType.weeks();
        boolean boolean82 = localDateTime80.isSupported(durationFieldType81);
        org.joda.time.DateTime dateTime84 = dateTime59.withFieldAdded(durationFieldType81, 0);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime55.withFieldAdded(durationFieldType81, 99);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime49.withFieldAdded(durationFieldType81, 34);
        boolean boolean89 = localDateTime24.isAfter((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime90.withWeekyear(432);
        org.joda.time.ReadableDuration readableDuration93 = null;
        org.joda.time.LocalDateTime localDateTime95 = localDateTime92.withDurationAdded(readableDuration93, 61039738);
        int int96 = localDateTime95.getYearOfCentury();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-31948L) + "'", long22 == (-31948L));
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12 + "'", int25 == 12);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0010-01-07T00:00:00.080" + "'", str39, "0010-01-07T00:00:00.080");
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Mon Feb 21 15:16:10 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2022 + "'", int66 == 2022);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(localDateTime90);
        org.junit.Assert.assertNotNull(localDateTime92);
        org.junit.Assert.assertNotNull(localDateTime95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 32 + "'", int96 == 32);
    }

    @Test
    public void test21127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21127");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        boolean boolean7 = dateTime5.isBeforeNow();
        int int8 = dateTime5.getYearOfEra();
        org.joda.time.DateTime dateTime10 = dateTime5.withMillisOfDay(3);
        org.joda.time.DateTime.Property property11 = dateTime5.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property11.getFieldType();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
    }

    @Test
    public void test21128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21128");
        java.io.IOException iOException3 = new java.io.IOException("13");
        java.io.IOException iOException4 = new java.io.IOException("2022-02-21T15:06:36.478+00:00:00.052", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException3.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException8 = new java.io.IOException("2022-02-21T15:43:10.836+00:00:00.052", (java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test21129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21129");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology8);
        java.lang.String str10 = chronology8.toString();
        org.joda.time.DurationField durationField11 = chronology8.hours();
        int int12 = durationField5.compareTo(durationField11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology15);
        java.lang.String str17 = chronology15.toString();
        org.joda.time.DurationField durationField18 = chronology15.hours();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology21);
        java.lang.String str23 = chronology21.toString();
        org.joda.time.DurationField durationField24 = chronology21.hours();
        int int25 = durationField18.compareTo(durationField24);
        int int26 = durationField5.compareTo(durationField24);
        org.joda.time.DurationFieldType durationFieldType27 = durationField5.getType();
        long long29 = durationField5.getMillis(2022);
        long long32 = durationField5.getMillis(536, (long) (byte) 1);
        java.lang.String str33 = durationField5.getName();
        long long36 = durationField5.subtract(52L, (long) 647);
        long long39 = durationField5.getMillis(1645456008871L, 1645456008871L);
        long long42 = durationField5.subtract(19710L, 975);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = chronology45.getZone();
        org.joda.time.DurationField durationField48 = chronology45.centuries();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.era();
        org.joda.time.DurationField durationField50 = chronology45.years();
        org.joda.time.DurationFieldType durationFieldType51 = durationField50.getType();
        int int52 = durationField5.compareTo(durationField50);
        long long55 = durationField5.subtract(50925L, 1586790423701L);
        org.joda.time.DurationFieldType durationFieldType56 = durationField5.getType();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[UTC]" + "'", str10, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[UTC]" + "'", str17, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ISOChronology[UTC]" + "'", str23, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 7279200000L + "'", long29 == 7279200000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1929600000L + "'", long32 == 1929600000L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hours" + "'", str33, "hours");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-2329199948L) + "'", long36 == (-2329199948L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5923641631935600000L + "'", long39 == 5923641631935600000L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-3509980290L) + "'", long42 == (-3509980290L));
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-5712445525323549075L) + "'", long55 == (-5712445525323549075L));
        org.junit.Assert.assertNotNull(durationFieldType56);
    }

    @Test
    public void test21130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21130");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minus(readableDuration3);
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology6, locale7, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket10.saveField(dateTimeField11, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale16 = java.util.Locale.ROOT;
        dateTimeParserBucket10.saveField(dateTimeFieldType14, "it", locale16);
        java.lang.String str18 = dateTimeFieldType14.getName();
        boolean boolean19 = localDateTime4.isSupported(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "weekOfWeekyear" + "'", str18, "weekOfWeekyear");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test21131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21131");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.weekyear();
        boolean boolean19 = dateTime13.equals((java.lang.Object) localDateTime15);
        org.joda.time.DateTime dateTime21 = dateTime13.minusMonths(54616882);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime25 = property23.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime26 = property23.roundCeilingCopy();
        org.joda.time.Interval interval27 = property23.toInterval();
        org.joda.time.LocalDateTime localDateTime28 = property23.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime29 = property23.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withCenturyOfEra(54841);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test21132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21132");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours((int) (byte) 0);
        boolean boolean6 = dateTime4.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) 'a');
        boolean boolean11 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime();
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology18 = dateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) dateTime12, chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = chronology18.getZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(788923800000L, chronology18);
        org.joda.time.DurationField durationField23 = chronology18.months();
        int int26 = durationField23.getDifference((long) 145, (long) 39);
        org.joda.time.DurationFieldType durationFieldType27 = durationField23.getType();
        long long30 = durationField23.getDifferenceAsLong((long) 54889946, 54494207L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test21133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21133");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str6 = property3.toString();
        org.joda.time.DurationField durationField7 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property3.addToCopy(703);
        org.joda.time.LocalDateTime localDateTime11 = property3.addToCopy(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfEra(440);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[millisOfSecond]" + "'", str6, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test21134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21134");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(392);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test21135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21135");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        org.joda.time.DurationField durationField8 = chronology2.minutes();
        org.joda.time.DurationField durationField9 = chronology2.hours();
        org.joda.time.DateTimeField dateTimeField10 = chronology2.weekyear();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime17 = property14.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withWeekyear((int) (short) 10);
        int int20 = localDateTime19.getMonthOfYear();
        java.lang.String str21 = localDateTime19.toString();
        long long23 = chronology2.set((org.joda.time.ReadablePartial) localDateTime19, (long) 164);
        org.joda.time.DurationField durationField24 = chronology2.weeks();
        org.joda.time.DateTimeField dateTimeField25 = chronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology2.yearOfEra();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0010-01-07T00:00:00.080" + "'", str21, "0010-01-07T00:00:00.080");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-61851081599920L) + "'", long23 == (-61851081599920L));
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test21136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21136");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("-0001-02-22T15:06:34.762+00:00:00.052");
        org.joda.time.DateTime dateTime3 = dateTime1.plusMinutes(643);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test21137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21137");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology3);
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.Chronology chronology9 = chronology3.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField12 = chronology3.minutes();
        org.joda.time.DateTimeField dateTimeField13 = chronology3.minuteOfDay();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField15 = chronology3.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test21138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21138");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = dateTime5.withZone(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plus(readableDuration16);
        org.joda.time.DateTime dateTime18 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withDurationAdded(readableDuration19, 99);
        int int22 = localDateTime15.getYearOfEra();
        int int23 = localDateTime15.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
    }

    @Test
    public void test21139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21139");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology6 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) 7889238000013L, chronology6);
        java.util.Locale locale11 = new java.util.Locale("25", "1980-08-18T00:00:00.087");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 913, chronology6, locale11, (java.lang.Integer) (-1), 54615607);
        java.util.Locale locale15 = dateTimeParserBucket14.getLocale();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals(locale11.toString(), "25_1980-08-18T00:00:00.087");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "25_1980-08-18T00:00:00.087");
    }

    @Test
    public void test21140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21140");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withCenturyOfEra(54589);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusHours(333);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withDurationAdded(readableDuration12, 204);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusDays(212);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekyear();
        org.joda.time.LocalDateTime localDateTime26 = property24.addWrapFieldToCopy(576);
        boolean boolean27 = property24.isLeap();
        org.joda.time.LocalDateTime localDateTime28 = property24.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime29 = property24.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMinutes(54647556);
        int int34 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime14.getFieldType(54676201);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54676201");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test21141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21141");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2922789-04-13T15:15:08.064+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test21142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21142");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 54652320);
    }

    @Test
    public void test21143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21143");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(212);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime localDateTime11 = property9.addWrapFieldToCopy(576);
        boolean boolean12 = property9.isLeap();
        org.joda.time.LocalDateTime localDateTime13 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMinutes(54616882);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusHours((int) (byte) 0);
        boolean boolean24 = dateTime22.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusWeeks((int) 'a');
        boolean boolean29 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime();
        org.joda.time.DateTime dateTime32 = dateTime28.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property37 = localDateTime34.weekyear();
        boolean boolean38 = dateTime32.equals((java.lang.Object) localDateTime34);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime32.getZone();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime18, dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusMinutes(54);
        int int43 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime.Property property44 = localDateTime16.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(property44);
    }

    @Test
    public void test21144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21144");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = property16.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withDayOfYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 0);
        int[] intArray24 = localDateTime23.getValues();
        chronology12.validate((org.joda.time.ReadablePartial) localDateTime21, intArray24);
        org.joda.time.DurationField durationField26 = chronology12.minutes();
        org.joda.time.DateTimeField dateTimeField27 = chronology12.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = chronology12.add(readablePeriod28, 1645456224712L, 54410);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(intArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1970, 1, 1, 52]");
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1645456224712L + "'", long31 == 1645456224712L);
    }

    @Test
    public void test21145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21145");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (-292275054));
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds(1946);
        int int6 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusDays(60588345);
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDateTime1.getFieldType(54600048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54600048");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1969 + "'", int6 == 1969);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test21146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21146");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property14 = dateTime11.centuryOfEra();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getLanguage();
        java.lang.String str17 = property14.getAsText(locale15);
        java.lang.String str18 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDateTime8, (-1), locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = localDateTime8.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime8.minusDays(51);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusHours((int) (byte) 0);
        java.util.Date date31 = dateTime28.toDate();
        org.joda.time.DateTime.Property property32 = dateTime28.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        boolean boolean34 = localDateTime26.isSupported(dateTimeFieldType33);
        org.joda.time.DateTimeField[] dateTimeFieldArray35 = localDateTime26.getFields();
        int int36 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = localDateTime22.toString(dateTimeFormatter37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusWeeks((int) 'a');
        int int43 = dateTime42.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime dateTime46 = dateTime42.withField(dateTimeFieldType44, 2);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology49 = localDateTime48.getChronology();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now(chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.millisOfSecond();
        org.joda.time.DurationField durationField53 = chronology49.seconds();
        org.joda.time.DurationField durationField54 = chronology49.centuries();
        org.joda.time.DurationField durationField55 = chronology49.minutes();
        org.joda.time.DurationField durationField56 = chronology49.hours();
        org.joda.time.DateTimeField dateTimeField57 = chronology49.weekyear();
        org.joda.time.DateTimeField dateTimeField58 = chronology49.hourOfHalfday();
        org.joda.time.DurationField durationField59 = chronology49.months();
        org.joda.time.DateTimeField dateTimeField60 = chronology49.dayOfWeek();
        boolean boolean61 = dateTimeFieldType44.isSupported(chronology49);
        boolean boolean62 = localDateTime22.isSupported(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it" + "'", str16, "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "20" + "'", str17, "20");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Mon Feb 21 15:16:11 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2022-01-01T15:16:10.871" + "'", str38, "2022-01-01T15:16:10.871");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 923 + "'", int43 == 923);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test21147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21147");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        int int4 = property3.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plus(readableDuration6);
        int int8 = localDateTime5.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.minusMillis(941);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.plusMinutes(60595082);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusHours((int) (byte) 0);
        boolean boolean18 = dateTime16.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusWeeks((int) 'a');
        boolean boolean23 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime22.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.weekyear();
        boolean boolean32 = dateTime26.equals((java.lang.Object) localDateTime28);
        org.joda.time.DateTime dateTime34 = dateTime26.minusMonths(54616882);
        org.joda.time.LocalDateTime localDateTime35 = dateTime34.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.plusMonths(766);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withWeekyear((-1));
        org.joda.time.DateTime dateTime45 = dateTime43.minusHours(15);
        org.joda.time.DateTime dateTime47 = dateTime43.minusHours(212);
        int int48 = dateTime47.getMillisOfSecond();
        org.joda.time.DateTime.Property property49 = dateTime47.year();
        org.joda.time.DateTime dateTime50 = localDateTime39.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime51 = dateTime47.toDateTimeISO();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 70 + "'", int8 == 70);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 967 + "'", int48 == 967);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test21148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21148");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale2 = null;
        java.lang.String str5 = nameProvider0.getName(locale2, "2922789-04-13T15:10:10.887+00:00:00.052", "2035-03-07T15:12:09.916Z");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test21149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21149");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = dateTime3.toDateTime(dateTimeZone5);
        java.lang.String str8 = dateTimeZone5.getID();
        java.util.TimeZone timeZone9 = dateTimeZone5.toTimeZone();
        java.util.TimeZone.setDefault(timeZone9);
        timeZone9.setID("-0001-02-22T15:08:53.836Z");
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withDurationAdded(readableDuration14, 0);
        java.util.Date date17 = localDateTime13.toDate();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.fromDateFields(date17);
        boolean boolean19 = timeZone9.inDaylightTime(date17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.052" + "'", str8, "+00:00:00.052");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Mon Feb 21 15:16:11 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test21150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21150");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds(26);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = property6.getDateTime();
        org.joda.time.DateTime dateTime9 = property6.roundHalfCeilingCopy();
        java.lang.String str10 = property6.getName();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekyear((-1));
        org.joda.time.DateMidnight dateMidnight15 = dateTime12.toDateMidnight();
        int int16 = dateTime12.getSecondOfDay();
        org.joda.time.DateTime dateTime18 = dateTime12.plus(1737832240723L);
        int int19 = property6.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfEra" + "'", str10, "yearOfEra");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 54971 + "'", int16 == 54971);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test21151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21151");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.minusWeeks(54656581);
        org.joda.time.DateTime.Property property8 = dateTime3.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        java.lang.String str10 = property8.getAsShortText();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "15" + "'", str10, "15");
    }

    @Test
    public void test21152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21152");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("2922789-04-13T15:11:45.784+00:00:00.052", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21153");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(212);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfDay(104);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, 54603540);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusHours((int) (byte) 0);
        boolean boolean22 = dateTime20.isEqual((long) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = dateTime20.toString(dateTimeFormatter23);
        org.joda.time.DateTime.Property property25 = dateTime20.monthOfYear();
        java.lang.String str26 = property25.getAsShortText();
        org.joda.time.DateTime dateTime27 = property25.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekyear((-1));
        org.joda.time.DateTime dateTime33 = dateTime29.plusHours((int) (byte) 100);
        boolean boolean35 = dateTime33.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime33.toMutableDateTime(dateTimeZone36);
        int int38 = dateTime33.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime33.minus(readableDuration39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMonths(60590228);
        org.joda.time.DateTime dateTime43 = dateTime42.withLaterOffsetAtOverlap();
        int int44 = property25.getDifference((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime.Property property45 = dateTime43.monthOfYear();
        org.joda.time.DateTime dateTime47 = property45.addToCopy(679);
        org.joda.time.DateTime dateTime48 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime13.minusMonths(69145);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-21T15:16:11.068+00:00:00.052" + "'", str24, "2022-02-21T15:16:11.068+00:00:00.052");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "feb" + "'", str26, "feb");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 25 + "'", int38 == 25);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-60590228) + "'", int44 == (-60590228));
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
    }

    @Test
    public void test21154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21154");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = dateTimeField6.getLeapDurationField();
        long long10 = dateTimeField6.add(1645456023970L, (long) 1995);
        long long12 = dateTimeField6.roundHalfEven(1586790423701L);
        boolean boolean13 = dateTimeField6.isSupported();
        java.lang.String str15 = dateTimeField6.getAsShortText((long) 54852);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1652638023970L + "'", long10 == 1652638023970L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1586790000000L + "'", long12 == 1586790000000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12" + "'", str15, "12");
    }

    @Test
    public void test21155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21155");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = property7.addWrapFieldToCopy((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property7.getFieldType();
        org.joda.time.DateTimeField dateTimeField11 = property7.getField();
        org.joda.time.DateTimeField dateTimeField12 = property7.getField();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((-1));
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths(10);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        int int21 = dateTime19.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime25 = dateTime19.withZone(dateTimeZone23);
        long long27 = dateTimeZone23.nextTransition(1645455982776L);
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfYear();
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder30.setExtension('a', "cinese");
        java.util.Locale.Builder builder35 = builder30.setLanguageTag("coreano");
        java.util.Locale.Builder builder37 = builder30.removeUnicodeLocaleAttribute("999");
        java.util.Locale.Builder builder39 = builder37.setLanguage("ja");
        java.util.Locale.Builder builder41 = builder39.removeUnicodeLocaleAttribute("China");
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.secondOfMinute();
        java.lang.String str48 = dateTimeField46.getAsShortText((-31948L));
        java.util.Locale locale49 = java.util.Locale.KOREA;
        int int50 = dateTimeField46.getMaximumShortTextLength(locale49);
        java.util.Locale.Builder builder51 = builder39.setLocale(locale49);
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder55 = builder52.setExtension('a', "cinese");
        java.util.Locale locale56 = builder52.build();
        java.util.Locale locale57 = builder52.build();
        java.util.Locale locale58 = java.util.Locale.ENGLISH;
        java.lang.String str59 = locale58.getDisplayScript();
        java.lang.String str60 = locale58.getCountry();
        java.util.Locale locale63 = new java.util.Locale("22", "");
        java.lang.String str64 = locale58.getDisplayVariant(locale63);
        boolean boolean65 = locale63.hasExtensions();
        java.lang.String str66 = locale57.getDisplayCountry(locale63);
        java.util.Locale.Builder builder67 = builder39.setLocale(locale57);
        java.lang.String str68 = property29.getAsText(locale57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime69 = property7.setCopy("-292275054-05-02T03:41:44.087", locale57);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"-292275054-05-02T03:41:44.087\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1645455982776L + "'", long27 == 1645455982776L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "28" + "'", str48, "28");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals(locale63.toString(), "22");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "52" + "'", str68, "52");
    }

    @Test
    public void test21156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21156");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime4);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusHours(21);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.minus(readablePeriod26);
        org.joda.time.DateTime dateTime28 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime.Property property33 = localDateTime31.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundHalfEvenCopy();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean36 = localDateTime34.isSupported(durationFieldType35);
        org.joda.time.Chronology chronology37 = localDateTime34.getChronology();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withYear(541);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = localDateTime34.toString(dateTimeFormatter40);
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.lang.String str43 = locale42.getLanguage();
        java.lang.String str44 = locale42.getScript();
        java.util.Set<java.lang.Character> charSet45 = locale42.getExtensionKeys();
        java.util.Set<java.lang.String> strSet46 = locale42.getUnicodeLocaleAttributes();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology49 = localDateTime48.getChronology();
        org.joda.time.LocalDateTime.Property property50 = localDateTime48.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime51 = property50.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.era();
        boolean boolean53 = localDateTime51.isSupported(dateTimeFieldType52);
        boolean boolean54 = strSet46.equals((java.lang.Object) dateTimeFieldType52);
        boolean boolean55 = localDateTime34.isSupported(dateTimeFieldType52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime57 = localDateTime12.withField(dateTimeFieldType52, 928);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 928 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(localDateTime39);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01T00:00:00.052" + "'", str41, "1970-01-01T00:00:00.052");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "it" + "'", str43, "it");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charSet45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test21157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21157");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime7 = property6.getDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis(54500951);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillisOfDay(54401609);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readableDuration13);
        org.joda.time.DateTime dateTime15 = dateTime14.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test21158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21158");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.weekyear();
        boolean boolean19 = dateTime13.equals((java.lang.Object) localDateTime15);
        int int20 = localDateTime15.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusHours((int) (byte) 0);
        boolean boolean26 = dateTime24.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusWeeks((int) 'a');
        boolean boolean31 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime32 = dateTime30.toDateTime();
        org.joda.time.DateTime dateTime34 = dateTime30.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property39 = localDateTime36.weekyear();
        boolean boolean40 = dateTime34.equals((java.lang.Object) localDateTime36);
        org.joda.time.DateTime dateTime42 = dateTime34.minusMonths(54616882);
        boolean boolean43 = localDateTime15.equals((java.lang.Object) 54616882);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime15.withDayOfYear(99);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minusSeconds(80);
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology49, locale50, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField54 = null;
        dateTimeParserBucket53.saveField(dateTimeField54, (int) (short) 0);
        java.lang.Integer int57 = dateTimeParserBucket53.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket53.setZone(dateTimeZone58);
        int int61 = dateTimeZone58.getStandardOffset((long) 1969);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long65 = dateTimeZone58.getMillisKeepLocal(dateTimeZone63, (long) 99);
        org.joda.time.DateTime dateTime66 = localDateTime47.toDateTime(dateTimeZone58);
        org.joda.time.DateTime dateTime67 = dateTime66.toDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 70 + "'", int20 == 70);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 52 + "'", int61 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone63);
// flaky:         org.junit.Assert.assertTrue("'" + long65 + "' != '" + 150L + "'", long65 == 150L);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime67);
    }

    @Test
    public void test21159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21159");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours((int) (byte) 0);
        java.util.Date date8 = dateTime5.toDate();
        org.joda.time.DateTime.Property property9 = dateTime5.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        boolean boolean11 = localDateTime3.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.millisOfDay();
        long long14 = property13.remainder();
        org.joda.time.LocalDateTime localDateTime15 = property13.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Feb 21 15:16:11 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test21160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21160");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean6 = localDateTime4.isSupported(durationFieldType5);
        org.joda.time.Chronology chronology7 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withYear(541);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withMillisOfSecond(0);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime19.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean23 = dateTime22.isEqualNow();
        org.joda.time.DateTime.Property property24 = dateTime22.secondOfMinute();
        org.joda.time.DateTime dateTime26 = property24.addToCopy(0L);
        org.joda.time.DateTime dateTime27 = dateTime26.withLaterOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTime dateTime30 = dateTime27.withFieldAdded(durationFieldType28, 162);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime4.withFieldAdded(durationFieldType28, 54388);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = property36.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology40 = localDateTime39.getChronology();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(chronology43);
        java.lang.String str45 = chronology43.toString();
        org.joda.time.DurationField durationField46 = chronology43.hours();
        long long49 = durationField46.getDifferenceAsLong((long) 948, (long) 519);
        org.joda.time.DurationFieldType durationFieldType50 = durationField46.getType();
        boolean boolean51 = localDateTime39.isSupported(durationFieldType50);
        org.joda.time.Chronology chronology52 = localDateTime39.getChronology();
        boolean boolean53 = localDateTime32.isBefore((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime39.plusMonths(364);
        org.joda.time.LocalDateTime.Property property56 = localDateTime39.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime58 = property56.addWrapFieldToCopy(870);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusMinutes(285);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ISOChronology[UTC]" + "'", str45, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
    }

    @Test
    public void test21161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21161");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        int int6 = dateTime5.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours((int) (byte) 0);
        boolean boolean12 = dateTime10.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks((int) 'a');
        boolean boolean17 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        java.lang.String str20 = chronology19.toString();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime5.toDateTime(chronology19);
        org.joda.time.DateTime dateTime23 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property24 = dateTime22.year();
        org.joda.time.DateTime dateTime25 = property24.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54611208 + "'", int6 == 54611208);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[+00:00:00.052]" + "'", str20, "ISOChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test21162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21162");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime.Property property11 = dateTime3.secondOfDay();
        java.lang.String str12 = property11.getAsString();
        java.lang.String str13 = property11.getAsString();
        org.joda.time.DateTime dateTime15 = property11.addToCopy(68878);
        java.lang.Class<?> wildcardClass16 = dateTime15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "54971" + "'", str12, "54971");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "54971" + "'", str13, "54971");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test21163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21163");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology8);
        java.lang.String str10 = chronology8.toString();
        org.joda.time.DurationField durationField11 = chronology8.hours();
        int int12 = durationField5.compareTo(durationField11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology15);
        java.lang.String str17 = chronology15.toString();
        org.joda.time.DurationField durationField18 = chronology15.hours();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology21);
        java.lang.String str23 = chronology21.toString();
        org.joda.time.DurationField durationField24 = chronology21.hours();
        int int25 = durationField18.compareTo(durationField24);
        int int26 = durationField5.compareTo(durationField24);
        org.joda.time.DurationFieldType durationFieldType27 = durationField5.getType();
        long long29 = durationField5.getMillis(2022);
        long long32 = durationField5.getMillis(536, (long) (byte) 1);
        java.lang.String str33 = durationField5.getName();
        boolean boolean34 = durationField5.isPrecise();
        int int36 = durationField5.getValue((-1645455600000L));
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[UTC]" + "'", str10, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[UTC]" + "'", str17, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ISOChronology[UTC]" + "'", str23, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 7279200000L + "'", long29 == 7279200000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1929600000L + "'", long32 == 1929600000L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hours" + "'", str33, "hours");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-457071) + "'", int36 == (-457071));
    }

    @Test
    public void test21164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21164");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfEra((int) 'x');
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withFieldAdded(durationFieldType7, (int) (byte) -1);
        int int10 = localDateTime9.getMinuteOfHour();
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime9.getFields();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minus(readableDuration12);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test21165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21165");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder8 = builder3.setVariant("years");
        java.util.Locale locale9 = builder8.build();
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder11 = builder2.setLocale(locale9);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale.Builder builder15 = builder12.clearExtensions();
        java.util.Locale.Builder builder16 = builder12.clear();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale.Builder builder18 = builder16.clear();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale.Builder builder20 = builder2.setLocale(locale19);
        java.util.Locale.Builder builder21 = builder20.clearExtensions();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(99);
        int int25 = dateTimeZone23.getOffsetFromLocal((-3379860L));
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.tz.NameProvider nameProvider28 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.lang.String str32 = nameProvider28.getName(locale29, "2022-02-21T15:06:28.281+00:00:00.052", "secondOfDay");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider28);
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale35 = java.util.Locale.getDefault(category34);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusHours((int) (byte) 0);
        boolean boolean41 = dateTime39.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime39.toMutableDateTime(dateTimeZone42);
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.lang.String str47 = dateTimeZone42.getName((long) (byte) 1, locale46);
        java.lang.String str48 = locale46.getScript();
        java.lang.String str49 = locale35.getDisplayScript(locale46);
        java.lang.String str50 = locale35.getDisplayVariant();
        boolean boolean51 = locale35.hasExtensions();
        java.lang.String str52 = locale35.getScript();
        java.lang.String str55 = nameProvider28.getName(locale35, "-0001-02-22T15:06:45.260+00:00:00.052", "-0001-02-22T15:06:25.657+00:00:00.052");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider28);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology59 = localDateTime58.getChronology();
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now(chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.millisOfSecond();
        org.joda.time.DurationField durationField63 = chronology59.seconds();
        org.joda.time.DurationField durationField64 = chronology59.centuries();
        org.joda.time.DateTimeField dateTimeField65 = chronology59.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology68 = localDateTime67.getChronology();
        org.joda.time.LocalDateTime.Property property69 = localDateTime67.millisOfSecond();
        int int70 = property69.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime71 = property69.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plus(readableDuration72);
        int int74 = localDateTime71.getYearOfCentury();
        java.util.Locale locale76 = new java.util.Locale("15");
        java.lang.String str77 = locale76.getScript();
        java.lang.String str78 = dateTimeField65.getAsShortText((org.joda.time.ReadablePartial) localDateTime71, locale76);
        java.lang.String str81 = nameProvider28.getName(locale76, "", "1148");
        java.lang.String str82 = dateTimeZone23.getShortName((long) 54623, locale76);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder83 = builder21.setLocale(locale76);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 15 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(nameProvider28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.FORMAT + "'", category34.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(timeZone43);
// flaky:         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.052" + "'", str47, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 70 + "'", int74 == 70);
        org.junit.Assert.assertEquals(locale76.toString(), "15");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "52" + "'", str78, "52");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "+00:00:00.099" + "'", str82, "+00:00:00.099");
    }

    @Test
    public void test21166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21166");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.setLanguage("Cina");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test21167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21167");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("999");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.time.ZoneId zoneId3 = timeZone1.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        java.util.TimeZone.setDefault(timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("");
        int int11 = timeZone9.getOffset((long) 59);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        boolean boolean14 = timeZone5.hasSameRules(timeZone9);
        timeZone9.setRawOffset(80);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        boolean boolean18 = timeZone9.observesDaylightTime();
        boolean boolean19 = timeZone1.hasSameRules(timeZone9);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Ora media di Greenwich");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Ora media di Greenwich");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test21168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21168");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        boolean boolean7 = dateTime5.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime5.toMutableDateTime(dateTimeZone8);
        int int10 = dateTime5.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime5.minus(readableDuration11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths(60590228);
        org.joda.time.DateTime dateTime16 = dateTime12.withYearOfEra(52);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(2000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour((-292277023));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292277023 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test21169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21169");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("");
        org.joda.time.DateTimeZone dateTimeZone4 = provider0.getZone("en");
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone7 = provider0.getZone("-0001-02-22T15:07:08.804Z");
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet9 = provider0.getAvailableIDs();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology11, locale12, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket15.saveField(dateTimeField16, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale21 = java.util.Locale.ROOT;
        dateTimeParserBucket15.saveField(dateTimeFieldType19, "it", locale21);
        java.lang.String str23 = locale21.getISO3Country();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours((int) (byte) 0);
        java.util.Date date28 = dateTime25.toDate();
        org.joda.time.DateTime.Property property29 = dateTime25.dayOfMonth();
        org.joda.time.DateTime.Property property30 = dateTime25.dayOfMonth();
        java.util.Locale locale31 = java.util.Locale.ITALIAN;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = property30.getAsText(locale31);
        java.lang.String str34 = locale21.getDisplayScript(locale31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusHours((int) (byte) 0);
        boolean boolean40 = dateTime38.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone42 = dateTimeZone41.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime38.toMutableDateTime(dateTimeZone41);
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str46 = dateTimeZone41.getShortName((long) (short) 100, locale45);
        java.lang.String str47 = locale45.getLanguage();
        java.lang.String str48 = locale21.getDisplayCountry(locale45);
        java.util.Set<java.lang.String> strSet49 = locale45.getUnicodeLocaleKeys();
        java.util.Iterator<java.lang.String> strItor50 = strSet49.iterator();
        boolean boolean51 = strSet9.removeAll((java.util.Collection<java.lang.String>) strSet49);
        strSet9.clear();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Mon Feb 21 15:16:11 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "it" + "'", str32, "it");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "21" + "'", str33, "21");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky:         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.052" + "'", str46, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "zh" + "'", str47, "zh");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test21170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21170");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        int int4 = property3.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusHours((int) (byte) 0);
        java.util.Date date9 = dateTime6.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone10.getOffset(readableInstant11);
        int int14 = dateTimeZone10.getStandardOffset((long) 15);
        org.joda.time.DateTime dateTime15 = dateTime6.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusHours((int) (byte) 0);
        java.util.Date date20 = dateTime17.toDate();
        org.joda.time.DateTime.Property property21 = dateTime17.dayOfMonth();
        org.joda.time.DateTime.Property property22 = dateTime17.dayOfMonth();
        java.lang.String str23 = property22.getAsString();
        org.joda.time.DateTime dateTime24 = property22.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusHours((int) (byte) 0);
        java.util.Date date29 = dateTime26.toDate();
        org.joda.time.DateTime.Property property30 = dateTime26.dayOfMonth();
        org.joda.time.DateTime.Property property31 = dateTime26.dayOfMonth();
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = property31.getAsText(locale32);
        int int35 = property22.getMaximumTextLength(locale32);
        org.joda.time.DateTime dateTime36 = property22.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property37 = dateTime36.dayOfMonth();
        int int38 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime36);
        long long39 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime41 = dateTime36.withDayOfMonth(168);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 168 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Feb 21 15:16:11 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Mon Feb 21 15:16:11 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "21" + "'", str23, "21");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Mon Feb 21 15:16:11 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "it" + "'", str33, "it");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "21" + "'", str34, "21");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1645487999896L) + "'", long39 == (-1645487999896L));
    }

    @Test
    public void test21171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21171");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYear((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int8 = localDateTime6.get(dateTimeFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusMinutes(13);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.era();
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMillis(0);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test21172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21172");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        java.lang.String str5 = property3.toString();
        org.joda.time.LocalDateTime localDateTime6 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        boolean boolean9 = property7.equals((java.lang.Object) 32400000L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        java.lang.String str13 = dateTimeZone11.toString();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.clockhourOfDay();
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale21.getVariant();
        java.lang.String str23 = dateTimeField19.getAsText((-1), locale21);
        boolean boolean24 = locale21.hasExtensions();
        java.lang.String str25 = dateTimeZone11.getName(1645455983203L, locale21);
        org.joda.time.LocalDateTime localDateTime26 = property7.setCopy("6", locale21);
        org.joda.time.LocalDateTime localDateTime27 = property7.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime29 = property7.addWrapFieldToCopy(68984492);
        int int30 = property7.getMaximumValue();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[millisOfSecond]" + "'", str5, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.052" + "'", str13, "+00:00:00.052");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.052" + "'", str25, "+00:00:00.052");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 999 + "'", int30 == 999);
    }

    @Test
    public void test21173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21173");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        int int4 = dateTime3.getMillisOfSecond();
        int int5 = dateTime3.getEra();
        java.lang.String str6 = dateTime3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 356 + "'", int4 == 356);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-04-13T15:16:11.356+00:00:00.052" + "'", str6, "2020-04-13T15:16:11.356+00:00:00.052");
    }

    @Test
    public void test21174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21174");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.weekOfWeekyear();
        int int5 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusDays(54612179);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDateTime1.getValue(54621);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54621");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test21175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21175");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.weekyear();
        boolean boolean19 = dateTime13.equals((java.lang.Object) localDateTime15);
        org.joda.time.DateTime dateTime21 = dateTime13.minusMonths(54616882);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfMonth();
        java.lang.String str26 = property25.toString();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundHalfEvenCopy();
        java.lang.String str38 = property36.getAsText();
        org.joda.time.LocalDateTime localDateTime39 = property36.roundCeilingCopy();
        int[] intArray41 = chronology30.get((org.joda.time.ReadablePartial) localDateTime39, 70L);
        java.util.Locale locale44 = new java.util.Locale("21", "52");
        boolean boolean45 = locale44.hasExtensions();
        java.lang.String str46 = locale44.toLanguageTag();
        java.lang.String str47 = locale44.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology30, locale44);
        boolean boolean49 = property25.equals((java.lang.Object) chronology30);
        org.joda.time.DurationField durationField50 = property25.getLeapDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime52 = property25.addToCopy(1645542375651L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1645542375651 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Property[dayOfMonth]" + "'", str26, "Property[dayOfMonth]");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "52" + "'", str38, "52");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1970, 1, 1, 70]");
        org.junit.Assert.assertEquals(locale44.toString(), "21_52");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "und" + "'", str46, "und");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "21" + "'", str47, "21");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(durationField50);
    }

    @Test
    public void test21176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21176");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(28);
        org.joda.time.DateTimeField dateTimeField7 = property3.getField();
        org.joda.time.LocalDateTime localDateTime9 = property3.addToCopy((-147566));
        int int10 = localDateTime9.getWeekyear();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
    }

    @Test
    public void test21177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21177");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusWeeks(15);
        int int6 = localDateTime5.getWeekyear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime5.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime14 = property11.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime18 = property17.withMaximumValue();
        int int19 = localDateTime18.size();
        org.joda.time.DateTime dateTime20 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime22 = localDateTime5.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        int int23 = localDateTime5.getDayOfMonth();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test21178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21178");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.weekyear();
        boolean boolean19 = dateTime13.equals((java.lang.Object) localDateTime15);
        int int20 = localDateTime15.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property21 = localDateTime15.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.withCenturyOfEra(54388);
        int int24 = localDateTime15.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime15.withWeekyear(194);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime15.withMillisOfDay(60590228);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int33 = localDateTime30.get(dateTimeFieldType32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.era();
        int int35 = localDateTime30.indexOf(dateTimeFieldType34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime30.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime37 = property36.getLocalDateTime();
        int int38 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withWeekyear(782);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = localDateTime40.toString("2022-02-21T15:12:59.732+00:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 70 + "'", int20 == 70);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localDateTime40);
    }

    @Test
    public void test21179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21179");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("54876633");
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test21180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21180");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime6 = dateTime4.withMinuteOfHour((int) (short) 10);
        int int7 = dateTime6.getMillisOfDay();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale10, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket13.saveField(dateTimeField14, (int) (short) 0);
        java.lang.Integer int17 = dateTimeParserBucket13.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket13.setZone(dateTimeZone18);
        int int21 = dateTimeZone18.getStandardOffset((long) 1969);
        org.joda.time.DateTime dateTime22 = dateTime6.toDateTime(dateTimeZone18);
        int int23 = dateTime6.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime6.plus(readablePeriod24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusDays(54);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime25.getZone();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 54507919, dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 54611439 + "'", int7 == 54611439);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test21181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21181");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(72000052L, dateTimeZone13);
        org.joda.time.DateTime.Property property16 = dateTime15.era();
        int int17 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.withEra(0);
        org.joda.time.DateTime dateTime21 = dateTime15.plusYears(520);
        org.joda.time.TimeOfDay timeOfDay22 = dateTime15.toTimeOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeOfDay22);
    }

    @Test
    public void test21182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21182");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = chronology2.getZone();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfDay();
        long long10 = dateTimeField7.add((long) 590, (-2329199948L));
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2329199358L) + "'", long10 == (-2329199358L));
    }

    @Test
    public void test21183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21183");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology5);
        java.lang.String str7 = chronology5.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.Chronology chronology11 = chronology5.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField12 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(35999999L, chronology5);
        org.joda.time.DurationField durationField15 = chronology5.minutes();
        org.joda.time.DurationField durationField16 = chronology5.hours();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 559, chronology5, locale17, (java.lang.Integer) 822, 54381);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.secondOfMinute();
        org.joda.time.DurationField durationField27 = chronology24.millis();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusSeconds((int) ' ');
        long long33 = chronology24.set((org.joda.time.ReadablePartial) localDateTime31, (long) 99);
        java.util.Locale locale34 = java.util.Locale.ITALIAN;
        java.lang.String str35 = locale34.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 212, chronology24, locale34, (java.lang.Integer) (-1), (-948));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(3L, chronology5, locale34, (java.lang.Integer) 693);
        org.joda.time.DurationField durationField41 = chronology5.weeks();
        long long42 = durationField41.getUnitMillis();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[UTC]" + "'", str7, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(localDateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-31948L) + "'", long33 == (-31948L));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 604800000L + "'", long42 == 604800000L);
    }

    @Test
    public void test21184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21184");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone6);
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = dateTimeZone6.getName((long) (byte) 1, locale10);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder12.setExtension('a', "cinese");
        java.util.Locale.Builder builder17 = builder12.setLanguageTag("coreano");
        java.util.Locale.Builder builder19 = builder12.removeUnicodeLocaleAttribute("999");
        java.util.Locale.Builder builder21 = builder19.setLanguage("ja");
        java.util.Locale.Builder builder23 = builder21.setVariant("54596");
        java.util.Locale.Builder builder24 = builder23.clearExtensions();
        java.util.Locale.Builder builder25 = builder24.clearExtensions();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(chronology38);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property45 = dateTime42.centuryOfEra();
        java.util.Locale locale46 = java.util.Locale.ITALIAN;
        java.lang.String str47 = locale46.getLanguage();
        java.lang.String str48 = property45.getAsText(locale46);
        java.lang.String str49 = dateTimeField35.getAsText((org.joda.time.ReadablePartial) localDateTime39, (-1), locale46);
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.lang.String str52 = locale51.getLanguage();
        java.lang.String str53 = dateTimeField35.getAsShortText((int) (byte) 10, locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) 9999, chronology29, locale51, (java.lang.Integer) 54616882);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology58 = localDateTime57.getChronology();
        org.joda.time.LocalDateTime localDateTime59 = org.joda.time.LocalDateTime.now(chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology58.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology63 = localDateTime62.getChronology();
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now(chronology63);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime67 = org.joda.time.DateTime.now(dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime67.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property70 = dateTime67.centuryOfEra();
        java.util.Locale locale71 = java.util.Locale.ITALIAN;
        java.lang.String str72 = locale71.getLanguage();
        java.lang.String str73 = property70.getAsText(locale71);
        java.lang.String str74 = dateTimeField60.getAsText((org.joda.time.ReadablePartial) localDateTime64, (-1), locale71);
        java.lang.String str75 = locale51.getDisplayScript(locale71);
        java.util.Set<java.lang.String> strSet76 = locale71.getUnicodeLocaleAttributes();
        java.lang.String str77 = locale71.getDisplayLanguage();
        java.util.Locale.Builder builder78 = builder24.setLocale(locale71);
        java.util.Set<java.lang.Character> charSet79 = locale71.getExtensionKeys();
        java.lang.String str80 = locale10.getDisplayScript(locale71);
        java.lang.String str81 = locale71.getDisplayLanguage();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "it" + "'", str47, "it");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "20" + "'", str48, "20");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-1" + "'", str49, "-1");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "it");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "it" + "'", str52, "it");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "10" + "'", str53, "10");
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "it");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "it" + "'", str72, "it");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "20" + "'", str73, "20");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "-1" + "'", str74, "-1");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "italiano" + "'", str77, "italiano");
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(charSet79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "italiano" + "'", str81, "italiano");
    }

    @Test
    public void test21185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21185");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property5 = dateTime2.centuryOfEra();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale6.getLanguage();
        java.lang.String str8 = property5.getAsText(locale6);
        java.lang.String str9 = locale0.getDisplayName(locale6);
        java.lang.String str10 = locale6.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20" + "'", str8, "20");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coreano" + "'", str9, "coreano");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test21186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21186");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(212);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekyear();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.centuryOfEra();
        java.lang.Object obj14 = null;
        boolean boolean15 = property13.equals(obj14);
        org.joda.time.LocalDateTime localDateTime16 = property13.getLocalDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test21187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21187");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime.Property property8 = dateTime5.dayOfWeek();
        int int9 = dateTime5.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = property14.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.era();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfYear();
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = property24.getAsText(locale25);
        int int28 = dateTimeField19.getMaximumTextLength(locale25);
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale25.getDisplayScript(locale29);
        java.util.Set<java.lang.String> strSet31 = locale25.getUnicodeLocaleKeys();
        java.lang.String str32 = locale25.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dateTime5.toString("2022-02-21T15:15:19.850+00:00:00.052", locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cina" + "'", str26, "Cina");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "52" + "'", str27, "52");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "CHN" + "'", str32, "CHN");
    }
}
