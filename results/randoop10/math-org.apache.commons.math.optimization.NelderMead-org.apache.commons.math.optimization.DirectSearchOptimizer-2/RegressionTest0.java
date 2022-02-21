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
        java.time.ZoneOffset zoneOffset0 = null;
        java.time.ZoneOffset zoneOffset1 = null;
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray2 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList3 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, zoneOffsetTransitionArray2);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray5 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList6 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, zoneOffsetTransitionArray5);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray8 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList9 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9, zoneOffsetTransitionRuleArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneRules zoneRules11 = java.time.zone.ZoneRules.of(zoneOffset0, zoneOffset1, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList3, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList6, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseStandardOffset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneOffsetTransitionRuleArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate1 = java.time.chrono.ChronoLocalDate.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.stream.IntStream intStream0 = null;
        java.util.stream.IntStream intStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream2 = java.util.stream.IntStream.concat(intStream0, intStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        java.time.ZoneOffset zoneOffset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime2 = localTime0.atOffset(zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress1 = java.net.InetAddress.getByName("/experiment");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: /experiment: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period1 = java.time.Period.parse((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.io.File file4 = file2.getParentFile();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.function.IntUnaryOperator intUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream2 = java.util.stream.IntStream.iterate(0, intUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.of("hi!");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unknown chronology: hi!");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String[] strArray1 = new java.lang.String[] { "/experiment" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.MIN;
        java.time.chrono.ChronoLocalDateTime[] chronoLocalDateTimeArray11 = new java.time.chrono.ChronoLocalDateTime[6];
        @SuppressWarnings("unchecked")
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>[] localDateChronoLocalDateTimeArray12 = (java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>[]) chronoLocalDateTimeArray11;
        localDateChronoLocalDateTimeArray12[0] = localDateTime4;
        localDateChronoLocalDateTimeArray12[1] = localDateTime5;
        localDateChronoLocalDateTimeArray12[2] = localDateTime6;
        localDateChronoLocalDateTimeArray12[3] = localDateTime7;
        localDateChronoLocalDateTimeArray12[4] = localDateTime8;
        localDateChronoLocalDateTimeArray12[5] = localDateTime9;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>[] localDateChronoLocalDateTimeArray25 = strList2.toArray(localDateChronoLocalDateTimeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronoLocalDateTimeArray11);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTimeArray12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        java.time.temporal.TemporalAdjuster temporalAdjuster3 = null;
        java.io.FileNotFoundException fileNotFoundException4 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException5 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException4);
        java.lang.String str6 = costException5.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException7 = temporalAdjusterMap2.replace(temporalAdjuster3, (org.apache.commons.math.MathException) costException5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of((int) ' ', (int) (short) 10, (int) 'a', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.Iterator<java.lang.String> strItor4 = strSet2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strItor4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.FileNotFoundException fileNotFoundException1 = new java.io.FileNotFoundException("Italian");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        java.io.FileNotFoundException fileNotFoundException4 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException5 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException4);
        java.lang.String str6 = costException5.getPattern();
        java.security.InvalidKeyException invalidKeyException7 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException5);
        org.apache.commons.math.MathException mathException8 = temporalAdjusterMap2.get((java.lang.Object) invalidKeyException7);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(mathException8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.stream.Collector.Characteristics characteristics0 = java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
        org.junit.Assert.assertTrue("'" + characteristics0 + "' != '" + java.util.stream.Collector.Characteristics.IDENTITY_FINISH + "'", characteristics0.equals(java.util.stream.Collector.Characteristics.IDENTITY_FINISH));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDateTime1.format(dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream("/experiment");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /experiment (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.temporal.TemporalAmount temporalAmount5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = localDateTime1.plus(temporalAmount5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amountToAdd");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "Italian" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.security.cert.CertificateException certificateException5 = new java.security.cert.CertificateException();
        java.security.InvalidKeyException invalidKeyException7 = new java.security.InvalidKeyException("");
        java.util.Optional<java.lang.Throwable> throwableOptional8 = java.util.Optional.ofNullable((java.lang.Throwable) invalidKeyException7);
        java.security.InvalidKeyException invalidKeyException10 = new java.security.InvalidKeyException("");
        java.security.cert.CertificateException certificateException11 = new java.security.cert.CertificateException();
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap14 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        java.io.FileNotFoundException fileNotFoundException16 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException16);
        java.lang.String str18 = costException17.getPattern();
        java.security.InvalidKeyException invalidKeyException19 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException17);
        org.apache.commons.math.MathException mathException20 = temporalAdjusterMap14.get((java.lang.Object) invalidKeyException19);
        java.security.GeneralSecurityException[] generalSecurityExceptionArray21 = new java.security.GeneralSecurityException[] { certificateException5, invalidKeyException7, invalidKeyException10, certificateException11, invalidKeyException19 };
        // The following exception was thrown during execution in test generation
        try {
            java.security.GeneralSecurityException[] generalSecurityExceptionArray22 = strList3.toArray(generalSecurityExceptionArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(throwableOptional8);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(mathException20);
        org.junit.Assert.assertNotNull(generalSecurityExceptionArray21);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.time.temporal.TemporalUnit temporalUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime17 = localTime4.truncatedTo(temporalUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime1 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime0);
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.UTC;
        long long3 = localDateTime0.toEpochSecond(zoneOffset2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = localDateTime0.minusYears((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1000000009");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-31557014135596800L) + "'", long3 == (-31557014135596800L));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        double[] doubleArray5 = new double[] { 0.0f, (-1.0d), (-1.0f), (short) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer8 = java.nio.DoubleBuffer.wrap(doubleArray5, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, -1.0, -1.0, -1.0, -1.0]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        int int3 = zonedDateTime2.getSecond();
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime5 = zonedDateTime2.with((java.time.temporal.TemporalAdjuster) zoneOffset4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId6 = java.time.ZoneId.ofOffset("hi!", zoneOffset4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prefix should be GMT, UTC or UT, is: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.nio.charset.CharacterCodingException characterCodingException0 = new java.nio.charset.CharacterCodingException();
        java.lang.String str1 = characterCodingException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.nio.charset.CharacterCodingException" + "'", str1, "java.nio.charset.CharacterCodingException");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByName("Italian");
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        long long6 = java.util.Date.UTC(51, (int) (byte) 0, (int) 'a', 10, (int) (byte) 10, 51);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-591284949000L) + "'", long6 == (-591284949000L));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate3 = localDate0.minus((long) (short) 100, temporalUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset1 = java.nio.charset.Charset.forName("MilliOfSecond");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: MilliOfSecond");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        java.time.temporal.TemporalUnit temporalUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal7 = zonedDateTime1.plus((long) (-1), temporalUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.temporal.TemporalAmount temporalAmount6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime7 = zonedDateTime5.minus(temporalAmount6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amountToSubtract");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException16 = new java.util.InvalidPropertiesFormatException((java.lang.Throwable) costException12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.net.URI uRI1 = java.net.URI.create("hi!");
        java.lang.String str2 = uRI1.getSchemeSpecificPart();
        java.net.URI uRI3 = uRI1.normalize();
        boolean boolean5 = uRI1.equals((java.lang.Object) (short) 0);
        boolean boolean6 = uRI1.isAbsolute();
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        char char0 = java.io.File.pathSeparatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ':' + "'", char0 == ':');
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.temporal.TemporalAmount temporalAmount10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime11 = offsetTime9.minus(temporalAmount10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        long long4 = localDateTime1.toEpochSecond(zoneOffset3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId5 = java.time.ZoneId.ofOffset("hi!", zoneOffset3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prefix should be GMT, UTC or UT, is: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-31557014135596800L) + "'", long4 == (-31557014135596800L));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset1 = java.nio.charset.Charset.forName("java.nio.charset.CharacterCodingException");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: java.nio.charset.CharacterCodingException");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.Enumeration<java.net.NetworkInterface> networkInterfaceEnumeration0 = java.net.NetworkInterface.getNetworkInterfaces();
        org.junit.Assert.assertNotNull(networkInterfaceEnumeration0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.security.CodeSource codeSource0 = null;
        java.security.PermissionCollection permissionCollection1 = null;
        java.security.ProtectionDomain protectionDomain2 = new java.security.ProtectionDomain(codeSource0, permissionCollection1);
        org.junit.Assert.assertEquals(protectionDomain2.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("United States", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=unitedstates");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.UnsupportedEncodingException unsupportedEncodingException0 = new java.io.UnsupportedEncodingException();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now(clock6);
        java.time.Duration duration8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Clock clock9 = java.time.Clock.tick(clock6, duration8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: tickDuration");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.security.cert.CertificateException certificateException1 = new java.security.cert.CertificateException();
        java.security.KeyException keyException2 = new java.security.KeyException("United States", (java.lang.Throwable) certificateException1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "Italian", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream0, true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.text.ParseException parseException2 = new java.text.ParseException("", 52);
        java.util.Optional<java.text.ParseException> parseExceptionOptional3 = java.util.Optional.of(parseException2);
        org.junit.Assert.assertNotNull(parseExceptionOptional3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.time.Clock clock0 = java.time.Clock.systemDefaultZone();
        org.junit.Assert.assertNotNull(clock0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = chronoField0.getDisplayName(locale1);
        java.lang.String str3 = locale1.getScript();
        java.lang.Object obj4 = locale1.clone();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MilliOfSecond" + "'", str2, "MilliOfSecond");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "en_US");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now(clock6);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = localDateTime7.query(booleanTemporalQuery8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.FileNotFoundException fileNotFoundException1 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException2 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException1);
        java.lang.String str3 = costException2.getPattern();
        java.security.InvalidKeyException invalidKeyException4 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException2);
        java.security.InvalidKeyException invalidKeyException5 = new java.security.InvalidKeyException((java.lang.Throwable) costException2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        java.time.LocalTime localTime1 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal2 = localTime0.adjustInto((java.time.temporal.Temporal) localTime1);
        java.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localTime1.format(dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(temporal2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "United States");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'United States' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = offsetTime9.format(dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.temporal.TemporalUnit temporalUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime12 = offsetTime9.minus(1L, temporalUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of(0, (int) (byte) 100, 64, (int) (byte) 100, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        java.lang.String str6 = file2.toString();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Date date1 = new java.util.Date((long) (short) 0);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.TUESDAY;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        boolean boolean4 = zonedDateTime2.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime2.withZoneSameInstant(zoneId5);
        java.time.Clock clock7 = java.time.Clock.tickMinutes(zoneId5);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now(zoneId5);
        java.time.Instant instant9 = offsetDateTime8.toInstant();
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId14 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime11.withZoneSameInstant(zoneId14);
        java.time.Clock clock16 = java.time.Clock.tickMinutes(zoneId14);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now(zoneId14);
        int int18 = offsetDateTime17.getNano();
        java.time.ZoneId zoneId19 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime20 = java.time.ZonedDateTime.now(zoneId19);
        boolean boolean22 = zonedDateTime20.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId23 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime24 = zonedDateTime20.withZoneSameInstant(zoneId23);
        java.time.Clock clock25 = java.time.Clock.tickMinutes(zoneId23);
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now(zoneId23);
        boolean boolean27 = offsetDateTime17.isBefore(offsetDateTime26);
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        boolean boolean29 = offsetDateTime26.isSupported((java.time.temporal.TemporalField) chronoField28);
        boolean boolean30 = instant9.isSupported((java.time.temporal.TemporalField) chronoField28);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange31 = dayOfWeek0.range((java.time.temporal.TemporalField) chronoField28);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: AlignedDayOfWeekInYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(clock16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 341000000 + "'", int18 == 341000000);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertNotNull(clock25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField28.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        java.time.temporal.TemporalAmount temporalAmount5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime6 = zonedDateTime1.plus(temporalAmount5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amountToAdd");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Locale locale1 = java.util.Locale.US;
        java.time.DayOfWeek dayOfWeek2 = java.time.DayOfWeek.TUESDAY;
        java.time.LocalDate localDate3 = java.time.LocalDate.now();
        java.time.temporal.Temporal temporal4 = dayOfWeek2.adjustInto((java.time.temporal.Temporal) localDate3);
        java.lang.Object[] objArray5 = new java.lang.Object[] { locale1, dayOfWeek2 };
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("United States", objArray5);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(temporal4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[en_US, TUESDAY]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[en_US, TUESDAY]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.Iterator<java.lang.String> strItor4 = strSet2.iterator();
        java.util.Set<java.lang.String> strSet5 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean6 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet5);
        strSet5.clear();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime7);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        long long10 = localDateTime7.toEpochSecond(zoneOffset9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.of((int) (byte) 0, 0, (-1), (int) (byte) 1, 196000000, (int) 'a', 54, zoneOffset9);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-31557014135596800L) + "'", long10 == (-31557014135596800L));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        boolean boolean12 = file2.setWritable(true, true);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream14 = new java.io.PrintStream(file2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.text.ParseException parseException2 = new java.text.ParseException("", 52);
        java.lang.String str3 = parseException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.text.ParseException: " + "'", str3, "java.text.ParseException: ");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.getDayOfYear();
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = chronoField2.getDisplayName(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate6 = localDate0.with((java.time.temporal.TemporalField) chronoField2, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MilliOfSecond");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MilliOfSecond" + "'", str4, "MilliOfSecond");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ERA;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ERA + "'", chronoField0.equals(java.time.temporal.ChronoField.ERA));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        boolean boolean4 = zonedDateTime2.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime2.withZoneSameInstant(zoneId5);
        java.time.Clock clock7 = java.time.Clock.tickMinutes(zoneId5);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.now(clock7);
        long long9 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) localDateTime8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime11 = localDateTime8.withHour((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate4 = isoChronology0.date((int) ':', 0, (int) ':');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.nio.charset.CodingErrorAction codingErrorAction0 = java.nio.charset.CodingErrorAction.REPLACE;
        java.lang.String str1 = codingErrorAction0.toString();
        org.junit.Assert.assertNotNull(codingErrorAction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "REPLACE" + "'", str1, "REPLACE");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("java.text.ParseException: ", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.nio.charset.CodingErrorAction codingErrorAction0 = java.nio.charset.CodingErrorAction.REPORT;
        org.junit.Assert.assertNotNull(codingErrorAction0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneId zoneId3 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime4 = java.time.ZonedDateTime.now(zoneId3);
        boolean boolean6 = zonedDateTime4.equals((java.lang.Object) 10);
        java.time.LocalTime localTime7 = zonedDateTime4.toLocalTime();
        java.time.ZonedDateTime zonedDateTime9 = zonedDateTime4.minusMonths((long) '#');
        java.time.ZonedDateTime zonedDateTime11 = zonedDateTime4.plusDays((long) '4');
        int int12 = zonedDateTime1.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime4);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        int int18 = offsetDateTime16.getSecond();
        java.time.temporal.TemporalAmount temporalAmount19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime20 = offsetDateTime16.plus(temporalAmount19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 337000000 + "'", int8 == 337000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = chronoField0.getDisplayName(locale1);
        java.lang.String str3 = locale1.getScript();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str8 = locale1.getDisplayCountry(locale7);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = chronoField9.getDisplayName(locale10);
        java.lang.String str12 = locale10.getScript();
        java.util.Locale locale16 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str17 = locale10.getDisplayCountry(locale16);
        java.lang.String str18 = locale7.getDisplayName(locale10);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MilliOfSecond" + "'", str2, "MilliOfSecond");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United States" + "'", str8, "United States");
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField9.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MilliOfSecond" + "'", str11, "MilliOfSecond");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale16.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "United States" + "'", str17, "United States");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (hi!)" + "'", str18, "hi! (hi!)");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.time.LocalTime localTime17 = localTime4.withSecond((int) '#');
        java.time.temporal.TemporalUnit temporalUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime19 = localTime17.truncatedTo(temporalUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Iterator<java.lang.String> strItor7 = strSet5.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction8 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean9 = strSet5.equals((java.lang.Object) codingErrorAction8);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet5);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.Iterator<java.lang.String> strItor18 = strSet16.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction19 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean20 = strSet16.equals((java.lang.Object) codingErrorAction19);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strSet16);
        boolean boolean22 = strList10.equals((java.lang.Object) languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(codingErrorAction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(codingErrorAction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.getDayOfYear();
        java.lang.String str2 = localDate0.toString();
        java.time.temporal.TemporalAmount temporalAmount3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate4 = localDate0.plus(temporalAmount3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amountToAdd");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21" + "'", str2, "2022-02-21");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime1.minusMonths((long) '#');
        java.time.ZonedDateTime zonedDateTime8 = zonedDateTime1.plusDays((long) '4');
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.LocalTime localTime13 = zonedDateTime10.toLocalTime();
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime15 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime14);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.UTC;
        long long17 = localDateTime14.toEpochSecond(zoneOffset16);
        java.time.OffsetTime offsetTime18 = localTime13.atOffset(zoneOffset16);
        java.time.LocalTime localTime20 = localTime13.minusNanos((long) 0);
        java.time.temporal.TemporalUnit temporalUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = zonedDateTime1.until((java.time.temporal.Temporal) localTime20, temporalUnit21);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 09:13:57.199 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-31557014135596800L) + "'", long17 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.Iterator<java.lang.String> strItor4 = strSet2.iterator();
        java.util.Set<java.lang.String> strSet5 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean6 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Iterator<java.lang.String> strItor11 = strSet9.iterator();
        java.util.Set<java.lang.String> strSet12 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean13 = strSet9.retainAll((java.util.Collection<java.lang.String>) strSet12);
        boolean boolean14 = strSet5.containsAll((java.util.Collection<java.lang.String>) strSet9);
        strSet9.clear();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.function.UnaryOperator<java.util.AbstractCollection<java.lang.String>> strCollectionUnaryOperator0 = java.util.function.UnaryOperator.identity();
        org.junit.Assert.assertNotNull(strCollectionUnaryOperator0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        java.time.Month month5 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime1);
        java.time.temporal.TemporalAdjuster temporalAdjuster6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime7 = zonedDateTime1.with(temporalAdjuster6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = localDateTime0.withSecond(361000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 361000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.temporal.TemporalAmount temporalAmount2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate3 = localDate0.minus(temporalAmount2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amountToSubtract");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localDateTime1.query(booleanTemporalQuery3);
        java.text.Format format5 = dateTimeFormatter0.toFormat(booleanTemporalQuery3);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor8 = dateTimeFormatter0.parse((java.lang.CharSequence) "hi! (hi!)", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(format5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Iterator<java.lang.String> strItor7 = strSet5.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction8 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean9 = strSet5.equals((java.lang.Object) codingErrorAction8);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet5);
        boolean boolean12 = strList10.equals((java.lang.Object) "MilliOfSecond");
        boolean boolean14 = strList10.add("United States");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(codingErrorAction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = chronoField2.getDisplayName(locale3);
        java.lang.String str5 = locale3.getScript();
        java.lang.String str6 = locale0.getDisplayName(locale3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MilliOfSecond" + "'", str4, "MilliOfSecond");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Japanese (Japan)" + "'", str6, "Japanese (Japan)");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        java.time.temporal.TemporalAmount temporalAmount8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime9 = offsetDateTime7.minus(temporalAmount8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime1 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = java.time.LocalDate.from((java.time.temporal.TemporalAccessor) localTime1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDate from TemporalAccessor: 00:00 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Locale locale0 = java.util.Locale.UK;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Optional<java.time.OffsetDateTime> offsetDateTimeOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(offsetDateTimeOptional0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localDateTime1.query(booleanTemporalQuery3);
        java.text.Format format5 = dateTimeFormatter0.toFormat(booleanTemporalQuery3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = format5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(format5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.LANGUAGE;
        org.junit.Assert.assertNotNull(attribute0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MICROSECONDS;
        long long2 = timeUnit0.toDays((long) (byte) 100);
        java.lang.Thread thread3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeUnit0.timedJoin(thread3, (long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.temporal.TemporalUnit temporalUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime7 = localDateTime0.plus((long) 100, temporalUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.net.URI uRI1 = java.net.URI.create("hi!");
        java.lang.String str2 = uRI1.getSchemeSpecificPart();
        java.net.URI uRI3 = uRI1.normalize();
        boolean boolean5 = uRI1.equals((java.lang.Object) (short) 0);
        java.lang.String str6 = uRI1.getScheme();
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.time.ZoneId zoneId16 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime17 = java.time.ZonedDateTime.now(zoneId16);
        boolean boolean19 = zonedDateTime17.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime21 = zonedDateTime17.withZoneSameInstant(zoneId20);
        java.time.Clock clock22 = java.time.Clock.tickMinutes(zoneId20);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now(zoneId20);
        int int24 = offsetDateTime23.getNano();
        java.time.ZoneId zoneId25 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.now(zoneId25);
        boolean boolean28 = zonedDateTime26.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId29 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime26.withZoneSameInstant(zoneId29);
        java.time.Clock clock31 = java.time.Clock.tickMinutes(zoneId29);
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.now(zoneId29);
        boolean boolean33 = offsetDateTime23.isBefore(offsetDateTime32);
        int int34 = offsetDateTime23.getDayOfYear();
        java.security.cert.CertificateException certificateException35 = new java.security.cert.CertificateException();
        boolean boolean36 = temporalAdjusterMap2.remove((java.lang.Object) offsetDateTime23, (java.lang.Object) certificateException35);
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap39 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean40 = temporalAdjusterMap39.isEmpty();
        java.time.LocalTime localTime41 = java.time.LocalTime.now();
        java.time.LocalTime localTime42 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal43 = localTime41.adjustInto((java.time.temporal.Temporal) localTime42);
        java.io.FileNotFoundException fileNotFoundException44 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException44);
        java.lang.String str46 = costException45.getPattern();
        java.io.FileNotFoundException fileNotFoundException48 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException49 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException48);
        java.lang.String str50 = costException49.getPattern();
        java.security.InvalidKeyException invalidKeyException51 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException49);
        boolean boolean52 = temporalAdjusterMap39.replace((java.time.temporal.TemporalAdjuster) localTime41, (org.apache.commons.math.MathException) costException45, (org.apache.commons.math.MathException) costException49);
        java.time.LocalTime localTime54 = localTime41.withSecond((int) '#');
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap57 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean58 = temporalAdjusterMap57.isEmpty();
        java.time.LocalTime localTime59 = java.time.LocalTime.now();
        java.time.LocalTime localTime60 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal61 = localTime59.adjustInto((java.time.temporal.Temporal) localTime60);
        java.io.FileNotFoundException fileNotFoundException62 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException63 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException62);
        java.lang.String str64 = costException63.getPattern();
        java.io.FileNotFoundException fileNotFoundException66 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException67 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException66);
        java.lang.String str68 = costException67.getPattern();
        java.security.InvalidKeyException invalidKeyException69 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException67);
        boolean boolean70 = temporalAdjusterMap57.replace((java.time.temporal.TemporalAdjuster) localTime59, (org.apache.commons.math.MathException) costException63, (org.apache.commons.math.MathException) costException67);
        org.apache.commons.math.MathException mathException71 = temporalAdjusterMap2.putIfAbsent((java.time.temporal.TemporalAdjuster) localTime54, (org.apache.commons.math.MathException) costException67);
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap72 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((java.util.Map<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>) temporalAdjusterMap2);
        java.time.format.DateTimeFormatter dateTimeFormatter73 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime74 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime75 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime74);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery76 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean77 = localDateTime74.query(booleanTemporalQuery76);
        java.text.Format format78 = dateTimeFormatter73.toFormat(booleanTemporalQuery76);
        java.time.temporal.ChronoField chronoField79 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale80 = java.util.Locale.US;
        java.lang.String str81 = chronoField79.getDisplayName(locale80);
        java.time.temporal.ChronoField chronoField82 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        java.time.temporal.ChronoField chronoField83 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId84 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime85 = java.time.ZonedDateTime.now(zoneId84);
        boolean boolean87 = zonedDateTime85.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId88 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime89 = zonedDateTime85.withZoneSameInstant(zoneId88);
        java.time.Clock clock90 = java.time.Clock.tickMinutes(zoneId88);
        java.time.LocalDateTime localDateTime91 = java.time.LocalDateTime.now(clock90);
        long long92 = chronoField83.getFrom((java.time.temporal.TemporalAccessor) localDateTime91);
        java.time.temporal.TemporalField[] temporalFieldArray93 = new java.time.temporal.TemporalField[] { chronoField79, chronoField82, chronoField83 };
        java.time.format.DateTimeFormatter dateTimeFormatter94 = dateTimeFormatter73.withResolverFields(temporalFieldArray93);
        org.apache.commons.math.MathException mathException95 = temporalAdjusterMap2.remove((java.lang.Object) temporalFieldArray93);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 257000000 + "'", int24 == 257000000);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(clock31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(temporal43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(temporal61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(mathException71);
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(booleanTemporalQuery76);
        org.junit.Assert.assertEquals("'" + boolean77 + "' != '" + false + "'", boolean77, false);
        org.junit.Assert.assertNotNull(format78);
        org.junit.Assert.assertTrue("'" + chronoField79 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField79.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "MilliOfSecond" + "'", str81, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + chronoField82 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField82.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + chronoField83 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField83.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId84);
        org.junit.Assert.assertNotNull(zonedDateTime85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(zoneId88);
        org.junit.Assert.assertNotNull(zonedDateTime89);
        org.junit.Assert.assertNotNull(clock90);
        org.junit.Assert.assertNotNull(localDateTime91);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray93);
        org.junit.Assert.assertNotNull(dateTimeFormatter94);
        org.junit.Assert.assertNull(mathException95);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime1.minusMonths((long) '#');
        java.time.temporal.TemporalUnit temporalUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime9 = zonedDateTime1.minus((long) 257000000, temporalUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Month month1 = java.time.Month.of(63000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear: 63000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        java.time.LocalTime localTime2 = localTime0.plusHours((long) (byte) 1);
        java.time.LocalDate localDate3 = java.time.LocalDate.now();
        int int4 = localDate3.lengthOfMonth();
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime6 = java.time.ZonedDateTime.now(zoneId5);
        boolean boolean8 = zonedDateTime6.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime6.withZoneSameInstant(zoneId9);
        java.time.Clock clock11 = java.time.Clock.tickMinutes(zoneId9);
        java.time.LocalDate localDate12 = java.time.LocalDate.now(clock11);
        java.time.Period period13 = localDate3.until((java.time.chrono.ChronoLocalDate) localDate12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime14 = localTime0.with((java.time.temporal.TemporalAdjuster) localDate12);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 28 + "'", int4 == 28);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        int int18 = offsetDateTime7.getDayOfYear();
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime7.withSecond(51);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime22 = offsetDateTime20.minusDays((-31557014135596800L));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -39863503953892");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 599000000 + "'", int8 == 599000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(offsetDateTime20);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        file2.deleteOnExit();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime1 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime0);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery2 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean3 = localDateTime0.query(booleanTemporalQuery2);
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery7 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean8 = localDateTime5.query(booleanTemporalQuery7);
        java.text.Format format9 = dateTimeFormatter4.toFormat(booleanTemporalQuery7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDateTime0.format(dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(booleanTemporalQuery2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(booleanTemporalQuery7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNotNull(format9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime1.minusMonths((long) '#');
        java.time.ZonedDateTime zonedDateTime8 = zonedDateTime1.plusDays((long) '4');
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime1.minusSeconds((long) 533000000);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of((int) ' ', 533000000, (int) (short) 10, 196000000, 196000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 533000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.net.Proxy.Type type0 = null;
        java.net.SocketAddress socketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Proxy proxy2 = new java.net.Proxy(type0, socketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type null is not compatible with address null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = java.time.Duration.parse((java.lang.CharSequence) "Japanese (Japan)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Duration");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        int int18 = offsetDateTime7.getDayOfYear();
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime7.withSecond(51);
        java.time.ZoneId zoneId21 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime22 = java.time.ZonedDateTime.now(zoneId21);
        boolean boolean24 = zonedDateTime22.equals((java.lang.Object) 10);
        java.time.LocalTime localTime25 = zonedDateTime22.toLocalTime();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime26);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.UTC;
        long long29 = localDateTime26.toEpochSecond(zoneOffset28);
        java.time.OffsetTime offsetTime30 = localTime25.atOffset(zoneOffset28);
        java.time.ZoneId zoneId31 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.now(zoneId31);
        boolean boolean34 = zonedDateTime32.equals((java.lang.Object) 10);
        java.time.LocalTime localTime35 = zonedDateTime32.toLocalTime();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime37 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime36);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        long long39 = localDateTime36.toEpochSecond(zoneOffset38);
        java.time.OffsetTime offsetTime40 = localTime35.atOffset(zoneOffset38);
        java.time.OffsetTime offsetTime41 = offsetTime30.withOffsetSameInstant(zoneOffset38);
        java.time.ZonedDateTime zonedDateTime42 = offsetDateTime20.atZoneSimilarLocal((java.time.ZoneId) zoneOffset38);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime44 = zonedDateTime42.withDayOfYear(533000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 533000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26000000 + "'", int8 == 26000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-31557014135596800L) + "'", long29 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-31557014135596800L) + "'", long39 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertNotNull(zonedDateTime42);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = java.time.Instant.parse((java.lang.CharSequence) "Japanese (Japan)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Japanese (Japan)' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = java.time.Duration.parse((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Duration");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.TUESDAY;
        java.time.LocalDate localDate1 = java.time.LocalDate.now();
        java.time.temporal.Temporal temporal2 = dayOfWeek0.adjustInto((java.time.temporal.Temporal) localDate1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = localDate1.atTime(28, 264000000, 533000000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 28");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(temporal2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap3 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean4 = temporalAdjusterMap3.isEmpty();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.LocalTime localTime6 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal7 = localTime5.adjustInto((java.time.temporal.Temporal) localTime6);
        java.io.FileNotFoundException fileNotFoundException8 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException8);
        java.lang.String str10 = costException9.getPattern();
        java.io.FileNotFoundException fileNotFoundException12 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException12);
        java.lang.String str14 = costException13.getPattern();
        java.security.InvalidKeyException invalidKeyException15 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException13);
        boolean boolean16 = temporalAdjusterMap3.replace((java.time.temporal.TemporalAdjuster) localTime5, (org.apache.commons.math.MathException) costException9, (org.apache.commons.math.MathException) costException13);
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = java.time.ZonedDateTime.now(zoneId17);
        boolean boolean20 = zonedDateTime18.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId21 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime22 = zonedDateTime18.withZoneSameInstant(zoneId21);
        java.time.Clock clock23 = java.time.Clock.tickMinutes(zoneId21);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now(zoneId21);
        int int25 = offsetDateTime24.getNano();
        java.time.ZoneId zoneId26 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.now(zoneId26);
        boolean boolean29 = zonedDateTime27.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId30 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime31 = zonedDateTime27.withZoneSameInstant(zoneId30);
        java.time.Clock clock32 = java.time.Clock.tickMinutes(zoneId30);
        java.time.OffsetDateTime offsetDateTime33 = java.time.OffsetDateTime.now(zoneId30);
        boolean boolean34 = offsetDateTime24.isBefore(offsetDateTime33);
        int int35 = offsetDateTime24.getDayOfYear();
        java.security.cert.CertificateException certificateException36 = new java.security.cert.CertificateException();
        boolean boolean37 = temporalAdjusterMap3.remove((java.lang.Object) offsetDateTime24, (java.lang.Object) certificateException36);
        java.util.concurrent.ExecutionException executionException38 = new java.util.concurrent.ExecutionException("java.nio.charset.CharacterCodingException", (java.lang.Throwable) certificateException36);
        java.security.SignatureException signatureException39 = new java.security.SignatureException((java.lang.Throwable) certificateException36);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(temporal7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(clock23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 127000000 + "'", int25 == 127000000);
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertNotNull(clock32);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("");
        java.util.Optional<java.lang.Throwable> throwableOptional2 = java.util.Optional.ofNullable((java.lang.Throwable) invalidKeyException1);
        java.lang.Throwable throwable3 = throwableOptional2.get();
        org.junit.Assert.assertNotNull(throwableOptional2);
        org.junit.Assert.assertNotNull(throwable3);
        org.junit.Assert.assertEquals(throwable3.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable3.getMessage(), "");
        org.junit.Assert.assertEquals(throwable3.toString(), "java.security.InvalidKeyException: ");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.LocalTime localTime14 = zonedDateTime11.toLocalTime();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        long long18 = localDateTime15.toEpochSecond(zoneOffset17);
        java.time.OffsetTime offsetTime19 = localTime14.atOffset(zoneOffset17);
        java.time.OffsetTime offsetTime20 = offsetTime9.withOffsetSameInstant(zoneOffset17);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime22 = offsetTime9.withSecond(50000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 50000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-31557014135596800L) + "'", long18 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Date date3 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        boolean boolean5 = date3.equals((java.lang.Object) false);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.function.Function<java.security.cert.CertificateException, java.security.cert.CertificateException> certificateExceptionFunction0 = java.util.function.Function.identity();
        org.junit.Assert.assertNotNull(certificateExceptionFunction0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.net.URI uRI1 = java.net.URI.create("hi!");
        java.lang.String str2 = uRI1.getFragment();
        java.net.URI uRI3 = uRI1.parseServerAuthority();
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(uRI3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap4 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean5 = temporalAdjusterMap4.isEmpty();
        java.time.LocalTime localTime6 = java.time.LocalTime.now();
        java.time.LocalTime localTime7 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal8 = localTime6.adjustInto((java.time.temporal.Temporal) localTime7);
        java.io.FileNotFoundException fileNotFoundException9 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException9);
        java.lang.String str11 = costException10.getPattern();
        java.io.FileNotFoundException fileNotFoundException13 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException13);
        java.lang.String str15 = costException14.getPattern();
        java.security.InvalidKeyException invalidKeyException16 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException14);
        boolean boolean17 = temporalAdjusterMap4.replace((java.time.temporal.TemporalAdjuster) localTime6, (org.apache.commons.math.MathException) costException10, (org.apache.commons.math.MathException) costException14);
        java.time.ZoneId zoneId18 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.now(zoneId18);
        boolean boolean21 = zonedDateTime19.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId22 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime23 = zonedDateTime19.withZoneSameInstant(zoneId22);
        java.time.Clock clock24 = java.time.Clock.tickMinutes(zoneId22);
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.now(zoneId22);
        int int26 = offsetDateTime25.getNano();
        java.time.ZoneId zoneId27 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime28 = java.time.ZonedDateTime.now(zoneId27);
        boolean boolean30 = zonedDateTime28.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId31 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime32 = zonedDateTime28.withZoneSameInstant(zoneId31);
        java.time.Clock clock33 = java.time.Clock.tickMinutes(zoneId31);
        java.time.OffsetDateTime offsetDateTime34 = java.time.OffsetDateTime.now(zoneId31);
        boolean boolean35 = offsetDateTime25.isBefore(offsetDateTime34);
        int int36 = offsetDateTime25.getDayOfYear();
        java.security.cert.CertificateException certificateException37 = new java.security.cert.CertificateException();
        boolean boolean38 = temporalAdjusterMap4.remove((java.lang.Object) offsetDateTime25, (java.lang.Object) certificateException37);
        java.time.Instant instant41 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset44 = java.time.ZoneOffset.UTC;
        java.lang.Object[] objArray46 = new java.lang.Object[] { instant41, 1.0d, "hi!", zoneOffset44, (byte) 100 };
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("Italian", objArray46);
        org.apache.commons.math.optimization.CostException costException48 = new org.apache.commons.math.optimization.CostException("United States", objArray46);
        org.apache.commons.math.MathException mathException49 = temporalAdjusterMap4.get((java.lang.Object) objArray46);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("/experiment", objArray46);
        java.util.concurrent.TimeoutException timeoutException51 = new java.util.concurrent.TimeoutException();
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("/experiment", objArray46, (java.lang.Throwable) timeoutException51);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(temporal8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertNotNull(clock24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 391000000 + "'", int26 == 391000000);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertNotNull(clock33);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(zoneOffset44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1970-01-01T00:00:00Z, 1.0, hi!, Z, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1970-01-01T00:00:00Z, 1.0, hi!, Z, 100]");
        org.junit.Assert.assertNull(mathException49);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_HOUR + "'", chronoField0.equals(java.time.temporal.ChronoField.MINUTE_OF_HOUR));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime1.minusMonths((long) '#');
        java.time.ZonedDateTime zonedDateTime8 = zonedDateTime1.plusDays((long) '4');
        int int9 = zonedDateTime1.getDayOfMonth();
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.LocalTime localTime14 = zonedDateTime11.toLocalTime();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        long long18 = localDateTime15.toEpochSecond(zoneOffset17);
        java.time.OffsetTime offsetTime19 = localTime14.atOffset(zoneOffset17);
        java.time.OffsetTime offsetTime20 = offsetTime9.withOffsetSameInstant(zoneOffset17);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = offsetTime20.getLong((java.time.temporal.TemporalField) chronoField21);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: AlignedDayOfWeekInYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-31557014135596800L) + "'", long18 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime3.withZoneSameInstant(zoneId6);
        java.time.Clock clock8 = java.time.Clock.tickMinutes(zoneId6);
        java.time.LocalDate localDate9 = java.time.LocalDate.now(clock8);
        java.time.Period period10 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.chrono.ChronoPeriod chronoPeriod11 = period10.negated();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(chronoPeriod11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.NARROW;
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle0.equals(java.time.format.TextStyle.NARROW));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.util.Date date19 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        int int20 = date19.getYear();
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap23 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean24 = temporalAdjusterMap23.isEmpty();
        java.time.LocalTime localTime25 = java.time.LocalTime.now();
        java.time.LocalTime localTime26 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal27 = localTime25.adjustInto((java.time.temporal.Temporal) localTime26);
        java.io.FileNotFoundException fileNotFoundException28 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException28);
        java.lang.String str30 = costException29.getPattern();
        java.io.FileNotFoundException fileNotFoundException32 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException33 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException32);
        java.lang.String str34 = costException33.getPattern();
        java.security.InvalidKeyException invalidKeyException35 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException33);
        boolean boolean36 = temporalAdjusterMap23.replace((java.time.temporal.TemporalAdjuster) localTime25, (org.apache.commons.math.MathException) costException29, (org.apache.commons.math.MathException) costException33);
        org.apache.commons.math.MathException mathException37 = temporalAdjusterMap2.getOrDefault((java.lang.Object) date19, (org.apache.commons.math.MathException) costException33);
        java.time.Instant instant38 = date19.toInstant();
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.HOUR_OF_AMPM;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant41 = instant38.with((java.time.temporal.TemporalField) chronoField39, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfAmPm (valid values 0 - 11): 35");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(temporal27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(mathException37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_AMPM + "'", chronoField39.equals(java.time.temporal.ChronoField.HOUR_OF_AMPM));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap0 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.Date date1 = new java.util.Date((long) 998000000);
        org.junit.Assert.assertEquals(date1.toString(), "Mon Jan 12 13:13:20 UTC 1970");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.concurrent.TimeoutException timeoutException1 = new java.util.concurrent.TimeoutException("REPLACE");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.time.temporal.TemporalAccessor temporalAccessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.from(temporalAccessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.LocalTime localTime14 = zonedDateTime11.toLocalTime();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        long long18 = localDateTime15.toEpochSecond(zoneOffset17);
        java.time.OffsetTime offsetTime19 = localTime14.atOffset(zoneOffset17);
        java.time.OffsetTime offsetTime20 = offsetTime9.withOffsetSameInstant(zoneOffset17);
        java.time.ZoneId zoneId21 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime22 = java.time.ZonedDateTime.now(zoneId21);
        boolean boolean24 = zonedDateTime22.equals((java.lang.Object) 10);
        java.time.LocalTime localTime25 = zonedDateTime22.toLocalTime();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime26);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.UTC;
        long long29 = localDateTime26.toEpochSecond(zoneOffset28);
        java.time.OffsetTime offsetTime30 = localTime25.atOffset(zoneOffset28);
        java.time.ZoneId zoneId31 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.now(zoneId31);
        boolean boolean34 = zonedDateTime32.equals((java.lang.Object) 10);
        java.time.LocalTime localTime35 = zonedDateTime32.toLocalTime();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime37 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime36);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        long long39 = localDateTime36.toEpochSecond(zoneOffset38);
        java.time.OffsetTime offsetTime40 = localTime35.atOffset(zoneOffset38);
        java.time.OffsetTime offsetTime41 = offsetTime30.withOffsetSameInstant(zoneOffset38);
        boolean boolean42 = offsetTime20.isEqual(offsetTime41);
        java.time.ZoneId zoneId43 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime44 = java.time.ZonedDateTime.now(zoneId43);
        boolean boolean46 = zonedDateTime44.equals((java.lang.Object) 10);
        java.time.LocalTime localTime47 = zonedDateTime44.toLocalTime();
        java.time.LocalDateTime localDateTime48 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime49 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime48);
        java.time.ZoneOffset zoneOffset50 = java.time.ZoneOffset.UTC;
        long long51 = localDateTime48.toEpochSecond(zoneOffset50);
        java.time.OffsetTime offsetTime52 = localTime47.atOffset(zoneOffset50);
        java.time.ZoneId zoneId53 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime54 = java.time.ZonedDateTime.now(zoneId53);
        boolean boolean56 = zonedDateTime54.equals((java.lang.Object) 10);
        java.time.LocalTime localTime57 = zonedDateTime54.toLocalTime();
        java.time.LocalDateTime localDateTime58 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime59 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime58);
        java.time.ZoneOffset zoneOffset60 = java.time.ZoneOffset.UTC;
        long long61 = localDateTime58.toEpochSecond(zoneOffset60);
        java.time.OffsetTime offsetTime62 = localTime57.atOffset(zoneOffset60);
        java.time.OffsetTime offsetTime63 = offsetTime52.withOffsetSameInstant(zoneOffset60);
        java.time.ZoneId zoneId64 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime65 = java.time.ZonedDateTime.now(zoneId64);
        boolean boolean67 = zonedDateTime65.equals((java.lang.Object) 10);
        java.time.LocalTime localTime68 = zonedDateTime65.toLocalTime();
        java.time.LocalDateTime localDateTime69 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime70 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime69);
        java.time.ZoneOffset zoneOffset71 = java.time.ZoneOffset.UTC;
        long long72 = localDateTime69.toEpochSecond(zoneOffset71);
        java.time.OffsetTime offsetTime73 = localTime68.atOffset(zoneOffset71);
        java.time.ZoneId zoneId74 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime75 = java.time.ZonedDateTime.now(zoneId74);
        boolean boolean77 = zonedDateTime75.equals((java.lang.Object) 10);
        java.time.LocalTime localTime78 = zonedDateTime75.toLocalTime();
        java.time.LocalDateTime localDateTime79 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime80 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime79);
        java.time.ZoneOffset zoneOffset81 = java.time.ZoneOffset.UTC;
        long long82 = localDateTime79.toEpochSecond(zoneOffset81);
        java.time.OffsetTime offsetTime83 = localTime78.atOffset(zoneOffset81);
        java.time.OffsetTime offsetTime84 = offsetTime73.withOffsetSameInstant(zoneOffset81);
        boolean boolean85 = offsetTime63.isEqual(offsetTime84);
        boolean boolean86 = offsetTime41.isEqual(offsetTime84);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-31557014135596800L) + "'", long18 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-31557014135596800L) + "'", long29 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-31557014135596800L) + "'", long39 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(zoneId43);
        org.junit.Assert.assertNotNull(zonedDateTime44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(zoneOffset50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-31557014135596800L) + "'", long51 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime52);
        org.junit.Assert.assertNotNull(zoneId53);
        org.junit.Assert.assertNotNull(zonedDateTime54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(zoneOffset60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-31557014135596800L) + "'", long61 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime62);
        org.junit.Assert.assertNotNull(offsetTime63);
        org.junit.Assert.assertNotNull(zoneId64);
        org.junit.Assert.assertNotNull(zonedDateTime65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(zoneOffset71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-31557014135596800L) + "'", long72 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime73);
        org.junit.Assert.assertNotNull(zoneId74);
        org.junit.Assert.assertNotNull(zonedDateTime75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(zoneOffset81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-31557014135596800L) + "'", long82 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime83);
        org.junit.Assert.assertNotNull(offsetTime84);
// flaky:         org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.Iterator<java.lang.String> strItor4 = strSet2.iterator();
        java.util.Set<java.lang.String> strSet5 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean6 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Iterator<java.lang.String> strItor11 = strSet9.iterator();
        java.util.Set<java.lang.String> strSet12 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean13 = strSet9.retainAll((java.util.Collection<java.lang.String>) strSet12);
        boolean boolean14 = strSet5.containsAll((java.util.Collection<java.lang.String>) strSet9);
        java.util.Iterator<java.lang.String> strItor15 = strSet5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.IntSummaryStatistics intSummaryStatistics0 = new java.util.IntSummaryStatistics();
        int int1 = intSummaryStatistics0.getMin();
        org.junit.Assert.assertEquals(intSummaryStatistics0.toString(), "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.nio.channels.FileChannel.MapMode mapMode0 = java.nio.channels.FileChannel.MapMode.READ_WRITE;
        org.junit.Assert.assertNotNull(mapMode0);
        org.junit.Assert.assertEquals(mapMode0.toString(), "READ_WRITE");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        long long4 = localDateTime1.toEpochSecond(zoneOffset3);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int7 = localDateTime5.get((java.time.temporal.TemporalField) chronoField6);
        java.time.temporal.Temporal temporal8 = localDateTime1.adjustInto((java.time.temporal.Temporal) localDateTime5);
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime10 = localDateTime5.atZone(zoneId9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration11 = java.time.Duration.between((java.time.temporal.Temporal) localDate0, (java.time.temporal.Temporal) localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-31557014135596800L) + "'", long4 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField6.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(temporal8);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.Date date3 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.util.Date date4 = new java.util.Date();
        boolean boolean5 = date3.before(date4);
        int int6 = date4.getDate();
        date4.setDate(10);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Feb 08 00:00:00 UTC 1901");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Thu Feb 10 09:14:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localDateTime1.query(booleanTemporalQuery3);
        java.text.Format format5 = dateTimeFormatter0.toFormat(booleanTemporalQuery3);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = chronoField6.getDisplayName(locale7);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId11 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.now(zoneId11);
        boolean boolean14 = zonedDateTime12.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId15 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime16 = zonedDateTime12.withZoneSameInstant(zoneId15);
        java.time.Clock clock17 = java.time.Clock.tickMinutes(zoneId15);
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now(clock17);
        long long19 = chronoField10.getFrom((java.time.temporal.TemporalAccessor) localDateTime18);
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField6, chronoField9, chronoField10 };
        java.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter0.withResolverFields(temporalFieldArray20);
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor24 = dateTimeFormatter0.parseUnresolved((java.lang.CharSequence) "/experiment", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField6.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MilliOfSecond" + "'", str8, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField10.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(clock17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition(field0, 64);
        int int3 = fieldPosition2.getBeginIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.function.DoubleUnaryOperator doubleUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream2 = java.util.stream.DoubleStream.iterate((double) 128000000, doubleUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.READ;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.READ + "'", accessMode0.equals(java.nio.file.AccessMode.READ));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("United States");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Iterator<java.lang.String> strItor7 = strSet5.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction8 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean9 = strSet5.equals((java.lang.Object) codingErrorAction8);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet5);
        boolean boolean12 = strList10.equals((java.lang.Object) "MilliOfSecond");
        strList10.clear();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(codingErrorAction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean11 = file2.setWritable(false, true);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.LocalDate localDate2 = isoChronology0.dateEpochDay((long) (byte) 0);
        boolean boolean4 = isoChronology0.isLeapYear((long) 264000000);
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.time.Duration duration1 = java.time.Duration.ofNanos((long) 63000000);
        java.time.Duration duration2 = duration1.negated();
        java.time.LocalDate localDate3 = java.time.LocalDate.now();
        int int4 = localDate3.getDayOfYear();
        java.lang.String str5 = localDate3.toString();
        int int6 = localDate3.getDayOfMonth();
        java.time.LocalTime localTime8 = java.time.LocalTime.ofNanoOfDay(0L);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int11 = localDateTime9.get((java.time.temporal.TemporalField) chronoField10);
        java.time.ZoneId zoneId12 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime13 = java.time.ZonedDateTime.now(zoneId12);
        boolean boolean15 = zonedDateTime13.equals((java.lang.Object) 10);
        java.time.LocalTime localTime16 = zonedDateTime13.toLocalTime();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime17);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        long long20 = localDateTime17.toEpochSecond(zoneOffset19);
        java.time.OffsetTime offsetTime21 = localTime16.atOffset(zoneOffset19);
        java.time.OffsetDateTime offsetDateTime22 = java.time.OffsetDateTime.of(localDateTime9, zoneOffset19);
        java.time.ZonedDateTime zonedDateTime23 = java.time.ZonedDateTime.of(localDate3, localTime8, (java.time.ZoneId) zoneOffset19);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal24 = duration2.addTo((java.time.temporal.Temporal) localDate3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21" + "'", str5, "2022-02-21");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField10.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-31557014135596800L) + "'", long20 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        boolean boolean19 = offsetDateTime16.isSupported((java.time.temporal.TemporalField) chronoField18);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime21 = offsetDateTime16.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 558000000 + "'", int8 == 558000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField18.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.LocalTime localTime14 = zonedDateTime11.toLocalTime();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        long long18 = localDateTime15.toEpochSecond(zoneOffset17);
        java.time.OffsetTime offsetTime19 = localTime14.atOffset(zoneOffset17);
        java.time.OffsetTime offsetTime20 = offsetTime9.withOffsetSameInstant(zoneOffset17);
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset17);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-31557014135596800L) + "'", long18 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(709000000);
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        long[] longArray3 = new long[] { 257000000, (byte) -1, 627000000 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer6 = java.nio.LongBuffer.wrap(longArray3, 520000000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[257000000, -1, 627000000]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        java.time.temporal.ChronoField[] chronoFieldArray3 = new java.time.temporal.ChronoField[] { chronoField2 };
        java.time.temporal.ChronoField[] chronoFieldArray4 = strSet1.toArray(chronoFieldArray3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField2.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(chronoFieldArray3);
        org.junit.Assert.assertNotNull(chronoFieldArray4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.Set<java.time.chrono.Chronology> chronologySet0 = java.time.chrono.Chronology.getAvailableChronologies();
        org.junit.Assert.assertNotNull(chronologySet0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MICROSECONDS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MICROSECONDS;
        long long4 = timeUnit2.toDays((long) (byte) 100);
        long long5 = timeUnit0.convert((long) (byte) 0, timeUnit2);
        long long7 = timeUnit2.toMillis((long) (short) 10);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertNotNull(timeUnit2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean9 = file2.setWritable(false, false);
        java.lang.String str10 = file2.getName();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.time.ZoneId zoneId16 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime17 = java.time.ZonedDateTime.now(zoneId16);
        boolean boolean19 = zonedDateTime17.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime21 = zonedDateTime17.withZoneSameInstant(zoneId20);
        java.time.Clock clock22 = java.time.Clock.tickMinutes(zoneId20);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now(zoneId20);
        int int24 = offsetDateTime23.getNano();
        java.time.ZoneId zoneId25 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.now(zoneId25);
        boolean boolean28 = zonedDateTime26.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId29 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime26.withZoneSameInstant(zoneId29);
        java.time.Clock clock31 = java.time.Clock.tickMinutes(zoneId29);
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.now(zoneId29);
        boolean boolean33 = offsetDateTime23.isBefore(offsetDateTime32);
        int int34 = offsetDateTime23.getDayOfYear();
        java.security.cert.CertificateException certificateException35 = new java.security.cert.CertificateException();
        boolean boolean36 = temporalAdjusterMap2.remove((java.lang.Object) offsetDateTime23, (java.lang.Object) certificateException35);
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap39 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean40 = temporalAdjusterMap39.isEmpty();
        java.time.LocalTime localTime41 = java.time.LocalTime.now();
        java.time.LocalTime localTime42 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal43 = localTime41.adjustInto((java.time.temporal.Temporal) localTime42);
        java.io.FileNotFoundException fileNotFoundException44 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException44);
        java.lang.String str46 = costException45.getPattern();
        java.io.FileNotFoundException fileNotFoundException48 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException49 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException48);
        java.lang.String str50 = costException49.getPattern();
        java.security.InvalidKeyException invalidKeyException51 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException49);
        boolean boolean52 = temporalAdjusterMap39.replace((java.time.temporal.TemporalAdjuster) localTime41, (org.apache.commons.math.MathException) costException45, (org.apache.commons.math.MathException) costException49);
        java.time.LocalTime localTime54 = localTime41.withSecond((int) '#');
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap57 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean58 = temporalAdjusterMap57.isEmpty();
        java.time.LocalTime localTime59 = java.time.LocalTime.now();
        java.time.LocalTime localTime60 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal61 = localTime59.adjustInto((java.time.temporal.Temporal) localTime60);
        java.io.FileNotFoundException fileNotFoundException62 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException63 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException62);
        java.lang.String str64 = costException63.getPattern();
        java.io.FileNotFoundException fileNotFoundException66 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException67 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException66);
        java.lang.String str68 = costException67.getPattern();
        java.security.InvalidKeyException invalidKeyException69 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException67);
        boolean boolean70 = temporalAdjusterMap57.replace((java.time.temporal.TemporalAdjuster) localTime59, (org.apache.commons.math.MathException) costException63, (org.apache.commons.math.MathException) costException67);
        org.apache.commons.math.MathException mathException71 = temporalAdjusterMap2.putIfAbsent((java.time.temporal.TemporalAdjuster) localTime54, (org.apache.commons.math.MathException) costException67);
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap72 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((java.util.Map<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>) temporalAdjusterMap2);
        java.lang.Object obj73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException74 = temporalAdjusterMap72.remove(obj73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 959000000 + "'", int24 == 959000000);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(clock31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(temporal43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(temporal61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(mathException71);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.net.URI uRI1 = java.net.URI.create("hi!");
        java.lang.String str2 = uRI1.getSchemeSpecificPart();
        java.net.URI uRI3 = uRI1.normalize();
        boolean boolean5 = uRI1.equals((java.lang.Object) (short) 0);
        java.net.URI uRI13 = new java.net.URI("MilliOfSecond", "Italian", "Italian", (int) 'a', "", "", "United States");
        java.net.URI uRI14 = uRI1.resolve(uRI13);
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRI14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime7.withNano((int) '#');
        int int11 = offsetDateTime10.getMonthValue();
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 987000000 + "'", int8 == 987000000);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.getDayOfYear();
        java.lang.String str2 = localDate0.toString();
        int int3 = localDate0.lengthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21" + "'", str2, "2022-02-21");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        boolean boolean12 = file2.setWritable(true, true);
        java.nio.file.Path path13 = file2.toPath();
        boolean boolean14 = file2.isAbsolute();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(path13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.LocalDate localDate2 = isoChronology0.dateEpochDay((long) (byte) 0);
        java.time.Instant instant3 = java.time.Instant.EPOCH;
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = java.time.ZonedDateTime.now(zoneId4);
        boolean boolean7 = zonedDateTime5.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime9 = zonedDateTime5.withZoneSameInstant(zoneId8);
        java.time.Clock clock10 = java.time.Clock.tickMinutes(zoneId8);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now(zoneId8);
        java.time.Instant instant12 = offsetDateTime11.toInstant();
        int int13 = instant3.compareTo(instant12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale15 = java.util.Locale.US;
        java.lang.String str16 = chronoField14.getDisplayName(locale15);
        boolean boolean17 = instant3.isSupported((java.time.temporal.TemporalField) chronoField14);
        java.time.ZoneId zoneId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime19 = isoChronology0.zonedDateTime(instant3, zoneId18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(clock10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MilliOfSecond" + "'", str16, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime3.withZoneSameInstant(zoneId6);
        java.time.Clock clock8 = java.time.Clock.tickMinutes(zoneId6);
        java.time.LocalDate localDate9 = java.time.LocalDate.now(clock8);
        java.time.Period period10 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.LocalDate localDate11 = java.time.LocalDate.now();
        int int12 = localDate11.lengthOfMonth();
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.now(zoneId13);
        boolean boolean16 = zonedDateTime14.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime14.withZoneSameInstant(zoneId17);
        java.time.Clock clock19 = java.time.Clock.tickMinutes(zoneId17);
        java.time.LocalDate localDate20 = java.time.LocalDate.now(clock19);
        java.time.Period period21 = localDate11.until((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.chrono.ChronoPeriod chronoPeriod22 = period10.minus((java.time.temporal.TemporalAmount) period21);
        java.time.temporal.TemporalUnit temporalUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = period21.get(temporalUnit23);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: null");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(chronoPeriod22);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.UNDERFLOW;
        java.lang.String str1 = coderResult0.toString();
        org.junit.Assert.assertNotNull(coderResult0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UNDERFLOW" + "'", str1, "UNDERFLOW");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.time.Month month0 = java.time.Month.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.SEPTEMBER + "'", month0.equals(java.time.Month.SEPTEMBER));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition(field0, 64);
        java.text.Format.Field field3 = fieldPosition2.getFieldAttribute();
        java.text.Format.Field field4 = fieldPosition2.getFieldAttribute();
        fieldPosition2.setBeginIndex((-1));
        org.junit.Assert.assertNull(field3);
        org.junit.Assert.assertNull(field4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap6 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean7 = temporalAdjusterMap6.isEmpty();
        java.time.LocalTime localTime8 = java.time.LocalTime.now();
        java.time.LocalTime localTime9 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal10 = localTime8.adjustInto((java.time.temporal.Temporal) localTime9);
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.io.FileNotFoundException fileNotFoundException15 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException15);
        java.lang.String str17 = costException16.getPattern();
        java.security.InvalidKeyException invalidKeyException18 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException16);
        boolean boolean19 = temporalAdjusterMap6.replace((java.time.temporal.TemporalAdjuster) localTime8, (org.apache.commons.math.MathException) costException12, (org.apache.commons.math.MathException) costException16);
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime21 = java.time.ZonedDateTime.now(zoneId20);
        boolean boolean23 = zonedDateTime21.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId24 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime25 = zonedDateTime21.withZoneSameInstant(zoneId24);
        java.time.Clock clock26 = java.time.Clock.tickMinutes(zoneId24);
        java.time.OffsetDateTime offsetDateTime27 = java.time.OffsetDateTime.now(zoneId24);
        int int28 = offsetDateTime27.getNano();
        java.time.ZoneId zoneId29 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime30 = java.time.ZonedDateTime.now(zoneId29);
        boolean boolean32 = zonedDateTime30.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId33 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime34 = zonedDateTime30.withZoneSameInstant(zoneId33);
        java.time.Clock clock35 = java.time.Clock.tickMinutes(zoneId33);
        java.time.OffsetDateTime offsetDateTime36 = java.time.OffsetDateTime.now(zoneId33);
        boolean boolean37 = offsetDateTime27.isBefore(offsetDateTime36);
        int int38 = offsetDateTime27.getDayOfYear();
        java.security.cert.CertificateException certificateException39 = new java.security.cert.CertificateException();
        boolean boolean40 = temporalAdjusterMap6.remove((java.lang.Object) offsetDateTime27, (java.lang.Object) certificateException39);
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap43 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean44 = temporalAdjusterMap43.isEmpty();
        java.time.LocalTime localTime45 = java.time.LocalTime.now();
        java.time.LocalTime localTime46 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal47 = localTime45.adjustInto((java.time.temporal.Temporal) localTime46);
        java.io.FileNotFoundException fileNotFoundException48 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException49 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException48);
        java.lang.String str50 = costException49.getPattern();
        java.io.FileNotFoundException fileNotFoundException52 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException53 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException52);
        java.lang.String str54 = costException53.getPattern();
        java.security.InvalidKeyException invalidKeyException55 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException53);
        boolean boolean56 = temporalAdjusterMap43.replace((java.time.temporal.TemporalAdjuster) localTime45, (org.apache.commons.math.MathException) costException49, (org.apache.commons.math.MathException) costException53);
        java.time.LocalTime localTime58 = localTime45.withSecond((int) '#');
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap61 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean62 = temporalAdjusterMap61.isEmpty();
        java.time.LocalTime localTime63 = java.time.LocalTime.now();
        java.time.LocalTime localTime64 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal65 = localTime63.adjustInto((java.time.temporal.Temporal) localTime64);
        java.io.FileNotFoundException fileNotFoundException66 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException67 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException66);
        java.lang.String str68 = costException67.getPattern();
        java.io.FileNotFoundException fileNotFoundException70 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException71 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException70);
        java.lang.String str72 = costException71.getPattern();
        java.security.InvalidKeyException invalidKeyException73 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException71);
        boolean boolean74 = temporalAdjusterMap61.replace((java.time.temporal.TemporalAdjuster) localTime63, (org.apache.commons.math.MathException) costException67, (org.apache.commons.math.MathException) costException71);
        org.apache.commons.math.MathException mathException75 = temporalAdjusterMap6.putIfAbsent((java.time.temporal.TemporalAdjuster) localTime58, (org.apache.commons.math.MathException) costException71);
        java.time.LocalTime localTime76 = java.time.LocalTime.now();
        java.io.FileNotFoundException fileNotFoundException77 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException78 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException77);
        org.apache.commons.math.MathException mathException79 = temporalAdjusterMap6.put((java.time.temporal.TemporalAdjuster) localTime76, (org.apache.commons.math.MathException) costException78);
        java.time.ZoneId zoneId80 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime81 = java.time.ZonedDateTime.now(zoneId80);
        int int82 = zonedDateTime81.getSecond();
        java.time.ZoneOffset zoneOffset83 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime84 = zonedDateTime81.with((java.time.temporal.TemporalAdjuster) zoneOffset83);
        java.time.LocalTime localTime85 = zonedDateTime81.toLocalTime();
        java.time.temporal.ChronoField chronoField86 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int87 = localTime85.get((java.time.temporal.TemporalField) chronoField86);
        java.util.Locale locale88 = java.util.Locale.ITALY;
        java.lang.String str89 = chronoField86.getDisplayName(locale88);
        boolean boolean90 = localTime76.isSupported((java.time.temporal.TemporalField) chronoField86);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime92 = zonedDateTime1.with((java.time.temporal.TemporalField) chronoField86, (long) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MicroOfSecond (valid values 0 - 999999): 2147483647");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(temporal10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(clock26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 137000000 + "'", int28 == 137000000);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertNotNull(clock35);
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(temporal47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(temporal65);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(mathException75);
        org.junit.Assert.assertNotNull(localTime76);
// flaky:         org.junit.Assert.assertNull(mathException79);
        org.junit.Assert.assertNotNull(zoneId80);
        org.junit.Assert.assertNotNull(zonedDateTime81);
// flaky:         org.junit.Assert.assertTrue("'" + int82 + "' != '" + 43 + "'", int82 == 43);
        org.junit.Assert.assertNotNull(zoneOffset83);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime84);
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertTrue("'" + chronoField86 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField86.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
// flaky:         org.junit.Assert.assertTrue("'" + int87 + "' != '" + 137000 + "'", int87 == 137000);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "MicroOfSecond" + "'", str89, "MicroOfSecond");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.String[] strArray3 = new java.lang.String[] { "ita", "Italian", "MilliOfSecond" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strList4.set(423000000, "United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 423000000, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.util.Date date19 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        int int20 = date19.getYear();
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap23 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean24 = temporalAdjusterMap23.isEmpty();
        java.time.LocalTime localTime25 = java.time.LocalTime.now();
        java.time.LocalTime localTime26 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal27 = localTime25.adjustInto((java.time.temporal.Temporal) localTime26);
        java.io.FileNotFoundException fileNotFoundException28 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException28);
        java.lang.String str30 = costException29.getPattern();
        java.io.FileNotFoundException fileNotFoundException32 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException33 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException32);
        java.lang.String str34 = costException33.getPattern();
        java.security.InvalidKeyException invalidKeyException35 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException33);
        boolean boolean36 = temporalAdjusterMap23.replace((java.time.temporal.TemporalAdjuster) localTime25, (org.apache.commons.math.MathException) costException29, (org.apache.commons.math.MathException) costException33);
        org.apache.commons.math.MathException mathException37 = temporalAdjusterMap2.getOrDefault((java.lang.Object) date19, (org.apache.commons.math.MathException) costException33);
        java.time.Instant instant38 = date19.toInstant();
        java.time.ZoneId zoneId39 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime40 = java.time.ZonedDateTime.now(zoneId39);
        boolean boolean42 = zonedDateTime40.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId43 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime44 = zonedDateTime40.withZoneSameInstant(zoneId43);
        java.time.Clock clock45 = java.time.Clock.tickMinutes(zoneId43);
        java.time.OffsetDateTime offsetDateTime46 = java.time.OffsetDateTime.now(zoneId43);
        java.time.Instant instant47 = offsetDateTime46.toInstant();
        java.time.ZoneId zoneId48 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime49 = java.time.ZonedDateTime.now(zoneId48);
        boolean boolean51 = zonedDateTime49.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId52 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime53 = zonedDateTime49.withZoneSameInstant(zoneId52);
        java.time.Clock clock54 = java.time.Clock.tickMinutes(zoneId52);
        java.time.OffsetDateTime offsetDateTime55 = java.time.OffsetDateTime.now(zoneId52);
        int int56 = offsetDateTime55.getNano();
        java.time.ZoneId zoneId57 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime58 = java.time.ZonedDateTime.now(zoneId57);
        boolean boolean60 = zonedDateTime58.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId61 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime62 = zonedDateTime58.withZoneSameInstant(zoneId61);
        java.time.Clock clock63 = java.time.Clock.tickMinutes(zoneId61);
        java.time.OffsetDateTime offsetDateTime64 = java.time.OffsetDateTime.now(zoneId61);
        boolean boolean65 = offsetDateTime55.isBefore(offsetDateTime64);
        java.time.temporal.ChronoField chronoField66 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        boolean boolean67 = offsetDateTime64.isSupported((java.time.temporal.TemporalField) chronoField66);
        boolean boolean68 = instant47.isSupported((java.time.temporal.TemporalField) chronoField66);
        boolean boolean69 = instant38.isBefore(instant47);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(temporal27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(mathException37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(zoneId39);
        org.junit.Assert.assertNotNull(zonedDateTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zoneId43);
        org.junit.Assert.assertNotNull(zonedDateTime44);
        org.junit.Assert.assertNotNull(clock45);
        org.junit.Assert.assertNotNull(offsetDateTime46);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(zoneId48);
        org.junit.Assert.assertNotNull(zonedDateTime49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(zoneId52);
        org.junit.Assert.assertNotNull(zonedDateTime53);
        org.junit.Assert.assertNotNull(clock54);
        org.junit.Assert.assertNotNull(offsetDateTime55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 208000000 + "'", int56 == 208000000);
        org.junit.Assert.assertNotNull(zoneId57);
        org.junit.Assert.assertNotNull(zonedDateTime58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(zoneId61);
        org.junit.Assert.assertNotNull(zonedDateTime62);
        org.junit.Assert.assertNotNull(clock63);
        org.junit.Assert.assertNotNull(offsetDateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + chronoField66 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField66.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localDateTime1.query(booleanTemporalQuery3);
        java.text.Format format5 = dateTimeFormatter0.toFormat(booleanTemporalQuery3);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = chronoField6.getDisplayName(locale7);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId11 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.now(zoneId11);
        boolean boolean14 = zonedDateTime12.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId15 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime16 = zonedDateTime12.withZoneSameInstant(zoneId15);
        java.time.Clock clock17 = java.time.Clock.tickMinutes(zoneId15);
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now(clock17);
        long long19 = chronoField10.getFrom((java.time.temporal.TemporalAccessor) localDateTime18);
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField6, chronoField9, chronoField10 };
        java.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter0.withResolverFields(temporalFieldArray20);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery23 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean24 = dateTimeFormatter0.parse((java.lang.CharSequence) "java.text.ParseException: ", booleanTemporalQuery23);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'java.text.ParseException: ' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField6.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MilliOfSecond" + "'", str8, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField10.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(clock17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(booleanTemporalQuery23);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = java.net.URLConnection.guessContentTypeFromStream(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.nio.channels.ClosedChannelException closedChannelException0 = new java.nio.channels.ClosedChannelException();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList5 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.Iterator<java.lang.String> strItor13 = strSet11.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction14 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean15 = strSet11.equals((java.lang.Object) codingErrorAction14);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet11);
        java.lang.String str17 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList16);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(codingErrorAction14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime6 = zonedDateTime1.withSecond(2147483647);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 2147483647");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.FULL;
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.FULL + "'", formatStyle0.equals(java.time.format.FormatStyle.FULL));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        double[] doubleArray2 = new double[] { (short) 0, 1L };
        java.util.stream.DoubleStream doubleStream3 = java.util.stream.DoubleStream.of(doubleArray2);
        java.util.stream.DoubleStream doubleStream4 = doubleStream3.parallel();
        java.util.function.DoublePredicate doublePredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = doubleStream3.noneMatch(doublePredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.security.NoSuchProviderException noSuchProviderException1 = new java.security.NoSuchProviderException("REPLACE");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.time.Duration duration1 = java.time.Duration.ofHours((long) 21);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean1 = optionalLong0.isPresent();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = optionalLong0.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.net.URI uRI1 = java.net.URI.create("hi!");
        java.lang.String str2 = uRI1.getSchemeSpecificPart();
        java.net.URI uRI3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = uRI1.compareTo(uRI3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        boolean boolean19 = offsetDateTime16.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.ValueRange valueRange20 = chronoField18.range();
        boolean boolean22 = valueRange20.isValidValue((long) '4');
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = valueRange20.checkValidValue((long) (byte) 10, (java.time.temporal.TemporalField) chronoField24);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 1 - 7): 10");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 553000000 + "'", int8 == 553000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField18.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(valueRange20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField24.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        int int3 = zonedDateTime2.getSecond();
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime5 = zonedDateTime2.with((java.time.temporal.TemporalAdjuster) zoneOffset4);
        java.time.Month month6 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime2);
        int int7 = month6.maxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.of(2, month6, 627000000, 213000000, 361000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 627000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime5);
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.FEBRUARY + "'", month6.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.MICROSECONDS;
        java.nio.file.attribute.FileTime fileTime2 = java.nio.file.attribute.FileTime.from(0L, timeUnit1);
        long long4 = timeUnit1.toHours((long) 29);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertNotNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.String[] strArray5 = new java.lang.String[] { "Optional[java.security.InvalidKeyException: ]", "java.text.ParseException: ", "REPLACE", "hi! (hi!)", "Italian" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Iterator<java.lang.String> strItor8 = strList6.iterator();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strItor8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = localDate0.getLong((java.time.temporal.TemporalField) chronoField2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: HourOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField2.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime3.withZoneSameInstant(zoneId6);
        java.time.Clock clock8 = java.time.Clock.tickMinutes(zoneId6);
        java.time.LocalDate localDate9 = java.time.LocalDate.now(clock8);
        java.time.Period period10 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.LocalDate localDate11 = java.time.LocalDate.now();
        int int12 = localDate11.lengthOfMonth();
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.now(zoneId13);
        boolean boolean16 = zonedDateTime14.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime14.withZoneSameInstant(zoneId17);
        java.time.Clock clock19 = java.time.Clock.tickMinutes(zoneId17);
        java.time.LocalDate localDate20 = java.time.LocalDate.now(clock19);
        java.time.Period period21 = localDate11.until((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.chrono.ChronoPeriod chronoPeriod22 = period10.minus((java.time.temporal.TemporalAmount) period21);
        java.time.temporal.TemporalUnit temporalUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = period10.get(temporalUnit23);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: null");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(chronoPeriod22);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.Iterator<java.lang.String> strItor4 = strSet2.iterator();
        java.util.Set<java.lang.String> strSet5 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean6 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Iterator<java.lang.String> strItor11 = strSet9.iterator();
        java.util.Set<java.lang.String> strSet12 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean13 = strSet9.retainAll((java.util.Collection<java.lang.String>) strSet12);
        boolean boolean14 = strSet5.containsAll((java.util.Collection<java.lang.String>) strSet9);
        java.util.Locale locale15 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        boolean boolean17 = strSet5.addAll((java.util.Collection<java.lang.String>) strSet16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = strSet16.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.time.Duration duration1 = java.time.Duration.ofNanos((long) 63000000);
        java.time.Duration duration2 = duration1.negated();
        java.time.Duration duration4 = duration2.withNanos(44);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = chronoField0.getDisplayName(locale1);
        java.lang.String str3 = locale1.getScript();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str8 = locale1.getDisplayCountry(locale7);
        java.lang.String str9 = locale1.getLanguage();
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int13 = localDateTime11.get((java.time.temporal.TemporalField) chronoField12);
        int int14 = localDateTime10.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime11);
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        boolean boolean17 = localDateTime11.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime15);
        java.time.LocalDateTime localDateTime19 = localDateTime15.withSecond(1);
        java.time.LocalDateTime localDateTime21 = localDateTime15.plusSeconds(0L);
        java.time.LocalDateTime localDateTime23 = localDateTime21.plusMonths((long) (short) 0);
        boolean boolean24 = locale1.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MilliOfSecond" + "'", str2, "MilliOfSecond");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United States" + "'", str8, "United States");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField12.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.math.ConvergenceException convergenceException0 = new org.apache.commons.math.ConvergenceException();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime6 = localDateTime0.withSecond(51);
        java.time.Instant instant7 = java.time.Instant.EPOCH;
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.now(zoneId8);
        boolean boolean11 = zonedDateTime9.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId12 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime9.withZoneSameInstant(zoneId12);
        java.time.Clock clock14 = java.time.Clock.tickMinutes(zoneId12);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now(zoneId12);
        java.time.Instant instant16 = offsetDateTime15.toInstant();
        int int17 = instant7.compareTo(instant16);
        java.time.ZoneId zoneId18 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.now(zoneId18);
        boolean boolean21 = zonedDateTime19.equals((java.lang.Object) 10);
        java.time.LocalTime localTime22 = zonedDateTime19.toLocalTime();
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime23);
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        long long26 = localDateTime23.toEpochSecond(zoneOffset25);
        java.time.OffsetTime offsetTime27 = localTime22.atOffset(zoneOffset25);
        java.time.OffsetDateTime offsetDateTime28 = instant16.atOffset(zoneOffset25);
        java.time.ZoneOffset zoneOffset29 = null;
        java.time.ZonedDateTime zonedDateTime30 = java.time.ZonedDateTime.ofLocal(localDateTime6, (java.time.ZoneId) zoneOffset25, zoneOffset29);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(clock14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-31557014135596800L) + "'", long26 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(zonedDateTime30);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset1 = java.nio.charset.Charset.forName("Optional[java.security.InvalidKeyException: ]");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Optional[java.security.InvalidKeyException: ]");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.temporal.TemporalUnit temporalUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant2 = instant0.truncatedTo(temporalUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MICROSECONDS;
        java.lang.Class<?> wildcardClass1 = timeUnit0.getClass();
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofNanoOfDay(0L);
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.LocalTime localTime6 = zonedDateTime3.toLocalTime();
        boolean boolean7 = localTime1.isBefore(localTime6);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.ofOffset("ita", zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prefix should be GMT, UTC or UT, is: ita");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.LocalTime localTime6 = zonedDateTime1.toLocalTime();
        java.lang.String str7 = localTime6.toString();
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.now(zoneId8);
        boolean boolean11 = zonedDateTime9.equals((java.lang.Object) 10);
        java.time.LocalTime localTime12 = zonedDateTime9.toLocalTime();
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime14 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime13);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.UTC;
        long long16 = localDateTime13.toEpochSecond(zoneOffset15);
        java.time.OffsetTime offsetTime17 = localTime12.atOffset(zoneOffset15);
        java.time.LocalTime localTime19 = localTime12.minusNanos((long) 0);
        boolean boolean20 = localTime6.isBefore(localTime12);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "09:21:20.776" + "'", str7, "09:21:20.776");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-31557014135596800L) + "'", long16 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime17);
        org.junit.Assert.assertNotNull(localTime19);
// flaky:         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap3 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean4 = temporalAdjusterMap3.isEmpty();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.LocalTime localTime6 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal7 = localTime5.adjustInto((java.time.temporal.Temporal) localTime6);
        java.io.FileNotFoundException fileNotFoundException8 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException8);
        java.lang.String str10 = costException9.getPattern();
        java.io.FileNotFoundException fileNotFoundException12 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException12);
        java.lang.String str14 = costException13.getPattern();
        java.security.InvalidKeyException invalidKeyException15 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException13);
        boolean boolean16 = temporalAdjusterMap3.replace((java.time.temporal.TemporalAdjuster) localTime5, (org.apache.commons.math.MathException) costException9, (org.apache.commons.math.MathException) costException13);
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = java.time.ZonedDateTime.now(zoneId17);
        boolean boolean20 = zonedDateTime18.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId21 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime22 = zonedDateTime18.withZoneSameInstant(zoneId21);
        java.time.Clock clock23 = java.time.Clock.tickMinutes(zoneId21);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.now(zoneId21);
        int int25 = offsetDateTime24.getNano();
        java.time.ZoneId zoneId26 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.now(zoneId26);
        boolean boolean29 = zonedDateTime27.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId30 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime31 = zonedDateTime27.withZoneSameInstant(zoneId30);
        java.time.Clock clock32 = java.time.Clock.tickMinutes(zoneId30);
        java.time.OffsetDateTime offsetDateTime33 = java.time.OffsetDateTime.now(zoneId30);
        boolean boolean34 = offsetDateTime24.isBefore(offsetDateTime33);
        int int35 = offsetDateTime24.getDayOfYear();
        java.security.cert.CertificateException certificateException36 = new java.security.cert.CertificateException();
        boolean boolean37 = temporalAdjusterMap3.remove((java.lang.Object) offsetDateTime24, (java.lang.Object) certificateException36);
        java.util.concurrent.ExecutionException executionException38 = new java.util.concurrent.ExecutionException("Optional[java.security.InvalidKeyException: ]", (java.lang.Throwable) certificateException36);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(temporal7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(clock23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 806000000 + "'", int25 == 806000000);
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertNotNull(clock32);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.security.cert.CertificateException certificateException0 = new java.security.cert.CertificateException();
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException((java.lang.Throwable) certificateException0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String str1 = java.net.URLConnection.guessContentTypeFromName("09:14:00.282");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition(field0, (int) '4');
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        int int12 = zonedDateTime11.getSecond();
        int int13 = zonedDateTime11.getHour();
        java.time.temporal.TemporalUnit temporalUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = localTime4.until((java.time.temporal.Temporal) zonedDateTime11, temporalUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator0 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.FormatStyle formatStyle1 = java.time.format.FormatStyle.LONG;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle0, formatStyle1);
        java.time.format.DecimalStyle decimalStyle3 = dateTimeFormatter2.getDecimalStyle();
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.MEDIUM + "'", formatStyle0.equals(java.time.format.FormatStyle.MEDIUM));
        org.junit.Assert.assertTrue("'" + formatStyle1 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle1.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(decimalStyle3);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        boolean boolean19 = offsetDateTime16.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.ValueRange valueRange20 = chronoField18.range();
        boolean boolean22 = valueRange20.isValidValue((long) '4');
        boolean boolean24 = valueRange20.isValidValue((long) 827000000);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 81000000 + "'", int8 == 81000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField18.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(valueRange20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.HOURS;
        org.junit.Assert.assertNotNull(timeUnit0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime7.withNano((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime12 = offsetDateTime7.withDayOfYear(349000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 349000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 114000000 + "'", int8 == 114000000);
        org.junit.Assert.assertNotNull(offsetDateTime10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.Date date3 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.util.Date date4 = new java.util.Date();
        boolean boolean5 = date3.before(date4);
        int int6 = date4.getDate();
        date4.setMonth(6000000);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Feb 08 00:00:00 UTC 1901");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Jan 21 09:21:21 UTC 502022");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.getDayOfYear();
        java.lang.String str2 = localDate0.toString();
        int int3 = localDate0.getDayOfMonth();
        java.time.chrono.Era era4 = localDate0.getEra();
        java.time.temporal.TemporalField temporalField5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange6 = era4.range(temporalField5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: field");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21" + "'", str2, "2022-02-21");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + era4 + "' != '" + java.time.chrono.IsoEra.CE + "'", era4.equals(java.time.chrono.IsoEra.CE));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        boolean boolean1 = optionalLong0.isPresent();
        java.util.function.LongConsumer longConsumer2 = null;
        optionalLong0.ifPresent(longConsumer2);
        org.junit.Assert.assertNotNull(optionalLong0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime1 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime0);
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.UTC;
        long long3 = localDateTime0.toEpochSecond(zoneOffset2);
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int6 = localDateTime4.get((java.time.temporal.TemporalField) chronoField5);
        java.time.temporal.Temporal temporal7 = localDateTime0.adjustInto((java.time.temporal.Temporal) localDateTime4);
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime9 = localDateTime4.atZone(zoneId8);
        int int10 = localDateTime4.getMinute();
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = chronoField11.getDisplayName(locale12);
        java.time.LocalDateTime localDateTime15 = localDateTime4.with((java.time.temporal.TemporalField) chronoField11, (long) 1);
        java.time.temporal.TemporalUnit temporalUnit16 = null;
        boolean boolean17 = localDateTime15.isSupported(temporalUnit16);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-31557014135596800L) + "'", long3 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField5.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(temporal7);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField11.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MilliOfSecond" + "'", str13, "MilliOfSecond");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.util.Date date3 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.util.Date date4 = new java.util.Date();
        boolean boolean5 = date3.before(date4);
        date4.setMinutes(196000000);
        java.lang.Object obj8 = date4.clone();
        org.junit.Assert.assertEquals(date3.toString(), "Fri Feb 08 00:00:00 UTC 1901");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Thu Oct 20 11:40:21 UTC 2394");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "Thu Oct 20 11:40:21 UTC 2394");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Thu Oct 20 11:40:21 UTC 2394");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Thu Oct 20 11:40:21 UTC 2394");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.BIG_ENDIAN;
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.LocalTime localTime14 = zonedDateTime11.toLocalTime();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        long long18 = localDateTime15.toEpochSecond(zoneOffset17);
        java.time.OffsetTime offsetTime19 = localTime14.atOffset(zoneOffset17);
        java.time.OffsetTime offsetTime20 = offsetTime9.withOffsetSameInstant(zoneOffset17);
        java.time.temporal.TemporalField temporalField21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = offsetTime20.get(temporalField21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-31557014135596800L) + "'", long18 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localDateTime1.query(booleanTemporalQuery3);
        java.text.Format format5 = dateTimeFormatter0.toFormat(booleanTemporalQuery3);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = format5.parseObject("Italian", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(format5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray1, 21, 768000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime3.withZoneSameInstant(zoneId6);
        java.time.Clock clock8 = java.time.Clock.tickMinutes(zoneId6);
        java.time.LocalDate localDate9 = java.time.LocalDate.now(clock8);
        java.time.Period period10 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.LocalDate localDate11 = java.time.LocalDate.now();
        int int12 = localDate11.lengthOfMonth();
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.now(zoneId13);
        boolean boolean16 = zonedDateTime14.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime14.withZoneSameInstant(zoneId17);
        java.time.Clock clock19 = java.time.Clock.tickMinutes(zoneId17);
        java.time.LocalDate localDate20 = java.time.LocalDate.now(clock19);
        java.time.Period period21 = localDate11.until((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.chrono.ChronoPeriod chronoPeriod22 = period10.minus((java.time.temporal.TemporalAmount) period21);
        java.time.Duration duration24 = java.time.Duration.ofNanos((long) 63000000);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod25 = period21.minus((java.time.temporal.TemporalAmount) duration24);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(chronoPeriod22);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.security.cert.CertificateException certificateException1 = new java.security.cert.CertificateException("MicroOfSecond");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        long long4 = localDateTime1.toEpochSecond(zoneOffset3);
        java.time.Clock clock5 = java.time.Clock.fixed(instant0, (java.time.ZoneId) zoneOffset3);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-31557014135596800L) + "'", long4 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(clock5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        long long4 = file2.length();
        boolean boolean6 = file2.setExecutable(true);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.LocalTime localTime14 = zonedDateTime11.toLocalTime();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        long long18 = localDateTime15.toEpochSecond(zoneOffset17);
        java.time.OffsetTime offsetTime19 = localTime14.atOffset(zoneOffset17);
        java.time.OffsetTime offsetTime20 = offsetTime9.withOffsetSameInstant(zoneOffset17);
        java.time.ZoneId zoneId21 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime22 = java.time.ZonedDateTime.now(zoneId21);
        boolean boolean24 = zonedDateTime22.equals((java.lang.Object) 10);
        java.time.LocalTime localTime25 = zonedDateTime22.toLocalTime();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime26);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.UTC;
        long long29 = localDateTime26.toEpochSecond(zoneOffset28);
        java.time.OffsetTime offsetTime30 = localTime25.atOffset(zoneOffset28);
        java.time.ZoneId zoneId31 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.now(zoneId31);
        boolean boolean34 = zonedDateTime32.equals((java.lang.Object) 10);
        java.time.LocalTime localTime35 = zonedDateTime32.toLocalTime();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime37 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime36);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        long long39 = localDateTime36.toEpochSecond(zoneOffset38);
        java.time.OffsetTime offsetTime40 = localTime35.atOffset(zoneOffset38);
        java.time.OffsetTime offsetTime41 = offsetTime30.withOffsetSameInstant(zoneOffset38);
        boolean boolean42 = offsetTime20.isEqual(offsetTime41);
        java.time.LocalDateTime localDateTime43 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField44 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int45 = localDateTime43.get((java.time.temporal.TemporalField) chronoField44);
        java.time.temporal.ValueRange valueRange46 = offsetTime41.range((java.time.temporal.TemporalField) chronoField44);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-31557014135596800L) + "'", long18 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-31557014135596800L) + "'", long29 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-31557014135596800L) + "'", long39 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(offsetTime41);
// flaky:         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + chronoField44 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField44.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(valueRange46);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        java.util.Iterator<java.lang.String> strItor17 = strSet15.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction18 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean19 = strSet15.equals((java.lang.Object) codingErrorAction18);
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strSet15);
        boolean boolean22 = strList20.equals((java.lang.Object) "MilliOfSecond");
        boolean boolean23 = zoneOffset7.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(codingErrorAction18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(173000000);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.asReadOnlyBuffer();
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        double[] doubleArray2 = new double[] { (short) 0, 1L };
        java.util.stream.DoubleStream doubleStream3 = java.util.stream.DoubleStream.of(doubleArray2);
        java.util.function.DoublePredicate doublePredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = doubleStream3.noneMatch(doublePredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.Date date3 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.util.Date date4 = new java.util.Date();
        boolean boolean5 = date3.before(date4);
        date4.setMinutes(196000000);
        int int8 = date4.getDay();
        org.junit.Assert.assertEquals(date3.toString(), "Fri Feb 08 00:00:00 UTC 1901");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Thu Oct 20 11:40:23 UTC 2394");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        int int3 = zonedDateTime2.getSecond();
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime5 = zonedDateTime2.with((java.time.temporal.TemporalAdjuster) zoneOffset4);
        java.time.Month month6 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.of(100, month6, 58, 533000000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 58");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime5);
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.FEBRUARY + "'", month6.equals(java.time.Month.FEBRUARY));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) 33, (long) 44);
        java.util.function.LongPredicate longPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = longStream2.noneMatch(longPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=unitedstates");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        boolean boolean19 = offsetDateTime16.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.ValueRange valueRange20 = chronoField18.range();
        boolean boolean22 = valueRange20.isValidIntValue((long) (short) 1);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 829000000 + "'", int8 == 829000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField18.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(valueRange20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.util.Date date3 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.util.Date date4 = new java.util.Date();
        boolean boolean5 = date3.before(date4);
        int int6 = date4.getDate();
        date4.setTime((long) 998000000);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertEquals(date4.toString(), "Mon Jan 12 13:13:20 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.net.URI uRI1 = java.net.URI.create("hi!");
        java.lang.String str2 = uRI1.toASCIIString();
        java.lang.String str3 = uRI1.getScheme();
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.security.CodeSource codeSource0 = null;
        java.security.PermissionCollection permissionCollection1 = null;
        java.lang.ClassLoader classLoader2 = null;
        java.security.Principal[] principalArray3 = new java.security.Principal[] {};
        java.security.ProtectionDomain protectionDomain4 = new java.security.ProtectionDomain(codeSource0, permissionCollection1, classLoader2, principalArray3);
        org.junit.Assert.assertNotNull(principalArray3);
        org.junit.Assert.assertEquals(protectionDomain4.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean9 = file2.setWritable(false, false);
        java.lang.String str10 = file2.getCanonicalPath();
        long long11 = file2.length();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/experiment" + "'", str10, "/experiment");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.time.ZoneId zoneId16 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime17 = java.time.ZonedDateTime.now(zoneId16);
        boolean boolean19 = zonedDateTime17.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime21 = zonedDateTime17.withZoneSameInstant(zoneId20);
        java.time.Clock clock22 = java.time.Clock.tickMinutes(zoneId20);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now(zoneId20);
        int int24 = offsetDateTime23.getNano();
        java.time.ZoneId zoneId25 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.now(zoneId25);
        boolean boolean28 = zonedDateTime26.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId29 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime26.withZoneSameInstant(zoneId29);
        java.time.Clock clock31 = java.time.Clock.tickMinutes(zoneId29);
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.now(zoneId29);
        boolean boolean33 = offsetDateTime23.isBefore(offsetDateTime32);
        int int34 = offsetDateTime23.getDayOfYear();
        java.security.cert.CertificateException certificateException35 = new java.security.cert.CertificateException();
        boolean boolean36 = temporalAdjusterMap2.remove((java.lang.Object) offsetDateTime23, (java.lang.Object) certificateException35);
        java.time.ZoneId zoneId37 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime38 = java.time.ZonedDateTime.now(zoneId37);
        boolean boolean40 = zonedDateTime38.equals((java.lang.Object) 10);
        java.time.LocalTime localTime41 = zonedDateTime38.toLocalTime();
        java.time.LocalDateTime localDateTime42 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime43 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime42);
        java.time.ZoneOffset zoneOffset44 = java.time.ZoneOffset.UTC;
        long long45 = localDateTime42.toEpochSecond(zoneOffset44);
        java.time.OffsetTime offsetTime46 = localTime41.atOffset(zoneOffset44);
        java.time.ZoneId zoneId47 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime48 = java.time.ZonedDateTime.now(zoneId47);
        boolean boolean50 = zonedDateTime48.equals((java.lang.Object) 10);
        java.time.LocalTime localTime51 = zonedDateTime48.toLocalTime();
        java.time.LocalDateTime localDateTime52 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime53 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime52);
        java.time.ZoneOffset zoneOffset54 = java.time.ZoneOffset.UTC;
        long long55 = localDateTime52.toEpochSecond(zoneOffset54);
        java.time.OffsetTime offsetTime56 = localTime51.atOffset(zoneOffset54);
        java.time.OffsetTime offsetTime57 = offsetTime46.withOffsetSameInstant(zoneOffset54);
        java.time.OffsetDateTime offsetDateTime58 = offsetDateTime23.withOffsetSameInstant(zoneOffset54);
        java.time.Month month59 = offsetDateTime58.getMonth();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 948000000 + "'", int24 == 948000000);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(clock31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(zoneOffset44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-31557014135596800L) + "'", long45 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertNotNull(zonedDateTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(zoneOffset54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-31557014135596800L) + "'", long55 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime56);
        org.junit.Assert.assertNotNull(offsetTime57);
        org.junit.Assert.assertNotNull(offsetDateTime58);
        org.junit.Assert.assertTrue("'" + month59 + "' != '" + java.time.Month.FEBRUARY + "'", month59.equals(java.time.Month.FEBRUARY));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.LocalTime localTime14 = zonedDateTime11.toLocalTime();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        long long18 = localDateTime15.toEpochSecond(zoneOffset17);
        java.time.OffsetTime offsetTime19 = localTime14.atOffset(zoneOffset17);
        java.time.OffsetTime offsetTime20 = offsetTime9.withOffsetSameInstant(zoneOffset17);
        java.time.OffsetTime offsetTime22 = offsetTime20.withHour(1);
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale24 = java.util.Locale.US;
        java.lang.String str25 = chronoField23.getDisplayName(locale24);
        java.time.temporal.ValueRange valueRange26 = offsetTime22.range((java.time.temporal.TemporalField) chronoField23);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-31557014135596800L) + "'", long18 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField23.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MilliOfSecond" + "'", str25, "MilliOfSecond");
        org.junit.Assert.assertNotNull(valueRange26);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.LocalDate localDate2 = isoChronology0.dateEpochDay((long) (byte) 0);
        java.time.LocalDate localDate3 = java.time.LocalDate.now();
        int int4 = localDate3.getDayOfYear();
        java.lang.String str5 = localDate3.toString();
        java.time.chrono.ChronoPeriod chronoPeriod6 = java.time.chrono.ChronoPeriod.between((java.time.chrono.ChronoLocalDate) localDate2, (java.time.chrono.ChronoLocalDate) localDate3);
        java.time.LocalDate localDate7 = java.time.LocalDate.now();
        int int8 = localDate7.lengthOfMonth();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.LocalDate localDate16 = java.time.LocalDate.now(clock15);
        java.time.Period period17 = localDate7.until((java.time.chrono.ChronoLocalDate) localDate16);
        java.time.LocalDate localDate18 = java.time.LocalDate.now();
        int int19 = localDate18.lengthOfMonth();
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime21 = java.time.ZonedDateTime.now(zoneId20);
        boolean boolean23 = zonedDateTime21.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId24 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime25 = zonedDateTime21.withZoneSameInstant(zoneId24);
        java.time.Clock clock26 = java.time.Clock.tickMinutes(zoneId24);
        java.time.LocalDate localDate27 = java.time.LocalDate.now(clock26);
        java.time.Period period28 = localDate18.until((java.time.chrono.ChronoLocalDate) localDate27);
        java.time.chrono.ChronoPeriod chronoPeriod29 = period17.minus((java.time.temporal.TemporalAmount) period28);
        java.time.Period period31 = period28.minusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod32 = chronoPeriod6.minus((java.time.temporal.TemporalAmount) period31);
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21" + "'", str5, "2022-02-21");
        org.junit.Assert.assertNotNull(chronoPeriod6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 28 + "'", int8 == 28);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 28 + "'", int19 == 28);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(clock26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(chronoPeriod29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(chronoPeriod32);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localDateTime1.query(booleanTemporalQuery3);
        java.text.Format format5 = dateTimeFormatter0.toFormat(booleanTemporalQuery3);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = chronoField6.getDisplayName(locale7);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId11 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.now(zoneId11);
        boolean boolean14 = zonedDateTime12.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId15 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime16 = zonedDateTime12.withZoneSameInstant(zoneId15);
        java.time.Clock clock17 = java.time.Clock.tickMinutes(zoneId15);
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.now(clock17);
        long long19 = chronoField10.getFrom((java.time.temporal.TemporalAccessor) localDateTime18);
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField6, chronoField9, chronoField10 };
        java.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter0.withResolverFields(temporalFieldArray20);
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor24 = dateTimeFormatter0.parse((java.lang.CharSequence) "Italian", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField6.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MilliOfSecond" + "'", str8, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField10.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(clock17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.Clock clock7 = java.time.Clock.tickSeconds(zoneId4);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(clock7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.ZonedDateTime zonedDateTime6 = java.time.ZonedDateTime.now(zoneId4);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Iterator<java.lang.String> strItor7 = strSet5.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction8 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean9 = strSet5.equals((java.lang.Object) codingErrorAction8);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet5);
        boolean boolean12 = strList10.equals((java.lang.Object) "MilliOfSecond");
        boolean boolean14 = strList10.add("Japanese (Japan)");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.Iterator<java.lang.String> strItor19 = strSet17.iterator();
        java.util.Set<java.lang.String> strSet20 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean21 = strSet17.retainAll((java.util.Collection<java.lang.String>) strSet20);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.Iterator<java.lang.String> strItor26 = strSet24.iterator();
        java.util.Set<java.lang.String> strSet27 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean28 = strSet24.retainAll((java.util.Collection<java.lang.String>) strSet27);
        boolean boolean29 = strSet20.containsAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Iterator<java.lang.String> strItor30 = strSet24.iterator();
        boolean boolean31 = strList10.containsAll((java.util.Collection<java.lang.String>) strSet24);
        boolean boolean32 = strList10.isEmpty();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(codingErrorAction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        long[] longArray3 = new long[] { 948000000, 100L, 641000 };
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray3);
        java.nio.LongBuffer longBuffer5 = longBuffer4.asReadOnlyBuffer();
        boolean boolean6 = longBuffer5.hasArray();
        java.lang.String str7 = longBuffer5.toString();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[948000000, 100, 641000]");
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.nio.HeapLongBufferR[pos=0 lim=3 cap=3]" + "'", str7, "java.nio.HeapLongBufferR[pos=0 lim=3 cap=3]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = new java.net.URI("java.nio.charset.CharacterCodingException", "", "MilliOfSecond", "United States");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: java.nio.charset.CharacterCodingException://MilliOfSecond#United%20States");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.net.UnknownHostException unknownHostException1 = new java.net.UnknownHostException("Italian");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime3.withZoneSameInstant(zoneId6);
        java.time.Clock clock8 = java.time.Clock.tickMinutes(zoneId6);
        java.time.LocalDate localDate9 = java.time.LocalDate.now(clock8);
        java.time.Period period10 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.LocalDate localDate11 = java.time.LocalDate.now();
        int int12 = localDate11.lengthOfMonth();
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.now(zoneId13);
        boolean boolean16 = zonedDateTime14.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime14.withZoneSameInstant(zoneId17);
        java.time.Clock clock19 = java.time.Clock.tickMinutes(zoneId17);
        java.time.LocalDate localDate20 = java.time.LocalDate.now(clock19);
        java.time.Period period21 = localDate11.until((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.chrono.ChronoPeriod chronoPeriod22 = period10.minus((java.time.temporal.TemporalAmount) period21);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime23);
        java.time.temporal.Temporal temporal25 = period10.addTo((java.time.temporal.Temporal) localTime24);
        boolean boolean26 = period10.isNegative();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(chronoPeriod22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(temporal25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.net.InetAddress inetAddress0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByInetAddress(inetAddress0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        java.time.Month month5 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery6 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean7 = zonedDateTime1.query(booleanTemporalQuery6);
        java.time.LocalDate localDate8 = java.time.LocalDate.now();
        int int9 = localDate8.lengthOfMonth();
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId14 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime11.withZoneSameInstant(zoneId14);
        java.time.Clock clock16 = java.time.Clock.tickMinutes(zoneId14);
        java.time.LocalDate localDate17 = java.time.LocalDate.now(clock16);
        java.time.Period period18 = localDate8.until((java.time.chrono.ChronoLocalDate) localDate17);
        java.time.ZonedDateTime zonedDateTime19 = zonedDateTime1.minus((java.time.temporal.TemporalAmount) period18);
        int int20 = period18.getMonths();
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 28 + "'", int9 == 28);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(clock16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.time.Period period0 = null;
        java.util.Optional<java.time.Period> periodOptional1 = java.util.Optional.ofNullable(period0);
        org.junit.Assert.assertNotNull(periodOptional1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.time.Duration duration1 = java.time.Duration.ofNanos((long) 63000000);
        java.time.Duration duration2 = duration1.negated();
        java.time.Duration duration4 = duration2.multipliedBy((long) 58);
        java.time.Duration duration6 = duration2.plusHours((long) 2);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.LocalTime localTime11 = localTime4.minusNanos((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId12 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) localTime4);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZoneId from TemporalAccessor: 09:21:28.683 of type java.time.LocalTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime3.withZoneSameInstant(zoneId6);
        java.time.Clock clock8 = java.time.Clock.tickMinutes(zoneId6);
        java.time.LocalDate localDate9 = java.time.LocalDate.now(clock8);
        java.time.Period period10 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.LocalDate localDate11 = java.time.LocalDate.now();
        int int12 = localDate11.lengthOfMonth();
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.now(zoneId13);
        boolean boolean16 = zonedDateTime14.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime14.withZoneSameInstant(zoneId17);
        java.time.Clock clock19 = java.time.Clock.tickMinutes(zoneId17);
        java.time.LocalDate localDate20 = java.time.LocalDate.now(clock19);
        java.time.Period period21 = localDate11.until((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.chrono.ChronoPeriod chronoPeriod22 = period10.minus((java.time.temporal.TemporalAmount) period21);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime23);
        java.time.temporal.Temporal temporal25 = period10.addTo((java.time.temporal.Temporal) localTime24);
        java.time.Period period27 = period10.minusDays((long) 208000000);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList28 = period27.getUnits();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(chronoPeriod22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(temporal25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(temporalUnitList28);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        long[] longArray3 = new long[] { 948000000, 100L, 641000 };
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray3);
        java.nio.LongBuffer longBuffer5 = longBuffer4.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer6 = longBuffer4.asReadOnlyBuffer();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[948000000, 100, 641000]");
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(longBuffer6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        boolean boolean12 = file2.setWritable(true, true);
        boolean boolean13 = file2.exists();
        java.nio.file.Path path14 = file2.toPath();
        java.nio.file.Path path16 = path14.resolveSibling("MilliOfSecond");
        int int17 = path14.getNameCount();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("09:21:21.183", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=09:21:21.183");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        boolean boolean4 = zonedDateTime2.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime2.withZoneSameInstant(zoneId5);
        java.time.Clock clock7 = java.time.Clock.tickMinutes(zoneId5);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now(zoneId5);
        java.time.Instant instant9 = offsetDateTime8.toInstant();
        int int10 = instant0.compareTo(instant9);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = chronoField11.getDisplayName(locale12);
        boolean boolean14 = instant0.isSupported((java.time.temporal.TemporalField) chronoField11);
        java.time.Instant instant16 = instant0.plusNanos((long) (byte) 100);
        java.time.LocalTime localTime18 = java.time.LocalTime.ofNanoOfDay(0L);
        java.time.LocalTime localTime20 = localTime18.minusSeconds((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal21 = instant0.adjustInto((java.time.temporal.Temporal) localTime18);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField11.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MilliOfSecond" + "'", str13, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.net.URI uRI1 = java.net.URI.create("hi!");
        java.lang.String str2 = uRI1.toASCIIString();
        java.lang.String str3 = uRI1.getRawAuthority();
        java.lang.String str4 = uRI1.getScheme();
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.FormatStyle formatStyle1 = java.time.format.FormatStyle.LONG;
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle0, formatStyle1);
        java.time.ZoneId zoneId3 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZone(zoneId3);
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.MEDIUM + "'", formatStyle0.equals(java.time.format.FormatStyle.MEDIUM));
        org.junit.Assert.assertTrue("'" + formatStyle1 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle1.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = isoChronology0.eraOf((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay(56, 58);
        java.time.LocalDate localDate7 = localDate5.minusMonths((long) '#');
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Iterator<java.lang.String> strItor7 = strSet5.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction8 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean9 = strSet5.equals((java.lang.Object) codingErrorAction8);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        java.util.Iterator<java.lang.String> strItor15 = strSet13.iterator();
        java.util.Set<java.lang.String> strSet16 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean17 = strSet13.retainAll((java.util.Collection<java.lang.String>) strSet16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.Iterator<java.lang.String> strItor22 = strSet20.iterator();
        java.util.Set<java.lang.String> strSet23 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean24 = strSet20.retainAll((java.util.Collection<java.lang.String>) strSet23);
        boolean boolean25 = strSet16.containsAll((java.util.Collection<java.lang.String>) strSet20);
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleKeys();
        boolean boolean28 = strSet16.addAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet27);
        java.time.LocalDate localDate30 = java.time.LocalDate.now();
        int int31 = localDate30.getDayOfYear();
        boolean boolean32 = strList29.contains((java.lang.Object) localDate30);
        java.time.ZoneId zoneId33 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime34 = java.time.ZonedDateTime.now(zoneId33);
        boolean boolean36 = zonedDateTime34.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId37 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime38 = zonedDateTime34.withZoneSameInstant(zoneId37);
        java.time.Clock clock39 = java.time.Clock.tickMinutes(zoneId37);
        java.time.OffsetDateTime offsetDateTime40 = java.time.OffsetDateTime.now(zoneId37);
        java.time.Instant instant41 = offsetDateTime40.toInstant();
        java.time.ZoneId zoneId42 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime43 = java.time.ZonedDateTime.now(zoneId42);
        boolean boolean45 = zonedDateTime43.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId46 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime47 = zonedDateTime43.withZoneSameInstant(zoneId46);
        java.time.Clock clock48 = java.time.Clock.tickMinutes(zoneId46);
        java.time.OffsetDateTime offsetDateTime49 = java.time.OffsetDateTime.now(zoneId46);
        int int50 = offsetDateTime49.getNano();
        java.time.ZoneId zoneId51 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime52 = java.time.ZonedDateTime.now(zoneId51);
        boolean boolean54 = zonedDateTime52.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId55 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime56 = zonedDateTime52.withZoneSameInstant(zoneId55);
        java.time.Clock clock57 = java.time.Clock.tickMinutes(zoneId55);
        java.time.OffsetDateTime offsetDateTime58 = java.time.OffsetDateTime.now(zoneId55);
        boolean boolean59 = offsetDateTime49.isBefore(offsetDateTime58);
        java.time.temporal.ChronoField chronoField60 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        boolean boolean61 = offsetDateTime58.isSupported((java.time.temporal.TemporalField) chronoField60);
        boolean boolean62 = instant41.isSupported((java.time.temporal.TemporalField) chronoField60);
        boolean boolean63 = strList29.remove((java.lang.Object) boolean62);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(codingErrorAction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertNotNull(clock39);
        org.junit.Assert.assertNotNull(offsetDateTime40);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertNotNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(zoneId46);
        org.junit.Assert.assertNotNull(zonedDateTime47);
        org.junit.Assert.assertNotNull(clock48);
        org.junit.Assert.assertNotNull(offsetDateTime49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 843000000 + "'", int50 == 843000000);
        org.junit.Assert.assertNotNull(zoneId51);
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(zoneId55);
        org.junit.Assert.assertNotNull(zonedDateTime56);
        org.junit.Assert.assertNotNull(clock57);
        org.junit.Assert.assertNotNull(offsetDateTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + chronoField60 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField60.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = isoChronology0.eraOf((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay(56, 58);
        java.time.DayOfWeek dayOfWeek6 = localDate5.getDayOfWeek();
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + dayOfWeek6 + "' != '" + java.time.DayOfWeek.SUNDAY + "'", dayOfWeek6.equals(java.time.DayOfWeek.SUNDAY));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        boolean boolean4 = zonedDateTime2.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime2.withZoneSameInstant(zoneId5);
        java.time.LocalTime localTime7 = zonedDateTime2.toLocalTime();
        java.lang.String str8 = localTime7.toString();
        java.time.temporal.ValueRange valueRange9 = chronoField0.rangeRefinedBy((java.time.temporal.TemporalAccessor) localTime7);
        long long10 = valueRange9.getLargestMinimum();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "09:21:28.910" + "'", str8, "09:21:28.910");
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.getDayOfYear();
        java.lang.String str2 = localDate0.toString();
        int int3 = localDate0.getDayOfMonth();
        java.time.chrono.Era era4 = localDate0.getEra();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<?> wildcardChronoZonedDateTime5 = java.time.chrono.ChronoZonedDateTime.from((java.time.temporal.TemporalAccessor) localDate0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 2022-02-21 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21" + "'", str2, "2022-02-21");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + era4 + "' != '" + java.time.chrono.IsoEra.CE + "'", era4.equals(java.time.chrono.IsoEra.CE));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.time.LocalDate localDate2 = java.time.LocalDate.ofYearDay(33, 56);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.Iterator<java.lang.String> strItor10 = strSet8.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction11 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean12 = strSet8.equals((java.lang.Object) codingErrorAction11);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.Iterator<java.lang.String> strItor18 = strSet16.iterator();
        java.util.Set<java.lang.String> strSet19 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean20 = strSet16.retainAll((java.util.Collection<java.lang.String>) strSet19);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        java.util.Iterator<java.lang.String> strItor25 = strSet23.iterator();
        java.util.Set<java.lang.String> strSet26 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean27 = strSet23.retainAll((java.util.Collection<java.lang.String>) strSet26);
        boolean boolean28 = strSet19.containsAll((java.util.Collection<java.lang.String>) strSet23);
        java.util.Locale locale29 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        boolean boolean31 = strSet19.addAll((java.util.Collection<java.lang.String>) strSet30);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet30);
        java.time.LocalDate localDate33 = java.time.LocalDate.now();
        int int34 = localDate33.getDayOfYear();
        boolean boolean35 = strList32.contains((java.lang.Object) localDate33);
        int int36 = localDate2.compareTo((java.time.chrono.ChronoLocalDate) localDate33);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(codingErrorAction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1989) + "'", int36 == (-1989));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        java.time.Instant instant8 = offsetDateTime7.toInstant();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime10 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime9);
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.UTC;
        long long12 = localDateTime9.toEpochSecond(zoneOffset11);
        java.time.Clock clock13 = java.time.Clock.fixed(instant8, (java.time.ZoneId) zoneOffset11);
        java.time.temporal.TemporalField temporalField14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange15 = zoneOffset11.range(temporalField14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: field");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-31557014135596800L) + "'", long12 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(clock13);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.time.Month month0 = java.time.Month.DECEMBER;
        java.time.Month month1 = month0.firstMonthOfQuarter();
        int int2 = month0.getValue();
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.DECEMBER + "'", month0.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.OCTOBER + "'", month1.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localDateTime1.query(booleanTemporalQuery3);
        java.text.Format format5 = dateTimeFormatter0.toFormat(booleanTemporalQuery3);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = format5.parseObject("09:14:00.282", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(format5);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        boolean boolean19 = offsetDateTime16.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.ValueRange valueRange20 = chronoField18.range();
        java.time.Instant instant22 = java.time.Instant.EPOCH;
        java.time.ZoneId zoneId23 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.now(zoneId23);
        boolean boolean26 = zonedDateTime24.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId27 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime28 = zonedDateTime24.withZoneSameInstant(zoneId27);
        java.time.Clock clock29 = java.time.Clock.tickMinutes(zoneId27);
        java.time.OffsetDateTime offsetDateTime30 = java.time.OffsetDateTime.now(zoneId27);
        java.time.Instant instant31 = offsetDateTime30.toInstant();
        int int32 = instant22.compareTo(instant31);
        java.time.temporal.ChronoField chronoField33 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale34 = java.util.Locale.US;
        java.lang.String str35 = chronoField33.getDisplayName(locale34);
        boolean boolean36 = instant22.isSupported((java.time.temporal.TemporalField) chronoField33);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = valueRange20.checkValidIntValue((long) 173000000, (java.time.temporal.TemporalField) chronoField33);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MilliOfSecond (valid values 1 - 7): 173000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 95000000 + "'", int8 == 95000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField18.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(valueRange20);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertNotNull(clock29);
        org.junit.Assert.assertNotNull(offsetDateTime30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + chronoField33 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField33.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MilliOfSecond" + "'", str35, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        double[] doubleArray2 = new double[] { (short) 0, 1L };
        java.util.stream.DoubleStream doubleStream3 = java.util.stream.DoubleStream.of(doubleArray2);
        java.util.stream.DoubleStream doubleStream4 = doubleStream3.parallel();
        java.util.stream.DoubleStream.Builder builder5 = java.util.stream.DoubleStream.builder();
        java.util.stream.DoubleStream.Builder builder7 = builder5.add((double) (short) -1);
        doubleStream4.forEachOrdered((java.util.function.DoubleConsumer) builder5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.util.Date date19 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        int int20 = date19.getYear();
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap23 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean24 = temporalAdjusterMap23.isEmpty();
        java.time.LocalTime localTime25 = java.time.LocalTime.now();
        java.time.LocalTime localTime26 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal27 = localTime25.adjustInto((java.time.temporal.Temporal) localTime26);
        java.io.FileNotFoundException fileNotFoundException28 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException28);
        java.lang.String str30 = costException29.getPattern();
        java.io.FileNotFoundException fileNotFoundException32 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException33 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException32);
        java.lang.String str34 = costException33.getPattern();
        java.security.InvalidKeyException invalidKeyException35 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException33);
        boolean boolean36 = temporalAdjusterMap23.replace((java.time.temporal.TemporalAdjuster) localTime25, (org.apache.commons.math.MathException) costException29, (org.apache.commons.math.MathException) costException33);
        org.apache.commons.math.MathException mathException37 = temporalAdjusterMap2.getOrDefault((java.lang.Object) date19, (org.apache.commons.math.MathException) costException33);
        java.time.Instant instant38 = date19.toInstant();
        java.lang.Object obj39 = date19.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(temporal27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(mathException37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "Fri Feb 08 00:00:00 UTC 1901");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        int int18 = offsetDateTime7.getDayOfYear();
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime7.withSecond(51);
        java.time.OffsetDateTime offsetDateTime22 = offsetDateTime20.minusMonths((long) 948000000);
        long long23 = offsetDateTime20.toEpochSecond();
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 164000000 + "'", int8 == 164000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1645435311L + "'", long23 == 1645435311L);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer3 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "Japanese (Japan)", 2147483647, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.time.Duration duration1 = java.time.Duration.ofNanos((long) 63000000);
        java.time.Duration duration3 = duration1.minusMinutes((long) 81000000);
        java.time.DayOfWeek dayOfWeek4 = java.time.DayOfWeek.TUESDAY;
        java.time.LocalDate localDate5 = java.time.LocalDate.now();
        java.time.temporal.Temporal temporal6 = dayOfWeek4.adjustInto((java.time.temporal.Temporal) localDate5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal7 = duration3.addTo((java.time.temporal.Temporal) localDate5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + dayOfWeek4 + "' != '" + java.time.DayOfWeek.TUESDAY + "'", dayOfWeek4.equals(java.time.DayOfWeek.TUESDAY));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(temporal6);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.util.Date date3 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.time.Instant instant4 = date3.toInstant();
        org.junit.Assert.assertEquals(date3.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertNotNull(instant4);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        boolean boolean4 = zonedDateTime2.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime2.withZoneSameInstant(zoneId5);
        java.time.Clock clock7 = java.time.Clock.tickMinutes(zoneId5);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now(zoneId5);
        java.time.Instant instant9 = offsetDateTime8.toInstant();
        int int10 = instant0.compareTo(instant9);
        java.time.ZoneId zoneId11 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.now(zoneId11);
        boolean boolean14 = zonedDateTime12.equals((java.lang.Object) 10);
        java.time.LocalTime localTime15 = zonedDateTime12.toLocalTime();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime16);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.UTC;
        long long19 = localDateTime16.toEpochSecond(zoneOffset18);
        java.time.OffsetTime offsetTime20 = localTime15.atOffset(zoneOffset18);
        java.time.OffsetDateTime offsetDateTime21 = instant9.atOffset(zoneOffset18);
        java.time.ZoneId zoneId22 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime23 = java.time.ZonedDateTime.now(zoneId22);
        boolean boolean25 = zonedDateTime23.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId26 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime23.withZoneSameInstant(zoneId26);
        java.time.Clock clock28 = java.time.Clock.tickMinutes(zoneId26);
        java.time.OffsetDateTime offsetDateTime29 = java.time.OffsetDateTime.now(zoneId26);
        int int30 = offsetDateTime29.getNano();
        java.time.ZoneId zoneId31 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.now(zoneId31);
        boolean boolean34 = zonedDateTime32.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId35 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime36 = zonedDateTime32.withZoneSameInstant(zoneId35);
        java.time.Clock clock37 = java.time.Clock.tickMinutes(zoneId35);
        java.time.OffsetDateTime offsetDateTime38 = java.time.OffsetDateTime.now(zoneId35);
        boolean boolean39 = offsetDateTime29.isBefore(offsetDateTime38);
        int int40 = offsetDateTime21.compareTo(offsetDateTime38);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-31557014135596800L) + "'", long19 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(clock28);
        org.junit.Assert.assertNotNull(offsetDateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 333000000 + "'", int30 == 333000000);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertNotNull(clock37);
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.chrono.Chronology chronology5 = localDateTime1.getChronology();
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = java.time.ZonedDateTime.now(zoneId6);
        boolean boolean9 = zonedDateTime7.equals((java.lang.Object) 10);
        java.time.LocalTime localTime10 = zonedDateTime7.toLocalTime();
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime7.minusMonths((long) '#');
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.now(zoneId13);
        int int15 = zonedDateTime14.getSecond();
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime17 = zonedDateTime14.with((java.time.temporal.TemporalAdjuster) zoneOffset16);
        java.time.Month month18 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime14);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery19 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean20 = zonedDateTime14.query(booleanTemporalQuery19);
        java.lang.Boolean boolean21 = zonedDateTime7.query(booleanTemporalQuery19);
        java.lang.Boolean boolean22 = localDateTime1.query(booleanTemporalQuery19);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime17);
        org.junit.Assert.assertTrue("'" + month18 + "' != '" + java.time.Month.FEBRUARY + "'", month18.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery19);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + false + "'", boolean21, false);
        org.junit.Assert.assertEquals("'" + boolean22 + "' != '" + false + "'", boolean22, false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) 33, (long) 44);
        java.util.function.LongConsumer longConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            longStream2.forEachOrdered(longConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        int int18 = offsetDateTime7.getDayOfYear();
        int int19 = offsetDateTime7.getMonthValue();
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 421000000 + "'", int8 == 421000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        boolean boolean5 = file2.setReadOnly();
        boolean boolean6 = file2.isAbsolute();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime3.withZoneSameInstant(zoneId6);
        java.time.Clock clock8 = java.time.Clock.tickMinutes(zoneId6);
        java.time.LocalDate localDate9 = java.time.LocalDate.now(clock8);
        java.time.Period period10 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.LocalDate localDate11 = java.time.LocalDate.now();
        int int12 = localDate11.lengthOfMonth();
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.now(zoneId13);
        boolean boolean16 = zonedDateTime14.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime14.withZoneSameInstant(zoneId17);
        java.time.Clock clock19 = java.time.Clock.tickMinutes(zoneId17);
        java.time.LocalDate localDate20 = java.time.LocalDate.now(clock19);
        java.time.Period period21 = localDate11.until((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.chrono.ChronoPeriod chronoPeriod22 = period10.minus((java.time.temporal.TemporalAmount) period21);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime23);
        java.time.temporal.Temporal temporal25 = period10.addTo((java.time.temporal.Temporal) localTime24);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList26 = period10.getUnits();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(chronoPeriod22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(temporal25);
        org.junit.Assert.assertNotNull(temporalUnitList26);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.util.OptionalLong optionalLong0 = java.util.OptionalLong.empty();
        java.util.function.LongSupplier longSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = optionalLong0.orElseGet(longSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalLong0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        java.time.Month month5 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery6 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean7 = zonedDateTime1.query(booleanTemporalQuery6);
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.now(zoneId8);
        boolean boolean11 = zonedDateTime9.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId12 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime9.withZoneSameInstant(zoneId12);
        java.time.Clock clock14 = java.time.Clock.tickMinutes(zoneId12);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now(zoneId12);
        java.time.Instant instant16 = offsetDateTime15.toInstant();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime17);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        long long20 = localDateTime17.toEpochSecond(zoneOffset19);
        java.time.Clock clock21 = java.time.Clock.fixed(instant16, (java.time.ZoneId) zoneOffset19);
        java.time.ZonedDateTime zonedDateTime22 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) instant16);
        java.time.chrono.Chronology chronology23 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) zonedDateTime1);
        java.time.Instant instant24 = java.time.Instant.EPOCH;
        java.time.ZoneId zoneId25 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.now(zoneId25);
        boolean boolean28 = zonedDateTime26.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId29 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime26.withZoneSameInstant(zoneId29);
        java.time.Clock clock31 = java.time.Clock.tickMinutes(zoneId29);
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.now(zoneId29);
        java.time.Instant instant33 = offsetDateTime32.toInstant();
        int int34 = instant24.compareTo(instant33);
        java.time.ZoneId zoneId35 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime36 = java.time.ZonedDateTime.now(zoneId35);
        boolean boolean38 = zonedDateTime36.equals((java.lang.Object) 10);
        java.time.LocalTime localTime39 = zonedDateTime36.toLocalTime();
        java.time.LocalDateTime localDateTime40 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime41 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime40);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.UTC;
        long long43 = localDateTime40.toEpochSecond(zoneOffset42);
        java.time.OffsetTime offsetTime44 = localTime39.atOffset(zoneOffset42);
        java.time.OffsetDateTime offsetDateTime45 = instant33.atOffset(zoneOffset42);
        java.time.ZoneOffset zoneOffset46 = java.time.ZoneOffset.UTC;
        java.time.OffsetDateTime offsetDateTime47 = java.time.OffsetDateTime.now((java.time.ZoneId) zoneOffset46);
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime48 = chronology23.zonedDateTime(instant33, (java.time.ZoneId) zoneOffset46);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(clock14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-31557014135596800L) + "'", long20 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(clock31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-31557014135596800L) + "'", long43 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime44);
        org.junit.Assert.assertNotNull(offsetDateTime45);
        org.junit.Assert.assertNotNull(zoneOffset46);
        org.junit.Assert.assertNotNull(offsetDateTime47);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime48);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = new java.net.URI("Japanese (Japan)", "09:21:28.910", "09:21:20.776");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Illegal character in scheme name at index 8: Japanese (Japan):09:21:28.910#09:21:20.776");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        java.time.temporal.TemporalUnit temporalUnit5 = null;
        boolean boolean6 = zonedDateTime1.isSupported(temporalUnit5);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean9 = file2.setWritable(false, false);
        boolean boolean12 = file2.setWritable(true, true);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        long[] longArray3 = new long[] { 948000000, 100L, 641000 };
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray3);
        java.nio.LongBuffer longBuffer5 = longBuffer4.asReadOnlyBuffer();
        long[] longArray7 = new long[] { 10 };
        java.nio.LongBuffer longBuffer8 = longBuffer4.get(longArray7);
        java.nio.Buffer buffer9 = longBuffer8.mark();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[948000000, 100, 641000]");
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[948000000]");
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        double[] doubleArray2 = new double[] { (short) 0, 1L };
        java.util.stream.DoubleStream doubleStream3 = java.util.stream.DoubleStream.of(doubleArray2);
        java.util.stream.DoubleStream doubleStream4 = doubleStream3.parallel();
        java.util.stream.DoubleStream doubleStream5 = doubleStream3.parallel();
        java.util.OptionalDouble optionalDouble6 = doubleStream5.average();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(optionalDouble6);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime3.withZoneSameInstant(zoneId6);
        java.time.Clock clock8 = java.time.Clock.tickMinutes(zoneId6);
        java.time.LocalDate localDate9 = java.time.LocalDate.now(clock8);
        java.time.Period period10 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.LocalDate localDate11 = java.time.LocalDate.now();
        int int12 = localDate11.lengthOfMonth();
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.now(zoneId13);
        boolean boolean16 = zonedDateTime14.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime14.withZoneSameInstant(zoneId17);
        java.time.Clock clock19 = java.time.Clock.tickMinutes(zoneId17);
        java.time.LocalDate localDate20 = java.time.LocalDate.now(clock19);
        java.time.Period period21 = localDate11.until((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.chrono.ChronoPeriod chronoPeriod22 = period10.minus((java.time.temporal.TemporalAmount) period21);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime23);
        java.time.temporal.Temporal temporal25 = period10.addTo((java.time.temporal.Temporal) localTime24);
        int int26 = period10.getMonths();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(chronoPeriod22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(temporal25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) 33, (long) 44);
        java.util.stream.LongStream longStream3 = longStream2.parallel();
        java.util.function.LongToIntFunction longToIntFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = longStream3.mapToInt(longToIntFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) 33, (long) 44);
        java.util.stream.LongStream longStream3 = longStream2.parallel();
        java.util.function.LongBinaryOperator longBinaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalLong optionalLong5 = longStream2.reduce(longBinaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime3.withZoneSameInstant(zoneId6);
        java.time.Clock clock8 = java.time.Clock.tickMinutes(zoneId6);
        java.time.LocalDate localDate9 = java.time.LocalDate.now(clock8);
        java.time.Period period10 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.LocalDate localDate12 = localDate9.minusYears(0L);
        java.time.temporal.TemporalUnit temporalUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate15 = localDate9.plus((long) 29, temporalUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        java.io.File file7 = null;
        java.io.File file9 = new java.io.File(file7, "");
        long long10 = file9.getTotalSpace();
        java.lang.String str11 = file9.getAbsolutePath();
        java.lang.String str12 = file9.getName();
        long long13 = file9.getFreeSpace();
        boolean boolean15 = file9.setReadable(true);
        boolean boolean16 = file9.mkdirs();
        boolean boolean19 = file9.setWritable(true, true);
        boolean boolean20 = file9.exists();
        java.nio.file.Path path21 = file9.toPath();
        boolean boolean22 = file2.renameTo(file9);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream23 = new java.io.PrintStream(file9);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/experiment" + "'", str11, "/experiment");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(path21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.security.KeyException keyException1 = new java.security.KeyException("hi!");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        boolean boolean12 = file2.setWritable(true, true);
        boolean boolean13 = file2.exists();
        java.nio.file.Path path14 = file2.toPath();
        java.nio.file.Path path15 = path14.getFileName();
        boolean boolean17 = path14.equals((java.lang.Object) 257000000);
        java.nio.file.LinkOption[] linkOptionArray18 = new java.nio.file.LinkOption[] {};
        java.nio.file.Path path19 = path14.toRealPath(linkOptionArray18);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNotNull(path15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(linkOptionArray18);
        org.junit.Assert.assertNotNull(path19);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.time.ZoneId zoneId16 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime17 = java.time.ZonedDateTime.now(zoneId16);
        boolean boolean19 = zonedDateTime17.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime21 = zonedDateTime17.withZoneSameInstant(zoneId20);
        java.time.Clock clock22 = java.time.Clock.tickMinutes(zoneId20);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now(zoneId20);
        int int24 = offsetDateTime23.getNano();
        java.time.ZoneId zoneId25 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.now(zoneId25);
        boolean boolean28 = zonedDateTime26.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId29 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime26.withZoneSameInstant(zoneId29);
        java.time.Clock clock31 = java.time.Clock.tickMinutes(zoneId29);
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.now(zoneId29);
        boolean boolean33 = offsetDateTime23.isBefore(offsetDateTime32);
        int int34 = offsetDateTime23.getDayOfYear();
        java.security.cert.CertificateException certificateException35 = new java.security.cert.CertificateException();
        boolean boolean36 = temporalAdjusterMap2.remove((java.lang.Object) offsetDateTime23, (java.lang.Object) certificateException35);
        java.time.ZoneId zoneId37 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime38 = java.time.ZonedDateTime.now(zoneId37);
        boolean boolean40 = zonedDateTime38.equals((java.lang.Object) 10);
        java.time.LocalTime localTime41 = zonedDateTime38.toLocalTime();
        java.time.LocalDateTime localDateTime42 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime43 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime42);
        java.time.ZoneOffset zoneOffset44 = java.time.ZoneOffset.UTC;
        long long45 = localDateTime42.toEpochSecond(zoneOffset44);
        java.time.OffsetTime offsetTime46 = localTime41.atOffset(zoneOffset44);
        java.time.ZoneId zoneId47 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime48 = java.time.ZonedDateTime.now(zoneId47);
        boolean boolean50 = zonedDateTime48.equals((java.lang.Object) 10);
        java.time.LocalTime localTime51 = zonedDateTime48.toLocalTime();
        java.time.LocalDateTime localDateTime52 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime53 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime52);
        java.time.ZoneOffset zoneOffset54 = java.time.ZoneOffset.UTC;
        long long55 = localDateTime52.toEpochSecond(zoneOffset54);
        java.time.OffsetTime offsetTime56 = localTime51.atOffset(zoneOffset54);
        java.time.OffsetTime offsetTime57 = offsetTime46.withOffsetSameInstant(zoneOffset54);
        java.time.OffsetDateTime offsetDateTime58 = offsetDateTime23.withOffsetSameInstant(zoneOffset54);
        int int59 = offsetDateTime58.getMinute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 108000000 + "'", int24 == 108000000);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(clock31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(zoneOffset44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-31557014135596800L) + "'", long45 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertNotNull(zonedDateTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(zoneOffset54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-31557014135596800L) + "'", long55 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime56);
        org.junit.Assert.assertNotNull(offsetTime57);
        org.junit.Assert.assertNotNull(offsetDateTime58);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 21 + "'", int59 == 21);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.util.Date date3 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.util.Date date4 = new java.util.Date();
        boolean boolean5 = date3.before(date4);
        date3.setTime((long) 709000000);
        date3.setDate(108000000);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Dec 15 04:56:40 UTC 297663");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 09:21:31 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.lang.Object[] objArray16 = costException8.getArguments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap3 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean4 = temporalAdjusterMap3.isEmpty();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.LocalTime localTime6 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal7 = localTime5.adjustInto((java.time.temporal.Temporal) localTime6);
        java.io.FileNotFoundException fileNotFoundException8 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException8);
        java.lang.String str10 = costException9.getPattern();
        java.io.FileNotFoundException fileNotFoundException12 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException12);
        java.lang.String str14 = costException13.getPattern();
        java.security.InvalidKeyException invalidKeyException15 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException13);
        boolean boolean16 = temporalAdjusterMap3.replace((java.time.temporal.TemporalAdjuster) localTime5, (org.apache.commons.math.MathException) costException9, (org.apache.commons.math.MathException) costException13);
        java.util.Date date20 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        int int21 = date20.getYear();
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap24 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean25 = temporalAdjusterMap24.isEmpty();
        java.time.LocalTime localTime26 = java.time.LocalTime.now();
        java.time.LocalTime localTime27 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal28 = localTime26.adjustInto((java.time.temporal.Temporal) localTime27);
        java.io.FileNotFoundException fileNotFoundException29 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException29);
        java.lang.String str31 = costException30.getPattern();
        java.io.FileNotFoundException fileNotFoundException33 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException34 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException33);
        java.lang.String str35 = costException34.getPattern();
        java.security.InvalidKeyException invalidKeyException36 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException34);
        boolean boolean37 = temporalAdjusterMap24.replace((java.time.temporal.TemporalAdjuster) localTime26, (org.apache.commons.math.MathException) costException30, (org.apache.commons.math.MathException) costException34);
        org.apache.commons.math.MathException mathException38 = temporalAdjusterMap3.getOrDefault((java.lang.Object) date20, (org.apache.commons.math.MathException) costException34);
        java.time.Instant instant39 = date20.toInstant();
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime41 = isoChronology0.zonedDateTime(instant39, (java.time.ZoneId) zoneOffset40);
        java.time.chrono.IsoEra isoEra43 = java.time.chrono.IsoEra.of(0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate47 = isoChronology0.date((java.time.chrono.Era) isoEra43, 51, (int) (short) 10, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 2147483647");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(temporal7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals(date20.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(temporal28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(mathException38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime41);
        org.junit.Assert.assertTrue("'" + isoEra43 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra43.equals(java.time.chrono.IsoEra.BCE));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = isoChronology0.eraOf((int) (byte) 0);
        java.time.ZoneId zoneId3 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime4 = java.time.ZonedDateTime.now(zoneId3);
        boolean boolean6 = zonedDateTime4.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId7 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime8 = zonedDateTime4.withZoneSameInstant(zoneId7);
        java.time.Clock clock9 = java.time.Clock.tickMinutes(zoneId7);
        java.time.LocalDate localDate10 = java.time.LocalDate.now(clock9);
        java.time.LocalDate localDate11 = java.time.LocalDate.now(clock9);
        java.time.LocalDate localDate13 = localDate11.withDayOfYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime14 = isoChronology0.zonedDateTime((java.time.temporal.TemporalAccessor) localDate13);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 2022-01-10 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList5 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.Iterator<java.lang.String> strItor13 = strSet11.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction14 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean15 = strSet11.equals((java.lang.Object) codingErrorAction14);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet11);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        java.util.Iterator<java.lang.String> strItor21 = strSet19.iterator();
        java.util.Set<java.lang.String> strSet22 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean23 = strSet19.retainAll((java.util.Collection<java.lang.String>) strSet22);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.Iterator<java.lang.String> strItor28 = strSet26.iterator();
        java.util.Set<java.lang.String> strSet29 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean30 = strSet26.retainAll((java.util.Collection<java.lang.String>) strSet29);
        boolean boolean31 = strSet22.containsAll((java.util.Collection<java.lang.String>) strSet26);
        java.util.Locale locale32 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleKeys();
        boolean boolean34 = strSet22.addAll((java.util.Collection<java.lang.String>) strSet33);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet33);
        java.time.LocalDate localDate36 = java.time.LocalDate.now();
        int int37 = localDate36.getDayOfYear();
        boolean boolean38 = strList35.contains((java.lang.Object) localDate36);
        boolean boolean39 = strList5.containsAll((java.util.Collection<java.lang.String>) strList35);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(codingErrorAction14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.security.CodeSource codeSource0 = null;
        java.security.PermissionCollection permissionCollection1 = null;
        java.security.ProtectionDomain protectionDomain2 = new java.security.ProtectionDomain(codeSource0, permissionCollection1);
        java.security.ProtectionDomain[] protectionDomainArray3 = new java.security.ProtectionDomain[] { protectionDomain2 };
        java.security.AccessControlContext accessControlContext4 = new java.security.AccessControlContext(protectionDomainArray3);
        org.junit.Assert.assertEquals(protectionDomain2.toString(), "ProtectionDomain  null\n null\n <no principals>\n null\n");
        org.junit.Assert.assertNotNull(protectionDomainArray3);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = isoChronology0.eraOf((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay(56, 58);
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap6 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter7 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime9 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime8);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery10 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean11 = localDateTime8.query(booleanTemporalQuery10);
        java.text.Format format12 = dateTimeFormatter7.toFormat(booleanTemporalQuery10);
        java.time.format.ResolverStyle resolverStyle13 = java.time.format.ResolverStyle.LENIENT;
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withResolverStyle(resolverStyle13);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate15 = isoChronology0.resolveDate(temporalFieldMap6, resolverStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(booleanTemporalQuery10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertNotNull(format12);
        org.junit.Assert.assertTrue("'" + resolverStyle13 + "' != '" + java.time.format.ResolverStyle.LENIENT + "'", resolverStyle13.equals(java.time.format.ResolverStyle.LENIENT));
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("MilliOfSecond");
        printWriter1.print(6000000);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.util.stream.IntStream.Builder builder0 = java.util.stream.IntStream.builder();
        java.util.stream.IntStream.Builder builder2 = builder0.add((int) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.LocalDate localDate7 = java.time.LocalDate.now(clock6);
        java.time.LocalDate localDate8 = java.time.LocalDate.now(clock6);
        java.lang.String str9 = localDate8.toString();
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-21" + "'", str9, "2022-02-21");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException("/experiment");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Iterator<java.lang.String> strItor7 = strSet5.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction8 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean9 = strSet5.equals((java.lang.Object) codingErrorAction8);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet5);
        boolean boolean12 = strList10.equals((java.lang.Object) "MilliOfSecond");
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.Iterator<java.lang.String> strItor20 = strSet18.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction21 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean22 = strSet18.equals((java.lang.Object) codingErrorAction21);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet18);
        boolean boolean24 = strList10.containsAll((java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        java.util.Iterator<java.lang.String> strItor32 = strSet30.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction33 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean34 = strSet30.equals((java.lang.Object) codingErrorAction33);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strSet30);
        boolean boolean37 = strList35.equals((java.lang.Object) "MilliOfSecond");
        boolean boolean39 = strList35.add("Japanese (Japan)");
        boolean boolean40 = strList10.containsAll((java.util.Collection<java.lang.String>) strList35);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(codingErrorAction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(codingErrorAction21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strItor32);
        org.junit.Assert.assertNotNull(codingErrorAction33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.time.Duration duration1 = java.time.Duration.ofNanos((long) 63000000);
        java.time.Duration duration2 = duration1.negated();
        java.time.Duration duration4 = duration1.withNanos(10);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC;
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        double[] doubleArray2 = new double[] { (short) 0, 1L };
        java.util.stream.DoubleStream doubleStream3 = java.util.stream.DoubleStream.of(doubleArray2);
        java.util.Iterator<java.lang.Double> doubleItor4 = doubleStream3.iterator();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleItor4);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        java.time.Instant instant8 = offsetDateTime7.toInstant();
        java.time.Instant instant10 = instant8.minusSeconds((long) (short) 100);
        java.time.Instant instant11 = java.time.Instant.EPOCH;
        java.time.ZoneId zoneId12 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime13 = java.time.ZonedDateTime.now(zoneId12);
        boolean boolean15 = zonedDateTime13.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId16 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime17 = zonedDateTime13.withZoneSameInstant(zoneId16);
        java.time.Clock clock18 = java.time.Clock.tickMinutes(zoneId16);
        java.time.OffsetDateTime offsetDateTime19 = java.time.OffsetDateTime.now(zoneId16);
        java.time.Instant instant20 = offsetDateTime19.toInstant();
        int int21 = instant11.compareTo(instant20);
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale23 = java.util.Locale.US;
        java.lang.String str24 = chronoField22.getDisplayName(locale23);
        boolean boolean25 = instant11.isSupported((java.time.temporal.TemporalField) chronoField22);
        java.time.Instant instant27 = instant11.plusNanos((long) (byte) 100);
        int int28 = instant10.compareTo(instant27);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(clock18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField22.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MilliOfSecond" + "'", str24, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Duration duration7 = java.time.Duration.ofNanos((long) 63000000);
        java.time.Duration duration9 = duration7.plusDays((long) 628000000);
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime5.minus((java.time.temporal.TemporalAmount) duration7);
        java.time.format.DateTimeFormatter dateTimeFormatter11 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime12);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery14 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean15 = localDateTime12.query(booleanTemporalQuery14);
        java.text.Format format16 = dateTimeFormatter11.toFormat(booleanTemporalQuery14);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = chronoField17.getDisplayName(locale18);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId22 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime23 = java.time.ZonedDateTime.now(zoneId22);
        boolean boolean25 = zonedDateTime23.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId26 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime23.withZoneSameInstant(zoneId26);
        java.time.Clock clock28 = java.time.Clock.tickMinutes(zoneId26);
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.now(clock28);
        long long30 = chronoField21.getFrom((java.time.temporal.TemporalAccessor) localDateTime29);
        java.time.temporal.TemporalField[] temporalFieldArray31 = new java.time.temporal.TemporalField[] { chronoField17, chronoField20, chronoField21 };
        java.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter11.withResolverFields(temporalFieldArray31);
        java.lang.String str33 = zonedDateTime10.format(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(booleanTemporalQuery14);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNotNull(format16);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField17.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MilliOfSecond" + "'", str19, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField20.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField21.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(clock28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "09:21:32.224Z" + "'", str33, "09:21:32.224Z");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.time.Instant instant0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = java.util.Date.from(instant0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.time.Duration duration1 = java.time.Duration.ofMinutes((long) 51);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.Instant instant2 = instant0.minusMillis((long) 30);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime3.withZoneSameInstant(zoneId6);
        java.time.Clock clock8 = java.time.Clock.tickMinutes(zoneId6);
        java.time.LocalDate localDate9 = java.time.LocalDate.now(clock8);
        java.time.Period period10 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.LocalDate localDate11 = java.time.LocalDate.now();
        int int12 = localDate11.lengthOfMonth();
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.now(zoneId13);
        boolean boolean16 = zonedDateTime14.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime14.withZoneSameInstant(zoneId17);
        java.time.Clock clock19 = java.time.Clock.tickMinutes(zoneId17);
        java.time.LocalDate localDate20 = java.time.LocalDate.now(clock19);
        java.time.Period period21 = localDate11.until((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.chrono.ChronoPeriod chronoPeriod22 = period10.minus((java.time.temporal.TemporalAmount) period21);
        java.time.Period period24 = period21.minusYears((long) (short) 0);
        java.time.Period period26 = period24.plusDays((long) 475000000);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(chronoPeriod22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.text.ParseException parseException2 = new java.text.ParseException("REPLACE", (int) (byte) -1);
        java.security.SignatureException signatureException3 = new java.security.SignatureException((java.lang.Throwable) parseException2);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) signatureException3);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Iterator<java.lang.String> strItor7 = strSet5.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction8 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean9 = strSet5.equals((java.lang.Object) codingErrorAction8);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        java.util.Iterator<java.lang.String> strItor15 = strSet13.iterator();
        java.util.Set<java.lang.String> strSet16 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean17 = strSet13.retainAll((java.util.Collection<java.lang.String>) strSet16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.Iterator<java.lang.String> strItor22 = strSet20.iterator();
        java.util.Set<java.lang.String> strSet23 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean24 = strSet20.retainAll((java.util.Collection<java.lang.String>) strSet23);
        boolean boolean25 = strSet16.containsAll((java.util.Collection<java.lang.String>) strSet20);
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleKeys();
        boolean boolean28 = strSet16.addAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet27);
        java.time.LocalDate localDate30 = java.time.LocalDate.now();
        int int31 = localDate30.getDayOfYear();
        boolean boolean32 = strList29.contains((java.lang.Object) localDate30);
        java.time.LocalDateTime localDateTime33 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int36 = localDateTime34.get((java.time.temporal.TemporalField) chronoField35);
        int int37 = localDateTime33.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime34);
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime39 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime38);
        boolean boolean40 = localDateTime34.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime38);
        java.time.LocalDateTime localDateTime42 = localDateTime38.withSecond(1);
        java.time.LocalDateTime localDateTime44 = localDateTime42.plusHours((long) 59);
        java.time.temporal.Temporal temporal45 = localDate30.adjustInto((java.time.temporal.Temporal) localDateTime42);
        java.time.LocalDate localDate46 = java.time.LocalDate.now();
        int int47 = localDate46.getDayOfYear();
        java.lang.String str48 = localDate46.toString();
        java.time.chrono.ChronoPeriod chronoPeriod49 = localDate30.until((java.time.chrono.ChronoLocalDate) localDate46);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(codingErrorAction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField35.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(temporal45);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2022-02-21" + "'", str48, "2022-02-21");
        org.junit.Assert.assertNotNull(chronoPeriod49);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("09:21:20.776");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        int int18 = offsetDateTime7.getDayOfYear();
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime7.withSecond(51);
        java.time.OffsetDateTime offsetDateTime22 = offsetDateTime20.minusMonths((long) 948000000);
        java.time.OffsetDateTime offsetDateTime24 = offsetDateTime20.minusHours((long) 806000000);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 984000000 + "'", int8 == 984000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(offsetDateTime22);
        org.junit.Assert.assertNotNull(offsetDateTime24);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.SHORT;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle0);
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle0);
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.SHORT + "'", formatStyle0.equals(java.time.format.FormatStyle.SHORT));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localDateTime1.query(booleanTemporalQuery3);
        java.text.Format format5 = dateTimeFormatter0.toFormat(booleanTemporalQuery3);
        java.time.format.ResolverStyle resolverStyle6 = java.time.format.ResolverStyle.LENIENT;
        java.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withResolverStyle(resolverStyle6);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules9 = java.time.zone.ZoneRules.of(zoneOffset8);
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime10);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.UTC;
        long long13 = localDateTime10.toEpochSecond(zoneOffset12);
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int16 = localDateTime14.get((java.time.temporal.TemporalField) chronoField15);
        java.time.temporal.Temporal temporal17 = localDateTime10.adjustInto((java.time.temporal.Temporal) localDateTime14);
        java.time.ZoneId zoneId18 = java.time.ZoneId.systemDefault();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime19 = localDateTime14.atZone(zoneId18);
        int int20 = localDateTime14.getMinute();
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = chronoField21.getDisplayName(locale22);
        java.time.LocalDateTime localDateTime25 = localDateTime14.with((java.time.temporal.TemporalField) chronoField21, (long) 1);
        java.time.ZoneId zoneId26 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.now(zoneId26);
        boolean boolean29 = zonedDateTime27.equals((java.lang.Object) 10);
        java.time.LocalTime localTime30 = zonedDateTime27.toLocalTime();
        java.time.LocalDateTime localDateTime31 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime32 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime31);
        java.time.ZoneOffset zoneOffset33 = java.time.ZoneOffset.UTC;
        long long34 = localDateTime31.toEpochSecond(zoneOffset33);
        java.time.OffsetTime offsetTime35 = localTime30.atOffset(zoneOffset33);
        boolean boolean36 = zoneRules9.isValidOffset(localDateTime25, zoneOffset33);
        java.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter7.withZone((java.time.ZoneId) zoneOffset33);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertTrue("'" + resolverStyle6 + "' != '" + java.time.format.ResolverStyle.LENIENT + "'", resolverStyle6.equals(java.time.format.ResolverStyle.LENIENT));
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(zoneRules9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-31557014135596800L) + "'", long13 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField15.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(temporal17);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField21.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MilliOfSecond" + "'", str23, "MilliOfSecond");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-31557014135596800L) + "'", long34 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("");
        java.util.Optional<java.lang.Throwable> throwableOptional2 = java.util.Optional.ofNullable((java.lang.Throwable) invalidKeyException1);
        java.lang.String str3 = throwableOptional2.toString();
        boolean boolean4 = throwableOptional2.isPresent();
        org.junit.Assert.assertNotNull(throwableOptional2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Optional[java.security.InvalidKeyException: ]" + "'", str3, "Optional[java.security.InvalidKeyException: ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int4 = localDateTime2.get((java.time.temporal.TemporalField) chronoField3);
        int int5 = localDateTime1.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime2);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime6);
        boolean boolean8 = localDateTime2.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime6);
        java.time.LocalDateTime localDateTime10 = localDateTime6.withSecond(1);
        java.time.LocalDateTime localDateTime12 = localDateTime10.plusHours((long) 59);
        java.time.LocalDateTime localDateTime14 = localDateTime10.minusNanos((long) 55);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange15 = chronoField0.rangeRefinedBy((java.time.temporal.TemporalAccessor) localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField0.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField3.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.net.Proxy proxy0 = java.net.Proxy.NO_PROXY;
        java.security.InvalidKeyException invalidKeyException2 = new java.security.InvalidKeyException("");
        java.util.Optional<java.lang.Throwable> throwableOptional3 = java.util.Optional.ofNullable((java.lang.Throwable) invalidKeyException2);
        boolean boolean4 = proxy0.equals((java.lang.Object) invalidKeyException2);
        org.junit.Assert.assertNotNull(proxy0);
        org.junit.Assert.assertNotNull(throwableOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        int int18 = offsetDateTime7.getDayOfYear();
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime7.withSecond(51);
        java.time.ZoneId zoneId21 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime22 = java.time.ZonedDateTime.now(zoneId21);
        boolean boolean24 = zonedDateTime22.equals((java.lang.Object) 10);
        java.time.LocalTime localTime25 = zonedDateTime22.toLocalTime();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime26);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.UTC;
        long long29 = localDateTime26.toEpochSecond(zoneOffset28);
        java.time.OffsetTime offsetTime30 = localTime25.atOffset(zoneOffset28);
        java.time.ZoneId zoneId31 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.now(zoneId31);
        boolean boolean34 = zonedDateTime32.equals((java.lang.Object) 10);
        java.time.LocalTime localTime35 = zonedDateTime32.toLocalTime();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime37 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime36);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        long long39 = localDateTime36.toEpochSecond(zoneOffset38);
        java.time.OffsetTime offsetTime40 = localTime35.atOffset(zoneOffset38);
        java.time.OffsetTime offsetTime41 = offsetTime30.withOffsetSameInstant(zoneOffset38);
        java.time.ZonedDateTime zonedDateTime42 = offsetDateTime20.atZoneSimilarLocal((java.time.ZoneId) zoneOffset38);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal45 = offsetDateTime20.with((java.time.temporal.TemporalField) chronoField43, (long) 838000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfWeek (valid values 1 - 7): 838000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 76000000 + "'", int8 == 76000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-31557014135596800L) + "'", long29 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-31557014135596800L) + "'", long39 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertNotNull(zonedDateTime42);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField43.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.Iterator<java.lang.String> strItor4 = strSet2.iterator();
        java.util.Set<java.lang.String> strSet5 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean6 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Iterator<java.lang.String> strItor11 = strSet9.iterator();
        java.util.Set<java.lang.String> strSet12 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean13 = strSet9.retainAll((java.util.Collection<java.lang.String>) strSet12);
        boolean boolean14 = strSet5.containsAll((java.util.Collection<java.lang.String>) strSet9);
        boolean boolean15 = strSet9.isEmpty();
        java.time.ZoneId zoneId16 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime17 = java.time.ZonedDateTime.now(zoneId16);
        boolean boolean19 = zonedDateTime17.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime21 = zonedDateTime17.withZoneSameInstant(zoneId20);
        java.time.LocalTime localTime22 = zonedDateTime17.toLocalTime();
        boolean boolean23 = strSet9.remove((java.lang.Object) localTime22);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.net.URI uRI1 = java.net.URI.create("hi!");
        java.lang.String str2 = uRI1.getSchemeSpecificPart();
        boolean boolean3 = uRI1.isOpaque();
        java.net.URI uRI5 = java.net.URI.create("hi!");
        java.lang.String str6 = uRI5.getSchemeSpecificPart();
        java.lang.String str7 = uRI5.getRawPath();
        java.net.URI uRI8 = uRI1.resolve(uRI5);
        org.junit.Assert.assertNotNull(uRI1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(uRI8);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.util.Date date3 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.util.Date date4 = new java.util.Date();
        boolean boolean5 = date3.before(date4);
        date4.setMinutes(196000000);
        int int8 = date4.getSeconds();
        org.junit.Assert.assertEquals(date3.toString(), "Fri Feb 08 00:00:00 UTC 1901");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Thu Oct 20 11:40:33 UTC 2394");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.getDayOfYear();
        java.lang.String str2 = localDate0.toString();
        int int3 = localDate0.getDayOfMonth();
        java.time.chrono.Era era4 = localDate0.getEra();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange6 = era4.range((java.time.temporal.TemporalField) chronoField5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: AlignedDayOfWeekInYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21" + "'", str2, "2022-02-21");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + era4 + "' != '" + java.time.chrono.IsoEra.CE + "'", era4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime1.minusMonths((long) '#');
        java.time.ZonedDateTime zonedDateTime8 = zonedDateTime1.plusDays((long) '4');
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.plusSeconds((long) 627000000);
        java.time.OffsetDateTime offsetDateTime11 = zonedDateTime10.toOffsetDateTime();
        java.time.Duration duration13 = java.time.Duration.ofNanos((long) 63000000);
        java.time.Duration duration15 = duration13.minusMinutes((long) 81000000);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime16 = zonedDateTime10.minus((java.time.temporal.TemporalAmount) duration13);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime16);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.io.FileNotFoundException fileNotFoundException2 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException2);
        java.lang.String str4 = costException3.getPattern();
        java.security.InvalidKeyException invalidKeyException5 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException3);
        java.security.InvalidKeyException invalidKeyException6 = new java.security.InvalidKeyException("Optional[java.security.InvalidKeyException: ]", (java.lang.Throwable) invalidKeyException5);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.net.FileNameMap fileNameMap0 = null;
        java.net.URLConnection.setFileNameMap(fileNameMap0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        char char0 = java.text.CharacterIterator.DONE;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\uffff' + "'", char0 == '\uffff');
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = localDateTime0.withMonth(768000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 768000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.time.Month month1 = java.time.Month.DECEMBER;
        java.time.Month month2 = month1.firstMonthOfQuarter();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of(264000000, month1, 336000000, (int) ':', 6000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 336000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.DECEMBER + "'", month1.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.OCTOBER + "'", month2.equals(java.time.Month.OCTOBER));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = isoChronology0.eraOf((int) (byte) 0);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int6 = localDateTime4.get((java.time.temporal.TemporalField) chronoField5);
        int int7 = localDateTime3.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime4);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime9 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime8);
        boolean boolean10 = localDateTime4.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime8);
        java.time.LocalDateTime localDateTime12 = localDateTime8.withSecond(1);
        java.time.LocalDateTime localDateTime14 = localDateTime12.plusHours((long) 59);
        java.time.LocalDateTime localDateTime16 = localDateTime12.minusNanos((long) 55);
        java.time.temporal.Temporal temporal17 = isoEra2.adjustInto((java.time.temporal.Temporal) localDateTime12);
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField5.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(temporal17);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.time.Duration duration1 = java.time.Duration.ofNanos((long) 63000000);
        boolean boolean2 = duration1.isZero();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.security.AccessControlException accessControlException1 = new java.security.AccessControlException("UNDERFLOW");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) 33, (long) 44);
        java.util.stream.LongStream longStream3 = longStream2.parallel();
        java.util.function.LongPredicate longPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = longStream2.filter(longPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.Iterator<java.lang.String> strItor4 = strSet2.iterator();
        java.util.Set<java.lang.String> strSet5 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean6 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Iterator<java.lang.String> strItor11 = strSet9.iterator();
        java.util.Set<java.lang.String> strSet12 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean13 = strSet9.retainAll((java.util.Collection<java.lang.String>) strSet12);
        boolean boolean14 = strSet5.containsAll((java.util.Collection<java.lang.String>) strSet9);
        java.util.Iterator<java.lang.String> strItor15 = strSet9.iterator();
        boolean boolean16 = strItor15.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strItor15.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList5 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.Iterator<java.lang.String> strItor10 = strSet8.iterator();
        java.util.Set<java.lang.String> strSet11 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean12 = strSet8.retainAll((java.util.Collection<java.lang.String>) strSet11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        java.util.Iterator<java.lang.String> strItor17 = strSet15.iterator();
        java.util.Set<java.lang.String> strSet18 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean19 = strSet15.retainAll((java.util.Collection<java.lang.String>) strSet18);
        boolean boolean20 = strSet11.containsAll((java.util.Collection<java.lang.String>) strSet15);
        boolean boolean21 = strSet4.contains((java.lang.Object) boolean20);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate1 = java.time.chrono.ChronoLocalDate.from((java.time.temporal.TemporalAccessor) offsetTime0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ChronoLocalDate from TemporalAccessor: class java.time.OffsetTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = new java.net.URI("Japanese (Japan)", "0", "/experiment", "");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Illegal character in scheme name at index 8: Japanese (Japan)://0/experiment#");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        long long17 = localTime4.getLong((java.time.temporal.TemporalField) chronoField16);
        int int18 = localTime4.getSecond();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField16.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 229000L + "'", long17 == 229000L);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.nio.charset.CodingErrorAction codingErrorAction0 = java.nio.charset.CodingErrorAction.IGNORE;
        java.lang.String str1 = codingErrorAction0.toString();
        org.junit.Assert.assertNotNull(codingErrorAction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IGNORE" + "'", str1, "IGNORE");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.now((java.time.ZoneId) zoneOffset0);
        java.time.OffsetDateTime offsetDateTime3 = offsetDateTime1.minusDays((long) 21);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(offsetDateTime3);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.FULL;
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.FULL + "'", textStyle0.equals(java.time.format.TextStyle.FULL));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.util.Date date19 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        int int20 = date19.getYear();
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap23 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean24 = temporalAdjusterMap23.isEmpty();
        java.time.LocalTime localTime25 = java.time.LocalTime.now();
        java.time.LocalTime localTime26 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal27 = localTime25.adjustInto((java.time.temporal.Temporal) localTime26);
        java.io.FileNotFoundException fileNotFoundException28 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException28);
        java.lang.String str30 = costException29.getPattern();
        java.io.FileNotFoundException fileNotFoundException32 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException33 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException32);
        java.lang.String str34 = costException33.getPattern();
        java.security.InvalidKeyException invalidKeyException35 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException33);
        boolean boolean36 = temporalAdjusterMap23.replace((java.time.temporal.TemporalAdjuster) localTime25, (org.apache.commons.math.MathException) costException29, (org.apache.commons.math.MathException) costException33);
        org.apache.commons.math.MathException mathException37 = temporalAdjusterMap2.getOrDefault((java.lang.Object) date19, (org.apache.commons.math.MathException) costException33);
        java.time.Instant instant38 = date19.toInstant();
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime40 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime39);
        java.time.LocalTime localTime42 = localTime40.plusSeconds((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal43 = instant38.adjustInto((java.time.temporal.Temporal) localTime40);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(temporal27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(mathException37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        boolean boolean7 = file2.setExecutable(false, true);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.getDayOfYear();
        java.time.temporal.TemporalUnit temporalUnit2 = null;
        boolean boolean3 = localDate0.isSupported(temporalUnit2);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = new java.net.URI("hi! (hi!)", "MicroOfSecond", "ZoneRules[currentStandardOffset=Z]", "");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: hi! (hi!)://MicroOfSecondZoneRules%5BcurrentStandardOffset=Z%5D#");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.util.Comparator<java.time.chrono.ChronoLocalDate> chronoLocalDateComparator0 = java.time.chrono.ChronoLocalDate.timeLineOrder();
        java.time.LocalDate localDate1 = java.time.LocalDate.now();
        int int2 = localDate1.getDayOfYear();
        java.lang.String str3 = localDate1.toString();
        java.time.LocalDate localDate5 = localDate1.minusWeeks((long) 361000000);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = java.time.ZonedDateTime.now(zoneId6);
        boolean boolean9 = zonedDateTime7.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = zonedDateTime7.withZoneSameInstant(zoneId10);
        java.time.Clock clock12 = java.time.Clock.tickMinutes(zoneId10);
        java.time.LocalDate localDate13 = java.time.LocalDate.now(clock12);
        boolean boolean14 = localDate1.isEqual((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.LocalDate localDate15 = java.time.LocalDate.now();
        int int16 = localDate15.getDayOfYear();
        java.lang.String str17 = localDate15.toString();
        java.time.LocalDate localDate19 = localDate15.minusWeeks((long) 361000000);
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime21 = java.time.ZonedDateTime.now(zoneId20);
        boolean boolean23 = zonedDateTime21.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId24 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime25 = zonedDateTime21.withZoneSameInstant(zoneId24);
        java.time.Clock clock26 = java.time.Clock.tickMinutes(zoneId24);
        java.time.LocalDate localDate27 = java.time.LocalDate.now(clock26);
        boolean boolean28 = localDate15.isEqual((java.time.chrono.ChronoLocalDate) localDate27);
        int int29 = chronoLocalDateComparator0.compare((java.time.chrono.ChronoLocalDate) localDate13, (java.time.chrono.ChronoLocalDate) localDate27);
        org.junit.Assert.assertNotNull(chronoLocalDateComparator0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-21" + "'", str3, "2022-02-21");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(clock12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022-02-21" + "'", str17, "2022-02-21");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(clock26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MINUTE_OF_DAY;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MINUTE_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.MINUTE_OF_DAY));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        long[] longArray3 = new long[] { 948000000, 100L, 641000 };
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray3);
        java.nio.LongBuffer longBuffer5 = longBuffer4.asReadOnlyBuffer();
        int int6 = longBuffer5.remaining();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[948000000, 100, 641000]");
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        org.junit.Assert.assertNotNull(offsetDateTime0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime1.minusMonths((long) '#');
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes((long) 63000000);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime10 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) localDateTime9);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime10);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.time.Period period1 = java.time.Period.ofWeeks(57);
        java.time.Period period3 = period1.multipliedBy(43);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.OVERFLOW;
        boolean boolean1 = coderResult0.isOverflow();
        java.lang.String str2 = coderResult0.toString();
        org.junit.Assert.assertNotNull(coderResult0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OVERFLOW" + "'", str2, "OVERFLOW");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime1 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime0);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery2 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean3 = localDateTime0.query(booleanTemporalQuery2);
        java.time.chrono.Chronology chronology4 = localDateTime0.getChronology();
        java.time.chrono.IsoChronology isoChronology5 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra7 = isoChronology5.eraOf((int) (byte) 0);
        int int8 = chronology4.compareTo((java.time.chrono.Chronology) isoChronology5);
        java.time.Instant instant9 = java.time.Instant.EPOCH;
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId14 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime11.withZoneSameInstant(zoneId14);
        java.time.Clock clock16 = java.time.Clock.tickMinutes(zoneId14);
        java.time.OffsetDateTime offsetDateTime17 = java.time.OffsetDateTime.now(zoneId14);
        java.time.Instant instant18 = offsetDateTime17.toInstant();
        int int19 = instant9.compareTo(instant18);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale21 = java.util.Locale.US;
        java.lang.String str22 = chronoField20.getDisplayName(locale21);
        boolean boolean23 = instant9.isSupported((java.time.temporal.TemporalField) chronoField20);
        java.time.ZoneId zoneId24 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime25 = java.time.ZonedDateTime.now(zoneId24);
        int int26 = zonedDateTime25.getSecond();
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime28 = zonedDateTime25.with((java.time.temporal.TemporalAdjuster) zoneOffset27);
        java.time.LocalDate localDate29 = java.time.LocalDate.now();
        int int30 = localDate29.getDayOfYear();
        java.lang.String str31 = localDate29.toString();
        int int32 = localDate29.getDayOfMonth();
        java.time.LocalTime localTime34 = java.time.LocalTime.ofNanoOfDay(0L);
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int37 = localDateTime35.get((java.time.temporal.TemporalField) chronoField36);
        java.time.ZoneId zoneId38 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime39 = java.time.ZonedDateTime.now(zoneId38);
        boolean boolean41 = zonedDateTime39.equals((java.lang.Object) 10);
        java.time.LocalTime localTime42 = zonedDateTime39.toLocalTime();
        java.time.LocalDateTime localDateTime43 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime44 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime43);
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.UTC;
        long long46 = localDateTime43.toEpochSecond(zoneOffset45);
        java.time.OffsetTime offsetTime47 = localTime42.atOffset(zoneOffset45);
        java.time.OffsetDateTime offsetDateTime48 = java.time.OffsetDateTime.of(localDateTime35, zoneOffset45);
        java.time.ZonedDateTime zonedDateTime49 = java.time.ZonedDateTime.of(localDate29, localTime34, (java.time.ZoneId) zoneOffset45);
        int int50 = zoneOffset27.compareTo(zoneOffset45);
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime51 = isoChronology5.zonedDateTime(instant9, (java.time.ZoneId) zoneOffset27);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(booleanTemporalQuery2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(isoChronology5);
        org.junit.Assert.assertTrue("'" + isoEra7 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra7.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(clock16);
        org.junit.Assert.assertNotNull(offsetDateTime17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField20.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MilliOfSecond" + "'", str22, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2022-02-21" + "'", str31, "2022-02-21");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 21 + "'", int32 == 21);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField36.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertNotNull(zonedDateTime39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-31557014135596800L) + "'", long46 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime47);
        org.junit.Assert.assertNotNull(offsetDateTime48);
        org.junit.Assert.assertNotNull(zonedDateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime51);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        double[] doubleArray2 = new double[] { (short) 0, 1L };
        java.util.stream.DoubleStream doubleStream3 = java.util.stream.DoubleStream.of(doubleArray2);
        java.util.stream.DoubleStream doubleStream4 = doubleStream3.parallel();
        java.util.function.DoubleBinaryOperator doubleBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble6 = doubleStream3.reduce(doubleBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.SUNDAY;
        java.time.DayOfWeek dayOfWeek2 = dayOfWeek0.plus((long) 264000000);
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.SUNDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.SUNDAY));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.FRIDAY));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        boolean boolean12 = file2.setWritable(true, true);
        boolean boolean13 = file2.exists();
        java.nio.file.Path path14 = file2.toPath();
        java.nio.file.Path path16 = path14.resolveSibling("MilliOfSecond");
        java.io.File file17 = path16.toFile();
        long long18 = file17.length();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertNull("file17.getParent() == null", file17.getParent());
        org.junit.Assert.assertEquals(file17.toString(), "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.getDayOfYear();
        java.lang.String str2 = localDate0.toString();
        int int3 = localDate0.getMonthValue();
        java.time.LocalDate localDate5 = localDate0.withYear(54);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21" + "'", str2, "2022-02-21");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        int int18 = offsetDateTime7.getDayOfYear();
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime7.withSecond(51);
        java.time.ZoneId zoneId21 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime22 = java.time.ZonedDateTime.now(zoneId21);
        boolean boolean24 = zonedDateTime22.equals((java.lang.Object) 10);
        java.time.LocalTime localTime25 = zonedDateTime22.toLocalTime();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime26);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.UTC;
        long long29 = localDateTime26.toEpochSecond(zoneOffset28);
        java.time.OffsetTime offsetTime30 = localTime25.atOffset(zoneOffset28);
        java.time.ZoneId zoneId31 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.now(zoneId31);
        boolean boolean34 = zonedDateTime32.equals((java.lang.Object) 10);
        java.time.LocalTime localTime35 = zonedDateTime32.toLocalTime();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime37 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime36);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        long long39 = localDateTime36.toEpochSecond(zoneOffset38);
        java.time.OffsetTime offsetTime40 = localTime35.atOffset(zoneOffset38);
        java.time.OffsetTime offsetTime41 = offsetTime30.withOffsetSameInstant(zoneOffset38);
        java.time.ZonedDateTime zonedDateTime42 = offsetDateTime20.atZoneSimilarLocal((java.time.ZoneId) zoneOffset38);
        java.time.ZoneId zoneId43 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime44 = java.time.ZonedDateTime.now(zoneId43);
        boolean boolean46 = zonedDateTime44.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId47 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime48 = zonedDateTime44.withZoneSameInstant(zoneId47);
        java.time.Clock clock49 = java.time.Clock.tickMinutes(zoneId47);
        java.time.OffsetDateTime offsetDateTime50 = java.time.OffsetDateTime.now(clock49);
        boolean boolean51 = offsetDateTime20.isAfter(offsetDateTime50);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 576000000 + "'", int8 == 576000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-31557014135596800L) + "'", long29 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-31557014135596800L) + "'", long39 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertNotNull(zonedDateTime42);
        org.junit.Assert.assertNotNull(zoneId43);
        org.junit.Assert.assertNotNull(zonedDateTime44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertNotNull(zonedDateTime48);
        org.junit.Assert.assertNotNull(clock49);
        org.junit.Assert.assertNotNull(offsetDateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime1 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime0);
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.UTC;
        long long3 = localDateTime0.toEpochSecond(zoneOffset2);
        java.time.format.DateTimeFormatter dateTimeFormatter4 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery7 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean8 = localDateTime5.query(booleanTemporalQuery7);
        java.text.Format format9 = dateTimeFormatter4.toFormat(booleanTemporalQuery7);
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = chronoField10.getDisplayName(locale11);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId15 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime16 = java.time.ZonedDateTime.now(zoneId15);
        boolean boolean18 = zonedDateTime16.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId19 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime20 = zonedDateTime16.withZoneSameInstant(zoneId19);
        java.time.Clock clock21 = java.time.Clock.tickMinutes(zoneId19);
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.now(clock21);
        long long23 = chronoField14.getFrom((java.time.temporal.TemporalAccessor) localDateTime22);
        java.time.temporal.TemporalField[] temporalFieldArray24 = new java.time.temporal.TemporalField[] { chronoField10, chronoField13, chronoField14 };
        java.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter4.withResolverFields(temporalFieldArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = localDateTime0.format(dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-31557014135596800L) + "'", long3 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(booleanTemporalQuery7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNotNull(format9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField10.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MilliOfSecond" + "'", str12, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField13.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField14.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.LocalTime localTime14 = zonedDateTime11.toLocalTime();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        long long18 = localDateTime15.toEpochSecond(zoneOffset17);
        java.time.OffsetTime offsetTime19 = localTime14.atOffset(zoneOffset17);
        java.time.OffsetTime offsetTime20 = offsetTime9.withOffsetSameInstant(zoneOffset17);
        java.time.ZoneId zoneId21 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime22 = java.time.ZonedDateTime.now(zoneId21);
        boolean boolean24 = zonedDateTime22.equals((java.lang.Object) 10);
        java.time.LocalTime localTime25 = zonedDateTime22.toLocalTime();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime26);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.UTC;
        long long29 = localDateTime26.toEpochSecond(zoneOffset28);
        java.time.OffsetTime offsetTime30 = localTime25.atOffset(zoneOffset28);
        java.time.ZoneId zoneId31 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.now(zoneId31);
        boolean boolean34 = zonedDateTime32.equals((java.lang.Object) 10);
        java.time.LocalTime localTime35 = zonedDateTime32.toLocalTime();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime37 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime36);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        long long39 = localDateTime36.toEpochSecond(zoneOffset38);
        java.time.OffsetTime offsetTime40 = localTime35.atOffset(zoneOffset38);
        java.time.OffsetTime offsetTime41 = offsetTime30.withOffsetSameInstant(zoneOffset38);
        boolean boolean42 = offsetTime20.isEqual(offsetTime41);
        java.time.ZoneOffset zoneOffset43 = offsetTime41.getOffset();
        java.time.temporal.TemporalUnit temporalUnit45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime46 = offsetTime41.minus((long) (short) 10, temporalUnit45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-31557014135596800L) + "'", long18 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-31557014135596800L) + "'", long29 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-31557014135596800L) + "'", long39 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(zoneOffset43);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        boolean boolean12 = file2.setWritable(true, true);
        boolean boolean13 = file2.exists();
        boolean boolean14 = file2.canExecute();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime1 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime0);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery2 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean3 = localDateTime0.query(booleanTemporalQuery2);
        java.time.DayOfWeek dayOfWeek4 = localDateTime0.getDayOfWeek();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.EPOCH_DAY;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dayOfWeek4.getLong((java.time.temporal.TemporalField) chronoField5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(booleanTemporalQuery2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + dayOfWeek4 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek4.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.EPOCH_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.EPOCH_DAY));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        long[] longArray3 = new long[] { 948000000, 100L, 641000 };
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray3);
        java.nio.LongBuffer longBuffer5 = java.nio.LongBuffer.wrap(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[948000000, 100, 641000]");
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longBuffer5);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        boolean boolean4 = zonedDateTime2.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime2.withZoneSameInstant(zoneId5);
        java.time.Clock clock7 = java.time.Clock.tickMinutes(zoneId5);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now(zoneId5);
        java.time.Instant instant9 = offsetDateTime8.toInstant();
        int int10 = instant0.compareTo(instant9);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = chronoField11.getDisplayName(locale12);
        boolean boolean14 = instant0.isSupported((java.time.temporal.TemporalField) chronoField11);
        java.time.ZoneId zoneId15 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime16 = java.time.ZonedDateTime.now(zoneId15);
        boolean boolean18 = zonedDateTime16.equals((java.lang.Object) 10);
        java.time.LocalTime localTime19 = zonedDateTime16.toLocalTime();
        java.time.ZonedDateTime zonedDateTime21 = zonedDateTime16.minusMonths((long) '#');
        java.time.ZoneId zoneId22 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime23 = java.time.ZonedDateTime.now(zoneId22);
        int int24 = zonedDateTime23.getSecond();
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime26 = zonedDateTime23.with((java.time.temporal.TemporalAdjuster) zoneOffset25);
        java.time.Month month27 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime23);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery28 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean29 = zonedDateTime23.query(booleanTemporalQuery28);
        java.lang.Boolean boolean30 = zonedDateTime16.query(booleanTemporalQuery28);
        java.time.ZoneOffset zoneOffset31 = zonedDateTime16.getOffset();
        java.time.OffsetDateTime offsetDateTime32 = instant0.atOffset(zoneOffset31);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField11.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MilliOfSecond" + "'", str13, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime26);
        org.junit.Assert.assertTrue("'" + month27 + "' != '" + java.time.Month.FEBRUARY + "'", month27.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery28);
        org.junit.Assert.assertEquals("'" + boolean29 + "' != '" + false + "'", boolean29, false);
        org.junit.Assert.assertEquals("'" + boolean30 + "' != '" + false + "'", boolean30, false);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = java.time.zone.ZoneRules.of(zoneOffset0);
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime2);
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        long long5 = localDateTime2.toEpochSecond(zoneOffset4);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int8 = localDateTime6.get((java.time.temporal.TemporalField) chronoField7);
        java.time.temporal.Temporal temporal9 = localDateTime2.adjustInto((java.time.temporal.Temporal) localDateTime6);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime11 = localDateTime6.atZone(zoneId10);
        int int12 = localDateTime6.getMinute();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = chronoField13.getDisplayName(locale14);
        java.time.LocalDateTime localDateTime17 = localDateTime6.with((java.time.temporal.TemporalField) chronoField13, (long) 1);
        java.time.ZoneId zoneId18 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.now(zoneId18);
        boolean boolean21 = zonedDateTime19.equals((java.lang.Object) 10);
        java.time.LocalTime localTime22 = zonedDateTime19.toLocalTime();
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime23);
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        long long26 = localDateTime23.toEpochSecond(zoneOffset25);
        java.time.OffsetTime offsetTime27 = localTime22.atOffset(zoneOffset25);
        boolean boolean28 = zoneRules1.isValidOffset(localDateTime17, zoneOffset25);
        java.time.LocalDate localDate29 = java.time.LocalDate.now();
        int int30 = localDate29.lengthOfMonth();
        java.time.ZoneId zoneId31 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.now(zoneId31);
        boolean boolean34 = zonedDateTime32.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId35 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime36 = zonedDateTime32.withZoneSameInstant(zoneId35);
        java.time.Clock clock37 = java.time.Clock.tickMinutes(zoneId35);
        java.time.LocalDate localDate38 = java.time.LocalDate.now(clock37);
        java.time.Period period39 = localDate29.until((java.time.chrono.ChronoLocalDate) localDate38);
        java.time.LocalDate localDate40 = java.time.LocalDate.now();
        int int41 = localDate40.lengthOfMonth();
        java.time.ZoneId zoneId42 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime43 = java.time.ZonedDateTime.now(zoneId42);
        boolean boolean45 = zonedDateTime43.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId46 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime47 = zonedDateTime43.withZoneSameInstant(zoneId46);
        java.time.Clock clock48 = java.time.Clock.tickMinutes(zoneId46);
        java.time.LocalDate localDate49 = java.time.LocalDate.now(clock48);
        java.time.Period period50 = localDate40.until((java.time.chrono.ChronoLocalDate) localDate49);
        java.time.chrono.ChronoPeriod chronoPeriod51 = period39.minus((java.time.temporal.TemporalAmount) period50);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime52 = localDateTime17.minus((java.time.temporal.TemporalAmount) period39);
        java.time.LocalDateTime localDateTime54 = localDateTime17.withDayOfYear(29);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-31557014135596800L) + "'", long5 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField7.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(temporal9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField13.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MilliOfSecond" + "'", str15, "MilliOfSecond");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-31557014135596800L) + "'", long26 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28 + "'", int30 == 28);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertNotNull(clock37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 28 + "'", int41 == 28);
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertNotNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(zoneId46);
        org.junit.Assert.assertNotNull(zonedDateTime47);
        org.junit.Assert.assertNotNull(clock48);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(chronoPeriod51);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.security.CodeSource codeSource0 = null;
        java.security.PermissionCollection permissionCollection1 = null;
        java.lang.ClassLoader classLoader2 = null;
        java.security.Principal principal3 = null;
        java.security.Principal[] principalArray4 = new java.security.Principal[] { principal3 };
        java.security.ProtectionDomain protectionDomain5 = new java.security.ProtectionDomain(codeSource0, permissionCollection1, classLoader2, principalArray4);
        java.lang.ClassLoader classLoader6 = protectionDomain5.getClassLoader();
        org.junit.Assert.assertNotNull(principalArray4);
        org.junit.Assert.assertNull(classLoader6);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        int int18 = offsetDateTime7.getDayOfYear();
        java.time.OffsetDateTime offsetDateTime20 = offsetDateTime7.withSecond(51);
        java.time.temporal.TemporalUnit temporalUnit21 = null;
        boolean boolean22 = offsetDateTime20.isSupported(temporalUnit21);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 805000000 + "'", int8 == 805000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap4 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean5 = temporalAdjusterMap4.isEmpty();
        java.time.LocalTime localTime6 = java.time.LocalTime.now();
        java.time.LocalTime localTime7 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal8 = localTime6.adjustInto((java.time.temporal.Temporal) localTime7);
        java.io.FileNotFoundException fileNotFoundException9 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException9);
        java.lang.String str11 = costException10.getPattern();
        java.io.FileNotFoundException fileNotFoundException13 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException13);
        java.lang.String str15 = costException14.getPattern();
        java.security.InvalidKeyException invalidKeyException16 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException14);
        boolean boolean17 = temporalAdjusterMap4.replace((java.time.temporal.TemporalAdjuster) localTime6, (org.apache.commons.math.MathException) costException10, (org.apache.commons.math.MathException) costException14);
        java.time.ZoneId zoneId18 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.now(zoneId18);
        boolean boolean21 = zonedDateTime19.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId22 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime23 = zonedDateTime19.withZoneSameInstant(zoneId22);
        java.time.Clock clock24 = java.time.Clock.tickMinutes(zoneId22);
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.now(zoneId22);
        int int26 = offsetDateTime25.getNano();
        java.time.ZoneId zoneId27 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime28 = java.time.ZonedDateTime.now(zoneId27);
        boolean boolean30 = zonedDateTime28.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId31 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime32 = zonedDateTime28.withZoneSameInstant(zoneId31);
        java.time.Clock clock33 = java.time.Clock.tickMinutes(zoneId31);
        java.time.OffsetDateTime offsetDateTime34 = java.time.OffsetDateTime.now(zoneId31);
        boolean boolean35 = offsetDateTime25.isBefore(offsetDateTime34);
        int int36 = offsetDateTime25.getDayOfYear();
        java.security.cert.CertificateException certificateException37 = new java.security.cert.CertificateException();
        boolean boolean38 = temporalAdjusterMap4.remove((java.lang.Object) offsetDateTime25, (java.lang.Object) certificateException37);
        java.util.concurrent.ExecutionException executionException39 = new java.util.concurrent.ExecutionException("java.nio.charset.CharacterCodingException", (java.lang.Throwable) certificateException37);
        java.security.KeyException keyException40 = new java.security.KeyException("en", (java.lang.Throwable) certificateException37);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(temporal8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertNotNull(clock24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 821000000 + "'", int26 == 821000000);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertNotNull(clock33);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MAX;
        org.junit.Assert.assertNotNull(zoneOffset0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.time.LocalTime localTime0 = java.time.LocalTime.NOON;
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.OffsetTime offsetTime11 = offsetTime9.minusHours((long) 55);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(offsetTime11);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.util.Comparator<java.time.chrono.ChronoLocalDate> chronoLocalDateComparator0 = java.time.chrono.ChronoLocalDate.timeLineOrder();
        java.util.Comparator<java.time.chrono.ChronoLocalDate> chronoLocalDateComparator1 = java.time.chrono.ChronoLocalDate.timeLineOrder();
        java.util.Comparator<java.time.chrono.ChronoLocalDate> chronoLocalDateComparator2 = chronoLocalDateComparator0.thenComparing(chronoLocalDateComparator1);
        java.lang.String[] strArray3 = java.util.Locale.getISOCountries();
        boolean boolean4 = chronoLocalDateComparator2.equals((java.lang.Object) strArray3);
        org.junit.Assert.assertNotNull(chronoLocalDateComparator0);
        org.junit.Assert.assertNotNull(chronoLocalDateComparator1);
        org.junit.Assert.assertNotNull(chronoLocalDateComparator2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime1 = java.time.OffsetDateTime.parse((java.lang.CharSequence) "IGNORE");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'IGNORE' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime6 = localDateTime0.withSecond(51);
        java.time.Duration duration8 = java.time.Duration.ofNanos((long) 63000000);
        java.time.Duration duration9 = duration8.negated();
        java.time.LocalDateTime localDateTime10 = localDateTime6.plus((java.time.temporal.TemporalAmount) duration9);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        boolean boolean12 = file2.setWritable(true, true);
        boolean boolean13 = file2.exists();
        java.nio.file.Path path14 = file2.toPath();
        java.nio.file.Path path16 = path14.resolveSibling("MilliOfSecond");
        boolean boolean17 = path16.isAbsolute();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime1 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime0);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery2 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean3 = localDateTime0.query(booleanTemporalQuery2);
        java.time.DayOfWeek dayOfWeek4 = localDateTime0.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = localDateTime0.minusWeeks((long) 128000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -1002453164");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(booleanTemporalQuery2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + dayOfWeek4 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek4.equals(java.time.DayOfWeek.MONDAY));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.Instant instant3 = java.time.Instant.from((java.time.temporal.TemporalAccessor) zonedDateTime1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withDayOfYear(336000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 336000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.util.stream.DoubleStream.Builder builder0 = java.util.stream.DoubleStream.builder();
        builder0.accept((double) 10.0f);
        java.util.stream.DoubleStream.Builder builder3 = java.util.stream.DoubleStream.builder();
        java.util.stream.DoubleStream.Builder builder5 = builder3.add((double) (short) -1);
        java.util.function.DoubleConsumer doubleConsumer6 = builder0.andThen((java.util.function.DoubleConsumer) builder3);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(doubleConsumer6);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.YEAR));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.LocalTime localTime14 = zonedDateTime11.toLocalTime();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        long long18 = localDateTime15.toEpochSecond(zoneOffset17);
        java.time.OffsetTime offsetTime19 = localTime14.atOffset(zoneOffset17);
        java.time.OffsetTime offsetTime20 = offsetTime9.withOffsetSameInstant(zoneOffset17);
        java.time.OffsetTime offsetTime22 = offsetTime20.withHour(1);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime25 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime24);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery26 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean27 = localDateTime24.query(booleanTemporalQuery26);
        java.text.Format format28 = dateTimeFormatter23.toFormat(booleanTemporalQuery26);
        java.time.format.ResolverStyle resolverStyle29 = java.time.format.ResolverStyle.LENIENT;
        java.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter23.withResolverStyle(resolverStyle29);
        java.lang.String str31 = offsetTime20.format(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-31557014135596800L) + "'", long18 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(booleanTemporalQuery26);
        org.junit.Assert.assertEquals("'" + boolean27 + "' != '" + false + "'", boolean27, false);
        org.junit.Assert.assertNotNull(format28);
        org.junit.Assert.assertTrue("'" + resolverStyle29 + "' != '" + java.time.format.ResolverStyle.LENIENT + "'", resolverStyle29.equals(java.time.format.ResolverStyle.LENIENT));
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "09:21:36.048Z" + "'", str31, "09:21:36.048Z");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        double[] doubleArray2 = new double[] { (short) 0, 1L };
        java.util.stream.DoubleStream doubleStream3 = java.util.stream.DoubleStream.of(doubleArray2);
        java.util.OptionalDouble optionalDouble4 = doubleStream3.max();
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble4.orElseGet(doubleSupplier5);
        double double8 = optionalDouble4.orElse((double) (-31557014135596800L));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap1 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>(0);
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int5 = localDateTime3.get((java.time.temporal.TemporalField) chronoField4);
        int int6 = localDateTime2.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime3);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime7);
        boolean boolean9 = localDateTime3.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        java.time.LocalDateTime localDateTime11 = localDateTime7.withSecond(1);
        java.time.LocalDateTime localDateTime13 = localDateTime7.plusSeconds(0L);
        java.time.ZoneId zoneId14 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime15 = java.time.ZonedDateTime.now(zoneId14);
        boolean boolean17 = zonedDateTime15.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId18 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime19 = zonedDateTime15.withZoneSameInstant(zoneId18);
        java.time.Clock clock20 = java.time.Clock.tickMinutes(zoneId18);
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now(zoneId18);
        int int22 = offsetDateTime21.getNano();
        java.time.ZoneId zoneId23 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.now(zoneId23);
        boolean boolean26 = zonedDateTime24.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId27 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime28 = zonedDateTime24.withZoneSameInstant(zoneId27);
        java.time.Clock clock29 = java.time.Clock.tickMinutes(zoneId27);
        java.time.OffsetDateTime offsetDateTime30 = java.time.OffsetDateTime.now(zoneId27);
        boolean boolean31 = offsetDateTime21.isBefore(offsetDateTime30);
        int int32 = offsetDateTime21.getDayOfYear();
        java.time.OffsetDateTime offsetDateTime34 = offsetDateTime21.withSecond(51);
        java.time.ZoneId zoneId35 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime36 = java.time.ZonedDateTime.now(zoneId35);
        boolean boolean38 = zonedDateTime36.equals((java.lang.Object) 10);
        java.time.LocalTime localTime39 = zonedDateTime36.toLocalTime();
        java.time.LocalDateTime localDateTime40 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime41 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime40);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.UTC;
        long long43 = localDateTime40.toEpochSecond(zoneOffset42);
        java.time.OffsetTime offsetTime44 = localTime39.atOffset(zoneOffset42);
        java.time.ZoneId zoneId45 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime46 = java.time.ZonedDateTime.now(zoneId45);
        boolean boolean48 = zonedDateTime46.equals((java.lang.Object) 10);
        java.time.LocalTime localTime49 = zonedDateTime46.toLocalTime();
        java.time.LocalDateTime localDateTime50 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime51 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime50);
        java.time.ZoneOffset zoneOffset52 = java.time.ZoneOffset.UTC;
        long long53 = localDateTime50.toEpochSecond(zoneOffset52);
        java.time.OffsetTime offsetTime54 = localTime49.atOffset(zoneOffset52);
        java.time.OffsetTime offsetTime55 = offsetTime44.withOffsetSameInstant(zoneOffset52);
        java.time.ZonedDateTime zonedDateTime56 = offsetDateTime34.atZoneSimilarLocal((java.time.ZoneId) zoneOffset52);
        java.time.OffsetDateTime offsetDateTime57 = localDateTime7.atOffset(zoneOffset52);
        java.io.FileNotFoundException fileNotFoundException59 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException60 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException59);
        java.lang.String str61 = costException60.getPattern();
        java.security.InvalidKeyException invalidKeyException62 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException60);
        org.apache.commons.math.MathException mathException63 = temporalAdjusterMap1.put((java.time.temporal.TemporalAdjuster) localDateTime7, (org.apache.commons.math.MathException) costException60);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField4.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(clock20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 94000000 + "'", int22 == 94000000);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertNotNull(clock29);
        org.junit.Assert.assertNotNull(offsetDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(offsetDateTime34);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-31557014135596800L) + "'", long43 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime44);
        org.junit.Assert.assertNotNull(zoneId45);
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(zoneOffset52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-31557014135596800L) + "'", long53 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime54);
        org.junit.Assert.assertNotNull(offsetTime55);
        org.junit.Assert.assertNotNull(zonedDateTime56);
        org.junit.Assert.assertNotNull(offsetDateTime57);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(mathException63);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.MICROSECONDS;
        java.nio.file.attribute.FileTime fileTime2 = java.nio.file.attribute.FileTime.from(0L, timeUnit1);
        java.time.Instant instant3 = java.time.Instant.EPOCH;
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = java.time.ZonedDateTime.now(zoneId4);
        boolean boolean7 = zonedDateTime5.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime9 = zonedDateTime5.withZoneSameInstant(zoneId8);
        java.time.Clock clock10 = java.time.Clock.tickMinutes(zoneId8);
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now(zoneId8);
        java.time.Instant instant12 = offsetDateTime11.toInstant();
        int int13 = instant3.compareTo(instant12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale15 = java.util.Locale.US;
        java.lang.String str16 = chronoField14.getDisplayName(locale15);
        boolean boolean17 = instant3.isSupported((java.time.temporal.TemporalField) chronoField14);
        java.time.Instant instant19 = instant3.plusNanos((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime20 = java.nio.file.attribute.FileTime.from(instant3);
        int int21 = fileTime2.compareTo(fileTime20);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertNotNull(fileTime2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(clock10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MilliOfSecond" + "'", str16, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(fileTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localDateTime1.query(booleanTemporalQuery3);
        java.time.chrono.Chronology chronology5 = localDateTime1.getChronology();
        java.time.chrono.IsoChronology isoChronology6 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra8 = isoChronology6.eraOf((int) (byte) 0);
        int int9 = chronology5.compareTo((java.time.chrono.Chronology) isoChronology6);
        java.time.LocalDate localDate10 = java.time.LocalDate.now();
        int int11 = localDate10.getDayOfYear();
        java.lang.String str12 = localDate10.toString();
        int int13 = localDate10.getDayOfMonth();
        java.time.LocalTime localTime15 = java.time.LocalTime.ofNanoOfDay(0L);
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int18 = localDateTime16.get((java.time.temporal.TemporalField) chronoField17);
        java.time.ZoneId zoneId19 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime20 = java.time.ZonedDateTime.now(zoneId19);
        boolean boolean22 = zonedDateTime20.equals((java.lang.Object) 10);
        java.time.LocalTime localTime23 = zonedDateTime20.toLocalTime();
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime25 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime24);
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.UTC;
        long long27 = localDateTime24.toEpochSecond(zoneOffset26);
        java.time.OffsetTime offsetTime28 = localTime23.atOffset(zoneOffset26);
        java.time.OffsetDateTime offsetDateTime29 = java.time.OffsetDateTime.of(localDateTime16, zoneOffset26);
        java.time.ZonedDateTime zonedDateTime30 = java.time.ZonedDateTime.of(localDate10, localTime15, (java.time.ZoneId) zoneOffset26);
        java.time.LocalDateTime localDateTime31 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int33 = localDateTime31.get((java.time.temporal.TemporalField) chronoField32);
        java.time.ZoneId zoneId34 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime35 = java.time.ZonedDateTime.now(zoneId34);
        boolean boolean37 = zonedDateTime35.equals((java.lang.Object) 10);
        java.time.LocalTime localTime38 = zonedDateTime35.toLocalTime();
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime40 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime39);
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        long long42 = localDateTime39.toEpochSecond(zoneOffset41);
        java.time.OffsetTime offsetTime43 = localTime38.atOffset(zoneOffset41);
        java.time.OffsetDateTime offsetDateTime44 = java.time.OffsetDateTime.of(localDateTime31, zoneOffset41);
        int int45 = zoneOffset26.compareTo(zoneOffset41);
        java.time.chrono.ChronoLocalDate chronoLocalDate46 = isoChronology6.dateNow((java.time.ZoneId) zoneOffset41);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration47 = java.time.Duration.between((java.time.temporal.Temporal) localTime0, (java.time.temporal.Temporal) chronoLocalDate46);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalTime from TemporalAccessor: 2022-02-21 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(isoChronology6);
        org.junit.Assert.assertTrue("'" + isoEra8 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra8.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-02-21" + "'", str12, "2022-02-21");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField17.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-31557014135596800L) + "'", long27 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime28);
        org.junit.Assert.assertNotNull(offsetDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField32.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertNotNull(zonedDateTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-31557014135596800L) + "'", long42 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime43);
        org.junit.Assert.assertNotNull(offsetDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(chronoLocalDate46);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.chrono.Chronology chronology5 = localDateTime1.getChronology();
        java.time.Month month6 = localDateTime1.getMonth();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + month6 + "' != '" + java.time.Month.JANUARY + "'", month6.equals(java.time.Month.JANUARY));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("hi!", "MicroOfSecond", "IGNORE");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = java.time.zone.ZoneRules.of(zoneOffset0);
        java.lang.String str2 = zoneRules1.toString();
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int6 = localDateTime4.get((java.time.temporal.TemporalField) chronoField5);
        int int7 = localDateTime3.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime4);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime9 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime8);
        boolean boolean10 = localDateTime4.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime8);
        java.time.LocalDateTime localDateTime12 = localDateTime8.withSecond(1);
        java.time.LocalDateTime localDateTime14 = localDateTime12.plusHours((long) 59);
        java.time.ZoneId zoneId15 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime16 = java.time.ZonedDateTime.now(zoneId15);
        boolean boolean18 = zonedDateTime16.equals((java.lang.Object) 10);
        java.time.LocalTime localTime19 = zonedDateTime16.toLocalTime();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime21 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime20);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        long long23 = localDateTime20.toEpochSecond(zoneOffset22);
        java.time.OffsetTime offsetTime24 = localTime19.atOffset(zoneOffset22);
        java.time.ZoneId zoneId25 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.now(zoneId25);
        boolean boolean28 = zonedDateTime26.equals((java.lang.Object) 10);
        java.time.LocalTime localTime29 = zonedDateTime26.toLocalTime();
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime31 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime30);
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.UTC;
        long long33 = localDateTime30.toEpochSecond(zoneOffset32);
        java.time.OffsetTime offsetTime34 = localTime29.atOffset(zoneOffset32);
        java.time.OffsetTime offsetTime35 = offsetTime24.withOffsetSameInstant(zoneOffset32);
        java.time.Instant instant36 = localDateTime14.toInstant(zoneOffset32);
        boolean boolean37 = zoneRules1.isDaylightSavings(instant36);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZoneRules[currentStandardOffset=Z]" + "'", str2, "ZoneRules[currentStandardOffset=Z]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField5.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-31557014135596800L) + "'", long23 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime24);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-31557014135596800L) + "'", long33 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime34);
        org.junit.Assert.assertNotNull(offsetTime35);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale3.getDisplayName(locale4);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! (hi!)" + "'", str6, "hi! (hi!)");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        long[] longArray3 = new long[] { 948000000, 100L, 641000 };
        java.nio.LongBuffer longBuffer4 = java.nio.LongBuffer.wrap(longArray3);
        java.nio.LongBuffer longBuffer5 = longBuffer4.asReadOnlyBuffer();
        java.nio.Buffer buffer7 = longBuffer5.position((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = longBuffer5.position(475000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[948000000, 100, 641000]");
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(buffer7);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra2 = isoChronology0.eraOf((int) (byte) 0);
        java.time.LocalDate localDate5 = isoChronology0.dateYearDay(56, 58);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate7 = localDate5.withDayOfYear(987000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 987000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertTrue("'" + isoEra2 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra2.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        boolean boolean4 = zonedDateTime2.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime2.withZoneSameInstant(zoneId5);
        java.time.LocalTime localTime7 = zonedDateTime2.toLocalTime();
        java.lang.String str8 = localTime7.toString();
        java.time.temporal.ValueRange valueRange9 = chronoField0.rangeRefinedBy((java.time.temporal.TemporalAccessor) localTime7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = chronoField0.checkValidIntValue((long) 349000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MicroOfSecond (valid values 0 - 999999): 349000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "09:21:36.292" + "'", str8, "09:21:36.292");
        org.junit.Assert.assertNotNull(valueRange9);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.security.SignatureException signatureException1 = new java.security.SignatureException("2022-02-21");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.time.ZoneId zoneId16 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime17 = java.time.ZonedDateTime.now(zoneId16);
        boolean boolean19 = zonedDateTime17.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime21 = zonedDateTime17.withZoneSameInstant(zoneId20);
        java.time.Clock clock22 = java.time.Clock.tickMinutes(zoneId20);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now(zoneId20);
        int int24 = offsetDateTime23.getNano();
        java.time.ZoneId zoneId25 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.now(zoneId25);
        boolean boolean28 = zonedDateTime26.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId29 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime26.withZoneSameInstant(zoneId29);
        java.time.Clock clock31 = java.time.Clock.tickMinutes(zoneId29);
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.now(zoneId29);
        boolean boolean33 = offsetDateTime23.isBefore(offsetDateTime32);
        int int34 = offsetDateTime23.getDayOfYear();
        java.security.cert.CertificateException certificateException35 = new java.security.cert.CertificateException();
        boolean boolean36 = temporalAdjusterMap2.remove((java.lang.Object) offsetDateTime23, (java.lang.Object) certificateException35);
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap39 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean40 = temporalAdjusterMap39.isEmpty();
        java.time.LocalTime localTime41 = java.time.LocalTime.now();
        java.time.LocalTime localTime42 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal43 = localTime41.adjustInto((java.time.temporal.Temporal) localTime42);
        java.io.FileNotFoundException fileNotFoundException44 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException44);
        java.lang.String str46 = costException45.getPattern();
        java.io.FileNotFoundException fileNotFoundException48 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException49 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException48);
        java.lang.String str50 = costException49.getPattern();
        java.security.InvalidKeyException invalidKeyException51 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException49);
        boolean boolean52 = temporalAdjusterMap39.replace((java.time.temporal.TemporalAdjuster) localTime41, (org.apache.commons.math.MathException) costException45, (org.apache.commons.math.MathException) costException49);
        java.time.LocalTime localTime54 = localTime41.withSecond((int) '#');
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap57 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean58 = temporalAdjusterMap57.isEmpty();
        java.time.LocalTime localTime59 = java.time.LocalTime.now();
        java.time.LocalTime localTime60 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal61 = localTime59.adjustInto((java.time.temporal.Temporal) localTime60);
        java.io.FileNotFoundException fileNotFoundException62 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException63 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException62);
        java.lang.String str64 = costException63.getPattern();
        java.io.FileNotFoundException fileNotFoundException66 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException67 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException66);
        java.lang.String str68 = costException67.getPattern();
        java.security.InvalidKeyException invalidKeyException69 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException67);
        boolean boolean70 = temporalAdjusterMap57.replace((java.time.temporal.TemporalAdjuster) localTime59, (org.apache.commons.math.MathException) costException63, (org.apache.commons.math.MathException) costException67);
        org.apache.commons.math.MathException mathException71 = temporalAdjusterMap2.putIfAbsent((java.time.temporal.TemporalAdjuster) localTime54, (org.apache.commons.math.MathException) costException67);
        java.time.LocalTime localTime72 = java.time.LocalTime.now();
        java.io.FileNotFoundException fileNotFoundException73 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException74 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException73);
        org.apache.commons.math.MathException mathException75 = temporalAdjusterMap2.put((java.time.temporal.TemporalAdjuster) localTime72, (org.apache.commons.math.MathException) costException74);
        java.time.ZoneId zoneId76 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime77 = java.time.ZonedDateTime.now(zoneId76);
        int int78 = zonedDateTime77.getSecond();
        java.time.ZoneOffset zoneOffset79 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime80 = zonedDateTime77.with((java.time.temporal.TemporalAdjuster) zoneOffset79);
        java.time.LocalTime localTime81 = zonedDateTime77.toLocalTime();
        java.time.temporal.ChronoField chronoField82 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int83 = localTime81.get((java.time.temporal.TemporalField) chronoField82);
        java.util.Locale locale84 = java.util.Locale.ITALY;
        java.lang.String str85 = chronoField82.getDisplayName(locale84);
        boolean boolean86 = localTime72.isSupported((java.time.temporal.TemporalField) chronoField82);
        java.util.Locale locale87 = java.util.Locale.FRENCH;
        java.lang.String str88 = chronoField82.getDisplayName(locale87);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 307000000 + "'", int24 == 307000000);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(clock31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(temporal43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(temporal61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(mathException71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNull(mathException75);
        org.junit.Assert.assertNotNull(zoneId76);
        org.junit.Assert.assertNotNull(zonedDateTime77);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 36 + "'", int78 == 36);
        org.junit.Assert.assertNotNull(zoneOffset79);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime80);
        org.junit.Assert.assertNotNull(localTime81);
        org.junit.Assert.assertTrue("'" + chronoField82 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField82.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
// flaky:         org.junit.Assert.assertTrue("'" + int83 + "' != '" + 307000 + "'", int83 == 307000);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "MicroOfSecond" + "'", str85, "MicroOfSecond");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "MicroOfSecond" + "'", str88, "MicroOfSecond");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("09:21:21.183", "en", 729000000);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        boolean boolean4 = zonedDateTime2.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime2.withZoneSameInstant(zoneId5);
        java.time.Clock clock7 = java.time.Clock.tickMinutes(zoneId5);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.now(clock7);
        long long9 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) localDateTime8);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        int int12 = zonedDateTime11.getSecond();
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime14 = zonedDateTime11.with((java.time.temporal.TemporalAdjuster) zoneOffset13);
        java.time.Month month15 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime11);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery16 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean17 = zonedDateTime11.query(booleanTemporalQuery16);
        java.lang.Boolean boolean18 = localDateTime8.query(booleanTemporalQuery16);
        java.time.Month month19 = java.time.Month.DECEMBER;
        java.time.Month month21 = month19.minus(0L);
        java.time.LocalDateTime localDateTime22 = localDateTime8.with((java.time.temporal.TemporalAdjuster) month19);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime14);
        org.junit.Assert.assertTrue("'" + month15 + "' != '" + java.time.Month.FEBRUARY + "'", month15.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery16);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertEquals("'" + boolean18 + "' != '" + false + "'", boolean18, false);
        org.junit.Assert.assertTrue("'" + month19 + "' != '" + java.time.Month.DECEMBER + "'", month19.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertTrue("'" + month21 + "' != '" + java.time.Month.DECEMBER + "'", month21.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        boolean boolean4 = zonedDateTime2.equals((java.lang.Object) 10);
        java.time.LocalDate localDate5 = isoChronology0.date((java.time.temporal.TemporalAccessor) zonedDateTime2);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime6);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery8 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean9 = localDateTime6.query(booleanTemporalQuery8);
        java.time.chrono.Chronology chronology10 = localDateTime6.getChronology();
        java.time.chrono.IsoChronology isoChronology11 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra13 = isoChronology11.eraOf((int) (byte) 0);
        int int14 = chronology10.compareTo((java.time.chrono.Chronology) isoChronology11);
        int int15 = isoChronology0.compareTo(chronology10);
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(booleanTemporalQuery8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(isoChronology11);
        org.junit.Assert.assertTrue("'" + isoEra13 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra13.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        java.util.function.LongConsumer longConsumer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream2 = longStream0.peek(longConsumer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.getDayOfYear();
        java.lang.String str2 = localDate0.toString();
        int int3 = localDate0.getDayOfMonth();
        java.time.chrono.Era era4 = localDate0.getEra();
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime6 = java.time.ZonedDateTime.now(zoneId5);
        boolean boolean8 = zonedDateTime6.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime6.withZoneSameInstant(zoneId9);
        java.time.Clock clock11 = java.time.Clock.tickMinutes(zoneId9);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.now(zoneId9);
        int int13 = offsetDateTime12.getNano();
        java.time.ZoneId zoneId14 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime15 = java.time.ZonedDateTime.now(zoneId14);
        boolean boolean17 = zonedDateTime15.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId18 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime19 = zonedDateTime15.withZoneSameInstant(zoneId18);
        java.time.Clock clock20 = java.time.Clock.tickMinutes(zoneId18);
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.now(zoneId18);
        boolean boolean22 = offsetDateTime12.isBefore(offsetDateTime21);
        int int23 = offsetDateTime12.getDayOfYear();
        java.time.OffsetDateTime offsetDateTime25 = offsetDateTime12.withSecond(51);
        java.time.OffsetDateTime offsetDateTime27 = offsetDateTime25.minusMonths((long) 948000000);
        java.time.ZoneId zoneId28 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.now(zoneId28);
        int int30 = zonedDateTime29.getSecond();
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime32 = zonedDateTime29.with((java.time.temporal.TemporalAdjuster) zoneOffset31);
        java.time.LocalTime localTime33 = zonedDateTime29.toLocalTime();
        java.time.temporal.ChronoField chronoField34 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int35 = localTime33.get((java.time.temporal.TemporalField) chronoField34);
        java.util.Locale locale36 = java.util.Locale.ITALY;
        java.lang.String str37 = chronoField34.getDisplayName(locale36);
        long long38 = offsetDateTime25.getLong((java.time.temporal.TemporalField) chronoField34);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange39 = era4.range((java.time.temporal.TemporalField) chronoField34);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MicroOfSecond");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21" + "'", str2, "2022-02-21");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + era4 + "' != '" + java.time.chrono.IsoEra.CE + "'", era4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(clock11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 463000000 + "'", int13 == 463000000);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(clock20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertNotNull(zonedDateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 36 + "'", int30 == 36);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + chronoField34 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField34.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 463000 + "'", int35 == 463000);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MicroOfSecond" + "'", str37, "MicroOfSecond");
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 463000L + "'", long38 == 463000L);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.time.Month month0 = java.time.Month.APRIL;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.APRIL + "'", month0.equals(java.time.Month.APRIL));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MONTH_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.MONTH_OF_YEAR));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        java.time.LocalTime localTime5 = zonedDateTime1.toLocalTime();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime1.minusWeeks((long) 52);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(zonedDateTime7);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        boolean boolean0 = java.net.URLConnection.getDefaultAllowUserInteraction();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.function.IntConsumer intConsumer1 = null;
        optionalInt0.ifPresent(intConsumer1);
        int int4 = optionalInt0.orElse(0);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.time.format.ResolverStyle resolverStyle0 = java.time.format.ResolverStyle.STRICT;
        org.junit.Assert.assertTrue("'" + resolverStyle0 + "' != '" + java.time.format.ResolverStyle.STRICT + "'", resolverStyle0.equals(java.time.format.ResolverStyle.STRICT));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = java.time.ZonedDateTime.now(zoneId6);
        int int8 = zonedDateTime7.getSecond();
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime10 = zonedDateTime7.with((java.time.temporal.TemporalAdjuster) zoneOffset9);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        boolean boolean12 = zoneOffset9.isSupported((java.time.temporal.TemporalField) chronoField11);
        boolean boolean13 = zonedDateTime5.isSupported((java.time.temporal.TemporalField) chronoField11);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 38 + "'", int8 == 38);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField11.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        boolean boolean12 = file2.setWritable(true, true);
        boolean boolean13 = file2.exists();
        java.nio.file.Path path14 = file2.toPath();
        java.nio.file.Path path16 = path14.resolveSibling("MilliOfSecond");
        long[] longArray20 = new long[] { 948000000, 100L, 641000 };
        java.nio.LongBuffer longBuffer21 = java.nio.LongBuffer.wrap(longArray20);
        java.nio.LongBuffer longBuffer22 = longBuffer21.asReadOnlyBuffer();
        long[] longArray24 = new long[] { 10 };
        java.nio.LongBuffer longBuffer25 = longBuffer21.get(longArray24);
        boolean boolean26 = path16.equals((java.lang.Object) longBuffer21);
        java.nio.LongBuffer longBuffer27 = longBuffer21.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer30 = longBuffer27.put(627000000, (long) 58);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[948000000, 100, 641000]");
        org.junit.Assert.assertNotNull(longBuffer21);
        org.junit.Assert.assertNotNull(longBuffer22);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[948000000]");
        org.junit.Assert.assertNotNull(longBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(longBuffer27);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        temporalAdjusterMap2.clear();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.zone.ZoneRules zoneRules1 = java.time.zone.ZoneRules.of(zoneOffset0);
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime2);
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        long long5 = localDateTime2.toEpochSecond(zoneOffset4);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int8 = localDateTime6.get((java.time.temporal.TemporalField) chronoField7);
        java.time.temporal.Temporal temporal9 = localDateTime2.adjustInto((java.time.temporal.Temporal) localDateTime6);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime11 = localDateTime6.atZone(zoneId10);
        int int12 = localDateTime6.getMinute();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = chronoField13.getDisplayName(locale14);
        java.time.LocalDateTime localDateTime17 = localDateTime6.with((java.time.temporal.TemporalField) chronoField13, (long) 1);
        java.time.ZoneId zoneId18 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.now(zoneId18);
        boolean boolean21 = zonedDateTime19.equals((java.lang.Object) 10);
        java.time.LocalTime localTime22 = zonedDateTime19.toLocalTime();
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime23);
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        long long26 = localDateTime23.toEpochSecond(zoneOffset25);
        java.time.OffsetTime offsetTime27 = localTime22.atOffset(zoneOffset25);
        boolean boolean28 = zoneRules1.isValidOffset(localDateTime17, zoneOffset25);
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int32 = localDateTime30.get((java.time.temporal.TemporalField) chronoField31);
        int int33 = localDateTime29.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime30);
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime35 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime34);
        boolean boolean36 = localDateTime30.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime34);
        java.time.ZoneOffset zoneOffset37 = zoneRules1.getOffset(localDateTime34);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneRules1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-31557014135596800L) + "'", long5 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField7.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(temporal9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField13.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MilliOfSecond" + "'", str15, "MilliOfSecond");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-31557014135596800L) + "'", long26 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField31.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(zoneOffset37);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.util.function.DoubleUnaryOperator doubleUnaryOperator0 = java.util.function.DoubleUnaryOperator.identity();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator1 = java.util.function.DoubleUnaryOperator.identity();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator2 = doubleUnaryOperator0.andThen(doubleUnaryOperator1);
        double double4 = doubleUnaryOperator2.applyAsDouble((double) 12);
        org.junit.Assert.assertNotNull(doubleUnaryOperator0);
        org.junit.Assert.assertNotNull(doubleUnaryOperator1);
        org.junit.Assert.assertNotNull(doubleUnaryOperator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 12.0d + "'", double4 == 12.0d);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.Iterator<java.lang.String> strItor4 = strSet2.iterator();
        java.util.Set<java.lang.String> strSet5 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean6 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Iterator<java.lang.String> strItor11 = strSet9.iterator();
        java.util.Set<java.lang.String> strSet12 = java.time.ZoneId.getAvailableZoneIds();
        boolean boolean13 = strSet9.retainAll((java.util.Collection<java.lang.String>) strSet12);
        boolean boolean14 = strSet5.containsAll((java.util.Collection<java.lang.String>) strSet9);
        java.util.Iterator<java.lang.String> strItor15 = strSet9.iterator();
        java.util.Iterator<java.lang.String> strItor16 = strSet9.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction17 = java.nio.charset.CodingErrorAction.IGNORE;
        boolean boolean18 = strSet9.contains((java.lang.Object) codingErrorAction17);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(codingErrorAction17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        double[] doubleArray2 = new double[] { (short) 0, 1L };
        java.util.stream.DoubleStream doubleStream3 = java.util.stream.DoubleStream.of(doubleArray2);
        java.util.stream.DoubleStream doubleStream4 = doubleStream3.parallel();
        double double5 = doubleStream4.sum();
        doubleStream4.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = doubleStream4.limit((long) 827000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(zoneId1);
        boolean boolean4 = zonedDateTime2.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId5 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime2.withZoneSameInstant(zoneId5);
        java.time.LocalTime localTime7 = zonedDateTime2.toLocalTime();
        java.lang.String str8 = localTime7.toString();
        java.time.temporal.ValueRange valueRange9 = chronoField0.rangeRefinedBy((java.time.temporal.TemporalAccessor) localTime7);
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = chronoField10.getDisplayName(locale11);
        boolean boolean13 = valueRange9.equals((java.lang.Object) str12);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "09:21:38.676" + "'", str8, "09:21:38.676");
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField10.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MilliOfSecond" + "'", str12, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.net.URISyntaxException uRISyntaxException2 = new java.net.URISyntaxException("2022-02-21", "java.text.ParseException: ");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        boolean boolean12 = file2.setWritable(true, true);
        boolean boolean13 = file2.exists();
        java.nio.file.Path path14 = file2.toPath();
        java.nio.file.Path path15 = path14.getFileName();
        java.nio.file.Path path17 = path15.resolve("en");
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNotNull(path15);
        org.junit.Assert.assertNotNull(path17);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.ZoneId zoneId9 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.now(zoneId9);
        boolean boolean12 = zonedDateTime10.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withZoneSameInstant(zoneId13);
        java.time.Clock clock15 = java.time.Clock.tickMinutes(zoneId13);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.now(zoneId13);
        boolean boolean17 = offsetDateTime7.isBefore(offsetDateTime16);
        int int18 = offsetDateTime16.getSecond();
        java.time.ZoneId zoneId19 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime20 = java.time.ZonedDateTime.now(zoneId19);
        boolean boolean22 = zonedDateTime20.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId23 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime24 = zonedDateTime20.withZoneSameInstant(zoneId23);
        java.time.Clock clock25 = java.time.Clock.tickMinutes(zoneId23);
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.now(zoneId23);
        int int27 = offsetDateTime26.getNano();
        java.time.ZoneId zoneId28 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.now(zoneId28);
        boolean boolean31 = zonedDateTime29.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId32 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime33 = zonedDateTime29.withZoneSameInstant(zoneId32);
        java.time.Clock clock34 = java.time.Clock.tickMinutes(zoneId32);
        java.time.OffsetDateTime offsetDateTime35 = java.time.OffsetDateTime.now(zoneId32);
        boolean boolean36 = offsetDateTime26.isBefore(offsetDateTime35);
        int int37 = offsetDateTime35.getSecond();
        boolean boolean38 = offsetDateTime16.isBefore(offsetDateTime35);
        int int39 = offsetDateTime35.getDayOfYear();
        java.time.ZoneId zoneId40 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime41 = java.time.ZonedDateTime.now(zoneId40);
        int int42 = zonedDateTime41.getSecond();
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime44 = zonedDateTime41.with((java.time.temporal.TemporalAdjuster) zoneOffset43);
        java.time.LocalTime localTime45 = zonedDateTime41.toLocalTime();
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int47 = localTime45.get((java.time.temporal.TemporalField) chronoField46);
        java.util.Locale locale48 = java.util.Locale.ITALY;
        java.lang.String str49 = chronoField46.getDisplayName(locale48);
        java.time.OffsetDateTime offsetDateTime51 = offsetDateTime35.with((java.time.temporal.TemporalField) chronoField46, 0L);
        java.time.ZoneId zoneId52 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime53 = java.time.ZonedDateTime.now(zoneId52);
        boolean boolean55 = zonedDateTime53.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId56 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime57 = zonedDateTime53.withZoneSameInstant(zoneId56);
        java.time.Clock clock58 = java.time.Clock.tickMinutes(zoneId56);
        java.time.OffsetDateTime offsetDateTime59 = java.time.OffsetDateTime.now(zoneId56);
        int int60 = offsetDateTime59.getNano();
        java.time.ZoneId zoneId61 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime62 = java.time.ZonedDateTime.now(zoneId61);
        boolean boolean64 = zonedDateTime62.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId65 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime66 = zonedDateTime62.withZoneSameInstant(zoneId65);
        java.time.Clock clock67 = java.time.Clock.tickMinutes(zoneId65);
        java.time.OffsetDateTime offsetDateTime68 = java.time.OffsetDateTime.now(zoneId65);
        boolean boolean69 = offsetDateTime59.isBefore(offsetDateTime68);
        int int70 = offsetDateTime68.getSecond();
        java.time.ZoneId zoneId71 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime72 = java.time.ZonedDateTime.now(zoneId71);
        boolean boolean74 = zonedDateTime72.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId75 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime76 = zonedDateTime72.withZoneSameInstant(zoneId75);
        java.time.Clock clock77 = java.time.Clock.tickMinutes(zoneId75);
        java.time.OffsetDateTime offsetDateTime78 = java.time.OffsetDateTime.now(zoneId75);
        int int79 = offsetDateTime78.getNano();
        java.time.ZoneId zoneId80 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime81 = java.time.ZonedDateTime.now(zoneId80);
        boolean boolean83 = zonedDateTime81.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId84 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime85 = zonedDateTime81.withZoneSameInstant(zoneId84);
        java.time.Clock clock86 = java.time.Clock.tickMinutes(zoneId84);
        java.time.OffsetDateTime offsetDateTime87 = java.time.OffsetDateTime.now(zoneId84);
        boolean boolean88 = offsetDateTime78.isBefore(offsetDateTime87);
        int int89 = offsetDateTime87.getSecond();
        boolean boolean90 = offsetDateTime68.isBefore(offsetDateTime87);
        int int91 = offsetDateTime87.getDayOfYear();
        boolean boolean92 = offsetDateTime35.isEqual(offsetDateTime87);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 708000000 + "'", int8 == 708000000);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertNotNull(clock25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 709000000 + "'", int27 == 709000000);
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertNotNull(clock34);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 38 + "'", int37 == 38);
// flaky:         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(zoneId40);
        org.junit.Assert.assertNotNull(zonedDateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 38 + "'", int42 == 38);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField46.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 709000 + "'", int47 == 709000);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "MicroOfSecond" + "'", str49, "MicroOfSecond");
        org.junit.Assert.assertNotNull(offsetDateTime51);
        org.junit.Assert.assertNotNull(zoneId52);
        org.junit.Assert.assertNotNull(zonedDateTime53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(zoneId56);
        org.junit.Assert.assertNotNull(zonedDateTime57);
        org.junit.Assert.assertNotNull(clock58);
        org.junit.Assert.assertNotNull(offsetDateTime59);
// flaky:         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 709000000 + "'", int60 == 709000000);
        org.junit.Assert.assertNotNull(zoneId61);
        org.junit.Assert.assertNotNull(zonedDateTime62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(zoneId65);
        org.junit.Assert.assertNotNull(zonedDateTime66);
        org.junit.Assert.assertNotNull(clock67);
        org.junit.Assert.assertNotNull(offsetDateTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 38 + "'", int70 == 38);
        org.junit.Assert.assertNotNull(zoneId71);
        org.junit.Assert.assertNotNull(zonedDateTime72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(zoneId75);
        org.junit.Assert.assertNotNull(zonedDateTime76);
        org.junit.Assert.assertNotNull(clock77);
        org.junit.Assert.assertNotNull(offsetDateTime78);
// flaky:         org.junit.Assert.assertTrue("'" + int79 + "' != '" + 709000000 + "'", int79 == 709000000);
        org.junit.Assert.assertNotNull(zoneId80);
        org.junit.Assert.assertNotNull(zonedDateTime81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(zoneId84);
        org.junit.Assert.assertNotNull(zonedDateTime85);
        org.junit.Assert.assertNotNull(clock86);
        org.junit.Assert.assertNotNull(offsetDateTime87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int89 + "' != '" + 38 + "'", int89 == 38);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 52 + "'", int91 == 52);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = java.time.ZonedDateTime.now(zoneId4);
        boolean boolean7 = zonedDateTime5.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime9 = zonedDateTime5.withZoneSameInstant(zoneId8);
        java.time.Clock clock10 = java.time.Clock.tickMinutes(zoneId8);
        java.time.LocalDate localDate11 = java.time.LocalDate.now(clock10);
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap14 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean15 = temporalAdjusterMap14.isEmpty();
        java.time.LocalTime localTime16 = java.time.LocalTime.now();
        java.time.LocalTime localTime17 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal18 = localTime16.adjustInto((java.time.temporal.Temporal) localTime17);
        java.io.FileNotFoundException fileNotFoundException19 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException19);
        java.lang.String str21 = costException20.getPattern();
        java.io.FileNotFoundException fileNotFoundException23 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException23);
        java.lang.String str25 = costException24.getPattern();
        java.security.InvalidKeyException invalidKeyException26 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException24);
        boolean boolean27 = temporalAdjusterMap14.replace((java.time.temporal.TemporalAdjuster) localTime16, (org.apache.commons.math.MathException) costException20, (org.apache.commons.math.MathException) costException24);
        java.util.Date date31 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        int int32 = date31.getYear();
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap35 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean36 = temporalAdjusterMap35.isEmpty();
        java.time.LocalTime localTime37 = java.time.LocalTime.now();
        java.time.LocalTime localTime38 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal39 = localTime37.adjustInto((java.time.temporal.Temporal) localTime38);
        java.io.FileNotFoundException fileNotFoundException40 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException41 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException40);
        java.lang.String str42 = costException41.getPattern();
        java.io.FileNotFoundException fileNotFoundException44 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException44);
        java.lang.String str46 = costException45.getPattern();
        java.security.InvalidKeyException invalidKeyException47 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException45);
        boolean boolean48 = temporalAdjusterMap35.replace((java.time.temporal.TemporalAdjuster) localTime37, (org.apache.commons.math.MathException) costException41, (org.apache.commons.math.MathException) costException45);
        org.apache.commons.math.MathException mathException49 = temporalAdjusterMap14.getOrDefault((java.lang.Object) date31, (org.apache.commons.math.MathException) costException45);
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap52 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean53 = temporalAdjusterMap52.isEmpty();
        java.time.LocalTime localTime54 = java.time.LocalTime.now();
        java.time.LocalTime localTime55 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal56 = localTime54.adjustInto((java.time.temporal.Temporal) localTime55);
        java.io.FileNotFoundException fileNotFoundException57 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException58 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException57);
        java.lang.String str59 = costException58.getPattern();
        java.io.FileNotFoundException fileNotFoundException61 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException62 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException61);
        java.lang.String str63 = costException62.getPattern();
        java.security.InvalidKeyException invalidKeyException64 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException62);
        boolean boolean65 = temporalAdjusterMap52.replace((java.time.temporal.TemporalAdjuster) localTime54, (org.apache.commons.math.MathException) costException58, (org.apache.commons.math.MathException) costException62);
        java.util.Date date69 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        int int70 = date69.getYear();
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap73 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean74 = temporalAdjusterMap73.isEmpty();
        java.time.LocalTime localTime75 = java.time.LocalTime.now();
        java.time.LocalTime localTime76 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal77 = localTime75.adjustInto((java.time.temporal.Temporal) localTime76);
        java.io.FileNotFoundException fileNotFoundException78 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException79 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException78);
        java.lang.String str80 = costException79.getPattern();
        java.io.FileNotFoundException fileNotFoundException82 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException83 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException82);
        java.lang.String str84 = costException83.getPattern();
        java.security.InvalidKeyException invalidKeyException85 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException83);
        boolean boolean86 = temporalAdjusterMap73.replace((java.time.temporal.TemporalAdjuster) localTime75, (org.apache.commons.math.MathException) costException79, (org.apache.commons.math.MathException) costException83);
        org.apache.commons.math.MathException mathException87 = temporalAdjusterMap52.getOrDefault((java.lang.Object) date69, (org.apache.commons.math.MathException) costException83);
        boolean boolean88 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localDate11, (org.apache.commons.math.MathException) costException45, (org.apache.commons.math.MathException) costException83);
        int int89 = localDate11.getMonthValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(clock10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(temporal18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(temporal39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(mathException49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(temporal56);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals(date69.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(temporal77);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(mathException87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.util.DoubleSummaryStatistics doubleSummaryStatistics0 = new java.util.DoubleSummaryStatistics();
        long long1 = doubleSummaryStatistics0.getCount();
        double double2 = doubleSummaryStatistics0.getSum();
        org.junit.Assert.assertEquals(doubleSummaryStatistics0.toString(), "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now(zoneId4);
        int int8 = offsetDateTime7.getNano();
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime7.withNano((int) '#');
        java.time.ZoneId zoneId11 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.now(zoneId11);
        boolean boolean14 = zonedDateTime12.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId15 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime16 = zonedDateTime12.withZoneSameInstant(zoneId15);
        java.time.Clock clock17 = java.time.Clock.tickMinutes(zoneId15);
        java.time.OffsetDateTime offsetDateTime18 = java.time.OffsetDateTime.now(zoneId15);
        int int19 = offsetDateTime18.getNano();
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime21 = java.time.ZonedDateTime.now(zoneId20);
        boolean boolean23 = zonedDateTime21.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId24 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime25 = zonedDateTime21.withZoneSameInstant(zoneId24);
        java.time.Clock clock26 = java.time.Clock.tickMinutes(zoneId24);
        java.time.OffsetDateTime offsetDateTime27 = java.time.OffsetDateTime.now(zoneId24);
        boolean boolean28 = offsetDateTime18.isBefore(offsetDateTime27);
        int int29 = offsetDateTime27.getSecond();
        boolean boolean30 = offsetDateTime7.isAfter(offsetDateTime27);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 892000000 + "'", int8 == 892000000);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(clock17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 892000000 + "'", int19 == 892000000);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(clock26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 38 + "'", int29 == 38);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        boolean boolean7 = localDateTime1.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime9 = localDateTime1.withDayOfYear(628000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 628000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.time.Duration duration1 = java.time.Duration.ofMillis((long) 984000000);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localDateTime1.query(booleanTemporalQuery3);
        java.time.chrono.Chronology chronology5 = localDateTime1.getChronology();
        int int6 = isoChronology0.compareTo(chronology5);
        java.time.chrono.IsoChronology isoChronology7 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra9 = isoChronology7.eraOf((int) (byte) 0);
        java.time.format.TextStyle textStyle10 = java.time.format.TextStyle.FULL_STANDALONE;
        java.time.format.TextStyle textStyle11 = textStyle10.asNormal();
        java.util.Locale locale12 = java.util.Locale.JAPAN;
        java.lang.String str13 = isoEra9.getDisplayName(textStyle10, locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate17 = isoChronology0.date((java.time.chrono.Era) isoEra9, 28, 948000000, 42);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 948000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(isoChronology7);
        org.junit.Assert.assertTrue("'" + isoEra9 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra9.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.FULL_STANDALONE + "'", textStyle10.equals(java.time.format.TextStyle.FULL_STANDALONE));
        org.junit.Assert.assertTrue("'" + textStyle11 + "' != '" + java.time.format.TextStyle.FULL + "'", textStyle11.equals(java.time.format.TextStyle.FULL));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        java.time.Month month5 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery6 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean7 = zonedDateTime1.query(booleanTemporalQuery6);
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.now(zoneId8);
        boolean boolean11 = zonedDateTime9.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId12 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime9.withZoneSameInstant(zoneId12);
        java.time.Clock clock14 = java.time.Clock.tickMinutes(zoneId12);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now(zoneId12);
        java.time.Instant instant16 = offsetDateTime15.toInstant();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime17);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        long long20 = localDateTime17.toEpochSecond(zoneOffset19);
        java.time.Clock clock21 = java.time.Clock.fixed(instant16, (java.time.ZoneId) zoneOffset19);
        java.time.ZonedDateTime zonedDateTime22 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) instant16);
        long long23 = zonedDateTime1.toEpochSecond();
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(clock14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-31557014135596800L) + "'", long20 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1645435299L + "'", long23 == 1645435299L);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
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
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.time.LocalTime localTime0 = java.time.LocalTime.MIN;
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.AMPM_OF_DAY;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.AMPM_OF_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.AMPM_OF_DAY));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.time.LocalDate localDate2 = java.time.LocalDate.now();
        int int3 = localDate2.getDayOfYear();
        java.lang.String str4 = localDate2.toString();
        int int5 = localDate2.getDayOfMonth();
        java.time.LocalTime localTime7 = java.time.LocalTime.ofNanoOfDay(0L);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int10 = localDateTime8.get((java.time.temporal.TemporalField) chronoField9);
        java.time.ZoneId zoneId11 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.now(zoneId11);
        boolean boolean14 = zonedDateTime12.equals((java.lang.Object) 10);
        java.time.LocalTime localTime15 = zonedDateTime12.toLocalTime();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime16);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.UTC;
        long long19 = localDateTime16.toEpochSecond(zoneOffset18);
        java.time.OffsetTime offsetTime20 = localTime15.atOffset(zoneOffset18);
        java.time.OffsetDateTime offsetDateTime21 = java.time.OffsetDateTime.of(localDateTime8, zoneOffset18);
        java.time.ZonedDateTime zonedDateTime22 = java.time.ZonedDateTime.of(localDate2, localTime7, (java.time.ZoneId) zoneOffset18);
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int25 = localDateTime23.get((java.time.temporal.TemporalField) chronoField24);
        java.time.ZoneId zoneId26 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.now(zoneId26);
        boolean boolean29 = zonedDateTime27.equals((java.lang.Object) 10);
        java.time.LocalTime localTime30 = zonedDateTime27.toLocalTime();
        java.time.LocalDateTime localDateTime31 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime32 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime31);
        java.time.ZoneOffset zoneOffset33 = java.time.ZoneOffset.UTC;
        long long34 = localDateTime31.toEpochSecond(zoneOffset33);
        java.time.OffsetTime offsetTime35 = localTime30.atOffset(zoneOffset33);
        java.time.OffsetDateTime offsetDateTime36 = java.time.OffsetDateTime.of(localDateTime23, zoneOffset33);
        int int37 = zoneOffset18.compareTo(zoneOffset33);
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.ofEpochSecond((long) 576000000, 361000000, zoneOffset18);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-21" + "'", str4, "2022-02-21");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField9.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-31557014135596800L) + "'", long19 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField24.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-31557014135596800L) + "'", long34 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime35);
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime38);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.util.function.LongUnaryOperator longUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream2 = java.util.stream.LongStream.iterate((long) 100, longUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.LocalDate localDate2 = isoChronology0.dateEpochDay((long) (byte) 0);
        java.lang.String str3 = isoChronology0.toString();
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISO" + "'", str3, "ISO");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        boolean boolean7 = localDateTime1.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime5);
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        int int9 = localDateTime5.get((java.time.temporal.TemporalField) chronoField8);
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap12 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean13 = temporalAdjusterMap12.isEmpty();
        java.time.LocalTime localTime14 = java.time.LocalTime.now();
        java.time.LocalTime localTime15 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal16 = localTime14.adjustInto((java.time.temporal.Temporal) localTime15);
        java.io.FileNotFoundException fileNotFoundException17 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException17);
        java.lang.String str19 = costException18.getPattern();
        java.io.FileNotFoundException fileNotFoundException21 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException22 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException21);
        java.lang.String str23 = costException22.getPattern();
        java.security.InvalidKeyException invalidKeyException24 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException22);
        boolean boolean25 = temporalAdjusterMap12.replace((java.time.temporal.TemporalAdjuster) localTime14, (org.apache.commons.math.MathException) costException18, (org.apache.commons.math.MathException) costException22);
        java.util.Date date29 = new java.util.Date((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        int int30 = date29.getYear();
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap33 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean34 = temporalAdjusterMap33.isEmpty();
        java.time.LocalTime localTime35 = java.time.LocalTime.now();
        java.time.LocalTime localTime36 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal37 = localTime35.adjustInto((java.time.temporal.Temporal) localTime36);
        java.io.FileNotFoundException fileNotFoundException38 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException39 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException38);
        java.lang.String str40 = costException39.getPattern();
        java.io.FileNotFoundException fileNotFoundException42 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException43 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException42);
        java.lang.String str44 = costException43.getPattern();
        java.security.InvalidKeyException invalidKeyException45 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException43);
        boolean boolean46 = temporalAdjusterMap33.replace((java.time.temporal.TemporalAdjuster) localTime35, (org.apache.commons.math.MathException) costException39, (org.apache.commons.math.MathException) costException43);
        org.apache.commons.math.MathException mathException47 = temporalAdjusterMap12.getOrDefault((java.lang.Object) date29, (org.apache.commons.math.MathException) costException43);
        java.util.Enumeration<java.time.temporal.TemporalAdjuster> temporalAdjusterEnumeration48 = temporalAdjusterMap12.keys();
        java.time.ZoneId zoneId49 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime50 = java.time.ZonedDateTime.now(zoneId49);
        boolean boolean52 = zonedDateTime50.equals((java.lang.Object) 10);
        java.time.LocalTime localTime53 = zonedDateTime50.toLocalTime();
        java.time.ZonedDateTime zonedDateTime55 = zonedDateTime50.minusMonths((long) '#');
        boolean boolean56 = temporalAdjusterMap12.containsValue((java.lang.Object) zonedDateTime50);
        boolean boolean57 = chronoField8.isSupportedBy((java.time.temporal.TemporalAccessor) zonedDateTime50);
        java.time.ZonedDateTime zonedDateTime59 = zonedDateTime50.minusSeconds((long) 2);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField8.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(temporal16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Feb 08 00:00:00 UTC 1901");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(temporal37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(mathException47);
        org.junit.Assert.assertNotNull(temporalAdjusterEnumeration48);
        org.junit.Assert.assertNotNull(zoneId49);
        org.junit.Assert.assertNotNull(zonedDateTime50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(zonedDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(zonedDateTime59);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        java.time.Month month5 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime1);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = java.time.ZonedDateTime.now(zoneId6);
        boolean boolean9 = zonedDateTime7.equals((java.lang.Object) 10);
        java.time.LocalTime localTime10 = zonedDateTime7.toLocalTime();
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime7.minusMonths((long) '#');
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime7.plusDays((long) '4');
        boolean boolean15 = zonedDateTime1.isEqual((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime14);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime1 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime0);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery2 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean3 = localDateTime0.query(booleanTemporalQuery2);
        java.time.chrono.Chronology chronology4 = localDateTime0.getChronology();
        java.time.chrono.IsoChronology isoChronology5 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.chrono.IsoEra isoEra7 = isoChronology5.eraOf((int) (byte) 0);
        int int8 = chronology4.compareTo((java.time.chrono.Chronology) isoChronology5);
        java.time.LocalDate localDate9 = java.time.LocalDate.now();
        int int10 = localDate9.getDayOfYear();
        java.lang.String str11 = localDate9.toString();
        int int12 = localDate9.getDayOfMonth();
        java.time.LocalTime localTime14 = java.time.LocalTime.ofNanoOfDay(0L);
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int17 = localDateTime15.get((java.time.temporal.TemporalField) chronoField16);
        java.time.ZoneId zoneId18 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime19 = java.time.ZonedDateTime.now(zoneId18);
        boolean boolean21 = zonedDateTime19.equals((java.lang.Object) 10);
        java.time.LocalTime localTime22 = zonedDateTime19.toLocalTime();
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime23);
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        long long26 = localDateTime23.toEpochSecond(zoneOffset25);
        java.time.OffsetTime offsetTime27 = localTime22.atOffset(zoneOffset25);
        java.time.OffsetDateTime offsetDateTime28 = java.time.OffsetDateTime.of(localDateTime15, zoneOffset25);
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.of(localDate9, localTime14, (java.time.ZoneId) zoneOffset25);
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int32 = localDateTime30.get((java.time.temporal.TemporalField) chronoField31);
        java.time.ZoneId zoneId33 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime34 = java.time.ZonedDateTime.now(zoneId33);
        boolean boolean36 = zonedDateTime34.equals((java.lang.Object) 10);
        java.time.LocalTime localTime37 = zonedDateTime34.toLocalTime();
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime39 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime38);
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.UTC;
        long long41 = localDateTime38.toEpochSecond(zoneOffset40);
        java.time.OffsetTime offsetTime42 = localTime37.atOffset(zoneOffset40);
        java.time.OffsetDateTime offsetDateTime43 = java.time.OffsetDateTime.of(localDateTime30, zoneOffset40);
        int int44 = zoneOffset25.compareTo(zoneOffset40);
        java.time.chrono.ChronoLocalDate chronoLocalDate45 = isoChronology5.dateNow((java.time.ZoneId) zoneOffset40);
        java.time.chrono.IsoEra isoEra47 = java.time.chrono.IsoEra.of(0);
        java.time.temporal.ChronoField chronoField48 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        boolean boolean49 = isoEra47.isSupported((java.time.temporal.TemporalField) chronoField48);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate53 = isoChronology5.date((java.time.chrono.Era) isoEra47, 196000000, 44, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 44");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(booleanTemporalQuery2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(isoChronology5);
        org.junit.Assert.assertTrue("'" + isoEra7 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra7.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-02-21" + "'", str11, "2022-02-21");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField16.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-31557014135596800L) + "'", long26 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime27);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField31.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-31557014135596800L) + "'", long41 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime42);
        org.junit.Assert.assertNotNull(offsetDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(chronoLocalDate45);
        org.junit.Assert.assertTrue("'" + isoEra47 + "' != '" + java.time.chrono.IsoEra.BCE + "'", isoEra47.equals(java.time.chrono.IsoEra.BCE));
        org.junit.Assert.assertTrue("'" + chronoField48 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField48.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        java.lang.String str6 = file2.getPath();
        boolean boolean7 = file2.exists();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.util.stream.IntStream intStream0 = java.util.stream.IntStream.empty();
        java.util.stream.IntStream intStream2 = intStream0.skip((long) 16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt3 = intStream0.max();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream0);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime4);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery6 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean7 = localDateTime4.query(booleanTemporalQuery6);
        java.time.DayOfWeek dayOfWeek8 = localDateTime4.getDayOfWeek();
        java.time.chrono.IsoChronology isoChronology9 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime10);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery12 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean13 = localDateTime10.query(booleanTemporalQuery12);
        java.time.chrono.Chronology chronology14 = localDateTime10.getChronology();
        int int15 = isoChronology9.compareTo(chronology14);
        boolean boolean16 = temporalAdjusterMap2.remove((java.lang.Object) dayOfWeek8, (java.lang.Object) chronology14);
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime17);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        long long20 = localDateTime17.toEpochSecond(zoneOffset19);
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int23 = localDateTime21.get((java.time.temporal.TemporalField) chronoField22);
        java.time.temporal.Temporal temporal24 = localDateTime17.adjustInto((java.time.temporal.Temporal) localDateTime21);
        java.time.ZoneId zoneId25 = java.time.ZoneId.systemDefault();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime26 = localDateTime21.atZone(zoneId25);
        int int27 = localDateTime21.getMinute();
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale29 = java.util.Locale.US;
        java.lang.String str30 = chronoField28.getDisplayName(locale29);
        java.time.LocalDateTime localDateTime32 = localDateTime21.with((java.time.temporal.TemporalField) chronoField28, (long) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = dayOfWeek8.getLong((java.time.temporal.TemporalField) chronoField28);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MilliOfSecond");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(booleanTemporalQuery6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertTrue("'" + dayOfWeek8 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek8.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertNotNull(isoChronology9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(booleanTemporalQuery12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-31557014135596800L) + "'", long20 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField22.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(temporal24);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField28.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MilliOfSecond" + "'", str30, "MilliOfSecond");
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime1 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime0);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery2 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean3 = localDateTime0.query(booleanTemporalQuery2);
        java.time.DayOfWeek dayOfWeek4 = localDateTime0.getDayOfWeek();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        int int6 = localDateTime0.get((java.time.temporal.TemporalField) chronoField5);
        java.time.temporal.TemporalUnit temporalUnit7 = null;
        boolean boolean8 = localDateTime0.isSupported(temporalUnit7);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(booleanTemporalQuery2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + dayOfWeek4 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek4.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField5.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        char[] charArray3 = new char[] { ' ', '4', ':' };
        java.nio.CharBuffer charBuffer4 = java.nio.CharBuffer.wrap(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " 4:");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " 4:");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , 4, :]");
        org.junit.Assert.assertNotNull(charBuffer4);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        java.time.Month month5 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery6 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean7 = zonedDateTime1.query(booleanTemporalQuery6);
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.now(zoneId8);
        boolean boolean11 = zonedDateTime9.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId12 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime9.withZoneSameInstant(zoneId12);
        java.time.Clock clock14 = java.time.Clock.tickMinutes(zoneId12);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now(zoneId12);
        java.time.Instant instant16 = offsetDateTime15.toInstant();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime17);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        long long20 = localDateTime17.toEpochSecond(zoneOffset19);
        java.time.Clock clock21 = java.time.Clock.fixed(instant16, (java.time.ZoneId) zoneOffset19);
        java.time.ZonedDateTime zonedDateTime22 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) instant16);
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.HOUR_OF_AMPM;
        long long24 = zonedDateTime22.getLong((java.time.temporal.TemporalField) chronoField23);
        java.time.ZonedDateTime zonedDateTime26 = zonedDateTime22.plusHours((long) 21);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(clock14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-31557014135596800L) + "'", long20 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_AMPM + "'", chronoField23.equals(java.time.temporal.ChronoField.HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(zonedDateTime26);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray6);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer7.put(byteArray11, 708000000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, -1, 1, 10]");
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1, 100]");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        int int1 = localDate0.lengthOfMonth();
        java.time.ZoneId zoneId2 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(zoneId2);
        boolean boolean5 = zonedDateTime3.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId6 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime7 = zonedDateTime3.withZoneSameInstant(zoneId6);
        java.time.Clock clock8 = java.time.Clock.tickMinutes(zoneId6);
        java.time.LocalDate localDate9 = java.time.LocalDate.now(clock8);
        java.time.Period period10 = localDate0.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.LocalDate localDate11 = java.time.LocalDate.now();
        int int12 = localDate11.lengthOfMonth();
        java.time.ZoneId zoneId13 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.now(zoneId13);
        boolean boolean16 = zonedDateTime14.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime14.withZoneSameInstant(zoneId17);
        java.time.Clock clock19 = java.time.Clock.tickMinutes(zoneId17);
        java.time.LocalDate localDate20 = java.time.LocalDate.now(clock19);
        java.time.Period period21 = localDate11.until((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.chrono.ChronoPeriod chronoPeriod22 = period10.minus((java.time.temporal.TemporalAmount) period21);
        java.time.Period period24 = period21.minusYears((long) (short) 0);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList25 = period24.getUnits();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zonedDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertNotNull(clock8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(clock19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(chronoPeriod22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(temporalUnitList25);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) 33, (long) 44);
        java.util.stream.LongStream longStream3 = longStream2.parallel();
        java.util.function.LongConsumer longConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            longStream3.forEach(longConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.time.Month month0 = java.time.Month.MAY;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = month0.range((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MilliOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.MAY + "'", month0.equals(java.time.Month.MAY));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        double[] doubleArray2 = new double[] { (short) 0, 1L };
        java.util.stream.DoubleStream doubleStream3 = java.util.stream.DoubleStream.of(doubleArray2);
        java.util.stream.DoubleStream doubleStream4 = doubleStream3.parallel();
        double double5 = doubleStream4.sum();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble6 = doubleStream4.average();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.io.IOException iOException0 = new java.io.IOException();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (short) 0);
        java.nio.CharBuffer charBuffer2 = charBuffer1.duplicate();
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(charBuffer2);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.text.ParseException parseException3 = new java.text.ParseException("", 52);
        java.security.InvalidKeyException invalidKeyException4 = new java.security.InvalidKeyException("en", (java.lang.Throwable) parseException3);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime3 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime2);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery4 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean5 = localDateTime2.query(booleanTemporalQuery4);
        java.text.Format format6 = dateTimeFormatter1.toFormat(booleanTemporalQuery4);
        java.time.format.ResolverStyle resolverStyle7 = java.time.format.ResolverStyle.LENIENT;
        java.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter1.withResolverStyle(resolverStyle7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate9 = java.time.LocalDate.parse((java.lang.CharSequence) "", dateTimeFormatter8);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(booleanTemporalQuery4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertTrue("'" + resolverStyle7 + "' != '" + java.time.format.ResolverStyle.LENIENT + "'", resolverStyle7.equals(java.time.format.ResolverStyle.LENIENT));
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId4 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime5 = zonedDateTime1.withZoneSameInstant(zoneId4);
        java.time.Clock clock6 = java.time.Clock.tickMinutes(zoneId4);
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now(clock6);
        long long8 = clock6.millis();
        java.time.Instant instant9 = clock6.instant();
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
        org.junit.Assert.assertNotNull(clock6);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1645435260000L + "'", long8 == 1645435260000L);
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        long long17 = localTime4.getLong((java.time.temporal.TemporalField) chronoField16);
        java.time.temporal.TemporalUnit temporalUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime20 = localTime4.plus((long) 998000000, temporalUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField16.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 397000L + "'", long17 == 397000L);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("MilliOfSecond");
        char[] charArray3 = new char[] { 'a' };
        printWriter1.write(charArray3);
        printWriter1.print(38);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a]");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        boolean boolean1 = charset0.isRegistered();
        java.lang.String str2 = charset0.toString();
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US-ASCII" + "'", str2, "US-ASCII");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.time.Month month0 = java.time.Month.DECEMBER;
        java.time.Month month1 = month0.firstMonthOfQuarter();
        int int2 = month1.getValue();
        java.time.Month month3 = month1.firstMonthOfQuarter();
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.DECEMBER + "'", month0.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.OCTOBER + "'", month1.equals(java.time.Month.OCTOBER));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + month3 + "' != '" + java.time.Month.OCTOBER + "'", month3.equals(java.time.Month.OCTOBER));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("MilliOfSecond");
        printWriter1.flush();
        printWriter1.write(6000);
        java.time.format.DateTimeFormatter dateTimeFormatter6 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime7);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery9 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean10 = localDateTime7.query(booleanTemporalQuery9);
        java.text.Format format11 = dateTimeFormatter6.toFormat(booleanTemporalQuery9);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = chronoField12.getDisplayName(locale13);
        java.time.temporal.ChronoField chronoField15 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId17 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime18 = java.time.ZonedDateTime.now(zoneId17);
        boolean boolean20 = zonedDateTime18.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId21 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime22 = zonedDateTime18.withZoneSameInstant(zoneId21);
        java.time.Clock clock23 = java.time.Clock.tickMinutes(zoneId21);
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.now(clock23);
        long long25 = chronoField16.getFrom((java.time.temporal.TemporalAccessor) localDateTime24);
        java.time.temporal.TemporalField[] temporalFieldArray26 = new java.time.temporal.TemporalField[] { chronoField12, chronoField15, chronoField16 };
        java.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter6.withResolverFields(temporalFieldArray26);
        java.io.PrintWriter printWriter28 = printWriter1.printf("09:21:36.048Z", (java.lang.Object[]) temporalFieldArray26);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(booleanTemporalQuery9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNotNull(format11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField12.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MilliOfSecond" + "'", str14, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + chronoField15 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField15.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField16.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(clock23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(printWriter28);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.LocalTime localTime14 = zonedDateTime11.toLocalTime();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        long long18 = localDateTime15.toEpochSecond(zoneOffset17);
        java.time.OffsetTime offsetTime19 = localTime14.atOffset(zoneOffset17);
        java.time.OffsetTime offsetTime20 = offsetTime9.withOffsetSameInstant(zoneOffset17);
        java.time.ZoneId zoneId21 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime22 = java.time.ZonedDateTime.now(zoneId21);
        boolean boolean24 = zonedDateTime22.equals((java.lang.Object) 10);
        java.time.LocalTime localTime25 = zonedDateTime22.toLocalTime();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime26);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.UTC;
        long long29 = localDateTime26.toEpochSecond(zoneOffset28);
        java.time.OffsetTime offsetTime30 = localTime25.atOffset(zoneOffset28);
        java.time.ZoneId zoneId31 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.now(zoneId31);
        boolean boolean34 = zonedDateTime32.equals((java.lang.Object) 10);
        java.time.LocalTime localTime35 = zonedDateTime32.toLocalTime();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime37 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime36);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        long long39 = localDateTime36.toEpochSecond(zoneOffset38);
        java.time.OffsetTime offsetTime40 = localTime35.atOffset(zoneOffset38);
        java.time.OffsetTime offsetTime41 = offsetTime30.withOffsetSameInstant(zoneOffset38);
        boolean boolean42 = offsetTime20.isEqual(offsetTime41);
        java.time.ZoneOffset zoneOffset43 = offsetTime41.getOffset();
        java.time.format.DateTimeFormatter dateTimeFormatter44 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime45 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime46 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime45);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery47 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean48 = localDateTime45.query(booleanTemporalQuery47);
        java.text.Format format49 = dateTimeFormatter44.toFormat(booleanTemporalQuery47);
        java.time.temporal.ChronoField chronoField50 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale51 = java.util.Locale.US;
        java.lang.String str52 = chronoField50.getDisplayName(locale51);
        java.time.temporal.ChronoField chronoField53 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        java.time.temporal.ChronoField chronoField54 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        java.time.ZoneId zoneId55 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime56 = java.time.ZonedDateTime.now(zoneId55);
        boolean boolean58 = zonedDateTime56.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId59 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime60 = zonedDateTime56.withZoneSameInstant(zoneId59);
        java.time.Clock clock61 = java.time.Clock.tickMinutes(zoneId59);
        java.time.LocalDateTime localDateTime62 = java.time.LocalDateTime.now(clock61);
        long long63 = chronoField54.getFrom((java.time.temporal.TemporalAccessor) localDateTime62);
        java.time.temporal.TemporalField[] temporalFieldArray64 = new java.time.temporal.TemporalField[] { chronoField50, chronoField53, chronoField54 };
        java.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter44.withResolverFields(temporalFieldArray64);
        java.lang.String str66 = offsetTime41.format(dateTimeFormatter65);
        java.lang.String str67 = dateTimeFormatter65.toString();
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-31557014135596800L) + "'", long18 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-31557014135596800L) + "'", long29 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime30);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-31557014135596800L) + "'", long39 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(offsetTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(booleanTemporalQuery47);
        org.junit.Assert.assertEquals("'" + boolean48 + "' != '" + false + "'", boolean48, false);
        org.junit.Assert.assertNotNull(format49);
        org.junit.Assert.assertTrue("'" + chronoField50 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField50.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "MilliOfSecond" + "'", str52, "MilliOfSecond");
        org.junit.Assert.assertTrue("'" + chronoField53 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR + "'", chronoField53.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        org.junit.Assert.assertTrue("'" + chronoField54 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField54.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertNotNull(zoneId55);
        org.junit.Assert.assertNotNull(zonedDateTime56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(zoneId59);
        org.junit.Assert.assertNotNull(zonedDateTime60);
        org.junit.Assert.assertNotNull(clock61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(temporalFieldArray64);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "09:21:40.442Z" + "'", str66, "09:21:40.442Z");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ParseCaseSensitive(false)(Value(HourOfDay,2)':'Value(MinuteOfHour,2)[':'Value(SecondOfMinute,2)[Fraction(NanoOfSecond,0,9,DecimalPoint)]])Offset(+HH:MM:ss,'Z')" + "'", str67, "ParseCaseSensitive(false)(Value(HourOfDay,2)':'Value(MinuteOfHour,2)[':'Value(SecondOfMinute,2)[Fraction(NanoOfSecond,0,9,DecimalPoint)]])Offset(+HH:MM:ss,'Z')");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException> temporalAdjusterMap2 = new java.util.Hashtable<java.time.temporal.TemporalAdjuster, org.apache.commons.math.MathException>((int) '#', (float) 100);
        boolean boolean3 = temporalAdjusterMap2.isEmpty();
        java.time.LocalTime localTime4 = java.time.LocalTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.now();
        java.time.temporal.Temporal temporal6 = localTime4.adjustInto((java.time.temporal.Temporal) localTime5);
        java.io.FileNotFoundException fileNotFoundException7 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException7);
        java.lang.String str9 = costException8.getPattern();
        java.io.FileNotFoundException fileNotFoundException11 = new java.io.FileNotFoundException();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) fileNotFoundException11);
        java.lang.String str13 = costException12.getPattern();
        java.security.InvalidKeyException invalidKeyException14 = new java.security.InvalidKeyException("hi!", (java.lang.Throwable) costException12);
        boolean boolean15 = temporalAdjusterMap2.replace((java.time.temporal.TemporalAdjuster) localTime4, (org.apache.commons.math.MathException) costException8, (org.apache.commons.math.MathException) costException12);
        java.time.ZoneId zoneId16 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime17 = java.time.ZonedDateTime.now(zoneId16);
        boolean boolean19 = zonedDateTime17.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId20 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime21 = zonedDateTime17.withZoneSameInstant(zoneId20);
        java.time.Clock clock22 = java.time.Clock.tickMinutes(zoneId20);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.now(zoneId20);
        int int24 = offsetDateTime23.getNano();
        java.time.ZoneId zoneId25 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.now(zoneId25);
        boolean boolean28 = zonedDateTime26.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId29 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime26.withZoneSameInstant(zoneId29);
        java.time.Clock clock31 = java.time.Clock.tickMinutes(zoneId29);
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.now(zoneId29);
        boolean boolean33 = offsetDateTime23.isBefore(offsetDateTime32);
        int int34 = offsetDateTime23.getDayOfYear();
        java.security.cert.CertificateException certificateException35 = new java.security.cert.CertificateException();
        boolean boolean36 = temporalAdjusterMap2.remove((java.lang.Object) offsetDateTime23, (java.lang.Object) certificateException35);
        java.time.ZoneId zoneId37 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime38 = java.time.ZonedDateTime.now(zoneId37);
        boolean boolean40 = zonedDateTime38.equals((java.lang.Object) 10);
        java.time.LocalTime localTime41 = zonedDateTime38.toLocalTime();
        java.time.LocalDateTime localDateTime42 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime43 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime42);
        java.time.ZoneOffset zoneOffset44 = java.time.ZoneOffset.UTC;
        long long45 = localDateTime42.toEpochSecond(zoneOffset44);
        java.time.OffsetTime offsetTime46 = localTime41.atOffset(zoneOffset44);
        java.time.ZoneId zoneId47 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime48 = java.time.ZonedDateTime.now(zoneId47);
        boolean boolean50 = zonedDateTime48.equals((java.lang.Object) 10);
        java.time.LocalTime localTime51 = zonedDateTime48.toLocalTime();
        java.time.LocalDateTime localDateTime52 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime53 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime52);
        java.time.ZoneOffset zoneOffset54 = java.time.ZoneOffset.UTC;
        long long55 = localDateTime52.toEpochSecond(zoneOffset54);
        java.time.OffsetTime offsetTime56 = localTime51.atOffset(zoneOffset54);
        java.time.OffsetTime offsetTime57 = offsetTime46.withOffsetSameInstant(zoneOffset54);
        java.time.OffsetDateTime offsetDateTime58 = offsetDateTime23.withOffsetSameInstant(zoneOffset54);
        java.time.LocalDateTime localDateTime59 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset54);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(temporal6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 478000000 + "'", int24 == 478000000);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(clock31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(zoneOffset44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-31557014135596800L) + "'", long45 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime46);
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertNotNull(zonedDateTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(zoneOffset54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-31557014135596800L) + "'", long55 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime56);
        org.junit.Assert.assertNotNull(offsetTime57);
        org.junit.Assert.assertNotNull(offsetDateTime58);
        org.junit.Assert.assertNotNull(localDateTime59);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        int int2 = zonedDateTime1.getSecond();
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime4 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) zoneOffset3);
        java.time.Month month5 = java.time.Month.from((java.time.temporal.TemporalAccessor) zonedDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery6 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean7 = zonedDateTime1.query(booleanTemporalQuery6);
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.now(zoneId8);
        boolean boolean11 = zonedDateTime9.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId12 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime9.withZoneSameInstant(zoneId12);
        java.time.Clock clock14 = java.time.Clock.tickMinutes(zoneId12);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.now(zoneId12);
        java.time.Instant instant16 = offsetDateTime15.toInstant();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime17);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        long long20 = localDateTime17.toEpochSecond(zoneOffset19);
        java.time.Clock clock21 = java.time.Clock.fixed(instant16, (java.time.ZoneId) zoneOffset19);
        java.time.ZonedDateTime zonedDateTime22 = zonedDateTime1.with((java.time.temporal.TemporalAdjuster) instant16);
        java.time.ZonedDateTime zonedDateTime24 = zonedDateTime22.plusSeconds((long) (byte) 1);
        java.time.ZonedDateTime zonedDateTime26 = zonedDateTime24.minusYears((long) '\uffff');
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime4);
        org.junit.Assert.assertTrue("'" + month5 + "' != '" + java.time.Month.FEBRUARY + "'", month5.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(clock14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-31557014135596800L) + "'", long20 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertNotNull(zonedDateTime26);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.time.LocalDate localDate2 = java.time.LocalDate.ofYearDay(196000000, 20);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Iterator<java.lang.String> strItor7 = strSet5.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction8 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean9 = strSet5.equals((java.lang.Object) codingErrorAction8);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet5);
        boolean boolean12 = strList10.equals((java.lang.Object) "MilliOfSecond");
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.Iterator<java.lang.String> strItor20 = strSet18.iterator();
        java.nio.charset.CodingErrorAction codingErrorAction21 = java.nio.charset.CodingErrorAction.REPLACE;
        boolean boolean22 = strSet18.equals((java.lang.Object) codingErrorAction21);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet18);
        boolean boolean24 = strList10.containsAll((java.util.Collection<java.lang.String>) strSet18);
        java.lang.Object[] objArray25 = strSet18.toArray();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(codingErrorAction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(codingErrorAction21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!]");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        boolean boolean7 = localDateTime1.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime5);
        java.time.LocalDateTime localDateTime9 = localDateTime5.withSecond(1);
        java.time.LocalDateTime localDateTime11 = localDateTime9.plusHours((long) 59);
        java.time.ZoneId zoneId12 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime13 = java.time.ZonedDateTime.now(zoneId12);
        boolean boolean15 = zonedDateTime13.equals((java.lang.Object) 10);
        java.time.LocalTime localTime16 = zonedDateTime13.toLocalTime();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime17);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        long long20 = localDateTime17.toEpochSecond(zoneOffset19);
        java.time.OffsetTime offsetTime21 = localTime16.atOffset(zoneOffset19);
        java.time.ZoneId zoneId22 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime23 = java.time.ZonedDateTime.now(zoneId22);
        boolean boolean25 = zonedDateTime23.equals((java.lang.Object) 10);
        java.time.LocalTime localTime26 = zonedDateTime23.toLocalTime();
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime28 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime27);
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.UTC;
        long long30 = localDateTime27.toEpochSecond(zoneOffset29);
        java.time.OffsetTime offsetTime31 = localTime26.atOffset(zoneOffset29);
        java.time.OffsetTime offsetTime32 = offsetTime21.withOffsetSameInstant(zoneOffset29);
        java.time.Instant instant33 = localDateTime11.toInstant(zoneOffset29);
        java.time.temporal.ChronoField chronoField34 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = chronoField34.getDisplayName(locale35);
        java.time.temporal.ValueRange valueRange37 = instant33.range((java.time.temporal.TemporalField) chronoField34);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-31557014135596800L) + "'", long20 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-31557014135596800L) + "'", long30 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(offsetTime32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertTrue("'" + chronoField34 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField34.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MilliOfSecond" + "'", str36, "MilliOfSecond");
        org.junit.Assert.assertNotNull(valueRange37);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MICRO_OF_SECOND;
        int int3 = localDateTime1.get((java.time.temporal.TemporalField) chronoField2);
        int int4 = localDateTime0.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        boolean boolean7 = localDateTime1.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime5);
        int int8 = localDateTime1.getSecond();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_SECOND + "'", chronoField2.equals(java.time.temporal.ChronoField.MICRO_OF_SECOND));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.util.function.DoubleUnaryOperator doubleUnaryOperator1 = java.util.function.DoubleUnaryOperator.identity();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator2 = java.util.function.DoubleUnaryOperator.identity();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator3 = doubleUnaryOperator1.andThen(doubleUnaryOperator2);
        java.util.stream.DoubleStream doubleStream4 = java.util.stream.DoubleStream.iterate((double) 421000000, doubleUnaryOperator1);
        org.junit.Assert.assertNotNull(doubleUnaryOperator1);
        org.junit.Assert.assertNotNull(doubleUnaryOperator2);
        org.junit.Assert.assertNotNull(doubleUnaryOperator3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Spliterator<java.lang.String> strSpliterator2 = strSet1.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator3 = strSpliterator2.trySplit();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSpliterator2);
        org.junit.Assert.assertNull(strSpliterator3);
    }
}
