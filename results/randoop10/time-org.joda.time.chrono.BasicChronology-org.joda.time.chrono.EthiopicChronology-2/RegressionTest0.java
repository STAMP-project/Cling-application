import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.security.cert.CertificateException certificateException1 = new java.security.cert.CertificateException("hi!");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.time.ZoneId zoneId0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock1 = java.time.Clock.system(zoneId0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(0, 256, (int) (byte) 0, (int) (byte) -1, (-1), (int) (byte) 100, (int) ' ', dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.time.Month month0 = null;
        java.time.DayOfWeek dayOfWeek2 = null;
        java.time.LocalTime localTime3 = null;
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition5 = null;
        java.time.ZoneOffset zoneOffset6 = null;
        java.time.ZoneOffset zoneOffset7 = null;
        java.time.ZoneOffset zoneOffset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransitionRule zoneOffsetTransitionRule9 = java.time.zone.ZoneOffsetTransitionRule.of(month0, (int) (byte) -1, dayOfWeek2, localTime3, true, timeDefinition5, zoneOffset6, zoneOffset7, zoneOffset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, (int) (byte) 10, 0, (-1), (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(outputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.hoursIn(readableInterval0);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        boolean boolean3 = hours1.isSupported(durationFieldType2);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray1, (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration2 = java.time.Duration.of((long) (byte) 1, temporalUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: unit");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int int0 = org.joda.time.TimeOfDay.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Subject:\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Subject:?' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.time.ZoneOffset zoneOffset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.ofOffset("hi!", zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("Subject:\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: b");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.time.Month month1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of((int) (byte) 10, month1, (int) ' ', 256, (int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime2 = java.time.OffsetTime.parse((java.lang.CharSequence) "Subject:\n", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = isoEra0.get((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: HourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.time.chrono.ChronoLocalDate chronoLocalDate0 = null;
        java.time.chrono.ChronoLocalDate chronoLocalDate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod2 = java.time.chrono.ChronoPeriod.between(chronoLocalDate0, chronoLocalDate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: startDateInclusive");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.fromMillis(10L);
        org.junit.Assert.assertNotNull(fileTime1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.time.ZoneOffset zoneOffset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneRules zoneRules1 = java.time.zone.ZoneRules.of(zoneOffset0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.seconds();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.security.AccessControlContext accessControlContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.Subject subject1 = javax.security.auth.Subject.getSubject(accessControlContext0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: invalid null AccessControlContext provided");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime14 = localTime10.with((java.time.temporal.TemporalField) chronoField12, (long) (short) 1);
        long long15 = localTime4.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.temporal.TemporalAmount temporalAmount16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime17 = localTime4.plus(temporalAmount16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3601000000001L + "'", long15 == 3601000000001L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.time.Month month1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate3 = java.time.LocalDate.of((int) '4', month1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of((int) (byte) 10, (int) (byte) 1, (int) '4', (int) (byte) 10, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.time.ZoneOffset zoneOffset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.ofEpochSecond((long) (-1), 256, zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = java.time.LocalDate.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.of("Subject:\n");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, non numeric characters found: Subject:?");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeOfDay1.toString("", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Hours hours1 = days0.toStandardHours();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray4 = new java.util.Locale[] { locale3 };
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList10 = localeList5.subList(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localeList7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.withEra(6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = property3.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalDate localDate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = localTime4.atDate(localDate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        int int1 = isoEra0.getValue();
        int int2 = isoEra0.getValue();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = isoEra0.get((java.time.temporal.TemporalField) chronoField3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: SecondOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        java.util.Locale locale5 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTime2.toString("", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("halfdays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'halfdays' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.nio.charset.CodingErrorAction codingErrorAction0 = java.nio.charset.CodingErrorAction.REPLACE;
        org.junit.Assert.assertNotNull(codingErrorAction0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.function.LongUnaryOperator longUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream2 = java.util.stream.LongStream.iterate((long) (-1), longUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime2.withHourOfDay((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByName("Subject:\n");
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.LongSummaryStatistics[] longSummaryStatisticsArray0 = new java.util.LongSummaryStatistics[] {};
        java.util.stream.Stream<java.util.LongSummaryStatistics> longSummaryStatisticsStream1 = java.util.stream.Stream.of(longSummaryStatisticsArray0);
        org.junit.Assert.assertNotNull(longSummaryStatisticsArray0);
        org.junit.Assert.assertNotNull(longSummaryStatisticsStream1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfCentury((int) 'a');
        org.joda.time.format.PeriodPrinter periodPrinter9 = null;
        org.joda.time.format.PeriodParser periodParser10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = new org.joda.time.format.PeriodFormatter(periodPrinter9, periodParser10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter11.withParseType(periodType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) timeOfDay3, (org.joda.time.ReadablePartial) localDateTime8, periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodFormatter13);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery0 = java.time.format.DateTimeFormatter.parsedExcessDays();
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((java.lang.Object) periodTemporalQuery0, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.time.format.DateTimeFormatter$$Lambda$65/2014866032");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodTemporalQuery0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withDate((int) '#', (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period1.minusMinutes((int) ' ');
        org.joda.time.Period period5 = period3.minusMonths((int) (byte) 0);
        org.joda.time.format.PeriodPrinter periodPrinter6 = null;
        org.joda.time.format.PeriodParser periodParser7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = new org.joda.time.format.PeriodFormatter(periodPrinter6, periodParser7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = period3.toString(periodFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(2, 2, 1, 4096, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4096 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("halfdays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"halfdays\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.time.LocalDateTime localDateTime0 = null;
        java.time.ZoneOffset zoneOffset1 = null;
        java.time.ZoneOffset zoneOffset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransition zoneOffsetTransition3 = java.time.zone.ZoneOffsetTransition.of(localDateTime0, zoneOffset1, zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: transition");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.parse((java.lang.CharSequence) "German", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.time.Duration duration1 = java.time.Duration.ofMinutes((long) 3);
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = duration1.get(temporalUnit2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: null");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDateTime(10, (int) (byte) 10, (int) (short) 10, 0, 100, 1024, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("halfdays", "1", "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: halfdays");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("Subject:\n", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption[] openOptionArray1 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.AsynchronousFileChannel asynchronousFileChannel2 = java.nio.channels.AsynchronousFileChannel.open(path0, openOptionArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray1);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.time.ZoneOffset zoneOffset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.of((int) '#', (int) (short) 100, (int) (byte) 0, 0, 256, (int) (byte) 0, (int) (short) 10, zoneOffset7);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        char char0 = java.io.File.pathSeparatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ':' + "'", char0 == ':');
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfDay((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.ZoneOffset zoneOffset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime2 = offsetTime0.withOffsetSameInstant(zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.year();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant1 = java.time.Instant.now();
        boolean boolean2 = instant0.isAfter(instant1);
        java.time.LocalTime localTime7 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime7);
        java.time.LocalTime localTime13 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime14 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime13);
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime17 = localTime13.with((java.time.temporal.TemporalField) chronoField15, (long) (short) 1);
        long long18 = localTime7.getLong((java.time.temporal.TemporalField) chronoField15);
        java.time.LocalTime localTime20 = localTime7.withSecond((int) (short) 1);
        java.time.temporal.TemporalUnit temporalUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = instant0.until((java.time.temporal.Temporal) localTime20, temporalUnit21);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain Instant from TemporalAccessor: 01:00:01.000000001 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField15.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3601000000001L + "'", long18 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours9 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay6, (org.joda.time.ReadablePartial) timeOfDay8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay8.withFieldAdded(durationFieldType10, (int) (byte) 0);
        int[] intArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            chronology3.validate((org.joda.time.ReadablePartial) timeOfDay8, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(timeOfDay12);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.of(1970, (int) (short) 10, 0, (int) ':', 28, 100, 6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.time.Instant instant0 = java.time.Instant.now();
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        java.time.temporal.TemporalUnit temporalUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant4 = instant0.minus((long) 4, temporalUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(4, 12, 28, (-1), (int) 'a', dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.time.temporal.TemporalQuery<?> wildcardTemporalQuery2 = null;
        java.time.temporal.TemporalQuery[] temporalQueryArray4 = new java.time.temporal.TemporalQuery[1];
        @SuppressWarnings("unchecked")
        java.time.temporal.TemporalQuery<?>[] wildcardTemporalQueryArray5 = (java.time.temporal.TemporalQuery<?>[]) temporalQueryArray4;
        wildcardTemporalQueryArray5[0] = wildcardTemporalQuery2;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor8 = dateTimeFormatter0.parseBest((java.lang.CharSequence) "", wildcardTemporalQueryArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least two queries must be specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(temporalQueryArray4);
        org.junit.Assert.assertNotNull(wildcardTemporalQueryArray5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.function.IntUnaryOperator intUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream2 = java.util.stream.IntStream.iterate((int) 'a', intUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime14 = localTime10.with((java.time.temporal.TemporalField) chronoField12, (long) (short) 1);
        long long15 = localTime4.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.LocalTime localTime17 = localTime4.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange19 = localTime17.range((java.time.temporal.TemporalField) chronoField18);
        org.joda.time.Period period20 = org.joda.time.Period.ZERO;
        org.joda.time.Period period21 = period20.normalizedStandard();
        org.joda.time.Period period23 = period20.plusHours(2);
        boolean boolean24 = valueRange19.equals((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3601000000001L + "'", long15 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime1 = offsetTime0.toLocalTime();
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime10 = localTime6.with((java.time.temporal.TemporalField) chronoField8, (long) (short) 1);
        java.time.Duration duration12 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime13 = localTime6.minus((java.time.temporal.TemporalAmount) duration12);
        java.time.temporal.TemporalUnit temporalUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = offsetTime0.until((java.time.temporal.Temporal) localTime6, temporalUnit14);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetTime from TemporalAccessor: 01:00:01.000000001 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField8.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.MONDAY;
        java.time.LocalTime localTime5 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime5);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime9 = localTime5.with((java.time.temporal.TemporalField) chronoField7, (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dayOfWeek0.get((java.time.temporal.TemporalField) chronoField7);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime8 = localTime4.with((java.time.temporal.TemporalField) chronoField6, (long) (short) 1);
        java.time.Duration duration10 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime11 = localTime4.minus((java.time.temporal.TemporalAmount) duration10);
        java.time.temporal.TemporalUnit temporalUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime14 = localTime4.plus((long) '4', temporalUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField6.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Optional.empty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Optional.empty' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = java.time.Instant.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer2 = longBuffer1.mark();
        long[] longArray4 = new long[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer5 = longBuffer1.get(longArray4);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0]");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.time.Duration duration1 = java.time.Duration.ofSeconds((long) 0);
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = duration1.get(temporalUnit2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: null");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.Comparator<org.joda.time.DateTime> dateTimeComparator0 = java.util.Comparator.naturalOrder();
        org.junit.Assert.assertNotNull(dateTimeComparator0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDate localDate3 = localDateTime1.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate3.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMinuteOfHour((int) ' ');
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours11 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay8, (org.joda.time.ReadablePartial) timeOfDay10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay10.withFieldAdded(durationFieldType12, (int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay10.minusMillis((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDateTime6.compareTo((org.joda.time.ReadablePartial) timeOfDay16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusMonths((-1));
        int int8 = dateMidnight5.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = dateMidnight5.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = org.joda.time.YearMonthDay.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("German");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"German\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Optional.empty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=optional.empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.String str1 = java.net.URLConnection.getDefaultRequestProperty("ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.function.IntSupplier intSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream1 = java.util.stream.IntStream.generate(intSupplier0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        int int4 = mutablePeriod3.getSeconds();
        mutablePeriod3.addSeconds(10);
        mutablePeriod3.setMinutes((int) 'a');
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.parallelStream();
        boolean boolean3 = strSet0.contains((java.lang.Object) 1.0d);
        java.util.Optional<java.lang.Exception> exceptionOptional4 = java.util.Optional.empty();
        java.lang.String str5 = exceptionOptional4.toString();
        java.util.Optional<java.lang.Exception> exceptionOptional6 = java.util.Optional.empty();
        java.lang.String str7 = exceptionOptional6.toString();
        java.util.Optional<java.lang.Exception> exceptionOptional8 = java.util.Optional.empty();
        java.util.Optional<java.lang.Exception> exceptionOptional9 = java.util.Optional.empty();
        java.util.Optional[] optionalArray11 = new java.util.Optional[4];
        @SuppressWarnings("unchecked")
        java.util.Optional<java.lang.Exception>[] exceptionOptionalArray12 = (java.util.Optional<java.lang.Exception>[]) optionalArray11;
        exceptionOptionalArray12[0] = exceptionOptional4;
        exceptionOptionalArray12[1] = exceptionOptional6;
        exceptionOptionalArray12[2] = exceptionOptional8;
        exceptionOptionalArray12[3] = exceptionOptional9;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Exception>[] exceptionOptionalArray21 = strSet0.toArray(exceptionOptionalArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(exceptionOptional4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional.empty" + "'", str5, "Optional.empty");
        org.junit.Assert.assertNotNull(exceptionOptional6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Optional.empty" + "'", str7, "Optional.empty");
        org.junit.Assert.assertNotNull(exceptionOptional8);
        org.junit.Assert.assertNotNull(exceptionOptional9);
        org.junit.Assert.assertNotNull(optionalArray11);
        org.junit.Assert.assertNotNull(exceptionOptionalArray12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery0 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        org.junit.Assert.assertNotNull(booleanTemporalQuery0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime14 = localTime10.with((java.time.temporal.TemporalField) chronoField12, (long) (short) 1);
        long long15 = localTime4.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.LocalTime localTime17 = localTime4.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange19 = localTime17.range((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalUnit temporalUnit20 = null;
        boolean boolean21 = localTime17.isSupported(temporalUnit20);
        java.time.LocalDate localDate22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime23 = localTime17.atDate(localDate22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3601000000001L + "'", long15 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str9 = locale8.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) timeOfDay7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "German" + "'", str9, "German");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime8 = localTime4.with((java.time.temporal.TemporalField) chronoField6, (long) (short) 1);
        java.time.ZoneOffset zoneOffset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime10 = java.time.OffsetTime.of(localTime4, zoneOffset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField6.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = format1.parseObject("1", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        int int6 = dateMidnight5.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withWeekOfWeekyear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime14 = localTime10.with((java.time.temporal.TemporalField) chronoField12, (long) (short) 1);
        long long15 = localTime4.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.ZoneOffset zoneOffset16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime17 = localTime4.atOffset(zoneOffset16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3601000000001L + "'", long15 == 3601000000001L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
        java.lang.String str1 = attribute0.toString();
        org.junit.Assert.assertNotNull(attribute0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.text.AttributedCharacterIterator$Attribute(input_method_segment)" + "'", str1, "java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.security.CodeSource codeSource0 = null;
        java.security.PermissionCollection permissionCollection1 = null;
        java.security.ProtectionDomain protectionDomain2 = new java.security.ProtectionDomain(codeSource0, permissionCollection1);
        java.security.Permission permission3 = null;
        boolean boolean4 = protectionDomain2.implies(permission3);
        org.junit.Assert.assertEquals(protectionDomain2.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.hoursIn(readableInterval0);
        org.joda.time.Minutes minutes2 = hours1.toStandardMinutes();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset1 = java.nio.charset.Charset.forName("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) days7);
        org.joda.time.Hours hours9 = days7.toStandardHours();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(hours9);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.MONDAY;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = dayOfWeek0.range((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: SecondOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime14 = localTime10.with((java.time.temporal.TemporalField) chronoField12, (long) (short) 1);
        long long15 = localTime4.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.LocalTime localTime17 = localTime4.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange19 = localTime17.range((java.time.temporal.TemporalField) chronoField18);
        long long20 = valueRange19.getSmallestMaximum();
        long long21 = valueRange19.getMaximum();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3601000000001L + "'", long15 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86399L + "'", long20 == 86399L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 86399L + "'", long21 == 86399L);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.nio.charset.CharacterCodingException characterCodingException0 = new java.nio.charset.CharacterCodingException();
        java.util.concurrent.ExecutionException executionException1 = new java.util.concurrent.ExecutionException((java.lang.Throwable) characterCodingException0);
        java.lang.String str2 = characterCodingException0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.nio.charset.CharacterCodingException" + "'", str2, "java.nio.charset.CharacterCodingException");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.stream.Collector.Characteristics characteristics0 = java.util.stream.Collector.Characteristics.CONCURRENT;
        org.junit.Assert.assertTrue("'" + characteristics0 + "' != '" + java.util.stream.Collector.Characteristics.CONCURRENT + "'", characteristics0.equals(java.util.stream.Collector.Characteristics.CONCURRENT));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = java.nio.charset.Charset.isSupported("ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.time.ZoneId zoneId0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now(zoneId0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = property2.addToCopy(21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField(366);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 366");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) (short) -1, (long) 7);
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalLong optionalLong4 = longStream2.reduce(longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        boolean boolean1 = charset0.canEncode();
        java.nio.ByteBuffer byteBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer3 = charset0.decode(byteBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.MONDAY;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = dayOfWeek0.getLong((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: SecondOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.time.Month month1 = java.time.Month.DECEMBER;
        int int2 = month1.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of((int) (byte) 0, month1, (int) (byte) 10, 1970, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 1970");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.DECEMBER + "'", month1.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime3 = offsetDateTime0.minus((long) (short) 100, temporalUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.stream.Stream<java.lang.Object> objStream0 = java.util.stream.Stream.empty();
        java.lang.Object[] objArray1 = objStream0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray2 = objStream0.toArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objStream0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) (short) -1, (long) 7);
        java.util.function.LongToDoubleFunction longToDoubleFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = longStream2.mapToDouble(longToDoubleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = offsetDateTime0.truncatedTo(temporalUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDate((int) (short) 1, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime14 = localTime10.with((java.time.temporal.TemporalField) chronoField12, (long) (short) 1);
        long long15 = localTime4.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.LocalTime localTime17 = localTime4.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange19 = localTime17.range((java.time.temporal.TemporalField) chronoField18);
        java.time.OffsetDateTime offsetDateTime20 = java.time.OffsetDateTime.now();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime22 = chronoField18.adjustInto(offsetDateTime20, (-1L));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfDay (valid values 0 - 86399): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3601000000001L + "'", long15 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(6);
        org.joda.time.DateTime dateTime6 = localDateTime3.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        short[] shortArray2 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        short[] shortArray6 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer10 = shortBuffer3.get(shortArray6, (int) 'u', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration2 = java.time.Duration.of(0L, temporalUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: unit");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = gregorianCalendar5.getGreatestMinimum((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        int[] intArray3 = intStream2.toArray();
        java.util.LongSummaryStatistics longSummaryStatistics4 = new java.util.LongSummaryStatistics();
        longSummaryStatistics4.accept(3);
        long long7 = longSummaryStatistics4.getMax();
        // The following exception was thrown during execution in test generation
        try {
            intStream2.forEachOrdered((java.util.function.IntConsumer) longSummaryStatistics4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertEquals(longSummaryStatistics4.toString(), "LongSummaryStatistics{count=1, sum=3, min=3, average=3.000000, max=3}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDate localDate3 = localDateTime1.toLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate3.get(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant6 = java.time.Instant.from((java.time.temporal.TemporalAccessor) localTime4);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain Instant from TemporalAccessor: 01:00:01.000000001 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress[] inetAddressArray1 = java.net.InetAddress.getAllByName("UNDERFLOW");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UNDERFLOW: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.parse((java.lang.CharSequence) "yearOfCentury");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'yearOfCentury' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        char char0 = java.io.File.separatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '/' + "'", char0 == '/');
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.plus((long) (byte) -1);
        int int8 = dateMidnight5.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.io.IOException iOException0 = new java.io.IOException();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((java.lang.Object) iOException0, chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.io.IOException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.withDayOfYear(4096);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4096 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.WEDNESDAY;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.INSTANT_SECONDS;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = dayOfWeek0.range((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.WEDNESDAY));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.INSTANT_SECONDS + "'", chronoField1.equals(java.time.temporal.ChronoField.INSTANT_SECONDS));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 0, chronology3);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        java.util.Locale locale6 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology5, locale6, (java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) locale0, chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange3 = java.time.temporal.ValueRange.of((long) 34, (long) 2022, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        mutablePeriod3.add((int) '#', 0, 10, 0, (int) (byte) 0, (int) (short) 0, 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks13 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) mutablePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P35Y11WT0.999S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant1 = java.time.Instant.now();
        boolean boolean2 = instant0.isAfter(instant1);
        java.time.ZoneId zoneId3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock4 = java.time.Clock.fixed(instant0, zoneId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime17.set(dateTimeFieldType26, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for halfdayOfDay must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.stream.IntStream intStream4 = intStream2.skip((long) 256);
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfInt ofInt5 = intStream2.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        short[] shortArray2 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        short[] shortArray6 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        java.nio.ShortBuffer shortBuffer8 = shortBuffer3.put(shortBuffer7);
        short[] shortArray11 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer12 = java.nio.ShortBuffer.wrap(shortArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer13 = shortBuffer3.get(shortArray11);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer12);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.Comparator<java.time.OffsetDateTime> offsetDateTimeComparator0 = java.time.OffsetDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(offsetDateTimeComparator0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        short[] shortArray2 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        org.joda.time.Days days4 = org.joda.time.Days.ONE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) shortArray2, periodType5, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: [S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withFieldAdded(durationFieldType5, (int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours12 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay9, (org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay9.withSecondOfMinute(0);
        boolean boolean15 = timeOfDay7.isAfter((org.joda.time.ReadablePartial) timeOfDay14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField17 = timeOfDay7.getField(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime1 = offsetTime0.toLocalTime();
        java.time.Duration duration3 = java.time.Duration.ofMinutes((long) 3);
        java.time.temporal.Temporal temporal4 = localTime1.plus((java.time.temporal.TemporalAmount) duration3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId5 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) localTime1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZoneId from TemporalAccessor: 23:59:59.999999999 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(temporal4);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone5);
        long long9 = dateTimeZone5.convertLocalToUTC((long) 3, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((int) 'a', 256, 28, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 256 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.time.Month month0 = java.time.Month.NOVEMBER;
        int int2 = month0.firstDayOfYear(true);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = month0.get((java.time.temporal.TemporalField) chronoField3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: HourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.NOVEMBER + "'", month0.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 306 + "'", int2 == 306);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours14 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay11, (org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay13.withFieldAdded(durationFieldType15, (int) (byte) 0);
        org.joda.time.Period period19 = period9.withFieldAdded(durationFieldType15, 4);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) period9);
        mutableDateTime6.setWeekyear(0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of(4096, (int) '#', (int) ':', (int) '/', 366, 28);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 35");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar5.roll((int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean2 = offsetDateTime0.isSupported((java.time.temporal.TemporalField) chronoField1);
        java.time.ZoneOffset zoneOffset3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime4 = offsetDateTime0.withOffsetSameLocal(zoneOffset3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.INSTANT_SECONDS;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange24 = isoEra4.range((java.time.temporal.TemporalField) chronoField23);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.INSTANT_SECONDS + "'", chronoField23.equals(java.time.temporal.ChronoField.INSTANT_SECONDS));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress5 = java.net.InetAddress.getByAddress("1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z", byteArray4);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 100, 0]");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 3, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) dateTime6, chronology8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.dayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight16.withDayOfYear((int) ' ');
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateMidnight9, (org.joda.time.ReadableInstant) dateMidnight20);
        boolean boolean22 = weeks0.isGreaterThan(weeks21);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withParseType(periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = periodFormatter4.parsePeriod("Stunde");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodFormatter4);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        short[] shortArray2 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        short[] shortArray6 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        java.nio.ShortBuffer shortBuffer8 = shortBuffer3.put(shortBuffer7);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = shortBuffer8.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.security.cert.CertPath certPath0 = null;
        java.security.Timestamp timestamp1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.CodeSigner codeSigner2 = new java.security.CodeSigner(certPath0, timestamp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("CHN", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        short[] shortArray2 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        short[] shortArray6 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        java.nio.ShortBuffer shortBuffer8 = shortBuffer3.put(shortBuffer7);
        int int9 = shortBuffer8.limit();
        short[] shortArray12 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer13 = java.nio.ShortBuffer.wrap(shortArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer16 = shortBuffer8.get(shortArray12, (int) (short) -1, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer13);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.security.SignatureException signatureException0 = new java.security.SignatureException();
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.temporal.TemporalUnit temporalUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate4 = localDate1.minus((long) 1, temporalUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone3);
        long long7 = dateTimeZone3.convertLocalToUTC((long) 3, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) 1970, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.String[] strArray2 = new java.lang.String[] { "halfdays", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.Iterator<java.lang.String> strItor5 = strList3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        boolean boolean6 = gregorianCalendar5.isLenient();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        int[] intArray6 = period5.getValues();
        org.joda.time.Period period8 = period5.withMonths((int) (short) 0);
        int int9 = period5.getHours();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) -1, 9, 4096, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.net.UnknownHostException unknownHostException0 = new java.net.UnknownHostException();
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(0L);
        java.util.function.LongBinaryOperator longBinaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalLong optionalLong3 = longStream1.reduce(longBinaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.time.Instant instant0 = java.time.Instant.now();
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        java.time.Instant instant2 = java.time.Instant.now();
        java.time.Instant instant3 = java.time.Instant.now();
        boolean boolean4 = instant2.isAfter(instant3);
        java.time.Duration duration5 = java.time.Duration.ZERO;
        java.time.Instant instant6 = instant3.minus((java.time.temporal.TemporalAmount) duration5);
        int int7 = instant0.compareTo(instant6);
        java.time.ZoneId zoneId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime9 = java.time.OffsetTime.ofInstant(instant6, zoneId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.joda.time.Duration duration19 = duration17.withMillis((-1L));
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval8.setDurationAfterStart((org.joda.time.ReadableDuration) duration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.stream.Stream<java.lang.Object> objStream0 = java.util.stream.Stream.empty();
        java.lang.Runnable runnable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.Object> objStream2 = objStream0.onClose(runnable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objStream0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis(2022);
        org.joda.time.LocalTime localTime6 = localTime2.plusMillis((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localTime2.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.TimeZone timeZone7 = gregorianCalendar5.getTimeZone();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 0, chronology13);
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.DateTimeField dateTimeField18 = chronology15.monthOfYear();
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 28, chronology15, locale19, (java.lang.Integer) 0);
        java.lang.String str22 = locale8.getDisplayName(locale19);
        java.lang.String str23 = timeZone7.getDisplayName(locale19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chinese (China)" + "'", str22, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coordinated Universal Time" + "'", str23, "Coordinated Universal Time");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField0.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Locale.Category category0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = java.util.Locale.getDefault(category0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.EXECUTE;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.EXECUTE + "'", accessMode0.equals(java.nio.file.AccessMode.EXECUTE));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean2 = offsetDateTime0.isSupported((java.time.temporal.TemporalField) chronoField1);
        java.time.OffsetDateTime offsetDateTime4 = offsetDateTime0.withNano((int) (byte) 10);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery6 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period7 = localDateTime5.query(periodTemporalQuery6);
        java.time.temporal.TemporalUnit temporalUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = offsetDateTime4.until((java.time.temporal.Temporal) localDateTime5, temporalUnit8);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: 2022-02-21T09:34:02.894 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(periodTemporalQuery6);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight7 = property6.roundCeilingCopy();
        java.util.Locale locale10 = new java.util.Locale("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight11 = property6.setCopy("Years", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Years\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.minusMinutes((int) ' ');
        org.joda.time.Period period10 = period8.withMinutes(32769);
        boolean boolean11 = interval4.equals((java.lang.Object) period10);
        int int12 = period10.getMonths();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.ZoneOffset zoneOffset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = localDateTime0.toEpochSecond(zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.time.Instant instant0 = java.time.Instant.now();
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        java.time.Instant instant2 = java.time.Instant.now();
        java.time.Instant instant3 = java.time.Instant.now();
        boolean boolean4 = instant2.isAfter(instant3);
        java.time.Duration duration5 = java.time.Duration.ZERO;
        java.time.Instant instant6 = instant3.minus((java.time.temporal.TemporalAmount) duration5);
        int int7 = instant0.compareTo(instant6);
        java.time.temporal.TemporalUnit temporalUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant10 = instant0.minus((long) (-1), temporalUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = chronology3.getDateTimeMillis(0, 7, (int) (short) 100, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.net.FileNameMap fileNameMap0 = null;
        java.net.URLConnection.setFileNameMap(fileNameMap0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = timeOfDay1.getFieldType((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property5 = timeOfDay1.property(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = java.time.temporal.ValueRange.of((long) 2022, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value must be less than maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange4 = java.time.temporal.ValueRange.of((long) 2, 0L, (long) 0, (long) 306);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest minimum value must be less than largest minimum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean2 = offsetDateTime0.isSupported((java.time.temporal.TemporalField) chronoField1);
        java.util.Properties properties3 = null;
        java.util.Properties properties4 = new java.util.Properties(properties3);
        java.time.LocalTime localTime9 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime10 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime9);
        java.time.LocalTime localTime15 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime15);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime19 = localTime15.with((java.time.temporal.TemporalField) chronoField17, (long) (short) 1);
        long long20 = localTime9.getLong((java.time.temporal.TemporalField) chronoField17);
        java.time.LocalTime localTime22 = localTime9.withSecond((int) (short) 1);
        java.lang.Object obj24 = properties4.put((java.lang.Object) localTime22, (java.lang.Object) "117");
        java.time.LocalTime localTime29 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime30 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime29);
        java.time.LocalTime localTime35 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime36 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime35);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime39 = localTime35.with((java.time.temporal.TemporalField) chronoField37, (long) (short) 1);
        long long40 = localTime29.getLong((java.time.temporal.TemporalField) chronoField37);
        java.time.LocalTime localTime42 = localTime29.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange44 = localTime42.range((java.time.temporal.TemporalField) chronoField43);
        java.time.Duration duration46 = java.time.Duration.ofSeconds((long) 0);
        java.time.LocalTime localTime47 = localTime42.plus((java.time.temporal.TemporalAmount) duration46);
        java.time.LocalTime localTime52 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime53 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime52);
        java.time.LocalTime localTime58 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime59 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime58);
        java.time.temporal.ChronoField chronoField60 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime62 = localTime58.with((java.time.temporal.TemporalField) chronoField60, (long) (short) 1);
        long long63 = localTime52.getLong((java.time.temporal.TemporalField) chronoField60);
        java.time.LocalTime localTime65 = localTime52.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField66 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange67 = localTime65.range((java.time.temporal.TemporalField) chronoField66);
        java.time.Duration duration69 = java.time.Duration.ofSeconds((long) 0);
        java.time.LocalTime localTime70 = localTime65.plus((java.time.temporal.TemporalAmount) duration69);
        java.lang.Object obj71 = properties4.getOrDefault((java.lang.Object) localTime47, (java.lang.Object) localTime65);
        java.time.temporal.TemporalUnit temporalUnit72 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long73 = offsetDateTime0.until((java.time.temporal.Temporal) localTime65, temporalUnit72);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: 01:00:01.000000001 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField17.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3601000000001L + "'", long20 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField37.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3601000000001L + "'", long40 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField43.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertTrue("'" + chronoField60 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField60.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 3601000000001L + "'", long63 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertTrue("'" + chronoField66 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField66.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange67);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + "117" + "'", obj71, "117");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.IsoEra isoEra1 = java.time.chrono.IsoEra.of((int) ':');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid era: 58");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI5 = new java.net.URI("", "Chinese (China)", "yearOfCentury", "yearOfCentury", "Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: ://Chinese%20(China)yearOfCentury?yearOfCentury#Chinese%20(China)");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.joda.time.DateTime dateTime7 = property3.addToCopy((long) (byte) 1);
        org.joda.time.DateTime dateTime8 = property3.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime2.withMinuteOfHour(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.of("Optional.empty");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unknown chronology: Optional.empty");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.millisOfDay();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.halfdays();
        int int12 = periodType10.indexOf(durationFieldType11);
        mutableDateTime6.add(durationFieldType11, (int) 'a');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = property15.set("Years");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Years\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.CharBuffer charBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.CoderResult coderResult3 = charsetDecoder1.flush(charBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current state = RESET, new state = FLUSHED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateTime dateTime9 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMillis((int) (byte) 0);
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTime9.toString("hi!", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) 0, chronology8);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.weekyears();
        org.joda.time.DurationField durationField13 = chronology10.seconds();
        org.joda.time.Chronology chronology14 = chronology10.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) 'a', (int) '4', 28, 306, (int) ' ', 6, (int) (byte) 10, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 306 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 0, chronology3);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DurationField durationField8 = chronology5.seconds();
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.Format.Field field10 = null;
        java.text.FieldPosition fieldPosition11 = new java.text.FieldPosition(field10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = duration14.toPeriodTo(readableInstant15, periodType16);
        org.joda.time.Days days18 = period17.toStandardDays();
        boolean boolean19 = fieldPosition11.equals((java.lang.Object) days18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = format1.format((java.lang.Object) chronology5, stringBuffer9, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: toAppendTo");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = periodFormatter2.parsePeriod("NanoOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate1 = offsetDateTime0.toLocalDate();
        java.time.temporal.TemporalUnit temporalUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate4 = localDate1.plus((-1L), temporalUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(64, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 64 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withField(dateTimeFieldType2, (int) 'a');
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusSeconds(6);
        boolean boolean11 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withDayOfYear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "Wochentag");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Wochentag");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(chronology4);
        org.joda.time.DateTimeField dateTimeField7 = chronology4.monthOfYear();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 28, chronology4, locale8, (java.lang.Integer) 0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 0, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 3, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((java.lang.Object) dateTime16, chronology18);
        org.joda.time.DateTime dateTime20 = localTime13.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalTime localTime22 = localTime13.plusHours(3);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 3, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Period period31 = period29.minusMinutes((int) ' ');
        org.joda.time.Period period33 = period31.withMinutes(32769);
        boolean boolean34 = interval27.equals((java.lang.Object) period33);
        org.joda.time.LocalTime localTime36 = localTime22.withPeriodAdded((org.joda.time.ReadablePeriod) period33, (int) (byte) 100);
        int[] intArray37 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            chronology4.validate((org.joda.time.ReadablePartial) localTime22, intArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        int[] intArray3 = intStream2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfInt ofInt4 = intStream2.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        boolean boolean3 = localDate1.isSupported(temporalUnit2);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        java.time.Period period30 = period24.minusYears((long) 10);
        org.joda.time.Period period31 = org.joda.time.Period.ZERO;
        org.joda.time.Period period32 = period31.normalizedStandard();
        org.joda.time.Period period34 = period31.plusHours(2);
        java.time.chrono.IsoEra isoEra35 = java.time.chrono.IsoEra.CE;
        boolean boolean36 = period34.equals((java.lang.Object) isoEra35);
        java.time.LocalTime localTime41 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime42 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime41);
        java.time.LocalTime localTime47 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime48 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime47);
        java.time.temporal.ChronoField chronoField49 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime51 = localTime47.with((java.time.temporal.TemporalField) chronoField49, (long) (short) 1);
        long long52 = localTime41.getLong((java.time.temporal.TemporalField) chronoField49);
        boolean boolean53 = isoEra35.isSupported((java.time.temporal.TemporalField) chronoField49);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery54 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period55 = isoEra35.query(periodTemporalQuery54);
        java.time.chrono.ChronoPeriod chronoPeriod56 = period30.minus((java.time.temporal.TemporalAmount) period55);
        java.time.chrono.ChronoPeriod chronoPeriod58 = period30.multipliedBy(4096);
        java.time.LocalTime localTime63 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime64 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime63);
        java.time.temporal.ChronoField chronoField65 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime67 = localTime63.with((java.time.temporal.TemporalField) chronoField65, (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal68 = period30.addTo((java.time.temporal.Temporal) localTime63);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Years");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + isoEra35 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra35.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + chronoField49 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField49.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3601000000001L + "'", long52 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(chronoPeriod56);
        org.junit.Assert.assertNotNull(chronoPeriod58);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + chronoField65 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField65.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime67);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.parallelStream();
        java.lang.Object[] objArray2 = strSet0.toArray();
        java.text.FieldPosition[] fieldPositionArray3 = new java.text.FieldPosition[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.text.FieldPosition[] fieldPositionArray4 = strSet0.toArray(fieldPositionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(fieldPositionArray3);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime1 = localDateTime0.toLocalTime();
        java.time.ZoneOffset zoneOffset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant3 = localDateTime0.toInstant(zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 10);
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = localDateTime4.isEqual(readablePartial5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime0.with((java.time.temporal.TemporalField) chronoField1, (long) 10);
        java.time.LocalDateTime localDateTime5 = localDateTime0.withDayOfYear((int) '/');
        java.time.ZoneOffset zoneOffset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant7 = localDateTime0.toInstant(zoneOffset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime0.with((java.time.temporal.TemporalField) chronoField1, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = localDateTime0.withMonth(52);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 3, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfYear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((java.lang.Object) dateTime21, chronology23);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.dayOfMonth();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(readableInstant26, readableInstant27);
        org.joda.time.Duration duration30 = duration28.withMillis((-1L));
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Duration duration32 = duration28.minus(readableDuration31);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight24.plus((org.joda.time.ReadableDuration) duration32);
        boolean boolean34 = dateMidnight16.isAfter((org.joda.time.ReadableInstant) dateMidnight33);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.Throwable throwable0 = null;
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException(throwable0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        mutablePeriod3.add((int) '#', 0, 10, 0, (int) (byte) 0, (int) (short) 0, 1, (-1));
        mutablePeriod3.setHours((int) (byte) -1);
        mutablePeriod3.setMonths((-1));
        mutablePeriod3.clear();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.halfdays();
        java.lang.String str19 = durationFieldType18.toString();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.add(durationFieldType18, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'halfdays'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "halfdays" + "'", str19, "halfdays");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        mutablePeriod3.add((int) '#', 0, 10, 0, (int) (byte) 0, (int) (short) 0, 1, (-1));
        mutablePeriod3.setHours((int) (byte) -1);
        mutablePeriod3.setMonths((-1));
        org.joda.time.DurationFieldType durationFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.add(durationFieldType17, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'null'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.time.temporal.TemporalUnit temporalUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate25 = localDate1.plus((long) 16, temporalUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int[] intArray6 = new int[] { 3600000, 3600000, 256, 21, (byte) 100, (short) -1 };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.function.IntPredicate intPredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = intStream7.allMatch(intPredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3600000, 3600000, 256, 21, 100, -1]");
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.CharsetDecoder charsetDecoder3 = charsetDecoder1.replaceWith("Stunde");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Replacement too long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.IntSummaryStatistics intSummaryStatistics3 = new java.util.IntSummaryStatistics();
        intStream2.forEach((java.util.function.IntConsumer) intSummaryStatistics3);
        java.lang.String str5 = intSummaryStatistics3.toString();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals(intSummaryStatistics3.toString(), "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}" + "'", str5, "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("70");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"70\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.parse((java.lang.CharSequence) "UNDERFLOW");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'UNDERFLOW' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((long) (byte) 10);
        int int3 = localDateTime0.getHour();
        java.time.ZoneOffset zoneOffset4 = null;
        java.time.ZoneId zoneId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime6 = java.time.ZonedDateTime.ofInstant(localDateTime0, zoneOffset4, zoneId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar5.roll((int) '/', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.nio.charset.CharacterCodingException characterCodingException0 = new java.nio.charset.CharacterCodingException();
        java.util.concurrent.ExecutionException executionException1 = new java.util.concurrent.ExecutionException((java.lang.Throwable) characterCodingException0);
        java.security.PrivilegedActionException privilegedActionException2 = new java.security.PrivilegedActionException((java.lang.Exception) characterCodingException0);
        java.lang.String str3 = characterCodingException0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.nio.charset.CharacterCodingException" + "'", str3, "java.nio.charset.CharacterCodingException");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration2 = new org.joda.time.Duration((java.lang.Object) periodType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime0.with((java.time.temporal.TemporalField) chronoField1, (long) 10);
        java.time.ZoneOffset zoneOffset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = localDateChronoLocalDateTime3.toEpochSecond(zoneOffset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream4 = new java.io.PrintStream(outputStream0, true, "Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.function.DoubleConsumer doubleConsumer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleStream0.forEachOrdered(doubleConsumer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant1 = java.time.Instant.now();
        boolean boolean2 = instant0.isAfter(instant1);
        java.time.ZoneId zoneId3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime4 = java.time.OffsetTime.ofInstant(instant1, zoneId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.time.Duration duration1 = java.time.Duration.ofMinutes((long) 3);
        java.time.Duration duration2 = duration1.abs();
        java.time.temporal.TemporalUnit temporalUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration5 = duration1.minus((long) (byte) 1, temporalUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: unit");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.INSTANT_SECONDS;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = localDate1.getLong((java.time.temporal.TemporalField) chronoField12);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.INSTANT_SECONDS + "'", chronoField12.equals(java.time.temporal.ChronoField.INSTANT_SECONDS));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("UNDERFLOW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: UNDERFLOW");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDate localDate3 = localDateTime1.toLocalDate();
        java.time.LocalTime localTime9 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime10 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime9);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime13 = localTime9.with((java.time.temporal.TemporalField) chronoField11, (long) (short) 1);
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.lang.String str15 = chronoField11.getDisplayName(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDate3.toString("halfdays", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: l");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField11.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NanoOfDay" + "'", str15, "NanoOfDay");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.nio.LongBuffer longBuffer3 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer4 = longBuffer3.mark();
        boolean boolean5 = properties1.containsKey((java.lang.Object) longBuffer3);
        long[] longArray11 = new long[] { 1, (short) 100, 14, 8, 3601000000001L };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer14 = longBuffer3.put(longArray11, 16, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, 100, 14, 8, 3601000000001]");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        short[] shortArray2 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        short[] shortArray6 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        java.nio.ShortBuffer shortBuffer8 = shortBuffer3.put(shortBuffer7);
        // The following exception was thrown during execution in test generation
        try {
            short short9 = shortBuffer8.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        byte[] byteArray3 = new byte[] { (byte) 100 };
        filterOutputStream1.write(byteArray3, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean3 = offsetDateTime1.isSupported((java.time.temporal.TemporalField) chronoField2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange4 = isoEra0.range((java.time.temporal.TemporalField) chronoField2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: HourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField2.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = java.time.ZoneId.SHORT_IDS;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 3, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) dateTime6, chronology8);
        org.joda.time.DateTime dateTime10 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime10.withYearOfCentury((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strMap0.remove((java.lang.Object) dateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.time.ZonedDateTime zonedDateTime0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.GregorianCalendar gregorianCalendar1 = java.util.GregorianCalendar.from(zonedDateTime0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = localDate0.withEra(7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime0.with((java.time.temporal.TemporalField) chronoField1, (long) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.weekyears();
        org.joda.time.DurationField durationField10 = chronology7.seconds();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        boolean boolean12 = localDateChronoLocalDateTime3.equals((java.lang.Object) chronology7);
        org.joda.time.DateTimeField dateTimeField13 = chronology7.yearOfEra();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours18 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay15, (org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay17.withFieldAdded(durationFieldType19, (int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours26 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay23, (org.joda.time.ReadablePartial) timeOfDay25);
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay23.withSecondOfMinute(0);
        boolean boolean29 = timeOfDay21.isAfter((org.joda.time.ReadablePartial) timeOfDay28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) 0, chronology32);
        int[] intArray34 = localTime33.getValues();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 3, chronology37);
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfYear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((java.lang.Object) dateTime38, chronology40);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime38.toMutableDateTime();
        mutableDateTime42.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime42.dayOfWeek();
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        int int47 = property45.getMaximumTextLength(locale46);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray48 = dateTimeField13.set((org.joda.time.ReadablePartial) timeOfDay28, 21, intArray34, "yearOfCentury", locale46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfCentury\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.dayOfWeek();
        java.util.Locale locale13 = new java.util.Locale("Subject:\n", "German");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = property9.set("1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals(locale13.toString(), "subject:\n_GERMAN");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.security.GeneralSecurityException generalSecurityException0 = new java.security.GeneralSecurityException();
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar5);
        java.lang.String str8 = gregorianCalendar5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.util.GregorianCalendar[time=-51016611000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=353,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=126,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str8, "java.util.GregorianCalendar[time=-51016611000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=353,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=126,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.ZoneId zoneId1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime2 = offsetDateTime0.atZoneSameInstant(zoneId1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.junit.Assert.assertNotNull(minutes0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        mutableDateTime17.setWeekOfWeekyear(1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        boolean boolean17 = dateMidnight9.isBefore((long) ' ');
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T00:00:00.000Z/1970-01...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Interval interval1 = localDate0.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDate0.getValue(3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 3600000");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((long) (byte) 10);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime5 = localDateTime3.minusYears((long) (byte) 10);
        boolean boolean6 = localDateTime0.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime5);
        java.time.ZoneId zoneId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime8 = java.time.ZonedDateTime.of(localDateTime5, zoneId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray4 = new java.util.Locale[] { locale3 };
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList10 = localeList5.subList((int) (byte) 1, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 117");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localeList7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate1 = offsetDateTime0.toLocalDate();
        java.time.temporal.TemporalUnit temporalUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime4 = offsetDateTime0.minus((long) 0, temporalUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period4.minusMinutes((int) ' ');
        org.joda.time.Period period8 = period6.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.DateTime dateTime10 = dateTime2.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.DateTime dateTime12 = dateTime2.plusHours(34);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(readableInstant13, readableInstant14);
        long long16 = duration15.getMillis();
        org.joda.time.Duration duration18 = duration15.plus((long) (byte) 1);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 3, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 3, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((java.lang.Object) dateTime25, chronology27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight28.withDayOfYear((int) ' ');
        int int33 = dateMidnight28.getWeekOfWeekyear();
        long long34 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit36 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean37 = weeks35.equals((java.lang.Object) timeUnit36);
        org.joda.time.Weeks weeks38 = weeks35.negated();
        org.joda.time.PeriodType periodType39 = weeks38.getPeriodType();
        org.joda.time.Period period40 = duration18.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight28, periodType39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) 0, chronology42);
        org.joda.time.Chronology chronology44 = localTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) dateTime12, periodType39, chronology44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(timeUnit36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.TimeZone timeZone7 = gregorianCalendar5.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar5.clear(64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 64");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.Date date7 = new java.util.Date();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromDateFields(date7);
        gregorianCalendar5.setGregorianChange(date7);
        boolean boolean10 = gregorianCalendar5.isLenient();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 21 09:34:06 UTC 2022");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.temporal.TemporalUnit temporalUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime8 = localTime4.plus((long) 21, temporalUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(6, 64, 6, 12, 3600000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHoursMinutesSeconds(10, 21, 2022);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset seconds not in valid range: value 2022 is not in the range -59 to 59");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        // The following exception was thrown during execution in test generation
        try {
            long long1 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours11 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay8, (org.joda.time.ReadablePartial) timeOfDay10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 0, chronology15);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology17, locale18, (java.lang.Integer) 1);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 0, chronology24);
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.weekyearOfCentury();
        org.joda.time.DurationField durationField28 = dateTimeField27.getLeapDurationField();
        dateTimeParserBucket22.saveField(dateTimeField27, (int) 'u');
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str33 = dateTimeField27.getAsShortText((int) 'u', locale32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = dateTimeField6.getAsShortText((org.joda.time.ReadablePartial) timeOfDay10, 365, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 365");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNull(durationField28);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "117" + "'", str33, "117");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.SHORT_STANDALONE;
        java.time.format.TextStyle textStyle1 = textStyle0.asStandalone();
        java.time.format.TextStyle textStyle2 = textStyle1.asNormal();
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle0.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle1.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertTrue("'" + textStyle2 + "' != '" + java.time.format.TextStyle.SHORT + "'", textStyle2.equals(java.time.format.TextStyle.SHORT));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology4, locale5, (java.lang.Integer) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 0, chronology11);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = dateTimeField14.getLeapDurationField();
        dateTimeParserBucket9.saveField(dateTimeField14, (int) 'u');
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str20 = dateTimeField14.getAsShortText((int) 'u', locale19);
        boolean boolean21 = dateTimeField14.isSupported();
        java.util.Locale locale26 = new java.util.Locale("ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]", "UNDERFLOW", "Years");
        java.lang.String str27 = dateTimeField14.getAsText((long) 14, locale26);
        java.lang.String str28 = locale26.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((java.lang.Object) str28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"parsecasesensitive(false)(value(...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "117" + "'", str20, "117");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals(locale26.toString(), "parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(monthofyear,2)'-'value(dayofmonth,2))[offset(+hh:mm:ss,'z')]_UNDERFLOW_Years");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "70" + "'", str27, "70");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(monthofyear,2)'-'value(dayofmonth,2))[offset(+hh:mm:ss,'z')] (UNDERFLOW,Years)" + "'", str28, "parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(monthofyear,2)'-'value(dayofmonth,2))[offset(+hh:mm:ss,'z')] (UNDERFLOW,Years)");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 5, (long) 'a');
        java.util.function.LongPredicate longPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = longStream2.filter(longPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period(readablePartial0, (org.joda.time.ReadablePartial) localDateTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("java.util.GregorianCalendar[time=-51016611000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=353,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=126,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.util.GregorianCalendar[time...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.SHORT_STANDALONE;
        java.time.format.TextStyle textStyle1 = textStyle0.asStandalone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) textStyle1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.time.format.TextStyle");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle0.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle1.equals(java.time.format.TextStyle.SHORT_STANDALONE));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        long long0 = java.security.Key.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 6603384152749567654L + "'", long0 == 6603384152749567654L);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.time.format.DateTimeFormatter dateTimeFormatter3 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str4 = dateTimeFormatter3.toString();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery6 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period7 = localDateTime5.query(periodTemporalQuery6);
        java.text.Format format8 = dateTimeFormatter3.toFormat(periodTemporalQuery6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period9 = dateTimeFormatter0.parse((java.lang.CharSequence) "Chinese (China)", periodTemporalQuery6);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Chinese (China)' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]" + "'", str4, "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(periodTemporalQuery6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(format8);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.unordered();
        double[] doubleArray2 = doubleStream0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble3 = doubleStream0.min();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime8 = localTime4.with((java.time.temporal.TemporalField) chronoField6, (long) (short) 1);
        java.time.ZoneOffset zoneOffset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime10 = localTime4.atOffset(zoneOffset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField6.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.Optional<java.lang.Exception> exceptionOptional0 = java.util.Optional.empty();
        java.lang.String str1 = exceptionOptional0.toString();
        boolean boolean2 = exceptionOptional0.isPresent();
        java.lang.Object obj3 = null;
        boolean boolean4 = exceptionOptional0.equals(obj3);
        org.junit.Assert.assertNotNull(exceptionOptional0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Optional.empty" + "'", str1, "Optional.empty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.function.IntUnaryOperator intUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream2 = java.util.stream.IntStream.iterate(256, intUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery1 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period2 = localDateTime0.query(periodTemporalQuery1);
        java.time.temporal.TemporalUnit temporalUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = period2.get(temporalUnit3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: null");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(periodTemporalQuery1);
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter3.withParseType(periodType4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = mutablePeriod0.toString(periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodFormatter5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str2 = dateTimeFormatter1.toString();
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery4 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period5 = localDateTime3.query(periodTemporalQuery4);
        java.text.Format format6 = dateTimeFormatter1.toFormat(periodTemporalQuery4);
        java.time.Period period7 = isoEra0.query(periodTemporalQuery4);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isoEra0.get((java.time.temporal.TemporalField) chronoField8);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]" + "'", str2, "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(periodTemporalQuery4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField8.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant1 = java.time.Instant.now();
        boolean boolean2 = instant0.isAfter(instant1);
        java.time.temporal.TemporalUnit temporalUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant4 = instant0.truncatedTo(temporalUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Set<java.time.chrono.Chronology> chronologySet0 = java.time.chrono.Chronology.getAvailableChronologies();
        org.junit.Assert.assertNotNull(chronologySet0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(writer0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = java.time.Duration.parse(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: text");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.time.Month month0 = java.time.Month.OCTOBER;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.OCTOBER + "'", month0.equals(java.time.Month.OCTOBER));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withLocale(locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: locale");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        char[] charArray0 = new char[] {};
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer4 = charBuffer1.subSequence(20, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter3 = new java.io.PrintWriter(outputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plusYears((int) (short) 100);
        int int7 = localDateTime3.getSecondOfMinute();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusSeconds(6);
        boolean boolean14 = localDateTime3.isEqual((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        int int19 = seconds18.getSeconds();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime3.plus((org.joda.time.ReadablePeriod) seconds18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDateTime20.getValue(64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 64");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.text.Format format2 = dateTimeFormatter0.toFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = format2.format((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format target must implement TemporalAccessor");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertNotNull(format2);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime0.with((java.time.temporal.TemporalField) chronoField1, (long) 10);
        java.time.LocalDateTime localDateTime5 = localDateTime0.minusMinutes((long) 12);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime9 = localDateTime6.with((java.time.temporal.TemporalField) chronoField7, (long) 10);
        java.time.Duration duration11 = java.time.Duration.ofSeconds((long) 0);
        java.time.temporal.Temporal temporal12 = localDateTime6.minus((java.time.temporal.TemporalAmount) duration11);
        boolean boolean13 = localDateTime5.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = localDateTime6.withDayOfMonth((-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(temporal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.TimeZone timeZone7 = gregorianCalendar5.getTimeZone();
        timeZone7.setID("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeZone7.getOffset((int) (byte) 100, (int) 'a', 366, 59, 0, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 100, (short) -1, (byte) 0, (short) 0, (short) 10 };
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, -1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortBuffer7);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '#', 0, 2, (int) (short) 100);
        int int5 = period4.getMinutes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray4 = new java.util.Locale[] { locale3 };
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList5);
        java.util.Locale locale12 = new java.util.Locale("ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]", "UNDERFLOW", "Years");
        // The following exception was thrown during execution in test generation
        try {
            localeList5.add(5, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertEquals(locale12.toString(), "parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(monthofyear,2)'-'value(dayofmonth,2))[offset(+hh:mm:ss,'z')]_UNDERFLOW_Years");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer7.putChar((int) (byte) -1, ':');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.weekyears();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.Chronology chronology7 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.hourOfDay();
        boolean boolean9 = dateTimeField8.isSupported();
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 0, chronology6);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        long long10 = chronology3.set((org.joda.time.ReadablePartial) localTime7, (long) (short) 10);
        int int11 = localTime7.getMillisOfSecond();
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        char[] charArray0 = new char[] {};
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer4 = charBuffer1.subSequence((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        java.lang.Thread thread3 = null;
        timeUnit1.timedJoin(thread3, (long) (short) 0);
        long long7 = timeUnit1.toHours((long) 5);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant1 = java.time.Instant.now();
        boolean boolean2 = instant0.isAfter(instant1);
        java.time.Duration duration3 = java.time.Duration.ZERO;
        java.time.Instant instant4 = instant1.minus((java.time.temporal.TemporalAmount) duration3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime6 = offsetTime5.toLocalTime();
        java.time.LocalTime localTime11 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime11);
        java.time.LocalTime localTime17 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime17);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime21 = localTime17.with((java.time.temporal.TemporalField) chronoField19, (long) (short) 1);
        long long22 = localTime11.getLong((java.time.temporal.TemporalField) chronoField19);
        java.time.LocalTime localTime24 = localTime11.withSecond((int) (short) 1);
        int int25 = localTime24.getMinute();
        java.time.LocalTime localTime27 = localTime24.plusHours((long) (-1));
        java.time.OffsetTime offsetTime28 = offsetTime5.with((java.time.temporal.TemporalAdjuster) localTime24);
        java.time.LocalDate localDate30 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int31 = localDate30.getMonthValue();
        org.joda.time.Period period32 = org.joda.time.Period.ZERO;
        org.joda.time.Period period33 = period32.normalizedStandard();
        org.joda.time.Period period35 = period32.plusHours(2);
        java.time.chrono.IsoEra isoEra36 = java.time.chrono.IsoEra.CE;
        boolean boolean37 = period35.equals((java.lang.Object) isoEra36);
        java.time.LocalTime localTime42 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime43 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime42);
        java.time.LocalTime localTime48 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime49 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime48);
        java.time.temporal.ChronoField chronoField50 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime52 = localTime48.with((java.time.temporal.TemporalField) chronoField50, (long) (short) 1);
        long long53 = localTime42.getLong((java.time.temporal.TemporalField) chronoField50);
        boolean boolean54 = isoEra36.isSupported((java.time.temporal.TemporalField) chronoField50);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery55 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period56 = isoEra36.query(periodTemporalQuery55);
        boolean boolean57 = period56.isNegative();
        java.time.Period period59 = period56.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField60 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean61 = period56.equals((java.lang.Object) chronoField60);
        boolean boolean62 = localDate30.isSupported((java.time.temporal.TemporalField) chronoField60);
        java.time.temporal.TemporalUnit temporalUnit63 = chronoField60.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long64 = instant4.until((java.time.temporal.Temporal) offsetTime28, temporalUnit63);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain Instant from TemporalAccessor: 01:00:01.000000001-18:00 of type java.time.OffsetTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField19.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3601000000001L + "'", long22 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + isoEra36 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra36.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + chronoField50 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField50.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 3601000000001L + "'", long53 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + chronoField60 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField60.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit63 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit63.equals(java.time.temporal.ChronoUnit.DAYS));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar5);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.withYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = yearMonthDay9.getField((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.MissingResourceException missingResourceException3 = new java.util.MissingResourceException("Years", "23:59:59.999999999-18:00", "1");
        java.lang.String str4 = missingResourceException3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer2 = longBuffer1.mark();
        java.time.LocalTime localTime7 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime7);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime11 = localTime7.with((java.time.temporal.TemporalField) chronoField9, (long) (short) 1);
        java.time.Duration duration13 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime14 = localTime7.minus((java.time.temporal.TemporalAmount) duration13);
        boolean boolean15 = longBuffer1.equals((java.lang.Object) localTime7);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = longBuffer1.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField9.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 1);
        long long2 = duration1.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3600000L + "'", long2 == 3600000L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.time.Instant instant25 = java.time.Instant.now();
        java.time.Instant instant26 = java.time.Instant.now();
        boolean boolean27 = instant25.isAfter(instant26);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal28 = isoEra4.adjustInto((java.time.temporal.Temporal) instant25);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Era");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.FRIDAY;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period1.normalizedStandard();
        org.joda.time.Period period4 = period1.plusHours(2);
        java.time.chrono.IsoEra isoEra5 = java.time.chrono.IsoEra.CE;
        boolean boolean6 = period4.equals((java.lang.Object) isoEra5);
        java.time.LocalTime localTime11 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime11);
        java.time.LocalTime localTime17 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime17);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime21 = localTime17.with((java.time.temporal.TemporalField) chronoField19, (long) (short) 1);
        long long22 = localTime11.getLong((java.time.temporal.TemporalField) chronoField19);
        boolean boolean23 = isoEra5.isSupported((java.time.temporal.TemporalField) chronoField19);
        boolean boolean24 = dayOfWeek0.isSupported((java.time.temporal.TemporalField) chronoField19);
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.FRIDAY));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + isoEra5 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra5.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField19.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3601000000001L + "'", long22 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime2 = offsetTime1.toLocalTime();
        java.lang.String str3 = offsetTime1.toString();
        java.time.Duration duration4 = java.time.Duration.ZERO;
        java.lang.String str5 = duration4.toString();
        java.time.OffsetTime offsetTime6 = offsetTime1.plus((java.time.temporal.TemporalAmount) duration4);
        java.time.OffsetTime offsetTime8 = offsetTime1.plusNanos((long) 0);
        java.time.LocalTime localTime13 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime14 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime13);
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime17 = localTime13.with((java.time.temporal.TemporalField) chronoField15, (long) (short) 1);
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.lang.String str19 = chronoField15.getDisplayName(locale18);
        java.time.OffsetTime offsetTime21 = offsetTime8.with((java.time.temporal.TemporalField) chronoField15, (long) 28);
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.Period period23 = period22.normalizedStandard();
        org.joda.time.Period period25 = period22.plusHours(2);
        java.time.chrono.IsoEra isoEra26 = java.time.chrono.IsoEra.CE;
        boolean boolean27 = period25.equals((java.lang.Object) isoEra26);
        java.time.LocalTime localTime32 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime33 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime32);
        java.time.LocalTime localTime38 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime39 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime38);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime42 = localTime38.with((java.time.temporal.TemporalField) chronoField40, (long) (short) 1);
        long long43 = localTime32.getLong((java.time.temporal.TemporalField) chronoField40);
        boolean boolean44 = isoEra26.isSupported((java.time.temporal.TemporalField) chronoField40);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery45 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period46 = isoEra26.query(periodTemporalQuery45);
        boolean boolean47 = period46.isNegative();
        java.time.Period period49 = period46.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField50 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean51 = period46.equals((java.lang.Object) chronoField50);
        java.time.chrono.ChronoPeriod chronoPeriod52 = period46.negated();
        java.time.OffsetTime offsetTime53 = offsetTime8.minus((java.time.temporal.TemporalAmount) period46);
        boolean boolean54 = offsetTime0.isBefore(offsetTime8);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23:59:59.999999999-18:00" + "'", str3, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0S" + "'", str5, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField15.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NanoOfDay" + "'", str19, "NanoOfDay");
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + isoEra26 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra26.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField40.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3601000000001L + "'", long43 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + chronoField50 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField50.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(chronoPeriod52);
        org.junit.Assert.assertNotNull(offsetTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        mutablePeriod3.add((int) '#', 0, 10, 0, (int) (byte) 0, (int) (short) 0, 1, (-1));
        mutablePeriod3.clear();
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.Period period15 = period14.normalizedStandard();
        org.joda.time.Period period17 = period14.plusHours(2);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.hours();
        int int19 = period14.indexOf(durationFieldType18);
        mutablePeriod3.set(durationFieldType18, (int) (byte) 10);
        mutablePeriod3.addMonths(3);
        int int24 = mutablePeriod3.getYears();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime14 = localTime10.with((java.time.temporal.TemporalField) chronoField12, (long) (short) 1);
        long long15 = localTime4.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.LocalTime localTime17 = localTime4.withSecond((int) (short) 1);
        int int18 = localTime17.getMinute();
        java.time.LocalTime localTime20 = localTime17.plusHours((long) (-1));
        java.time.LocalDate localDate23 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int24 = localDate23.getMonthValue();
        org.joda.time.Period period25 = org.joda.time.Period.ZERO;
        org.joda.time.Period period26 = period25.normalizedStandard();
        org.joda.time.Period period28 = period25.plusHours(2);
        java.time.chrono.IsoEra isoEra29 = java.time.chrono.IsoEra.CE;
        boolean boolean30 = period28.equals((java.lang.Object) isoEra29);
        java.time.LocalTime localTime35 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime36 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime35);
        java.time.LocalTime localTime41 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime42 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime41);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime45 = localTime41.with((java.time.temporal.TemporalField) chronoField43, (long) (short) 1);
        long long46 = localTime35.getLong((java.time.temporal.TemporalField) chronoField43);
        boolean boolean47 = isoEra29.isSupported((java.time.temporal.TemporalField) chronoField43);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery48 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period49 = isoEra29.query(periodTemporalQuery48);
        boolean boolean50 = period49.isNegative();
        java.time.Period period52 = period49.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField53 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean54 = period49.equals((java.lang.Object) chronoField53);
        boolean boolean55 = localDate23.isSupported((java.time.temporal.TemporalField) chronoField53);
        java.time.temporal.TemporalUnit temporalUnit56 = chronoField53.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal57 = localTime20.minus(9L, temporalUnit56);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Days");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3601000000001L + "'", long15 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + isoEra29 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra29.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField43.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 3601000000001L + "'", long46 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + chronoField53 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField53.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit56 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit56.equals(java.time.temporal.ChronoUnit.DAYS));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime3 = offsetTime2.toLocalTime();
        java.lang.String str4 = offsetTime2.toString();
        java.time.Duration duration5 = java.time.Duration.ZERO;
        java.lang.String str6 = duration5.toString();
        java.time.OffsetTime offsetTime7 = offsetTime2.plus((java.time.temporal.TemporalAmount) duration5);
        java.time.LocalTime localTime8 = offsetTime2.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime9 = localDate1.atTime(localTime8);
        java.time.LocalTime localTime14 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime15 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime14);
        java.time.LocalTime localTime20 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime21 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime20);
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime24 = localTime20.with((java.time.temporal.TemporalField) chronoField22, (long) (short) 1);
        long long25 = localTime14.getLong((java.time.temporal.TemporalField) chronoField22);
        java.time.LocalTime localTime27 = localTime14.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange29 = localTime27.range((java.time.temporal.TemporalField) chronoField28);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange30 = localDate1.range((java.time.temporal.TemporalField) chronoField28);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: SecondOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23:59:59.999999999-18:00" + "'", str4, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime9);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField22.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3601000000001L + "'", long25 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField28.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange29);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(0L);
        java.util.OptionalLong optionalLong2 = longStream1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = longStream1.limit((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(optionalLong2);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        boolean boolean7 = gregorianCalendar5.isSet(0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = property2.addToCopy(21);
        org.joda.time.LocalDateTime localDateTime7 = property2.roundHalfCeilingCopy();
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean10 = offsetDateTime8.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = chronoField9.getDisplayName(locale11);
        java.lang.String str14 = property2.getAsShortText(locale11);
        org.joda.time.LocalDateTime localDateTime16 = property2.addToCopy(86400000L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField9.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "German" + "'", str12, "German");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Stunde" + "'", str13, "Stunde");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "22" + "'", str14, "22");
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.stream.IntStream intStream4 = intStream2.skip((long) 256);
        java.util.PrimitiveIterator.OfInt ofInt5 = intStream4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfInt ofInt6 = intStream4.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(ofInt5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(12, (-1), 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        boolean boolean5 = period3.equals((java.lang.Object) isoEra4);
        int int6 = period3.getWeeks();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(chronology4);
        org.joda.time.DateTimeField dateTimeField7 = chronology4.monthOfYear();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 28, chronology4, locale8, (java.lang.Integer) 0);
        long long13 = dateTimeParserBucket10.computeMillis(true, "Years");
        long long15 = dateTimeParserBucket10.computeMillis(false);
        dateTimeParserBucket10.setOffset(32769);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 28L + "'", long13 == 28L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 28L + "'", long15 == 28L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = duration30.toPeriodTo(readableInstant31, periodType32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(readableInstant34, readableInstant35);
        long long37 = duration36.getMillis();
        boolean boolean38 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 3, chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfYear();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((java.lang.Object) dateTime41, chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime41.toMutableDateTime();
        mutableDateTime45.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime45.dayOfWeek();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime45.year();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.weekyear();
        boolean boolean51 = duration30.equals((java.lang.Object) mutableDateTime45);
        mutableDateTime45.addMonths((int) ' ');
        mutableDateTime45.add((long) (byte) 10);
        org.joda.time.Period period56 = org.joda.time.Period.ZERO;
        org.joda.time.Period period57 = period56.normalizedStandard();
        org.joda.time.Period period59 = period56.plusHours(2);
        java.time.chrono.IsoEra isoEra60 = java.time.chrono.IsoEra.CE;
        boolean boolean61 = period59.equals((java.lang.Object) isoEra60);
        int int62 = period59.getMinutes();
        mutableDateTime45.add((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Hours hours64 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) mutableDateTime17, (org.joda.time.ReadableInstant) mutableDateTime45);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime17.setMinuteOfHour(1024);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1024 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + isoEra60 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra60.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(hours64);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 0, chronology3);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.monthOfYear();
        org.joda.time.Period period9 = new org.joda.time.Period(3601000000001L, periodType1, chronology5);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod10.addMonths(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutablePeriod10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.unordered();
        java.util.OptionalDouble optionalDouble2 = doubleStream0.max();
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = doubleStream0.onClose(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.hoursIn(readableInterval0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 3, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.dayOfYear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((java.lang.Object) dateTime4, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime4.toMutableDateTime();
        mutableDateTime8.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.year();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        mutableDateTime8.setZone(dateTimeZone14);
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.lang.String str18 = dateTimeZone14.getShortName((long) 64, locale17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 3, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfYear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((java.lang.Object) dateTime21, chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime21.toMutableDateTime();
        mutableDateTime25.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime25.dayOfWeek();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime25.year();
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        mutableDateTime25.setZone(dateTimeZone31);
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        java.lang.String str35 = dateTimeZone31.getShortName((long) 64, locale34);
        long long37 = dateTimeZone14.getMillisKeepLocal(dateTimeZone31, (long) 64);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((java.lang.Object) hours1, dateTimeZone31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 64L + "'", long37 == 64L);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.Properties properties0 = new java.util.Properties();
        java.io.OutputStream outputStream1 = null;
        java.io.FilterOutputStream filterOutputStream2 = new java.io.FilterOutputStream(outputStream1);
        // The following exception was thrown during execution in test generation
        try {
            properties0.save((java.io.OutputStream) filterOutputStream2, "gregory");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.time.Duration duration1 = java.time.Duration.ofSeconds((long) 0);
        java.time.Duration duration3 = duration1.multipliedBy((long) (byte) -1);
        java.time.Duration duration4 = duration1.abs();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        float float2 = charsetDecoder1.maxCharsPerByte();
        java.nio.charset.Charset charset3 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder4 = charset3.newDecoder();
        java.nio.charset.Charset charset5 = java.nio.charset.Charset.defaultCharset();
        boolean boolean6 = charset3.contains(charset5);
        java.nio.charset.CharsetEncoder charsetEncoder7 = charset3.newEncoder();
        char[] charArray8 = new char[] {};
        java.nio.CharBuffer charBuffer9 = java.nio.CharBuffer.wrap(charArray8);
        java.nio.ByteBuffer byteBuffer10 = charsetEncoder7.encode(charBuffer9);
        char[] charArray17 = new char[] { '#', '/', '4', 'a', '4', 'u' };
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.wrap(charArray17);
        java.nio.charset.CoderResult coderResult20 = charsetDecoder1.decode(byteBuffer10, charBuffer18, false);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = byteBuffer10.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(charsetDecoder4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(coderResult20);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList21);
        localeList23.clear();
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList25);
        org.joda.time.format.PeriodPrinter periodPrinter28 = null;
        org.joda.time.format.PeriodParser periodParser29 = null;
        org.joda.time.format.PeriodFormatter periodFormatter30 = new org.joda.time.format.PeriodFormatter(periodPrinter28, periodParser29);
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter32 = periodFormatter30.withParseType(periodType31);
        java.util.Locale locale34 = new java.util.Locale("hi!");
        org.joda.time.format.PeriodFormatter periodFormatter35 = periodFormatter30.withLocale(locale34);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale36 = localeList25.set(3600000, locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3600000, Size: 0");
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
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodFormatter32);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertNotNull(periodFormatter35);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(readableInstant4, readableInstant5);
        org.joda.time.Duration duration8 = duration6.withMillis((-1L));
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 0, chronology10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration8, chronology12);
        mutablePeriod3.setPeriod((long) 'a', (long) '/');
        mutablePeriod3.addMinutes((int) (short) 10);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.nio.LongBuffer longBuffer3 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer4 = longBuffer3.mark();
        boolean boolean5 = properties1.containsKey((java.lang.Object) longBuffer3);
        java.nio.charset.Charset charset6 = java.nio.charset.Charset.defaultCharset();
        boolean boolean7 = charset6.canEncode();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 3, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfYear();
        java.lang.Object obj12 = properties1.getOrDefault((java.lang.Object) boolean7, (java.lang.Object) property11);
        properties1.clear();
        int int14 = properties1.size();
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties1.load(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "Property[dayOfYear]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "Property[dayOfYear]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "Property[dayOfYear]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.WEDNESDAY;
        java.time.DayOfWeek dayOfWeek2 = dayOfWeek0.minus((long) (-1));
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.WEDNESDAY));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.THURSDAY));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay1.withSecondOfMinute(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay9 = timeOfDay1.withField(dateTimeFieldType7, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.net.URL uRL0 = null;
        java.net.URLStreamHandler uRLStreamHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL(uRL0, "Years", uRLStreamHandler2);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: Years");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.time.Instant instant0 = java.time.Instant.now();
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusHours(2);
        java.time.chrono.IsoEra isoEra6 = java.time.chrono.IsoEra.CE;
        boolean boolean7 = period5.equals((java.lang.Object) isoEra6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime19 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime18);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime22 = localTime18.with((java.time.temporal.TemporalField) chronoField20, (long) (short) 1);
        long long23 = localTime12.getLong((java.time.temporal.TemporalField) chronoField20);
        boolean boolean24 = isoEra6.isSupported((java.time.temporal.TemporalField) chronoField20);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery25 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period26 = isoEra6.query(periodTemporalQuery25);
        boolean boolean27 = period26.isNegative();
        java.time.Period period29 = period26.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean31 = period26.equals((java.lang.Object) chronoField30);
        java.time.chrono.ChronoPeriod chronoPeriod32 = period26.negated();
        java.time.Instant instant33 = instant0.minus((java.time.temporal.TemporalAmount) chronoPeriod32);
        java.time.LocalDate localDate35 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime37 = offsetTime36.toLocalTime();
        java.lang.String str38 = offsetTime36.toString();
        java.time.Duration duration39 = java.time.Duration.ZERO;
        java.lang.String str40 = duration39.toString();
        java.time.OffsetTime offsetTime41 = offsetTime36.plus((java.time.temporal.TemporalAmount) duration39);
        java.time.LocalTime localTime42 = offsetTime36.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime43 = localDate35.atTime(localTime42);
        java.time.LocalDate localDate45 = localDate35.minusWeeks((long) 2097);
        java.time.OffsetTime offsetTime46 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime47 = offsetTime46.toLocalTime();
        java.lang.String str48 = offsetTime46.toString();
        java.time.Duration duration49 = java.time.Duration.ZERO;
        java.lang.String str50 = duration49.toString();
        java.time.OffsetTime offsetTime51 = offsetTime46.plus((java.time.temporal.TemporalAmount) duration49);
        java.time.OffsetTime offsetTime53 = offsetTime46.plusNanos((long) 0);
        java.time.LocalTime localTime58 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime59 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime58);
        java.time.temporal.ChronoField chronoField60 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime62 = localTime58.with((java.time.temporal.TemporalField) chronoField60, (long) (short) 1);
        java.util.Locale locale63 = java.util.Locale.GERMANY;
        java.lang.String str64 = chronoField60.getDisplayName(locale63);
        java.time.OffsetTime offsetTime66 = offsetTime53.with((java.time.temporal.TemporalField) chronoField60, (long) 28);
        java.time.OffsetDateTime offsetDateTime67 = localDate45.atTime(offsetTime53);
        java.time.OffsetDateTime offsetDateTime68 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField69 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean70 = offsetDateTime68.isSupported((java.time.temporal.TemporalField) chronoField69);
        java.time.temporal.ValueRange valueRange71 = offsetTime53.range((java.time.temporal.TemporalField) chronoField69);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange72 = instant0.range((java.time.temporal.TemporalField) chronoField69);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: HourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + isoEra6 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra6.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3601000000001L + "'", long23 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField30.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronoPeriod32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "23:59:59.999999999-18:00" + "'", str38, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0S" + "'", str40, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "23:59:59.999999999-18:00" + "'", str48, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT0S" + "'", str50, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime51);
        org.junit.Assert.assertNotNull(offsetTime53);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertTrue("'" + chronoField60 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField60.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "NanoOfDay" + "'", str64, "NanoOfDay");
        org.junit.Assert.assertNotNull(offsetTime66);
        org.junit.Assert.assertNotNull(offsetDateTime67);
        org.junit.Assert.assertNotNull(offsetDateTime68);
        org.junit.Assert.assertTrue("'" + chronoField69 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField69.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(valueRange71);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusDays(28);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekyear();
        org.joda.time.DurationField durationField6 = property5.getRangeDurationField();
        org.joda.time.format.PeriodPrinter periodPrinter8 = null;
        org.joda.time.format.PeriodParser periodParser9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = new org.joda.time.format.PeriodFormatter(periodPrinter8, periodParser9);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter10.withParseType(periodType11);
        java.util.Locale locale14 = new java.util.Locale("hi!");
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter10.withLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = property5.setCopy("ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertNotNull(periodFormatter15);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.security.cert.CertificateEncodingException certificateEncodingException0 = new java.security.cert.CertificateEncodingException();
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ZERO;
        org.joda.time.Seconds seconds1 = hours0.toStandardSeconds();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DurationField durationField7 = chronology3.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField7.add((long) 99, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime0.with((java.time.temporal.TemporalField) chronoField1, (long) 10);
        java.lang.String str4 = localDateTime0.toString();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.DAY_OF_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime7 = localDateTime0.with((java.time.temporal.TemporalField) chronoField5, 0L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-21T09:34:10.451" + "'", str4, "2022-02-21T09:34:10.451");
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.DAY_OF_MONTH + "'", chronoField5.equals(java.time.temporal.ChronoField.DAY_OF_MONTH));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = localDate1.atTime(10, 8, 1024);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 1024");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer7.get(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1]");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.lang.String str7 = gregorianCalendar5.getCalendarType();
        java.time.ZonedDateTime zonedDateTime8 = gregorianCalendar5.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.minusMonths((long) 10);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withNano(52);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime14 = zonedDateTime12.withHour(365);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 365");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gregory" + "'", str7, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(chronology4);
        org.joda.time.DateTimeField dateTimeField7 = chronology4.monthOfYear();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 1, chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime8.withEra(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(0L);
        java.util.LongSummaryStatistics longSummaryStatistics2 = new java.util.LongSummaryStatistics();
        longSummaryStatistics2.accept(3);
        long long5 = longSummaryStatistics2.getMax();
        java.util.LongSummaryStatistics longSummaryStatistics6 = new java.util.LongSummaryStatistics();
        longSummaryStatistics6.accept(3);
        java.util.function.LongConsumer longConsumer9 = longSummaryStatistics2.andThen((java.util.function.LongConsumer) longSummaryStatistics6);
        java.util.stream.LongStream longStream10 = longStream1.peek((java.util.function.LongConsumer) longSummaryStatistics6);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray11 = longStream1.toArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertEquals(longSummaryStatistics2.toString(), "LongSummaryStatistics{count=1, sum=3, min=3, average=3.000000, max=3}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3L + "'", long5 == 3L);
        org.junit.Assert.assertEquals(longSummaryStatistics6.toString(), "LongSummaryStatistics{count=1, sum=3, min=3, average=3.000000, max=3}");
        org.junit.Assert.assertNotNull(longConsumer9);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(0L);
        java.util.stream.LongStream longStream2 = longStream1.unordered();
        java.util.function.LongPredicate longPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = longStream2.filter(longPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateTime dateTime9 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime13 = dateTime9.withMillis((long) 28);
        int int14 = dateTime9.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.io.FileNotFoundException fileNotFoundException0 = new java.io.FileNotFoundException();
        java.lang.String str1 = fileNotFoundException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.FileNotFoundException" + "'", str1, "java.io.FileNotFoundException");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime28 = localDateTime25.with((java.time.temporal.TemporalField) chronoField26, (long) 10);
        boolean boolean29 = localDateTime24.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime25);
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.MIN;
        java.time.Month month31 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime32 = localDateTime30.with((java.time.temporal.TemporalAdjuster) month31);
        java.time.LocalDate localDate35 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int36 = localDate35.getMonthValue();
        org.joda.time.Period period37 = org.joda.time.Period.ZERO;
        org.joda.time.Period period38 = period37.normalizedStandard();
        org.joda.time.Period period40 = period37.plusHours(2);
        java.time.chrono.IsoEra isoEra41 = java.time.chrono.IsoEra.CE;
        boolean boolean42 = period40.equals((java.lang.Object) isoEra41);
        java.time.LocalTime localTime47 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime48 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime47);
        java.time.LocalTime localTime53 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime54 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime53);
        java.time.temporal.ChronoField chronoField55 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime57 = localTime53.with((java.time.temporal.TemporalField) chronoField55, (long) (short) 1);
        long long58 = localTime47.getLong((java.time.temporal.TemporalField) chronoField55);
        boolean boolean59 = isoEra41.isSupported((java.time.temporal.TemporalField) chronoField55);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery60 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period61 = isoEra41.query(periodTemporalQuery60);
        boolean boolean62 = period61.isNegative();
        java.time.Period period64 = period61.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField65 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean66 = period61.equals((java.lang.Object) chronoField65);
        boolean boolean67 = localDate35.isSupported((java.time.temporal.TemporalField) chronoField65);
        java.time.temporal.TemporalUnit temporalUnit68 = chronoField65.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime69 = localDateChronoLocalDateTime32.plus(1L, temporalUnit68);
        // The following exception was thrown during execution in test generation
        try {
            long long70 = offsetTime0.until((java.time.temporal.Temporal) localDateTime24, temporalUnit68);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetTime from TemporalAccessor: 2022-02-21T09:34:10.755 of type java.time.LocalDateTime");
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
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField26.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + month31 + "' != '" + java.time.Month.NOVEMBER + "'", month31.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime32);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + isoEra41 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra41.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + chronoField55 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField55.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 3601000000001L + "'", long58 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + chronoField65 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField65.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit68 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit68.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime69);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours2 = hours0.plus(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 32769");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime17.setMinuteOfDay(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '#', 0, 2, (int) (short) 100);
        org.joda.time.Period period6 = period4.withSeconds(12);
        int int7 = period6.getMillis();
        int int8 = period6.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period6.plusHours(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 35 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTime dateTime5 = interval4.getEnd();
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfDay();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = property6.setCopy("January", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"January\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "Wochentag", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Wochentag' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        int int8 = localDateTime3.get(dateTimeFieldType7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property9.setCopy((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2097 + "'", int8 == 2097);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        boolean boolean8 = gregorianCalendar5.isLeapYear(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("java.io.FileNotFoundException", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange4 = java.time.temporal.ValueRange.of(0L, (long) 14, (long) 99, 28L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        float[] floatArray2 = new float[] { (-1L), (byte) -1 };
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.wrap(floatArray2);
        java.nio.FloatBuffer floatBuffer4 = floatBuffer3.compact();
        java.nio.FloatBuffer floatBuffer5 = floatBuffer3.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float6 = floatBuffer3.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(floatBuffer5);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = localDateTime0.minusDays(86399999999999L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -237555165403");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.set(2147483647, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        java.nio.ByteOrder byteOrder8 = byteBuffer7.order();
        // The following exception was thrown during execution in test generation
        try {
            char char10 = byteBuffer7.getChar(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.time.Instant instant0 = java.time.Instant.now();
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusHours(2);
        java.time.chrono.IsoEra isoEra6 = java.time.chrono.IsoEra.CE;
        boolean boolean7 = period5.equals((java.lang.Object) isoEra6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime19 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime18);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime22 = localTime18.with((java.time.temporal.TemporalField) chronoField20, (long) (short) 1);
        long long23 = localTime12.getLong((java.time.temporal.TemporalField) chronoField20);
        boolean boolean24 = isoEra6.isSupported((java.time.temporal.TemporalField) chronoField20);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery25 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period26 = isoEra6.query(periodTemporalQuery25);
        boolean boolean27 = period26.isNegative();
        java.time.Period period29 = period26.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean31 = period26.equals((java.lang.Object) chronoField30);
        java.time.chrono.ChronoPeriod chronoPeriod32 = period26.negated();
        java.time.Instant instant33 = instant0.minus((java.time.temporal.TemporalAmount) chronoPeriod32);
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.MIN;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal35 = instant33.adjustInto((java.time.temporal.Temporal) localDateTime34);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + isoEra6 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra6.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3601000000001L + "'", long23 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField30.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronoPeriod32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.Comparator<java.time.chrono.ChronoLocalDate> chronoLocalDateComparator0 = java.time.chrono.ChronoLocalDate.timeLineOrder();
        org.junit.Assert.assertNotNull(chronoLocalDateComparator0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        char char0 = java.text.CharacterIterator.DONE;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\uffff' + "'", char0 == '\uffff');
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        java.util.Locale locale10 = new java.util.Locale("ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]", "UNDERFLOW", "Years");
        java.lang.String str11 = dateTimeField5.getAsShortText((int) 'u', locale10);
        java.util.GregorianCalendar gregorianCalendar17 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int18 = gregorianCalendar17.getWeeksInWeekYear();
        org.joda.time.YearMonthDay yearMonthDay19 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar17);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.withYear(0);
        java.util.stream.IntStream intStream24 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        int[] intArray25 = intStream24.toArray();
        int int26 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay21, intArray25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) 0, chronology28);
        org.joda.time.LocalTime localTime31 = localTime29.minusMillis(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.monthOfYear();
        boolean boolean33 = localTime31.isSupported(dateTimeFieldType32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int35 = localTime31.indexOf(dateTimeFieldType34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) 0, chronology37);
        org.joda.time.LocalTime localTime40 = localTime38.minusMillis(2022);
        org.joda.time.LocalTime localTime42 = localTime38.plusMillis((int) (byte) 0);
        org.joda.time.LocalTime localTime43 = localTime31.withFields((org.joda.time.ReadablePartial) localTime42);
        java.util.GregorianCalendar gregorianCalendar49 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int50 = gregorianCalendar49.getWeeksInWeekYear();
        java.util.TimeZone timeZone51 = gregorianCalendar49.getTimeZone();
        java.util.Locale locale53 = new java.util.Locale("hi!");
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone51, locale53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localTime31, locale53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals(locale10.toString(), "parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(monthofyear,2)'-'value(dayofmonth,2))[offset(+hh:mm:ss,'z')]_UNDERFLOW_Years");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "117" + "'", str11, "117");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar54);
// flaky:         org.junit.Assert.assertEquals(calendar54.toString(), "java.util.GregorianCalendar[time=1645436051443,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=11,MILLISECOND=443,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.stream.Collector.Characteristics characteristics0 = java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
        org.junit.Assert.assertTrue("'" + characteristics0 + "' != '" + java.util.stream.Collector.Characteristics.IDENTITY_FINISH + "'", characteristics0.equals(java.util.stream.Collector.Characteristics.IDENTITY_FINISH));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) (short) 0);
        boolean boolean2 = longBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer5 = longBuffer1.put(9, (long) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.joda.time.DateMidnight dateMidnight20 = property18.addToCopy(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight22 = property18.setCopy("Optional.empty");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Optional.empty\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateMidnight20);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress[] inetAddressArray1 = java.net.InetAddress.getAllByName("23:59:59.999999999-18:00");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 23:59:59.999999999-18:00: invalid IPv6 address");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str1 = dateTimeFormatter0.toString();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery3 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period4 = localDateTime2.query(periodTemporalQuery3);
        java.text.Format format5 = dateTimeFormatter0.toFormat(periodTemporalQuery3);
        java.time.chrono.Chronology chronology6 = dateTimeFormatter0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Era era8 = chronology6.eraOf(4);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid era: 4");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]" + "'", str1, "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(periodTemporalQuery3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.time.Period period30 = period24.minusYears((long) 10);
        org.joda.time.Period period31 = org.joda.time.Period.ZERO;
        org.joda.time.Period period32 = period31.normalizedStandard();
        org.joda.time.Period period34 = period31.plusHours(2);
        java.time.chrono.IsoEra isoEra35 = java.time.chrono.IsoEra.CE;
        boolean boolean36 = period34.equals((java.lang.Object) isoEra35);
        java.time.LocalTime localTime41 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime42 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime41);
        java.time.LocalTime localTime47 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime48 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime47);
        java.time.temporal.ChronoField chronoField49 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime51 = localTime47.with((java.time.temporal.TemporalField) chronoField49, (long) (short) 1);
        long long52 = localTime41.getLong((java.time.temporal.TemporalField) chronoField49);
        boolean boolean53 = isoEra35.isSupported((java.time.temporal.TemporalField) chronoField49);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery54 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period55 = isoEra35.query(periodTemporalQuery54);
        java.time.chrono.ChronoPeriod chronoPeriod56 = period30.minus((java.time.temporal.TemporalAmount) period55);
        int int57 = period30.getYears();
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
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + isoEra35 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra35.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + chronoField49 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField49.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3601000000001L + "'", long52 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(chronoPeriod56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-10) + "'", int57 == (-10));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusDays((int) ':');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withEra(256);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 256 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        mutablePeriod3.add((int) '#', 0, 10, 0, (int) (byte) 0, (int) (short) 0, 1, (-1));
        mutablePeriod3.addSeconds(306);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer2 = longBuffer1.mark();
        java.time.LocalTime localTime7 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime7);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime11 = localTime7.with((java.time.temporal.TemporalField) chronoField9, (long) (short) 1);
        java.time.Duration duration13 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime14 = localTime7.minus((java.time.temporal.TemporalAmount) duration13);
        boolean boolean15 = longBuffer1.equals((java.lang.Object) localTime7);
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime17 = localDateTime16.toLocalTime();
        java.util.Properties properties18 = null;
        java.util.Properties properties19 = new java.util.Properties(properties18);
        java.time.LocalTime localTime24 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime25 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime24);
        java.time.LocalTime localTime30 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime31 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime30);
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime34 = localTime30.with((java.time.temporal.TemporalField) chronoField32, (long) (short) 1);
        long long35 = localTime24.getLong((java.time.temporal.TemporalField) chronoField32);
        java.time.LocalTime localTime37 = localTime24.withSecond((int) (short) 1);
        java.lang.Object obj39 = properties19.put((java.lang.Object) localTime37, (java.lang.Object) "117");
        java.time.LocalDateTime localDateTime40 = java.time.LocalDateTime.MIN;
        java.time.Month month41 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime42 = localDateTime40.with((java.time.temporal.TemporalAdjuster) month41);
        java.time.LocalDate localDate45 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int46 = localDate45.getMonthValue();
        org.joda.time.Period period47 = org.joda.time.Period.ZERO;
        org.joda.time.Period period48 = period47.normalizedStandard();
        org.joda.time.Period period50 = period47.plusHours(2);
        java.time.chrono.IsoEra isoEra51 = java.time.chrono.IsoEra.CE;
        boolean boolean52 = period50.equals((java.lang.Object) isoEra51);
        java.time.LocalTime localTime57 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime58 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime57);
        java.time.LocalTime localTime63 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime64 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime63);
        java.time.temporal.ChronoField chronoField65 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime67 = localTime63.with((java.time.temporal.TemporalField) chronoField65, (long) (short) 1);
        long long68 = localTime57.getLong((java.time.temporal.TemporalField) chronoField65);
        boolean boolean69 = isoEra51.isSupported((java.time.temporal.TemporalField) chronoField65);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery70 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period71 = isoEra51.query(periodTemporalQuery70);
        boolean boolean72 = period71.isNegative();
        java.time.Period period74 = period71.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField75 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean76 = period71.equals((java.lang.Object) chronoField75);
        boolean boolean77 = localDate45.isSupported((java.time.temporal.TemporalField) chronoField75);
        java.time.temporal.TemporalUnit temporalUnit78 = chronoField75.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime79 = localDateChronoLocalDateTime42.plus(1L, temporalUnit78);
        java.time.LocalTime localTime80 = localTime37.truncatedTo(temporalUnit78);
        // The following exception was thrown during execution in test generation
        try {
            long long81 = localTime7.until((java.time.temporal.Temporal) localTime17, temporalUnit78);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Days");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField9.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3601000000001L + "'", long35 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + month41 + "' != '" + java.time.Month.NOVEMBER + "'", month41.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime42);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + isoEra51 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra51.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + chronoField65 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField65.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 3601000000001L + "'", long68 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertTrue("'" + chronoField75 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField75.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit78 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit78.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime79);
        org.junit.Assert.assertNotNull(localTime80);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        short[] shortArray2 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        short[] shortArray6 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        java.nio.ShortBuffer shortBuffer8 = shortBuffer3.put(shortBuffer7);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer10 = shortBuffer7.put((short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        int int6 = dateTimeField5.getMaximumValue();
        org.joda.time.DurationField durationField7 = dateTimeField5.getLeapDurationField();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfCentury((int) 'a');
        int int12 = localDateTime11.getDayOfMonth();
        int int13 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 3, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((java.lang.Object) dateTime18, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime18.toMutableDateTime();
        mutableDateTime22.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.dayOfWeek();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.year();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        mutableDateTime22.setZone(dateTimeZone28);
        java.util.Locale locale31 = java.util.Locale.TAIWAN;
        java.lang.String str32 = dateTimeZone28.getShortName((long) 64, locale31);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = dateTimeField5.set((long) 10800000, "yearOfCentury", locale31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfCentury\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 366 + "'", int6 == 366);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 365 + "'", int13 == 365);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.time.Month month0 = java.time.Month.APRIL;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = month0.range((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfSecond");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.APRIL + "'", month0.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isMCOrgLocal();
        float[] floatArray4 = new float[] { (-1L), (byte) -1 };
        java.nio.FloatBuffer floatBuffer5 = java.nio.FloatBuffer.wrap(floatArray4);
        boolean boolean6 = inetAddress0.equals((java.lang.Object) floatBuffer5);
        boolean boolean8 = inetAddress0.isReachable(306);
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        boolean boolean2 = charset0.isRegistered();
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) -1, 1970, 4, 5, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((-9223372036854775808L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -9223372036854775808 * 3600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(0L);
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = longStream1.reduce((long) 10, longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours14 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay11, (org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay13.withFieldAdded(durationFieldType15, (int) (byte) 0);
        org.joda.time.Period period19 = period9.withFieldAdded(durationFieldType15, 4);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) period9);
        mutableDateTime6.addMonths(1970);
        mutableDateTime6.addWeeks(16);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks(292269054);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight7);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(10800000);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = byteBuffer1.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 3, chronology32);
        org.joda.time.Period period34 = org.joda.time.Period.ZERO;
        org.joda.time.Period period35 = period34.normalizedStandard();
        org.joda.time.Period period37 = period35.minusMinutes((int) ' ');
        org.joda.time.Period period39 = period37.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType40 = period39.getPeriodType();
        org.joda.time.DateTime dateTime41 = dateTime33.minus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.DateTime dateTime43 = dateTime33.plusHours(34);
        int int44 = dateTime33.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval8.setStart((org.joda.time.ReadableInstant) dateTime33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.UNDERFLOW;
        boolean boolean1 = coderResult0.isError();
        java.lang.String str2 = coderResult0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) str2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UNDERFLOW\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(coderResult0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNDERFLOW" + "'", str2, "UNDERFLOW");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList21);
        localeList23.clear();
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList25);
        java.util.stream.Collector.Characteristics characteristics27 = java.util.stream.Collector.Characteristics.UNORDERED;
        boolean boolean28 = localeList25.contains((java.lang.Object) characteristics27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale> localeItor30 = localeList25.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
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
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertTrue("'" + characteristics27 + "' != '" + java.util.stream.Collector.Characteristics.UNORDERED + "'", characteristics27.equals(java.util.stream.Collector.Characteristics.UNORDERED));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateMidnight dateMidnight1 = yearMonthDay0.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.property(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdayOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        short[] shortArray2 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        short[] shortArray6 = new short[] { (byte) 0, (short) 1 };
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer10 = shortBuffer3.put(shortArray6, 306, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 1]");
        org.junit.Assert.assertNotNull(shortBuffer7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.monthOfYear();
        boolean boolean6 = localTime4.isSupported(dateTimeFieldType5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int8 = localTime4.indexOf(dateTimeFieldType7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 0, chronology10);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(2022);
        org.joda.time.LocalTime localTime15 = localTime11.plusMillis((int) (byte) 0);
        org.joda.time.LocalTime localTime16 = localTime4.withFields((org.joda.time.ReadablePartial) localTime15);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime4.getValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) 12, dateTimeZone2);
        org.joda.time.Instant instant4 = dateMidnight3.toInstant();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDayOfYear((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateMidnight6);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.standardWeeksIn(readablePeriod0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.millisOfDay();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.halfdays();
        int int12 = periodType10.indexOf(durationFieldType11);
        mutableDateTime6.add(durationFieldType11, (int) 'a');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime6.yearOfEra();
        mutableDateTime6.setDayOfYear(100);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis(2022);
        org.joda.time.LocalTime localTime6 = localTime2.plusMillis((int) (byte) 0);
        int int7 = localTime6.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localTime6.getFieldType(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        char[] charArray0 = new char[] {};
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer4 = charBuffer1.subSequence((int) (byte) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1024);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleStream1.forEachOrdered(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        short[] shortArray2 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        short[] shortArray6 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        java.nio.ShortBuffer shortBuffer8 = shortBuffer3.put(shortBuffer7);
        short[] shortArray11 = new short[] { (byte) 0, (short) 1 };
        java.nio.ShortBuffer shortBuffer12 = java.nio.ShortBuffer.wrap(shortArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer15 = shortBuffer7.get(shortArray11, (int) 'u', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(shortBuffer12);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        char[] charArray0 = new char[] {};
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer5 = charBuffer1.put("2022-02-21T09:34:08.903Z", (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.Date date7 = new java.util.Date();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromDateFields(date7);
        gregorianCalendar5.setGregorianChange(date7);
        boolean boolean11 = gregorianCalendar5.isSet(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 21 09:34:14 UTC 2022");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        float float2 = charsetDecoder1.maxCharsPerByte();
        java.nio.charset.Charset charset3 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder4 = charset3.newDecoder();
        java.nio.charset.Charset charset5 = java.nio.charset.Charset.defaultCharset();
        boolean boolean6 = charset3.contains(charset5);
        java.nio.charset.CharsetEncoder charsetEncoder7 = charset3.newEncoder();
        char[] charArray8 = new char[] {};
        java.nio.CharBuffer charBuffer9 = java.nio.CharBuffer.wrap(charArray8);
        java.nio.ByteBuffer byteBuffer10 = charsetEncoder7.encode(charBuffer9);
        char[] charArray17 = new char[] { '#', '/', '4', 'a', '4', 'u' };
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.wrap(charArray17);
        java.nio.charset.CoderResult coderResult20 = charsetDecoder1.decode(byteBuffer10, charBuffer18, false);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = coderResult20.length();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(charsetDecoder4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(coderResult20);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.stream.Stream.Builder<java.util.stream.Collector.Characteristics> characteristicsBuilder0 = java.util.stream.Stream.builder();
        org.junit.Assert.assertNotNull(characteristicsBuilder0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.String str12 = localDate11.toString();
        java.time.LocalDate localDate14 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime15 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime16 = offsetTime15.toLocalTime();
        java.lang.String str17 = offsetTime15.toString();
        java.time.Duration duration18 = java.time.Duration.ZERO;
        java.lang.String str19 = duration18.toString();
        java.time.OffsetTime offsetTime20 = offsetTime15.plus((java.time.temporal.TemporalAmount) duration18);
        java.time.LocalTime localTime21 = offsetTime15.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime22 = localDate14.atTime(localTime21);
        java.time.LocalDate localDate24 = localDate14.minusWeeks((long) 2097);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone27);
        long long31 = dateTimeZone27.convertLocalToUTC((long) 3, false);
        long long34 = dateTimeZone27.convertLocalToUTC(0L, true);
        boolean boolean35 = localDate14.equals((java.lang.Object) true);
        int int36 = localDate14.lengthOfMonth();
        java.time.temporal.Temporal temporal37 = localDate11.adjustInto((java.time.temporal.Temporal) localDate14);
        java.time.OffsetTime offsetTime38 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime39 = offsetTime38.toLocalTime();
        java.time.OffsetTime offsetTime40 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime41 = offsetTime40.toLocalTime();
        java.lang.String str42 = offsetTime40.toString();
        java.time.Duration duration43 = java.time.Duration.ZERO;
        java.lang.String str44 = duration43.toString();
        java.time.OffsetTime offsetTime45 = offsetTime40.plus((java.time.temporal.TemporalAmount) duration43);
        java.time.OffsetTime offsetTime47 = offsetTime40.plusNanos((long) 0);
        java.time.LocalTime localTime52 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime53 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime52);
        java.time.temporal.ChronoField chronoField54 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime56 = localTime52.with((java.time.temporal.TemporalField) chronoField54, (long) (short) 1);
        java.util.Locale locale57 = java.util.Locale.GERMANY;
        java.lang.String str58 = chronoField54.getDisplayName(locale57);
        java.time.OffsetTime offsetTime60 = offsetTime47.with((java.time.temporal.TemporalField) chronoField54, (long) 28);
        long long61 = localTime39.getLong((java.time.temporal.TemporalField) chronoField54);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate63 = localDate14.with((java.time.temporal.TemporalField) chronoField54, (long) 5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1929-11-25" + "'", str12, "1929-11-25");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "23:59:59.999999999-18:00" + "'", str17, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0S" + "'", str19, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3L + "'", long31 == 3L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 28 + "'", int36 == 28);
        org.junit.Assert.assertNotNull(temporal37);
        org.junit.Assert.assertNotNull(offsetTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "23:59:59.999999999-18:00" + "'", str42, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT0S" + "'", str44, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime45);
        org.junit.Assert.assertNotNull(offsetTime47);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + chronoField54 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField54.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "NanoOfDay" + "'", str58, "NanoOfDay");
        org.junit.Assert.assertNotNull(offsetTime60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 86399999999999L + "'", long61 == 86399999999999L);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis(2022);
        org.joda.time.LocalTime localTime6 = localTime4.minusHours(3);
        int int7 = localTime6.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.Month month2 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime1.with((java.time.temporal.TemporalAdjuster) month2);
        int int4 = month2.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of(16, month2, 256, (int) ':', (int) ':', (int) ':');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 256");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.NOVEMBER + "'", month2.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 3, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.DateTime dateTime8 = dateTime6.withEarlierOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            printStream3.println((java.lang.Object) dateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(readableInstant4, readableInstant5);
        org.joda.time.Duration duration8 = duration6.withMillis((-1L));
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 0, chronology10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration8, chronology12);
        java.lang.Object obj14 = null;
        boolean boolean15 = duration8.equals(obj14);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        char[] charArray6 = new char[] { '#', '/', '4', 'a', '4', 'u' };
        java.nio.CharBuffer charBuffer7 = java.nio.CharBuffer.wrap(charArray6);
        char[] charArray8 = new char[] {};
        java.nio.CharBuffer charBuffer9 = java.nio.CharBuffer.wrap(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer12 = charBuffer7.put(charArray8, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNotNull(charBuffer9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period1.normalizedStandard();
        org.joda.time.Period period4 = period1.plusHours(2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        int int6 = period1.indexOf(durationFieldType5);
        mutablePeriod0.add(durationFieldType5, (int) (short) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 0, chronology11);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.monthOfYear();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 1, chronology13);
        org.joda.time.DurationField durationField18 = durationFieldType5.getField(chronology13);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) 0, chronology20);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.weekyearOfCentury();
        org.joda.time.DurationField durationField24 = chronology22.weekyears();
        org.joda.time.DurationField durationField25 = chronology22.seconds();
        org.joda.time.Chronology chronology26 = chronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = chronology22.hourOfDay();
        org.joda.time.DurationField durationField28 = chronology22.years();
        int int29 = durationField18.compareTo(durationField28);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Optional.empty", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=optional.empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.time.Month month1 = java.time.Month.NOVEMBER;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of((int) '#', month1, 2, 57, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 57");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.NOVEMBER + "'", month1.equals(java.time.Month.NOVEMBER));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        float[] floatArray2 = new float[] { (-1L), (byte) -1 };
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.wrap(floatArray2);
        java.nio.FloatBuffer floatBuffer4 = floatBuffer3.compact();
        java.nio.FloatBuffer floatBuffer5 = floatBuffer3.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder6 = floatBuffer3.order();
        float[] floatArray9 = new float[] { (-1L), (byte) -1 };
        java.nio.FloatBuffer floatBuffer10 = java.nio.FloatBuffer.wrap(floatArray9);
        java.nio.FloatBuffer floatBuffer11 = floatBuffer10.compact();
        java.nio.FloatBuffer floatBuffer12 = floatBuffer10.asReadOnlyBuffer();
        float[] floatArray13 = floatBuffer10.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer16 = floatBuffer3.put(floatArray13, (int) ':', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(floatBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatBuffer10);
        org.junit.Assert.assertNotNull(floatBuffer11);
        org.junit.Assert.assertNotNull(floatBuffer12);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, -1.0]");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        char[] charArray6 = new char[] { '#', '/', '4', 'a', '4', 'u' };
        java.nio.CharBuffer charBuffer7 = java.nio.CharBuffer.wrap(charArray6);
        java.nio.CharBuffer charBuffer8 = charBuffer7.compact();
        // The following exception was thrown during execution in test generation
        try {
            char char10 = charBuffer8.charAt(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charBuffer8);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.time.Duration duration1 = java.time.Duration.ofMinutes((long) 3);
        java.time.Duration duration2 = duration1.abs();
        int int3 = duration2.getNano();
        java.lang.Object obj4 = null;
        boolean boolean5 = duration2.equals(obj4);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.SATURDAY;
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.SATURDAY));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = java.time.ZoneId.SHORT_IDS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strMap0.put("Chinese", "3");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addSeconds((-1));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        short[] shortArray2 = new short[] { (byte) 0, (short) 1 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        short[] shortArray9 = new short[] { (short) 0, (short) 0, (short) 1, (short) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer10 = shortBuffer3.get(shortArray9);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 0, 1, 100, 100]");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateTime dateTime9 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.LocalTime localTime11 = localTime2.plusHours(3);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 3, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.Period period17 = org.joda.time.Period.ZERO;
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period20 = period18.minusMinutes((int) ' ');
        org.joda.time.Period period22 = period20.withMinutes(32769);
        boolean boolean23 = interval16.equals((java.lang.Object) period22);
        org.joda.time.LocalTime localTime25 = localTime11.withPeriodAdded((org.joda.time.ReadablePeriod) period22, (int) (byte) 100);
        org.joda.time.LocalTime localTime27 = localTime11.plusSeconds(14);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = localTime27.get(dateTimeFieldType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.TimeZone timeZone7 = gregorianCalendar5.getTimeZone();
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone7, locale9);
        java.util.GregorianCalendar gregorianCalendar16 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int17 = gregorianCalendar16.getWeeksInWeekYear();
        java.util.TimeZone timeZone18 = gregorianCalendar16.getTimeZone();
        java.util.Locale locale20 = new java.util.Locale("hi!");
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone18, locale20);
        java.lang.String str22 = timeZone7.getDisplayName(locale20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645436055427,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=15,MILLISECOND=427,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1645436055427,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=15,MILLISECOND=427,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.millisOfDay();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.halfdays();
        int int12 = periodType10.indexOf(durationFieldType11);
        mutableDateTime6.add(durationFieldType11, (int) 'a');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.addWrapField(0);
        mutableDateTime17.setMillisOfSecond(3);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        boolean boolean17 = localDate15.isLeapYear();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 22);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        float[] floatArray2 = new float[] { (-1L), (byte) -1 };
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.wrap(floatArray2);
        java.nio.FloatBuffer floatBuffer4 = floatBuffer3.compact();
        boolean boolean5 = floatBuffer4.isDirect();
        float[] floatArray9 = new float[] { 292269054, 14, 21 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer10 = floatBuffer4.get(floatArray9);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[2.92269056E8, 14.0, 21.0]");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate1 = offsetDateTime0.toLocalDate();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean4 = offsetDateTime2.isSupported((java.time.temporal.TemporalField) chronoField3);
        boolean boolean5 = offsetDateTime0.isEqual(offsetDateTime2);
        java.util.GregorianCalendar gregorianCalendar11 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int12 = gregorianCalendar11.getWeeksInWeekYear();
        java.lang.String str13 = gregorianCalendar11.getCalendarType();
        java.time.ZonedDateTime zonedDateTime14 = gregorianCalendar11.toZonedDateTime();
        java.util.GregorianCalendar gregorianCalendar20 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int21 = gregorianCalendar20.getWeeksInWeekYear();
        java.lang.String str22 = gregorianCalendar20.getCalendarType();
        java.time.ZonedDateTime zonedDateTime23 = gregorianCalendar20.toZonedDateTime();
        int int24 = zonedDateTime14.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime23);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime25 = zonedDateTime14.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal26 = offsetDateTime2.adjustInto((java.time.temporal.Temporal) localDateChronoLocalDateTime25);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "gregory" + "'", str22, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime25);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime14 = localTime10.with((java.time.temporal.TemporalField) chronoField12, (long) (short) 1);
        long long15 = localTime4.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.LocalTime localTime17 = localTime4.withSecond((int) (short) 1);
        int int18 = localTime17.getMinute();
        java.time.LocalTime localTime20 = localTime17.plusHours((long) (-1));
        java.time.LocalTime localTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = localTime17.isBefore(localTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3601000000001L + "'", long15 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        java.nio.ByteOrder byteOrder8 = byteBuffer7.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer7.putInt(64);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(2022, (int) ' ', 10800000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.net.SocketException socketException0 = new java.net.SocketException();
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.millisOfDay();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.halfdays();
        int int12 = periodType10.indexOf(durationFieldType11);
        mutableDateTime6.add(durationFieldType11, (int) 'a');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.add(32769);
        org.joda.time.ReadableInstant readableInstant19 = null;
        mutableDateTime18.setMillis(readableInstant19);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.unordered();
        java.util.OptionalDouble optionalDouble2 = doubleStream0.max();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = doubleStream0.skip((long) 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = new java.net.URL(uRL0, "Subject:\n");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: subject");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.Date date6 = new java.util.Date((int) (byte) 100, 4, 306, (int) ':', 52, (int) ' ');
        int int7 = date6.getDay();
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 04 10:52:32 UTC 2001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 0, chronology6);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        long long10 = chronology3.set((org.joda.time.ReadablePartial) localTime7, (long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = chronology3.getZone();
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        mutablePeriod3.add((int) '#', 0, 10, 0, (int) (byte) 0, (int) (short) 0, 1, (-1));
        mutablePeriod3.clear();
        mutablePeriod3.setYears((int) (byte) 10);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray4 = new java.util.Locale[] { locale3 };
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList5);
        java.util.Spliterator<java.util.Locale> localeSpliterator8 = localeList5.spliterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertNotNull(localeSpliterator8);
    }
}
