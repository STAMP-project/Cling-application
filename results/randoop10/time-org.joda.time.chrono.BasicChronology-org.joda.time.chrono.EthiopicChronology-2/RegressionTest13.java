import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        java.time.Period period1 = java.time.Period.ofYears(28);
        java.time.chrono.IsoChronology isoChronology2 = period1.getChronology();
        java.util.List<java.time.chrono.Era> eraList3 = isoChronology2.eras();
        java.lang.String str4 = isoChronology2.toString();
        java.util.List<java.time.chrono.Era> eraList5 = isoChronology2.eras();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(isoChronology2);
        org.junit.Assert.assertNotNull(eraList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISO" + "'", str4, "ISO");
        org.junit.Assert.assertNotNull(eraList5);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withDayOfYear((int) '4');
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "1970-01-01T00:00:00.003Z");
        boolean boolean3 = file2.exists();
        boolean boolean4 = file2.mkdirs();
        java.net.URI uRI5 = file2.toURI();
        java.lang.String str6 = file2.getName();
        boolean boolean7 = file2.delete();
        java.nio.file.Path path8 = file2.toPath();
        java.nio.file.FileSystem fileSystem9 = path8.getFileSystem();
        java.nio.file.spi.FileSystemProvider fileSystemProvider10 = fileSystem9.provider();
        java.io.File file11 = null;
        java.io.File file13 = new java.io.File(file11, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL14 = file13.toURL();
        boolean boolean15 = file13.canRead();
        java.nio.file.Path path16 = file13.toPath();
        java.nio.file.Path path17 = path16.toAbsolutePath();
        java.io.File file18 = null;
        java.io.File file20 = new java.io.File(file18, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL21 = file20.toURL();
        boolean boolean22 = file20.canRead();
        java.nio.file.Path path23 = file20.toPath();
        java.nio.file.Path path24 = path23.toAbsolutePath();
        java.io.File file25 = path24.toFile();
        boolean boolean26 = path16.endsWith(path24);
        java.io.File file27 = null;
        java.io.File file29 = new java.io.File(file27, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL30 = file29.toURL();
        boolean boolean31 = file29.canRead();
        java.nio.file.Path path32 = file29.toPath();
        java.nio.file.Path path34 = path32.resolve("German");
        boolean boolean35 = path24.endsWith(path32);
        boolean boolean36 = fileSystemProvider10.deleteIfExists(path32);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.003Z" + "'", str6, "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertNotNull(fileSystem9);
        org.junit.Assert.assertNotNull(fileSystemProvider10);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL14);
// flaky:         org.junit.Assert.assertEquals(uRL14.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(path17);
        org.junit.Assert.assertNull("file20.getParent() == null", file20.getParent());
        org.junit.Assert.assertEquals(file20.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL21);
// flaky:         org.junit.Assert.assertEquals(uRL21.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(path23);
        org.junit.Assert.assertNotNull(path24);
        org.junit.Assert.assertNotNull(file25);
// flaky:         org.junit.Assert.assertEquals(file25.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file25.toString(), "/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull("file29.getParent() == null", file29.getParent());
        org.junit.Assert.assertEquals(file29.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL30);
// flaky:         org.junit.Assert.assertEquals(uRL30.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(path32);
        org.junit.Assert.assertNotNull(path34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) 256);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = duration4.toPeriodTo(readableInstant5, periodType6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = new org.joda.time.Duration(readableInstant8, readableInstant9);
        long long11 = duration10.getMillis();
        boolean boolean12 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 3, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((java.lang.Object) dateTime15, chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime15.toMutableDateTime();
        mutableDateTime19.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.dayOfWeek();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime19.year();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.weekyear();
        boolean boolean25 = duration4.equals((java.lang.Object) mutableDateTime19);
        mutableDateTime19.addMonths((int) ' ');
        mutableDateTime19.add((long) (byte) 10);
        org.joda.time.Period period30 = org.joda.time.Period.ZERO;
        org.joda.time.Period period31 = period30.normalizedStandard();
        org.joda.time.Period period33 = period30.plusHours(2);
        java.time.chrono.IsoEra isoEra34 = java.time.chrono.IsoEra.CE;
        boolean boolean35 = period33.equals((java.lang.Object) isoEra34);
        int int36 = period33.getMinutes();
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period33);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone40);
        long long44 = dateTimeZone40.convertLocalToUTC((long) 3, false);
        long long47 = dateTimeZone40.convertLocalToUTC(0L, true);
        mutableDateTime19.setZoneRetainFields(dateTimeZone40);
        java.lang.String str49 = dateTimeZone40.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology50 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology50.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone52 = ethiopicChronology50.getZone();
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology50.era();
        org.joda.time.DateTimeField dateTimeField54 = ethiopicChronology50.secondOfDay();
        org.joda.time.DateTimeField dateTimeField55 = ethiopicChronology50.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField56 = ethiopicChronology50.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((java.lang.Object) dateMidnight1, (org.joda.time.Chronology) ethiopicChronology50);
        org.joda.time.DateTimeField dateTimeField58 = ethiopicChronology50.weekyearOfCentury();
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + isoEra34 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra34.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 3L + "'", long44 == 3L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Etc/UTC" + "'", str49, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField58);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        java.time.Period period3 = java.time.Period.of(335, 34561718, 88);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.lang.String str7 = gregorianCalendar5.getCalendarType();
        java.time.ZonedDateTime zonedDateTime8 = gregorianCalendar5.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.minusMonths((long) 10);
        int int11 = zonedDateTime8.getMonthValue();
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.LocalTime localTime22 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime23 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime22);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime26 = localTime22.with((java.time.temporal.TemporalField) chronoField24, (long) (short) 1);
        long long27 = localTime16.getLong((java.time.temporal.TemporalField) chronoField24);
        long long28 = zonedDateTime8.getLong((java.time.temporal.TemporalField) chronoField24);
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate32 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset31);
        java.time.LocalDate localDate33 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset31);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime34 = zonedDateTime8.withZoneSameLocal((java.time.ZoneId) zoneOffset31);
        java.time.format.DateTimeFormatter dateTimeFormatter35 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str36 = zonedDateTime8.format(dateTimeFormatter35);
        java.time.chrono.ChronoZonedDateTime<?> wildcardChronoZonedDateTime37 = java.time.chrono.ChronoZonedDateTime.from((java.time.temporal.TemporalAccessor) zonedDateTime8);
        java.util.GregorianCalendar gregorianCalendar43 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int44 = gregorianCalendar43.getWeeksInWeekYear();
        java.lang.String str45 = gregorianCalendar43.getCalendarType();
        java.time.ZonedDateTime zonedDateTime46 = gregorianCalendar43.toZonedDateTime();
        java.util.GregorianCalendar gregorianCalendar52 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int53 = gregorianCalendar52.getWeeksInWeekYear();
        java.lang.String str54 = gregorianCalendar52.getCalendarType();
        java.time.ZonedDateTime zonedDateTime55 = gregorianCalendar52.toZonedDateTime();
        int int56 = zonedDateTime46.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime55);
        java.time.ZonedDateTime zonedDateTime58 = zonedDateTime46.plusDays((long) 2022);
        java.time.Instant instant59 = zonedDateTime46.toInstant();
        java.time.chrono.Chronology chronology60 = zonedDateTime46.getChronology();
        java.util.GregorianCalendar gregorianCalendar66 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int67 = gregorianCalendar66.getWeeksInWeekYear();
        java.lang.String str68 = gregorianCalendar66.getCalendarType();
        java.time.ZonedDateTime zonedDateTime69 = gregorianCalendar66.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime71 = zonedDateTime69.minusMonths((long) 10);
        boolean boolean72 = zonedDateTime46.isBefore((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime71);
        boolean boolean73 = zonedDateTime8.isEqual((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime46);
        java.time.temporal.ChronoField chronoField74 = java.time.temporal.ChronoField.DAY_OF_MONTH;
        boolean boolean75 = chronoField74.isDateBased();
        java.time.temporal.ValueRange valueRange76 = zonedDateTime46.range((java.time.temporal.TemporalField) chronoField74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gregory" + "'", str7, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField24.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3601000000001L + "'", long27 == 3601000000001L);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 83399965000000L + "'", long28 == 83399965000000L);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0353-05-07Z" + "'", str36, "0353-05-07Z");
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "gregory" + "'", str45, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 52 + "'", int53 == 52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "gregory" + "'", str54, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime58);
        org.junit.Assert.assertNotNull(instant59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 52 + "'", int67 == 52);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "gregory" + "'", str68, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime69);
        org.junit.Assert.assertNotNull(zonedDateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + chronoField74 + "' != '" + java.time.temporal.ChronoField.DAY_OF_MONTH + "'", chronoField74.equals(java.time.temporal.ChronoField.DAY_OF_MONTH));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(valueRange76);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(0, 0, (int) (byte) 100);
        java.util.Calendar.Builder builder8 = builder0.setDate((int) (byte) 10, 57, 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 0, chronology11);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology13, locale14, (java.lang.Integer) 1);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.clockhourOfDay();
        org.joda.time.Period period24 = new org.joda.time.Period((int) '#', 0, 2, (int) (short) 100);
        org.joda.time.Period period26 = period24.withSeconds(12);
        int int27 = period26.getMillis();
        int[] intArray29 = chronology13.get((org.joda.time.ReadablePeriod) period26, (long) (byte) 10);
        java.util.Calendar.Builder builder30 = builder0.setFields(intArray29);
        java.util.stream.IntStream intStream31 = java.util.stream.IntStream.of(intArray29);
        java.util.stream.IntStream intStream32 = intStream31.sequential();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertNotNull(intStream32);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        java.nio.charset.CharacterCodingException characterCodingException0 = new java.nio.charset.CharacterCodingException();
        java.util.concurrent.ExecutionException executionException1 = new java.util.concurrent.ExecutionException((java.lang.Throwable) characterCodingException0);
        java.security.PrivilegedActionException privilegedActionException2 = new java.security.PrivilegedActionException((java.lang.Exception) characterCodingException0);
        java.security.SignatureException signatureException3 = new java.security.SignatureException((java.lang.Throwable) privilegedActionException2);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        java.util.function.Predicate<org.joda.time.DateTimeFieldType> dateTimeFieldTypePredicate1 = java.util.function.Predicate.isEqual((java.lang.Object) 1.0d);
        java.util.function.Predicate<org.joda.time.DateTimeFieldType> dateTimeFieldTypePredicate2 = dateTimeFieldTypePredicate1.negate();
        java.util.function.Predicate<org.joda.time.DateTimeFieldType> dateTimeFieldTypePredicate3 = dateTimeFieldTypePredicate1.negate();
        java.util.function.Predicate<org.joda.time.DateTimeFieldType> dateTimeFieldTypePredicate4 = dateTimeFieldTypePredicate3.negate();
        org.junit.Assert.assertNotNull(dateTimeFieldTypePredicate1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypePredicate2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypePredicate3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypePredicate4);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        int int1 = offsetDateTime0.getDayOfMonth();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withMinute((int) (byte) 10);
        long long4 = offsetDateTime3.toEpochSecond();
        java.time.chrono.IsoEra isoEra5 = java.time.chrono.IsoEra.CE;
        int int6 = isoEra5.getValue();
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime3.with((java.time.temporal.TemporalAdjuster) isoEra5);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        java.time.Duration duration18 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime19 = localTime12.minus((java.time.temporal.TemporalAmount) duration18);
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime7.with((java.time.temporal.TemporalAdjuster) localTime12);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(offsetDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645434601L + "'", long4 == 1645434601L);
        org.junit.Assert.assertTrue("'" + isoEra5 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra5.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean6 = localTime2.isSupported(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        mutableDateTime17.addMonths((int) ' ');
        mutableDateTime17.add((long) (byte) 10);
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Period period31 = period28.plusHours(2);
        java.time.chrono.IsoEra isoEra32 = java.time.chrono.IsoEra.CE;
        boolean boolean33 = period31.equals((java.lang.Object) isoEra32);
        int int34 = period31.getMinutes();
        mutableDateTime17.add((org.joda.time.ReadablePeriod) period31);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone38);
        long long42 = dateTimeZone38.convertLocalToUTC((long) 3, false);
        long long45 = dateTimeZone38.convertLocalToUTC(0L, true);
        mutableDateTime17.setZoneRetainFields(dateTimeZone38);
        java.lang.String str47 = dateTimeZone38.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology48 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology48.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone50 = ethiopicChronology48.getZone();
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology48.era();
        org.joda.time.DurationField durationField52 = ethiopicChronology48.hours();
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology48.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField54 = ethiopicChronology48.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone55 = ethiopicChronology48.getZone();
        org.joda.time.LocalTime localTime56 = org.joda.time.LocalTime.now(dateTimeZone55);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + isoEra32 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra32.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3L + "'", long42 == 3L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Etc/UTC" + "'", str47, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(localTime56);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.LONG;
        java.time.format.FormatStyle formatStyle1 = java.time.format.FormatStyle.LONG;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle0, formatStyle1);
        java.time.format.FormatStyle formatStyle3 = java.time.format.FormatStyle.LONG;
        java.time.format.FormatStyle formatStyle4 = java.time.format.FormatStyle.LONG;
        java.time.format.DateTimeFormatter dateTimeFormatter5 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle3, formatStyle4);
        java.time.format.DateTimeFormatter dateTimeFormatter6 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle3);
        java.time.format.DateTimeFormatter dateTimeFormatter7 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle0, formatStyle3);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime9 = localDateTime8.toLocalTime();
        java.time.LocalDateTime localDateTime11 = localDateTime8.withDayOfMonth(10);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime13 = offsetTime12.toLocalTime();
        java.time.OffsetTime offsetTime14 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime15 = offsetTime14.toLocalTime();
        java.lang.String str16 = offsetTime14.toString();
        java.time.Duration duration17 = java.time.Duration.ZERO;
        java.lang.String str18 = duration17.toString();
        java.time.OffsetTime offsetTime19 = offsetTime14.plus((java.time.temporal.TemporalAmount) duration17);
        java.time.OffsetTime offsetTime21 = offsetTime14.plusNanos((long) 0);
        java.time.LocalTime localTime26 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime26);
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime30 = localTime26.with((java.time.temporal.TemporalField) chronoField28, (long) (short) 1);
        java.util.Locale locale31 = java.util.Locale.GERMANY;
        java.lang.String str32 = chronoField28.getDisplayName(locale31);
        java.time.OffsetTime offsetTime34 = offsetTime21.with((java.time.temporal.TemporalField) chronoField28, (long) 28);
        long long35 = localTime13.getLong((java.time.temporal.TemporalField) chronoField28);
        java.time.temporal.TemporalUnit temporalUnit36 = chronoField28.getRangeUnit();
        java.time.temporal.ValueRange valueRange37 = localDateTime8.range((java.time.temporal.TemporalField) chronoField28);
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.temporal.ChronoField chronoField41 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange42 = chronoField41.range();
        boolean boolean43 = zoneOffset40.isSupported((java.time.temporal.TemporalField) chronoField41);
        int int45 = chronoField41.checkValidIntValue((long) (byte) 10);
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.util.GregorianCalendar gregorianCalendar52 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int53 = gregorianCalendar52.getWeeksInWeekYear();
        java.lang.String str54 = gregorianCalendar52.getCalendarType();
        java.time.ZonedDateTime zonedDateTime55 = gregorianCalendar52.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime57 = zonedDateTime55.minusMonths((long) 10);
        java.time.ZonedDateTime zonedDateTime59 = zonedDateTime57.minusHours((long) 9);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime60 = zonedDateTime57.withLaterOffsetAtOverlap();
        java.time.ZoneId zoneId61 = zonedDateTime57.getZone();
        long long62 = zonedDateTime57.toEpochSecond();
        java.time.temporal.ChronoField chronoField63 = java.time.temporal.ChronoField.DAY_OF_MONTH;
        int int64 = zonedDateTime57.get((java.time.temporal.TemporalField) chronoField63);
        java.time.temporal.TemporalField[] temporalFieldArray65 = new java.time.temporal.TemporalField[] { chronoField28, chronoField41, chronoField46, chronoField63 };
        java.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter7.withResolverFields(temporalFieldArray65);
        java.text.ParsePosition parsePosition69 = new java.text.ParsePosition((-624));
        parsePosition69.setIndex(12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor72 = dateTimeFormatter7.parse((java.lang.CharSequence) "2022-02-21T09:41:13.394Z", parsePosition69);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '2022-02-21T09:41:13.394Z' could not be parsed at index 12");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle0.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertTrue("'" + formatStyle1 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle1.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + formatStyle3 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle3.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertTrue("'" + formatStyle4 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle4.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "23:59:59.999999999-18:00" + "'", str16, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0S" + "'", str18, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField28.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "NanoOfDay" + "'", str32, "NanoOfDay");
        org.junit.Assert.assertNotNull(offsetTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 86399999999999L + "'", long35 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit36 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit36.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(valueRange37);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertTrue("'" + chronoField41 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField41.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField46.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 52 + "'", int53 == 52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "gregory" + "'", str54, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime55);
        org.junit.Assert.assertNotNull(zonedDateTime57);
        org.junit.Assert.assertNotNull(zonedDateTime59);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime60);
        org.junit.Assert.assertNotNull(zoneId61);
// flaky:         org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-51042876601L) + "'", long62 == (-51042876601L));
        org.junit.Assert.assertTrue("'" + chronoField63 + "' != '" + java.time.temporal.ChronoField.DAY_OF_MONTH + "'", chronoField63.equals(java.time.temporal.ChronoField.DAY_OF_MONTH));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 7 + "'", int64 == 7);
        org.junit.Assert.assertNotNull(temporalFieldArray65);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = new org.joda.time.Duration(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = duration3.toPeriodTo(readableInstant4, periodType5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = new org.joda.time.Duration(readableInstant7, readableInstant8);
        long long10 = duration9.getMillis();
        boolean boolean11 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 3, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((java.lang.Object) dateTime14, chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime14.toMutableDateTime();
        mutableDateTime18.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.dayOfWeek();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime18.year();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.weekyear();
        boolean boolean24 = duration3.equals((java.lang.Object) mutableDateTime18);
        mutableDateTime18.addMonths((int) ' ');
        mutableDateTime18.add((long) (byte) 10);
        org.joda.time.Period period29 = org.joda.time.Period.ZERO;
        org.joda.time.Period period30 = period29.normalizedStandard();
        org.joda.time.Period period32 = period29.plusHours(2);
        java.time.chrono.IsoEra isoEra33 = java.time.chrono.IsoEra.CE;
        boolean boolean34 = period32.equals((java.lang.Object) isoEra33);
        int int35 = period32.getMinutes();
        mutableDateTime18.add((org.joda.time.ReadablePeriod) period32);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone39);
        long long43 = dateTimeZone39.convertLocalToUTC((long) 3, false);
        long long46 = dateTimeZone39.convertLocalToUTC(0L, true);
        mutableDateTime18.setZoneRetainFields(dateTimeZone39);
        java.lang.String str48 = dateTimeZone39.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology49 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology49.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone51 = ethiopicChronology49.getZone();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology49.era();
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology49.secondOfDay();
        org.joda.time.DateTimeField dateTimeField54 = ethiopicChronology49.minuteOfHour();
        org.joda.time.DurationField durationField55 = ethiopicChronology49.months();
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(1645401600000L, (org.joda.time.Chronology) ethiopicChronology49);
        org.joda.time.DateTimeField dateTimeField57 = ethiopicChronology49.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField58 = ethiopicChronology49.monthOfYear();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + isoEra33 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra33.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3L + "'", long43 == 3L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Etc/UTC" + "'", str48, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.LocalTime localTime19 = localTime6.withSecond((int) (short) 1);
        java.lang.Object obj21 = properties1.put((java.lang.Object) localTime19, (java.lang.Object) "117");
        boolean boolean23 = properties1.containsValue((java.lang.Object) 6);
        java.time.LocalDate localDate26 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int27 = localDate26.getMonthValue();
        java.lang.Object obj28 = properties1.replace((java.lang.Object) 21, (java.lang.Object) localDate26);
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.MIN;
        java.time.Month month30 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime31 = localDateTime29.with((java.time.temporal.TemporalAdjuster) month30);
        java.time.LocalDate localDate34 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int35 = localDate34.getMonthValue();
        org.joda.time.Period period36 = org.joda.time.Period.ZERO;
        org.joda.time.Period period37 = period36.normalizedStandard();
        org.joda.time.Period period39 = period36.plusHours(2);
        java.time.chrono.IsoEra isoEra40 = java.time.chrono.IsoEra.CE;
        boolean boolean41 = period39.equals((java.lang.Object) isoEra40);
        java.time.LocalTime localTime46 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime47 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime46);
        java.time.LocalTime localTime52 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime53 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime52);
        java.time.temporal.ChronoField chronoField54 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime56 = localTime52.with((java.time.temporal.TemporalField) chronoField54, (long) (short) 1);
        long long57 = localTime46.getLong((java.time.temporal.TemporalField) chronoField54);
        boolean boolean58 = isoEra40.isSupported((java.time.temporal.TemporalField) chronoField54);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery59 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period60 = isoEra40.query(periodTemporalQuery59);
        boolean boolean61 = period60.isNegative();
        java.time.Period period63 = period60.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField64 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean65 = period60.equals((java.lang.Object) chronoField64);
        boolean boolean66 = localDate34.isSupported((java.time.temporal.TemporalField) chronoField64);
        java.time.temporal.TemporalUnit temporalUnit67 = chronoField64.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime68 = localDateChronoLocalDateTime31.plus(1L, temporalUnit67);
        boolean boolean69 = localDate26.isSupported(temporalUnit67);
        java.time.Duration duration70 = java.time.Duration.ZERO;
        java.time.Duration duration72 = duration70.minusHours((long) 8);
        java.time.Duration duration74 = duration70.minusDays((long) 17);
        java.time.LocalDate localDate75 = localDate26.plus((java.time.temporal.TemporalAmount) duration70);
        java.time.chrono.IsoChronology isoChronology76 = localDate26.getChronology();
        java.time.LocalDateTime localDateTime77 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField78 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime80 = localDateTime77.with((java.time.temporal.TemporalField) chronoField78, (long) 10);
        java.time.LocalDateTime localDateTime82 = localDateTime77.minusMinutes((long) 12);
        java.time.OffsetDateTime offsetDateTime83 = java.time.OffsetDateTime.now();
        java.time.ZoneOffset zoneOffset85 = java.time.ZoneOffset.ofHours(9);
        java.time.OffsetDateTime offsetDateTime86 = offsetDateTime83.withOffsetSameLocal(zoneOffset85);
        java.time.ZoneOffset zoneOffset88 = java.time.ZoneOffset.ofHours(9);
        java.time.ZonedDateTime zonedDateTime89 = java.time.ZonedDateTime.ofInstant(localDateTime77, zoneOffset85, (java.time.ZoneId) zoneOffset88);
        java.time.ZonedDateTime zonedDateTime90 = localDate26.atStartOfDay((java.time.ZoneId) zoneOffset88);
        long long91 = localDate26.toEpochDay();
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + month30 + "' != '" + java.time.Month.NOVEMBER + "'", month30.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime31);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + isoEra40 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra40.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + chronoField54 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField54.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 3601000000001L + "'", long57 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + chronoField64 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField64.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit67 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit67.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertNotNull(isoChronology76);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + chronoField78 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField78.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime80);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertNotNull(offsetDateTime83);
        org.junit.Assert.assertNotNull(zoneOffset85);
        org.junit.Assert.assertNotNull(offsetDateTime86);
        org.junit.Assert.assertNotNull(zoneOffset88);
        org.junit.Assert.assertNotNull(zonedDateTime89);
        org.junit.Assert.assertNotNull(zonedDateTime90);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 32L + "'", long91 == 32L);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        java.time.Instant instant0 = java.time.Instant.now();
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        java.time.Instant instant2 = java.time.Instant.now();
        java.time.Instant instant3 = java.time.Instant.now();
        boolean boolean4 = instant2.isAfter(instant3);
        java.time.Duration duration5 = java.time.Duration.ZERO;
        java.time.Instant instant6 = instant3.minus((java.time.temporal.TemporalAmount) duration5);
        int int7 = instant0.compareTo(instant6);
        java.time.Duration duration9 = java.time.Duration.ofSeconds(0L);
        java.time.Instant instant10 = instant0.minus((java.time.temporal.TemporalAmount) duration9);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(instant6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime1 = offsetTime0.toLocalTime();
        java.lang.String str2 = offsetTime0.toString();
        java.time.Duration duration3 = java.time.Duration.ZERO;
        java.lang.String str4 = duration3.toString();
        java.time.OffsetTime offsetTime5 = offsetTime0.plus((java.time.temporal.TemporalAmount) duration3);
        java.time.OffsetTime offsetTime7 = offsetTime0.plusNanos((long) 0);
        int int8 = offsetTime0.getHour();
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime10 = offsetTime9.toLocalTime();
        java.lang.String str11 = offsetTime9.toString();
        java.time.Duration duration12 = java.time.Duration.ZERO;
        java.lang.String str13 = duration12.toString();
        java.time.OffsetTime offsetTime14 = offsetTime9.plus((java.time.temporal.TemporalAmount) duration12);
        java.time.OffsetTime offsetTime16 = offsetTime9.plusNanos((long) 0);
        boolean boolean17 = offsetTime0.isBefore(offsetTime9);
        java.time.Clock clock18 = java.time.Clock.systemUTC();
        java.time.Duration duration20 = java.time.Duration.ofSeconds((long) 256);
        java.time.Clock clock21 = java.time.Clock.tick(clock18, duration20);
        java.time.LocalDate localDate24 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime26 = offsetTime25.toLocalTime();
        java.lang.String str27 = offsetTime25.toString();
        java.time.Duration duration28 = java.time.Duration.ZERO;
        java.lang.String str29 = duration28.toString();
        java.time.OffsetTime offsetTime30 = offsetTime25.plus((java.time.temporal.TemporalAmount) duration28);
        java.time.LocalTime localTime31 = offsetTime25.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime32 = localDate24.atTime(localTime31);
        java.time.LocalDate localDate34 = localDate24.minusYears((long) 34);
        java.time.LocalTime localTime36 = java.time.LocalTime.NOON;
        java.time.LocalTime localTime38 = localTime36.withNano(32769);
        java.time.Instant instant39 = java.time.Instant.now();
        java.time.Instant instant40 = java.time.Instant.now();
        boolean boolean41 = instant39.isAfter(instant40);
        java.time.LocalDate localDate43 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int44 = localDate43.getMonthValue();
        org.joda.time.Period period45 = org.joda.time.Period.ZERO;
        org.joda.time.Period period46 = period45.normalizedStandard();
        org.joda.time.Period period48 = period45.plusHours(2);
        java.time.chrono.IsoEra isoEra49 = java.time.chrono.IsoEra.CE;
        boolean boolean50 = period48.equals((java.lang.Object) isoEra49);
        java.time.LocalTime localTime55 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime56 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime55);
        java.time.LocalTime localTime61 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime62 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime61);
        java.time.temporal.ChronoField chronoField63 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime65 = localTime61.with((java.time.temporal.TemporalField) chronoField63, (long) (short) 1);
        long long66 = localTime55.getLong((java.time.temporal.TemporalField) chronoField63);
        boolean boolean67 = isoEra49.isSupported((java.time.temporal.TemporalField) chronoField63);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery68 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period69 = isoEra49.query(periodTemporalQuery68);
        boolean boolean70 = period69.isNegative();
        java.time.Period period72 = period69.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField73 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean74 = period69.equals((java.lang.Object) chronoField73);
        boolean boolean75 = localDate43.isSupported((java.time.temporal.TemporalField) chronoField73);
        java.time.temporal.TemporalUnit temporalUnit76 = chronoField73.getRangeUnit();
        java.time.Instant instant77 = instant40.truncatedTo(temporalUnit76);
        boolean boolean78 = temporalUnit76.isTimeBased();
        java.time.LocalTime localTime79 = localTime38.truncatedTo(temporalUnit76);
        java.time.LocalDate localDate80 = localDate24.plus((long) (-39), temporalUnit76);
        java.time.Duration duration81 = duration20.plus((long) 19, temporalUnit76);
        java.time.OffsetTime offsetTime82 = offsetTime0.plus((java.time.temporal.TemporalAmount) duration81);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23:59:59.999999999-18:00" + "'", str2, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23 + "'", int8 == 23);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "23:59:59.999999999-18:00" + "'", str11, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0S" + "'", str13, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(clock18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "23:59:59.999999999-18:00" + "'", str27, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0S" + "'", str29, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + isoEra49 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra49.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertTrue("'" + chronoField63 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField63.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 3601000000001L + "'", long66 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery68);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertTrue("'" + chronoField73 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField73.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit76 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit76.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(instant77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertNotNull(offsetTime82);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 3, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) dateTime6, chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight9.withDayOfYear((int) ' ');
        int int14 = dateMidnight9.getWeekOfWeekyear();
        long long15 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.DateTime dateTime16 = property3.roundFloorCopy();
        org.joda.time.DateTime dateTime18 = property3.addWrapFieldToCopy((-201));
        org.joda.time.Instant instant19 = new org.joda.time.Instant((java.lang.Object) dateTime18);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL3 = file2.toURL();
        java.io.File file4 = null;
        java.io.File file6 = new java.io.File(file4, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL7 = file6.toURL();
        boolean boolean8 = uRL3.sameFile(uRL7);
        java.lang.String str9 = uRL3.getPath();
        java.net.URLConnection uRLConnection10 = uRL3.openConnection();
        java.lang.String str11 = uRLConnection10.getContentType();
        long long14 = uRLConnection10.getHeaderFieldLong("zh-TW", 57L);
        long long17 = uRLConnection10.getHeaderFieldLong("x-windows-iso2022jp", (long) 97);
        java.lang.String str19 = uRLConnection10.getHeaderField(508);
        long long20 = uRLConnection10.getDate();
        uRLConnection10.setReadTimeout(275);
        java.lang.String str24 = uRLConnection10.getRequestProperty("Feb 21, 2022 9:39:53 AM");
        java.lang.String str26 = uRLConnection10.getHeaderFieldKey(10797978);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL3);
// flaky:         org.junit.Assert.assertEquals(uRL3.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL7);
// flaky:         org.junit.Assert.assertEquals(uRL7.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/experiment/1970-01-01T00:00:00.003Z" + "'", str9, "/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRLConnection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "content/unknown" + "'", str11, "content/unknown");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 57L + "'", long14 == 57L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate1 = offsetDateTime0.toLocalDate();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean4 = offsetDateTime2.isSupported((java.time.temporal.TemporalField) chronoField3);
        boolean boolean5 = offsetDateTime0.isEqual(offsetDateTime2);
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime2.minusHours(3601000000001L);
        java.util.GregorianCalendar gregorianCalendar13 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int14 = gregorianCalendar13.getWeeksInWeekYear();
        java.lang.String str15 = gregorianCalendar13.getCalendarType();
        java.time.ZonedDateTime zonedDateTime16 = gregorianCalendar13.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime16.minusMonths((long) 10);
        java.time.ZonedDateTime zonedDateTime20 = zonedDateTime18.minusHours((long) 9);
        java.time.ZoneOffset zoneOffset21 = zonedDateTime18.getOffset();
        java.time.ZonedDateTime zonedDateTime22 = offsetDateTime2.atZoneSimilarLocal((java.time.ZoneId) zoneOffset21);
        java.time.zone.ZoneRules zoneRules23 = java.time.zone.ZoneRules.of(zoneOffset21);
        java.time.Instant instant24 = java.time.Instant.now();
        java.time.Instant instant25 = java.time.Instant.now();
        boolean boolean26 = instant24.isAfter(instant25);
        java.time.ZoneOffset zoneOffset27 = zoneRules23.getStandardOffset(instant25);
        java.util.Optional<java.lang.Exception> exceptionOptional28 = java.util.Optional.empty();
        java.lang.String str29 = exceptionOptional28.toString();
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime33 = localDateTime30.with((java.time.temporal.TemporalField) chronoField31, (long) 10);
        java.time.LocalDateTime localDateTime35 = localDateTime30.withDayOfYear((int) '/');
        boolean boolean36 = exceptionOptional28.equals((java.lang.Object) localDateTime35);
        java.time.LocalTime localTime41 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime42 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime41);
        java.time.LocalTime localTime47 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime48 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime47);
        java.time.temporal.ChronoField chronoField49 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime51 = localTime47.with((java.time.temporal.TemporalField) chronoField49, (long) (short) 1);
        long long52 = localTime41.getLong((java.time.temporal.TemporalField) chronoField49);
        java.time.LocalTime localTime54 = localTime41.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField55 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange56 = localTime54.range((java.time.temporal.TemporalField) chronoField55);
        java.time.Duration duration58 = java.time.Duration.ofSeconds((long) 0);
        java.time.LocalTime localTime59 = localTime54.plus((java.time.temporal.TemporalAmount) duration58);
        java.time.LocalDateTime localDateTime60 = localDateTime35.plus((java.time.temporal.TemporalAmount) duration58);
        java.time.format.FormatStyle formatStyle61 = java.time.format.FormatStyle.LONG;
        java.time.format.DateTimeFormatter dateTimeFormatter62 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle61);
        boolean boolean63 = localDateTime35.equals((java.lang.Object) dateTimeFormatter62);
        java.util.List<java.time.ZoneOffset> zoneOffsetList64 = zoneRules23.getValidOffsets(localDateTime35);
        java.time.LocalDateTime localDateTime65 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery66 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period67 = localDateTime65.query(periodTemporalQuery66);
        java.time.LocalDateTime localDateTime69 = localDateTime65.withNano(35);
        java.time.ZoneOffset zoneOffset70 = zoneRules23.getOffset(localDateTime65);
        java.time.Instant instant72 = java.time.Instant.ofEpochMilli((long) (-4));
        java.time.ZoneOffset zoneOffset73 = zoneRules23.getOffset(instant72);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "gregory" + "'", str15, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(zoneRules23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(exceptionOptional28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Optional.empty" + "'", str29, "Optional.empty");
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField31.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + chronoField49 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField49.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3601000000001L + "'", long52 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + chronoField55 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField55.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + formatStyle61 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle61.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(zoneOffsetList64);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(periodTemporalQuery66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(zoneOffset70);
        org.junit.Assert.assertNotNull(instant72);
        org.junit.Assert.assertNotNull(zoneOffset73);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        org.joda.time.Period period1 = org.joda.time.Period.months(13);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        java.util.LongSummaryStatistics longSummaryStatistics0 = new java.util.LongSummaryStatistics();
        longSummaryStatistics0.accept(3);
        long long3 = longSummaryStatistics0.getMax();
        java.util.LongSummaryStatistics longSummaryStatistics4 = new java.util.LongSummaryStatistics();
        longSummaryStatistics4.accept(3);
        java.util.function.LongConsumer longConsumer7 = longSummaryStatistics0.andThen((java.util.function.LongConsumer) longSummaryStatistics4);
        java.util.LongSummaryStatistics longSummaryStatistics8 = new java.util.LongSummaryStatistics();
        longSummaryStatistics8.accept(3);
        long long11 = longSummaryStatistics8.getMax();
        double double12 = longSummaryStatistics8.getAverage();
        longSummaryStatistics8.accept(6);
        java.util.function.LongConsumer longConsumer15 = longSummaryStatistics0.andThen((java.util.function.LongConsumer) longSummaryStatistics8);
        java.util.stream.IntStream intStream18 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.IntSummaryStatistics intSummaryStatistics19 = new java.util.IntSummaryStatistics();
        intStream18.forEach((java.util.function.IntConsumer) intSummaryStatistics19);
        java.util.IntSummaryStatistics intSummaryStatistics21 = new java.util.IntSummaryStatistics();
        intSummaryStatistics21.accept(57);
        intSummaryStatistics19.combine(intSummaryStatistics21);
        java.util.function.IntConsumer intConsumer25 = longSummaryStatistics8.andThen((java.util.function.IntConsumer) intSummaryStatistics19);
        long long26 = intSummaryStatistics19.getCount();
        long long27 = intSummaryStatistics19.getCount();
        double double28 = intSummaryStatistics19.getAverage();
        java.util.stream.IntStream intStream31 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.IntSummaryStatistics intSummaryStatistics32 = new java.util.IntSummaryStatistics();
        intStream31.forEach((java.util.function.IntConsumer) intSummaryStatistics32);
        java.util.LongSummaryStatistics longSummaryStatistics34 = new java.util.LongSummaryStatistics();
        longSummaryStatistics34.accept(3);
        long long37 = longSummaryStatistics34.getMax();
        java.util.LongSummaryStatistics longSummaryStatistics38 = new java.util.LongSummaryStatistics();
        longSummaryStatistics38.accept(3);
        java.util.function.LongConsumer longConsumer41 = longSummaryStatistics34.andThen((java.util.function.LongConsumer) longSummaryStatistics38);
        java.util.LongSummaryStatistics longSummaryStatistics42 = new java.util.LongSummaryStatistics();
        longSummaryStatistics42.accept(3);
        long long45 = longSummaryStatistics42.getMax();
        double double46 = longSummaryStatistics42.getAverage();
        longSummaryStatistics42.accept(6);
        java.util.function.LongConsumer longConsumer49 = longSummaryStatistics34.andThen((java.util.function.LongConsumer) longSummaryStatistics42);
        java.util.stream.IntStream intStream52 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.IntSummaryStatistics intSummaryStatistics53 = new java.util.IntSummaryStatistics();
        intStream52.forEach((java.util.function.IntConsumer) intSummaryStatistics53);
        java.util.IntSummaryStatistics intSummaryStatistics55 = new java.util.IntSummaryStatistics();
        intSummaryStatistics55.accept(57);
        intSummaryStatistics53.combine(intSummaryStatistics55);
        java.util.function.IntConsumer intConsumer59 = longSummaryStatistics42.andThen((java.util.function.IntConsumer) intSummaryStatistics53);
        long long60 = intSummaryStatistics53.getCount();
        intSummaryStatistics32.combine(intSummaryStatistics53);
        java.util.function.IntConsumer intConsumer62 = intSummaryStatistics19.andThen((java.util.function.IntConsumer) intSummaryStatistics53);
        org.junit.Assert.assertEquals(longSummaryStatistics0.toString(), "LongSummaryStatistics{count=1, sum=3, min=3, average=3.000000, max=3}");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertEquals(longSummaryStatistics4.toString(), "LongSummaryStatistics{count=1, sum=3, min=3, average=3.000000, max=3}");
        org.junit.Assert.assertNotNull(longConsumer7);
        org.junit.Assert.assertEquals(longSummaryStatistics8.toString(), "LongSummaryStatistics{count=2, sum=9, min=3, average=4.500000, max=6}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
        org.junit.Assert.assertNotNull(longConsumer15);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertEquals(intSummaryStatistics19.toString(), "IntSummaryStatistics{count=1, sum=57, min=57, average=57.000000, max=57}");
        org.junit.Assert.assertEquals(intSummaryStatistics21.toString(), "IntSummaryStatistics{count=1, sum=57, min=57, average=57.000000, max=57}");
        org.junit.Assert.assertNotNull(intConsumer25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 57.0d + "'", double28 == 57.0d);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertEquals(intSummaryStatistics32.toString(), "IntSummaryStatistics{count=1, sum=57, min=57, average=57.000000, max=57}");
        org.junit.Assert.assertEquals(longSummaryStatistics34.toString(), "LongSummaryStatistics{count=1, sum=3, min=3, average=3.000000, max=3}");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 3L + "'", long37 == 3L);
        org.junit.Assert.assertEquals(longSummaryStatistics38.toString(), "LongSummaryStatistics{count=1, sum=3, min=3, average=3.000000, max=3}");
        org.junit.Assert.assertNotNull(longConsumer41);
        org.junit.Assert.assertEquals(longSummaryStatistics42.toString(), "LongSummaryStatistics{count=2, sum=9, min=3, average=4.500000, max=6}");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 3L + "'", long45 == 3L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 3.0d + "'", double46 == 3.0d);
        org.junit.Assert.assertNotNull(longConsumer49);
        org.junit.Assert.assertNotNull(intStream52);
        org.junit.Assert.assertEquals(intSummaryStatistics53.toString(), "IntSummaryStatistics{count=1, sum=57, min=57, average=57.000000, max=57}");
        org.junit.Assert.assertEquals(intSummaryStatistics55.toString(), "IntSummaryStatistics{count=1, sum=57, min=57, average=57.000000, max=57}");
        org.junit.Assert.assertNotNull(intConsumer59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(intConsumer62);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.Month month2 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime1.with((java.time.temporal.TemporalAdjuster) month2);
        java.time.Month month5 = month2.plus(2592000000L);
        java.time.Month month7 = month5.plus(6552109211L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.of(32772, month5, 1108, 306, (int) '\uffff', 926000000, 59);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 1108");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.NOVEMBER + "'", month2.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.NOVEMBER + "'", month5.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertTrue("'" + month7 + "' != '" + java.time.Month.OCTOBER + "'", month7.equals(java.time.Month.OCTOBER));
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        long long6 = duration2.getStandardSeconds();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 3, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((java.lang.Object) dateTime9, chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight12.withDayOfYear((int) ' ');
        org.joda.time.Interval interval17 = duration2.toIntervalTo((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.Hours hours18 = duration2.toStandardHours();
        org.joda.time.Period period19 = duration2.toPeriod();
        org.joda.time.Period period21 = period19.plusDays(57);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        java.time.Period period1 = java.time.Period.ofWeeks(366);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getMillisOfSecond();
        mutableDateTime0.addMillis(2022);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.yearOfEra();
        mutableDateTime0.setMillis(34451155400000L);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 403 + "'", int1 == 403);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        java.io.PrintStream printStream1 = new java.io.PrintStream("subject:\n (GERMAN)");
        printStream1.write((int) '#');
        java.security.CodeSource codeSource5 = null;
        java.security.PermissionCollection permissionCollection6 = null;
        java.security.ProtectionDomain protectionDomain7 = new java.security.ProtectionDomain(codeSource5, permissionCollection6);
        java.lang.ClassLoader classLoader8 = protectionDomain7.getClassLoader();
        java.security.CodeSource codeSource9 = null;
        java.security.PermissionCollection permissionCollection10 = null;
        java.security.ProtectionDomain protectionDomain11 = new java.security.ProtectionDomain(codeSource9, permissionCollection10);
        java.security.Permission permission12 = null;
        boolean boolean13 = protectionDomain11.implies(permission12);
        java.security.CodeSource codeSource14 = null;
        java.security.PermissionCollection permissionCollection15 = null;
        java.security.ProtectionDomain protectionDomain16 = new java.security.ProtectionDomain(codeSource14, permissionCollection15);
        java.security.CodeSource codeSource17 = null;
        java.security.PermissionCollection permissionCollection18 = null;
        java.security.ProtectionDomain protectionDomain19 = new java.security.ProtectionDomain(codeSource17, permissionCollection18);
        java.security.ProtectionDomain[] protectionDomainArray20 = new java.security.ProtectionDomain[] { protectionDomain7, protectionDomain11, protectionDomain16, protectionDomain19 };
        java.security.AccessControlContext accessControlContext21 = new java.security.AccessControlContext(protectionDomainArray20);
        java.io.PrintStream printStream22 = printStream1.printf("Property[secondOfMinute]", (java.lang.Object[]) protectionDomainArray20);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 3, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfYear();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.DateTimeField dateTimeField29 = property27.getField();
        java.util.Locale locale34 = new java.util.Locale("ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]", "UNDERFLOW", "Years");
        java.lang.String str35 = dateTimeField29.getAsShortText((int) 'u', locale34);
        java.util.GregorianCalendar gregorianCalendar41 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int42 = gregorianCalendar41.getWeeksInWeekYear();
        org.joda.time.YearMonthDay yearMonthDay43 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar41);
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay43.withYear(0);
        java.util.stream.IntStream intStream48 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        int[] intArray49 = intStream48.toArray();
        int int50 = dateTimeField29.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay45, intArray49);
        org.joda.time.DateTimeField[] dateTimeFieldArray51 = yearMonthDay45.getFields();
        java.io.PrintStream printStream52 = printStream22.format("2022-02-21T09:34:20.882Z", (java.lang.Object[]) dateTimeFieldArray51);
        org.junit.Assert.assertEquals(protectionDomain7.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertEquals(protectionDomain11.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals(protectionDomain16.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
        org.junit.Assert.assertEquals(protectionDomain19.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
        org.junit.Assert.assertNotNull(protectionDomainArray20);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertEquals(locale34.toString(), "parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(monthofyear,2)'-'value(dayofmonth,2))[offset(+hh:mm:ss,'z')]_UNDERFLOW_Years");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "117" + "'", str35, "117");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertNotNull(intStream48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray51);
        org.junit.Assert.assertNotNull(printStream52);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(6);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        org.joda.time.Duration duration11 = duration8.plus((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.LocalDateTime localDateTime15 = property13.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime16 = property13.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getMinimalDaysInFirstWeek();
        java.time.Instant instant7 = gregorianCalendar5.toInstant();
        gregorianCalendar5.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(instant7);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        mutableDateTime17.addMonths((int) ' ');
        mutableDateTime17.add((long) (byte) 10);
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Period period31 = period28.plusHours(2);
        java.time.chrono.IsoEra isoEra32 = java.time.chrono.IsoEra.CE;
        boolean boolean33 = period31.equals((java.lang.Object) isoEra32);
        int int34 = period31.getMinutes();
        mutableDateTime17.add((org.joda.time.ReadablePeriod) period31);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone38);
        long long42 = dateTimeZone38.convertLocalToUTC((long) 3, false);
        long long45 = dateTimeZone38.convertLocalToUTC(0L, true);
        mutableDateTime17.setZoneRetainFields(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime47.toMutableDateTime();
        mutableDateTime47.setWeekyear((-16000000));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + isoEra32 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra32.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3L + "'", long42 == 3L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) days7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 3, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.Interval interval13 = property12.toInterval();
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 3, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((java.lang.Object) dateTime17, chronology19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.dayOfMonth();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = new org.joda.time.Duration(readableInstant22, readableInstant23);
        org.joda.time.Duration duration26 = duration24.withMillis((-1L));
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Duration duration28 = duration24.minus(readableDuration27);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight20.plus((org.joda.time.ReadableDuration) duration28);
        mutableInterval8.setDurationAfterStart((org.joda.time.ReadableDuration) duration28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime();
        boolean boolean32 = mutableInterval8.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 3, chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfYear();
        int int37 = dateTime35.getHourOfDay();
        boolean boolean39 = dateTime35.isBefore((long) '/');
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 3, chronology41);
        org.joda.time.DateTime.Property property43 = dateTime42.dayOfYear();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((java.lang.Object) dateTime42, chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight45.withDayOfYear((int) ' ');
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateMidnight49);
        org.joda.time.DateTime dateTime52 = dateTime35.minusMillis((int) '/');
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(dateTime52);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL3 = file2.toURL();
        java.io.File file4 = null;
        java.io.File file6 = new java.io.File(file4, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL7 = file6.toURL();
        boolean boolean8 = uRL3.sameFile(uRL7);
        java.lang.String str9 = uRL3.getPath();
        java.net.URLConnection uRLConnection10 = uRL3.openConnection();
        java.lang.String str11 = uRLConnection10.getContentType();
        long long14 = uRLConnection10.getHeaderFieldLong("zh-TW", 57L);
        long long17 = uRLConnection10.getHeaderFieldLong("x-windows-iso2022jp", (long) 97);
        uRLConnection10.setUseCaches(false);
        uRLConnection10.setDoInput(false);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL3);
// flaky:         org.junit.Assert.assertEquals(uRL3.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL7);
// flaky:         org.junit.Assert.assertEquals(uRL7.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/experiment/1970-01-01T00:00:00.003Z" + "'", str9, "/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRLConnection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "content/unknown" + "'", str11, "content/unknown");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 57L + "'", long14 == 57L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        double[] doubleArray4 = new double[] { (byte) 0, 59, 83400000000000L, '4' };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.nio.DoubleBuffer doubleBuffer6 = java.nio.DoubleBuffer.wrap(doubleArray4);
        double[] doubleArray11 = new double[] { (byte) 0, 59, 83400000000000L, '4' };
        java.util.stream.DoubleStream doubleStream12 = java.util.stream.DoubleStream.of(doubleArray11);
        java.nio.DoubleBuffer doubleBuffer13 = java.nio.DoubleBuffer.wrap(doubleArray11);
        java.nio.DoubleBuffer doubleBuffer14 = doubleBuffer6.put(doubleBuffer13);
        boolean boolean15 = doubleBuffer14.isDirect();
        java.nio.Buffer buffer16 = doubleBuffer14.rewind();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 59.0, 8.34E13, 52.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleBuffer6);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 59.0, 8.34E13, 52.0]");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleBuffer13);
        org.junit.Assert.assertNotNull(doubleBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(buffer16);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.Date date7 = new java.util.Date();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromDateFields(date7);
        gregorianCalendar5.setGregorianChange(date7);
        int int10 = gregorianCalendar5.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = gregorianCalendar5.getActualMaximum(99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 21 09:43:01 UTC 2022");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 353 + "'", int10 == 353);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isMCOrgLocal();
        boolean boolean3 = inetAddress0.isReachable((int) (short) 10);
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime3 = offsetTime2.toLocalTime();
        java.lang.String str4 = offsetTime2.toString();
        java.time.Duration duration5 = java.time.Duration.ZERO;
        java.lang.String str6 = duration5.toString();
        java.time.OffsetTime offsetTime7 = offsetTime2.plus((java.time.temporal.TemporalAmount) duration5);
        java.time.LocalTime localTime8 = offsetTime2.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime9 = localDate1.atTime(localTime8);
        java.time.LocalDate localDate11 = localDate1.minusWeeks((long) 2097);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone14);
        long long18 = dateTimeZone14.convertLocalToUTC((long) 3, false);
        long long21 = dateTimeZone14.convertLocalToUTC(0L, true);
        boolean boolean22 = localDate1.equals((java.lang.Object) true);
        int int23 = localDate1.lengthOfMonth();
        java.time.LocalDate localDate26 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int27 = localDate26.getMonthValue();
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Period period31 = period28.plusHours(2);
        java.time.chrono.IsoEra isoEra32 = java.time.chrono.IsoEra.CE;
        boolean boolean33 = period31.equals((java.lang.Object) isoEra32);
        java.time.LocalTime localTime38 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime39 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime38);
        java.time.LocalTime localTime44 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime45 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime44);
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime48 = localTime44.with((java.time.temporal.TemporalField) chronoField46, (long) (short) 1);
        long long49 = localTime38.getLong((java.time.temporal.TemporalField) chronoField46);
        boolean boolean50 = isoEra32.isSupported((java.time.temporal.TemporalField) chronoField46);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery51 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period52 = isoEra32.query(periodTemporalQuery51);
        boolean boolean53 = period52.isNegative();
        java.time.Period period55 = period52.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField56 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean57 = period52.equals((java.lang.Object) chronoField56);
        boolean boolean58 = localDate26.isSupported((java.time.temporal.TemporalField) chronoField56);
        java.time.temporal.TemporalUnit temporalUnit59 = chronoField56.getRangeUnit();
        java.time.chrono.ChronoLocalDate chronoLocalDate60 = localDate1.minus((long) (-1), temporalUnit59);
        java.time.format.DateTimeFormatter dateTimeFormatter61 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str62 = dateTimeFormatter61.toString();
        java.time.LocalDateTime localDateTime63 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery64 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period65 = localDateTime63.query(periodTemporalQuery64);
        java.text.Format format66 = dateTimeFormatter61.toFormat(periodTemporalQuery64);
        java.time.Period period67 = chronoLocalDate60.query(periodTemporalQuery64);
        java.util.Optional<java.time.Period> periodOptional68 = java.util.Optional.of(period67);
        java.time.chrono.ChronoPeriod chronoPeriod70 = period67.multipliedBy(624);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23:59:59.999999999-18:00" + "'", str4, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 28 + "'", int23 == 28);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + isoEra32 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra32.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField46.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 3601000000001L + "'", long49 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + chronoField56 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField56.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit59 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit59.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(chronoLocalDate60);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]" + "'", str62, "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(periodTemporalQuery64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(format66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(periodOptional68);
        org.junit.Assert.assertNotNull(chronoPeriod70);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate1 = offsetDateTime0.toLocalDate();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean4 = offsetDateTime2.isSupported((java.time.temporal.TemporalField) chronoField3);
        boolean boolean5 = offsetDateTime0.isEqual(offsetDateTime2);
        java.time.OffsetDateTime offsetDateTime7 = offsetDateTime2.minusHours(3601000000001L);
        java.util.GregorianCalendar gregorianCalendar13 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int14 = gregorianCalendar13.getWeeksInWeekYear();
        java.lang.String str15 = gregorianCalendar13.getCalendarType();
        java.time.ZonedDateTime zonedDateTime16 = gregorianCalendar13.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime16.minusMonths((long) 10);
        java.time.ZonedDateTime zonedDateTime20 = zonedDateTime18.minusHours((long) 9);
        java.time.ZoneOffset zoneOffset21 = zonedDateTime18.getOffset();
        java.time.ZonedDateTime zonedDateTime22 = offsetDateTime2.atZoneSimilarLocal((java.time.ZoneId) zoneOffset21);
        java.time.zone.ZoneRules zoneRules23 = java.time.zone.ZoneRules.of(zoneOffset21);
        java.time.Instant instant24 = java.time.Instant.MIN;
        java.time.ZoneOffset zoneOffset25 = zoneRules23.getStandardOffset(instant24);
        java.time.Instant instant26 = java.time.Instant.now();
        java.time.Instant instant27 = java.time.Instant.now();
        boolean boolean28 = instant26.isAfter(instant27);
        java.time.Instant instant29 = java.time.Instant.now();
        java.time.Instant instant30 = java.time.Instant.now();
        boolean boolean31 = instant29.isAfter(instant30);
        java.time.LocalDate localDate33 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int34 = localDate33.getMonthValue();
        org.joda.time.Period period35 = org.joda.time.Period.ZERO;
        org.joda.time.Period period36 = period35.normalizedStandard();
        org.joda.time.Period period38 = period35.plusHours(2);
        java.time.chrono.IsoEra isoEra39 = java.time.chrono.IsoEra.CE;
        boolean boolean40 = period38.equals((java.lang.Object) isoEra39);
        java.time.LocalTime localTime45 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime46 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime45);
        java.time.LocalTime localTime51 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime52 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime51);
        java.time.temporal.ChronoField chronoField53 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime55 = localTime51.with((java.time.temporal.TemporalField) chronoField53, (long) (short) 1);
        long long56 = localTime45.getLong((java.time.temporal.TemporalField) chronoField53);
        boolean boolean57 = isoEra39.isSupported((java.time.temporal.TemporalField) chronoField53);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery58 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period59 = isoEra39.query(periodTemporalQuery58);
        boolean boolean60 = period59.isNegative();
        java.time.Period period62 = period59.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField63 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean64 = period59.equals((java.lang.Object) chronoField63);
        boolean boolean65 = localDate33.isSupported((java.time.temporal.TemporalField) chronoField63);
        java.time.temporal.TemporalUnit temporalUnit66 = chronoField63.getRangeUnit();
        java.time.Instant instant67 = instant30.truncatedTo(temporalUnit66);
        boolean boolean68 = instant26.isAfter(instant30);
        java.time.ZoneOffset zoneOffset69 = zoneRules23.getStandardOffset(instant26);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "gregory" + "'", str15, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(zoneRules23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + isoEra39 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra39.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertTrue("'" + chronoField53 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField53.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 3601000000001L + "'", long56 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + chronoField63 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField63.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit66 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit66.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(instant67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(zoneOffset69);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL3 = file2.toURL();
        java.io.File file4 = null;
        java.io.File file6 = new java.io.File(file4, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL7 = file6.toURL();
        boolean boolean8 = uRL3.sameFile(uRL7);
        java.lang.String str9 = uRL7.getQuery();
        java.io.File file10 = null;
        java.io.File file12 = new java.io.File(file10, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL13 = file12.toURL();
        java.io.File file14 = null;
        java.io.File file16 = new java.io.File(file14, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL17 = file16.toURL();
        boolean boolean18 = uRL13.sameFile(uRL17);
        java.lang.String str19 = uRL13.getPath();
        boolean boolean20 = uRL7.sameFile(uRL13);
        java.lang.String str21 = uRL7.getQuery();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL3);
// flaky:         org.junit.Assert.assertEquals(uRL3.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL7);
// flaky:         org.junit.Assert.assertEquals(uRL7.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL13);
// flaky:         org.junit.Assert.assertEquals(uRL13.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNull("file16.getParent() == null", file16.getParent());
        org.junit.Assert.assertEquals(file16.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL17);
// flaky:         org.junit.Assert.assertEquals(uRL17.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/experiment/1970-01-01T00:00:00.003Z" + "'", str19, "/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        mutableDateTime17.addMonths((int) ' ');
        mutableDateTime17.add((long) (byte) 10);
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Period period31 = period28.plusHours(2);
        java.time.chrono.IsoEra isoEra32 = java.time.chrono.IsoEra.CE;
        boolean boolean33 = period31.equals((java.lang.Object) isoEra32);
        int int34 = period31.getMinutes();
        mutableDateTime17.add((org.joda.time.ReadablePeriod) period31);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone38);
        long long42 = dateTimeZone38.convertLocalToUTC((long) 3, false);
        long long45 = dateTimeZone38.convertLocalToUTC(0L, true);
        mutableDateTime17.setZoneRetainFields(dateTimeZone38);
        java.lang.String str47 = dateTimeZone38.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology48 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology48.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone50 = ethiopicChronology48.getZone();
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology48.era();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology48.secondOfDay();
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology48.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField54 = ethiopicChronology48.halfdayOfDay();
        org.joda.time.DurationField durationField55 = ethiopicChronology48.weekyears();
        org.joda.time.DateTimeField dateTimeField56 = ethiopicChronology48.hourOfHalfday();
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay((org.joda.time.Chronology) ethiopicChronology48);
        org.joda.time.Period period58 = org.joda.time.Period.ZERO;
        org.joda.time.Period period59 = period58.normalizedStandard();
        org.joda.time.Period period61 = period59.minusMonths(3600000);
        org.joda.time.Period period63 = period61.plusSeconds(292269054);
        int int64 = period61.size();
        int int65 = period61.getMonths();
        // The following exception was thrown during execution in test generation
        try {
            long long68 = ethiopicChronology48.add((org.joda.time.ReadablePeriod) period61, (long) 624, 197);
            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (EthiopicChronology[UTC])");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + isoEra32 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra32.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3L + "'", long42 == 3L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Etc/UTC" + "'", str47, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 8 + "'", int64 == 8);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-3600000) + "'", int65 == (-3600000));
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period4.minusMinutes((int) ' ');
        org.joda.time.Period period8 = period6.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.DateTime dateTime10 = dateTime2.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.DateTime dateTime12 = dateTime2.plusHours(34);
        org.joda.time.DateTime dateTime14 = dateTime2.plusMonths(5);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 0, chronology16);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology18);
        mutableDateTime20.setWeekOfWeekyear((int) '#');
        mutableDateTime20.addHours(0);
        org.joda.time.Days days25 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.DateTime dateTime28 = dateTime14.withDurationAdded(0L, 4200);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        org.joda.time.Instant instant30 = new org.joda.time.Instant((java.lang.Object) dateTime28);
        org.joda.time.Instant instant32 = instant30.plus((long) (-624));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(instant32);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        java.net.UnknownHostException unknownHostException1 = new java.net.UnknownHostException("11");
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL3 = file2.toURL();
        boolean boolean4 = file2.canRead();
        java.nio.file.Path path5 = file2.toPath();
        java.nio.file.Path path6 = path5.toAbsolutePath();
        java.io.File file7 = path6.toFile();
        java.io.File file8 = null;
        java.io.File file10 = new java.io.File(file8, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL11 = file10.toURL();
        boolean boolean12 = file10.canRead();
        java.nio.file.Path path13 = file10.toPath();
        java.nio.file.Path path14 = path13.toAbsolutePath();
        java.io.File file15 = null;
        java.io.File file17 = new java.io.File(file15, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL18 = file17.toURL();
        boolean boolean19 = file17.canRead();
        java.nio.file.Path path20 = file17.toPath();
        java.nio.file.Path path21 = path20.toAbsolutePath();
        java.io.File file22 = path21.toFile();
        boolean boolean23 = path13.endsWith(path21);
        java.io.File file24 = null;
        java.io.File file26 = new java.io.File(file24, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL27 = file26.toURL();
        boolean boolean28 = file26.canRead();
        java.nio.file.Path path29 = file26.toPath();
        java.nio.file.Path path30 = path29.toAbsolutePath();
        boolean boolean31 = path13.endsWith(path29);
        int int32 = path6.compareTo(path29);
        java.net.URI uRI33 = path29.toUri();
        java.net.URI uRI34 = path29.toUri();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL3);
// flaky:         org.junit.Assert.assertEquals(uRL3.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertNotNull(file7);
// flaky:         org.junit.Assert.assertEquals(file7.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL11);
// flaky:         org.junit.Assert.assertEquals(uRL11.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(path13);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNull("file17.getParent() == null", file17.getParent());
        org.junit.Assert.assertEquals(file17.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL18);
// flaky:         org.junit.Assert.assertEquals(uRL18.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(path20);
        org.junit.Assert.assertNotNull(path21);
        org.junit.Assert.assertNotNull(file22);
// flaky:         org.junit.Assert.assertEquals(file22.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file22.toString(), "/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull("file26.getParent() == null", file26.getParent());
        org.junit.Assert.assertEquals(file26.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL27);
// flaky:         org.junit.Assert.assertEquals(uRL27.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(path29);
        org.junit.Assert.assertNotNull(path30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2) + "'", int32 == (-2));
        org.junit.Assert.assertNotNull(uRI33);
        org.junit.Assert.assertNotNull(uRI34);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL3 = file2.toURL();
        boolean boolean4 = file2.canRead();
        java.nio.file.Path path5 = file2.toPath();
        java.nio.file.Path path6 = path5.toAbsolutePath();
        java.io.File file7 = path6.toFile();
        boolean boolean8 = file7.isAbsolute();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL3);
// flaky:         org.junit.Assert.assertEquals(uRL3.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertNotNull(file7);
// flaky:         org.junit.Assert.assertEquals(file7.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray4 = new java.util.Locale[] { locale3 };
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList5);
        int int9 = localeList5.indexOf((java.lang.Object) (byte) -1);
        java.util.Set<java.lang.String> strSet10 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream11 = strSet10.parallelStream();
        boolean boolean13 = strSet10.remove((java.lang.Object) 0);
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime19 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime18);
        java.time.LocalTime localTime24 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime25 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime24);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime28 = localTime24.with((java.time.temporal.TemporalField) chronoField26, (long) (short) 1);
        long long29 = localTime18.getLong((java.time.temporal.TemporalField) chronoField26);
        java.time.LocalTime localTime31 = localTime18.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange33 = localTime31.range((java.time.temporal.TemporalField) chronoField32);
        boolean boolean34 = strSet10.remove((java.lang.Object) chronoField32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 3, chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.dayOfYear();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((java.lang.Object) dateTime37, chronology39);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime37.toMutableDateTime();
        org.joda.time.Days days42 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadablePeriod) days42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 3, chronology45);
        org.joda.time.DateTime.Property property47 = dateTime46.dayOfYear();
        org.joda.time.Interval interval48 = property47.toInterval();
        mutableInterval43.setInterval((org.joda.time.ReadableInterval) interval48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 3, chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.dayOfYear();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((java.lang.Object) dateTime52, chronology54);
        org.joda.time.DateMidnight.Property property56 = dateMidnight55.dayOfMonth();
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = new org.joda.time.Duration(readableInstant57, readableInstant58);
        org.joda.time.Duration duration61 = duration59.withMillis((-1L));
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.Duration duration63 = duration59.minus(readableDuration62);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight55.plus((org.joda.time.ReadableDuration) duration63);
        mutableInterval43.setDurationAfterStart((org.joda.time.ReadableDuration) duration63);
        boolean boolean66 = strSet10.contains((java.lang.Object) mutableInterval43);
        java.util.Set<java.lang.String> strSet67 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream68 = strSet67.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream69 = strSet67.parallelStream();
        boolean boolean70 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet67);
        boolean boolean71 = localeList5.containsAll((java.util.Collection<java.lang.String>) strSet10);
        java.lang.Object[] objArray72 = strSet10.toArray();
        boolean boolean74 = strSet10.add("years");
        strSet10.clear();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField26.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3601000000001L + "'", long29 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(strStream68);
        org.junit.Assert.assertNotNull(strStream69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime0.with((java.time.temporal.TemporalField) chronoField1, (long) 10);
        java.time.Duration duration5 = java.time.Duration.ofSeconds((long) 0);
        java.time.temporal.Temporal temporal6 = localDateTime0.minus((java.time.temporal.TemporalAmount) duration5);
        java.time.Duration duration7 = duration5.abs();
        java.time.Duration duration9 = duration5.withNanos(28);
        java.time.Duration duration11 = duration9.minusMinutes((long) 34929155);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        java.time.Period period1 = java.time.Period.ofYears(28);
        java.time.chrono.IsoChronology isoChronology2 = period1.getChronology();
        boolean boolean4 = isoChronology2.isLeapYear((long) 35);
        boolean boolean6 = isoChronology2.isLeapYear(7L);
        java.util.List<java.time.chrono.Era> eraList7 = isoChronology2.eras();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate11 = isoChronology2.date((-292275054), 306, 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 306");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(isoChronology2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(eraList7);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        java.lang.Object obj0 = null;
        org.joda.time.MutableInterval mutableInterval1 = new org.joda.time.MutableInterval(obj0);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) 1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 3, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.DateTime dateTime9 = interval8.getEnd();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(readableInstant12, readableInstant13);
        org.joda.time.Duration duration16 = duration14.withMillis((-1L));
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 3, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((java.lang.Object) dateTime19, chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight22.withDayOfYear((int) ' ');
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period28 = duration16.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight22, periodType27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) 0, chronology30);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.weekyearOfCentury();
        org.joda.time.DurationField durationField34 = chronology32.weekyears();
        org.joda.time.DurationField durationField35 = chronology32.seconds();
        org.joda.time.Chronology chronology36 = chronology32.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = chronology32.hourOfDay();
        org.joda.time.Period period38 = new org.joda.time.Period(28L, 3L, periodType27, chronology32);
        org.joda.time.Period period39 = duration3.toPeriodTo((org.joda.time.ReadableInstant) dateTime9, periodType27);
        mutableInterval1.setDurationAfterStart((org.joda.time.ReadableDuration) duration3);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(period39);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        gregorianCalendar5.set((int) ':', 3, 256, 5, 17, 3600000);
        int int13 = gregorianCalendar5.getWeekYear();
        int int14 = gregorianCalendar5.getFirstDayOfWeek();
        int int15 = gregorianCalendar5.getMinimalDaysInFirstWeek();
        boolean boolean16 = gregorianCalendar5.isWeekDateSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = gregorianCalendar5.getMaximum((-11));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateTime dateTime9 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime13 = dateTime9.withYearOfCentury((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime16 = property14.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property17.roundHalfCeilingCopy();
        org.joda.time.format.PeriodPrinter periodPrinter20 = null;
        org.joda.time.format.PeriodParser periodParser21 = null;
        org.joda.time.format.PeriodFormatter periodFormatter22 = new org.joda.time.format.PeriodFormatter(periodPrinter20, periodParser21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter24 = periodFormatter22.withParseType(periodType23);
        java.util.Locale locale26 = new java.util.Locale("hi!");
        org.joda.time.format.PeriodFormatter periodFormatter27 = periodFormatter22.withLocale(locale26);
        java.util.Locale locale29 = new java.util.Locale("hi!");
        boolean boolean30 = locale29.hasExtensions();
        java.time.format.DecimalStyle decimalStyle31 = java.time.format.DecimalStyle.of(locale29);
        java.util.Set<java.lang.String> strSet32 = locale29.getUnicodeLocaleKeys();
        java.lang.String str33 = locale29.getVariant();
        java.lang.String str34 = locale26.getDisplayVariant(locale29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime35 = property17.setCopy("2031-02-16", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2031-02-16\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodFormatter24);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertNotNull(periodFormatter27);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(decimalStyle31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime14 = localTime10.with((java.time.temporal.TemporalField) chronoField12, (long) (short) 1);
        long long15 = localTime4.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.LocalTime localTime17 = localTime4.withSecond((int) (short) 1);
        java.time.LocalTime localTime22 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime23 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime22);
        java.time.LocalTime localTime28 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime29 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime28);
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime32 = localTime28.with((java.time.temporal.TemporalField) chronoField30, (long) (short) 1);
        long long33 = localTime22.getLong((java.time.temporal.TemporalField) chronoField30);
        java.time.LocalTime localTime35 = localTime22.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange37 = localTime35.range((java.time.temporal.TemporalField) chronoField36);
        java.time.Duration duration39 = java.time.Duration.ofSeconds((long) 0);
        java.time.LocalTime localTime40 = localTime35.plus((java.time.temporal.TemporalAmount) duration39);
        boolean boolean41 = localTime17.isAfter(localTime40);
        int int42 = localTime17.getMinute();
        java.time.OffsetTime offsetTime43 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime44 = offsetTime43.toLocalTime();
        java.lang.String str45 = offsetTime43.toString();
        java.time.Duration duration46 = java.time.Duration.ZERO;
        java.lang.String str47 = duration46.toString();
        java.time.OffsetTime offsetTime48 = offsetTime43.plus((java.time.temporal.TemporalAmount) duration46);
        java.time.OffsetTime offsetTime50 = offsetTime43.plusNanos((long) 0);
        java.time.LocalTime localTime55 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime56 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime55);
        java.time.temporal.ChronoField chronoField57 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime59 = localTime55.with((java.time.temporal.TemporalField) chronoField57, (long) (short) 1);
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.lang.String str61 = chronoField57.getDisplayName(locale60);
        java.time.OffsetTime offsetTime63 = offsetTime50.with((java.time.temporal.TemporalField) chronoField57, (long) 28);
        org.joda.time.Period period64 = org.joda.time.Period.ZERO;
        org.joda.time.Period period65 = period64.normalizedStandard();
        org.joda.time.Period period67 = period64.plusHours(2);
        java.time.chrono.IsoEra isoEra68 = java.time.chrono.IsoEra.CE;
        boolean boolean69 = period67.equals((java.lang.Object) isoEra68);
        java.time.LocalTime localTime74 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime75 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime74);
        java.time.LocalTime localTime80 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime81 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime80);
        java.time.temporal.ChronoField chronoField82 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime84 = localTime80.with((java.time.temporal.TemporalField) chronoField82, (long) (short) 1);
        long long85 = localTime74.getLong((java.time.temporal.TemporalField) chronoField82);
        boolean boolean86 = isoEra68.isSupported((java.time.temporal.TemporalField) chronoField82);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery87 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period88 = isoEra68.query(periodTemporalQuery87);
        boolean boolean89 = period88.isNegative();
        java.time.Period period91 = period88.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField92 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean93 = period88.equals((java.lang.Object) chronoField92);
        java.time.chrono.ChronoPeriod chronoPeriod94 = period88.negated();
        java.time.OffsetTime offsetTime95 = offsetTime50.minus((java.time.temporal.TemporalAmount) period88);
        java.time.Period period97 = period88.plusYears((long) 2022);
        long long98 = period88.toTotalMonths();
        java.time.LocalTime localTime99 = localTime17.minus((java.time.temporal.TemporalAmount) period88);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3601000000001L + "'", long15 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField30.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3601000000001L + "'", long33 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField36.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(offsetTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "23:59:59.999999999-18:00" + "'", str45, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PT0S" + "'", str47, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime48);
        org.junit.Assert.assertNotNull(offsetTime50);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + chronoField57 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField57.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "NanoOfDay" + "'", str61, "NanoOfDay");
        org.junit.Assert.assertNotNull(offsetTime63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + isoEra68 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra68.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(localTime81);
        org.junit.Assert.assertTrue("'" + chronoField82 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField82.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 3601000000001L + "'", long85 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery87);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + chronoField92 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField92.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(chronoPeriod94);
        org.junit.Assert.assertNotNull(offsetTime95);
        org.junit.Assert.assertNotNull(period97);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 0L + "'", long98 == 0L);
        org.junit.Assert.assertNotNull(localTime99);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        int int8 = localDateTime3.get(dateTimeFieldType7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfWeek();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 3, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfYear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((java.lang.Object) dateTime12, chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusMonths((-1));
        long long18 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight15.minusYears(0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2097 + "'", int8 == 2097);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 46438L + "'", long18 == 46438L);
        org.junit.Assert.assertNotNull(dateMidnight20);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.dayOfWeek();
        int int10 = mutableDateTime6.getMillisOfDay();
        mutableDateTime6.addMinutes(0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateTime dateTime9 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.LocalTime localTime11 = localTime2.plusHours(3);
        int int12 = localTime11.getMillisOfDay();
        org.joda.time.LocalTime.Property property13 = localTime11.millisOfSecond();
        org.joda.time.LocalTime localTime14 = property13.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = property13.addCopy((long) 59);
        org.joda.time.LocalTime localTime17 = property13.roundCeilingCopy();
        org.joda.time.LocalTime localTime18 = property13.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10800000 + "'", int12 == 10800000);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL3 = file2.toURL();
        boolean boolean4 = file2.canRead();
        java.nio.file.Path path5 = file2.toPath();
        java.nio.file.Path path6 = path5.toAbsolutePath();
        java.io.File file7 = null;
        java.io.File file9 = new java.io.File(file7, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL10 = file9.toURL();
        boolean boolean11 = file9.canRead();
        java.nio.file.Path path12 = file9.toPath();
        java.nio.file.Path path13 = path12.toAbsolutePath();
        java.io.File file14 = path13.toFile();
        boolean boolean15 = path5.endsWith(path13);
        java.util.Iterator<java.nio.file.Path> pathItor16 = path5.iterator();
        boolean boolean18 = path5.startsWith("BIG_ENDIAN");
        java.nio.file.Path path20 = path5.resolveSibling("365");
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL3);
// flaky:         org.junit.Assert.assertEquals(uRL3.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(path5);
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL10);
// flaky:         org.junit.Assert.assertEquals(uRL10.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(path12);
        org.junit.Assert.assertNotNull(path13);
        org.junit.Assert.assertNotNull(file14);
// flaky:         org.junit.Assert.assertEquals(file14.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file14.toString(), "/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(pathItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(path20);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        java.time.Period period1 = java.time.Period.ofMonths(0);
        java.time.chrono.Chronology chronology2 = period1.getChronology();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        java.lang.String str1 = java.net.URLConnection.getDefaultRequestProperty("23:59:59.999999999-18:00");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond(3600000L);
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange1 = chronoField0.range();
        boolean boolean3 = valueRange1.isValidIntValue((long) 127);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        java.io.PrintStream printStream1 = new java.io.PrintStream("subject:\n (GERMAN)");
        java.util.Properties properties3 = null;
        java.util.Properties properties4 = new java.util.Properties(properties3);
        java.nio.LongBuffer longBuffer6 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer7 = longBuffer6.mark();
        boolean boolean8 = properties4.containsKey((java.lang.Object) longBuffer6);
        java.nio.charset.Charset charset9 = java.nio.charset.Charset.defaultCharset();
        boolean boolean10 = charset9.canEncode();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        java.lang.Object obj15 = properties4.getOrDefault((java.lang.Object) boolean10, (java.lang.Object) property14);
        properties4.clear();
        int int17 = properties4.size();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusSeconds(6);
        org.joda.time.DateTime dateTime24 = localDateTime21.toDateTime();
        int int25 = localDateTime21.getMinuteOfHour();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.years();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.halfdays();
        int int28 = periodType26.indexOf(durationFieldType27);
        java.lang.String str29 = durationFieldType27.toString();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime21.withFieldAdded(durationFieldType27, (int) (byte) 100);
        java.time.LocalTime localTime36 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime37 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime36);
        java.time.temporal.ChronoField chronoField38 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime40 = localTime36.with((java.time.temporal.TemporalField) chronoField38, (long) (short) 1);
        java.time.Duration duration42 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime43 = localTime36.minus((java.time.temporal.TemporalAmount) duration42);
        boolean boolean44 = properties4.remove((java.lang.Object) (byte) 100, (java.lang.Object) localTime43);
        java.lang.Object obj47 = properties4.setProperty("Subject:\n", "1");
        java.util.Enumeration<java.lang.Object> objEnumeration48 = properties4.keys();
        java.util.Properties properties49 = null;
        java.util.Properties properties50 = new java.util.Properties(properties49);
        java.nio.LongBuffer longBuffer52 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer53 = longBuffer52.mark();
        boolean boolean54 = properties50.containsKey((java.lang.Object) longBuffer52);
        java.nio.charset.Charset charset55 = java.nio.charset.Charset.defaultCharset();
        boolean boolean56 = charset55.canEncode();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) 3, chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.dayOfYear();
        java.lang.Object obj61 = properties50.getOrDefault((java.lang.Object) boolean56, (java.lang.Object) property60);
        properties50.clear();
        int int63 = properties50.size();
        java.io.PrintStream printStream65 = new java.io.PrintStream("subject:\n (GERMAN)");
        printStream65.write((int) '#');
        java.security.CodeSource codeSource69 = null;
        java.security.PermissionCollection permissionCollection70 = null;
        java.security.ProtectionDomain protectionDomain71 = new java.security.ProtectionDomain(codeSource69, permissionCollection70);
        java.lang.ClassLoader classLoader72 = protectionDomain71.getClassLoader();
        java.security.CodeSource codeSource73 = null;
        java.security.PermissionCollection permissionCollection74 = null;
        java.security.ProtectionDomain protectionDomain75 = new java.security.ProtectionDomain(codeSource73, permissionCollection74);
        java.security.Permission permission76 = null;
        boolean boolean77 = protectionDomain75.implies(permission76);
        java.security.CodeSource codeSource78 = null;
        java.security.PermissionCollection permissionCollection79 = null;
        java.security.ProtectionDomain protectionDomain80 = new java.security.ProtectionDomain(codeSource78, permissionCollection79);
        java.security.CodeSource codeSource81 = null;
        java.security.PermissionCollection permissionCollection82 = null;
        java.security.ProtectionDomain protectionDomain83 = new java.security.ProtectionDomain(codeSource81, permissionCollection82);
        java.security.ProtectionDomain[] protectionDomainArray84 = new java.security.ProtectionDomain[] { protectionDomain71, protectionDomain75, protectionDomain80, protectionDomain83 };
        java.security.AccessControlContext accessControlContext85 = new java.security.AccessControlContext(protectionDomainArray84);
        java.io.PrintStream printStream86 = printStream65.printf("Property[secondOfMinute]", (java.lang.Object[]) protectionDomainArray84);
        properties50.list(printStream86);
        properties4.storeToXML((java.io.OutputStream) printStream86, "2022-02-21T09:34:48.151Z");
        java.security.CodeSource codeSource91 = null;
        java.security.PermissionCollection permissionCollection92 = null;
        java.security.ProtectionDomain protectionDomain93 = new java.security.ProtectionDomain(codeSource91, permissionCollection92);
        java.security.Principal[] principalArray94 = protectionDomain93.getPrincipals();
        java.io.PrintStream printStream95 = printStream86.printf("599b081c1808", (java.lang.Object[]) principalArray94);
        java.io.PrintStream printStream96 = printStream1.format("2022-02-21T09:39:57.597Z", (java.lang.Object[]) principalArray94);
        printStream96.println(false);
        printStream96.close();
        org.junit.Assert.assertNotNull(longBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "Property[dayOfYear]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "Property[dayOfYear]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "Property[dayOfYear]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 43 + "'", int25 == 43);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "halfdays" + "'", str29, "halfdays");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + chronoField38 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField38.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objEnumeration48);
        org.junit.Assert.assertNotNull(longBuffer52);
        org.junit.Assert.assertNotNull(buffer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(charset55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "Property[dayOfYear]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "Property[dayOfYear]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "Property[dayOfYear]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals(protectionDomain71.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
        org.junit.Assert.assertNull(classLoader72);
        org.junit.Assert.assertEquals(protectionDomain75.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals(protectionDomain80.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
        org.junit.Assert.assertEquals(protectionDomain83.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
        org.junit.Assert.assertNotNull(protectionDomainArray84);
        org.junit.Assert.assertNotNull(printStream86);
        org.junit.Assert.assertEquals(protectionDomain93.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
        org.junit.Assert.assertNotNull(principalArray94);
        org.junit.Assert.assertNotNull(printStream95);
        org.junit.Assert.assertNotNull(printStream96);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        mutableDateTime17.addMonths((int) ' ');
        mutableDateTime17.add((long) (byte) 10);
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Period period31 = period28.plusHours(2);
        java.time.chrono.IsoEra isoEra32 = java.time.chrono.IsoEra.CE;
        boolean boolean33 = period31.equals((java.lang.Object) isoEra32);
        int int34 = period31.getMinutes();
        mutableDateTime17.add((org.joda.time.ReadablePeriod) period31);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone38);
        long long42 = dateTimeZone38.convertLocalToUTC((long) 3, false);
        long long45 = dateTimeZone38.convertLocalToUTC(0L, true);
        mutableDateTime17.setZoneRetainFields(dateTimeZone38);
        java.lang.String str47 = dateTimeZone38.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology48 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology48.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone50 = ethiopicChronology48.getZone();
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology48.era();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology48.millisOfDay();
        org.joda.time.DurationField durationField53 = ethiopicChronology48.halfdays();
        org.joda.time.DurationField durationField54 = ethiopicChronology48.centuries();
        org.joda.time.LocalTime localTime55 = org.joda.time.LocalTime.now((org.joda.time.Chronology) ethiopicChronology48);
        org.joda.time.DurationField durationField56 = ethiopicChronology48.hours();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + isoEra32 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra32.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3L + "'", long42 == 3L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Etc/UTC" + "'", str47, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(durationField56);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        byte[] byteArray5 = charsetEncoder4.replacement();
        java.nio.charset.Charset charset6 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder7 = charset6.newDecoder();
        float float8 = charsetDecoder7.maxCharsPerByte();
        float float9 = charsetDecoder7.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction10 = charsetDecoder7.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder11 = charsetEncoder4.onUnmappableCharacter(codingErrorAction10);
        java.nio.charset.Charset charset12 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder13 = charset12.newDecoder();
        java.nio.charset.Charset charset14 = java.nio.charset.Charset.defaultCharset();
        boolean boolean15 = charset12.contains(charset14);
        java.nio.charset.CharsetEncoder charsetEncoder16 = charset12.newEncoder();
        char[] charArray17 = new char[] {};
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.wrap(charArray17);
        java.nio.ByteBuffer byteBuffer19 = charsetEncoder16.encode(charBuffer18);
        java.nio.CharBuffer charBuffer20 = charBuffer18.slice();
        java.nio.ByteBuffer byteBuffer21 = charsetEncoder11.encode(charBuffer20);
        boolean boolean23 = charsetEncoder11.canEncode('4');
        java.nio.CharBuffer charBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = charsetEncoder11.encode(charBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[63]");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charsetDecoder7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction10);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(charsetDecoder13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(charBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.TimeZone timeZone7 = gregorianCalendar5.getTimeZone();
        int int9 = timeZone7.getOffset((long) 14);
        java.util.TimeZone.setDefault(timeZone7);
        java.lang.String str11 = timeZone7.getID();
        java.util.TimeZone.setDefault(timeZone7);
        boolean boolean13 = timeZone7.useDaylightTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Etc/UTC" + "'", str11, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        gregorianCalendar5.roll(7, false);
        java.util.TimeZone timeZone9 = gregorianCalendar5.getTimeZone();
        timeZone9.setID("1970-02-03T00:00:00.003Z");
        java.util.GregorianCalendar gregorianCalendar12 = new java.util.GregorianCalendar(timeZone9);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 10);
        int int5 = property2.get();
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfYear(121);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Interval interval1 = localDate0.toInterval();
        int int2 = localDate0.getDayOfYear();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 3600000, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 22, dateTimeZone7);
        org.joda.time.Interval interval11 = localDate0.toInterval(dateTimeZone7);
        org.joda.time.LocalDate.Property property12 = localDate0.weekyear();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay();
        org.joda.time.DateMidnight dateMidnight14 = yearMonthDay13.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean16 = dateMidnight14.isSupported(dateTimeFieldType15);
        java.lang.String str17 = dateTimeFieldType15.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property18 = localDate0.property(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "clockhourOfDay" + "'", str17, "clockhourOfDay");
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Interval interval1 = localDate0.toInterval();
        int int2 = localDate0.getYearOfCentury();
        int int3 = localDate0.getCenturyOfEra();
        int int4 = localDate0.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate6 = localDate0.withWeekOfWeekyear(2);
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(41L);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localTime1.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(17480);
        org.junit.Assert.assertNotNull(floatBuffer1);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        java.io.PrintStream printStream1 = new java.io.PrintStream("2022-02-21T09:35:58.254");
        java.io.OutputStream outputStream2 = null;
        java.io.FilterOutputStream filterOutputStream3 = new java.io.FilterOutputStream(outputStream2);
        java.io.PrintStream printStream5 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream3, false);
        char[] charArray6 = new char[] {};
        java.nio.CharBuffer charBuffer7 = java.nio.CharBuffer.wrap(charArray6);
        printStream5.print(charArray6);
        printStream1.print(charArray6);
        java.nio.CharBuffer charBuffer10 = java.nio.CharBuffer.wrap(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charBuffer10);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay1.withSecondOfMinute(0);
        int int7 = timeOfDay1.size();
        int[] intArray8 = timeOfDay1.getValues();
        org.joda.time.LocalTime localTime9 = timeOfDay1.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay1.withMinuteOfHour(52);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 0, chronology13);
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekyearOfCentury();
        org.joda.time.DurationField durationField17 = chronology15.weekyears();
        org.joda.time.Chronology chronology18 = chronology15.withUTC();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology15);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay11.withChronologyRetainFields(chronology15);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withMinuteOfHour(25);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.TimeZone timeZone7 = gregorianCalendar5.getTimeZone();
        java.time.ZoneId zoneId8 = timeZone7.toZoneId();
        java.util.TimeZone.setDefault(timeZone7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId8);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        java.util.Locale locale1 = new java.util.Locale("OptionalDouble.empty");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "optionaldouble.empty");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "optionaldouble.empty" + "'", str2, "optionaldouble.empty");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        java.io.PrintStream printStream1 = new java.io.PrintStream("subject:\n (GERMAN)");
        printStream1.write((int) '#');
        java.util.GregorianCalendar gregorianCalendar9 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int10 = gregorianCalendar9.getWeeksInWeekYear();
        java.util.TimeZone timeZone11 = gregorianCalendar9.getTimeZone();
        int int13 = gregorianCalendar9.getMaximum((int) (short) 10);
        printStream1.print((java.lang.Object) gregorianCalendar9);
        java.util.GregorianCalendar gregorianCalendar21 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int22 = gregorianCalendar21.getWeeksInWeekYear();
        org.joda.time.YearMonthDay yearMonthDay23 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar21);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay23.withYear(0);
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = yearMonthDay25.getFields();
        java.io.PrintStream printStream27 = printStream1.format("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]", (java.lang.Object[]) dateTimeFieldArray26);
        java.io.PrintStream printStream29 = printStream27.append('#');
        printStream29.println();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(dateTimeFieldArray26);
        org.junit.Assert.assertNotNull(printStream27);
        org.junit.Assert.assertNotNull(printStream29);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.LocalTime localTime19 = localTime6.withSecond((int) (short) 1);
        java.lang.Object obj21 = properties1.put((java.lang.Object) localTime19, (java.lang.Object) "117");
        java.lang.Object obj22 = properties1.clone();
        java.lang.Object obj23 = properties1.clone();
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{01:00:01.000000001=117}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{01:00:01.000000001=117}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{01:00:01.000000001=117}");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "{01:00:01.000000001=117}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "{01:00:01.000000001=117}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "{01:00:01.000000001=117}");
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        int[] intArray6 = new int[] { 3600000, 3600000, 256, 21, (byte) 100, (short) -1 };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.stream.IntStream intStream8 = intStream7.parallel();
        java.util.OptionalInt optionalInt9 = intStream7.max();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3600000, 3600000, 256, 21, 100, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(optionalInt9);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(299102334976L);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.parallelStream();
        boolean boolean3 = strSet0.remove((java.lang.Object) 0);
        boolean boolean5 = strSet0.add("0 - 86399");
        org.joda.time.Days days6 = org.joda.time.Days.ONE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.Days days9 = days6.multipliedBy(1024);
        org.joda.time.Days days10 = days9.negated();
        boolean boolean11 = strSet0.equals((java.lang.Object) days10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days13 = days10.multipliedBy(3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1024 * 3600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate(32769);
        boolean boolean2 = longBuffer1.isDirect();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        int int6 = dateTime5.getYear();
        boolean boolean7 = longBuffer1.equals((java.lang.Object) int6);
        boolean boolean8 = longBuffer1.hasArray();
        java.nio.LongBuffer longBuffer10 = java.nio.LongBuffer.allocate((int) (short) 0);
        long[] longArray11 = longBuffer10.array();
        java.nio.LongBuffer longBuffer12 = java.nio.LongBuffer.wrap(longArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer15 = longBuffer1.get(longArray11, (int) (short) 10, 335);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longBuffer10);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longBuffer12);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery1 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period2 = localDateTime0.query(periodTemporalQuery1);
        java.time.chrono.IsoChronology isoChronology3 = period2.getChronology();
        java.time.Clock clock4 = java.time.Clock.systemUTC();
        java.time.Duration duration6 = java.time.Duration.ofSeconds((long) 256);
        java.time.Clock clock7 = java.time.Clock.tick(clock4, duration6);
        java.time.Duration duration9 = java.time.Duration.ofMinutes((long) 3);
        java.time.Duration duration10 = duration9.abs();
        java.time.Clock clock11 = java.time.Clock.offset(clock4, duration9);
        java.time.LocalDate localDate12 = java.time.LocalDate.now(clock11);
        java.time.LocalDate localDate13 = isoChronology3.dateNow(clock11);
        java.lang.String str14 = isoChronology3.toString();
        java.time.chrono.ChronoLocalDate chronoLocalDate16 = isoChronology3.dateEpochDay((long) (short) 1);
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap17 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.text.Format format19 = dateTimeFormatter18.toFormat();
        java.text.Format format20 = dateTimeFormatter18.toFormat();
        java.time.ZoneId zoneId21 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter18.withZone(zoneId21);
        java.time.format.ResolverStyle resolverStyle23 = dateTimeFormatter22.getResolverStyle();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate24 = isoChronology3.resolveDate(temporalFieldMap17, resolverStyle23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(periodTemporalQuery1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(isoChronology3);
        org.junit.Assert.assertNotNull(clock4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISO" + "'", str14, "ISO");
        org.junit.Assert.assertNotNull(chronoLocalDate16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(format19);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertTrue("'" + resolverStyle23 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle23.equals(java.time.format.ResolverStyle.STRICT));
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        float float2 = charsetDecoder1.maxCharsPerByte();
        float float3 = charsetDecoder1.averageCharsPerByte();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocateDirect(10800000);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putLong((long) 3600000);
        double double8 = byteBuffer5.getDouble();
        java.nio.CharBuffer charBuffer9 = charsetDecoder1.decode(byteBuffer5);
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(charBuffer9);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        java.lang.Object obj2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType4 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withWeeksRemoved();
        org.joda.time.Period period6 = new org.joda.time.Period(obj2, periodType3);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 3, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((java.lang.Object) dateTime9, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime9.toMutableDateTime();
        org.joda.time.Days days14 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadablePeriod) days14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 3, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfYear();
        org.joda.time.Interval interval20 = property19.toInterval();
        mutableInterval15.setInterval((org.joda.time.ReadableInterval) interval20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = new org.joda.time.Duration(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = duration24.toPeriodTo(readableInstant25, periodType26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(readableInstant28, readableInstant29);
        long long31 = duration30.getMillis();
        boolean boolean32 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 3, chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfYear();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((java.lang.Object) dateTime35, chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime35.toMutableDateTime();
        mutableDateTime39.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime39.dayOfWeek();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.year();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.weekyear();
        boolean boolean45 = duration24.equals((java.lang.Object) mutableDateTime39);
        mutableDateTime39.addMonths((int) ' ');
        mutableDateTime39.add((long) (byte) 10);
        org.joda.time.Period period50 = org.joda.time.Period.ZERO;
        org.joda.time.Period period51 = period50.normalizedStandard();
        org.joda.time.Period period53 = period50.plusHours(2);
        java.time.chrono.IsoEra isoEra54 = java.time.chrono.IsoEra.CE;
        boolean boolean55 = period53.equals((java.lang.Object) isoEra54);
        int int56 = period53.getMinutes();
        mutableDateTime39.add((org.joda.time.ReadablePeriod) period53);
        java.util.TimeZone timeZone59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone60);
        long long64 = dateTimeZone60.convertLocalToUTC((long) 3, false);
        long long67 = dateTimeZone60.convertLocalToUTC(0L, true);
        mutableDateTime39.setZoneRetainFields(dateTimeZone60);
        java.lang.String str69 = dateTimeZone60.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology70 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField71 = ethiopicChronology70.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone72 = ethiopicChronology70.getZone();
        org.joda.time.DateTimeField dateTimeField73 = ethiopicChronology70.era();
        org.joda.time.DateTimeField dateTimeField74 = ethiopicChronology70.secondOfDay();
        org.joda.time.DateTimeField dateTimeField75 = ethiopicChronology70.minuteOfHour();
        org.joda.time.DurationField durationField76 = ethiopicChronology70.months();
        org.joda.time.DateTimeField dateTimeField77 = ethiopicChronology70.monthOfYear();
        org.joda.time.DateTimeField dateTimeField78 = ethiopicChronology70.hourOfHalfday();
        mutableInterval15.setChronology((org.joda.time.Chronology) ethiopicChronology70);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) 1265550, 1645436435000L, periodType3, (org.joda.time.Chronology) ethiopicChronology70);
        org.joda.time.DateTimeField dateTimeField81 = ethiopicChronology70.dayOfYear();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertTrue("'" + isoEra54 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra54.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 3L + "'", long64 == 3L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Etc/UTC" + "'", str69, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(durationField76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(dateTimeField81);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale6 };
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList8);
        localeList10.clear();
        java.util.List<java.util.Locale> localeList12 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale locale16 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray17 = new java.util.Locale[] { locale16 };
        java.util.ArrayList<java.util.Locale> localeList18 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList18, localeArray17);
        java.util.List<java.util.Locale> localeList20 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList18);
        localeList20.clear();
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList20, filteringMode22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList26 = localeList23.subList(86, 667);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 667");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertNotNull(localeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localeList20);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList23);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        java.time.Period period1 = java.time.Period.ofYears(28);
        java.time.chrono.IsoChronology isoChronology2 = period1.getChronology();
        java.util.List<java.time.chrono.Era> eraList3 = isoChronology2.eras();
        java.lang.String str4 = isoChronology2.toString();
        java.lang.String str5 = isoChronology2.getId();
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime8 = localDateTime6.minusYears((long) (byte) 10);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusYears((long) (byte) 10);
        boolean boolean12 = localDateTime6.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime11);
        java.time.Instant instant14 = java.time.Instant.now();
        java.nio.file.attribute.FileTime fileTime15 = java.nio.file.attribute.FileTime.from(instant14);
        java.time.Instant instant16 = java.time.Instant.now();
        java.time.Instant instant17 = java.time.Instant.now();
        boolean boolean18 = instant16.isAfter(instant17);
        java.time.Duration duration19 = java.time.Duration.ZERO;
        java.time.Instant instant20 = instant17.minus((java.time.temporal.TemporalAmount) duration19);
        int int21 = instant14.compareTo(instant20);
        java.util.Properties properties22 = null;
        java.util.Properties properties23 = new java.util.Properties(properties22);
        java.time.LocalTime localTime28 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime29 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime28);
        java.time.LocalTime localTime34 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime35 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime34);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime38 = localTime34.with((java.time.temporal.TemporalField) chronoField36, (long) (short) 1);
        long long39 = localTime28.getLong((java.time.temporal.TemporalField) chronoField36);
        java.time.LocalTime localTime41 = localTime28.withSecond((int) (short) 1);
        java.lang.Object obj43 = properties23.put((java.lang.Object) localTime41, (java.lang.Object) "117");
        java.time.LocalDateTime localDateTime44 = java.time.LocalDateTime.MIN;
        java.time.Month month45 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime46 = localDateTime44.with((java.time.temporal.TemporalAdjuster) month45);
        java.time.LocalDate localDate49 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int50 = localDate49.getMonthValue();
        org.joda.time.Period period51 = org.joda.time.Period.ZERO;
        org.joda.time.Period period52 = period51.normalizedStandard();
        org.joda.time.Period period54 = period51.plusHours(2);
        java.time.chrono.IsoEra isoEra55 = java.time.chrono.IsoEra.CE;
        boolean boolean56 = period54.equals((java.lang.Object) isoEra55);
        java.time.LocalTime localTime61 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime62 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime61);
        java.time.LocalTime localTime67 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime68 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime67);
        java.time.temporal.ChronoField chronoField69 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime71 = localTime67.with((java.time.temporal.TemporalField) chronoField69, (long) (short) 1);
        long long72 = localTime61.getLong((java.time.temporal.TemporalField) chronoField69);
        boolean boolean73 = isoEra55.isSupported((java.time.temporal.TemporalField) chronoField69);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery74 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period75 = isoEra55.query(periodTemporalQuery74);
        boolean boolean76 = period75.isNegative();
        java.time.Period period78 = period75.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField79 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean80 = period75.equals((java.lang.Object) chronoField79);
        boolean boolean81 = localDate49.isSupported((java.time.temporal.TemporalField) chronoField79);
        java.time.temporal.TemporalUnit temporalUnit82 = chronoField79.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime83 = localDateChronoLocalDateTime46.plus(1L, temporalUnit82);
        java.time.LocalTime localTime84 = localTime41.truncatedTo(temporalUnit82);
        boolean boolean85 = instant20.isSupported(temporalUnit82);
        java.time.LocalDateTime localDateTime86 = localDateTime6.plus(3L, temporalUnit82);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime87 = isoChronology2.zonedDateTime((java.time.temporal.TemporalAccessor) localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 2022-02-21T09:43:17.476 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(isoChronology2);
        org.junit.Assert.assertNotNull(eraList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISO" + "'", str4, "ISO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISO" + "'", str5, "ISO");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(fileTime15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField36.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3601000000001L + "'", long39 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + month45 + "' != '" + java.time.Month.NOVEMBER + "'", month45.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime46);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + isoEra55 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra55.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertTrue("'" + chronoField69 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField69.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 3601000000001L + "'", long72 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery74);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertTrue("'" + chronoField79 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField79.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit82 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit82.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime83);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(localDateTime86);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        int int4 = period0.getDays();
        org.joda.time.MutablePeriod mutablePeriod5 = period0.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod5.copy();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) days7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 3, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.Interval interval13 = property12.toInterval();
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) interval13);
        org.joda.time.MutableInterval mutableInterval15 = interval13.toMutableInterval();
        java.lang.String str16 = interval13.toString();
        org.joda.time.Chronology chronology17 = interval13.getChronology();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z" + "'", str16, "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z");
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.hoursIn(readableInterval0);
        org.joda.time.Hours hours3 = hours1.multipliedBy((int) (byte) 0);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, chronology5);
        org.joda.time.LocalTime localTime8 = localTime6.minusMillis(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.monthOfYear();
        boolean boolean10 = localTime8.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int12 = localTime8.indexOf(dateTimeFieldType11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 0, chronology14);
        org.joda.time.LocalTime localTime17 = localTime15.minusMillis(2022);
        org.joda.time.LocalTime localTime19 = localTime15.plusMillis((int) (byte) 0);
        org.joda.time.LocalTime localTime20 = localTime8.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.LocalTime localTime22 = localTime8.plusSeconds(32769);
        org.joda.time.LocalTime localTime24 = localTime22.minusHours(292269054);
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours29 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay26, (org.joda.time.ReadablePartial) timeOfDay28);
        org.joda.time.LocalTime localTime30 = localTime24.plus((org.joda.time.ReadablePeriod) hours29);
        org.joda.time.Duration duration31 = hours29.toStandardDuration();
        org.joda.time.Hours hours33 = hours29.dividedBy(7);
        boolean boolean34 = hours3.isGreaterThan(hours29);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        int int1 = offsetDateTime0.getDayOfMonth();
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.withMinute((int) (byte) 10);
        int int4 = offsetDateTime0.getMinute();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(offsetDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 43 + "'", int4 == 43);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.Date date7 = new java.util.Date();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromDateFields(date7);
        gregorianCalendar5.setGregorianChange(date7);
        int int10 = gregorianCalendar5.getWeekYear();
        java.lang.String str11 = gregorianCalendar5.getCalendarType();
        java.lang.String str12 = gregorianCalendar5.getCalendarType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 21 09:43:17 UTC 2022");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 353 + "'", int10 == 353);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "gregory" + "'", str11, "gregory");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "gregory" + "'", str12, "gregory");
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) days7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 3, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.Interval interval13 = property12.toInterval();
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) interval13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = duration17.toPeriodTo(readableInstant18, periodType19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(readableInstant21, readableInstant22);
        long long24 = duration23.getMillis();
        boolean boolean25 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 3, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((java.lang.Object) dateTime28, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime28.toMutableDateTime();
        mutableDateTime32.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime32.dayOfWeek();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.year();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.weekyear();
        boolean boolean38 = duration17.equals((java.lang.Object) mutableDateTime32);
        mutableDateTime32.addMonths((int) ' ');
        mutableDateTime32.add((long) (byte) 10);
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.Period period44 = period43.normalizedStandard();
        org.joda.time.Period period46 = period43.plusHours(2);
        java.time.chrono.IsoEra isoEra47 = java.time.chrono.IsoEra.CE;
        boolean boolean48 = period46.equals((java.lang.Object) isoEra47);
        int int49 = period46.getMinutes();
        mutableDateTime32.add((org.joda.time.ReadablePeriod) period46);
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone53);
        long long57 = dateTimeZone53.convertLocalToUTC((long) 3, false);
        long long60 = dateTimeZone53.convertLocalToUTC(0L, true);
        mutableDateTime32.setZoneRetainFields(dateTimeZone53);
        java.lang.String str62 = dateTimeZone53.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology63 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField64 = ethiopicChronology63.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone65 = ethiopicChronology63.getZone();
        org.joda.time.DateTimeField dateTimeField66 = ethiopicChronology63.era();
        org.joda.time.DateTimeField dateTimeField67 = ethiopicChronology63.secondOfDay();
        org.joda.time.DateTimeField dateTimeField68 = ethiopicChronology63.minuteOfHour();
        org.joda.time.DurationField durationField69 = ethiopicChronology63.months();
        org.joda.time.DateTimeField dateTimeField70 = ethiopicChronology63.monthOfYear();
        org.joda.time.DateTimeField dateTimeField71 = ethiopicChronology63.hourOfHalfday();
        mutableInterval8.setChronology((org.joda.time.Chronology) ethiopicChronology63);
        org.joda.time.DateTime dateTime73 = mutableInterval8.getEnd();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + isoEra47 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra47.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 3L + "'", long57 == 3L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Etc/UTC" + "'", str62, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTime73);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 0, chronology3);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.monthOfYear();
        org.joda.time.Period period9 = new org.joda.time.Period(3601000000001L, periodType1, chronology5);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(readableInstant11, readableInstant12);
        org.joda.time.Seconds seconds14 = duration13.toStandardSeconds();
        int int15 = seconds14.getSeconds();
        org.joda.time.Seconds seconds17 = seconds14.dividedBy(28);
        org.joda.time.Seconds seconds18 = seconds17.negated();
        org.joda.time.DurationFieldType durationFieldType19 = seconds18.getFieldType();
        boolean boolean20 = mutablePeriod10.isSupported(durationFieldType19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = duration23.toPeriodTo(readableInstant24, periodType25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = new org.joda.time.Duration(readableInstant27, readableInstant28);
        long long30 = duration29.getMillis();
        boolean boolean31 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 3, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfYear();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((java.lang.Object) dateTime34, chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime34.toMutableDateTime();
        mutableDateTime38.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime38.dayOfWeek();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime38.year();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.weekyear();
        boolean boolean44 = duration23.equals((java.lang.Object) mutableDateTime38);
        mutableDateTime38.addMonths((int) ' ');
        mutableDateTime38.add((long) (byte) 10);
        org.joda.time.Period period49 = org.joda.time.Period.ZERO;
        org.joda.time.Period period50 = period49.normalizedStandard();
        org.joda.time.Period period52 = period49.plusHours(2);
        java.time.chrono.IsoEra isoEra53 = java.time.chrono.IsoEra.CE;
        boolean boolean54 = period52.equals((java.lang.Object) isoEra53);
        int int55 = period52.getMinutes();
        mutableDateTime38.add((org.joda.time.ReadablePeriod) period52);
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone59);
        long long63 = dateTimeZone59.convertLocalToUTC((long) 3, false);
        long long66 = dateTimeZone59.convertLocalToUTC(0L, true);
        mutableDateTime38.setZoneRetainFields(dateTimeZone59);
        java.lang.String str68 = dateTimeZone59.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology69 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField70 = ethiopicChronology69.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone71 = ethiopicChronology69.getZone();
        org.joda.time.DateTimeField dateTimeField72 = ethiopicChronology69.era();
        org.joda.time.DateTimeField dateTimeField73 = ethiopicChronology69.secondOfDay();
        org.joda.time.DateTimeField dateTimeField74 = ethiopicChronology69.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField75 = ethiopicChronology69.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField76 = ethiopicChronology69.weekyear();
        org.joda.time.Chronology chronology77 = ethiopicChronology69.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay78 = new org.joda.time.TimeOfDay((java.lang.Object) mutablePeriod10, (org.joda.time.Chronology) ethiopicChronology69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + isoEra53 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra53.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 3L + "'", long63 == 3L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Etc/UTC" + "'", str68, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(chronology77);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap2 = strMap0.headMap("Optional.empty");
        java.util.Optional<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>> strMapOptional3 = java.util.Optional.ofNullable(strMap2);
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMapOptional3);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.year();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        mutableDateTime6.setZone(dateTimeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        int int16 = timeZone14.getOffset((long) (byte) -1);
        java.util.Locale locale19 = new java.util.Locale("PT0S", "2022-02-21T09:34:06.670Z");
        java.util.GregorianCalendar gregorianCalendar20 = new java.util.GregorianCalendar(timeZone14, locale19);
        int int21 = gregorianCalendar20.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals(locale19.toString(), "pt0s_2022-02-21T09:34:06.670Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer2 = longBuffer1.mark();
        java.time.LocalTime localTime7 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime7);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime11 = localTime7.with((java.time.temporal.TemporalField) chronoField9, (long) (short) 1);
        java.time.Duration duration13 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime14 = localTime7.minus((java.time.temporal.TemporalAmount) duration13);
        boolean boolean15 = longBuffer1.equals((java.lang.Object) localTime7);
        java.nio.LongBuffer longBuffer16 = longBuffer1.slice();
        boolean boolean17 = longBuffer1.hasArray();
        int int18 = longBuffer1.remaining();
        java.nio.LongBuffer longBuffer19 = longBuffer1.compact();
        java.nio.LongBuffer longBuffer21 = java.nio.LongBuffer.allocate((int) (short) 0);
        long[] longArray22 = longBuffer21.array();
        java.nio.LongBuffer longBuffer23 = java.nio.LongBuffer.wrap(longArray22);
        long[] longArray24 = longBuffer23.array();
        java.nio.LongBuffer longBuffer25 = longBuffer19.put(longArray24);
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField9.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longBuffer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(longBuffer19);
        org.junit.Assert.assertNotNull(longBuffer21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertNotNull(longBuffer23);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertNotNull(longBuffer25);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean3 = offsetDateTime1.isSupported((java.time.temporal.TemporalField) chronoField2);
        java.time.Month month4 = offsetDateTime1.getMonth();
        java.time.LocalDate localDate6 = java.time.LocalDate.of(10800000, month4, 9);
        java.time.Month month8 = month4.minus((-3155241599900L));
        java.time.format.TextStyle textStyle9 = java.time.format.TextStyle.SHORT_STANDALONE;
        java.time.format.TextStyle textStyle10 = textStyle9.asStandalone();
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale locale14 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList16);
        org.joda.time.Period period19 = org.joda.time.Period.ZERO;
        org.joda.time.Period period20 = period19.normalizedStandard();
        org.joda.time.Period period22 = period19.plusHours(2);
        java.time.chrono.IsoEra isoEra23 = java.time.chrono.IsoEra.CE;
        boolean boolean24 = period22.equals((java.lang.Object) isoEra23);
        java.time.LocalTime localTime29 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime30 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime29);
        java.time.LocalTime localTime35 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime36 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime35);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime39 = localTime35.with((java.time.temporal.TemporalField) chronoField37, (long) (short) 1);
        long long40 = localTime29.getLong((java.time.temporal.TemporalField) chronoField37);
        boolean boolean41 = isoEra23.isSupported((java.time.temporal.TemporalField) chronoField37);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery42 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period43 = isoEra23.query(periodTemporalQuery42);
        boolean boolean44 = period43.isNegative();
        java.time.Period period46 = period43.plusDays((long) ' ');
        boolean boolean47 = period43.isNegative();
        java.time.Period period49 = period43.minusYears((long) 10);
        int int50 = localeList18.lastIndexOf((java.lang.Object) period43);
        java.util.Iterator<java.util.Locale> localeItor51 = localeList18.iterator();
        java.util.Set<java.lang.String> strSet52 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream53 = strSet52.parallelStream();
        boolean boolean55 = strSet52.remove((java.lang.Object) 0);
        boolean boolean56 = localeList18.retainAll((java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale58 = java.util.Locale.GERMANY;
        java.lang.String str59 = locale57.getDisplayScript(locale58);
        boolean boolean60 = localeList18.add(locale57);
        java.lang.String str61 = month4.getDisplayName(textStyle9, locale57);
        int int62 = month4.minLength();
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField2.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.FEBRUARY + "'", month4.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + month8 + "' != '" + java.time.Month.OCTOBER + "'", month8.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle9.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle10.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + isoEra23 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra23.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField37.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3601000000001L + "'", long40 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(localeItor51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(strStream53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u4e8c\u6708" + "'", str61, "\u4e8c\u6708");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 28 + "'", int62 == 28);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.Month month1 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime2 = localDateTime0.with((java.time.temporal.TemporalAdjuster) month1);
        java.time.Month month4 = month1.plus(2592000000L);
        java.time.Month month6 = month4.plus(6552109211L);
        int int8 = month6.firstDayOfYear(false);
        java.util.GregorianCalendar gregorianCalendar14 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int15 = gregorianCalendar14.getWeeksInWeekYear();
        java.lang.String str16 = gregorianCalendar14.getCalendarType();
        java.time.ZonedDateTime zonedDateTime17 = gregorianCalendar14.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime19 = zonedDateTime17.minusMonths((long) 10);
        java.time.ZonedDateTime zonedDateTime21 = zonedDateTime19.withNano(52);
        java.time.LocalTime localTime26 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime26);
        long long28 = localTime27.toNanoOfDay();
        java.util.GregorianCalendar gregorianCalendar34 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int35 = gregorianCalendar34.getWeeksInWeekYear();
        java.lang.String str36 = gregorianCalendar34.getCalendarType();
        java.time.ZonedDateTime zonedDateTime37 = gregorianCalendar34.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime39 = zonedDateTime37.minusMonths((long) 10);
        java.time.temporal.Temporal temporal40 = localTime27.adjustInto((java.time.temporal.Temporal) zonedDateTime39);
        java.time.LocalDateTime localDateTime41 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime43 = localDateTime41.minusYears((long) (byte) 10);
        java.time.LocalDateTime localDateTime44 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime46 = localDateTime44.minusYears((long) (byte) 10);
        boolean boolean47 = localDateTime41.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime46);
        java.time.OffsetTime offsetTime48 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime49 = offsetTime48.toLocalTime();
        java.time.OffsetTime offsetTime50 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime51 = offsetTime50.toLocalTime();
        java.lang.String str52 = offsetTime50.toString();
        java.time.Duration duration53 = java.time.Duration.ZERO;
        java.lang.String str54 = duration53.toString();
        java.time.OffsetTime offsetTime55 = offsetTime50.plus((java.time.temporal.TemporalAmount) duration53);
        java.time.OffsetTime offsetTime57 = offsetTime50.plusNanos((long) 0);
        java.time.LocalTime localTime62 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime63 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime62);
        java.time.temporal.ChronoField chronoField64 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime66 = localTime62.with((java.time.temporal.TemporalField) chronoField64, (long) (short) 1);
        java.util.Locale locale67 = java.util.Locale.GERMANY;
        java.lang.String str68 = chronoField64.getDisplayName(locale67);
        java.time.OffsetTime offsetTime70 = offsetTime57.with((java.time.temporal.TemporalField) chronoField64, (long) 28);
        long long71 = localTime49.getLong((java.time.temporal.TemporalField) chronoField64);
        java.time.temporal.TemporalUnit temporalUnit72 = chronoField64.getRangeUnit();
        boolean boolean73 = localDateTime41.isSupported(temporalUnit72);
        java.time.ZonedDateTime zonedDateTime74 = zonedDateTime39.truncatedTo(temporalUnit72);
        boolean boolean75 = zonedDateTime21.isEqual((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime39);
        java.time.temporal.ChronoField chronoField76 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange77 = zonedDateTime39.range((java.time.temporal.TemporalField) chronoField76);
        boolean boolean78 = month6.isSupported((java.time.temporal.TemporalField) chronoField76);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.NOVEMBER + "'", month1.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime2);
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.NOVEMBER + "'", month4.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.OCTOBER + "'", month6.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 274 + "'", int8 == 274);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "gregory" + "'", str16, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3601000000001L + "'", long28 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "gregory" + "'", str36, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime37);
        org.junit.Assert.assertNotNull(zonedDateTime39);
        org.junit.Assert.assertNotNull(temporal40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(offsetTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(offsetTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "23:59:59.999999999-18:00" + "'", str52, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PT0S" + "'", str54, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime55);
        org.junit.Assert.assertNotNull(offsetTime57);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertTrue("'" + chronoField64 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField64.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NanoOfDay" + "'", str68, "NanoOfDay");
        org.junit.Assert.assertNotNull(offsetTime70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 86399999999999L + "'", long71 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit72 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit72.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(zonedDateTime74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + chronoField76 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField76.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        boolean boolean5 = period3.equals((java.lang.Object) isoEra4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime20 = localTime16.with((java.time.temporal.TemporalField) chronoField18, (long) (short) 1);
        long long21 = localTime10.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean22 = isoEra4.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery23 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period24 = isoEra4.query(periodTemporalQuery23);
        boolean boolean25 = period24.isNegative();
        java.time.Period period27 = period24.plusDays((long) ' ');
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) 0, chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 3, chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfYear();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((java.lang.Object) dateTime33, chronology35);
        org.joda.time.DateTime dateTime37 = localTime30.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean38 = period27.equals((java.lang.Object) localTime30);
        org.joda.time.Period period40 = org.joda.time.Period.hours((int) (short) 1);
        org.joda.time.LocalTime localTime42 = localTime30.withPeriodAdded((org.joda.time.ReadablePeriod) period40, 4);
        org.joda.time.LocalTime localTime44 = localTime30.withMillisOfSecond((int) '4');
        org.joda.time.LocalTime.Property property45 = localTime30.millisOfDay();
        org.joda.time.LocalTime localTime47 = property45.addNoWrapToCopy(10);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3601000000001L + "'", long21 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime47);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery1 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period2 = localDateTime0.query(periodTemporalQuery1);
        java.time.chrono.IsoChronology isoChronology3 = period2.getChronology();
        java.time.Clock clock4 = java.time.Clock.systemUTC();
        java.time.Duration duration6 = java.time.Duration.ofSeconds((long) 256);
        java.time.Clock clock7 = java.time.Clock.tick(clock4, duration6);
        java.time.Duration duration9 = java.time.Duration.ofMinutes((long) 3);
        java.time.Duration duration10 = duration9.abs();
        java.time.Clock clock11 = java.time.Clock.offset(clock4, duration9);
        java.time.LocalDate localDate12 = java.time.LocalDate.now(clock11);
        java.time.LocalDate localDate13 = isoChronology3.dateNow(clock11);
        java.lang.String str14 = isoChronology3.toString();
        java.time.format.DateTimeFormatter dateTimeFormatter15 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str16 = dateTimeFormatter15.toString();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery18 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period19 = localDateTime17.query(periodTemporalQuery18);
        java.text.Format format20 = dateTimeFormatter15.toFormat(periodTemporalQuery18);
        java.time.chrono.Chronology chronology21 = dateTimeFormatter15.getChronology();
        java.time.format.DateTimeFormatter dateTimeFormatter22 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str23 = dateTimeFormatter22.toString();
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery25 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period26 = localDateTime24.query(periodTemporalQuery25);
        java.text.Format format27 = dateTimeFormatter22.toFormat(periodTemporalQuery25);
        java.time.chrono.Chronology chronology28 = dateTimeFormatter22.getChronology();
        int int29 = chronology21.compareTo(chronology28);
        java.util.List<java.time.chrono.Era> eraList30 = chronology28.eras();
        java.time.ZoneOffset zoneOffset33 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate34 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset33);
        java.time.Clock clock35 = java.time.Clock.system((java.time.ZoneId) zoneOffset33);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate39 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset38);
        java.time.Clock clock40 = java.time.Clock.system((java.time.ZoneId) zoneOffset38);
        int int41 = zoneOffset33.compareTo(zoneOffset38);
        java.time.chrono.ChronoLocalDate chronoLocalDate42 = chronology28.dateNow((java.time.ZoneId) zoneOffset38);
        java.time.chrono.IsoEra isoEra43 = java.time.chrono.IsoEra.CE;
        int int44 = isoEra43.getValue();
        int int45 = isoEra43.getValue();
        int int47 = chronology28.prolepticYear((java.time.chrono.Era) isoEra43, 0);
        java.time.LocalDate localDate50 = isoChronology3.dateYearDay((java.time.chrono.Era) isoEra43, 59, 11);
        java.time.LocalDate localDate53 = isoChronology3.dateYearDay(32769, 5);
        java.time.LocalDate localDate55 = isoChronology3.dateEpochDay((long) 189);
        java.time.Period period57 = java.time.Period.ofYears(28);
        java.time.chrono.IsoChronology isoChronology58 = period57.getChronology();
        java.time.LocalDate localDate60 = isoChronology58.dateEpochDay((long) 3601);
        java.time.chrono.ChronoPeriod chronoPeriod61 = localDate55.until((java.time.chrono.ChronoLocalDate) localDate60);
        int int62 = localDate60.lengthOfMonth();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(periodTemporalQuery1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(isoChronology3);
        org.junit.Assert.assertNotNull(clock4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISO" + "'", str14, "ISO");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]" + "'", str16, "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(periodTemporalQuery18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]" + "'", str23, "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(periodTemporalQuery25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(format27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(eraList30);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(clock35);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(clock40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(chronoLocalDate42);
        org.junit.Assert.assertTrue("'" + isoEra43 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra43.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(isoChronology58);
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(chronoPeriod61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 30 + "'", int62 == 30);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        java.security.Provider provider0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "halfdays", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Iterator<java.lang.String> strItor9 = strList7.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator10 = strList7.spliterator();
        boolean boolean11 = strList7.isEmpty();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = java.time.ZoneId.SHORT_IDS;
        boolean boolean14 = strMap12.containsValue((java.lang.Object) "2022-02-21T09:34:23.848Z");
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.Period period17 = period16.normalizedStandard();
        org.joda.time.Period period19 = period16.plusHours(2);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        int int21 = period16.indexOf(durationFieldType20);
        mutablePeriod15.add(durationFieldType20, (int) (short) -1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) 0, chronology26);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.monthOfYear();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 1, chronology28);
        org.joda.time.DurationField durationField33 = durationFieldType20.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField34 = chronology28.year();
        boolean boolean35 = strMap12.equals((java.lang.Object) dateTimeField34);
        boolean boolean36 = strMap12.isEmpty();
        java.util.Collection<java.lang.String> strCollection37 = strMap12.values();
        // The following exception was thrown during execution in test generation
        try {
            java.security.Provider.Service service38 = new java.security.Provider.Service(provider0, "1970-02-02", "Mi", "20", (java.util.List<java.lang.String>) strList7, strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strCollection37);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Interval interval1 = localDate0.toInterval();
        int int2 = localDate0.getDayOfYear();
        int int3 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate5 = localDate0.withYearOfCentury((int) ':');
        int int6 = localDate5.getMonthOfYear();
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit8 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean9 = weeks7.equals((java.lang.Object) timeUnit8);
        org.joda.time.Weeks weeks10 = weeks7.negated();
        org.joda.time.Weeks weeks12 = weeks10.plus((int) (short) 1);
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit14 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean15 = weeks13.equals((java.lang.Object) timeUnit14);
        org.joda.time.Weeks weeks16 = weeks13.negated();
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit18 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean19 = weeks17.equals((java.lang.Object) timeUnit18);
        org.joda.time.Weeks weeks20 = weeks17.negated();
        org.joda.time.Weeks weeks21 = weeks16.minus(weeks20);
        org.joda.time.Weeks weeks22 = weeks10.minus(weeks20);
        org.joda.time.DurationFieldType durationFieldType23 = weeks10.getFieldType();
        org.joda.time.LocalDate localDate25 = localDate5.withFieldAdded(durationFieldType23, 189);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = localDate25.withDayOfMonth(1728000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1728000 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(timeUnit8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(timeUnit14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(timeUnit18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant1 = java.time.Instant.now();
        boolean boolean2 = instant0.isAfter(instant1);
        java.time.Instant instant3 = java.time.Instant.now();
        java.time.Instant instant4 = java.time.Instant.now();
        boolean boolean5 = instant3.isAfter(instant4);
        java.time.LocalDate localDate7 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int8 = localDate7.getMonthValue();
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.Period period12 = period9.plusHours(2);
        java.time.chrono.IsoEra isoEra13 = java.time.chrono.IsoEra.CE;
        boolean boolean14 = period12.equals((java.lang.Object) isoEra13);
        java.time.LocalTime localTime19 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime19);
        java.time.LocalTime localTime25 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime26 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime25);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime29 = localTime25.with((java.time.temporal.TemporalField) chronoField27, (long) (short) 1);
        long long30 = localTime19.getLong((java.time.temporal.TemporalField) chronoField27);
        boolean boolean31 = isoEra13.isSupported((java.time.temporal.TemporalField) chronoField27);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery32 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period33 = isoEra13.query(periodTemporalQuery32);
        boolean boolean34 = period33.isNegative();
        java.time.Period period36 = period33.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean38 = period33.equals((java.lang.Object) chronoField37);
        boolean boolean39 = localDate7.isSupported((java.time.temporal.TemporalField) chronoField37);
        java.time.temporal.TemporalUnit temporalUnit40 = chronoField37.getRangeUnit();
        java.time.Instant instant41 = instant4.truncatedTo(temporalUnit40);
        boolean boolean42 = instant0.isAfter(instant4);
        java.util.Date date43 = java.util.Date.from(instant0);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + isoEra13 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra13.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField27.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3601000000001L + "'", long30 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField37.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit40 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit40.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Mon Feb 21 09:43:17 UTC 2022");
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        boolean boolean7 = mutableDateTime6.isBeforeNow();
        mutableDateTime6.addHours(70);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 0, chronology11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 3, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((java.lang.Object) dateTime15, chronology17);
        org.joda.time.DateTime dateTime19 = localTime12.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime21 = dateTime15.plusYears((int) 'a');
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime6, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 3, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.DateTimeField dateTimeField28 = property26.getField();
        org.joda.time.DateTime dateTime30 = property26.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime32 = property26.setCopy(34);
        org.joda.time.DateTime dateTime34 = dateTime32.plusHours(70);
        org.joda.time.DateTime dateTime36 = dateTime34.withWeekyear(624);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 3, chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.dayOfYear();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((java.lang.Object) dateTime40, chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime40.toMutableDateTime();
        mutableDateTime44.addYears((int) (short) 100);
        org.joda.time.Period period47 = org.joda.time.Period.ZERO;
        org.joda.time.TimeOfDay timeOfDay49 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay51 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours52 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay49, (org.joda.time.ReadablePartial) timeOfDay51);
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay51.withFieldAdded(durationFieldType53, (int) (byte) 0);
        org.joda.time.Period period57 = period47.withFieldAdded(durationFieldType53, 4);
        mutableDateTime44.add((org.joda.time.ReadablePeriod) period47);
        mutableDateTime44.addMonths(1970);
        mutableDateTime44.addMonths(6);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime44.dayOfWeek();
        mutableDateTime44.setMillis((long) 0);
        org.joda.time.DurationFieldType durationFieldType66 = org.joda.time.DurationFieldType.halfdays();
        java.lang.String str67 = durationFieldType66.toString();
        mutableDateTime44.add(durationFieldType66, (int) (byte) 0);
        java.util.TimeZone timeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        mutableDateTime44.setZoneRetainFields(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = dateTime36.withZoneRetainFields(dateTimeZone71);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "halfdays" + "'", str67, "halfdays");
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(dateTime73);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(6);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        org.joda.time.Duration duration11 = duration8.plus((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekOfWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withCenturyOfEra(10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = duration19.toPeriodTo(readableInstant20, periodType21);
        long long23 = duration19.getStandardSeconds();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 3, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfYear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((java.lang.Object) dateTime26, chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight29.withDayOfYear((int) ' ');
        org.joda.time.Interval interval34 = duration19.toIntervalTo((org.joda.time.ReadableInstant) dateMidnight33);
        long long35 = duration19.getStandardSeconds();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime16.minus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(readableInstant37, readableInstant38);
        org.joda.time.Duration duration41 = duration39.withMillis((-1L));
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Duration duration43 = duration39.minus(readableDuration42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 3, chronology45);
        org.joda.time.DateTime.Property property47 = dateTime46.dayOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((java.lang.Object) dateTime46, chronology48);
        org.joda.time.DateMidnight.Property property50 = dateMidnight49.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight51 = property50.getDateMidnight();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration43, (org.joda.time.ReadableInstant) dateMidnight51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = new org.joda.time.Duration(readableInstant53, readableInstant54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = duration55.toPeriodTo(readableInstant56, periodType57);
        long long59 = duration55.getStandardSeconds();
        boolean boolean60 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration55);
        boolean boolean61 = duration19.isEqual((org.joda.time.ReadableDuration) duration43);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = new org.joda.time.Duration(readableInstant62, readableInstant63);
        org.joda.time.Duration duration66 = duration64.withMillis((-1L));
        org.joda.time.Duration duration68 = duration66.minus((long) 2097);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) 3, chronology70);
        org.joda.time.DateTime.Property property72 = dateTime71.dayOfYear();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight((java.lang.Object) dateTime71, chronology73);
        org.joda.time.DateMidnight.Property property75 = dateMidnight74.dayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration66, (org.joda.time.ReadableInstant) dateMidnight74);
        boolean boolean77 = duration43.isLongerThan((org.joda.time.ReadableDuration) duration66);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateMidnight51);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        java.nio.ByteOrder byteOrder8 = byteBuffer7.order();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        java.nio.ShortBuffer shortBuffer10 = shortBuffer9.slice();
        boolean boolean11 = shortBuffer10.hasArray();
        java.nio.ShortBuffer shortBuffer12 = shortBuffer10.duplicate();
        short[] shortArray15 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer16 = java.nio.ShortBuffer.wrap(shortArray15);
        short[] shortArray19 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer20 = java.nio.ShortBuffer.wrap(shortArray19);
        java.nio.ShortBuffer shortBuffer21 = shortBuffer16.put(shortBuffer20);
        short[] shortArray22 = shortBuffer16.array();
        java.nio.ShortBuffer shortBuffer23 = java.nio.ShortBuffer.wrap(shortArray22);
        int int24 = shortBuffer10.compareTo(shortBuffer23);
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertNotNull(shortBuffer21);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.withDayOfYear((int) ' ');
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.monthOfYear();
        org.joda.time.DateTime dateTime14 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateMidnight12);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        java.io.File file2 = java.io.File.createTempFile("PT3600S", "secondOfMinute");
        java.io.File file3 = file2.getCanonicalFile();
        java.io.File file4 = file3.getAbsoluteFile();
        java.io.PrintStream printStream5 = new java.io.PrintStream(file3);
        printStream5.close();
        java.nio.charset.Charset charset7 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder8 = charset7.newDecoder();
        java.nio.charset.Charset charset9 = java.nio.charset.Charset.defaultCharset();
        boolean boolean10 = charset7.contains(charset9);
        java.nio.charset.CharsetEncoder charsetEncoder11 = charset7.newEncoder();
        byte[] byteArray12 = charsetEncoder11.replacement();
        java.nio.charset.Charset charset13 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder14 = charset13.newDecoder();
        float float15 = charsetDecoder14.maxCharsPerByte();
        float float16 = charsetDecoder14.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction17 = charsetDecoder14.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder18 = charsetEncoder11.onUnmappableCharacter(codingErrorAction17);
        java.nio.charset.Charset charset19 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder20 = charset19.newDecoder();
        java.nio.charset.Charset charset21 = java.nio.charset.Charset.defaultCharset();
        boolean boolean22 = charset19.contains(charset21);
        java.nio.charset.CharsetEncoder charsetEncoder23 = charset19.newEncoder();
        byte[] byteArray24 = charsetEncoder23.replacement();
        java.nio.charset.CharsetEncoder charsetEncoder25 = charsetEncoder11.replaceWith(byteArray24);
        printStream5.write(byteArray24, 0, 20);
        printStream5.println("96000000");
        java.io.PrintStream printStream32 = printStream5.append('\000');
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/tmp/PT3600S4933852489369208533secondOfMinute");
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/PT3600S4933852489369208533secondOfMinute");
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file4.toString(), "/tmp/PT3600S4933852489369208533secondOfMinute");
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(charsetDecoder8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[63]");
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(charsetDecoder14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction17);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(charsetDecoder20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[63]");
        org.junit.Assert.assertNotNull(charsetEncoder25);
        org.junit.Assert.assertNotNull(printStream32);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) days7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 3, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.Interval interval13 = property12.toInterval();
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) interval13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = duration17.toPeriodTo(readableInstant18, periodType19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(readableInstant21, readableInstant22);
        long long24 = duration23.getMillis();
        boolean boolean25 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 3, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((java.lang.Object) dateTime28, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime28.toMutableDateTime();
        mutableDateTime32.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime32.dayOfWeek();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.year();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.weekyear();
        boolean boolean38 = duration17.equals((java.lang.Object) mutableDateTime32);
        mutableDateTime32.addMonths((int) ' ');
        mutableDateTime32.add((long) (byte) 10);
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.Period period44 = period43.normalizedStandard();
        org.joda.time.Period period46 = period43.plusHours(2);
        java.time.chrono.IsoEra isoEra47 = java.time.chrono.IsoEra.CE;
        boolean boolean48 = period46.equals((java.lang.Object) isoEra47);
        int int49 = period46.getMinutes();
        mutableDateTime32.add((org.joda.time.ReadablePeriod) period46);
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone53);
        long long57 = dateTimeZone53.convertLocalToUTC((long) 3, false);
        long long60 = dateTimeZone53.convertLocalToUTC(0L, true);
        mutableDateTime32.setZoneRetainFields(dateTimeZone53);
        java.lang.String str62 = dateTimeZone53.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology63 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField64 = ethiopicChronology63.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone65 = ethiopicChronology63.getZone();
        org.joda.time.DateTimeField dateTimeField66 = ethiopicChronology63.era();
        org.joda.time.DateTimeField dateTimeField67 = ethiopicChronology63.secondOfDay();
        org.joda.time.DateTimeField dateTimeField68 = ethiopicChronology63.minuteOfHour();
        org.joda.time.DurationField durationField69 = ethiopicChronology63.months();
        org.joda.time.DateTimeField dateTimeField70 = ethiopicChronology63.monthOfYear();
        org.joda.time.DateTimeField dateTimeField71 = ethiopicChronology63.hourOfHalfday();
        mutableInterval8.setChronology((org.joda.time.Chronology) ethiopicChronology63);
        org.joda.time.DurationField durationField73 = ethiopicChronology63.weekyears();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + isoEra47 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra47.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 3L + "'", long57 == 3L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Etc/UTC" + "'", str62, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(durationField73);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime1 = offsetTime0.toLocalTime();
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.LocalTime localTime19 = localTime6.withSecond((int) (short) 1);
        int int20 = localTime19.getMinute();
        java.time.LocalTime localTime22 = localTime19.plusHours((long) (-1));
        java.time.OffsetTime offsetTime23 = offsetTime0.with((java.time.temporal.TemporalAdjuster) localTime19);
        java.time.OffsetTime offsetTime25 = offsetTime0.minusHours((long) 3);
        java.time.OffsetTime offsetTime27 = offsetTime0.minusMinutes((long) 101);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime29 = offsetTime27.withHour(32);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime27);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = timeOfDay2.getFieldType((int) (short) 0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 0, chronology6);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay2.withChronologyRetainFields(chronology8);
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology8);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 0, chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 3, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((java.lang.Object) dateTime19, chronology21);
        org.joda.time.DateTime dateTime23 = localTime16.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime27 = dateTime23.withYearOfCentury((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.hourOfDay();
        org.joda.time.DateTime dateTime30 = dateTime27.plus((long) 3600000);
        org.joda.time.DateTime dateTime33 = dateTime30.withDurationAdded((long) 366, (int) '#');
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.lang.String str36 = dateTime30.toString("70", locale35);
        java.lang.String str37 = dateTimeField12.getAsText((long) 32769, locale35);
        java.util.GregorianCalendar gregorianCalendar38 = new java.util.GregorianCalendar(locale35);
        java.util.TimeZone timeZone39 = gregorianCalendar38.getTimeZone();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "70" + "'", str36, "70");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "24" + "'", str37, "24");
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = new java.util.Properties(properties4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime20 = localTime16.with((java.time.temporal.TemporalField) chronoField18, (long) (short) 1);
        long long21 = localTime10.getLong((java.time.temporal.TemporalField) chronoField18);
        java.time.LocalTime localTime23 = localTime10.withSecond((int) (short) 1);
        java.lang.Object obj25 = properties5.put((java.lang.Object) localTime23, (java.lang.Object) "117");
        java.lang.Object obj26 = properties5.clone();
        properties5.clear();
        properties5.clear();
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate32 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset31);
        java.time.Clock clock33 = java.time.Clock.system((java.time.ZoneId) zoneOffset31);
        short[] shortArray36 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer37 = java.nio.ShortBuffer.wrap(shortArray36);
        short[] shortArray40 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer41 = java.nio.ShortBuffer.wrap(shortArray40);
        java.nio.ShortBuffer shortBuffer42 = shortBuffer37.put(shortBuffer41);
        short[] shortArray45 = new short[] { (byte) 0, (short) 1 };
        java.nio.ShortBuffer shortBuffer46 = java.nio.ShortBuffer.wrap(shortArray45);
        short[] shortArray49 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer50 = java.nio.ShortBuffer.wrap(shortArray49);
        short[] shortArray53 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer54 = java.nio.ShortBuffer.wrap(shortArray53);
        java.nio.ShortBuffer shortBuffer55 = shortBuffer50.put(shortBuffer54);
        int int56 = shortBuffer55.limit();
        boolean boolean57 = shortBuffer55.isReadOnly();
        java.nio.ShortBuffer shortBuffer58 = shortBuffer46.put(shortBuffer55);
        boolean boolean59 = shortBuffer58.hasArray();
        int int60 = shortBuffer41.compareTo(shortBuffer58);
        java.nio.ShortBuffer shortBuffer61 = shortBuffer41.slice();
        boolean boolean62 = properties5.remove((java.lang.Object) zoneOffset31, (java.lang.Object) shortBuffer61);
        java.time.ZoneId zoneId63 = zoneOffset31.normalized();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime64 = java.time.OffsetTime.of(70, 97, (int) ':', 21, zoneOffset31);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 70");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3601000000001L + "'", long21 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "{01:00:01.000000001=117}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "{01:00:01.000000001=117}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "{01:00:01.000000001=117}");
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(clock33);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer37);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer41);
        org.junit.Assert.assertNotNull(shortBuffer42);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[0, 1]");
        org.junit.Assert.assertNotNull(shortBuffer46);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer50);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer54);
        org.junit.Assert.assertNotNull(shortBuffer55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(shortBuffer58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-2) + "'", int60 == (-2));
        org.junit.Assert.assertNotNull(shortBuffer61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zoneId63);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.nio.LongBuffer longBuffer3 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer4 = longBuffer3.mark();
        boolean boolean5 = properties1.containsKey((java.lang.Object) longBuffer3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = java.time.ZoneId.SHORT_IDS;
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean8 = strMap6.containsValue((java.lang.Object) dateTimeFieldType7);
        properties1.putAll(strMap6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withWeekyear(10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.millisOfSecond();
        java.lang.String str19 = strMap6.get((java.lang.Object) localDateTime13);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntrySet20 = strMap6.entrySet();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 3, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((java.lang.Object) dateTime23, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime23.toMutableDateTime();
        mutableDateTime27.addYears((int) (short) 100);
        mutableDateTime27.setMillis((long) 21);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.hourOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 3, chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.dayOfYear();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((java.lang.Object) dateTime37, chronology39);
        org.joda.time.DateMidnight.Property property41 = dateMidnight40.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight42 = property41.roundCeilingCopy();
        int int43 = dateMidnight42.getHourOfDay();
        int int44 = dateMidnight42.getCenturyOfEra();
        java.lang.String str45 = dateMidnight42.toString();
        mutableDateTime33.setMillis((org.joda.time.ReadableInstant) dateMidnight42);
        boolean boolean47 = strMap6.containsKey((java.lang.Object) mutableDateTime33);
        java.util.Properties properties48 = null;
        java.util.Properties properties49 = new java.util.Properties(properties48);
        java.nio.LongBuffer longBuffer51 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer52 = longBuffer51.mark();
        boolean boolean53 = properties49.containsKey((java.lang.Object) longBuffer51);
        java.util.Map<java.lang.String, java.lang.String> strMap54 = java.time.ZoneId.SHORT_IDS;
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean56 = strMap54.containsValue((java.lang.Object) dateTimeFieldType55);
        properties49.putAll(strMap54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.withWeekyear(10);
        org.joda.time.LocalDateTime.Property property66 = localDateTime61.millisOfSecond();
        java.lang.String str67 = strMap54.get((java.lang.Object) localDateTime61);
        java.time.temporal.ChronoField chronoField68 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        java.time.OffsetTime offsetTime69 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime70 = offsetTime69.toLocalTime();
        java.lang.String str71 = offsetTime69.toString();
        java.time.temporal.ValueRange valueRange72 = chronoField68.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetTime69);
        boolean boolean73 = strMap54.equals((java.lang.Object) chronoField68);
        java.lang.Object obj74 = null;
        boolean boolean75 = strMap54.equals(obj74);
        // The following exception was thrown during execution in test generation
        try {
            strMap6.putAll(strMap54);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strEntrySet20);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 19 + "'", int44 == 19);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str45, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(longBuffer51);
        org.junit.Assert.assertNotNull(buffer52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + chronoField68 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField68.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertNotNull(offsetTime69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "23:59:59.999999999-18:00" + "'", str71, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(valueRange72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(38);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withFieldAdded(durationFieldType5, (int) (byte) 0);
        int int8 = timeOfDay3.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay3.plusHours(9);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay3.secondOfMinute();
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate15 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset14);
        boolean boolean16 = property11.equals((java.lang.Object) localDate15);
        java.lang.String str17 = localDate15.toString();
        java.time.OffsetTime offsetTime18 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime19 = offsetTime18.toLocalTime();
        java.lang.String str20 = offsetTime18.toString();
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime22 = offsetTime21.toLocalTime();
        boolean boolean23 = offsetTime18.isBefore(offsetTime21);
        java.time.LocalTime localTime28 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime29 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime28);
        java.time.LocalTime localTime34 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime35 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime34);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime38 = localTime34.with((java.time.temporal.TemporalField) chronoField36, (long) (short) 1);
        long long39 = localTime28.getLong((java.time.temporal.TemporalField) chronoField36);
        java.time.LocalTime localTime41 = localTime28.withSecond((int) (short) 1);
        int int42 = localTime41.getMinute();
        java.time.OffsetTime offsetTime43 = offsetTime21.with((java.time.temporal.TemporalAdjuster) localTime41);
        java.time.LocalDate localDate45 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime46 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime47 = offsetTime46.toLocalTime();
        java.lang.String str48 = offsetTime46.toString();
        java.time.Duration duration49 = java.time.Duration.ZERO;
        java.lang.String str50 = duration49.toString();
        java.time.OffsetTime offsetTime51 = offsetTime46.plus((java.time.temporal.TemporalAmount) duration49);
        java.time.LocalTime localTime52 = offsetTime46.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime53 = localDate45.atTime(localTime52);
        java.time.LocalDate localDate55 = localDate45.minusWeeks((long) 2097);
        java.time.OffsetTime offsetTime56 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime57 = offsetTime56.toLocalTime();
        java.lang.String str58 = offsetTime56.toString();
        java.time.Duration duration59 = java.time.Duration.ZERO;
        java.lang.String str60 = duration59.toString();
        java.time.OffsetTime offsetTime61 = offsetTime56.plus((java.time.temporal.TemporalAmount) duration59);
        java.time.OffsetTime offsetTime63 = offsetTime56.plusNanos((long) 0);
        java.time.LocalTime localTime68 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime69 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime68);
        java.time.temporal.ChronoField chronoField70 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime72 = localTime68.with((java.time.temporal.TemporalField) chronoField70, (long) (short) 1);
        java.util.Locale locale73 = java.util.Locale.GERMANY;
        java.lang.String str74 = chronoField70.getDisplayName(locale73);
        java.time.OffsetTime offsetTime76 = offsetTime63.with((java.time.temporal.TemporalField) chronoField70, (long) 28);
        java.time.OffsetDateTime offsetDateTime77 = localDate55.atTime(offsetTime63);
        int int78 = localDate55.getYear();
        java.time.OffsetDateTime offsetDateTime79 = offsetTime43.atDate(localDate55);
        boolean boolean80 = localDate15.isEqual((java.time.chrono.ChronoLocalDate) localDate55);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate82 = localDate55.withDayOfMonth(120);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 120");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022-02-21" + "'", str17, "2022-02-21");
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "23:59:59.999999999-18:00" + "'", str20, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField36.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3601000000001L + "'", long39 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(offsetTime43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "23:59:59.999999999-18:00" + "'", str48, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT0S" + "'", str50, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(offsetTime56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "23:59:59.999999999-18:00" + "'", str58, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT0S" + "'", str60, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime61);
        org.junit.Assert.assertNotNull(offsetTime63);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertTrue("'" + chronoField70 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField70.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "NanoOfDay" + "'", str74, "NanoOfDay");
        org.junit.Assert.assertNotNull(offsetTime76);
        org.junit.Assert.assertNotNull(offsetDateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1929 + "'", int78 == 1929);
        org.junit.Assert.assertNotNull(offsetDateTime79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        float float2 = charsetDecoder1.maxCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction3 = java.nio.charset.CodingErrorAction.IGNORE;
        java.nio.charset.CharsetDecoder charsetDecoder4 = charsetDecoder1.onMalformedInput(codingErrorAction3);
        float float5 = charsetDecoder1.maxCharsPerByte();
        java.nio.charset.Charset charset6 = charsetDecoder1.charset();
        java.nio.charset.Charset charset7 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder8 = charset7.newDecoder();
        java.nio.charset.Charset charset9 = java.nio.charset.Charset.defaultCharset();
        boolean boolean10 = charset7.contains(charset9);
        java.nio.charset.CharsetEncoder charsetEncoder11 = charset7.newEncoder();
        byte[] byteArray12 = charsetEncoder11.replacement();
        java.nio.charset.Charset charset13 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder14 = charset13.newDecoder();
        float float15 = charsetDecoder14.maxCharsPerByte();
        float float16 = charsetDecoder14.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction17 = charsetDecoder14.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder18 = charsetEncoder11.onUnmappableCharacter(codingErrorAction17);
        java.nio.charset.Charset charset19 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder20 = charset19.newDecoder();
        java.nio.charset.Charset charset21 = java.nio.charset.Charset.defaultCharset();
        boolean boolean22 = charset19.contains(charset21);
        java.nio.charset.CharsetEncoder charsetEncoder23 = charset19.newEncoder();
        char[] charArray24 = new char[] {};
        java.nio.CharBuffer charBuffer25 = java.nio.CharBuffer.wrap(charArray24);
        java.nio.ByteBuffer byteBuffer26 = charsetEncoder23.encode(charBuffer25);
        java.nio.CharBuffer charBuffer27 = charBuffer25.slice();
        java.nio.ByteBuffer byteBuffer28 = charsetEncoder18.encode(charBuffer27);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer28.asReadOnlyBuffer();
        java.nio.CharBuffer charBuffer30 = charsetDecoder1.decode(byteBuffer28);
        java.util.stream.IntStream intStream31 = charBuffer30.chars();
        java.util.stream.IntStream intStream32 = intStream31.sequential();
        java.util.stream.IntStream intStream33 = intStream32.parallel();
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction3);
        org.junit.Assert.assertNotNull(charsetDecoder4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(charsetDecoder8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[63]");
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(charsetDecoder14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction17);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(charsetDecoder20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertNotNull(charBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(charBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(charBuffer30);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNotNull(intStream33);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition(8);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Duration duration2 = java.time.Duration.ofSeconds((long) 256);
        java.time.Clock clock3 = java.time.Clock.tick(clock0, duration2);
        java.time.Duration duration5 = java.time.Duration.ofMinutes((long) 3);
        java.time.Duration duration6 = duration5.abs();
        java.time.Clock clock7 = java.time.Clock.offset(clock0, duration5);
        java.time.LocalDate localDate8 = java.time.LocalDate.now(clock7);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime12 = offsetTime11.toLocalTime();
        java.lang.String str13 = offsetTime11.toString();
        java.time.Duration duration14 = java.time.Duration.ZERO;
        java.lang.String str15 = duration14.toString();
        java.time.OffsetTime offsetTime16 = offsetTime11.plus((java.time.temporal.TemporalAmount) duration14);
        java.time.LocalTime localTime17 = offsetTime11.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime18 = localDate10.atTime(localTime17);
        java.time.LocalDate localDate20 = localDate10.minusWeeks((long) 2097);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime22 = offsetTime21.toLocalTime();
        java.lang.String str23 = offsetTime21.toString();
        java.time.Duration duration24 = java.time.Duration.ZERO;
        java.lang.String str25 = duration24.toString();
        java.time.OffsetTime offsetTime26 = offsetTime21.plus((java.time.temporal.TemporalAmount) duration24);
        java.time.OffsetTime offsetTime28 = offsetTime21.plusNanos((long) 0);
        java.time.LocalTime localTime33 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime34 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime33);
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime37 = localTime33.with((java.time.temporal.TemporalField) chronoField35, (long) (short) 1);
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.lang.String str39 = chronoField35.getDisplayName(locale38);
        java.time.OffsetTime offsetTime41 = offsetTime28.with((java.time.temporal.TemporalField) chronoField35, (long) 28);
        java.time.OffsetDateTime offsetDateTime42 = localDate20.atTime(offsetTime28);
        int int43 = localDate20.getYear();
        boolean boolean44 = localDate8.isBefore((java.time.chrono.ChronoLocalDate) localDate20);
        int int45 = localDate8.lengthOfMonth();
        int int46 = localDate8.getDayOfYear();
        java.util.GregorianCalendar gregorianCalendar52 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int53 = gregorianCalendar52.getWeeksInWeekYear();
        java.lang.String str54 = gregorianCalendar52.getCalendarType();
        java.time.ZonedDateTime zonedDateTime55 = gregorianCalendar52.toZonedDateTime();
        java.util.GregorianCalendar gregorianCalendar61 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int62 = gregorianCalendar61.getWeeksInWeekYear();
        java.lang.String str63 = gregorianCalendar61.getCalendarType();
        java.time.ZonedDateTime zonedDateTime64 = gregorianCalendar61.toZonedDateTime();
        int int65 = zonedDateTime55.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime64);
        java.time.ZonedDateTime zonedDateTime67 = zonedDateTime55.plusDays((long) 2022);
        java.time.Instant instant68 = zonedDateTime55.toInstant();
        java.time.chrono.Chronology chronology69 = zonedDateTime55.getChronology();
        java.util.GregorianCalendar gregorianCalendar75 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int76 = gregorianCalendar75.getWeeksInWeekYear();
        java.lang.String str77 = gregorianCalendar75.getCalendarType();
        java.time.ZonedDateTime zonedDateTime78 = gregorianCalendar75.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime80 = zonedDateTime78.minusMonths((long) 10);
        boolean boolean81 = zonedDateTime55.isBefore((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime80);
        java.time.OffsetDateTime offsetDateTime82 = java.time.OffsetDateTime.from((java.time.temporal.TemporalAccessor) zonedDateTime55);
        java.time.temporal.ChronoField chronoField83 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        java.time.OffsetDateTime offsetDateTime85 = offsetDateTime82.with((java.time.temporal.TemporalField) chronoField83, (long) 17);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal87 = localDate8.with((java.time.temporal.TemporalField) chronoField83, 1645436569272L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for AlignedWeekOfYear (valid values 1 - 53): 1645436569272");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23:59:59.999999999-18:00" + "'", str13, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0S" + "'", str15, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "23:59:59.999999999-18:00" + "'", str23, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT0S" + "'", str25, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField35.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NanoOfDay" + "'", str39, "NanoOfDay");
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertNotNull(offsetDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1929 + "'", int43 == 1929);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 28 + "'", int45 == 28);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 52 + "'", int53 == 52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "gregory" + "'", str54, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime55);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "gregory" + "'", str63, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime67);
        org.junit.Assert.assertNotNull(instant68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 52 + "'", int76 == 52);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "gregory" + "'", str77, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime78);
        org.junit.Assert.assertNotNull(zonedDateTime80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(offsetDateTime82);
        org.junit.Assert.assertTrue("'" + chronoField83 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField83.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
        org.junit.Assert.assertNotNull(offsetDateTime85);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime1 = offsetTime0.toLocalTime();
        java.lang.String str2 = offsetTime0.toString();
        java.time.Duration duration3 = java.time.Duration.ZERO;
        java.lang.String str4 = duration3.toString();
        java.time.OffsetTime offsetTime5 = offsetTime0.plus((java.time.temporal.TemporalAmount) duration3);
        java.time.OffsetTime offsetTime7 = offsetTime0.plusNanos((long) 0);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = chronoField14.getDisplayName(locale17);
        java.time.OffsetTime offsetTime20 = offsetTime7.with((java.time.temporal.TemporalField) chronoField14, (long) 28);
        org.joda.time.Period period21 = org.joda.time.Period.ZERO;
        org.joda.time.Period period22 = period21.normalizedStandard();
        org.joda.time.Period period24 = period21.plusHours(2);
        java.time.chrono.IsoEra isoEra25 = java.time.chrono.IsoEra.CE;
        boolean boolean26 = period24.equals((java.lang.Object) isoEra25);
        java.time.LocalTime localTime31 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime32 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime31);
        java.time.LocalTime localTime37 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime38 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime37);
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime41 = localTime37.with((java.time.temporal.TemporalField) chronoField39, (long) (short) 1);
        long long42 = localTime31.getLong((java.time.temporal.TemporalField) chronoField39);
        boolean boolean43 = isoEra25.isSupported((java.time.temporal.TemporalField) chronoField39);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery44 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period45 = isoEra25.query(periodTemporalQuery44);
        boolean boolean46 = period45.isNegative();
        java.time.Period period48 = period45.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField49 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean50 = period45.equals((java.lang.Object) chronoField49);
        java.time.chrono.ChronoPeriod chronoPeriod51 = period45.negated();
        java.time.OffsetTime offsetTime52 = offsetTime7.minus((java.time.temporal.TemporalAmount) period45);
        java.time.OffsetDateTime offsetDateTime53 = java.time.OffsetDateTime.MAX;
        java.time.temporal.Temporal temporal54 = period45.addTo((java.time.temporal.Temporal) offsetDateTime53);
        java.time.format.FormatStyle formatStyle55 = java.time.format.FormatStyle.LONG;
        java.time.format.FormatStyle formatStyle56 = java.time.format.FormatStyle.LONG;
        java.time.format.DateTimeFormatter dateTimeFormatter57 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle55, formatStyle56);
        java.time.format.DateTimeFormatter dateTimeFormatter58 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle55);
        java.time.format.DateTimeFormatter dateTimeFormatter59 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle55);
        java.time.format.DateTimeFormatter dateTimeFormatter60 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle55);
        java.lang.String str61 = null; // flaky: offsetDateTime53.format(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23:59:59.999999999-18:00" + "'", str2, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NanoOfDay" + "'", str18, "NanoOfDay");
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + isoEra25 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra25.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField39.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3601000000001L + "'", long42 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + chronoField49 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField49.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(chronoPeriod51);
        org.junit.Assert.assertNotNull(offsetTime52);
        org.junit.Assert.assertNotNull(offsetDateTime53);
        org.junit.Assert.assertNotNull(temporal54);
        org.junit.Assert.assertTrue("'" + formatStyle55 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle55.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertTrue("'" + formatStyle56 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle56.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u4e0b\u5348\u65f6\u5206\u79d2" + "'", str61, "\u4e0b\u5348\u65f6\u5206\u79d2");
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.withDayOfYear((int) ' ');
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.monthOfYear();
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = duration17.toPeriodTo(readableInstant18, periodType19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(readableInstant21, readableInstant22);
        long long24 = duration23.getMillis();
        boolean boolean25 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Instant instant26 = instant14.minus((org.joda.time.ReadableDuration) duration17);
        int int27 = property13.getDifference((org.joda.time.ReadableInstant) instant14);
        java.lang.String str28 = instant14.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusSeconds(6);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = new org.joda.time.Duration(readableInstant35, readableInstant36);
        long long38 = duration37.getMillis();
        org.joda.time.Duration duration40 = duration37.plus((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime32.minus((org.joda.time.ReadableDuration) duration40);
        int int42 = localDateTime32.getEra();
        org.joda.time.Duration duration44 = org.joda.time.Duration.millis((long) '#');
        org.joda.time.LocalDateTime localDateTime45 = localDateTime32.plus((org.joda.time.ReadableDuration) duration44);
        long long46 = duration44.getStandardSeconds();
        org.joda.time.Instant instant47 = instant14.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.MutableDateTime mutableDateTime48 = instant47.toMutableDateTime();
        mutableDateTime48.addWeeks((-2));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) mutableDateTime48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-624) + "'", int27 == (-624));
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2022-02-21T09:43:18.550Z" + "'", str28, "2022-02-21T09:43:18.550Z");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        byte[] byteArray8 = charsetEncoder4.replacement();
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[63]");
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime3 = offsetTime2.toLocalTime();
        java.lang.String str4 = offsetTime2.toString();
        java.time.Duration duration5 = java.time.Duration.ZERO;
        java.lang.String str6 = duration5.toString();
        java.time.OffsetTime offsetTime7 = offsetTime2.plus((java.time.temporal.TemporalAmount) duration5);
        java.time.LocalTime localTime8 = offsetTime2.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime9 = localDate1.atTime(localTime8);
        java.time.LocalDate localDate11 = localDate1.minusWeeks((long) 2097);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone14);
        long long18 = dateTimeZone14.convertLocalToUTC((long) 3, false);
        long long21 = dateTimeZone14.convertLocalToUTC(0L, true);
        boolean boolean22 = localDate1.equals((java.lang.Object) true);
        int int23 = localDate1.lengthOfMonth();
        java.time.LocalDate localDate26 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int27 = localDate26.getMonthValue();
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Period period31 = period28.plusHours(2);
        java.time.chrono.IsoEra isoEra32 = java.time.chrono.IsoEra.CE;
        boolean boolean33 = period31.equals((java.lang.Object) isoEra32);
        java.time.LocalTime localTime38 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime39 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime38);
        java.time.LocalTime localTime44 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime45 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime44);
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime48 = localTime44.with((java.time.temporal.TemporalField) chronoField46, (long) (short) 1);
        long long49 = localTime38.getLong((java.time.temporal.TemporalField) chronoField46);
        boolean boolean50 = isoEra32.isSupported((java.time.temporal.TemporalField) chronoField46);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery51 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period52 = isoEra32.query(periodTemporalQuery51);
        boolean boolean53 = period52.isNegative();
        java.time.Period period55 = period52.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField56 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean57 = period52.equals((java.lang.Object) chronoField56);
        boolean boolean58 = localDate26.isSupported((java.time.temporal.TemporalField) chronoField56);
        java.time.temporal.TemporalUnit temporalUnit59 = chronoField56.getRangeUnit();
        java.time.chrono.ChronoLocalDate chronoLocalDate60 = localDate1.minus((long) (-1), temporalUnit59);
        java.time.format.DateTimeFormatter dateTimeFormatter61 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str62 = dateTimeFormatter61.toString();
        java.time.LocalDateTime localDateTime63 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery64 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period65 = localDateTime63.query(periodTemporalQuery64);
        java.text.Format format66 = dateTimeFormatter61.toFormat(periodTemporalQuery64);
        java.time.Period period67 = chronoLocalDate60.query(periodTemporalQuery64);
        java.time.chrono.ChronoPeriod chronoPeriod68 = period67.negated();
        boolean boolean69 = period67.isNegative();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23:59:59.999999999-18:00" + "'", str4, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 28 + "'", int23 == 28);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + isoEra32 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra32.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField46.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 3601000000001L + "'", long49 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + chronoField56 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField56.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit59 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit59.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(chronoLocalDate60);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]" + "'", str62, "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(periodTemporalQuery64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(format66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(chronoPeriod68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight5.withDayOfYear((int) ' ');
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths(1024);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.year();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.minusMonths(7);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.centuryOfEra();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 3, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((java.lang.Object) dateTime18, chronology20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight23 = property22.roundCeilingCopy();
        int int24 = dateMidnight23.getHourOfDay();
        int int25 = dateMidnight23.getCenturyOfEra();
        java.lang.String str26 = dateMidnight23.toString();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight23.withDayOfYear((int) '0');
        boolean boolean30 = dateMidnight28.isBefore((-14400000L));
        org.joda.time.Weeks weeks31 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateMidnight14, (org.joda.time.ReadableInstant) dateMidnight28);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 19 + "'", int25 == 19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str26, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(weeks31);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(100L, chronology1);
        java.lang.String str3 = localTime2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00:00:00.100" + "'", str3, "00:00:00.100");
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        long long6 = duration2.getStandardSeconds();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 3, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((java.lang.Object) dateTime9, chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight12.withDayOfYear((int) ' ');
        org.joda.time.Interval interval17 = duration2.toIntervalTo((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight16.dayOfYear();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = new org.joda.time.Duration(readableInstant19, readableInstant20);
        org.joda.time.Duration duration23 = duration21.withMillis((-1L));
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 3, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfYear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((java.lang.Object) dateTime26, chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight29.withDayOfYear((int) ' ');
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period35 = duration23.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight29, periodType34);
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardHours((long) 1);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight29.plus((org.joda.time.ReadableDuration) duration37);
        long long39 = duration37.getMillis();
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardMinutes((long) 292269054);
        boolean boolean42 = duration37.isLongerThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight16, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 3, chronology45);
        org.joda.time.DateTime.Property property47 = dateTime46.dayOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((java.lang.Object) dateTime46, chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime46.toMutableDateTime();
        mutableDateTime50.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime50.dayOfWeek();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime50.year();
        mutableDateTime50.addMonths((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime50.era();
        boolean boolean58 = interval43.equals((java.lang.Object) property57);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3600000L + "'", long39 == 3600000L);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "1970-01-01T00:00:00.003Z");
        boolean boolean3 = file2.exists();
        boolean boolean4 = file2.mkdirs();
        java.net.URI uRI5 = file2.toURI();
        java.lang.String str6 = file2.getName();
        boolean boolean7 = file2.delete();
        java.nio.file.Path path8 = file2.toPath();
        java.nio.file.FileSystem fileSystem9 = path8.getFileSystem();
        java.nio.file.spi.FileSystemProvider fileSystemProvider10 = fileSystem9.provider();
        java.io.File file11 = null;
        java.io.File file13 = new java.io.File(file11, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL14 = file13.toURL();
        boolean boolean15 = file13.canRead();
        java.nio.file.Path path16 = file13.toPath();
        java.nio.file.Path path17 = path16.toAbsolutePath();
        java.io.File file18 = path17.toFile();
        java.io.File file19 = null;
        java.io.File file21 = new java.io.File(file19, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL22 = file21.toURL();
        boolean boolean23 = file21.canRead();
        java.nio.file.Path path24 = file21.toPath();
        java.nio.file.Path path25 = path24.toAbsolutePath();
        java.io.File file26 = null;
        java.io.File file28 = new java.io.File(file26, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL29 = file28.toURL();
        boolean boolean30 = file28.canRead();
        java.nio.file.Path path31 = file28.toPath();
        java.nio.file.Path path32 = path31.toAbsolutePath();
        java.io.File file33 = path32.toFile();
        boolean boolean34 = path24.endsWith(path32);
        java.io.File file35 = null;
        java.io.File file37 = new java.io.File(file35, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL38 = file37.toURL();
        boolean boolean39 = file37.canRead();
        java.nio.file.Path path40 = file37.toPath();
        java.nio.file.Path path41 = path40.toAbsolutePath();
        boolean boolean42 = path24.endsWith(path40);
        int int43 = path17.compareTo(path40);
        java.nio.file.Path path44 = path17.toAbsolutePath();
        java.io.File file45 = null;
        java.io.File file47 = new java.io.File(file45, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL48 = file47.toURL();
        boolean boolean49 = file47.canRead();
        java.nio.file.Path path50 = file47.toPath();
        java.nio.file.Path path51 = path50.toAbsolutePath();
        java.io.File file52 = null;
        java.io.File file54 = new java.io.File(file52, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL55 = file54.toURL();
        boolean boolean56 = file54.canRead();
        java.nio.file.Path path57 = file54.toPath();
        java.nio.file.Path path58 = path57.toAbsolutePath();
        java.io.File file59 = path58.toFile();
        boolean boolean60 = path50.endsWith(path58);
        java.io.File file61 = null;
        java.io.File file63 = new java.io.File(file61, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL64 = file63.toURL();
        boolean boolean65 = file63.canRead();
        java.nio.file.Path path66 = file63.toPath();
        java.nio.file.Path path67 = path66.toAbsolutePath();
        boolean boolean68 = path50.endsWith(path66);
        java.lang.String str69 = path50.toString();
        boolean boolean71 = path50.startsWith("ISOChronology[UTC]");
        java.nio.file.CopyOption copyOption72 = null;
        java.nio.file.CopyOption[] copyOptionArray73 = new java.nio.file.CopyOption[] { copyOption72 };
        // The following exception was thrown during execution in test generation
        try {
            fileSystemProvider10.copy(path44, path50, copyOptionArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.003Z" + "'", str6, "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(path8);
        org.junit.Assert.assertNotNull(fileSystem9);
        org.junit.Assert.assertNotNull(fileSystemProvider10);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL14);
// flaky:         org.junit.Assert.assertEquals(uRL14.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(path17);
        org.junit.Assert.assertNotNull(file18);
// flaky:         org.junit.Assert.assertEquals(file18.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file18.toString(), "/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNull("file21.getParent() == null", file21.getParent());
        org.junit.Assert.assertEquals(file21.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL22);
// flaky:         org.junit.Assert.assertEquals(uRL22.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(path24);
        org.junit.Assert.assertNotNull(path25);
        org.junit.Assert.assertNull("file28.getParent() == null", file28.getParent());
        org.junit.Assert.assertEquals(file28.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL29);
// flaky:         org.junit.Assert.assertEquals(uRL29.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(path31);
        org.junit.Assert.assertNotNull(path32);
        org.junit.Assert.assertNotNull(file33);
// flaky:         org.junit.Assert.assertEquals(file33.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file33.toString(), "/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull("file37.getParent() == null", file37.getParent());
        org.junit.Assert.assertEquals(file37.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL38);
// flaky:         org.junit.Assert.assertEquals(uRL38.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(path40);
        org.junit.Assert.assertNotNull(path41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2) + "'", int43 == (-2));
        org.junit.Assert.assertNotNull(path44);
        org.junit.Assert.assertNull("file47.getParent() == null", file47.getParent());
        org.junit.Assert.assertEquals(file47.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL48);
// flaky:         org.junit.Assert.assertEquals(uRL48.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(path50);
        org.junit.Assert.assertNotNull(path51);
        org.junit.Assert.assertNull("file54.getParent() == null", file54.getParent());
        org.junit.Assert.assertEquals(file54.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL55);
// flaky:         org.junit.Assert.assertEquals(uRL55.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(path57);
        org.junit.Assert.assertNotNull(path58);
        org.junit.Assert.assertNotNull(file59);
// flaky:         org.junit.Assert.assertEquals(file59.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file59.toString(), "/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull("file63.getParent() == null", file63.getParent());
        org.junit.Assert.assertEquals(file63.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL64);
// flaky:         org.junit.Assert.assertEquals(uRL64.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(path66);
        org.junit.Assert.assertNotNull(path67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1970-01-01T00:00:00.003Z" + "'", str69, "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(copyOptionArray73);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.parallelStream();
        java.lang.Object[] objArray2 = strSet0.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator3 = strSet0.spliterator();
        java.util.Set<java.lang.String> strSet4 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream5 = strSet4.parallelStream();
        boolean boolean7 = strSet4.remove((java.lang.Object) 0);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime19 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime18);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime22 = localTime18.with((java.time.temporal.TemporalField) chronoField20, (long) (short) 1);
        long long23 = localTime12.getLong((java.time.temporal.TemporalField) chronoField20);
        java.time.LocalTime localTime25 = localTime12.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange27 = localTime25.range((java.time.temporal.TemporalField) chronoField26);
        boolean boolean28 = strSet4.remove((java.lang.Object) chronoField26);
        boolean boolean29 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet4);
        boolean boolean30 = strSet4.isEmpty();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(strSpliterator3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3601000000001L + "'", long23 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField26.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "1970-01-01T00:00:00.003Z");
        java.net.URL uRL3 = file2.toURL();
        boolean boolean6 = file2.setExecutable(true, false);
        long long7 = file2.getFreeSpace();
        long long8 = file2.lastModified();
        long long9 = file2.length();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertNotNull(uRL3);
// flaky:         org.junit.Assert.assertEquals(uRL3.toString(), "file:/experiment/1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 3, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((java.lang.Object) dateTime9, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime9.toMutableDateTime();
        mutableDateTime13.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.dayOfWeek();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.year();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        mutableDateTime13.setZone(dateTimeZone19);
        java.util.Locale locale22 = java.util.Locale.TAIWAN;
        java.lang.String str23 = dateTimeZone19.getShortName((long) 64, locale22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 3, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfYear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((java.lang.Object) dateTime26, chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime26.toMutableDateTime();
        mutableDateTime30.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime30.dayOfWeek();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime30.year();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        mutableDateTime30.setZone(dateTimeZone36);
        java.util.Locale locale39 = java.util.Locale.TAIWAN;
        java.lang.String str40 = dateTimeZone36.getShortName((long) 64, locale39);
        long long42 = dateTimeZone19.getMillisKeepLocal(dateTimeZone36, (long) 64);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(dateTimeZone19);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology45 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone19);
        int int47 = dateTimeZone19.getOffsetFromLocal(0L);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((int) '2', 1969, 20, 64, 733000000, 2922789, 11, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 64 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 64L + "'", long42 == 64L);
        org.junit.Assert.assertNotNull(ethiopicChronology45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        java.net.URI uRI1 = new java.net.URI("hi!");
        java.lang.String str2 = uRI1.getRawAuthority();
        java.lang.String str3 = uRI1.toString();
        java.lang.String str4 = uRI1.getUserInfo();
        java.io.OutputStream outputStream5 = null;
        java.io.FilterOutputStream filterOutputStream6 = new java.io.FilterOutputStream(outputStream5);
        byte[] byteArray8 = new byte[] { (byte) 100 };
        filterOutputStream6.write(byteArray8, (int) (byte) 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray8);
        java.nio.LongBuffer longBuffer13 = byteBuffer12.asLongBuffer();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.duplicate();
        boolean boolean15 = uRI1.equals((java.lang.Object) byteBuffer12);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer12.asDoubleBuffer();
        java.util.stream.IntStream intStream18 = java.util.stream.IntStream.of((int) '/');
        java.util.OptionalInt optionalInt19 = intStream18.min();
        short[] shortArray22 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer23 = java.nio.ShortBuffer.wrap(shortArray22);
        short[] shortArray26 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer27 = java.nio.ShortBuffer.wrap(shortArray26);
        java.nio.ShortBuffer shortBuffer28 = shortBuffer23.put(shortBuffer27);
        int int29 = shortBuffer28.limit();
        boolean boolean30 = shortBuffer28.isReadOnly();
        boolean boolean31 = optionalInt19.equals((java.lang.Object) shortBuffer28);
        java.nio.ByteOrder byteOrder32 = shortBuffer28.order();
        java.nio.ByteBuffer byteBuffer33 = byteBuffer12.order(byteOrder32);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer36 = byteBuffer33.put((int) 'x', (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(longBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(optionalInt19);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer23);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertNotNull(shortBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteOrder32);
        org.junit.Assert.assertNotNull(byteBuffer33);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        java.io.File file2 = java.io.File.createTempFile("PT3600S", "secondOfMinute");
        java.io.File file3 = file2.getCanonicalFile();
        boolean boolean4 = file3.mkdirs();
        boolean boolean6 = file3.setReadable(false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/tmp/PT3600S1333095862322378262secondOfMinute");
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/PT3600S1333095862322378262secondOfMinute");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        java.net.URI uRI1 = new java.net.URI("hi!");
        java.lang.String str2 = uRI1.getRawAuthority();
        java.lang.String str3 = uRI1.toString();
        java.lang.String str4 = uRI1.getRawFragment();
        java.net.URI uRI6 = new java.net.URI("hi!");
        java.lang.String str7 = uRI6.toASCIIString();
        java.net.URI uRI8 = uRI1.resolve(uRI6);
        java.net.URI uRI9 = uRI1.parseServerAuthority();
        java.net.URI uRI13 = new java.net.URI("x-windows-iso2022jp", "java.nio.charset.CharacterCodingException", "German");
        java.net.URI uRI14 = uRI9.relativize(uRI13);
        java.net.URI uRI16 = new java.net.URI("hi!");
        java.lang.String str17 = uRI16.getRawAuthority();
        java.lang.String str18 = uRI16.toString();
        java.lang.String str19 = uRI16.getRawUserInfo();
        boolean boolean20 = uRI16.isAbsolute();
        java.net.URI uRI21 = uRI13.resolve(uRI16);
        java.net.URI uRI23 = new java.net.URI("hi!");
        java.lang.String str24 = uRI23.getRawAuthority();
        java.lang.String str25 = uRI23.toString();
        java.lang.String str26 = uRI23.getRawUserInfo();
        java.io.File file27 = null;
        java.io.File file29 = new java.io.File(file27, "1970-01-01T00:00:00.003Z");
        boolean boolean30 = file29.exists();
        boolean boolean31 = file29.mkdirs();
        java.net.URI uRI32 = file29.toURI();
        java.net.URI uRI33 = uRI23.relativize(uRI32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = duration36.toPeriodTo(readableInstant37, periodType38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = new org.joda.time.Duration(readableInstant40, readableInstant41);
        long long43 = duration42.getMillis();
        boolean boolean44 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) 3, chronology46);
        org.joda.time.DateTime.Property property48 = dateTime47.dayOfYear();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((java.lang.Object) dateTime47, chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime47.toMutableDateTime();
        mutableDateTime51.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime51.dayOfWeek();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime51.year();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.weekyear();
        boolean boolean57 = duration36.equals((java.lang.Object) mutableDateTime51);
        mutableDateTime51.addMonths((int) ' ');
        mutableDateTime51.add((long) (byte) 10);
        org.joda.time.Period period62 = org.joda.time.Period.ZERO;
        org.joda.time.Period period63 = period62.normalizedStandard();
        org.joda.time.Period period65 = period62.plusHours(2);
        java.time.chrono.IsoEra isoEra66 = java.time.chrono.IsoEra.CE;
        boolean boolean67 = period65.equals((java.lang.Object) isoEra66);
        int int68 = period65.getMinutes();
        mutableDateTime51.add((org.joda.time.ReadablePeriod) period65);
        java.util.TimeZone timeZone71 = null;
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forTimeZone(timeZone71);
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone72);
        long long76 = dateTimeZone72.convertLocalToUTC((long) 3, false);
        long long79 = dateTimeZone72.convertLocalToUTC(0L, true);
        mutableDateTime51.setZoneRetainFields(dateTimeZone72);
        java.lang.String str81 = dateTimeZone72.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology82 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone72);
        org.joda.time.DateTimeField dateTimeField83 = ethiopicChronology82.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone84 = ethiopicChronology82.getZone();
        org.joda.time.DateTimeField dateTimeField85 = ethiopicChronology82.era();
        org.joda.time.DateTimeField dateTimeField86 = ethiopicChronology82.secondOfDay();
        org.joda.time.DateTimeField dateTimeField87 = ethiopicChronology82.minuteOfHour();
        org.joda.time.DurationField durationField88 = ethiopicChronology82.months();
        org.joda.time.DateTimeField dateTimeField89 = ethiopicChronology82.weekyearOfCentury();
        boolean boolean90 = uRI33.equals((java.lang.Object) dateTimeField89);
        int int91 = uRI16.compareTo(uRI33);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(uRI14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(uRI21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull("file29.getParent() == null", file29.getParent());
        org.junit.Assert.assertEquals(file29.toString(), "1970-01-01T00:00:00.003Z");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(uRI32);
        org.junit.Assert.assertNotNull(uRI33);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertTrue("'" + isoEra66 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra66.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 3L + "'", long76 == 3L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Etc/UTC" + "'", str81, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(dateTimeZone84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertNotNull(dateTimeField87);
        org.junit.Assert.assertNotNull(durationField88);
        org.junit.Assert.assertNotNull(dateTimeField89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.stream.IntStream intStream3 = intStream2.parallel();
        java.util.OptionalDouble optionalDouble4 = intStream3.average();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(optionalDouble4);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        boolean boolean5 = period3.equals((java.lang.Object) isoEra4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime20 = localTime16.with((java.time.temporal.TemporalField) chronoField18, (long) (short) 1);
        long long21 = localTime10.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean22 = isoEra4.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery23 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period24 = isoEra4.query(periodTemporalQuery23);
        boolean boolean25 = period24.isNegative();
        java.time.Period period27 = period24.plusDays((long) ' ');
        boolean boolean28 = period24.isNegative();
        java.time.Period period30 = period24.plusDays((long) 574);
        int int31 = period24.getMonths();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3601000000001L + "'", long21 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.lang.Object obj2 = format1.clone();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.dayOfMonth();
        java.lang.String str10 = property9.getAsShortText();
        int int11 = property9.getMinimumValueOverall();
        org.joda.time.DateMidnight dateMidnight12 = property9.getDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = format1.format((java.lang.Object) property9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format target must implement TemporalAccessor");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withFieldAdded(durationFieldType5, (int) (byte) 0);
        int int8 = timeOfDay3.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay3.plusHours(9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = timeOfDay10.toString(dateTimeFormatter13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNull(chronology14);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isLoopbackAddress();
        java.lang.String str2 = inetAddress0.getHostName();
        boolean boolean3 = inetAddress0.isMCGlobal();
        boolean boolean4 = inetAddress0.isMCNodeLocal();
        java.lang.String str5 = inetAddress0.getCanonicalHostName();
        boolean boolean6 = inetAddress0.isAnyLocalAddress();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "599b081c1808" + "'", str2, "599b081c1808");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "599b081c1808" + "'", str5, "599b081c1808");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        byte[] byteArray5 = charsetEncoder4.replacement();
        java.nio.charset.Charset charset6 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder7 = charset6.newDecoder();
        float float8 = charsetDecoder7.maxCharsPerByte();
        float float9 = charsetDecoder7.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction10 = charsetDecoder7.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder11 = charsetEncoder4.onUnmappableCharacter(codingErrorAction10);
        java.nio.charset.Charset charset12 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder13 = charset12.newDecoder();
        java.nio.charset.Charset charset14 = java.nio.charset.Charset.defaultCharset();
        boolean boolean15 = charset12.contains(charset14);
        java.nio.charset.CharsetEncoder charsetEncoder16 = charset12.newEncoder();
        byte[] byteArray17 = charsetEncoder16.replacement();
        java.nio.charset.CharsetEncoder charsetEncoder18 = charsetEncoder4.replaceWith(byteArray17);
        java.nio.charset.Charset charset19 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder20 = charset19.newDecoder();
        java.nio.charset.Charset charset21 = java.nio.charset.Charset.defaultCharset();
        boolean boolean22 = charset19.contains(charset21);
        java.nio.charset.CharsetEncoder charsetEncoder23 = charset19.newEncoder();
        char[] charArray24 = new char[] {};
        java.nio.CharBuffer charBuffer25 = java.nio.CharBuffer.wrap(charArray24);
        java.nio.ByteBuffer byteBuffer26 = charsetEncoder23.encode(charBuffer25);
        java.nio.CharBuffer charBuffer27 = charBuffer25.slice();
        java.nio.CharBuffer charBuffer28 = charBuffer25.compact();
        java.nio.CharBuffer charBuffer29 = charBuffer25.duplicate();
        java.nio.ByteBuffer byteBuffer30 = charsetEncoder4.encode(charBuffer25);
        java.nio.charset.Charset charset31 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder32 = charset31.newDecoder();
        java.nio.charset.Charset charset33 = java.nio.charset.Charset.defaultCharset();
        boolean boolean34 = charset31.contains(charset33);
        java.nio.charset.CharsetEncoder charsetEncoder35 = charset31.newEncoder();
        char[] charArray36 = new char[] {};
        java.nio.CharBuffer charBuffer37 = java.nio.CharBuffer.wrap(charArray36);
        java.nio.ByteBuffer byteBuffer38 = charsetEncoder35.encode(charBuffer37);
        java.nio.CharBuffer charBuffer39 = charBuffer37.slice();
        java.nio.CharBuffer charBuffer40 = charBuffer37.compact();
        java.nio.ByteOrder byteOrder41 = charBuffer37.order();
        java.nio.ByteBuffer byteBuffer43 = java.nio.ByteBuffer.allocate((int) 'a');
        java.nio.charset.Charset charset44 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder45 = charset44.newDecoder();
        float float46 = charsetDecoder45.maxCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction47 = java.nio.charset.CodingErrorAction.IGNORE;
        java.nio.charset.CharsetDecoder charsetDecoder48 = charsetDecoder45.onMalformedInput(codingErrorAction47);
        java.nio.ByteBuffer byteBuffer50 = java.nio.ByteBuffer.allocateDirect(10800000);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer50.asReadOnlyBuffer();
        boolean boolean52 = byteBuffer51.hasArray();
        java.nio.CharBuffer charBuffer53 = charsetDecoder45.decode(byteBuffer51);
        java.nio.charset.Charset charset54 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder55 = charset54.newDecoder();
        java.nio.charset.Charset charset56 = java.nio.charset.Charset.defaultCharset();
        boolean boolean57 = charset54.contains(charset56);
        java.nio.charset.CharsetEncoder charsetEncoder58 = charset54.newEncoder();
        byte[] byteArray59 = charsetEncoder58.replacement();
        java.nio.charset.Charset charset60 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder61 = charset60.newDecoder();
        float float62 = charsetDecoder61.maxCharsPerByte();
        float float63 = charsetDecoder61.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction64 = charsetDecoder61.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder65 = charsetEncoder58.onUnmappableCharacter(codingErrorAction64);
        java.nio.charset.Charset charset66 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder67 = charset66.newDecoder();
        java.nio.charset.Charset charset68 = java.nio.charset.Charset.defaultCharset();
        boolean boolean69 = charset66.contains(charset68);
        java.nio.charset.CharsetEncoder charsetEncoder70 = charset66.newEncoder();
        char[] charArray71 = new char[] {};
        java.nio.CharBuffer charBuffer72 = java.nio.CharBuffer.wrap(charArray71);
        java.nio.ByteBuffer byteBuffer73 = charsetEncoder70.encode(charBuffer72);
        java.nio.CharBuffer charBuffer74 = charBuffer72.slice();
        java.nio.ByteBuffer byteBuffer75 = charsetEncoder65.encode(charBuffer74);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer75.asReadOnlyBuffer();
        int int77 = byteBuffer51.compareTo(byteBuffer75);
        java.nio.LongBuffer longBuffer78 = byteBuffer51.asLongBuffer();
        int int79 = byteBuffer43.compareTo(byteBuffer51);
        java.nio.charset.CoderResult coderResult81 = charsetEncoder4.encode(charBuffer37, byteBuffer43, true);
        java.net.InetAddress inetAddress82 = java.net.InetAddress.getLocalHost();
        java.lang.String str83 = inetAddress82.getCanonicalHostName();
        java.lang.String str84 = inetAddress82.toString();
        byte[] byteArray85 = inetAddress82.getAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.CharsetEncoder charsetEncoder86 = charsetEncoder4.replaceWith(byteArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Replacement too long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[63]");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charsetDecoder7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction10);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(charsetDecoder13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[63]");
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(charsetDecoder20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertNotNull(charBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(charBuffer27);
        org.junit.Assert.assertNotNull(charBuffer28);
        org.junit.Assert.assertNotNull(charBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(charsetDecoder32);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(charsetEncoder35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[]");
        org.junit.Assert.assertNotNull(charBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(charBuffer39);
        org.junit.Assert.assertNotNull(charBuffer40);
        org.junit.Assert.assertNotNull(byteOrder41);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(charsetDecoder45);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.0f + "'", float46 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction47);
        org.junit.Assert.assertNotNull(charsetDecoder48);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(charBuffer53);
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(charsetDecoder55);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charsetEncoder58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[63]");
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertNotNull(charsetDecoder61);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 1.0f + "'", float62 == 1.0f);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 1.0f + "'", float63 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction64);
        org.junit.Assert.assertNotNull(charsetEncoder65);
        org.junit.Assert.assertNotNull(charset66);
        org.junit.Assert.assertNotNull(charsetDecoder67);
        org.junit.Assert.assertNotNull(charset68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(charsetEncoder70);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[]");
        org.junit.Assert.assertNotNull(charBuffer72);
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(charBuffer74);
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(longBuffer78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 97 + "'", int79 == 97);
        org.junit.Assert.assertNotNull(coderResult81);
        org.junit.Assert.assertNotNull(inetAddress82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "599b081c1808" + "'", str83, "599b081c1808");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "599b081c1808/172.17.0.2" + "'", str84, "599b081c1808/172.17.0.2");
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[-84, 17, 0, 2]");
    }
}
