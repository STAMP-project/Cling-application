import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByIndex((int) (short) 0);
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.time.LocalTime localTime0 = null;
        java.time.ZoneOffset zoneOffset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime2 = java.time.OffsetTime.of(localTime0, zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: time");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.READ;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.READ + "'", accessMode0.equals(java.nio.file.AccessMode.READ));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        long[] longArray4 = new long[] { 0L, 0L, 1L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer7 = java.nio.LongBuffer.wrap(longArray4, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 0, 1, -1]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.net.URL uRL0 = null;
        java.net.URLStreamHandler uRLStreamHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL(uRL0, "", uRLStreamHandler2);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type2 = null;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] { type2 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.temporal.TemporalUnit temporalUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime4 = offsetTime0.truncatedTo(temporalUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Locale locale0 = java.util.Locale.US;
        boolean boolean2 = locale0.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.SUNDAY;
        java.time.format.TextStyle textStyle1 = null;
        java.util.Locale locale2 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dayOfWeek0.getDisplayName(textStyle1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: textStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.SUNDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.SUNDAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int0 = org.mockito.cglib.core.CodeEmitter.GT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 157 + "'", int0 == 157);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.parse((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.security.ProtectionDomain protectionDomain0 = null;
        java.security.ProtectionDomain[] protectionDomainArray1 = new java.security.ProtectionDomain[] { protectionDomain0 };
        java.security.AccessControlContext accessControlContext2 = new java.security.AccessControlContext(protectionDomainArray1);
        java.security.Permission permission3 = null;
        // The following exception was thrown during execution in test generation
        try {
            accessControlContext2.checkPermission(permission3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: permission can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(protectionDomainArray1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.of((int) (short) 100, (int) (short) 1, (int) '#', 1, 0, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 35");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.time.Month month1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of((int) (byte) -1, month1, (-1), (int) (byte) 10, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int0 = org.mockito.cglib.core.CodeEmitter.ADD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate3 = java.time.LocalDate.of((int) '4', 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.SUNDAY;
        int int1 = dayOfWeek0.getValue();
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.SUNDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.SUNDAY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.temporal.TemporalUnit temporalUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime6 = offsetTime0.minus(0L, temporalUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime4 = java.time.LocalTime.of((int) ' ', (int) (byte) 0, 8, 157);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.time.Instant instant0 = null;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: instant");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.time.Clock clock0 = null;
        java.time.Duration duration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock2 = java.time.Clock.tick(clock0, duration1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseClock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.net.UnknownHostException unknownHostException1 = new java.net.UnknownHostException();
        java.security.GeneralSecurityException generalSecurityException2 = new java.security.GeneralSecurityException("hi!", (java.lang.Throwable) unknownHostException1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("");
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor4 = dateTimeFormatter1.parseUnresolved((java.lang.CharSequence) "hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofPattern("");
        java.util.Locale locale3 = java.util.Locale.US;
        java.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime5 = java.time.OffsetTime.parse((java.lang.CharSequence) "", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed: Unable to obtain OffsetTime from TemporalAccessor: {},ISO of type java.time.format.Parsed");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress1 = java.net.InetAddress.getByAddress(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.time.Month month0 = java.time.Month.DECEMBER;
        java.time.DayOfWeek dayOfWeek2 = java.time.DayOfWeek.SUNDAY;
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime5 = offsetTime3.plusMinutes(100L);
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime3);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime9 = offsetTime7.plusMinutes(100L);
        java.time.LocalTime localTime10 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime7);
        boolean boolean11 = localTime6.isAfter(localTime10);
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition13 = null;
        java.time.OffsetTime offsetTime14 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime16 = offsetTime14.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime18 = offsetTime14.withOffsetSameInstant(zoneOffset17);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime22 = offsetTime20.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime24 = offsetTime20.withOffsetSameInstant(zoneOffset23);
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransitionRule zoneOffsetTransitionRule25 = java.time.zone.ZoneOffsetTransitionRule.of(month0, 10, dayOfWeek2, localTime6, true, timeDefinition13, zoneOffset17, zoneOffset19, zoneOffset23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: timeDefnition");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.DECEMBER + "'", month0.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.SUNDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.SUNDAY));
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetTime24);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.net.URLStreamHandlerFactory uRLStreamHandlerFactory0 = null;
        java.net.URL.setURLStreamHandlerFactory(uRLStreamHandlerFactory0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.time.temporal.ValueRange valueRange2 = java.time.temporal.ValueRange.of((long) (byte) -1, (long) 'a');
        boolean boolean4 = valueRange2.isValidIntValue((long) 0);
        org.junit.Assert.assertNotNull(valueRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.nativeOrder();
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.temporal.TemporalField temporalField1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = zoneOffset0.range(temporalField1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: field");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime8 = offsetTime4.withOffsetSameInstant(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime3.atOffset(zoneOffset7);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime12 = offsetTime10.plusMinutes(100L);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime14 = localTime3.with((java.time.temporal.TemporalAdjuster) offsetTime10);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Comparator<java.util.Date> dateComparator0 = java.util.Comparator.naturalOrder();
        org.junit.Assert.assertNotNull(dateComparator0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long8 = offsetTime4.getLong((java.time.temporal.TemporalField) chronoField7);
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField7.getRangeUnit();
        boolean boolean10 = localTime3.isSupported(temporalUnit9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime11 = java.time.OffsetTime.from((java.time.temporal.TemporalAccessor) localTime3);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetTime from TemporalAccessor: 23:59:59.999999999 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86399999999999L + "'", long8 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.SHORT_STANDALONE;
        java.time.format.TextStyle textStyle1 = textStyle0.asNormal();
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle0.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.SHORT + "'", textStyle1.equals(java.time.format.TextStyle.SHORT));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.security.SignatureException signatureException1 = new java.security.SignatureException("");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.BIG_ENDIAN;
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.SUNDAY;
        java.time.DayOfWeek dayOfWeek2 = dayOfWeek0.plus((long) 10);
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.SUNDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.SUNDAY));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.WEDNESDAY));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange4 = java.time.temporal.ValueRange.of((long) 64, (long) 0, (long) (byte) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest minimum value must be less than largest minimum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Block block1 = new org.mockito.cglib.core.Block(codeEmitter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.function.DoublePredicate doublePredicate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = doubleStream0.anyMatch(doublePredicate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.time.LocalDateTime localDateTime0 = null;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime3 = offsetTime1.plusMinutes(100L);
        java.time.LocalTime localTime4 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime1);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime9 = offsetTime5.withOffsetSameInstant(zoneOffset8);
        java.time.OffsetTime offsetTime10 = localTime4.atOffset(zoneOffset8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.of(localDateTime0, (java.time.ZoneId) zoneOffset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: localDateTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.time.format.FormatStyle formatStyle0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: dateTimeStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "Germany", dateTimeFormatter2);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Germany' could not be parsed, unparsed text found at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.plusMinutes(100L);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime4);
        boolean boolean8 = localTime3.isAfter(localTime7);
        int int9 = localTime3.getMinute();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.YEAR_OF_ERA;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = offsetTime0.get((java.time.temporal.TemporalField) chronoField3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: YearOfEra");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.YEAR_OF_ERA + "'", chronoField3.equals(java.time.temporal.ChronoField.YEAR_OF_ERA));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.HOURS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MICROSECONDS;
        long long3 = timeUnit0.convert((long) 96, timeUnit2);
        long long5 = timeUnit0.toNanos((long) 96);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertNotNull(timeUnit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 345600000000000L + "'", long5 == 345600000000000L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int int0 = org.mockito.asm.ClassReader.SKIP_DEBUG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime4 = offsetTime2.withSecond(64);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 64");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str0 = java.io.File.pathSeparator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset1 = java.nio.charset.Charset.forName("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime1 = java.time.OffsetTime.parse((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.time.LocalTime localTime0 = java.time.LocalTime.MIN;
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int int0 = org.mockito.cglib.core.CodeEmitter.GE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.LONG;
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle0.equals(java.time.format.FormatStyle.LONG));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long8 = offsetTime4.getLong((java.time.temporal.TemporalField) chronoField7);
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField7.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal10 = offsetTime2.minus((long) 64, temporalUnit9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Days");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86399999999999L + "'", long8 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.DAYS));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption openOption1 = null;
        java.nio.file.OpenOption[] openOptionArray2 = new java.nio.file.OpenOption[] { openOption1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.AsynchronousFileChannel asynchronousFileChannel3 = java.nio.channels.AsynchronousFileChannel.open(path0, openOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int int0 = org.mockito.asm.ClassReader.SKIP_FRAMES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int int0 = org.mockito.cglib.core.CodeEmitter.SUB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Date date0 = new java.util.Date();
        date0.setSeconds(0);
        java.time.Instant instant3 = date0.toInstant();
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.minusMinutes((long) (byte) 0);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime9 = offsetTime7.plusMinutes(100L);
        int int10 = offsetTime6.compareTo(offsetTime9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant11 = instant3.with((java.time.temporal.TemporalAdjuster) offsetTime9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 09:13:00 UTC 2022");
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.PrimitiveIterator.OfDouble ofDouble1 = doubleStream0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.Double> doubleItor2 = doubleStream0.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(ofDouble1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream0, true, ":");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.time.LocalDate localDate0 = null;
        java.time.LocalDate localDate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period2 = java.time.Period.between(localDate0, localDate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        org.junit.Assert.assertNotNull(timeUnit0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.UnsupportedEncodingException unsupportedEncodingException0 = new java.io.UnsupportedEncodingException();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.time.LocalDateTime localDateTime0 = null;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime3 = offsetTime1.plusMinutes(100L);
        java.time.LocalTime localTime4 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime1);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime9 = offsetTime5.withOffsetSameInstant(zoneOffset8);
        java.time.OffsetTime offsetTime10 = localTime4.atOffset(zoneOffset8);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime13 = offsetTime11.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime15 = offsetTime11.withOffsetSameInstant(zoneOffset14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = java.time.ZonedDateTime.ofStrict(localDateTime0, zoneOffset8, (java.time.ZoneId) zoneOffset14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: localDateTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(offsetTime15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        float[] floatArray5 = new float[] { 0, (short) -1, 100, '#', 'a' };
        java.nio.FloatBuffer floatBuffer8 = java.nio.FloatBuffer.wrap(floatArray5, (int) (short) 1, (int) (short) 0);
        float[] floatArray9 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer12 = floatBuffer8.get(floatArray9, 64, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 100.0, 35.0, 97.0]");
        org.junit.Assert.assertNotNull(floatBuffer8);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        int int1 = offsetTime0.getHour();
        java.util.function.Predicate<java.lang.Enum<java.nio.file.AccessMode>> accessModeEnumPredicate2 = java.util.function.Predicate.isEqual((java.lang.Object) offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
        org.junit.Assert.assertNotNull(accessModeEnumPredicate2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Date date3 = new java.util.Date((int) (short) 100, 64, 4);
        date3.setYear((int) (short) 0);
        org.junit.Assert.assertEquals(date3.toString(), "Fri May 04 00:00:00 UTC 1900");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = java.time.Duration.ofDays(345600000000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: long overflow");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.File file1 = new java.io.File("");
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.BCE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.from((java.time.temporal.TemporalAccessor) isoEra0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: BCE of type java.time.chrono.IsoEra");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra0.equals(java.time.chrono.IsoEra.BCE));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHoursMinutes((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 35 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.security.ProtectionDomain protectionDomain0 = null;
        java.security.ProtectionDomain[] protectionDomainArray1 = new java.security.ProtectionDomain[] { protectionDomain0 };
        java.security.AccessControlContext accessControlContext2 = new java.security.AccessControlContext(protectionDomainArray1);
        java.security.ProtectionDomain protectionDomain3 = null;
        java.security.ProtectionDomain[] protectionDomainArray4 = new java.security.ProtectionDomain[] { protectionDomain3 };
        java.security.AccessControlContext accessControlContext5 = new java.security.AccessControlContext(protectionDomainArray4);
        boolean boolean6 = accessControlContext2.equals((java.lang.Object) accessControlContext5);
        org.junit.Assert.assertNotNull(protectionDomainArray1);
        org.junit.Assert.assertNotNull(protectionDomainArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.READING;
        org.junit.Assert.assertNotNull(attribute0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.IOException iOException1 = new java.io.IOException("");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>> uRIMap2 = new java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>>(59, (float) (short) 10);
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ofPattern("");
        java.lang.String str5 = dateTimeFormatter4.toString();
        java.time.chrono.Chronology chronology6 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withChronology(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.Double> doubleItor8 = uRIMap2.remove((java.lang.Object) chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.net.URISyntaxException uRISyntaxException2 = new java.net.URISyntaxException("", "hi!");
        java.lang.String str3 = uRISyntaxException2.getReason();
        java.security.GeneralSecurityException generalSecurityException4 = new java.security.GeneralSecurityException((java.lang.Throwable) uRISyntaxException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(outputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption[] openOptionArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.FileChannel fileChannel2 = java.nio.channels.FileChannel.open(path0, openOptionArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.PrimitiveIterator.OfDouble ofDouble1 = doubleStream0.iterator();
        java.util.function.DoublePredicate doublePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = doubleStream0.noneMatch(doublePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(ofDouble1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed((-1), (int) (byte) 100);
        java.util.stream.IntStream intStream4 = intStream2.limit((long) 10);
        java.util.function.IntBinaryOperator intBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt6 = intStream4.reduce(intBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.nio.DoubleBuffer doubleBuffer1 = java.nio.DoubleBuffer.allocate(96);
        double[] doubleArray2 = doubleBuffer1.array();
        org.junit.Assert.assertNotNull(doubleBuffer1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime5 = offsetTime3.plusMinutes(100L);
        int int6 = offsetTime2.compareTo(offsetTime5);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime9 = offsetTime7.plusMinutes(100L);
        java.time.LocalTime localTime10 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime7);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime13 = offsetTime11.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long15 = offsetTime11.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.temporal.TemporalUnit temporalUnit16 = chronoField14.getRangeUnit();
        boolean boolean17 = localTime10.isSupported(temporalUnit16);
        java.time.OffsetTime offsetTime18 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime20 = offsetTime18.plusMinutes(100L);
        boolean boolean21 = temporalUnit16.isSupportedBy((java.time.temporal.Temporal) offsetTime18);
        int int22 = offsetTime2.compareTo(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 86399999999999L + "'", long15 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit16 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit16.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.plusMinutes(100L);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime4);
        boolean boolean8 = localTime3.isAfter(localTime7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.from((java.time.temporal.TemporalAccessor) localTime3);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: 23:59:59.999999999 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed((-1), (int) (byte) 100);
        java.util.stream.IntStream intStream4 = intStream2.limit((long) 10);
        java.util.function.IntConsumer intConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            intStream2.forEachOrdered(intConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(outputStream0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        int int1 = offsetTime0.getHour();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate2 = java.time.chrono.ChronoLocalDate.from((java.time.temporal.TemporalAccessor) offsetTime0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ChronoLocalDate from TemporalAccessor: class java.time.OffsetTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime8 = offsetTime4.withOffsetSameInstant(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime3.atOffset(zoneOffset7);
        int int10 = localTime3.getNano();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999999999 + "'", int10 == 999999999);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.time.Month month0 = java.time.Month.APRIL;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.YEAR_OF_ERA;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = month0.range((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: YearOfEra");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.APRIL + "'", month0.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.YEAR_OF_ERA + "'", chronoField1.equals(java.time.temporal.ChronoField.YEAR_OF_ERA));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.SECONDS;
        java.util.stream.Stream<java.util.concurrent.TimeUnit> timeUnitStream1 = java.util.stream.Stream.of(timeUnit0);
        java.util.stream.Stream<java.util.concurrent.TimeUnit> timeUnitStream3 = timeUnitStream1.skip((long) (short) 10);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertNotNull(timeUnitStream1);
        org.junit.Assert.assertNotNull(timeUnitStream3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("Germany");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of((long) (short) 0);
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.time.LocalDate localDate0 = null;
        java.time.LocalTime localTime1 = java.time.LocalTime.now();
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime4 = offsetTime2.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime6 = offsetTime2.withOffsetSameInstant(zoneOffset5);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.of(localDate0, localTime1, zoneOffset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long8 = offsetTime4.getLong((java.time.temporal.TemporalField) chronoField7);
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField7.getRangeUnit();
        boolean boolean10 = localTime3.isSupported(temporalUnit9);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime13 = offsetTime11.plusMinutes(100L);
        boolean boolean14 = temporalUnit9.isSupportedBy((java.time.temporal.Temporal) offsetTime11);
        java.time.Duration duration15 = temporalUnit9.getDuration();
        java.time.Duration duration17 = duration15.withNanos((int) (short) 100);
        java.time.OffsetTime offsetTime18 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime20 = offsetTime18.plusMinutes(100L);
        int int21 = offsetTime20.getHour();
        java.time.temporal.Temporal temporal22 = duration17.subtractFrom((java.time.temporal.Temporal) offsetTime20);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86399999999999L + "'", long8 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(temporal22);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>> uRIMap2 = new java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>>(59, (float) (short) 10);
        boolean boolean3 = uRIMap2.isEmpty();
        boolean boolean4 = uRIMap2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.PrimitiveIterator.OfDouble ofDouble1 = doubleStream0.iterator();
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleStream0.forEach(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(ofDouble1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer2 = floatBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatBuffer1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.OptionalLong optionalLong1 = longStream0.findAny();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream2 = longStream0.sorted();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.plusMinutes(100L);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime4);
        boolean boolean8 = localTime3.isAfter(localTime7);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.plusMinutes(100L);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime9);
        int int13 = localTime12.getMinute();
        java.time.OffsetTime offsetTime14 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime16 = offsetTime14.plusMinutes(100L);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime14);
        java.time.OffsetTime offsetTime18 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime20 = offsetTime18.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long22 = offsetTime18.getLong((java.time.temporal.TemporalField) chronoField21);
        java.time.temporal.TemporalUnit temporalUnit23 = chronoField21.getRangeUnit();
        boolean boolean24 = localTime17.isSupported(temporalUnit23);
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime27 = offsetTime25.plusMinutes(100L);
        boolean boolean28 = temporalUnit23.isSupportedBy((java.time.temporal.Temporal) offsetTime25);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = localTime7.until((java.time.temporal.Temporal) localTime12, temporalUnit23);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Days");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField21.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 86399999999999L + "'", long22 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit23 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit23.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Date date1 = new java.util.Date();
        date1.setSeconds(0);
        java.time.format.DateTimeFormatter dateTimeFormatter5 = java.time.format.DateTimeFormatter.ofPattern("");
        java.lang.String str6 = dateTimeFormatter5.toString();
        java.time.chrono.Chronology chronology7 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withChronology(chronology7);
        java.time.chrono.Chronology chronology9 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        boolean boolean11 = properties0.remove((java.lang.Object) 0, (java.lang.Object) dateTimeFormatter10);
        org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 09:13:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHoursMinutesSeconds(64, 999999999, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 64 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ERA;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField0.equals(java.time.temporal.ChronoField.ERA));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Date date0 = new java.util.Date();
        date0.setSeconds(0);
        java.lang.Class<?> wildcardClass3 = date0.getClass();
        org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 09:13:00 UTC 2022");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.net.UnknownHostException unknownHostException1 = new java.net.UnknownHostException("0");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed((-1), (int) (byte) 100);
        java.util.stream.IntStream intStream4 = intStream2.limit((long) 10);
        java.util.function.IntPredicate intPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = intStream4.anyMatch(intPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.OffsetTime offsetTime4 = offsetTime0.plusSeconds((long) 4096);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.lang.Runnable runnable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream2 = doubleStream0.onClose(runnable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("Germany", "Germany", file2);
        boolean boolean4 = file3.canWrite();
        boolean boolean5 = file3.isHidden();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/Germany7292506951857731257Germany");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("");
        java.util.Locale locale2 = java.util.Locale.US;
        java.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withLocale(locale2);
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.Object obj5 = locale2.clone();
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "United States" + "'", str4, "United States");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "en_US");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI5 = new java.net.URI("Germany", "hi!", "Germany", "/tmp/Germany4201106607005553991Germany", "1970-01-01T00:00:00Z");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: Germany://hi!Germany?/tmp/Germany4201106607005553991Germany#1970-01-01T00:00:00Z");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.Stream<java.lang.Double> doubleStream1 = doubleStream0.boxed();
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.OptionalLong optionalLong1 = longStream0.findAny();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream3 = longStream0.skip((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.time.Month month0 = java.time.Month.JULY;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JULY + "'", month0.equals(java.time.Month.JULY));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed((-1), (int) (byte) 100);
        java.util.stream.IntStream intStream4 = intStream2.limit((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = intStream2.asLongStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.function.LongSupplier longSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream1 = java.util.stream.LongStream.generate(longSupplier0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.ZonedDateTime zonedDateTime29 = zonedDateTime27.withMinute(0);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules31 = zoneOffset30.getRules();
        boolean boolean32 = zonedDateTime29.equals((java.lang.Object) zoneRules31);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime33 = zonedDateTime29.withLaterOffsetAtOverlap();
        java.lang.String str34 = localDateChronoZonedDateTime33.toString();
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zoneRules31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0001-03-31T23:00:59.000000100Z" + "'", str34, "0001-03-31T23:00:59.000000100Z");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.UNDERFLOW;
        // The following exception was thrown during execution in test generation
        try {
            coderResult0.throwException();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(coderResult0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException1 = new java.util.InvalidPropertiesFormatException("United States");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.nio.charset.CodingErrorAction codingErrorAction0 = java.nio.charset.CodingErrorAction.REPORT;
        org.junit.Assert.assertNotNull(codingErrorAction0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.reflect.Constructor constructor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.asm.Type.getConstructorDescriptor(constructor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor4 = languageRangeList1.listIterator(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime3 = offsetTime1.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime5 = offsetTime1.withOffsetSameInstant(zoneOffset4);
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset4);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetTime offsetTime8 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime10 = offsetTime8.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long12 = offsetTime8.getLong((java.time.temporal.TemporalField) chronoField11);
        java.time.temporal.TemporalUnit temporalUnit13 = chronoField11.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange14 = zoneOffset4.range((java.time.temporal.TemporalField) chronoField11);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField11.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 86399999999999L + "'", long12 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit13 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit13.equals(java.time.temporal.ChronoUnit.DAYS));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle1 = textStyle0.asNormal();
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle0.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle1.equals(java.time.format.TextStyle.NARROW));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean1 = strSet0.isEmpty();
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_MONTH;
        java.time.temporal.TemporalField[] temporalFieldArray3 = new java.time.temporal.TemporalField[] { chronoField2 };
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalField[] temporalFieldArray4 = strSet0.toArray(temporalFieldArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_MONTH + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_MONTH));
        org.junit.Assert.assertNotNull(temporalFieldArray3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale[] localeArray5 = new java.util.Locale[] { locale3, locale4 };
        java.util.ArrayList<java.util.Locale> localeList6 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList6, localeArray5);
        java.util.Locale locale8 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList6);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor9 = languageRangeList1.iterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(languageRangeItor9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.function.DoubleUnaryOperator doubleUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream2 = java.util.stream.DoubleStream.iterate((double) 86399999999999L, doubleUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>> uRIMap2 = new java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>>(59, (float) (short) 10);
        java.util.Collection<java.util.Iterator<java.lang.Double>> doubleItorCollection3 = uRIMap2.values();
        java.net.URI uRI5 = new java.net.URI("0");
        java.util.Iterator<java.lang.Double> doubleItor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.Double> doubleItor7 = uRIMap2.putIfAbsent(uRI5, doubleItor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleItorCollection3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException1 = new java.security.NoSuchAlgorithmException();
        java.security.SignatureException signatureException2 = new java.security.SignatureException(":", (java.lang.Throwable) noSuchAlgorithmException1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLoopbackAddress();
        boolean boolean1 = inetAddress0.isSiteLocalAddress();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.PrimitiveIterator.OfDouble ofDouble1 = doubleStream0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = doubleStream0.skip(345600000000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(ofDouble1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of((int) 'a', 1024, 2, 1, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 1024");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long8 = offsetTime4.getLong((java.time.temporal.TemporalField) chronoField7);
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField7.getRangeUnit();
        boolean boolean10 = localTime3.isSupported(temporalUnit9);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime13 = offsetTime11.plusMinutes(100L);
        boolean boolean14 = temporalUnit9.isSupportedBy((java.time.temporal.Temporal) offsetTime11);
        java.time.Duration duration15 = temporalUnit9.getDuration();
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime18 = offsetTime16.plusMinutes(100L);
        java.time.LocalTime localTime19 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime16);
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime22 = offsetTime20.plusMinutes(100L);
        java.time.LocalTime localTime23 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime20);
        boolean boolean24 = localTime19.isAfter(localTime23);
        java.time.temporal.Temporal temporal25 = duration15.subtractFrom((java.time.temporal.Temporal) localTime23);
        java.time.OffsetTime offsetTime26 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime28 = offsetTime26.plusMinutes(100L);
        java.time.LocalTime localTime29 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime26);
        java.time.OffsetTime offsetTime30 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime32 = offsetTime30.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField33 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long34 = offsetTime30.getLong((java.time.temporal.TemporalField) chronoField33);
        java.time.temporal.TemporalUnit temporalUnit35 = chronoField33.getRangeUnit();
        boolean boolean36 = localTime29.isSupported(temporalUnit35);
        java.time.OffsetTime offsetTime37 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime39 = offsetTime37.plusMinutes(100L);
        boolean boolean40 = temporalUnit35.isSupportedBy((java.time.temporal.Temporal) offsetTime37);
        java.time.Duration duration41 = temporalUnit35.getDuration();
        java.time.Duration duration43 = duration41.withNanos((int) (short) 100);
        boolean boolean44 = duration15.equals((java.lang.Object) duration43);
        long long45 = duration43.toHours();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86399999999999L + "'", long8 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(temporal25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertTrue("'" + chronoField33 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField33.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 86399999999999L + "'", long34 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit35 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit35.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 24L + "'", long45 == 24L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(100);
        float float2 = floatBuffer1.get();
        float[] floatArray8 = new float[] { 0, (short) -1, 100, '#', 'a' };
        java.nio.FloatBuffer floatBuffer11 = java.nio.FloatBuffer.wrap(floatArray8, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer14 = floatBuffer1.put(floatArray8, 96, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, -1.0, 100.0, 35.0, 97.0]");
        org.junit.Assert.assertNotNull(floatBuffer11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale[] localeArray5 = new java.util.Locale[] { locale3, locale4 };
        java.util.ArrayList<java.util.Locale> localeList6 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList6, localeArray5);
        java.util.Locale locale8 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList6);
        boolean boolean9 = languageRangeList1.isEmpty();
        java.util.Set<java.lang.String> strSet10 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean11 = languageRangeList1.retainAll((java.util.Collection<java.lang.String>) strSet10);
        java.time.format.DateTimeFormatter dateTimeFormatter13 = java.time.format.DateTimeFormatter.ofPattern("");
        java.util.Locale locale14 = java.util.Locale.US;
        java.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withLocale(locale14);
        java.lang.String str16 = locale14.getDisplayCountry();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale17.getDisplayCountry();
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale14, locale17, locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.Locale locale23 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList21);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United States" + "'", str16, "United States");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Germany" + "'", str18, "Germany");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(locale23);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "/tmp/Germany3322013608249615378Germany");
        char[] charArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer5 = charBuffer1.put(charArray2, 30, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.function.DoubleSupplier doubleSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.generate(doubleSupplier0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.reflect.Method method0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes(method0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime6 = offsetDateTime4.plusHours((long) 64);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Germany");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "germany");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer3 = java.nio.LongBuffer.wrap(longArray0, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.time.temporal.ValueRange valueRange2 = java.time.temporal.ValueRange.of((long) (byte) -1, (long) 'a');
        java.lang.String str3 = valueRange2.toString();
        org.junit.Assert.assertNotNull(valueRange2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1 - 97" + "'", str3, "-1 - 97");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = new java.net.URI("", "-1 - 97", "/tmp/Germany3322013608249615378Germany", "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Expected scheme name at index 0: ://-1 - 97/tmp/Germany3322013608249615378Germany#hi!");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile("", "Germany");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        short[] shortArray5 = new short[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer8 = java.nio.ShortBuffer.wrap(shortArray5, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 1, 10, 10, -1]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.BCE;
        java.time.format.TextStyle textStyle1 = java.time.format.TextStyle.NARROW_STANDALONE;
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = isoEra0.getDisplayName(textStyle1, locale2);
        boolean boolean5 = textStyle1.isStandalone();
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra0.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.NARROW_STANDALONE + "'", textStyle1.equals(java.time.format.TextStyle.NARROW_STANDALONE));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Germany" + "'", str3, "Germany");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange4 = java.time.temporal.ValueRange.of((long) (short) 100, 86399999999999L, (long) (short) 0, (long) 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value must be less than maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.distinct();
        doubleStream2.close();
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.Clock clock28 = java.time.Clock.system((java.time.ZoneId) zoneOffset15);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(clock28);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.Date date0 = new java.util.Date();
        date0.setSeconds(0);
        java.time.Instant instant3 = date0.toInstant();
        int int4 = date0.getMonth();
        org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 09:13:00 UTC 2022");
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(100);
        java.nio.Buffer buffer3 = floatBuffer1.limit(23);
        java.nio.FloatBuffer floatBuffer5 = floatBuffer1.put(100.0f);
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(buffer3);
        org.junit.Assert.assertNotNull(floatBuffer5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        double double2 = byteBuffer1.getDouble();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = byteBuffer1.getDouble(999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.nio.DoubleBuffer doubleBuffer1 = java.nio.DoubleBuffer.allocate(96);
        java.nio.DoubleBuffer doubleBuffer2 = doubleBuffer1.compact();
        java.nio.DoubleBuffer doubleBuffer4 = java.nio.DoubleBuffer.allocate(96);
        java.nio.DoubleBuffer doubleBuffer5 = doubleBuffer4.compact();
        java.nio.DoubleBuffer doubleBuffer6 = doubleBuffer1.put(doubleBuffer5);
        org.junit.Assert.assertNotNull(doubleBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(doubleBuffer5);
        org.junit.Assert.assertNotNull(doubleBuffer6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        org.junit.Assert.assertNotNull(optionalInt0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.OffsetTime offsetTime28 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime30 = offsetTime28.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long32 = offsetTime28.getLong((java.time.temporal.TemporalField) chronoField31);
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField31.getRangeUnit();
        boolean boolean34 = localDateTime11.isSupported((java.time.temporal.TemporalField) chronoField31);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField31.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 86399999999999L + "'", long32 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "/tmp/Germany3322013608249615378Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer4 = charBuffer1.put(59, 'a');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.security.AccessControlException accessControlException1 = new java.security.AccessControlException("Germany");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.time.Instant instant2 = java.time.Instant.ofEpochSecond((long) 59, (long) 23);
        org.junit.Assert.assertNotNull(instant2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        float[] floatArray5 = new float[] { 0, (short) -1, 100, '#', 'a' };
        java.nio.FloatBuffer floatBuffer8 = java.nio.FloatBuffer.wrap(floatArray5, (int) (short) 1, (int) (short) 0);
        int int9 = floatBuffer8.capacity();
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 100.0, 35.0, 97.0]");
        org.junit.Assert.assertNotNull(floatBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.nio.DoubleBuffer doubleBuffer1 = java.nio.DoubleBuffer.allocate(96);
        java.nio.Buffer buffer2 = doubleBuffer1.rewind();
        java.lang.Object obj3 = doubleBuffer1.array();
        org.junit.Assert.assertNotNull(doubleBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.ofLocale(locale0);
        boolean boolean3 = chronology1.isLeapYear((long) 8);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime8 = offsetTime4.withOffsetSameInstant(zoneOffset7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoLocalDateTime9 = chronology1.localDateTime((java.time.temporal.TemporalAccessor) zoneOffset7);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: Z of type java.time.ZoneOffset");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(offsetTime8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long4 = offsetTime0.getLong((java.time.temporal.TemporalField) chronoField3);
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField3.getRangeUnit();
        boolean boolean6 = temporalUnit5.isTimeBased();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 86399999999999L + "'", long4 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.distinct();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator3 = java.util.function.DoubleUnaryOperator.identity();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = doubleStream1.map(doubleUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleUnaryOperator3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Instant instant2 = java.time.Instant.EPOCH;
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime5 = offsetTime3.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime7 = offsetTime3.withOffsetSameInstant(zoneOffset6);
        java.time.OffsetTime offsetTime8 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset6);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.ofInstant(instant2, (java.time.ZoneId) zoneOffset6);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray10 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList11 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList11, zoneOffsetTransitionArray10);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray13 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList14 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList14, zoneOffsetTransitionArray13);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray16 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList17 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList17, zoneOffsetTransitionRuleArray16);
        java.time.zone.ZoneRules zoneRules19 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset6, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList11, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList14, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList17);
        java.util.Date date20 = new java.util.Date();
        date20.setSeconds(0);
        java.time.Instant instant23 = date20.toInstant();
        boolean boolean24 = zoneRules19.isDaylightSavings(instant23);
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime27 = offsetTime25.plusMinutes(100L);
        java.time.LocalTime localTime28 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime25);
        java.time.OffsetTime offsetTime29 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime31 = offsetTime29.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long33 = offsetTime29.getLong((java.time.temporal.TemporalField) chronoField32);
        java.time.temporal.TemporalUnit temporalUnit34 = chronoField32.getRangeUnit();
        boolean boolean35 = localTime28.isSupported(temporalUnit34);
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime38 = offsetTime36.plusMinutes(100L);
        boolean boolean39 = temporalUnit34.isSupportedBy((java.time.temporal.Temporal) offsetTime36);
        java.time.Duration duration40 = temporalUnit34.getDuration();
        java.time.Instant instant41 = instant23.truncatedTo(temporalUnit34);
        long long42 = instant41.toEpochMilli();
        java.time.OffsetTime offsetTime43 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime45 = offsetTime43.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate46 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime47 = offsetTime45.atDate(localDate46);
        java.time.ZoneOffset zoneOffset48 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules49 = zoneOffset48.getRules();
        java.time.OffsetTime offsetTime50 = offsetTime45.withOffsetSameLocal(zoneOffset48);
        java.time.OffsetTime offsetTime51 = java.time.OffsetTime.ofInstant(instant41, (java.time.ZoneId) zoneOffset48);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneRules19);
        org.junit.Assert.assertEquals(date20.toString(), "Mon Feb 21 09:13:00 UTC 2022");
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(offsetTime29);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 86399999999999L + "'", long33 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit34 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit34.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(offsetTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1645401600000L + "'", long42 == 1645401600000L);
        org.junit.Assert.assertNotNull(offsetTime43);
        org.junit.Assert.assertNotNull(offsetTime45);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(offsetDateTime47);
        org.junit.Assert.assertNotNull(zoneOffset48);
        org.junit.Assert.assertNotNull(zoneRules49);
        org.junit.Assert.assertNotNull(offsetTime50);
        org.junit.Assert.assertNotNull(offsetTime51);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.Date date3 = new java.util.Date(30, 2, 10);
        org.junit.Assert.assertEquals(date3.toString(), "Mon Mar 10 00:00:00 UTC 1930");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.function.DoublePredicate doublePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = doubleStream0.filter(doublePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.FULL;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle0);
        java.time.chrono.Chronology chronology2 = dateTimeFormatter1.getChronology();
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle0.equals(java.time.format.FormatStyle.FULL));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.OptionalLong optionalLong1 = longStream0.findAny();
        java.util.stream.LongStream longStream2 = longStream0.sequential();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalLong optionalLong3 = longStream2.max();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long13 = offsetTime9.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        boolean boolean15 = localTime8.isSupported(temporalUnit14);
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime18 = offsetTime16.plusMinutes(100L);
        boolean boolean19 = temporalUnit14.isSupportedBy((java.time.temporal.Temporal) offsetTime16);
        java.time.Duration duration20 = temporalUnit14.getDuration();
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime21);
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime27 = offsetTime25.plusMinutes(100L);
        java.time.LocalTime localTime28 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime25);
        boolean boolean29 = localTime24.isAfter(localTime28);
        java.time.temporal.Temporal temporal30 = duration20.subtractFrom((java.time.temporal.Temporal) localTime28);
        java.time.OffsetTime offsetTime31 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime33 = offsetTime31.plusMinutes(100L);
        java.time.LocalTime localTime34 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime31);
        java.time.OffsetTime offsetTime35 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime37 = offsetTime35.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField38 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long39 = offsetTime35.getLong((java.time.temporal.TemporalField) chronoField38);
        java.time.temporal.TemporalUnit temporalUnit40 = chronoField38.getRangeUnit();
        boolean boolean41 = localTime34.isSupported(temporalUnit40);
        java.time.OffsetTime offsetTime42 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime44 = offsetTime42.plusMinutes(100L);
        boolean boolean45 = temporalUnit40.isSupportedBy((java.time.temporal.Temporal) offsetTime42);
        java.time.Duration duration46 = temporalUnit40.getDuration();
        java.time.Duration duration48 = duration46.withNanos((int) (short) 100);
        boolean boolean49 = duration20.equals((java.lang.Object) duration48);
        java.time.OffsetDateTime offsetDateTime50 = offsetDateTime4.minus((java.time.temporal.TemporalAmount) duration48);
        java.time.OffsetTime offsetTime52 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime54 = offsetTime52.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField55 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long56 = offsetTime52.getLong((java.time.temporal.TemporalField) chronoField55);
        java.time.temporal.TemporalUnit temporalUnit57 = chronoField55.getRangeUnit();
        java.time.OffsetDateTime offsetDateTime58 = offsetDateTime50.plus(0L, temporalUnit57);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 86399999999999L + "'", long13 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(temporal30);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(offsetTime35);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertTrue("'" + chronoField38 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField38.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 86399999999999L + "'", long39 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit40 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit40.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(offsetTime42);
        org.junit.Assert.assertNotNull(offsetTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(offsetDateTime50);
        org.junit.Assert.assertNotNull(offsetTime52);
        org.junit.Assert.assertNotNull(offsetTime54);
        org.junit.Assert.assertTrue("'" + chronoField55 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField55.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 86399999999999L + "'", long56 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit57 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit57.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(offsetDateTime58);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.net.URI uRI1 = new java.net.URI("hi!");
        java.lang.String str2 = uRI1.getAuthority();
        java.net.URI uRI4 = new java.net.URI("hi!");
        java.lang.String str5 = uRI4.getAuthority();
        java.net.URI uRI6 = uRI1.relativize(uRI4);
        java.lang.String str7 = uRI6.getRawFragment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "/tmp/Germany3322013608249615378Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer3 = charBuffer1.put("0");
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("Germany", "Germany", file2);
        java.io.File file4 = file3.getAbsoluteFile();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/Germany6771445592649859644Germany");
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file4.toString(), "/tmp/Germany6771445592649859644Germany");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.net.SocketException socketException0 = new java.net.SocketException();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.time.Period period1 = java.time.Period.ofYears(23);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList2 = period1.getUnits();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(temporalUnitList2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.ZonedDateTime zonedDateTime28 = zonedDateTime27.withEarlierOffsetAtOverlap();
        java.time.Month month29 = zonedDateTime27.getMonth();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime30 = zonedDateTime27.toLocalDateTime();
        java.time.OffsetTime offsetTime31 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime33 = offsetTime31.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate34 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime35 = offsetTime33.atDate(localDate34);
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime38 = offsetTime36.plusMinutes(100L);
        java.time.LocalTime localTime39 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime36);
        java.time.OffsetTime offsetTime40 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime42 = offsetTime40.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long44 = offsetTime40.getLong((java.time.temporal.TemporalField) chronoField43);
        java.time.temporal.TemporalUnit temporalUnit45 = chronoField43.getRangeUnit();
        boolean boolean46 = localTime39.isSupported(temporalUnit45);
        java.time.OffsetTime offsetTime47 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime49 = offsetTime47.plusMinutes(100L);
        boolean boolean50 = temporalUnit45.isSupportedBy((java.time.temporal.Temporal) offsetTime47);
        java.time.Duration duration51 = temporalUnit45.getDuration();
        java.time.OffsetTime offsetTime52 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime54 = offsetTime52.plusMinutes(100L);
        java.time.LocalTime localTime55 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime52);
        java.time.OffsetTime offsetTime56 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime58 = offsetTime56.plusMinutes(100L);
        java.time.LocalTime localTime59 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime56);
        boolean boolean60 = localTime55.isAfter(localTime59);
        java.time.temporal.Temporal temporal61 = duration51.subtractFrom((java.time.temporal.Temporal) localTime59);
        java.time.OffsetTime offsetTime62 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime64 = offsetTime62.plusMinutes(100L);
        java.time.LocalTime localTime65 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime62);
        java.time.OffsetTime offsetTime66 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime68 = offsetTime66.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField69 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long70 = offsetTime66.getLong((java.time.temporal.TemporalField) chronoField69);
        java.time.temporal.TemporalUnit temporalUnit71 = chronoField69.getRangeUnit();
        boolean boolean72 = localTime65.isSupported(temporalUnit71);
        java.time.OffsetTime offsetTime73 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime75 = offsetTime73.plusMinutes(100L);
        boolean boolean76 = temporalUnit71.isSupportedBy((java.time.temporal.Temporal) offsetTime73);
        java.time.Duration duration77 = temporalUnit71.getDuration();
        java.time.Duration duration79 = duration77.withNanos((int) (short) 100);
        boolean boolean80 = duration51.equals((java.lang.Object) duration79);
        java.time.OffsetDateTime offsetDateTime81 = offsetDateTime35.minus((java.time.temporal.TemporalAmount) duration79);
        boolean boolean82 = duration79.isNegative();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime83 = zonedDateTime27.minus((java.time.temporal.TemporalAmount) duration79);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + month29 + "' != '" + java.time.Month.MARCH + "'", month29.equals(java.time.Month.MARCH));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime30);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(offsetTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(offsetTime42);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField43.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 86399999999999L + "'", long44 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit45 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit45.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(offsetTime47);
        org.junit.Assert.assertNotNull(offsetTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(offsetTime52);
        org.junit.Assert.assertNotNull(offsetTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(offsetTime56);
        org.junit.Assert.assertNotNull(offsetTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(temporal61);
        org.junit.Assert.assertNotNull(offsetTime62);
        org.junit.Assert.assertNotNull(offsetTime64);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(offsetTime66);
        org.junit.Assert.assertNotNull(offsetTime68);
        org.junit.Assert.assertTrue("'" + chronoField69 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField69.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 86399999999999L + "'", long70 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit71 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit71.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(offsetTime73);
        org.junit.Assert.assertNotNull(offsetTime75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(offsetDateTime81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime83);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.distinct();
        java.util.stream.DoubleStream doubleStream2 = doubleStream1.distinct();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = doubleStream1.sorted();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>> uRIMap2 = new java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>>(59, (float) (short) 10);
        java.util.Iterator<java.lang.Double> doubleItor4 = uRIMap2.remove((java.lang.Object) (short) 1);
        boolean boolean5 = uRIMap2.isEmpty();
        org.junit.Assert.assertNull(doubleItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.plusMinutes(100L);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime9);
        boolean boolean13 = localTime8.isAfter(localTime12);
        java.time.LocalDateTime localDateTime14 = localDate3.atTime(localTime12);
        java.time.chrono.IsoChronology isoChronology15 = localDate3.getChronology();
        java.time.LocalDateTime localDateTime18 = localDate3.atTime(23, (int) '4');
        java.time.temporal.TemporalAmount temporalAmount19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = localDateTime18.minus(temporalAmount19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amountToSubtract");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(isoChronology15);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime4 = offsetTime0.withOffsetSameInstant(zoneOffset3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset3);
        java.time.OffsetTime offsetTime6 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime8 = offsetTime6.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime10 = offsetTime6.withOffsetSameInstant(zoneOffset9);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset9);
        java.time.Duration duration12 = java.time.Duration.between((java.time.temporal.Temporal) offsetTime5, (java.time.temporal.Temporal) offsetTime11);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange14 = offsetTime11.range((java.time.temporal.TemporalField) chronoField13);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField13.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange14);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("/tmp/Germany4201106607005553991Germany", "/tmp/Germany3322013608249615378Germany", (int) (byte) 0, "Germany");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: /tmp/germany4201106607005553991germany");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.put((byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = byteBuffer3.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.time.DayOfWeek dayOfWeek1 = java.time.DayOfWeek.of((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + dayOfWeek1 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek1.equals(java.time.DayOfWeek.MONDAY));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
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
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.plusMinutes(100L);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime9);
        boolean boolean13 = localTime8.isAfter(localTime12);
        java.time.LocalDateTime localDateTime14 = localDate3.atTime(localTime12);
        java.time.chrono.IsoChronology isoChronology15 = localDate3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate19 = isoChronology15.date(0, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(isoChronology15);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.time.Clock clock0 = java.time.Clock.systemDefaultZone();
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now(clock0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime3 = offsetDateTime1.minusYears(299105640448L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -299105638426");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate8 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime9 = offsetTime7.atDate(localDate8);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime12 = offsetTime10.plusMinutes(100L);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime10);
        java.time.OffsetTime offsetTime14 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime16 = offsetTime14.plusMinutes(100L);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime14);
        boolean boolean18 = localTime13.isAfter(localTime17);
        java.time.LocalDateTime localDateTime19 = localDate8.atTime(localTime17);
        java.time.chrono.IsoChronology isoChronology20 = localDate8.getChronology();
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate24 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime25 = offsetTime23.atDate(localDate24);
        boolean boolean26 = localDate8.isAfter((java.time.chrono.ChronoLocalDate) localDate24);
        boolean boolean27 = localDate3.isAfter((java.time.chrono.ChronoLocalDate) localDate24);
        java.time.LocalDateTime localDateTime32 = localDate24.atTime(9, 31, (int) '#', 256);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(isoChronology20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("/tmp/Germany4201106607005553991Germany");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale[] localeArray5 = new java.util.Locale[] { locale3, locale4 };
        java.util.ArrayList<java.util.Locale> localeList6 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList6, localeArray5);
        java.util.Locale locale8 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList6);
        boolean boolean9 = languageRangeList1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange11 = languageRangeList1.get(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter(writer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Instant instant2 = java.time.Instant.EPOCH;
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime5 = offsetTime3.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime7 = offsetTime3.withOffsetSameInstant(zoneOffset6);
        java.time.OffsetTime offsetTime8 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset6);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.ofInstant(instant2, (java.time.ZoneId) zoneOffset6);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray10 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList11 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList11, zoneOffsetTransitionArray10);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray13 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList14 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList14, zoneOffsetTransitionArray13);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray16 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList17 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList17, zoneOffsetTransitionRuleArray16);
        java.time.zone.ZoneRules zoneRules19 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset6, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList11, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList14, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList17);
        java.util.Date date20 = new java.util.Date();
        date20.setSeconds(0);
        java.time.Instant instant23 = date20.toInstant();
        boolean boolean24 = zoneRules19.isDaylightSavings(instant23);
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime27 = offsetTime25.plusMinutes(100L);
        java.time.LocalTime localTime28 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime25);
        java.time.OffsetTime offsetTime29 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime31 = offsetTime29.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long33 = offsetTime29.getLong((java.time.temporal.TemporalField) chronoField32);
        java.time.temporal.TemporalUnit temporalUnit34 = chronoField32.getRangeUnit();
        boolean boolean35 = localTime28.isSupported(temporalUnit34);
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime38 = offsetTime36.plusMinutes(100L);
        boolean boolean39 = temporalUnit34.isSupportedBy((java.time.temporal.Temporal) offsetTime36);
        java.time.Duration duration40 = temporalUnit34.getDuration();
        java.time.Instant instant41 = instant23.truncatedTo(temporalUnit34);
        boolean boolean42 = temporalUnit34.isDateBased();
        boolean boolean43 = temporalUnit34.isDurationEstimated();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneRules19);
        org.junit.Assert.assertEquals(date20.toString(), "Mon Feb 21 09:13:00 UTC 2022");
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(offsetTime29);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 86399999999999L + "'", long33 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit34 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit34.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(offsetTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.time.Period period1 = java.time.Period.ofYears(23);
        java.time.temporal.Temporal temporal2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal3 = period1.subtractFrom(temporal2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) -1);
        classWriter1.visitOuterClass("0", "/tmp/Germany3322013608249615378Germany", ":");
        classWriter1.visitInnerClass("en-US", "Z", "0001-03-31T23:00:59.000000100Z", 8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.BASIC_ISO_DATE;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        boolean boolean3 = languageRangeList1.isEmpty();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.function.IntUnaryOperator intUnaryOperator0 = java.util.function.IntUnaryOperator.identity();
        java.util.function.IntUnaryOperator intUnaryOperator1 = java.util.function.IntUnaryOperator.identity();
        java.util.function.IntUnaryOperator intUnaryOperator2 = intUnaryOperator0.compose(intUnaryOperator1);
        org.junit.Assert.assertNotNull(intUnaryOperator0);
        org.junit.Assert.assertNotNull(intUnaryOperator1);
        org.junit.Assert.assertNotNull(intUnaryOperator2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long13 = offsetTime9.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        boolean boolean15 = localTime8.isSupported(temporalUnit14);
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime18 = offsetTime16.plusMinutes(100L);
        boolean boolean19 = temporalUnit14.isSupportedBy((java.time.temporal.Temporal) offsetTime16);
        java.time.Duration duration20 = temporalUnit14.getDuration();
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime21);
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime27 = offsetTime25.plusMinutes(100L);
        java.time.LocalTime localTime28 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime25);
        boolean boolean29 = localTime24.isAfter(localTime28);
        java.time.temporal.Temporal temporal30 = duration20.subtractFrom((java.time.temporal.Temporal) localTime28);
        java.time.OffsetTime offsetTime31 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime33 = offsetTime31.plusMinutes(100L);
        java.time.LocalTime localTime34 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime31);
        java.time.OffsetTime offsetTime35 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime37 = offsetTime35.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField38 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long39 = offsetTime35.getLong((java.time.temporal.TemporalField) chronoField38);
        java.time.temporal.TemporalUnit temporalUnit40 = chronoField38.getRangeUnit();
        boolean boolean41 = localTime34.isSupported(temporalUnit40);
        java.time.OffsetTime offsetTime42 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime44 = offsetTime42.plusMinutes(100L);
        boolean boolean45 = temporalUnit40.isSupportedBy((java.time.temporal.Temporal) offsetTime42);
        java.time.Duration duration46 = temporalUnit40.getDuration();
        java.time.Duration duration48 = duration46.withNanos((int) (short) 100);
        boolean boolean49 = duration20.equals((java.lang.Object) duration48);
        java.time.OffsetDateTime offsetDateTime50 = offsetDateTime4.minus((java.time.temporal.TemporalAmount) duration48);
        long long51 = duration48.toMinutes();
        int int52 = duration48.getNano();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 86399999999999L + "'", long13 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(temporal30);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(offsetTime35);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertTrue("'" + chronoField38 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField38.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 86399999999999L + "'", long39 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit40 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit40.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(offsetTime42);
        org.junit.Assert.assertNotNull(offsetTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(offsetDateTime50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1440L + "'", long51 == 1440L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.net.UnknownHostException unknownHostException0 = new java.net.UnknownHostException();
        java.io.IOException iOException1 = new java.io.IOException((java.lang.Throwable) unknownHostException0);
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException2 = new java.util.InvalidPropertiesFormatException((java.lang.Throwable) unknownHostException0);
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException3 = new java.util.InvalidPropertiesFormatException((java.lang.Throwable) unknownHostException0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.ZonedDateTime zonedDateTime29 = zonedDateTime27.withMinute(0);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules31 = zoneOffset30.getRules();
        boolean boolean32 = zonedDateTime29.equals((java.lang.Object) zoneRules31);
        java.time.LocalTime localTime33 = zonedDateTime29.toLocalTime();
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zoneRules31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localTime33);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.net.URI uRI1 = new java.net.URI("0");
        java.net.URI uRI3 = new java.net.URI("hi!");
        java.lang.String str4 = uRI3.getAuthority();
        java.net.URI uRI6 = new java.net.URI("hi!");
        java.lang.String str7 = uRI6.getAuthority();
        java.net.URI uRI8 = uRI3.relativize(uRI6);
        int int9 = uRI1.compareTo(uRI8);
        java.lang.String str10 = uRI8.getSchemeSpecificPart();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "/tmp/Germany3322013608249615378Germany");
        java.lang.Object obj2 = null;
        boolean boolean3 = charBuffer1.equals(obj2);
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
        java.util.stream.Stream<java.util.concurrent.TimeUnit> timeUnitStream3 = java.util.stream.Stream.of(timeUnit2);
        java.lang.Object[] objArray4 = timeUnitStream3.toArray();
        boolean boolean5 = locale1.equals((java.lang.Object) timeUnitStream3);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(timeUnit2);
        org.junit.Assert.assertNotNull(timeUnitStream3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[SECONDS]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[SECONDS]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.net.URI uRI1 = new java.net.URI("hi!");
        java.lang.String str2 = uRI1.getAuthority();
        java.net.URI uRI4 = new java.net.URI("hi!");
        java.lang.String str5 = uRI4.getAuthority();
        java.net.URI uRI6 = uRI1.resolve(uRI4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.plusMinutes(100L);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime4);
        boolean boolean8 = localTime3.isAfter(localTime7);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.plusMinutes(100L);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime9);
        java.time.OffsetTime offsetTime13 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime15 = offsetTime13.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long17 = offsetTime13.getLong((java.time.temporal.TemporalField) chronoField16);
        java.time.temporal.TemporalUnit temporalUnit18 = chronoField16.getRangeUnit();
        boolean boolean19 = localTime12.isSupported(temporalUnit18);
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime22 = offsetTime20.plusMinutes(100L);
        boolean boolean23 = temporalUnit18.isSupportedBy((java.time.temporal.Temporal) offsetTime20);
        java.time.Duration duration24 = temporalUnit18.getDuration();
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime27 = offsetTime25.plusMinutes(100L);
        java.time.LocalTime localTime28 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime25);
        java.time.OffsetTime offsetTime29 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime31 = offsetTime29.plusMinutes(100L);
        java.time.LocalTime localTime32 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime29);
        boolean boolean33 = localTime28.isAfter(localTime32);
        java.time.temporal.Temporal temporal34 = duration24.subtractFrom((java.time.temporal.Temporal) localTime32);
        java.time.OffsetTime offsetTime35 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime37 = offsetTime35.plusMinutes(100L);
        java.time.LocalTime localTime38 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime35);
        java.time.OffsetTime offsetTime39 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime41 = offsetTime39.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField42 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long43 = offsetTime39.getLong((java.time.temporal.TemporalField) chronoField42);
        java.time.temporal.TemporalUnit temporalUnit44 = chronoField42.getRangeUnit();
        boolean boolean45 = localTime38.isSupported(temporalUnit44);
        java.time.OffsetTime offsetTime46 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime48 = offsetTime46.plusMinutes(100L);
        boolean boolean49 = temporalUnit44.isSupportedBy((java.time.temporal.Temporal) offsetTime46);
        java.time.Duration duration50 = temporalUnit44.getDuration();
        java.time.Duration duration52 = duration50.withNanos((int) (short) 100);
        boolean boolean53 = duration24.equals((java.lang.Object) duration52);
        java.time.Duration duration55 = duration52.plusDays((long) (short) 10);
        java.time.LocalTime localTime56 = localTime3.minus((java.time.temporal.TemporalAmount) duration55);
        java.time.temporal.ChronoField chronoField57 = java.time.temporal.ChronoField.DAY_OF_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal59 = localTime56.with((java.time.temporal.TemporalField) chronoField57, 0L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField16.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 86399999999999L + "'", long17 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit18 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit18.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(offsetTime29);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(temporal34);
        org.junit.Assert.assertNotNull(offsetTime35);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(offsetTime39);
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertTrue("'" + chronoField42 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField42.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 86399999999999L + "'", long43 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit44 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit44.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(offsetTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + chronoField57 + "' != '" + java.time.temporal.ChronoField.DAY_OF_MONTH + "'", chronoField57.equals(java.time.temporal.ChronoField.DAY_OF_MONTH));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.net.Proxy proxy0 = java.net.Proxy.NO_PROXY;
        java.net.SocketAddress socketAddress1 = proxy0.address();
        java.lang.String str2 = proxy0.toString();
        org.junit.Assert.assertNotNull(proxy0);
        org.junit.Assert.assertNull(socketAddress1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DIRECT" + "'", str2, "DIRECT");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Instant instant2 = java.time.Instant.EPOCH;
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime5 = offsetTime3.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime7 = offsetTime3.withOffsetSameInstant(zoneOffset6);
        java.time.OffsetTime offsetTime8 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset6);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.ofInstant(instant2, (java.time.ZoneId) zoneOffset6);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray10 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList11 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList11, zoneOffsetTransitionArray10);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray13 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList14 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList14, zoneOffsetTransitionArray13);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray16 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList17 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList17, zoneOffsetTransitionRuleArray16);
        java.time.zone.ZoneRules zoneRules19 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset6, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList11, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList14, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList17);
        java.util.Date date20 = new java.util.Date();
        date20.setSeconds(0);
        java.time.Instant instant23 = date20.toInstant();
        boolean boolean24 = zoneRules19.isDaylightSavings(instant23);
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime27 = offsetTime25.plusMinutes(100L);
        java.time.LocalTime localTime28 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime25);
        java.time.OffsetTime offsetTime29 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime31 = offsetTime29.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long33 = offsetTime29.getLong((java.time.temporal.TemporalField) chronoField32);
        java.time.temporal.TemporalUnit temporalUnit34 = chronoField32.getRangeUnit();
        boolean boolean35 = localTime28.isSupported(temporalUnit34);
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime38 = offsetTime36.plusMinutes(100L);
        boolean boolean39 = temporalUnit34.isSupportedBy((java.time.temporal.Temporal) offsetTime36);
        java.time.Duration duration40 = temporalUnit34.getDuration();
        java.time.Instant instant41 = instant23.truncatedTo(temporalUnit34);
        java.time.Instant instant43 = instant23.minusSeconds((long) 1);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneRules19);
        org.junit.Assert.assertEquals(date20.toString(), "Mon Feb 21 09:13:00 UTC 2022");
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(offsetTime29);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 86399999999999L + "'", long33 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit34 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit34.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(offsetTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(instant43);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange3 = java.time.temporal.ValueRange.of((long) 4, (long) 23, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "/tmp/Germany3322013608249615378Germany");
        char[] charArray8 = new char[] { '#', '4', 'a', 'a', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer11 = charBuffer1.put(charArray8, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4aa#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4aa#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4, a, a, #, a]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        float[] floatArray5 = new float[] { 0, (short) -1, 100, '#', 'a' };
        java.nio.FloatBuffer floatBuffer8 = java.nio.FloatBuffer.wrap(floatArray5, (int) (short) 1, (int) (short) 0);
        java.nio.FloatBuffer floatBuffer9 = java.nio.FloatBuffer.wrap(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 100.0, 35.0, 97.0]");
        org.junit.Assert.assertNotNull(floatBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.plusMinutes(100L);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime9);
        boolean boolean13 = localTime8.isAfter(localTime12);
        java.time.LocalDateTime localDateTime14 = localDate3.atTime(localTime12);
        java.time.chrono.IsoChronology isoChronology15 = localDate3.getChronology();
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules17 = zoneOffset16.getRules();
        java.time.Instant instant18 = java.time.Instant.EPOCH;
        java.lang.String str19 = instant18.toString();
        boolean boolean20 = zoneRules17.isDaylightSavings(instant18);
        java.time.Month month22 = java.time.Month.APRIL;
        int int24 = month22.length(true);
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.of((int) (short) 1, month22, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime32 = localDateTime30.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime33 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime35 = offsetTime33.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime37 = offsetTime33.withOffsetSameInstant(zoneOffset36);
        java.time.OffsetTime offsetTime38 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime40 = offsetTime38.plusMinutes(100L);
        java.time.LocalTime localTime41 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime38);
        java.time.OffsetTime offsetTime42 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime44 = offsetTime42.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime46 = offsetTime42.withOffsetSameInstant(zoneOffset45);
        java.time.OffsetTime offsetTime47 = localTime41.atOffset(zoneOffset45);
        java.time.ZonedDateTime zonedDateTime48 = java.time.ZonedDateTime.ofStrict(localDateTime32, zoneOffset36, (java.time.ZoneId) zoneOffset45);
        java.time.ZonedDateTime zonedDateTime49 = isoChronology15.zonedDateTime(instant18, (java.time.ZoneId) zoneOffset45);
        java.time.format.TextStyle textStyle50 = java.time.format.TextStyle.SHORT;
        java.time.format.DateTimeFormatter dateTimeFormatter52 = java.time.format.DateTimeFormatter.ofPattern("");
        java.util.Locale locale53 = java.util.Locale.US;
        java.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter52.withLocale(locale53);
        java.lang.String str55 = locale53.getDisplayCountry();
        java.lang.String str56 = isoChronology15.getDisplayName(textStyle50, locale53);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(isoChronology15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneRules17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T00:00:00Z" + "'", str19, "1970-01-01T00:00:00Z");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + month22 + "' != '" + java.time.Month.APRIL + "'", month22.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(offsetTime35);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetTime38);
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(offsetTime42);
        org.junit.Assert.assertNotNull(offsetTime44);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(offsetTime47);
        org.junit.Assert.assertNotNull(zonedDateTime48);
        org.junit.Assert.assertNotNull(zonedDateTime49);
        org.junit.Assert.assertTrue("'" + textStyle50 + "' != '" + java.time.format.TextStyle.SHORT + "'", textStyle50.equals(java.time.format.TextStyle.SHORT));
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "United States" + "'", str55, "United States");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ISO" + "'", str56, "ISO");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.String str0 = java.io.File.separator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/" + "'", str0, "/");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.PrimitiveIterator.OfDouble ofDouble1 = doubleStream0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream2 = doubleStream0.sorted();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(ofDouble1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.ZonedDateTime zonedDateTime29 = zonedDateTime27.withMinute(0);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules31 = zoneOffset30.getRules();
        boolean boolean32 = zonedDateTime29.equals((java.lang.Object) zoneRules31);
        int int33 = zonedDateTime29.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zoneRules31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 31 + "'", int33 == 31);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("Germany", "Germany", file2);
        boolean boolean4 = file3.canWrite();
        java.lang.String str5 = file3.getAbsolutePath();
        java.nio.file.Path path6 = file3.toPath();
        java.nio.file.OpenOption[] openOptionArray7 = new java.nio.file.OpenOption[] {};
        java.nio.channels.FileChannel fileChannel8 = java.nio.channels.FileChannel.open(path6, openOptionArray7);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/Germany6965511451264729384Germany");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/tmp/Germany6965511451264729384Germany" + "'", str5, "/tmp/Germany6965511451264729384Germany");
        org.junit.Assert.assertNotNull(path6);
        org.junit.Assert.assertNotNull(openOptionArray7);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.time.LocalDate localDate0 = java.time.LocalDate.MAX;
        int int1 = localDate0.getDayOfMonth();
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules3 = zoneOffset2.getRules();
        java.time.Instant instant4 = java.time.Instant.EPOCH;
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime9 = offsetTime5.withOffsetSameInstant(zoneOffset8);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset8);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.ofInstant(instant4, (java.time.ZoneId) zoneOffset8);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray12 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList13 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList13, zoneOffsetTransitionArray12);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray15 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList16 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, zoneOffsetTransitionArray15);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray18 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList19 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList19, zoneOffsetTransitionRuleArray18);
        java.time.zone.ZoneRules zoneRules21 = java.time.zone.ZoneRules.of(zoneOffset2, zoneOffset8, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList13, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList16, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList19);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate22 = localDate0.with((java.time.temporal.TemporalAdjuster) zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(zoneRules3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneRules21);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("DIRECT", "0", 156);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.range(999999999, (-1));
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.plusMinutes(100L);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime9);
        boolean boolean13 = localTime8.isAfter(localTime12);
        java.time.LocalDateTime localDateTime14 = localDate3.atTime(localTime12);
        java.time.LocalTime localTime16 = localTime12.minusSeconds((long) (byte) 10);
        int int17 = localTime16.toSecondOfDay();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 86389 + "'", int17 == 86389);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.BCE;
        java.time.format.TextStyle textStyle1 = java.time.format.TextStyle.NARROW_STANDALONE;
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = isoEra0.getDisplayName(textStyle1, locale2);
        java.time.Month month6 = java.time.Month.APRIL;
        int int8 = month6.length(true);
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.of((int) (short) 1, month6, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery15 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean16 = month6.query(booleanTemporalQuery15);
        java.lang.Boolean boolean17 = isoEra0.query(booleanTemporalQuery15);
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra0.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.NARROW_STANDALONE + "'", textStyle1.equals(java.time.format.TextStyle.NARROW_STANDALONE));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Germany" + "'", str3, "Germany");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.APRIL + "'", month6.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(booleanTemporalQuery15);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap1 = null;
        java.time.Month month2 = java.time.Month.APRIL;
        java.time.format.ResolverStyle resolverStyle3 = null;
        java.time.temporal.TemporalAccessor temporalAccessor4 = chronoField0.resolve(temporalFieldMap1, (java.time.temporal.TemporalAccessor) month2, resolverStyle3);
        java.time.temporal.ValueRange valueRange5 = chronoField0.range();
        java.lang.String str6 = chronoField0.toString();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.APRIL + "'", month2.equals(java.time.Month.APRIL));
        org.junit.Assert.assertNull(temporalAccessor4);
        org.junit.Assert.assertNotNull(valueRange5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "NanoOfDay" + "'", str6, "NanoOfDay");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate8 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime9 = offsetTime7.atDate(localDate8);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime12 = offsetTime10.plusMinutes(100L);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime10);
        java.time.OffsetTime offsetTime14 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime16 = offsetTime14.plusMinutes(100L);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime14);
        boolean boolean18 = localTime13.isAfter(localTime17);
        java.time.LocalDateTime localDateTime19 = localDate8.atTime(localTime17);
        java.time.chrono.IsoChronology isoChronology20 = localDate8.getChronology();
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate24 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime25 = offsetTime23.atDate(localDate24);
        boolean boolean26 = localDate8.isAfter((java.time.chrono.ChronoLocalDate) localDate24);
        boolean boolean27 = localDate3.isAfter((java.time.chrono.ChronoLocalDate) localDate24);
        java.time.LocalDate localDate29 = localDate24.minusYears((long) 6);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(isoChronology20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale[] localeArray5 = new java.util.Locale[] { locale3, locale4 };
        java.util.ArrayList<java.util.Locale> localeList6 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList6, localeArray5);
        java.util.Locale locale8 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList6);
        int int9 = languageRangeList1.size();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.ZonedDateTime zonedDateTime29 = zonedDateTime27.withMinute(0);
        java.time.ZonedDateTime zonedDateTime31 = zonedDateTime27.minusMinutes((long) 23);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime31);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Set<java.lang.String> strSet1 = java.time.ZoneId.getAvailableZoneIds();
        java.util.Properties properties2 = new java.util.Properties();
        java.util.Enumeration<java.lang.Object> objEnumeration3 = properties2.keys();
        boolean boolean4 = properties0.remove((java.lang.Object) strSet1, (java.lang.Object) properties2);
        java.util.Enumeration<?> wildcardEnumeration5 = properties0.propertyNames();
        java.io.OutputStream outputStream6 = null;
        java.io.FilterOutputStream filterOutputStream7 = new java.io.FilterOutputStream(outputStream6);
        // The following exception was thrown during execution in test generation
        try {
            properties0.storeToXML((java.io.OutputStream) filterOutputStream7, "Z", "/tmp/Germany4201106607005553991Germany");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: /tmp/Germany4201106607005553991Germany");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(objEnumeration3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardEnumeration5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble1 = doubleStream0.average();
        java.lang.String str2 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble.empty" + "'", str2, "OptionalDouble.empty");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "/tmp/Germany3322013608249615378Germany");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = charBuffer1.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.format.DateTimeFormatter dateTimeFormatter28 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.lang.String str29 = zonedDateTime27.format(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "23:59:59.0000001Z" + "'", str29, "23:59:59.0000001Z");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.LocalDateTime localDateTime13 = localDateTime9.withNano(999999999);
        java.time.LocalDateTime localDateTime15 = localDateTime9.withYear(9);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.LocalDateTime localDateTime13 = localDateTime11.withNano((int) (byte) 10);
        java.time.Month month15 = java.time.Month.APRIL;
        int int17 = month15.length(true);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.of((int) (short) 1, month15, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime25 = localDateTime23.minusMinutes((long) (short) 1);
        java.time.LocalDateTime localDateTime27 = localDateTime25.withNano((int) (byte) 10);
        boolean boolean28 = localDateTime11.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime25);
        java.time.OffsetTime offsetTime29 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime31 = offsetTime29.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate32 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime33 = offsetTime31.atDate(localDate32);
        java.time.OffsetTime offsetTime34 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime36 = offsetTime34.plusMinutes(100L);
        java.time.LocalTime localTime37 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime34);
        java.time.OffsetTime offsetTime38 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime40 = offsetTime38.plusMinutes(100L);
        java.time.LocalTime localTime41 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime38);
        boolean boolean42 = localTime37.isAfter(localTime41);
        java.time.LocalDateTime localDateTime43 = localDate32.atTime(localTime41);
        java.time.chrono.IsoChronology isoChronology44 = localDate32.getChronology();
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules46 = zoneOffset45.getRules();
        java.time.Instant instant47 = java.time.Instant.EPOCH;
        java.lang.String str48 = instant47.toString();
        boolean boolean49 = zoneRules46.isDaylightSavings(instant47);
        java.time.Month month51 = java.time.Month.APRIL;
        int int53 = month51.length(true);
        java.time.LocalDateTime localDateTime59 = java.time.LocalDateTime.of((int) (short) 1, month51, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime61 = localDateTime59.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime62 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime64 = offsetTime62.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset65 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime66 = offsetTime62.withOffsetSameInstant(zoneOffset65);
        java.time.OffsetTime offsetTime67 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime69 = offsetTime67.plusMinutes(100L);
        java.time.LocalTime localTime70 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime67);
        java.time.OffsetTime offsetTime71 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime73 = offsetTime71.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset74 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime75 = offsetTime71.withOffsetSameInstant(zoneOffset74);
        java.time.OffsetTime offsetTime76 = localTime70.atOffset(zoneOffset74);
        java.time.ZonedDateTime zonedDateTime77 = java.time.ZonedDateTime.ofStrict(localDateTime61, zoneOffset65, (java.time.ZoneId) zoneOffset74);
        java.time.ZonedDateTime zonedDateTime78 = isoChronology44.zonedDateTime(instant47, (java.time.ZoneId) zoneOffset74);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime79 = localDateTime25.atZone((java.time.ZoneId) zoneOffset74);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + month15 + "' != '" + java.time.Month.APRIL + "'", month15.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(offsetTime29);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertNotNull(offsetTime34);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(offsetTime38);
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(isoChronology44);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertNotNull(zoneRules46);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-01-01T00:00:00Z" + "'", str48, "1970-01-01T00:00:00Z");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + month51 + "' != '" + java.time.Month.APRIL + "'", month51.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 30 + "'", int53 == 30);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(offsetTime62);
        org.junit.Assert.assertNotNull(offsetTime64);
        org.junit.Assert.assertNotNull(zoneOffset65);
        org.junit.Assert.assertNotNull(offsetTime66);
        org.junit.Assert.assertNotNull(offsetTime67);
        org.junit.Assert.assertNotNull(offsetTime69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(offsetTime71);
        org.junit.Assert.assertNotNull(offsetTime73);
        org.junit.Assert.assertNotNull(zoneOffset74);
        org.junit.Assert.assertNotNull(offsetTime75);
        org.junit.Assert.assertNotNull(offsetTime76);
        org.junit.Assert.assertNotNull(zonedDateTime77);
        org.junit.Assert.assertNotNull(zonedDateTime78);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime79);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        double double2 = byteBuffer1.getDouble();
        byte byte3 = byteBuffer1.get();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.security.cert.CertificateException certificateException2 = new java.security.cert.CertificateException("hi!");
        java.security.SignatureException signatureException3 = new java.security.SignatureException("/tmp/Germany4201106607005553991Germany", (java.lang.Throwable) certificateException2);
        java.security.cert.CertificateEncodingException certificateEncodingException4 = new java.security.cert.CertificateEncodingException((java.lang.Throwable) certificateException2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long8 = offsetTime4.getLong((java.time.temporal.TemporalField) chronoField7);
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField7.getRangeUnit();
        boolean boolean10 = localTime3.isSupported(temporalUnit9);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime13 = offsetTime11.plusMinutes(100L);
        boolean boolean14 = temporalUnit9.isSupportedBy((java.time.temporal.Temporal) offsetTime11);
        java.time.Duration duration15 = temporalUnit9.getDuration();
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime18 = offsetTime16.plusMinutes(100L);
        java.time.LocalTime localTime19 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime16);
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime22 = offsetTime20.plusMinutes(100L);
        java.time.LocalTime localTime23 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime20);
        boolean boolean24 = localTime19.isAfter(localTime23);
        java.time.temporal.Temporal temporal25 = duration15.subtractFrom((java.time.temporal.Temporal) localTime23);
        java.time.OffsetTime offsetTime26 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime28 = offsetTime26.plusMinutes(100L);
        java.time.LocalTime localTime29 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime26);
        java.time.OffsetTime offsetTime30 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime32 = offsetTime30.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField33 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long34 = offsetTime30.getLong((java.time.temporal.TemporalField) chronoField33);
        java.time.temporal.TemporalUnit temporalUnit35 = chronoField33.getRangeUnit();
        boolean boolean36 = localTime29.isSupported(temporalUnit35);
        java.time.OffsetTime offsetTime37 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime39 = offsetTime37.plusMinutes(100L);
        boolean boolean40 = temporalUnit35.isSupportedBy((java.time.temporal.Temporal) offsetTime37);
        java.time.Duration duration41 = temporalUnit35.getDuration();
        java.time.Duration duration43 = duration41.withNanos((int) (short) 100);
        boolean boolean44 = duration15.equals((java.lang.Object) duration43);
        java.time.Duration duration46 = duration43.plusDays((long) (short) 10);
        java.time.Duration duration48 = duration43.minusNanos((long) 23);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86399999999999L + "'", long8 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(temporal25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertTrue("'" + chronoField33 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField33.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 86399999999999L + "'", long34 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit35 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit35.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration48);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.security.cert.CertificateException certificateException1 = new java.security.cert.CertificateException("en-US");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.plusMinutes(100L);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime9);
        boolean boolean13 = localTime8.isAfter(localTime12);
        java.time.LocalDateTime localDateTime14 = localDate3.atTime(localTime12);
        java.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((-719072L));
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.time.Duration duration1 = java.time.Duration.ofMillis((long) 100);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>> uRIMap2 = new java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>>(59, (float) (short) 10);
        boolean boolean3 = uRIMap2.isEmpty();
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate7 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime8 = offsetTime6.atDate(localDate7);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.plusMinutes(100L);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime9);
        java.time.OffsetTime offsetTime13 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime15 = offsetTime13.plusMinutes(100L);
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime13);
        boolean boolean17 = localTime12.isAfter(localTime16);
        java.time.LocalDateTime localDateTime18 = localDate7.atTime(localTime16);
        java.time.LocalTime localTime20 = localTime16.minusSeconds((long) (byte) 10);
        boolean boolean21 = uRIMap2.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("P23Y");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=p23y");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.time.Period period0 = java.time.Period.ZERO;
        org.junit.Assert.assertNotNull(period0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.PrimitiveIterator.OfDouble ofDouble1 = doubleStream0.iterator();
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            ofDouble1.forEachRemaining(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(ofDouble1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.put((byte) 1);
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.put(byteArray5, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField0.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDate3.format(dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long13 = offsetTime9.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        boolean boolean15 = localTime8.isSupported(temporalUnit14);
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime18 = offsetTime16.plusMinutes(100L);
        boolean boolean19 = temporalUnit14.isSupportedBy((java.time.temporal.Temporal) offsetTime16);
        java.time.Duration duration20 = temporalUnit14.getDuration();
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime21);
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime27 = offsetTime25.plusMinutes(100L);
        java.time.LocalTime localTime28 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime25);
        boolean boolean29 = localTime24.isAfter(localTime28);
        java.time.temporal.Temporal temporal30 = duration20.subtractFrom((java.time.temporal.Temporal) localTime28);
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.UTC;
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.of(localDate3, localTime28, zoneOffset31);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime34 = offsetDateTime32.plusNanos(86399999999999L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 1000000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 86399999999999L + "'", long13 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(temporal30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.ZonedDateTime zonedDateTime29 = zonedDateTime27.withMinute(0);
        java.time.ZonedDateTime zonedDateTime31 = zonedDateTime27.withNano(96);
        java.time.ZonedDateTime zonedDateTime32 = zonedDateTime27.withLaterOffsetAtOverlap();
        java.time.ZonedDateTime zonedDateTime34 = zonedDateTime27.minusDays((long) 1);
        java.time.ZonedDateTime zonedDateTime35 = zonedDateTime27.withEarlierOffsetAtOverlap();
        int int36 = zonedDateTime27.getYear();
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertNotNull(zonedDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Set<java.lang.String> strSet1 = java.time.ZoneId.getAvailableZoneIds();
        java.util.Properties properties2 = new java.util.Properties();
        java.util.Enumeration<java.lang.Object> objEnumeration3 = properties2.keys();
        boolean boolean4 = properties0.remove((java.lang.Object) strSet1, (java.lang.Object) properties2);
        java.util.Set<java.lang.String> strSet5 = properties0.stringPropertyNames();
        java.lang.String str6 = properties0.toString();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(objEnumeration3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.LocalDateTime localDateTime13 = localDateTime11.withNano((int) (byte) 10);
        java.time.Month month15 = java.time.Month.APRIL;
        int int17 = month15.length(true);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.of((int) (short) 1, month15, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime25 = localDateTime23.minusMinutes((long) (short) 1);
        java.time.LocalDateTime localDateTime27 = localDateTime25.withNano((int) (byte) 10);
        boolean boolean28 = localDateTime11.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime25);
        java.time.LocalDateTime localDateTime30 = localDateTime11.plusDays((-1L));
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + month15 + "' != '" + java.time.Month.APRIL + "'", month15.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean1 = strSet0.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet0.parallelStream();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strStream2);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "/tmp/Germany3322013608249615378Germany");
        char[] charArray2 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer5 = charBuffer1.get(charArray2, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.time.Period period1 = java.time.Period.ofYears(23);
        java.lang.String str2 = period1.toString();
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime5 = offsetTime3.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate6 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime7 = offsetTime5.atDate(localDate6);
        java.time.OffsetTime offsetTime8 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime10 = offsetTime8.plusMinutes(100L);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime8);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long16 = offsetTime12.getLong((java.time.temporal.TemporalField) chronoField15);
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField15.getRangeUnit();
        boolean boolean18 = localTime11.isSupported(temporalUnit17);
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime21 = offsetTime19.plusMinutes(100L);
        boolean boolean22 = temporalUnit17.isSupportedBy((java.time.temporal.Temporal) offsetTime19);
        java.time.Duration duration23 = temporalUnit17.getDuration();
        java.time.OffsetTime offsetTime24 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime26 = offsetTime24.plusMinutes(100L);
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime24);
        java.time.OffsetTime offsetTime28 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime30 = offsetTime28.plusMinutes(100L);
        java.time.LocalTime localTime31 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime28);
        boolean boolean32 = localTime27.isAfter(localTime31);
        java.time.temporal.Temporal temporal33 = duration23.subtractFrom((java.time.temporal.Temporal) localTime31);
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.UTC;
        java.time.OffsetDateTime offsetDateTime35 = java.time.OffsetDateTime.of(localDate6, localTime31, zoneOffset34);
        java.time.temporal.Temporal temporal36 = period1.subtractFrom((java.time.temporal.Temporal) offsetDateTime35);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P23Y" + "'", str2, "P23Y");
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField15.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 86399999999999L + "'", long16 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(temporal33);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(temporal36);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("Germany", "Germany", file2);
        boolean boolean4 = file3.mkdir();
        boolean boolean5 = file3.canRead();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/Germany3552851029139949576Germany");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField0.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.lang.String str1 = zoneOffset0.getId();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("Germany", "Germany", file2);
        boolean boolean4 = file3.canWrite();
        java.lang.String str5 = file3.getAbsolutePath();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter7 = new java.io.PrintWriter(file3, "-1 - 97");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1 - 97");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/Germany8730138110609325438Germany");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/tmp/Germany8730138110609325438Germany" + "'", str5, "/tmp/Germany8730138110609325438Germany");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("-1 - 97");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.time.Period period1 = java.time.Period.ofWeeks(8);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        int int4 = localTime3.getMinute();
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long9 = offsetTime5.getLong((java.time.temporal.TemporalField) chronoField8);
        java.time.temporal.TemporalUnit temporalUnit10 = chronoField8.getRangeUnit();
        java.time.LocalTime localTime11 = localTime3.truncatedTo(temporalUnit10);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField8.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86399999999999L + "'", long9 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit10 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit10.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.time.Period period1 = java.time.Period.ofYears(23);
        java.time.Period period3 = period1.withYears((int) ' ');
        boolean boolean4 = period3.isNegative();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofTotalSeconds(0);
        org.junit.Assert.assertNotNull(zoneOffset1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.withYear(96);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long8 = offsetTime4.getLong((java.time.temporal.TemporalField) chronoField7);
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField7.getRangeUnit();
        boolean boolean10 = localTime3.isSupported(temporalUnit9);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime13 = offsetTime11.plusMinutes(100L);
        boolean boolean14 = temporalUnit9.isSupportedBy((java.time.temporal.Temporal) offsetTime11);
        java.time.Duration duration15 = temporalUnit9.getDuration();
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime18 = offsetTime16.plusMinutes(100L);
        java.time.LocalTime localTime19 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime16);
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime22 = offsetTime20.plusMinutes(100L);
        java.time.LocalTime localTime23 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime20);
        boolean boolean24 = localTime19.isAfter(localTime23);
        java.time.temporal.Temporal temporal25 = duration15.subtractFrom((java.time.temporal.Temporal) localTime23);
        java.time.OffsetTime offsetTime26 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime28 = offsetTime26.plusMinutes(100L);
        java.time.LocalTime localTime29 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime26);
        java.time.OffsetTime offsetTime30 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime32 = offsetTime30.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField33 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long34 = offsetTime30.getLong((java.time.temporal.TemporalField) chronoField33);
        java.time.temporal.TemporalUnit temporalUnit35 = chronoField33.getRangeUnit();
        boolean boolean36 = localTime29.isSupported(temporalUnit35);
        java.time.OffsetTime offsetTime37 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime39 = offsetTime37.plusMinutes(100L);
        boolean boolean40 = temporalUnit35.isSupportedBy((java.time.temporal.Temporal) offsetTime37);
        java.time.Duration duration41 = temporalUnit35.getDuration();
        java.time.Duration duration43 = duration41.withNanos((int) (short) 100);
        boolean boolean44 = duration15.equals((java.lang.Object) duration43);
        java.time.Duration duration46 = duration43.plusDays((long) (short) 10);
        java.time.Duration duration48 = duration43.dividedBy((-1L));
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86399999999999L + "'", long8 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(temporal25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertTrue("'" + chronoField33 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField33.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 86399999999999L + "'", long34 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit35 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit35.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration48);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.plusMinutes(100L);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime9);
        boolean boolean13 = localTime8.isAfter(localTime12);
        java.time.LocalDateTime localDateTime14 = localDate3.atTime(localTime12);
        java.time.chrono.IsoChronology isoChronology15 = localDate3.getChronology();
        java.time.LocalDateTime localDateTime18 = localDate3.atTime(23, (int) '4');
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime21 = offsetTime19.plusMinutes(100L);
        java.time.LocalTime localTime22 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime19);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime25 = offsetTime23.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long27 = offsetTime23.getLong((java.time.temporal.TemporalField) chronoField26);
        java.time.temporal.TemporalUnit temporalUnit28 = chronoField26.getRangeUnit();
        boolean boolean29 = localTime22.isSupported(temporalUnit28);
        java.time.OffsetTime offsetTime30 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime32 = offsetTime30.plusMinutes(100L);
        boolean boolean33 = temporalUnit28.isSupportedBy((java.time.temporal.Temporal) offsetTime30);
        java.time.Duration duration34 = temporalUnit28.getDuration();
        java.time.Duration duration36 = duration34.withNanos((int) (short) 100);
        java.time.OffsetTime offsetTime37 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime39 = offsetTime37.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime41 = offsetTime37.withOffsetSameInstant(zoneOffset40);
        java.time.temporal.Temporal temporal42 = duration34.subtractFrom((java.time.temporal.Temporal) offsetTime41);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate43 = localDate3.minus((java.time.temporal.TemporalAmount) duration34);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(isoChronology15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField26.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 86399999999999L + "'", long27 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit28 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit28.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetTime39);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertNotNull(temporal42);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>> uRIMap2 = new java.util.Hashtable<java.net.URI, java.util.Iterator<java.lang.Double>>(59, (float) (short) 10);
        boolean boolean3 = uRIMap2.isEmpty();
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.empty();
        java.util.PrimitiveIterator.OfDouble ofDouble6 = doubleStream5.iterator();
        java.util.Iterator<java.lang.Double> doubleItor7 = uRIMap2.getOrDefault((java.lang.Object) 4096, (java.util.Iterator<java.lang.Double>) ofDouble6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(ofDouble6);
        org.junit.Assert.assertNotNull(doubleItor7);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.SHORT_STANDALONE;
        boolean boolean1 = textStyle0.isStandalone();
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.SHORT_STANDALONE + "'", textStyle0.equals(java.time.format.TextStyle.SHORT_STANDALONE));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Instant instant2 = java.time.Instant.EPOCH;
        java.lang.String str3 = instant2.toString();
        boolean boolean4 = zoneRules1.isDaylightSavings(instant2);
        java.time.Month month6 = java.time.Month.APRIL;
        int int8 = month6.length(true);
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.of((int) (short) 1, month6, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime21 = offsetTime17.withOffsetSameInstant(zoneOffset20);
        java.time.OffsetTime offsetTime22 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime24 = offsetTime22.plusMinutes(100L);
        java.time.LocalTime localTime25 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime22);
        java.time.OffsetTime offsetTime26 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime28 = offsetTime26.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime30 = offsetTime26.withOffsetSameInstant(zoneOffset29);
        java.time.OffsetTime offsetTime31 = localTime25.atOffset(zoneOffset29);
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.ofStrict(localDateTime16, zoneOffset20, (java.time.ZoneId) zoneOffset29);
        java.time.ZonedDateTime zonedDateTime34 = zonedDateTime32.withMinute(0);
        java.time.ZoneOffset zoneOffset35 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules36 = zoneOffset35.getRules();
        boolean boolean37 = zonedDateTime34.equals((java.lang.Object) zoneRules36);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime38 = zonedDateTime34.withLaterOffsetAtOverlap();
        java.time.OffsetTime offsetTime39 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime41 = offsetTime39.plusMinutes(100L);
        java.time.LocalTime localTime42 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime39);
        java.time.OffsetTime offsetTime43 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime45 = offsetTime43.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long47 = offsetTime43.getLong((java.time.temporal.TemporalField) chronoField46);
        java.time.temporal.TemporalUnit temporalUnit48 = chronoField46.getRangeUnit();
        boolean boolean49 = localTime42.isSupported(temporalUnit48);
        java.time.OffsetTime offsetTime50 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime52 = offsetTime50.plusMinutes(100L);
        boolean boolean53 = temporalUnit48.isSupportedBy((java.time.temporal.Temporal) offsetTime50);
        java.time.Duration duration54 = temporalUnit48.getDuration();
        long long55 = instant2.until((java.time.temporal.Temporal) localDateChronoZonedDateTime38, temporalUnit48);
        java.net.UnknownHostException unknownHostException56 = new java.net.UnknownHostException();
        java.io.IOException iOException57 = new java.io.IOException((java.lang.Throwable) unknownHostException56);
        boolean boolean58 = localDateChronoZonedDateTime38.equals((java.lang.Object) iOException57);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00Z" + "'", str3, "1970-01-01T00:00:00Z");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.APRIL + "'", month6.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertNotNull(zoneOffset35);
        org.junit.Assert.assertNotNull(zoneRules36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime38);
        org.junit.Assert.assertNotNull(offsetTime39);
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(offsetTime43);
        org.junit.Assert.assertNotNull(offsetTime45);
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField46.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 86399999999999L + "'", long47 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit48 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit48.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(offsetTime50);
        org.junit.Assert.assertNotNull(offsetTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-719072L) + "'", long55 == (-719072L));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.chrono.Chronology chronology1 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withChronology(chronology1);
        java.time.temporal.TemporalField[] temporalFieldArray3 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withResolverFields(temporalFieldArray3);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "/tmp/Germany3322013608249615378Germany");
        java.nio.Buffer buffer2 = charBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer4 = charBuffer1.append((java.lang.CharSequence) "23:59:59.0000001Z");
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.of(96, (int) (byte) 0, 86389, 7, 256, 5, 31);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime4 = offsetTime0.withOffsetSameInstant(zoneOffset3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset3);
        java.time.OffsetTime offsetTime7 = offsetTime5.withHour((int) (byte) 0);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.ZonedDateTime zonedDateTime28 = zonedDateTime27.withEarlierOffsetAtOverlap();
        java.time.Month month29 = zonedDateTime27.getMonth();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime30 = zonedDateTime27.toLocalDateTime();
        java.time.ZonedDateTime zonedDateTime32 = zonedDateTime27.minusSeconds(0L);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + month29 + "' != '" + java.time.Month.MARCH + "'", month29.equals(java.time.Month.MARCH));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime30);
        org.junit.Assert.assertNotNull(zonedDateTime32);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.OptionalLong optionalLong1 = longStream0.min();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = longStream0.sum();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(optionalLong1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate8 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime9 = offsetTime7.atDate(localDate8);
        java.time.OffsetTime offsetTime10 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime12 = offsetTime10.plusMinutes(100L);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime10);
        java.time.OffsetTime offsetTime14 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime16 = offsetTime14.plusMinutes(100L);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime14);
        boolean boolean18 = localTime13.isAfter(localTime17);
        java.time.LocalDateTime localDateTime19 = localDate8.atTime(localTime17);
        java.time.chrono.IsoChronology isoChronology20 = localDate8.getChronology();
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate24 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime25 = offsetTime23.atDate(localDate24);
        boolean boolean26 = localDate8.isAfter((java.time.chrono.ChronoLocalDate) localDate24);
        boolean boolean27 = localDate3.isAfter((java.time.chrono.ChronoLocalDate) localDate24);
        java.time.OffsetTime offsetTime28 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime30 = offsetTime28.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate31 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime32 = offsetTime30.atDate(localDate31);
        java.time.OffsetTime offsetTime33 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime35 = offsetTime33.plusMinutes(100L);
        java.time.LocalTime localTime36 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime33);
        java.time.OffsetTime offsetTime37 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime39 = offsetTime37.plusMinutes(100L);
        java.time.LocalTime localTime40 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime37);
        boolean boolean41 = localTime36.isAfter(localTime40);
        java.time.LocalDateTime localDateTime42 = localDate31.atTime(localTime40);
        java.time.chrono.IsoChronology isoChronology43 = localDate31.getChronology();
        java.time.OffsetTime offsetTime44 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime46 = offsetTime44.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate47 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime48 = offsetTime46.atDate(localDate47);
        boolean boolean49 = localDate31.isAfter((java.time.chrono.ChronoLocalDate) localDate47);
        boolean boolean50 = localDate3.isEqual((java.time.chrono.ChronoLocalDate) localDate47);
        java.time.OffsetTime offsetTime51 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime53 = offsetTime51.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate54 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime55 = offsetTime53.atDate(localDate54);
        java.time.OffsetTime offsetTime56 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime58 = offsetTime56.plusMinutes(100L);
        java.time.LocalTime localTime59 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime56);
        java.time.OffsetTime offsetTime60 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime62 = offsetTime60.plusMinutes(100L);
        java.time.LocalTime localTime63 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime60);
        boolean boolean64 = localTime59.isAfter(localTime63);
        java.time.LocalDateTime localDateTime65 = localDate54.atTime(localTime63);
        java.time.chrono.IsoChronology isoChronology66 = localDate54.getChronology();
        java.time.OffsetTime offsetTime67 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime69 = offsetTime67.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate70 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime71 = offsetTime69.atDate(localDate70);
        boolean boolean72 = localDate54.isAfter((java.time.chrono.ChronoLocalDate) localDate70);
        int int73 = localDate70.lengthOfMonth();
        java.time.chrono.Era era74 = localDate70.getEra();
        java.time.chrono.ChronoPeriod chronoPeriod75 = localDate47.until((java.time.chrono.ChronoLocalDate) localDate70);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetTime10);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(isoChronology20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(offsetTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(isoChronology43);
        org.junit.Assert.assertNotNull(offsetTime44);
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(offsetDateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(offsetTime51);
        org.junit.Assert.assertNotNull(offsetTime53);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(offsetDateTime55);
        org.junit.Assert.assertNotNull(offsetTime56);
        org.junit.Assert.assertNotNull(offsetTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(offsetTime60);
        org.junit.Assert.assertNotNull(offsetTime62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(isoChronology66);
        org.junit.Assert.assertNotNull(offsetTime67);
        org.junit.Assert.assertNotNull(offsetTime69);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(offsetDateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 31 + "'", int73 == 31);
        org.junit.Assert.assertTrue("'" + era74 + "' != '" + java.time.chrono.IsoEra.CE + "'", era74.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(chronoPeriod75);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(100);
        java.nio.Buffer buffer3 = floatBuffer1.limit(23);
        int int4 = buffer3.limit();
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(buffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 23 + "'", int4 == 23);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress1 = java.net.InetAddress.getByName("NanoOfDay");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: NanoOfDay: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("Germany", "Germany", file2);
        boolean boolean4 = file3.canWrite();
        java.io.File file5 = file3.getAbsoluteFile();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/Germany3637011733688159460Germany");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file5.toString(), "/tmp/Germany3637011733688159460Germany");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long13 = offsetTime9.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        boolean boolean15 = localTime8.isSupported(temporalUnit14);
        boolean boolean16 = offsetDateTime4.isSupported(temporalUnit14);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules18 = zoneOffset17.getRules();
        java.time.Instant instant19 = java.time.Instant.EPOCH;
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime22 = offsetTime20.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime24 = offsetTime20.withOffsetSameInstant(zoneOffset23);
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset23);
        java.time.OffsetTime offsetTime26 = java.time.OffsetTime.ofInstant(instant19, (java.time.ZoneId) zoneOffset23);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray27 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList28 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList28, zoneOffsetTransitionArray27);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray30 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList31 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, zoneOffsetTransitionArray30);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray33 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList34 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList34, zoneOffsetTransitionRuleArray33);
        java.time.zone.ZoneRules zoneRules36 = java.time.zone.ZoneRules.of(zoneOffset17, zoneOffset23, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList28, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList34);
        java.time.ZonedDateTime zonedDateTime37 = offsetDateTime4.atZoneSimilarLocal((java.time.ZoneId) zoneOffset17);
        java.time.OffsetDateTime offsetDateTime39 = offsetDateTime4.withYear(31);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 86399999999999L + "'", long13 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneRules18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(zoneRules36);
        org.junit.Assert.assertNotNull(zonedDateTime37);
        org.junit.Assert.assertNotNull(offsetDateTime39);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = zoneOffset0.getRules();
        java.time.Month month3 = java.time.Month.APRIL;
        int int5 = month3.length(true);
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.of((int) (short) 1, month3, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime13 = localDateTime11.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime14 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime16 = offsetTime14.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime18 = offsetTime14.withOffsetSameInstant(zoneOffset17);
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime21 = offsetTime19.plusMinutes(100L);
        java.time.LocalTime localTime22 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime19);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime25 = offsetTime23.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime27 = offsetTime23.withOffsetSameInstant(zoneOffset26);
        java.time.OffsetTime offsetTime28 = localTime22.atOffset(zoneOffset26);
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.ofStrict(localDateTime13, zoneOffset17, (java.time.ZoneId) zoneOffset26);
        boolean boolean30 = zoneRules1.equals((java.lang.Object) zoneOffset26);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertTrue("'" + month3 + "' != '" + java.time.Month.APRIL + "'", month3.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30 + "'", int5 == 30);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Set<java.lang.String> strSet1 = java.time.ZoneId.getAvailableZoneIds();
        java.util.Properties properties2 = new java.util.Properties();
        java.util.Enumeration<java.lang.Object> objEnumeration3 = properties2.keys();
        boolean boolean4 = properties0.remove((java.lang.Object) strSet1, (java.lang.Object) properties2);
        java.util.Set<java.lang.String> strSet5 = properties0.stringPropertyNames();
        boolean boolean6 = strSet5.isEmpty();
        java.time.Month month8 = java.time.Month.APRIL;
        int int10 = month8.length(true);
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.of((int) (short) 1, month8, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime21 = offsetTime19.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime23 = offsetTime19.withOffsetSameInstant(zoneOffset22);
        java.time.OffsetTime offsetTime24 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime26 = offsetTime24.plusMinutes(100L);
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime24);
        java.time.OffsetTime offsetTime28 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime30 = offsetTime28.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime32 = offsetTime28.withOffsetSameInstant(zoneOffset31);
        java.time.OffsetTime offsetTime33 = localTime27.atOffset(zoneOffset31);
        java.time.ZonedDateTime zonedDateTime34 = java.time.ZonedDateTime.ofStrict(localDateTime18, zoneOffset22, (java.time.ZoneId) zoneOffset31);
        java.time.ZonedDateTime zonedDateTime35 = zonedDateTime34.withEarlierOffsetAtOverlap();
        java.time.Month month36 = zonedDateTime34.getMonth();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime37 = zonedDateTime34.toLocalDateTime();
        java.time.ZoneId zoneId38 = zonedDateTime34.getZone();
        boolean boolean39 = strSet5.equals((java.lang.Object) zoneId38);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(objEnumeration3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + month8 + "' != '" + java.time.Month.APRIL + "'", month8.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertNotNull(zonedDateTime35);
        org.junit.Assert.assertTrue("'" + month36 + "' != '" + java.time.Month.MARCH + "'", month36.equals(java.time.Month.MARCH));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime37);
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.plusMinutes(100L);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime9);
        boolean boolean13 = localTime8.isAfter(localTime12);
        java.time.LocalDateTime localDateTime14 = localDate3.atTime(localTime12);
        java.time.chrono.IsoChronology isoChronology15 = localDate3.getChronology();
        java.time.LocalDateTime localDateTime18 = localDate3.atTime(23, (int) '4');
        java.time.OffsetTime offsetTime19 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime21 = offsetTime19.plusMinutes(100L);
        java.time.LocalTime localTime22 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime19);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime25 = offsetTime23.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long27 = offsetTime23.getLong((java.time.temporal.TemporalField) chronoField26);
        java.time.temporal.TemporalUnit temporalUnit28 = chronoField26.getRangeUnit();
        boolean boolean29 = localTime22.isSupported(temporalUnit28);
        java.time.OffsetTime offsetTime30 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime32 = offsetTime30.plusMinutes(100L);
        java.time.LocalTime localTime33 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime30);
        java.time.OffsetTime offsetTime34 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime36 = offsetTime34.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long38 = offsetTime34.getLong((java.time.temporal.TemporalField) chronoField37);
        java.time.temporal.TemporalUnit temporalUnit39 = chronoField37.getRangeUnit();
        boolean boolean40 = localTime33.isSupported(temporalUnit39);
        java.time.OffsetTime offsetTime41 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime43 = offsetTime41.plusMinutes(100L);
        boolean boolean44 = temporalUnit39.isSupportedBy((java.time.temporal.Temporal) offsetTime41);
        java.time.Duration duration45 = temporalUnit39.getDuration();
        java.time.OffsetTime offsetTime46 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime48 = offsetTime46.plusMinutes(100L);
        java.time.LocalTime localTime49 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime46);
        java.time.OffsetTime offsetTime50 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime52 = offsetTime50.plusMinutes(100L);
        java.time.LocalTime localTime53 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime50);
        boolean boolean54 = localTime49.isAfter(localTime53);
        java.time.temporal.Temporal temporal55 = duration45.subtractFrom((java.time.temporal.Temporal) localTime53);
        boolean boolean56 = localTime22.isBefore(localTime53);
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules58 = zoneOffset57.getRules();
        java.time.Instant instant59 = java.time.Instant.EPOCH;
        java.time.OffsetTime offsetTime60 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime62 = offsetTime60.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset63 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime64 = offsetTime60.withOffsetSameInstant(zoneOffset63);
        java.time.OffsetTime offsetTime65 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset63);
        java.time.OffsetTime offsetTime66 = java.time.OffsetTime.ofInstant(instant59, (java.time.ZoneId) zoneOffset63);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray67 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList68 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList68, zoneOffsetTransitionArray67);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray70 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList71 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList71, zoneOffsetTransitionArray70);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray73 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList74 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList74, zoneOffsetTransitionRuleArray73);
        java.time.zone.ZoneRules zoneRules76 = java.time.zone.ZoneRules.of(zoneOffset57, zoneOffset63, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList68, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList71, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList74);
        java.util.Date date77 = new java.util.Date();
        date77.setSeconds(0);
        java.time.Instant instant80 = date77.toInstant();
        boolean boolean81 = zoneRules76.isDaylightSavings(instant80);
        java.time.OffsetTime offsetTime82 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime84 = offsetTime82.plusMinutes(100L);
        java.time.LocalTime localTime85 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime82);
        java.time.OffsetTime offsetTime86 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime88 = offsetTime86.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField89 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long90 = offsetTime86.getLong((java.time.temporal.TemporalField) chronoField89);
        java.time.temporal.TemporalUnit temporalUnit91 = chronoField89.getRangeUnit();
        boolean boolean92 = localTime85.isSupported(temporalUnit91);
        java.time.OffsetTime offsetTime93 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime95 = offsetTime93.plusMinutes(100L);
        boolean boolean96 = temporalUnit91.isSupportedBy((java.time.temporal.Temporal) offsetTime93);
        java.time.Duration duration97 = temporalUnit91.getDuration();
        java.time.Instant instant98 = instant80.truncatedTo(temporalUnit91);
        // The following exception was thrown during execution in test generation
        try {
            long long99 = localDateTime18.until((java.time.temporal.Temporal) localTime53, temporalUnit91);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: 23:59:59.999999999 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(isoChronology15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField26.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 86399999999999L + "'", long27 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit28 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit28.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(offsetTime34);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField37.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 86399999999999L + "'", long38 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit39 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit39.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertNotNull(offsetTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(offsetTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(offsetTime50);
        org.junit.Assert.assertNotNull(offsetTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(temporal55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertNotNull(zoneRules58);
        org.junit.Assert.assertNotNull(instant59);
        org.junit.Assert.assertNotNull(offsetTime60);
        org.junit.Assert.assertNotNull(offsetTime62);
        org.junit.Assert.assertNotNull(zoneOffset63);
        org.junit.Assert.assertNotNull(offsetTime64);
        org.junit.Assert.assertNotNull(offsetTime65);
        org.junit.Assert.assertNotNull(offsetTime66);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(zoneRules76);
        org.junit.Assert.assertEquals(date77.toString(), "Mon Feb 21 09:13:00 UTC 2022");
        org.junit.Assert.assertNotNull(instant80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(offsetTime82);
        org.junit.Assert.assertNotNull(offsetTime84);
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertNotNull(offsetTime86);
        org.junit.Assert.assertNotNull(offsetTime88);
        org.junit.Assert.assertTrue("'" + chronoField89 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField89.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 86399999999999L + "'", long90 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit91 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit91.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(offsetTime93);
        org.junit.Assert.assertNotNull(offsetTime95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(duration97);
        org.junit.Assert.assertNotNull(instant98);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Set<java.lang.String> strSet1 = java.time.ZoneId.getAvailableZoneIds();
        java.util.Properties properties2 = new java.util.Properties();
        java.util.Enumeration<java.lang.Object> objEnumeration3 = properties2.keys();
        boolean boolean4 = properties0.remove((java.lang.Object) strSet1, (java.lang.Object) properties2);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = java.util.Locale.US;
        java.util.Locale[] localeArray10 = new java.util.Locale[] { locale8, locale9 };
        java.util.ArrayList<java.util.Locale> localeList11 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList11, localeArray10);
        java.util.Locale locale13 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList11);
        boolean boolean14 = languageRangeList6.isEmpty();
        java.util.Set<java.lang.String> strSet15 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean16 = languageRangeList6.retainAll((java.util.Collection<java.lang.String>) strSet15);
        boolean boolean17 = strSet1.addAll((java.util.Collection<java.lang.String>) strSet15);
        int int18 = strSet15.size();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(objEnumeration3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 600 + "'", int18 == 600);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.ZonedDateTime zonedDateTime29 = zonedDateTime27.withMinute(0);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules31 = zoneOffset30.getRules();
        boolean boolean32 = zonedDateTime29.equals((java.lang.Object) zoneRules31);
        java.time.temporal.ValueRange valueRange35 = java.time.temporal.ValueRange.of(0L, (long) 64);
        boolean boolean36 = zonedDateTime29.equals((java.lang.Object) 64);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.NANO_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = zonedDateTime29.get((java.time.temporal.TemporalField) chronoField37);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Invalid field 'NanoOfDay' for get() method, use getLong() instead");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(zoneRules31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(valueRange35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField37.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME;
        java.lang.String str1 = dateTimeFormatter0.toString();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(ParseCaseSensitive(false)(ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))'T'(Value(HourOfDay,2)':'Value(MinuteOfHour,2)[':'Value(SecondOfMinute,2)[Fraction(NanoOfSecond,0,9,DecimalPoint)]]))Offset(+HH:MM:ss,'Z'))['['ParseCaseSensitive(true)ZoneRegionId()']']" + "'", str1, "(ParseCaseSensitive(false)(ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))'T'(Value(HourOfDay,2)':'Value(MinuteOfHour,2)[':'Value(SecondOfMinute,2)[Fraction(NanoOfSecond,0,9,DecimalPoint)]]))Offset(+HH:MM:ss,'Z'))['['ParseCaseSensitive(true)ZoneRegionId()']']");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.time.Month month1 = java.time.Month.OCTOBER;
        int int2 = month1.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.of(0, month1, 86389, (int) 'a', 0, (int) (short) -1, 23);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 86389");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.OCTOBER + "'", month1.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.plusMinutes(100L);
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime0);
        java.time.OffsetTime offsetTime4 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime6 = offsetTime4.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long8 = offsetTime4.getLong((java.time.temporal.TemporalField) chronoField7);
        java.time.temporal.TemporalUnit temporalUnit9 = chronoField7.getRangeUnit();
        boolean boolean10 = localTime3.isSupported(temporalUnit9);
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime13 = offsetTime11.plusMinutes(100L);
        boolean boolean14 = temporalUnit9.isSupportedBy((java.time.temporal.Temporal) offsetTime11);
        java.time.Duration duration15 = temporalUnit9.getDuration();
        java.time.Duration duration17 = duration15.withNanos((int) (short) 100);
        java.time.OffsetTime offsetTime18 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime20 = offsetTime18.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime22 = offsetTime18.withOffsetSameInstant(zoneOffset21);
        java.time.temporal.Temporal temporal23 = duration15.subtractFrom((java.time.temporal.Temporal) offsetTime22);
        java.time.OffsetTime offsetTime25 = offsetTime22.plusMinutes(24L);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(offsetTime4);
        org.junit.Assert.assertNotNull(offsetTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86399999999999L + "'", long8 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit9 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit9.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(temporal23);
        org.junit.Assert.assertNotNull(offsetTime25);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.ZonedDateTime zonedDateTime29 = zonedDateTime27.withMinute(0);
        java.time.Month month31 = java.time.Month.APRIL;
        int int33 = month31.length(true);
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.of((int) (short) 1, month31, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime41 = localDateTime39.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime42 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime44 = offsetTime42.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime46 = offsetTime42.withOffsetSameInstant(zoneOffset45);
        java.time.OffsetTime offsetTime47 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime49 = offsetTime47.plusMinutes(100L);
        java.time.LocalTime localTime50 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime47);
        java.time.OffsetTime offsetTime51 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime53 = offsetTime51.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset54 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime55 = offsetTime51.withOffsetSameInstant(zoneOffset54);
        java.time.OffsetTime offsetTime56 = localTime50.atOffset(zoneOffset54);
        java.time.ZonedDateTime zonedDateTime57 = java.time.ZonedDateTime.ofStrict(localDateTime41, zoneOffset45, (java.time.ZoneId) zoneOffset54);
        java.time.ZonedDateTime zonedDateTime58 = zonedDateTime57.withEarlierOffsetAtOverlap();
        java.time.ZonedDateTime zonedDateTime60 = zonedDateTime58.minusNanos((long) 157);
        boolean boolean61 = zonedDateTime27.isBefore((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime58);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertTrue("'" + month31 + "' != '" + java.time.Month.APRIL + "'", month31.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 30 + "'", int33 == 30);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(offsetTime42);
        org.junit.Assert.assertNotNull(offsetTime44);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(offsetTime47);
        org.junit.Assert.assertNotNull(offsetTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(offsetTime51);
        org.junit.Assert.assertNotNull(offsetTime53);
        org.junit.Assert.assertNotNull(zoneOffset54);
        org.junit.Assert.assertNotNull(offsetTime55);
        org.junit.Assert.assertNotNull(offsetTime56);
        org.junit.Assert.assertNotNull(zonedDateTime57);
        org.junit.Assert.assertNotNull(zonedDateTime58);
        org.junit.Assert.assertNotNull(zonedDateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.nio.DoubleBuffer doubleBuffer1 = java.nio.DoubleBuffer.allocate(96);
        java.nio.DoubleBuffer doubleBuffer2 = doubleBuffer1.compact();
        java.util.Optional<double[]> doubleArrayOptional3 = java.util.Optional.empty();
        double[] doubleArray10 = new double[] { 100.0d, (byte) 100, 0.0d, (byte) -1, 'x', (short) 10 };
        double[] doubleArray11 = doubleArrayOptional3.orElse(doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer12 = doubleBuffer1.get(doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(doubleArrayOptional3);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 100.0, 0.0, -1.0, 120.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 0.0, -1.0, 120.0, 10.0]");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.plusMinutes(100L);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime9);
        boolean boolean13 = localTime8.isAfter(localTime12);
        java.time.LocalDateTime localDateTime14 = localDate3.atTime(localTime12);
        java.time.chrono.IsoChronology isoChronology15 = localDate3.getChronology();
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules17 = zoneOffset16.getRules();
        java.time.Instant instant18 = java.time.Instant.EPOCH;
        java.lang.String str19 = instant18.toString();
        boolean boolean20 = zoneRules17.isDaylightSavings(instant18);
        java.time.Month month22 = java.time.Month.APRIL;
        int int24 = month22.length(true);
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.of((int) (short) 1, month22, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime32 = localDateTime30.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime33 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime35 = offsetTime33.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime37 = offsetTime33.withOffsetSameInstant(zoneOffset36);
        java.time.OffsetTime offsetTime38 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime40 = offsetTime38.plusMinutes(100L);
        java.time.LocalTime localTime41 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime38);
        java.time.OffsetTime offsetTime42 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime44 = offsetTime42.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime46 = offsetTime42.withOffsetSameInstant(zoneOffset45);
        java.time.OffsetTime offsetTime47 = localTime41.atOffset(zoneOffset45);
        java.time.ZonedDateTime zonedDateTime48 = java.time.ZonedDateTime.ofStrict(localDateTime32, zoneOffset36, (java.time.ZoneId) zoneOffset45);
        java.time.ZonedDateTime zonedDateTime49 = isoChronology15.zonedDateTime(instant18, (java.time.ZoneId) zoneOffset45);
        java.time.DayOfWeek dayOfWeek50 = java.time.DayOfWeek.from((java.time.temporal.TemporalAccessor) zonedDateTime49);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(isoChronology15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(zoneRules17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T00:00:00Z" + "'", str19, "1970-01-01T00:00:00Z");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + month22 + "' != '" + java.time.Month.APRIL + "'", month22.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(offsetTime35);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertNotNull(offsetTime37);
        org.junit.Assert.assertNotNull(offsetTime38);
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(offsetTime42);
        org.junit.Assert.assertNotNull(offsetTime44);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(offsetTime47);
        org.junit.Assert.assertNotNull(zonedDateTime48);
        org.junit.Assert.assertNotNull(zonedDateTime49);
        org.junit.Assert.assertTrue("'" + dayOfWeek50 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek50.equals(java.time.DayOfWeek.THURSDAY));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.io.UnsupportedEncodingException unsupportedEncodingException1 = new java.io.UnsupportedEncodingException("DIRECT");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.LocalDateTime localDateTime29 = localDateTime11.withSecond((int) (byte) 1);
        java.time.Month month31 = java.time.Month.APRIL;
        int int33 = month31.length(true);
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.of((int) (short) 1, month31, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime41 = localDateTime39.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime42 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime44 = offsetTime42.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime46 = offsetTime42.withOffsetSameInstant(zoneOffset45);
        java.time.OffsetTime offsetTime47 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime49 = offsetTime47.plusMinutes(100L);
        java.time.LocalTime localTime50 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime47);
        java.time.OffsetTime offsetTime51 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime53 = offsetTime51.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset54 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime55 = offsetTime51.withOffsetSameInstant(zoneOffset54);
        java.time.OffsetTime offsetTime56 = localTime50.atOffset(zoneOffset54);
        java.time.ZonedDateTime zonedDateTime57 = java.time.ZonedDateTime.ofStrict(localDateTime41, zoneOffset45, (java.time.ZoneId) zoneOffset54);
        int int58 = localDateTime11.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime41);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + month31 + "' != '" + java.time.Month.APRIL + "'", month31.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 30 + "'", int33 == 30);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(offsetTime42);
        org.junit.Assert.assertNotNull(offsetTime44);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(offsetTime47);
        org.junit.Assert.assertNotNull(offsetTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(offsetTime51);
        org.junit.Assert.assertNotNull(offsetTime53);
        org.junit.Assert.assertNotNull(zoneOffset54);
        org.junit.Assert.assertNotNull(offsetTime55);
        org.junit.Assert.assertNotNull(offsetTime56);
        org.junit.Assert.assertNotNull(zonedDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.util.Date date0 = new java.util.Date();
        date0.setSeconds(0);
        java.time.Instant instant3 = date0.toInstant();
        java.util.Date date4 = java.util.Date.from(instant3);
        date4.setSeconds(1024);
        java.time.Instant instant7 = date4.toInstant();
        org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 09:13:00 UTC 2022");
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 09:30:04 UTC 2022");
        org.junit.Assert.assertNotNull(instant7);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("Germany", "Germany", file2);
        boolean boolean4 = file3.canWrite();
        java.lang.String str5 = file3.getAbsolutePath();
        long long6 = file3.getFreeSpace();
        long long7 = file3.getFreeSpace();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file3.toString(), "/tmp/Germany6122379318561429432Germany");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/tmp/Germany6122379318561429432Germany" + "'", str5, "/tmp/Germany6122379318561429432Germany");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 299105615872L + "'", long6 == 299105615872L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 299105619968L + "'", long7 == 299105619968L);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.FilterOutputStream filterOutputStream2 = new java.io.FilterOutputStream((java.io.OutputStream) filterOutputStream1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime16 = offsetTime12.withOffsetSameInstant(zoneOffset15);
        java.time.OffsetTime offsetTime17 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime19 = offsetTime17.plusMinutes(100L);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime17);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime23 = offsetTime21.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime25 = offsetTime21.withOffsetSameInstant(zoneOffset24);
        java.time.OffsetTime offsetTime26 = localTime20.atOffset(zoneOffset24);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.ofStrict(localDateTime11, zoneOffset15, (java.time.ZoneId) zoneOffset24);
        java.time.ZoneOffset zoneOffset28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant29 = localDateTime11.toInstant(zoneOffset28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_MONTH;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime3 = offsetTime1.plusMinutes(100L);
        java.time.LocalTime localTime4 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime1);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long9 = offsetTime5.getLong((java.time.temporal.TemporalField) chronoField8);
        java.time.temporal.TemporalUnit temporalUnit10 = chronoField8.getRangeUnit();
        boolean boolean11 = localTime4.isSupported(temporalUnit10);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.LocalTime localTime15 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime12);
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime18 = offsetTime16.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long20 = offsetTime16.getLong((java.time.temporal.TemporalField) chronoField19);
        java.time.temporal.TemporalUnit temporalUnit21 = chronoField19.getRangeUnit();
        boolean boolean22 = localTime15.isSupported(temporalUnit21);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime25 = offsetTime23.plusMinutes(100L);
        boolean boolean26 = temporalUnit21.isSupportedBy((java.time.temporal.Temporal) offsetTime23);
        java.time.Duration duration27 = temporalUnit21.getDuration();
        java.time.OffsetTime offsetTime28 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime30 = offsetTime28.plusMinutes(100L);
        java.time.LocalTime localTime31 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime28);
        java.time.OffsetTime offsetTime32 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime34 = offsetTime32.plusMinutes(100L);
        java.time.LocalTime localTime35 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime32);
        boolean boolean36 = localTime31.isAfter(localTime35);
        java.time.temporal.Temporal temporal37 = duration27.subtractFrom((java.time.temporal.Temporal) localTime35);
        boolean boolean38 = localTime4.isBefore(localTime35);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime40 = chronoField0.adjustInto(localTime4, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_MONTH + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_MONTH));
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField8.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86399999999999L + "'", long9 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit10 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit10.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField19.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86399999999999L + "'", long20 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit21 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit21.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertNotNull(offsetTime34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(temporal37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime2 = offsetTime0.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime4 = offsetTime2.atDate(localDate3);
        java.time.OffsetTime offsetTime5 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime7 = offsetTime5.plusMinutes(100L);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime5);
        java.time.OffsetTime offsetTime9 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime11 = offsetTime9.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long13 = offsetTime9.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField12.getRangeUnit();
        boolean boolean15 = localTime8.isSupported(temporalUnit14);
        boolean boolean16 = offsetDateTime4.isSupported(temporalUnit14);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules18 = zoneOffset17.getRules();
        java.time.Instant instant19 = java.time.Instant.EPOCH;
        java.time.OffsetTime offsetTime20 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime22 = offsetTime20.plusMinutes(100L);
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.UTC;
        java.time.OffsetTime offsetTime24 = offsetTime20.withOffsetSameInstant(zoneOffset23);
        java.time.OffsetTime offsetTime25 = java.time.OffsetTime.now((java.time.ZoneId) zoneOffset23);
        java.time.OffsetTime offsetTime26 = java.time.OffsetTime.ofInstant(instant19, (java.time.ZoneId) zoneOffset23);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray27 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList28 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList28, zoneOffsetTransitionArray27);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray30 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList31 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, zoneOffsetTransitionArray30);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray33 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList34 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList34, zoneOffsetTransitionRuleArray33);
        java.time.zone.ZoneRules zoneRules36 = java.time.zone.ZoneRules.of(zoneOffset17, zoneOffset23, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList28, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList31, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList34);
        java.time.ZonedDateTime zonedDateTime37 = offsetDateTime4.atZoneSimilarLocal((java.time.ZoneId) zoneOffset17);
        java.time.OffsetDateTime offsetDateTime39 = offsetDateTime4.minusNanos((long) 600);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 86399999999999L + "'", long13 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(zoneRules18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertNotNull(offsetTime26);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(zoneRules36);
        org.junit.Assert.assertNotNull(zonedDateTime37);
        org.junit.Assert.assertNotNull(offsetDateTime39);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        int[] intArray3 = new int[] { 10, 6, ' ' };
        java.nio.IntBuffer intBuffer4 = java.nio.IntBuffer.wrap(intArray3);
        java.nio.ByteOrder byteOrder5 = intBuffer4.order();
        int[] intArray6 = intBuffer4.array();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 6, 32]");
        org.junit.Assert.assertNotNull(intBuffer4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 6, 32]");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.put((byte) 1);
        short short4 = byteBuffer3.getShort();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble1 = doubleStream0.average();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble2 = doubleStream0.findFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.UNDERFLOW;
        boolean boolean1 = coderResult0.isOverflow();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = coderResult0.length();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(coderResult0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.OptionalLong optionalLong1 = longStream0.findAny();
        java.util.stream.LongStream longStream2 = longStream0.sequential();
        java.util.function.LongConsumer longConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = longStream2.peek(longConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Set<java.lang.String> strSet1 = java.time.ZoneId.getAvailableZoneIds();
        java.util.Properties properties2 = new java.util.Properties();
        java.util.Enumeration<java.lang.Object> objEnumeration3 = properties2.keys();
        boolean boolean4 = properties0.remove((java.lang.Object) strSet1, (java.lang.Object) properties2);
        int int5 = properties0.size();
        java.lang.Object obj6 = properties0.clone();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(objEnumeration3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{}");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.time.Month month1 = java.time.Month.APRIL;
        int int3 = month1.length(true);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.of((int) (short) 1, month1, 1, (int) (short) 0, 0, 59, (int) (short) 100);
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((long) (short) 1);
        java.time.OffsetTime offsetTime12 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime14 = offsetTime12.plusMinutes(100L);
        java.time.LocalTime localTime15 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) offsetTime12);
        java.time.OffsetTime offsetTime16 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime18 = offsetTime16.minusMinutes((long) (byte) 0);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.NANO_OF_DAY;
        long long20 = offsetTime16.getLong((java.time.temporal.TemporalField) chronoField19);
        java.time.temporal.TemporalUnit temporalUnit21 = chronoField19.getRangeUnit();
        boolean boolean22 = localTime15.isSupported(temporalUnit21);
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime25 = offsetTime23.plusMinutes(100L);
        boolean boolean26 = temporalUnit21.isSupportedBy((java.time.temporal.Temporal) offsetTime23);
        java.time.Duration duration27 = temporalUnit21.getDuration();
        boolean boolean28 = localDateTime11.isSupported(temporalUnit21);
        java.time.OffsetTime offsetTime29 = java.time.OffsetTime.MAX;
        java.time.OffsetTime offsetTime31 = offsetTime29.minusMinutes((long) (byte) 0);
        java.time.LocalDate localDate32 = java.time.LocalDate.MAX;
        java.time.OffsetDateTime offsetDateTime33 = offsetTime31.atDate(localDate32);
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules35 = zoneOffset34.getRules();
        java.time.OffsetTime offsetTime36 = offsetTime31.withOffsetSameLocal(zoneOffset34);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime38 = temporalUnit21.addTo(offsetTime36, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Days");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.APRIL + "'", month1.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetTime12);
        org.junit.Assert.assertNotNull(offsetTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField19.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86399999999999L + "'", long20 == 86399999999999L);
        org.junit.Assert.assertTrue("'" + temporalUnit21 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit21.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(offsetTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(offsetTime29);
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertNotNull(zoneRules35);
        org.junit.Assert.assertNotNull(offsetTime36);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("en-US");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.SECONDS;
        java.util.stream.Stream<java.util.concurrent.TimeUnit> timeUnitStream1 = java.util.stream.Stream.of(timeUnit0);
        timeUnit0.sleep((long) 600);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertNotNull(timeUnitStream1);
    }
}

