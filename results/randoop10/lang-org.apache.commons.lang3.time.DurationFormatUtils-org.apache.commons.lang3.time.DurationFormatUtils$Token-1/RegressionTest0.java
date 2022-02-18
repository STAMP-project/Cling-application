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
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2, "P-1Y11M30DT23H59M59.901S");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str1, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 10, "P-1Y11M30DT23H59M59.901S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.90111" + "'", str3, "P-1Y11030DT23059059.90111");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int3 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 10L, "P-1Y11030DT23059059.90111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.90111" + "'", str3, "P-1Y11030DT23059059.90111");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 'a', "P0Y0M0DT0H0M0.000S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeZone0.getOffset((int) (byte) -1, (int) (byte) 100, (int) 'a', 100, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 100L, "P-1Y11030DT23059059.90111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.90111" + "'", str3, "P-1Y11030DT23059059.90111");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 10L, "P-1Y11M30DT23H59M59.901S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.90110" + "'", str3, "P-1Y11030DT23059059.90110");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.035" + "'", str1, "0:00:00.035");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 0L, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str1, "P0Y0M0DT0H0M0.097S");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        int int4 = timeZone2.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.968S" + "'", str2, "P-1Y11M30DT23H59M59.968S");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11M30DT23H59M59.901S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.9011" + "'", str3, "P-1Y11030DT23059059.9011");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.001-1" + "'", str2, "P0Y000DT00000.001-1");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId5 = timeZone0.toZoneId();
// flaky:             org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: ");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        timeZone0.setID("");
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone0.getDisplayName(true, 0, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str0 = org.apache.commons.lang3.time.DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str0, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        java.lang.String str7 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT+00:00" + "'", str7, "GMT+00:00");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.time.ZoneId zoneId0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone(zoneId0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getRawOffset();
        java.lang.String str2 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT+00:00" + "'", str2, "GMT+00:00");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0970" + "'", str2, "P0Y000DT00000.0970");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone.setDefault(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId5 = null; // flaky: timeZone0.toZoneId();
// flaky:             org.junit.Assert.fail("Expected exception of type java.time.zone.ZoneRulesException; message: Unknown time-zone ID: P0Y0M0DT0H0M0.001S");
        } catch (java.time.zone.ZoneRulesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.TimeZone.setDefault(timeZone4);
        int int10 = timeZone4.getOffset((-1L));
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0Y0M0DT0H0M0.000S", true, timeZone4);
        java.lang.String str12 = timeZone4.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0-10DT07430-10.0003599999" + "'", str11, "P0Y0-10DT07430-10.0003599999");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GMT+00:00" + "'", str12, "GMT+00:00");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 10, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.010" + "'", str1, "0:00:00.010");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11030DT23059059.90111", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.90111" + "'", str3, "P-1Y11030DT23059059.90111");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 0L, "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0973599990" + "'", str3, "P0Y0-10DT07430-10.0973599990");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeZone0.getOffset((int) (short) 0, (int) (short) 1, 0, 0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) -1, "", true, timeZone4);
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone4.getDisplayName(locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("GMT+00:00");
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone1.getDisplayName(false, (int) (short) -1, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11030DT23059059.9011", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.9011" + "'", str3, "P-1Y11030DT23059059.9011");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y0M0DT0H0M0.001S" + "'", str3, "P0000Y0M0DT0H0M0.001S");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (-1), false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "P0Y0-10DT07430-10.0003599999");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599999" + "'", str3, "P0Y0-10DT07430-10.0003599999");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset(10);
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = timeZone0.inDaylightTime(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId6 = null; // flaky: timeZone0.toZoneId();
// flaky:             org.junit.Assert.fail("Expected exception of type java.time.zone.ZoneRulesException; message: Unknown time-zone ID: P0Y0M0DT0H0M0.001S");
        } catch (java.time.zone.ZoneRulesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone0.getDisplayName(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        timeZone0.setID("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeZone0.getOffset(0, (int) (byte) 100, (int) (byte) 0, 10, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 100L, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.010" + "'", str1, "0:00:00.010");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        int int8 = timeZone0.getOffset((long) ' ');
        java.lang.String str9 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT+00:00" + "'", str9, "GMT+00:00");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        boolean boolean4 = timeZone2.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset(100);
        java.lang.Class<?> wildcardClass9 = timeZone0.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.010S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010100" + "'", str3, "P0Y000DT00000.010100");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        timeZone0.setID("P0Y0M0DT0H0M0.000S");
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone0.getDisplayName(locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(100);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        int int9 = timeZone0.getOffset((long) ' ');
        int int10 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone.setDefault(timeZone0);
        boolean boolean5 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.001" + "'", str1, "0:00:00.001");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "0 30a059 0 hour 0 1439inute59 0 econ3059", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3, "0 30a059 0 hour 0 1439inute59 0 econ3059");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset(100);
        int int9 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int5 = timeZone4.getRawOffset();
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone4);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone4.getDisplayName(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.035" + "'", str6, "0:00:00.035");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        timeZone0.setID("P0Y0M0DT0H0M0.000S");
        java.lang.String str8 = timeZone0.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId9 = timeZone0.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.zone.ZoneRulesException; message: Unknown time-zone ID: P0Y0M0DT0H0M0.000S");
        } catch (java.time.zone.ZoneRulesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str8, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.000" + "'", str1, "0:00:00.000");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone0.getDisplayName(false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        boolean boolean10 = timeZone0.hasSameRules(timeZone4);
        timeZone4.setID("P0000Y0M0DT0H0M0.001S");
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone4.getDisplayName(true, (int) (short) 100, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId7 = timeZone0.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: ");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.99" + "'", str1, "0:00:00.99");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "0 30a059 0 hour 0 1439inute59 0 econ3059");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str2, "0 30a059 0 hour 0 1439inute59 0 econ3059");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        int int7 = timeZone0.getRawOffset();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone0.getDisplayName(locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone0.getDisplayName(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) -1, "", true, timeZone4);
        java.lang.String str11 = timeZone4.getDisplayName(true, 1);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GMT+00:00" + "'", str11, "GMT+00:00");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getRawOffset();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = timeZone0.inDaylightTime(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.100S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1000" + "'", str3, "P0Y000DT00000.1000");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.lang.Object obj2 = timeZone0.clone();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "sun.util.calendar.ZoneInfo[id=\"\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "sun.util.calendar.ZoneInfo[id=\"\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "sun.util.calendar.ZoneInfo[id=\"\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 1, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = timeZone0.inDaylightTime(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        boolean boolean10 = timeZone0.hasSameRules(timeZone4);
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = timeZone4.inDaylightTime(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.lang.Object obj4 = timeZone2.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "sun.util.calendar.ZoneInfo[id=\"\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "sun.util.calendar.ZoneInfo[id=\"\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "sun.util.calendar.ZoneInfo[id=\"\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((-1L), false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone0.getDisplayName(false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        java.lang.Object obj7 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "sun.util.calendar.ZoneInfo[id=\"\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "sun.util.calendar.ZoneInfo[id=\"\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "sun.util.calendar.ZoneInfo[id=\"\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.lang.Object obj15 = timeZone6.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = timeZone0.inDaylightTime(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11030DT23059059.90111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11030DT23059059.90111" + "'", str2, "P-1Y11030DT23059059.90111");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        timeZone0.setID("P0Y0M0DT0H0M0.000S");
        int int8 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset(100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId9 = timeZone0.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 0 days 0 hours 0 minutes 0 seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset((int) (short) 10);
        timeZone0.setID("P0Y0M0DT0H0M0.100S");
        java.lang.Class<?> wildcardClass11 = timeZone0.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "hi!", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0 30a059 0 hour 0 1439inute59 0 econ3059");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str2, "0 30a059 0 hour 0 1439inute59 0 econ3059");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "P0Y0-10DT07430-10.0973599990");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0973599990" + "'", str3, "P0Y0-10DT07430-10.0973599990");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.1000" + "'", str2, "P0Y000DT00000.1000");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int5 = timeZone4.getRawOffset();
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone4);
        int int8 = timeZone4.getOffset((long) (byte) 0);
        java.lang.Class<?> wildcardClass9 = timeZone4.getClass();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.035" + "'", str6, "0:00:00.035");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 0, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0001" + "'", str3, "P0Y000DT00000.0001");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        int int8 = timeZone0.getOffset((long) ' ');
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = timeZone0.inDaylightTime(date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        java.util.TimeZone.setDefault(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeZone0.getOffset((int) (byte) 100, (int) 'a', 100, (int) (short) -1, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        timeZone0.setID("");
        timeZone0.setID("P0Y0M0DT0H0M0.001S");
        int int8 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        java.lang.Object obj7 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.001S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.001S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.001S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        java.util.TimeZone.setDefault(timeZone0);
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone0.getDisplayName(true, (int) (byte) 100, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.TimeZone.setDefault(timeZone4);
        int int10 = timeZone4.getOffset((-1L));
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0Y0M0DT0H0M0.000S", true, timeZone4);
        java.lang.Class<?> wildcardClass12 = timeZone4.getClass();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0-10DT07430-10.0003599999" + "'", str11, "P0Y0-10DT07430-10.0003599999");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        int int8 = timeZone0.getOffset((long) ' ');
        boolean boolean9 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "0:00:00.010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) '#');
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2, "P-1Y11M30DT23H59M59.989S");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.99" + "'", str1, "0:00:00.99");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset(100);
        int int10 = timeZone0.getOffset((long) (byte) 0);
        java.lang.Class<?> wildcardClass11 = timeZone0.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 1, "P-1Y11030DT23059059.96842");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.96842" + "'", str3, "P-1Y11030DT23059059.96842");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        timeZone0.setID("");
        timeZone0.setID("P0Y0M0DT0H0M0.001S");
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = timeZone0.inDaylightTime(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.001" + "'", str1, "0:00:00.001");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        boolean boolean10 = timeZone0.hasSameRules(timeZone4);
        java.lang.String str11 = timeZone4.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GMT+00:00" + "'", str11, "GMT+00:00");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.lang3.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang3.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass1 = durationFormatUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0010" + "'", str2, "P0Y000DT00000.0010");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.052" + "'", str1, "0:00:00.052");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) -1, "P0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0100" + "'", str3, "P0Y000DT00000.0100");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 10, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.001" + "'", str1, "0:00:00.001");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset((int) (short) 10);
        boolean boolean9 = timeZone0.observesDaylightTime();
        boolean boolean10 = timeZone0.observesDaylightTime();
        java.lang.String str11 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GMT+00:00" + "'", str11, "GMT+00:00");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        timeZone0.setRawOffset((int) (short) 10);
        java.lang.String str12 = timeZone0.getDisplayName(true, 0);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GMT+00:00" + "'", str12, "GMT+00:00");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00010" + "'", str2, "P0Y000DT00000.00010");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        int int7 = timeZone0.getRawOffset();
        java.lang.String str8 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GMT+00:00" + "'", str8, "GMT+00:00");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = timeZone1.getDisplayName(locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (-1L), "0:00:00.035");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.035" + "'", str3, "0:00:00.035");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        boolean boolean7 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        timeZone0.setID("");
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = timeZone0.inDaylightTime(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        int int7 = timeZone0.getRawOffset();
        int int9 = timeZone0.getOffset((long) (short) 0);
        boolean boolean10 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = timeZone0.inDaylightTime(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("0:00:00.99");
        int int2 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("GMT+00:00");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) '4', "P-1Y11030DT23059059.96842", false, timeZone5);
        java.lang.Object obj7 = timeZone5.clone();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P-1Y11030DT23059059.96842" + "'", str6, "P-1Y11030DT23059059.96842");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        timeZone0.setRawOffset((int) (short) 10);
        java.lang.String str10 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GMT+00:00" + "'", str10, "GMT+00:00");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.lang.String str15 = timeZone0.getID();
        timeZone0.setRawOffset((int) (byte) 100);
        java.lang.String str18 = timeZone0.getID();
        java.util.TimeZone.setDefault(timeZone0);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        int int3 = timeZone0.getOffset((long) ' ');
        boolean boolean4 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("GMT+00:00");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) '4', "P-1Y11030DT23059059.96842", false, timeZone5);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone5.getDisplayName(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P-1Y11030DT23059059.96842" + "'", str6, "P-1Y11030DT23059059.96842");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("GMT+00:00");
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone1.getDisplayName(true, (int) (short) 0, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.100100" + "'", str2, "P0Y000DT00000.100100");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        boolean boolean10 = timeZone0.hasSameRules(timeZone4);
        java.lang.Object obj11 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "sun.util.calendar.ZoneInfo[id=\"\",offset=100,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "sun.util.calendar.ZoneInfo[id=\"\",offset=100,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "sun.util.calendar.ZoneInfo[id=\"\",offset=100,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId3 = timeZone0.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: ");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        timeZone2.setID("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone2.getDisplayName(true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0:00:00.035");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.035" + "'", str2, "0:00:00.035");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        boolean boolean7 = timeZone0.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset((int) (short) 10);
        java.util.TimeZone.setDefault(timeZone0);
        boolean boolean10 = timeZone0.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeZone0.getOffset((int) (byte) 1, (-1), 10, 1, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        timeZone0.setRawOffset((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeZone0.getDisplayName(false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        int int4 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) -1, "", true, timeZone4);
        boolean boolean9 = timeZone4.observesDaylightTime();
        timeZone4.setID("P0000Y0M0DT0H0M0.001S");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        int int9 = timeZone0.getOffset((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = timeZone0.getDisplayName(false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("0 30a059 0 hour 0 1439inute59 0 econ3059");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset((int) (short) 10);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setID("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.Object obj12 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "sun.util.calendar.ZoneInfo[id=\"'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "sun.util.calendar.ZoneInfo[id=\"'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "sun.util.calendar.ZoneInfo[id=\"'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        boolean boolean2 = timeZone0.observesDaylightTime();
        java.lang.String str3 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT+00:00" + "'", str3, "GMT+00:00");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 10L, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getRawOffset();
        java.lang.Class<?> wildcardClass2 = timeZone0.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (-1), "0 days 0 hours 0 minutes 0 seconds", false, timeZone4);
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone4.getDisplayName(locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str7, "0 30a059 0 hour 0 1439inute59 0 econ3059");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.lang.String str4 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GMT+00:00" + "'", str4, "GMT+00:00");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P-1Y11M30DT23H59M59.901S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.90132" + "'", str3, "P-1Y11030DT23059059.90132");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.lang.String str4 = timeZone2.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GMT+00:00" + "'", str4, "GMT+00:00");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        boolean boolean10 = timeZone0.hasSameRules(timeZone4);
        timeZone4.setID("P0000Y0M0DT0H0M0.001S");
        java.lang.Object obj13 = timeZone4.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "sun.util.calendar.ZoneInfo[id=\"P0000Y0M0DT0H0M0.001S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "sun.util.calendar.ZoneInfo[id=\"P0000Y0M0DT0H0M0.001S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "sun.util.calendar.ZoneInfo[id=\"P0000Y0M0DT0H0M0.001S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset((int) (short) 10);
        java.lang.String str9 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT+00:00" + "'", str9, "GMT+00:00");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int5 = timeZone4.getRawOffset();
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone4);
        java.lang.String str7 = timeZone4.getID();
        boolean boolean8 = timeZone4.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.035" + "'", str6, "0:00:00.035");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0000Y0M0DT0H0M0.001S" + "'", str7, "P0000Y0M0DT0H0M0.001S");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        boolean boolean2 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset(100L);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0100" + "'", str3, "P0Y000DT00000.0100");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2, "P-1Y11M30DT23H59M59.989S");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 0);
        int int18 = timeZone14.getOffset(0L);
        boolean boolean19 = timeZone14.observesDaylightTime();
        boolean boolean20 = timeZone10.hasSameRules(timeZone14);
        boolean boolean21 = timeZone4.hasSameRules(timeZone14);
        int int23 = timeZone4.getOffset(0L);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone24);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        boolean boolean27 = timeZone24.hasSameRules(timeZone26);
        java.util.TimeZone.setDefault(timeZone24);
        int int30 = timeZone24.getOffset((-1L));
        java.lang.String str31 = timeZone24.getID();
        timeZone24.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean34 = timeZone4.hasSameRules(timeZone24);
        java.util.Locale locale35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = timeZone24.getDisplayName(locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str31, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P-1Y11030DT23059059.9011");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11030DT23059059.9011" + "'", str2, "P-1Y11030DT23059059.9011");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.TimeZone.setDefault(timeZone4);
        int int10 = timeZone4.getOffset((-1L));
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0Y0M0DT0H0M0.000S", true, timeZone4);
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = timeZone4.getDisplayName(locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0-10DT07430-10.0003599999" + "'", str11, "P0Y0-10DT07430-10.0003599999");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.lang.String str5 = timeZone1.getDisplayName(true, (int) (byte) 1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Greenwich Mean Time" + "'", str5, "Greenwich Mean Time");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        boolean boolean10 = timeZone0.hasSameRules(timeZone4);
        timeZone0.setID("0 days 0 hours 0 minutes 0 seconds");
        java.util.TimeZone.setDefault(timeZone0);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11030DT23059059.9011", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.9011" + "'", str3, "P-1Y11030DT23059059.9011");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.lang.String str15 = timeZone0.getID();
        timeZone0.setRawOffset((int) (byte) 100);
        java.lang.String str18 = timeZone0.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId19 = null; // flaky: timeZone0.toZoneId();
// flaky:             org.junit.Assert.fail("Expected exception of type java.time.zone.ZoneRulesException; message: Unknown time-zone ID: P0Y0M0DT0H0M0.000S");
        } catch (java.time.zone.ZoneRulesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str15, "P0Y0M0DT0H0M0.000S");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str18, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y000DT00000.0970");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "GMT+00:00", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "G0T+00:00" + "'", str3, "G0T+00:00");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 0);
        int int19 = timeZone15.getOffset(0L);
        int int21 = timeZone15.getOffset((long) '4');
        timeZone15.setRawOffset((int) (short) 10);
        boolean boolean24 = timeZone6.hasSameRules(timeZone15);
        boolean boolean25 = timeZone6.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        timeZone0.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean8 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        boolean boolean4 = timeZone2.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        boolean boolean10 = timeZone0.hasSameRules(timeZone4);
        timeZone4.setID("P0000Y0M0DT0H0M0.001S");
        java.util.TimeZone.setDefault(timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone4.getDisplayName(true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int5 = timeZone4.getRawOffset();
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone4);
        timeZone4.setRawOffset((int) (short) -1);
        java.lang.String str9 = timeZone4.getID();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.035" + "'", str6, "0:00:00.035");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0000Y0M0DT0H0M0.001S" + "'", str9, "P0000Y0M0DT0H0M0.001S");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.lang.String str15 = timeZone0.getID();
        int int16 = timeZone0.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = timeZone0.getDisplayName(true, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0000Y0M0DT0H0M0.001S" + "'", str15, "P0000Y0M0DT0H0M0.001S");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        timeZone0.setRawOffset((int) (short) 10);
        boolean boolean10 = timeZone0.observesDaylightTime();
        boolean boolean11 = timeZone0.observesDaylightTime();
        int int13 = timeZone0.getOffset((-1L));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = timeZone0.getOffset((int) (short) 0, (int) (short) 0, (int) '#', (int) (byte) 1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset((int) (short) 10);
        timeZone0.setID("P0Y0M0DT0H0M0.100S");
        java.lang.String str11 = timeZone0.getID();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str11, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        timeZone0.setRawOffset((int) (short) 10);
        boolean boolean10 = timeZone0.observesDaylightTime();
        boolean boolean11 = timeZone0.observesDaylightTime();
        int int13 = timeZone0.getOffset((-1L));
        java.lang.String str16 = timeZone0.getDisplayName(false, (int) (short) 1);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GMT+00:00" + "'", str16, "GMT+00:00");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int10 = timeZone4.getOffset((long) '4');
        timeZone4.setRawOffset((int) (short) 10);
        java.util.TimeZone.setDefault(timeZone4);
        timeZone4.setID("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String str16 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 0, "P0Y0M0DT0H0M0.097S", true, timeZone4);
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = timeZone4.getDisplayName(locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P0Y0-10DT07430-10.0973599990" + "'", str16, "P0Y0-10DT07430-10.0973599990");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        timeZone0.setID("");
        timeZone0.setID("P0Y0M0DT0H0M0.001S");
        java.lang.String str8 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GMT+00:00" + "'", str8, "GMT+00:00");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) -1, "P0Y0-10DT07430-10.0973599990");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0973599990" + "'", str3, "P0Y0-10DT07430-10.0973599990");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str2, "P0Y0M0DT0H0M0.097S");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone0.getDisplayName(false, (int) ' ', locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int5 = timeZone4.getRawOffset();
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone4);
        int int8 = timeZone4.getOffset((long) (byte) 0);
        int int10 = timeZone4.getOffset(0L);
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = timeZone4.getDisplayName(false, 10, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.035" + "'", str6, "0:00:00.035");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "G0T+00:00" + "'", str2, "G0T+00:00");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 0);
        int int18 = timeZone14.getOffset(0L);
        boolean boolean19 = timeZone14.observesDaylightTime();
        boolean boolean20 = timeZone10.hasSameRules(timeZone14);
        boolean boolean21 = timeZone4.hasSameRules(timeZone14);
        int int23 = timeZone4.getOffset(0L);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone24);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        boolean boolean27 = timeZone24.hasSameRules(timeZone26);
        java.util.TimeZone.setDefault(timeZone24);
        int int30 = timeZone24.getOffset((-1L));
        java.lang.String str31 = timeZone24.getID();
        timeZone24.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean34 = timeZone4.hasSameRules(timeZone24);
        java.util.Locale locale37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = timeZone24.getDisplayName(true, (-1), locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str31, "P0Y0M0DT0H0M0.001S");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        timeZone0.setRawOffset((int) (short) 10);
        int int11 = timeZone0.getOffset(1L);
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = timeZone0.inDaylightTime(date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.TimeZone timeZone0 = null;
        java.util.TimeZone.setDefault(timeZone0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) -1, "", true, timeZone4);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone9);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        boolean boolean12 = timeZone9.hasSameRules(timeZone11);
        java.util.TimeZone.setDefault(timeZone9);
        boolean boolean14 = timeZone4.hasSameRules(timeZone9);
        java.lang.Class<?> wildcardClass15 = timeZone9.getClass();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int9 = timeZone4.getRawOffset();
        timeZone4.setRawOffset((int) ' ');
        boolean boolean12 = timeZone3.hasSameRules(timeZone4);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.947S" + "'", str2, "P-1Y11M30DT23H59M59.947S");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("GMT+00:00");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) '4', "P-1Y11030DT23059059.96842", false, timeZone5);
        int int8 = timeZone5.getOffset((long) 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P-1Y11030DT23059059.96842" + "'", str6, "P-1Y11030DT23059059.96842");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeZone0.getOffset(1, 0, (int) (short) 0, (int) (short) 1, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) -1, "", true, timeZone4);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone9);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        boolean boolean12 = timeZone9.hasSameRules(timeZone11);
        java.util.TimeZone.setDefault(timeZone9);
        boolean boolean14 = timeZone4.hasSameRules(timeZone9);
        java.lang.String str15 = timeZone4.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinated Universal Time" + "'", str15, "Coordinated Universal Time");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        timeZone0.setRawOffset((int) (short) 10);
        boolean boolean10 = timeZone0.observesDaylightTime();
        boolean boolean11 = timeZone0.observesDaylightTime();
        int int13 = timeZone0.getOffset((-1L));
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = timeZone0.getDisplayName(locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "0:00:00.001", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.001" + "'", str3, "0:00:00.001");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        int int3 = timeZone1.getOffset((long) '#');
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone6.getDisplayName(locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.lang.String str15 = timeZone0.getID();
        java.lang.Class<?> wildcardClass16 = timeZone0.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str15, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int8 = timeZone7.getRawOffset();
        java.lang.String str9 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone7);
        int int11 = timeZone7.getOffset((long) (byte) 0);
        boolean boolean12 = timeZone1.hasSameRules(timeZone7);
        java.lang.Class<?> wildcardClass13 = timeZone7.getClass();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.035" + "'", str9, "0:00:00.035");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        timeZone0.setID("P0Y0M0DT0H0M0.000S");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId8 = timeZone0.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.zone.ZoneRulesException; message: Unknown time-zone ID: P0Y0M0DT0H0M0.000S");
        } catch (java.time.zone.ZoneRulesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        timeZone2.setID("");
        int int6 = timeZone2.getRawOffset();
        java.lang.String str9 = timeZone2.getDisplayName(true, (int) (short) 0);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT+00:00" + "'", str9, "GMT+00:00");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.lang.String str15 = timeZone0.getID();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = timeZone0.getDisplayName(locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str15, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.90111", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.90111" + "'", str3, "P-1Y11030DT23059059.90111");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) 0, "P-1Y11030DT23059059.90132");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.90132" + "'", str3, "P-1Y11030DT23059059.90132");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2, "P-1Y11M30DT23H59M59.901S");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone.setDefault(timeZone0);
        int int6 = timeZone0.getOffset((-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone0.getDisplayName(true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.022S" + "'", str2, "P0Y0M0DT0H0M0.022S");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getRawOffset();
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = timeZone0.getDisplayName(locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId2);
        int int5 = timeZone4.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.lang.Class<?> wildcardClass2 = timeZone1.getClass();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 0);
        int int18 = timeZone14.getOffset(0L);
        boolean boolean19 = timeZone14.observesDaylightTime();
        boolean boolean20 = timeZone10.hasSameRules(timeZone14);
        boolean boolean21 = timeZone4.hasSameRules(timeZone14);
        timeZone14.setRawOffset((int) (byte) 0);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Etc/UTC" + "'", str2, "Etc/UTC");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone.setDefault(timeZone1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId2);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 0);
        int int18 = timeZone14.getOffset(0L);
        boolean boolean19 = timeZone14.observesDaylightTime();
        boolean boolean20 = timeZone10.hasSameRules(timeZone14);
        boolean boolean21 = timeZone4.hasSameRules(timeZone14);
        int int23 = timeZone4.getOffset(0L);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone24);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        boolean boolean27 = timeZone24.hasSameRules(timeZone26);
        java.util.TimeZone.setDefault(timeZone24);
        int int30 = timeZone24.getOffset((-1L));
        java.lang.String str31 = timeZone24.getID();
        timeZone24.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean34 = timeZone4.hasSameRules(timeZone24);
        java.util.Locale locale35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = timeZone4.getDisplayName(locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "GMT" + "'", str31, "GMT");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        boolean boolean10 = timeZone0.hasSameRules(timeZone4);
        java.lang.Object obj11 = timeZone4.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        int int7 = timeZone0.getRawOffset();
        timeZone0.setRawOffset((int) '#');
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int8 = timeZone7.getRawOffset();
        java.lang.String str9 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone7);
        int int11 = timeZone7.getOffset((long) (byte) 0);
        boolean boolean12 = timeZone1.hasSameRules(timeZone7);
        int int13 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.035" + "'", str9, "0:00:00.035");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int10 = timeZone4.getOffset((long) '4');
        timeZone4.setRawOffset(100);
        int int14 = timeZone4.getOffset((long) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y000DT00000.001-1", true, timeZone4);
        boolean boolean16 = timeZone4.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y000DT00000.001-1" + "'", str15, "P0Y000DT00000.001-1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) 10, "P0Y000DT00000.010100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010100" + "'", str3, "P0Y000DT00000.010100");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 100, "0 seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0econ00" + "'", str3, "0 0econ00");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.99" + "'", str1, "0:00:00.99");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.TimeZone.setDefault(timeZone4);
        int int10 = timeZone4.getOffset((-1L));
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0Y0M0DT0H0M0.000S", true, timeZone4);
        int int12 = timeZone4.getRawOffset();
        int int13 = timeZone4.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0-10DT07430-10.0003599999" + "'", str11, "P0Y0-10DT07430-10.0003599999");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        int int9 = timeZone8.getRawOffset();
        java.lang.String str10 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone8);
        int int12 = timeZone8.getOffset((long) (byte) 0);
        java.lang.String str13 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 0, "0:00:00.052", true, timeZone8);
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = timeZone8.getDisplayName(false, (int) (byte) -1, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.035" + "'", str10, "0:00:00.035");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.052" + "'", str13, "0:00:00.052");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        timeZone0.setRawOffset((int) (short) 10);
        boolean boolean10 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int16 = timeZone15.getRawOffset();
        java.lang.String str17 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone15);
        int int19 = timeZone15.getOffset((long) (byte) 0);
        int int21 = timeZone15.getOffset(0L);
        boolean boolean22 = timeZone0.hasSameRules(timeZone15);
        java.util.Date date23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = timeZone0.inDaylightTime(date23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:00:00.035" + "'", str17, "0:00:00.035");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("GMT+00:00");
        boolean boolean2 = timeZone1.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int5 = timeZone4.getRawOffset();
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone4);
        int int8 = timeZone4.getOffset((long) (byte) 0);
        int int10 = timeZone4.getOffset(0L);
        java.util.TimeZone.setDefault(timeZone4);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.035" + "'", str6, "0:00:00.035");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        boolean boolean2 = timeZone0.observesDaylightTime();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone0.getDisplayName(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.101S");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset(100);
        timeZone0.setRawOffset((int) (short) -1);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        java.lang.String str5 = timeZone0.getDisplayName(true, (int) (byte) 0);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GMT+00:00" + "'", str5, "GMT+00:00");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset((int) (short) 1);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        timeZone4.setID("P0Y0M0DT0H0M0.101S");
        java.lang.Object obj12 = timeZone4.clone();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.101S\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.101S\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.101S\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.lang.Object obj3 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int10 = timeZone4.getOffset((long) '4');
        timeZone4.setRawOffset((int) (short) 10);
        java.util.TimeZone.setDefault(timeZone4);
        timeZone4.setID("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String str16 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 0, "P0Y0M0DT0H0M0.097S", true, timeZone4);
        java.lang.String str17 = timeZone4.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P0Y0-10DT07430-10.0973599990" + "'", str16, "P0Y0-10DT07430-10.0973599990");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GMT+00:00" + "'", str17, "GMT+00:00");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        boolean boolean10 = timeZone0.hasSameRules(timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId11 = timeZone0.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 0);
        int int19 = timeZone15.getOffset(0L);
        int int21 = timeZone15.getOffset((long) '4');
        timeZone15.setRawOffset((int) (short) 10);
        boolean boolean24 = timeZone6.hasSameRules(timeZone15);
        timeZone15.setRawOffset((int) (short) 0);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.899S" + "'", str2, "P-1Y11M30DT23H59M59.899S");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset((int) (short) 10);
        boolean boolean9 = timeZone0.observesDaylightTime();
        int int11 = timeZone0.getOffset((long) 100);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone.setDefault(timeZone0);
        int int6 = timeZone0.getOffset((-1L));
        java.lang.String str7 = timeZone0.getID();
        timeZone0.setID("P0Y0M0DT0H0M0.000S");
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = timeZone0.getDisplayName(locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str7, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.1000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.1000" + "'", str2, "P0Y000DT00000.1000");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 0);
        int int18 = timeZone14.getOffset(0L);
        boolean boolean19 = timeZone14.observesDaylightTime();
        boolean boolean20 = timeZone10.hasSameRules(timeZone14);
        boolean boolean21 = timeZone4.hasSameRules(timeZone14);
        java.util.TimeZone.setDefault(timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = timeZone4.getOffset((int) (short) -1, 10, (-1), 35, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        int int6 = timeZone0.getRawOffset();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone0.getDisplayName(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.010" + "'", str1, "0:00:00.010");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        int int7 = timeZone0.getRawOffset();
        int int9 = timeZone0.getOffset((long) (short) 0);
        java.lang.String str10 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GMT+00:00" + "'", str10, "GMT+00:00");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int10 = timeZone4.getOffset((long) '4');
        int int11 = timeZone4.getRawOffset();
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', 0L, "P-1Y11M30DT23H59M59.968S", true, timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = timeZone4.getDisplayName(false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P-1Y11-130DT2374359-159.9683599965" + "'", str12, "P-1Y11-130DT2374359-159.9683599965");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int10 = timeZone4.getOffset((long) '4');
        timeZone4.setRawOffset((int) (short) 10);
        java.lang.String str13 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) '#', "Coordinated Universal Time", false, timeZone4);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coor0inate Univer0al Ti0e" + "'", str13, "Coor0inate Univer0al Ti0e");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "Coor0inate Univer0al Ti0e", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coor0inate Univer0al Ti0e" + "'", str3, "Coor0inate Univer0al Ti0e");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        int int9 = timeZone8.getRawOffset();
        java.lang.String str10 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone8);
        timeZone8.setRawOffset((int) (short) -1);
        timeZone8.setID("P0Y0-10DT07430-10.0003599999");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) '4', "P-1Y11M30DT23H59M59.968S", true, timeZone8);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = timeZone8.getOffset((int) (short) 10, (int) (short) 0, (int) '4', (int) (byte) 1, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.035" + "'", str10, "0:00:00.035");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P-1Y11030DT23059059.96842" + "'", str15, "P-1Y11030DT23059059.96842");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.lang.String str15 = timeZone0.getID();
        timeZone0.setRawOffset((int) (byte) 100);
        java.lang.Object obj18 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str15, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=100,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=100,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=100,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        int int6 = timeZone0.getRawOffset();
        java.lang.Class<?> wildcardClass7 = timeZone0.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        int int9 = timeZone8.getRawOffset();
        java.lang.String str10 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone8);
        int int12 = timeZone8.getOffset((long) (byte) 0);
        java.lang.String str13 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 0, "0:00:00.052", true, timeZone8);
        java.lang.String str14 = timeZone8.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.035" + "'", str10, "0:00:00.035");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.052" + "'", str13, "0:00:00.052");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GMT+00:00" + "'", str14, "GMT+00:00");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        int int9 = timeZone0.getOffset((long) ' ');
        timeZone0.setID("0 days 0 hours 0 minutes 0 seconds");
        boolean boolean12 = timeZone0.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.001" + "'", str1, "0:00:00.001");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        int int10 = timeZone8.getOffset((long) 0);
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (-1), "0 days 0 hours 0 minutes 0 seconds", false, timeZone8);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) -1, "", true, timeZone8);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str11, "0 30a059 0 hour 0 1439inute59 0 econ3059");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.TimeZone.setDefault(timeZone4);
        int int10 = timeZone4.getOffset((-1L));
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0Y0M0DT0H0M0.000S", true, timeZone4);
        int int13 = timeZone4.getOffset((long) (byte) 1);
        boolean boolean14 = timeZone4.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0-10DT07430-10.0003599999" + "'", str11, "P0Y0-10DT07430-10.0003599999");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 10, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        java.lang.Class<?> wildcardClass5 = timeZone0.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        boolean boolean3 = timeZone0.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = timeZone0.getDisplayName(true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset((int) (short) 10);
        boolean boolean9 = timeZone0.observesDaylightTime();
        boolean boolean10 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone11);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        boolean boolean14 = timeZone11.hasSameRules(timeZone13);
        timeZone13.setID("");
        boolean boolean17 = timeZone0.hasSameRules(timeZone13);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId18 = timeZone13.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: ");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 0);
        int int18 = timeZone14.getOffset(0L);
        boolean boolean19 = timeZone14.observesDaylightTime();
        boolean boolean20 = timeZone10.hasSameRules(timeZone14);
        boolean boolean21 = timeZone4.hasSameRules(timeZone14);
        java.util.TimeZone.setDefault(timeZone4);
        timeZone4.setRawOffset((int) '#');
        java.lang.String str25 = timeZone4.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GMT+00:00" + "'", str25, "GMT+00:00");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        int int9 = timeZone8.getRawOffset();
        java.lang.String str10 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone8);
        timeZone8.setRawOffset((int) (short) -1);
        timeZone8.setID("P0Y0-10DT07430-10.0003599999");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) '4', "P-1Y11M30DT23H59M59.968S", true, timeZone8);
        int int16 = timeZone8.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.035" + "'", str10, "0:00:00.035");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P-1Y11030DT23059059.96842" + "'", str15, "P-1Y11030DT23059059.96842");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.022S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.02235" + "'", str2, "P0Y000DT00000.02235");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        int int10 = timeZone8.getOffset((long) 0);
        int int12 = timeZone8.getOffset(0L);
        boolean boolean13 = timeZone8.observesDaylightTime();
        boolean boolean14 = timeZone4.hasSameRules(timeZone8);
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) 1, "P-1Y11M30DT23H59M59.989S", true, timeZone8);
        java.lang.Class<?> wildcardClass16 = timeZone8.getClass();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P-1Y11-130DT2374359-159.9893599949" + "'", str15, "P-1Y11-130DT2374359-159.9893599949");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        timeZone4.setID("P0Y0M0DT0H0M0.101S");
        boolean boolean12 = timeZone4.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("P-1Y11030DT23059059.9011");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) -1, "P-1Y11-130DT2374359-159.9683599965", true, timeZone5);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P-1Y11-130DT2374359-159.9683599965" + "'", str6, "P-1Y11-130DT2374359-159.9683599965");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        int int12 = timeZone10.getOffset((long) 0);
        int int14 = timeZone10.getOffset(0L);
        int int15 = timeZone10.getRawOffset();
        timeZone10.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean18 = timeZone4.hasSameRules(timeZone10);
        java.lang.String str19 = timeZone4.getID();
        java.lang.String str20 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (short) 0, "P0Y000DT00000.00010", true, timeZone4);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str19, "P0Y0M0DT0H0M0.101S");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P0Y000DT00000.00010" + "'", str20, "P0Y000DT00000.00010");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("GMT+00:00");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int3 = timeZone1.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        int int3 = timeZone1.getOffset(0L);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int9 = timeZone4.getRawOffset();
        boolean boolean10 = timeZone4.observesDaylightTime();
        boolean boolean11 = timeZone4.observesDaylightTime();
        timeZone4.setRawOffset((int) (short) 10);
        java.util.TimeZone.setDefault(timeZone4);
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 1L, "0 0econ00", true, timeZone4);
        java.lang.String str16 = timeZone4.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 0econ00" + "'", str15, "0 0econ00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GMT+00:00" + "'", str16, "GMT+00:00");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone1.getDisplayName(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 0, "0 days 0 hours 0 minutes 0 seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0 0a000 0 hour 0 0inute00 0 econ00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str2, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int10 = timeZone4.getOffset((long) '4');
        int int11 = timeZone4.getRawOffset();
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', 0L, "P-1Y11M30DT23H59M59.968S", true, timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeZone4.getOffset((int) (byte) -1, (int) (short) 100, 35, 35, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P-1Y11-130DT2374359-159.9683599965" + "'", str12, "P-1Y11-130DT2374359-159.9683599965");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 0);
        int int18 = timeZone14.getOffset(0L);
        boolean boolean19 = timeZone14.observesDaylightTime();
        boolean boolean20 = timeZone10.hasSameRules(timeZone14);
        boolean boolean21 = timeZone4.hasSameRules(timeZone14);
        int int23 = timeZone4.getOffset(0L);
        java.lang.String str24 = timeZone4.getID();
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        int int27 = timeZone25.getOffset((long) 0);
        int int29 = timeZone25.getOffset(0L);
        int int30 = timeZone25.getRawOffset();
        boolean boolean31 = timeZone25.observesDaylightTime();
        boolean boolean32 = timeZone4.hasSameRules(timeZone25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = timeZone4.getDisplayName(false, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str24, "P0Y0M0DT0H0M0.101S");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.lang.Object obj2 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) -1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = timeZone4.inDaylightTime(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int9 = timeZone4.getRawOffset();
        boolean boolean10 = timeZone4.observesDaylightTime();
        boolean boolean11 = timeZone4.observesDaylightTime();
        int int13 = timeZone4.getOffset((long) ' ');
        timeZone4.setID("0 days 0 hours 0 minutes 0 seconds");
        java.lang.String str16 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 10L, "P0Y000DT00000.0100", true, timeZone4);
        java.lang.String str17 = timeZone4.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P0Y000DT00000.0100" + "'", str16, "P0Y000DT00000.0100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GMT+00:00" + "'", str17, "GMT+00:00");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = timeZone0.getDisplayName(false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 0);
        int int18 = timeZone14.getOffset(0L);
        boolean boolean19 = timeZone14.observesDaylightTime();
        boolean boolean20 = timeZone10.hasSameRules(timeZone14);
        boolean boolean21 = timeZone4.hasSameRules(timeZone14);
        java.util.TimeZone.setDefault(timeZone4);
        java.lang.String str23 = timeZone4.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GMT+00:00" + "'", str23, "GMT+00:00");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = timeZone3.inDaylightTime(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.lang.Object obj4 = timeZone3.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(100L, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.lang.String str15 = timeZone0.getID();
        int int16 = timeZone0.getRawOffset();
        timeZone0.setRawOffset((int) (short) 0);
        timeZone0.setID("0 30a059 0 hour 0 1439inute59 0 econ3059");
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str15, "P0Y0M0DT0H0M0.101S");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        boolean boolean2 = timeZone0.observesDaylightTime();
        java.lang.String str3 = timeZone0.getID();
        java.lang.Class<?> wildcardClass4 = timeZone0.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str3, "P0Y0M0DT0H0M0.101S");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2, "P-1Y11M30DT23H59M59.991S");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        int int9 = timeZone0.getOffset((long) ' ');
        timeZone0.setID("0 days 0 hours 0 minutes 0 seconds");
        timeZone0.setID("P-1Y11-130DT2374359-159.9683599965");
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int5 = timeZone4.getRawOffset();
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeZone4.getOffset((int) (byte) 10, (int) (short) -1, (int) '#', (int) 'a', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.035" + "'", str6, "0:00:00.035");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.100" + "'", str1, "0:00:00.100");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0001" + "'", str2, "P0Y000DT00000.0001");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.035S" + "'", str2, "P0Y0M0DT0H0M0.035S");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone.setDefault(timeZone0);
        int int6 = timeZone0.getOffset((-1L));
        java.lang.String str7 = timeZone0.getID();
        timeZone0.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean10 = timeZone0.observesDaylightTime();
        int int11 = timeZone0.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str7, "P0Y0M0DT0H0M0.101S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((-1));
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.032" + "'", str1, "0:00:00.032");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset((int) (short) 10);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setID("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        int int12 = timeZone0.getRawOffset();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone0.getDisplayName(true, (int) '#', locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        java.lang.String str14 = timeZone6.getID();
        boolean boolean15 = timeZone5.hasSameRules(timeZone6);
        timeZone5.setRawOffset(0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str14, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.TimeZone.setDefault(timeZone4);
        int int10 = timeZone4.getOffset((-1L));
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0Y0M0DT0H0M0.000S", true, timeZone4);
        int int13 = timeZone4.getOffset((long) (byte) 1);
        java.lang.String str14 = timeZone4.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0-10DT07430-10.0003599999" + "'", str11, "P0Y0-10DT07430-10.0003599999");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GMT+00:00" + "'", str14, "GMT+00:00");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone.setDefault(timeZone0);
        int int6 = timeZone0.getOffset((-1L));
        java.lang.String str7 = timeZone0.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId8 = null; // flaky: timeZone0.toZoneId();
// flaky:             org.junit.Assert.fail("Expected exception of type java.time.zone.ZoneRulesException; message: Unknown time-zone ID: P0Y000DT00000.100100");
        } catch (java.time.zone.ZoneRulesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y000DT00000.100100" + "'", str7, "P0Y000DT00000.100100");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2, "P0Y0M0DT0H0M0.009S");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y000DT00000.001-1");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        java.lang.String str2 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Greenwich Mean Time" + "'", str2, "Greenwich Mean Time");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        java.lang.String str14 = timeZone6.getID();
        boolean boolean15 = timeZone5.hasSameRules(timeZone6);
        java.time.ZoneId zoneId16 = timeZone5.toZoneId();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str14, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneId16);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.100" + "'", str1, "0:00:00.100");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.101S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101-1" + "'", str3, "P0Y000DT00000.101-1");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int9 = timeZone4.getRawOffset();
        boolean boolean10 = timeZone4.observesDaylightTime();
        boolean boolean11 = timeZone4.observesDaylightTime();
        timeZone4.setRawOffset((int) (short) 10);
        boolean boolean14 = timeZone4.observesDaylightTime();
        boolean boolean15 = timeZone4.observesDaylightTime();
        int int17 = timeZone4.getOffset(0L);
        java.lang.String str18 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 100, "", true, timeZone4);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone.setDefault(timeZone0);
        java.lang.String str5 = timeZone0.getID();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeZone0.getOffset((int) ' ', 1, (int) (short) 100, (int) (short) 100, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.100100" + "'", str5, "P0Y000DT00000.100100");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P-1Y11030DT23059059.9011");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11030DT23059059.9011" + "'", str2, "P-1Y11030DT23059059.9011");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone1.getDisplayName(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Greenwich 0ean Ti0e" + "'", str2, "Greenwich 0ean Ti0e");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 10, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("0:00:00.99");
        int int2 = timeZone1.getRawOffset();
        java.time.ZoneId zoneId3 = timeZone1.toZoneId();
        java.lang.String str4 = timeZone1.getID();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GMT" + "'", str4, "GMT");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        java.lang.String str3 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT+00:00" + "'", str3, "GMT+00:00");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str1, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 10, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        boolean boolean10 = timeZone0.hasSameRules(timeZone4);
        timeZone0.setID("0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone0.getDisplayName(false, (int) (short) 10, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11M30DT23H59M59.968S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3, "P-1Y11030DT23059059.968100");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "0 0a000 0 hour 0 0inute00 0 econ00", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        int int7 = timeZone0.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId8 = timeZone0.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 0 days 0 hours 0 minutes 0 seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 100, "0 days");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00" + "'", str3, "0 0a00");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        java.lang.Object obj5 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "sun.util.calendar.ZoneInfo[id=\"0 days 0 hours 0 minutes 0 seconds\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "sun.util.calendar.ZoneInfo[id=\"0 days 0 hours 0 minutes 0 seconds\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "sun.util.calendar.ZoneInfo[id=\"0 days 0 hours 0 minutes 0 seconds\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.0970", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0970" + "'", str3, "P0Y000DT00000.0970");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        int int12 = timeZone10.getOffset((long) 0);
        int int14 = timeZone10.getOffset(0L);
        int int15 = timeZone10.getRawOffset();
        timeZone10.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean18 = timeZone4.hasSameRules(timeZone10);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        int int21 = timeZone19.getOffset((long) 0);
        int int23 = timeZone19.getOffset(0L);
        int int25 = timeZone19.getOffset((long) '4');
        timeZone19.setRawOffset((int) (short) 10);
        boolean boolean28 = timeZone10.hasSameRules(timeZone19);
        java.lang.String str29 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) -1, "P0Y0-10DT07430-10.0003599999", false, timeZone19);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P0Y0-10DT07430-10.0003599999" + "'", str29, "P0Y0-10DT07430-10.0003599999");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int6 = timeZone0.getOffset((long) '4');
        timeZone0.setRawOffset((int) (short) 10);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setID("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        int int12 = timeZone0.getRawOffset();
        java.util.TimeZone timeZone13 = null;
        boolean boolean14 = timeZone0.hasSameRules(timeZone13);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        boolean boolean2 = timeZone1.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.TimeZone.setDefault(timeZone4);
        int int10 = timeZone4.getOffset((-1L));
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0Y0M0DT0H0M0.000S", true, timeZone4);
        int int13 = timeZone4.getOffset((long) (byte) 1);
        java.util.Date date14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = timeZone4.inDaylightTime(date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0-10DT07430-10.0003599999" + "'", str11, "P0Y0-10DT07430-10.0003599999");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str1, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        timeZone0.setRawOffset((-1));
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone0);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        boolean boolean2 = timeZone1.observesDaylightTime();
        int int3 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 0);
        int int19 = timeZone15.getOffset(0L);
        int int21 = timeZone15.getOffset((long) '4');
        timeZone15.setRawOffset((int) (short) 10);
        boolean boolean24 = timeZone6.hasSameRules(timeZone15);
        boolean boolean25 = timeZone15.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        int int3 = timeZone0.getOffset((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone0.getOffset((int) (byte) 10, 10, 35, (int) ' ', 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "G0T+00:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "G0T+00:00" + "'", str2, "G0T+00:00");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        int int3 = timeZone1.getOffset((long) 0);
        int int5 = timeZone1.getOffset(0L);
        int int6 = timeZone1.getRawOffset();
        timeZone1.setID("P0Y0M0DT0H0M0.000S");
        java.lang.String str9 = timeZone1.getID();
        boolean boolean10 = timeZone0.hasSameRules(timeZone1);
        timeZone1.setRawOffset((int) '4');
        int int14 = timeZone1.getOffset((long) 35);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str9, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.lang.String str3 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Greenwich Mean Time" + "'", str3, "Greenwich Mean Time");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        timeZone4.setID("P0Y0M0DT0H0M0.101S");
        int int13 = timeZone4.getOffset((long) (byte) 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.lang.String str3 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Greenwich Mean Time" + "'", str3, "Greenwich Mean Time");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.TimeZone.setDefault(timeZone0);
        boolean boolean5 = timeZone0.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        timeZone4.setID("P0Y0M0DT0H0M0.000S");
        int int12 = timeZone4.getOffset((long) 'a');
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        java.util.TimeZone.setDefault(timeZone0);
        boolean boolean6 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 0);
        int int18 = timeZone14.getOffset(0L);
        boolean boolean19 = timeZone14.observesDaylightTime();
        boolean boolean20 = timeZone10.hasSameRules(timeZone14);
        boolean boolean21 = timeZone4.hasSameRules(timeZone14);
        java.util.TimeZone.setDefault(timeZone4);
        java.lang.Object obj23 = timeZone4.clone();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        boolean boolean7 = timeZone0.observesDaylightTime();
        int int9 = timeZone0.getOffset((long) ' ');
        java.lang.String str10 = timeZone0.getID();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = timeZone0.getDisplayName(locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str10, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        boolean boolean5 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 0);
        int int10 = timeZone6.getOffset(0L);
        int int11 = timeZone6.getRawOffset();
        timeZone6.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean14 = timeZone0.hasSameRules(timeZone6);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 0);
        int int19 = timeZone15.getOffset(0L);
        int int21 = timeZone15.getOffset((long) '4');
        timeZone15.setRawOffset((int) (short) 10);
        boolean boolean24 = timeZone6.hasSameRules(timeZone15);
        timeZone6.setRawOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = timeZone6.getOffset((int) (byte) -1, 1, 100, (int) (short) 10, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = timeZone0.inDaylightTime(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int5 = timeZone4.getRawOffset();
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone4);
        java.lang.String str7 = timeZone4.getID();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        int int11 = timeZone9.getOffset((long) 0);
        int int13 = timeZone9.getOffset(0L);
        int int14 = timeZone9.getRawOffset();
        boolean boolean15 = timeZone9.observesDaylightTime();
        boolean boolean16 = timeZone9.observesDaylightTime();
        timeZone9.setRawOffset((int) (short) 10);
        boolean boolean19 = timeZone9.observesDaylightTime();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        int int25 = timeZone24.getRawOffset();
        java.lang.String str26 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone24);
        int int28 = timeZone24.getOffset((long) (byte) 0);
        int int30 = timeZone24.getOffset(0L);
        boolean boolean31 = timeZone9.hasSameRules(timeZone24);
        boolean boolean32 = timeZone4.hasSameRules(timeZone9);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.035" + "'", str6, "0:00:00.035");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str7, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0:00:00.035" + "'", str26, "0:00:00.035");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Etc/UTC");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("0 days 0 hours 0 minutes 0 seconds");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 1, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, timeZone5);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", str6, "P0000Y0M0DT0H0M0.000S");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 0);
        int int18 = timeZone14.getOffset(0L);
        boolean boolean19 = timeZone14.observesDaylightTime();
        boolean boolean20 = timeZone10.hasSameRules(timeZone14);
        boolean boolean21 = timeZone4.hasSameRules(timeZone14);
        int int23 = timeZone4.getOffset(0L);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone24);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        boolean boolean27 = timeZone24.hasSameRules(timeZone26);
        java.util.TimeZone.setDefault(timeZone24);
        int int30 = timeZone24.getOffset((-1L));
        java.lang.String str31 = timeZone24.getID();
        timeZone24.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean34 = timeZone4.hasSameRules(timeZone24);
        timeZone4.setID("Etc/UTC");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str31, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.101-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101-1" + "'", str3, "P0Y000DT00000.101-1");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "0:00:00.032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.032" + "'", str2, "0:00:00.032");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.097S");
        java.lang.Object obj2 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (-1), "0 days 0 hours 0 minutes 0 seconds", false, timeZone4);
        int int9 = timeZone4.getOffset(0L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str7, "0 30a059 0 hour 0 1439inute59 0 econ3059");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("0:00:00.99");
        int int2 = timeZone1.getRawOffset();
        java.time.ZoneId zoneId3 = timeZone1.toZoneId();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId3);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.99S");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone1.getDisplayName(false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.101S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.101-1" + "'", str2, "P0Y000DT00000.101-1");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        int int3 = timeZone0.getOffset((long) ' ');
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        int int10 = timeZone8.getOffset((long) 0);
        int int12 = timeZone8.getOffset(0L);
        int int13 = timeZone8.getRawOffset();
        boolean boolean14 = timeZone8.observesDaylightTime();
        boolean boolean15 = timeZone8.observesDaylightTime();
        timeZone8.setRawOffset((int) (short) 10);
        java.util.TimeZone.setDefault(timeZone8);
        java.lang.String str19 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 1L, "0 0econ00", true, timeZone8);
        boolean boolean20 = timeZone0.hasSameRules(timeZone8);
        java.lang.String str21 = timeZone8.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0 0econ00" + "'", str19, "0 0econ00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GMT+00:00" + "'", str21, "GMT+00:00");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0973599990");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone(zoneId2);
        timeZone5.setID("P0Y0M0DT0H0M0.101S");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone5.getDisplayName(false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int5 = timeZone4.getRawOffset();
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone4);
        int int8 = timeZone4.getOffset((long) (byte) 0);
        int int10 = timeZone4.getOffset(0L);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = timeZone4.getDisplayName(locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.035" + "'", str6, "0:00:00.035");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        boolean boolean6 = timeZone0.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = timeZone0.inDaylightTime(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        int int12 = timeZone10.getOffset((long) 0);
        int int14 = timeZone10.getOffset(0L);
        int int15 = timeZone10.getRawOffset();
        timeZone10.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean18 = timeZone4.hasSameRules(timeZone10);
        java.lang.String str19 = timeZone4.getID();
        timeZone4.setRawOffset((int) (byte) 100);
        java.lang.String str22 = timeZone4.getID();
        java.lang.String str23 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 'a', "P0Y0M0DT0H0M0.022S", false, timeZone4);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str19, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str22, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "P0Y000DT00000.02298" + "'", str23, "P0Y000DT00000.02298");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        timeZone0.setID("P0Y0M0DT0H0M0.000S");
        java.lang.String str8 = timeZone0.getID();
        timeZone0.setRawOffset(35);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int16 = timeZone15.getRawOffset();
        java.lang.String str17 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone15);
        timeZone15.setRawOffset((int) (short) -1);
        boolean boolean20 = timeZone0.hasSameRules(timeZone15);
        timeZone0.setRawOffset((int) ' ');
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str8, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:00:00.035" + "'", str17, "0:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.097S");
        java.lang.String str2 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Greenwich Mean Time" + "'", str2, "Greenwich Mean Time");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("P-1Y11M30DT23H59M59.901S");
        boolean boolean6 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        int int12 = timeZone11.getRawOffset();
        java.lang.String str13 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone11);
        int int15 = timeZone11.getOffset((long) (byte) 0);
        boolean boolean16 = timeZone5.hasSameRules(timeZone11);
        timeZone5.setID("0 0a000 0 hour 0 0inute00 0 econ00");
        java.lang.String str19 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), 10L, "Coordinated Universal Time", true, timeZone5);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.035" + "'", str13, "0:00:00.035");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coor00inate Univer0al Ti0e" + "'", str19, "Coor00inate Univer0al Ti0e");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) -1, "", true, timeZone4);
        boolean boolean9 = timeZone4.observesDaylightTime();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = timeZone4.getDisplayName(false, (int) '#', locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "Greenwich Mean Time", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Greenwich 0ean Ti0e" + "'", str3, "Greenwich 0ean Ti0e");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        timeZone4.setID("P0Y000DT00000.100100");
        int int12 = timeZone4.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int9 = timeZone4.getRawOffset();
        boolean boolean10 = timeZone4.observesDaylightTime();
        boolean boolean11 = timeZone4.observesDaylightTime();
        int int13 = timeZone4.getOffset((long) ' ');
        timeZone4.setID("0 days 0 hours 0 minutes 0 seconds");
        java.lang.String str16 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 10L, "P0Y000DT00000.0100", true, timeZone4);
        int int17 = timeZone4.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P0Y000DT00000.0100" + "'", str16, "P0Y000DT00000.0100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 0);
        int int4 = timeZone0.getOffset(0L);
        int int5 = timeZone0.getRawOffset();
        timeZone0.setID("P0Y0M0DT0H0M0.000S");
        java.lang.String str8 = timeZone0.getID();
        java.lang.Object obj9 = timeZone0.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str8, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "sun.util.calendar.ZoneInfo[id=\"P0Y0M0DT0H0M0.000S\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 0);
        int int18 = timeZone14.getOffset(0L);
        boolean boolean19 = timeZone14.observesDaylightTime();
        boolean boolean20 = timeZone10.hasSameRules(timeZone14);
        boolean boolean21 = timeZone4.hasSameRules(timeZone14);
        int int23 = timeZone4.getOffset(0L);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone24);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        boolean boolean27 = timeZone24.hasSameRules(timeZone26);
        java.util.TimeZone.setDefault(timeZone24);
        int int30 = timeZone24.getOffset((-1L));
        java.lang.String str31 = timeZone24.getID();
        timeZone24.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean34 = timeZone4.hasSameRules(timeZone24);
        int int35 = timeZone24.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P0Y000DT00000.100100" + "'", str31, "P0Y000DT00000.100100");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.097" + "'", str1, "0:00:00.097");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) -1, "", true, timeZone4);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone9);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        boolean boolean12 = timeZone9.hasSameRules(timeZone11);
        java.util.TimeZone.setDefault(timeZone9);
        boolean boolean14 = timeZone4.hasSameRules(timeZone9);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 0);
        int int19 = timeZone15.getOffset(0L);
        int int21 = timeZone15.getOffset((long) '4');
        timeZone15.setRawOffset((int) (short) 10);
        timeZone15.setID("P0Y0M0DT0H0M0.100S");
        boolean boolean26 = timeZone4.hasSameRules(timeZone15);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        int int7 = timeZone4.getOffset((long) ' ');
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "0:00:00.001", false, timeZone4);
        java.util.TimeZone.setDefault(timeZone4);
        timeZone4.setID("P0Y0M0DT0H0M0.101S");
        java.util.TimeZone.setDefault(timeZone4);
        timeZone4.setRawOffset(10);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.001" + "'", str8, "0:00:00.001");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) -1, "", true, timeZone4);
        boolean boolean9 = timeZone4.observesDaylightTime();
        int int10 = timeZone4.getRawOffset();
        timeZone4.setID("P-1Y11030DT23059059.90110");
        timeZone4.setRawOffset(0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int10 = timeZone4.getOffset((long) '4');
        timeZone4.setRawOffset(100);
        int int14 = timeZone4.getOffset((long) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y000DT00000.001-1", true, timeZone4);
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = timeZone4.getDisplayName(locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y000DT00000.001-1" + "'", str15, "P0Y000DT00000.001-1");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        int int9 = timeZone4.getRawOffset();
        boolean boolean10 = timeZone4.observesDaylightTime();
        boolean boolean11 = timeZone4.observesDaylightTime();
        timeZone4.setRawOffset((int) (short) 10);
        boolean boolean14 = timeZone4.observesDaylightTime();
        boolean boolean15 = timeZone4.observesDaylightTime();
        int int17 = timeZone4.getOffset(0L);
        java.lang.String str18 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, 0L, "0:00:00.010", false, timeZone4);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:00:00.010" + "'", str18, "0:00:00.010");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 0);
        int int8 = timeZone4.getOffset(0L);
        boolean boolean9 = timeZone4.observesDaylightTime();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        int int12 = timeZone10.getOffset((long) 0);
        int int14 = timeZone10.getOffset(0L);
        int int15 = timeZone10.getRawOffset();
        timeZone10.setID("P0Y0M0DT0H0M0.000S");
        boolean boolean18 = timeZone4.hasSameRules(timeZone10);
        java.lang.String str19 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (-1L), "Etc/UTC", false, timeZone4);
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = timeZone4.getDisplayName(locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Etc/UTC" + "'", str19, "Etc/UTC");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int5 = timeZone4.getRawOffset();
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "0:00:00.035", false, timeZone4);
        timeZone4.setRawOffset(100);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.035" + "'", str6, "0:00:00.035");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) -1, "", true, timeZone4);
        int int9 = timeZone4.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }
}
